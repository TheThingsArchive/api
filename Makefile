.PHONY: all

all: protos.go protos.js protos.java protos.swift protos.php protos.ruby protos.c

# Hacks for Make
EMPTY :=
SPACE := $(EMPTY) $(EMPTY)
COMMA := ,

ALL_FILES ?= (git ls-files . && git ls-files . --exclude-standard --others) | grep -v node_modules | sed 's:^:./:'
PROTO_FILES ?= $(ALL_FILES) | grep "\.proto$$"
GO_PATH ?= $(lastword $(subst :, ,$(GOPATH)))
PROTOC_INCLUDES ?= -I/usr/local/include -I$(GO_PATH)/src -I$(GO_PATH)/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis

# Go

GO_PROTO_TARGETS ?= $(patsubst %.proto,%.pb.go,$(shell $(PROTO_FILES)))
GO_PROTO_TYPES = any duration empty struct timestamp
GO_PROTO_TYPE_CONVERSIONS = $(subst $(SPACE),$(COMMA),$(foreach type,$(GO_PROTO_TYPES),Mgoogle/protobuf/$(type).proto=github.com/gogo/protobuf/types))
GO_PROTOC_FLAGS ?= $(PROTOC_INCLUDES) \
	--gogottn_out=plugins=grpc,$(GO_PROTO_TYPE_CONVERSIONS):$(GO_PATH)/src \
	--grpc-gateway_out=:$(GO_PATH)/src
GO_SED ?= -e 's/func NewPopulated/func newPopulated/g'
GO_GW_SED ?= -e 's/\.AppId/\.AppID/g' -e 's/\.DevId/\.DevID/g' -e 's/\.AppEui/\.AppEUI/g' -e 's/\.DevEui/\.DevEUI/g' -e 's/\.Id/\.ID/g'

.PHONY: protos.go

protos.go: $(GO_PROTO_TARGETS)
	sed -i '' $(GO_SED) $(shell $(ALL_FILES) | grep "\.pb\.go$$")
	sed -i '' $(GO_GW_SED) $(shell $(ALL_FILES) | grep "\.pb\.gw\.go$$")

%.pb.go: %.proto
	protoc $(GO_PROTOC_FLAGS) $(PWD)/$<

# Java

JAVA_PROTO_TARGETS ?= $(patsubst %.proto,%.pb.java,$(shell $(PROTO_FILES)))
JAVA_PROTOC_FLAGS ?= $(PROTOC_INCLUDES) \
	--grpc-java_out=:$(PWD)/java/src \
	--java_out=:$(PWD)/java/src

.PHONY: protos.java

protos.java: $(JAVA_PROTO_TARGETS)

%.pb.java: %.proto
	protoc $(JAVA_PROTOC_FLAGS) $(PWD)/$<

# JS

JS_PROTO_TARGETS ?= $(patsubst %.proto,%_pb.js,$(shell $(PROTO_FILES)))
JS_PROTOC_FLAGS ?= $(PROTOC_INCLUDES) \
	--plugin=protoc-gen-grpc-js=$(PWD)/node_modules/.bin/grpc_tools_node_protoc_plugin \
	--grpc-js_out=$(GO_PATH)/src \
	--js_out=import_style=commonjs,binary:$(GO_PATH)/src
JS_SED ?= -e 's/github.com_/github_com_/g' \
	-e 's|../../../github.com/TheThingsNetwork/api/||g' \
	-e 's/github_com_TheThingsNetwork_api/ttn/g' \
	-e '/github_com_gogo_protobuf_gogoproto_gogo_pb/d' \
	-e '/google_api_annotations_pb/d'

.PHONY: protos.js

protos.js: $(JS_PROTO_TARGETS)
	sed -i '' $(JS_SED) $(shell $(ALL_FILES) | grep "\_pb.js$$")

%_pb.js: %.proto
	protoc $(JS_PROTOC_FLAGS) $(PWD)/$<

# Swift

