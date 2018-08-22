// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package main

import (
	"github.com/gogo/protobuf/protoc-gen-gogo/descriptor"
	"github.com/gogo/protobuf/vanity"
	"github.com/gogo/protobuf/vanity/command"
)

func main() {
	req := command.Read()
	files := req.GetProtoFile()
	files = vanity.FilterFiles(files, vanity.NotGoogleProtobufDescriptorProto)

	for _, opt := range []func(*descriptor.FileDescriptorProto){
		vanity.TurnOffGoStringerAll,
		vanity.TurnOffGoUnrecognizedAll,
		vanity.TurnOnEqualAll,
		vanity.TurnOnMarshalerAll,
		vanity.TurnOnSizerAll,
		vanity.TurnOnStringerAll,
		vanity.TurnOnUnmarshalerAll,
		vanity.TurnOnVerboseEqualAll,
	} {
		vanity.ForEachFile(files, opt)
	}
	command.Write(command.Generate(req))
}
