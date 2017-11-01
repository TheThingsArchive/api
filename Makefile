# Hacks for Make
EMPTY :=
SPACE := $(EMPTY) $(EMPTY)
COMMA := ,
SED = $(shell command -v gsed || command -v sed)

ALL_FILES ?= (git ls-files . && git ls-files . --exclude-standard --others) | grep -v node_modules | sed 's:^:./:'
PROTO_FILES ?= $(ALL_FILES) | grep "\.proto$$"

GO := $(shell command -v go 2> /dev/null)
# Assuming this Makefile is located at `$GOPATH/src/TheThingsNetwork/api/Makefile`
GOPATH = $(shell dirname $(shell dirname $(shell dirname $(shell dirname $(shell dirname $(realpath $(lastword $(MAKEFILE_LIST))))))))

GOGO_REPO=github.com/gogo/protobuf
GOGO_PKG=$(GOPATH)/src/$(GOGO_REPO)

GRPC_GATEWAY_REPO=github.com/grpc-ecosystem/grpc-gateway
GRPC_GATEWAY_PKG=$(GOPATH)/src/$(GRPC_GATEWAY_REPO)

DOCKER ?= docker
DOCKER_ARGS = run --user `id -u` --rm -v$(GOPATH):$(GOPATH) -w`pwd`
DOCKER_IMAGE ?= thethingsindustries/protoc:2
PROTOC ?= $(DOCKER) $(DOCKER_ARGS) $(DOCKER_IMAGE) -I/usr/include
PROTOC += -I$(GOPATH)/src -I$(GRPC_GATEWAY_PKG)/third_party/googleapis

.PHONY: all

all: deps protos mocks

.PHONY: deps

deps: protoc mockgen

.PHONY: protoc

protoc:
	docker pull $(DOCKER_IMAGE)

.PHONY: protos

protos: protos.go protos.js protos.java protos.swift protos.php protos.ruby protos.c protos.python

.PHONY: protos.go

# Go
GO_PROTO_TARGETS ?= $(patsubst %.proto,%.pb.go,$(shell $(PROTO_FILES)))
GO_PROTO_TYPES = any duration empty struct timestamp
GO_PROTO_TYPE_CONVERSIONS = $(subst $(SPACE),$(COMMA),$(foreach type,$(GO_PROTO_TYPES),Mgoogle/protobuf/$(type).proto=$(GOGO_REPO)/types))
GO_PROTOC_FLAGS ?= \
	--gogottn_out=plugins=grpc,$(GO_PROTO_TYPE_CONVERSIONS):$(GOPATH)/src \
	--grpc-gateway_out=:$(GOPATH)/src
GO_GW_SED ?= -e 's/\.AppId/\.AppID/g' -e 's/\.DevId/\.DevID/g' -e 's/\.AppEui/\.AppEUI/g' -e 's/\.DevEui/\.DevEUI/g' -e 's/\.Id/\.ID/g'

protos.go: $(GO_PROTO_TARGETS)
	$(SED) -i'' $(GO_GW_SED) $(shell $(ALL_FILES) | grep "\.pb\.gw\.go$$")

%.pb.go: %.proto
	$(PROTOC) $(GO_PROTOC_FLAGS) $(PWD)/$<

# Java
JAVA_PROTO_TARGETS ?= $(patsubst %.proto,%.pb.java,$(shell $(PROTO_FILES)))
JAVA_PROTOC_FLAGS ?= \
	--grpc-java_out=:$(PWD)/java/src \
	--java_out=:$(PWD)/java/src

.PHONY: protos.java

protos.java: $(JAVA_PROTO_TARGETS)

%.pb.java: %.proto
	$(PROTOC) $(JAVA_PROTOC_FLAGS) $(PWD)/$<

# JS
GRPC_NODE_PLUGIN ?= /usr/bin/grpc_node_plugin
JS_PROTO_TARGETS ?= $(patsubst %.proto,%_pb.js,$(shell $(PROTO_FILES)))
JS_PROTOC_FLAGS ?= \
	--plugin=protoc-gen-grpc-js=$(GRPC_NODE_PLUGIN) \
	--grpc-js_out=$(GOPATH)/src \
	--js_out=import_style=commonjs,binary:$(GOPATH)/src
JS_SED ?= -e 's/github.com_/github_com_/g' \
	-e 's|../../../github.com/TheThingsNetwork/api/||g' \
	-e 's/github_com_TheThingsNetwork_api/ttn/g' \
	-e '/github_com_gogo_protobuf_gogoproto_gogo_pb/d' \
	-e '/google_api_annotations_pb/d'

.PHONY: protos.js

protos.js: $(JS_PROTO_TARGETS)
	$(SED) -i'' $(JS_SED) $(shell $(ALL_FILES) | grep "\_pb.js$$")

%_pb.js: %.proto
	$(PROTOC) $(JS_PROTOC_FLAGS) $(PWD)/$<

# Swift

SWIFT_PROTO_TARGETS ?= $(patsubst %.proto,%.pb.swift,$(shell $(PROTO_FILES)))
SWIFT_PROTOC_FLAGS ?= \
	--swiftgrpc_out=$(PWD) \
	--swift_out=$(GOPATH)/src

.PHONY: protos.swift

