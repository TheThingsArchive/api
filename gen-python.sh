#!/usr/bin/env bash
set -e

[ "${BASH_VERSINFO:-0}" -lt 4 ] && { echo "Bash version 4+ is required."; exit 1; }
shopt -s globstar

genDir="${PWD}/python"
dir=`mktemp -d`

for p in "${GOPATH}"/src/github.com/**/*.proto; do
  [ -f "${p}" ] || continue
  copy="${dir}"/github_com/${p#"${GOPATH}/src/github.com/"}
  mkdir -p `dirname "${copy}"`
  cat "${p}" | sed -e 's/github\.com/github_com/g' > "${copy}"
done

mkdir -pv "${genDir}"
for d in "${dir}/github_com/TheThingsNetwork/api" "${dir}/github_com/gogo/protobuf/protobuf/google/protobuf" "${dir}/github_com/gogo/protobuf/gogoproto" "${dir}/github_com/grpc-ecosystem/grpc-gateway/third_party/googleapis/google/api"; do
  for p in "${d}"/{,**/}*.proto; do
    [ -f "${p}" ] || continue
    docker run --user `id -u` --rm -v"${dir}":${dir} -v"${PWD}":${PWD} thethingsindustries/protoc:2 \
      -I/usr/include \
      -I"${dir}" \
      -I"${dir}"/github_com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
      --plugin=protoc-gen-grpc-python=/usr/bin/grpc_python_plugin \
      --python_out="${genDir}" \
      --grpc-python_out="${genDir}" \
      "${p}"
  done
done

for d in "${genDir}"/github_com/**; do
  [[ -d "${d}" ]] || continue
  init="${d}"/__init__.py
  echo -n "" > "${init}"
  for f in `ls ${d}/*pb2*.py 2> /dev/null`; do
    echo "from `basename ${f%.py}` import *" >> "${init}"
  done
done

rm -rf ${dir}