SWIFT_PROTO_TARGETS ?= $(patsubst %.proto,%.pb.swift,$(shell $(PROTO_FILES)))
SWIFT_PROTOC_FLAGS ?= $(PROTOC_INCLUDES) \
	--swiftgrpc_out=:$(PWD) \
	--swift_out=:$(GO_PATH)/src

.PHONY: protos.swift

protos.swift: $(SWIFT_PROTO_TARGETS)
	mv broker.client.pb.swift broker
	mv broker.server.pb.swift broker
	mv discovery.client.pb.swift discovery
	mv discovery.server.pb.swift discovery
	mv handler.client.pb.swift handler
	mv handler.server.pb.swift handler
	mv lorawan.client.pb.swift protocol/lorawan
	mv lorawan.server.pb.swift protocol/lorawan
	mv monitor.client.pb.swift monitor
	mv monitor.server.pb.swift monitor
	mv networkserver.client.pb.swift networkserver
	mv networkserver.server.pb.swift networkserver
	mv router.client.pb.swift router
	mv router.server.pb.swift router

%.pb.swift: %.proto
	protoc $(SWIFT_PROTOC_FLAGS) $(PWD)/$<

# PHP

PHP_PROTO_TARGETS ?= $(patsubst %.proto,%.pb.php,$(shell $(PROTO_FILES)))
PHP_PROTOC_FLAGS ?= $(PROTOC_INCLUDES) \
	--plugin=protoc-gen-grpc-php=$(GOPATH)/src/github.com/grpc/grpc/bins/opt/grpc_php_plugin \
	--grpc-php_out=$(PWD)/php \
	--php_out=:$(PWD)/php

.PHONY: protos.php

protos.php: $(PHP_PROTO_TARGETS)

%.pb.php: %.proto
	protoc $(PHP_PROTOC_FLAGS) $(PWD)/$<

# Ruby

RUBY_PROTO_TARGETS ?= $(patsubst %.proto,%_pb.rb,$(shell $(PROTO_FILES)))
RUBY_PROTOC_FLAGS ?= $(PROTOC_INCLUDES) \
	--plugin=protoc-gen-grpc-ruby=$(GOPATH)/src/github.com/grpc/grpc/bins/opt/grpc_ruby_plugin \
	--grpc-ruby_out=$(GO_PATH)/src \
	--ruby_out=:$(GO_PATH)/src
RUBY_SED ?= -e "s|github.com/TheThingsNetwork/api/||g"

.PHONY: protos.ruby

protos.ruby: $(RUBY_PROTO_TARGETS)
	sed -i '' $(RUBY_SED) $(shell $(ALL_FILES) | grep "\_pb.rb$$")

%_pb.rb: %.proto
	protoc $(RUBY_PROTOC_FLAGS) $(PWD)/$<

# C

C_PROTO_TARGETS ?= $(patsubst %.proto,%.pb-c.c,$(shell $(PROTO_FILES)))
C_PROTOC_FLAGS ?= $(PROTOC_INCLUDES) \
	--c_out=:$(PWD)/c

.PHONY: protos.c

protos.c: $(C_PROTO_TARGETS)
	protoc-c $(C_PROTOC_FLAGS) $(GO_PATH)/src/github.com/gogo/protobuf/protobuf/google/protobuf/*.proto
	mkdir -p c/google/protobuf
	mv $(PWD)/c/github.com/gogo/protobuf/protobuf/google/protobuf/*.pb-c.* c/google/protobuf
	rm -rf $(PWD)/c/github.com/gogo/protobuf/protobuf

	protoc-c $(C_PROTOC_FLAGS) $(GO_PATH)/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis/google/api/annotations.proto
	mkdir -p c/google/api
	mv $(PWD)/c/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis/google/api/*.pb-c.* c/google/api
	rm -rf $(PWD)/c/github.com/grpc-ecosystem

	protoc-c $(C_PROTOC_FLAGS) $(GO_PATH)/src/github.com/gogo/protobuf/gogoproto/gogo.proto

%.pb-c.c: %.proto
	protoc-c $(C_PROTOC_FLAGS) $(PWD)/$<
