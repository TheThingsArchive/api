empty :=
space := $(empty) $(empty)
comma := ,

languages := go java js php ruby python c swift

.PHONY: all

all: docker $(patsubst %,protos/%,$(languages)) mocks

clean: $(patsubst %,clean/%,$(languages)) clean/mocks

proto_files := $(shell find . -name '*.proto')

.PHONY: docker

DOCKER_IMAGE ?= thethingsnetwork/api-protoc

docker:
	docker build -t $(DOCKER_IMAGE):latest .

api_path = /src/github.com/TheThingsNetwork/api
docker_run = docker run --user `id -u` --rm -v $(PWD):$(api_path) -w $(api_path)
protoc = $(docker_run) $(DOCKER_IMAGE) -I /src
sed = $(docker_run) --entrypoint sed $(DOCKER_IMAGE)

define language_template
.PHONY: protos/$(1)

protos/$(1):
	@echo Generating $(1) protos...
	@$$(MAKE) -j 8 $(patsubst %.proto,%.pb.$(1),$(proto_files))

.PHONY: clean/$(1)
endef

$(foreach lang,$(languages),$(eval $(call language_template,$(lang))))

go_proto_types := any duration empty field_mask struct timestamp wrappers
go_proto_conversions := $(subst $(space),$(comma),$(foreach type,$(go_proto_types),Mgoogle/protobuf/$(type).proto=github.com/gogo/protobuf/types))

go_subst = -e 's/\.$(1)/.$(subst Eui,EUI,$(subst Id,ID,$(1)))/g'
go_gw_replace := $(foreach id,AppId AppEui DevId DevEui Id,$(call go_subst,$(id)))

%.pb.go: %.proto
	@$(protoc) --gogottn_out=plugins=grpc,$(go_proto_conversions):/src --grpc-gateway_out=/src $(api_path)/$<
	@file=$(patsubst %.proto,%.pb.gw.go,$<); if [ -f $$file ]; then \
		$(sed) -i'' $(go_gw_replace) $$file; \
	fi

clean/go:
	find . -name '*pb.go' -delete
	find . -name '*pb.gw.go' -delete

.PHONY: %.pb.java

%.pb.java: %.proto
	@$(protoc) --java_out=$(api_path)/java/src --grpc-java_out=$(api_path)/java/src $(api_path)/$<

clean/java:
	rm -rf java/src/org/thethingsnetwork/api

js_replace := -e 's/github.com_/github_com_/g' \
	-e 's|../../../github.com/TheThingsNetwork/api/||g' \
	-e 's/github_com_TheThingsNetwork_api/ttn/g' \
	-e '/github_com_gogo_protobuf_gogoproto_gogo_pb/d' \
	-e '/google_api_annotations_pb/d'

.PHONY: %.pb.js

%.pb.js: %.proto
	@$(protoc) --js_out=import_style=commonjs,binary:/src --grpc-js_out=/src $(api_path)/$<
	@file=$(patsubst %.proto,%_pb.js,$<); if [ -f $$file ]; then \
		$(sed) -i'' $(js_replace) $$file; \
	fi
	@file=$(patsubst %.proto,%_grpc_pb.js,$<); if [ -f $$file ]; then \
		$(sed) -i'' $(js_replace) $$file; \
	fi

clean/js:
	find . -name '*_pb.js' -delete

.PHONY: %.pb.php

%.pb.php: %.proto
	@$(protoc) --php_out=$(api_path)/php --grpc-php_out=$(api_path)/php $(api_path)/$<

clean/php:
	rm -rf php/*

ruby_replace := -e "s|require 'github.com/TheThingsNetwork/api/|require '|g"

.PHONY: %.pb.ruby

%.pb.ruby: %.proto
	@$(protoc) --ruby_out=/src --grpc-ruby_out=/src $(api_path)/$<
	@file=$(patsubst %.proto,%_pb.rb,$<); if [ -f $$file ]; then \
		$(sed) -i'' $(ruby_replace) $$file; \
	fi
	@file=$(patsubst %.proto,%_services_pb.rb,$<); if [ -f $$file ]; then \
		$(sed) -i'' $(ruby_replace) $$file; \
	fi

clean/ruby:
	find . -name '*_pb.rb' -delete

.PHONY: %.pb.python

python_replace := -e 's/from github\.com/from github_com/g' \
	-e '/from github_com\.gogo\.protobuf/d' \
	-e 's/github_dot_com_dot_gogo_dot_protobuf_dot_gogoproto_dot_gogo__pb2\.DESCRIPTOR,//g' \
	-e '/from google\.api/d' \
	-e 's/google_dot_api_dot_annotations__pb2\.DESCRIPTOR,//g'

%.pb.python: %.proto
	@$(protoc) --python_out=$(api_path)/python --grpc-python_out=$(api_path)/python $(api_path)/$<
	@file=$(patsubst %.proto,python/github/com/TheThingsNetwork/api/%_pb2.py,$<); if [ -f $$file ]; then \
		target=$(patsubst %.proto,python/github_com/TheThingsNetwork/api/%_pb2.py,$<); \
		mkdir -p `dirname $$target`; \
		mv $$file $$target; \
		$(sed) -i'' $(python_replace) $$target; \
	fi
	@file=$(patsubst %.proto,python/github.com/TheThingsNetwork/api/%_pb2_grpc.py,$<); if [ -f $$file ]; then \
		target=$(patsubst %.proto,python/github_com/TheThingsNetwork/api/%_pb2_grpc.py,$<); \
		mkdir -p `dirname $$target`; \
		mv $$file $$target; \
		$(sed) -i'' $(python_replace) $$target; \
	fi

clean/python:
	find . -name '*_pb2.py' -delete
	find . -name '*_pb2_grpc.py' -delete
	rm -rf python/github python/github.com

.PHONY: %.pb.c

%.pb.c: %.proto
	@$(protoc) --c_out=$(api_path)/c $(api_path)/$<

clean/c:
	rm -rf c/github.com/TheThingsNetwork

.PHONY: %.pb.swift

%.pb.swift: %.proto
	@$(protoc) --swift_out=/src --grpc-swift_out=/src $(api_path)/$<

clean/swift:
	find . -name '*.swift' -delete

.PHONY: mockgen

mockgen:
	@command -v mockgen > /dev/null || go get github.com/golang/mock/mockgen

.PHONY: mocks

mocks: mockgen
	mockgen -source=./protocol/lorawan/device.pb.go -package lorawan DeviceManagerClient > protocol/lorawan/device_mock.go
	mockgen -source=./discovery/discoveryclient/client.go -package discoveryclient Client > discovery/discoveryclient/client_mock.go
	mockgen -source=./networkserver/networkserver.pb.go -package networkserver NetworkServerClient > networkserver/networkserver_mock.go

clean/mocks:
	find . -name '*_mock.go' -delete
