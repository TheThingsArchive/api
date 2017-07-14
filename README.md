# The Things Network API

## Updating the generated files

We're going to need to install quite some stuff, as these protos will be compiled to different languages.

- Clone this repository to `$HOME/src/github.com/TheThingsNetwork/api`
- Set your GOPATH to your HOME dir: `export GOPATH="$HOME"`
- Install [protoc-3.3.0-YOURPLATFORM](https://github.com/google/protobuf/releases/tag/v3.3.0) to `/usr/local`

For C++, C#, Objective-C, PHP, Python, Ruby:

Install [gRPC](https://github.com/grpc/grpc/blob/master/INSTALL.md)

```
git clone https://github.com/grpc/grpc $GOPATH/src/github.com/grpc/grpc
cd $GOPATH/src/github.com/grpc/grpc
make
make install
```

For Go:

- Install Go
- Install the Go generators:

```
go get -u github.com/gogo/protobuf/protoc-gen-gogofast
go get -u github.com/grpc-ecosystem/grpc-gateway/protoc-gen-grpc-gateway
```

For Node:

- Install Node
- Install the Node generator:

```
npm install grpc-tools
```

For Java:

- Install Java and Gradle
- Install the Java generator:

```
git clone https://github.com/grpc/grpc-java $GOPATH/src/github.com/grpc/grpc-java
cd $GOPATH/src/github.com/grpc/grpc-java/compiler
../gradlew java_pluginExecutable
```

For Swift:

- Install and set up XCode and [Swift](https://swift.org/download/#installation)
- Install the Swift generator:

```
git clone https://github.com/grpc/grpc-swift $GOPATH/src/github.com/grpc/grpc-swift
cd $GOPATH/src/github.com/grpc/grpc-swift/Plugin
make
```

And finally set the correct PATH:

```
export PATH="$PATH:$GOPATH/bin:$GOPATH/src/github.com/grpc/grpc-swift/Plugin:$GOPATH/src/github.com/grpc/grpc-java/compiler/build/exe/java_plugin:$GOPATH/src/github.com/grpc/grpc/bins/opt"
```

Now you should be able to update the generated files:

```
make all
```

If you only want to update the files for a specific language, you can use the `protos.go`, `protos.java`, `protos.js` and `protos.swift` targets.
