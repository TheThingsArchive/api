empty :=
space := $(empty) $(empty)
comma := ,

languages := go java js php ruby python c swift

.PHONY: all

all: docker $(patsubst %,protos/%,$(languages))

clean: $(patsubst %,clean/%,$(languages))

proto_files := $(shell find . -name '*.proto')

.PHONY: docker

DOCKER ?= docker

PROTOC_API_PATH = /src/github.com/TheThingsNetwork/api
PROTOC_DOCKER_IMAGE ?= thethingsindustries/protoc:3.0.10
PROTOC ?= $(DOCKER) run --user `id -u` --rm --mount type=bind,src=$(PWD),dst=$(PROTOC_API_PATH) -w $(PROTOC_API_PATH) $(PROTOC_DOCKER_IMAGE) -I/src

protoc:
	$(DOCKER) pull $(PROTOC_DOCKER_IMAGE)

define language_template
.PHONY: protos/$(1)

protos/$(1):
	@echo Generating $(1) protos...
	@$$(MAKE) -j 8 $(patsubst %.proto,%.pb.$(1),$(proto_files))
	@$$(MAKE) postprocess/$(1)

.PHONY: clean/$(1) postprocess/$(1)
endef

$(foreach lang,$(languages),$(eval $(call language_template,$(lang))))

go_proto_types := any duration empty field_mask struct timestamp wrappers
go_proto_conversions := $(subst $(space),$(comma),$(foreach type,$(go_proto_types),Mgoogle/protobuf/$(type).proto=github.com/gogo/protobuf/types))

go_subst = -pe 's!\.$(1)!.$(subst Eui,EUI,$(subst Id,ID,$(1)))!g;'
go_gw_replace := $(foreach id,AppId AppEui DevId DevEui Id,$(call go_subst,$(id)))

.PHONY: %.pb.go

%.pb.go: %.proto
	@$(PROTOC) --gogottn_out=plugins=grpc,$(go_proto_conversions):/src --grpc-gateway_out=/src $(PROTOC_API_PATH)/$<

postprocess/go:
	@find . -type f -name '*.pb.gw.go' -exec perl -i $(go_gw_replace) {} \;

clean/go:
	find . -name '*pb.go' -delete
	find . -name '*pb.gw.go' -delete

.PHONY: %.pb.java

%.pb.java: %.proto
	@$(PROTOC) --java_out=$(PROTOC_API_PATH)/java/src --grpc-java_out=$(PROTOC_API_PATH)/java/src $(PROTOC_API_PATH)/$<

java_replace := -pe 's!.*google\.protobuf\.GoGoProtos.*\n!!;'

postprocess/java:
	@#nothing

clean/java:
	rm -rf java/src/org/thethingsnetwork/api

js_replace := -pe 's!../../../github.com/TheThingsNetwork/api/!!;' \
	            -pe 's!.*require(.*github.com/gogo/protobuf.*).*!!;' \
	            -pe 's!.*require(.*google/api/annotations_pb\.js.*).*!!;' \
	            -pe 's!github_com_TheThingsNetwork_api!ttn!g;' \
              -pe 's!github.com_!github_com_!g;'

.PHONY: %.pb.js

%.pb.js: %.proto
	@$(PROTOC) --js_out=import_style=commonjs,binary:/src --grpc-js_out=/src $(PROTOC_API_PATH)/$<

postprocess/js:
	@find . -type f -name '*_pb.js' -exec perl -i $(js_replace) {} \;

clean/js:
	find . -name '*_pb.js' -delete

.PHONY: %.pb.php

%.pb.php: %.proto
	@$(PROTOC) --php_out=$(PROTOC_API_PATH)/php --grpc-php_out=$(PROTOC_API_PATH)/php $(PROTOC_API_PATH)/$<

postprocess/php:
	@#nothing

clean/php:
	rm -rf php/*

ruby_replace := -pe "s!require 'github.com/TheThingsNetwork/api/!require '!g;"

.PHONY: %.pb.ruby

%.pb.ruby: %.proto
	@$(PROTOC) --ruby_out=/src --grpc-ruby_out=/src $(PROTOC_API_PATH)/$<

postprocess/ruby:
	@find . -type f -name '*_pb.rb' -exec perl -i $(ruby_replace) {} \;

clean/ruby:
	find . -name '*_pb.rb' -delete

.PHONY: %.pb.python

python_replace := -pe 's!from github\.com!from github_com!g;' \
	                -pe 's!from github_com\.gogo\.protobuf.*!!;' \
	                -pe 's!from google\.api.*!!;' \
	                -pe 's!github_dot_com_dot_gogo_dot_protobuf_dot_gogoproto_dot_gogo__pb2\.DESCRIPTOR,!!;' \
	                -pe 's!google_dot_api_dot_annotations__pb2\.DESCRIPTOR,!!;'

%.pb.python: %.proto
	@$(PROTOC) --python_out=$(PROTOC_API_PATH)/python --grpc-python_out=$(PROTOC_API_PATH)/python $(PROTOC_API_PATH)/$<
	@file=$(patsubst %.proto,python/github/com/TheThingsNetwork/api/%_pb2.py,$<); if [ -f $$file ]; then \
		target=$(patsubst %.proto,python/github_com/TheThingsNetwork/api/%_pb2.py,$<); \
		mkdir -p `dirname $$target`; \
		mv $$file $$target; \
	fi
	@file=$(patsubst %.proto,python/github.com/TheThingsNetwork/api/%_pb2_grpc.py,$<); if [ -f $$file ]; then \
		target=$(patsubst %.proto,python/github_com/TheThingsNetwork/api/%_pb2_grpc.py,$<); \
		mkdir -p `dirname $$target`; \
		mv $$file $$target; \
	fi

postprocess/python:
	@find . -type f -name '*.py' -exec perl -i $(python_replace) {} \;

clean/python:
	find . -name '*_pb2.py' -delete
	find . -name '*_pb2_grpc.py' -delete
	rm -rf python/github python/github.com

.PHONY: %.pb.c

%.pb.c: %.proto
	@$(PROTOC) --c_out=$(PROTOC_API_PATH)/c $(PROTOC_API_PATH)/$<

postprocess/c:
	@#nothing

clean/c:
	rm -rf c/github.com/TheThingsNetwork

.PHONY: %.pb.swift

%.pb.swift: %.proto
	@$(PROTOC) --swift_out=/src --grpc-swift_out=/src $(PROTOC_API_PATH)/$<

postprocess/swift:
	@#nothing

clean/swift:
	find . -name '*.swift' -delete