protos.swift: $(SWIFT_PROTO_TARGETS)
	-mv broker.client.pb.swift broker
	-mv broker.server.pb.swift broker
	-mv discovery.client.pb.swift discovery
	-mv discovery.server.pb.swift discovery
	-mv handler.client.pb.swift handler
	-mv handler.server.pb.swift handler
	-mv lorawan.client.pb.swift protocol/lorawan
	-mv lorawan.server.pb.swift protocol/lorawan
	-mv monitor.client.pb.swift monitor
	-mv monitor.server.pb.swift monitor
	-mv networkserver.client.pb.swift networkserver
	-mv networkserver.server.pb.swift networkserver
	-mv router.client.pb.swift router
	-mv router.server.pb.swift router

%.pb.swift: %.proto
	$(PROTOC) $(SWIFT_PROTOC_FLAGS) $(PWD)/$<

# PHP

PHP_GRPC_PLUGIN ?= /usr/bin/grpc_php_plugin
PHP_PROTO_TARGETS ?= $(patsubst %.proto,%.pb.php,$(shell $(PROTO_FILES)))
PHP_PROTOC_FLAGS ?= \
	--plugin=protoc-gen-grpc-php=$(PHP_GRPC_PLUGIN) \
	--grpc-php_out=$(PWD)/php \
	--php_out=:$(PWD)/php

.PHONY: protos.php

protos.php: $(PHP_PROTO_TARGETS)

%.pb.php: %.proto
	$(PROTOC) $(PHP_PROTOC_FLAGS) $(PWD)/$<

# Ruby

RUBY_GPRC_PLUGIN ?= /usr/bin/grpc_ruby_plugin
RUBY_PROTO_TARGETS ?= $(patsubst %.proto,%_pb.rb,$(shell $(PROTO_FILES)))
RUBY_PROTOC_FLAGS ?= \
	--plugin=protoc-gen-grpc-ruby=$(RUBY_GPRC_PLUGIN) \
	--grpc-ruby_out=$(GOPATH)/src \
	--ruby_out=:$(GOPATH)/src
RUBY_SED ?= -e "s|github.com/TheThingsNetwork/api/||g"

.PHONY: protos.ruby

protos.ruby: $(RUBY_PROTO_TARGETS)
	$(SED) -i'' $(RUBY_SED) $(shell $(ALL_FILES) | grep "\_pb.rb$$")

%_pb.rb: %.proto
	$(PROTOC) $(RUBY_PROTOC_FLAGS) $(PWD)/$<

# C

C_PROTO_TARGETS ?= $(patsubst %.proto,%.pb-c.c,$(shell $(PROTO_FILES)))
C_PROTOC_FLAGS ?=  \
	--c_out=$(PWD)/c

.PHONY: protos.c

protos.c: $(C_PROTO_TARGETS)
	$(PROTOC) $(C_PROTOC_FLAGS) $(GOPATH)/src/github.com/gogo/protobuf/protobuf/google/protobuf/*.proto
	mkdir -p c/google/protobuf
	mv $(PWD)/c/github.com/gogo/protobuf/protobuf/google/protobuf/*.pb-c.* c/google/protobuf
	rm -rf $(PWD)/c/github.com/gogo/protobuf/protobuf

	$(PROTOC) $(C_PROTOC_FLAGS) $(GOPATH)/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis/google/api/annotations.proto
	mkdir -p c/google/api
	mv $(PWD)/c/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis/google/api/*.pb-c.* c/google/api
	rm -rf $(PWD)/c/github.com/grpc-ecosystem

	$(PROTOC) $(C_PROTOC_FLAGS) $(GOPATH)/src/github.com/gogo/protobuf/gogoproto/gogo.proto

%.pb-c.c: %.proto
	$(PROTOC) $(C_PROTOC_FLAGS) $(PWD)/$<

# Python
.PHONY: protos.python

protos.python:
	./gen-python.sh

# Dependencies

$(GOPATH)/src/github.com/%:
ifeq ($(shell command -v $(GO) 2> /dev/null),)
	git clone https://github.com/$* $@
else
	$(GO) get -d github.com/$*/...
endif

PROTO_TARGETS = $(GO_PROTO_TARGETS) $(JS_PROTO_TARGETS) $(JAVA_PROTO_TARGETS) $(SWIFT_PROTO_TARGETS) $(PHP_PROTO_TARGETS) $(RUBY_PROTO_TARGETS) $(C_PROTO_TARGETS)
$(PROTO_TARGETS): $(GOGO_PKG) $(GRPC_GATEWAY_PKG)

# Mocks

MOCKGEN ?= mockgen

.PHONY: mockgen

mockgen:
ifeq ($(shell command -v $(MOCKGEN) 2> /dev/null),)
ifeq ($(shell command -v $(GO) 2> /dev/null),)
	$(error go is not installed)
else
	$(GO) get github.com/golang/mock/mockgen
endif
endif


.PHONY: mocks

mocks: mockgen
	$(MOCKGEN) -source=./protocol/lorawan/device.pb.go -package lorawan DeviceManagerClient > protocol/lorawan/device_mock.go
	$(MOCKGEN) -source=./discovery/discoveryclient/client.go -package discoveryclient Client > discovery/discoveryclient/client_mock.go
	$(MOCKGEN) -source=./networkserver/networkserver.pb.go -package networkserver NetworkServerClient > networkserver/networkserver_mock.go

# Clean

.PHONY: clean

clean: clean-protos clean-mocks

clean-protos:
	find . -name '*pb.*' -delete -or -name '*pb_test.go' -delete -or -name '*.pb-c.*' -delete -or -name '*_pb2*.py' -delete -or -name '__init__.py' -delete -or -wholename './php/*' -delete -or -wholename './java/src/*' -delete

clean-mocks:
	find . -name '*_mock.go' -delete
