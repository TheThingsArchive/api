// source: github.com/TheThingsNetwork/api/trace/trace.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

goog.exportSymbol('proto.trace.Trace', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.trace.Trace = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.trace.Trace.repeatedFields_, null);
};
goog.inherits(proto.trace.Trace, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.trace.Trace.displayName = 'proto.trace.Trace';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.trace.Trace.repeatedFields_ = [11];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.trace.Trace.prototype.toObject = function(opt_includeInstance) {
  return proto.trace.Trace.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.trace.Trace} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.trace.Trace.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    time: jspb.Message.getFieldWithDefault(msg, 2, 0),
    serviceId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    serviceName: jspb.Message.getFieldWithDefault(msg, 4, ""),
    event: jspb.Message.getFieldWithDefault(msg, 5, ""),
    metadataMap: (f = msg.getMetadataMap()) ? f.toObject(includeInstance, undefined) : [],
    parentsList: jspb.Message.toObjectList(msg.getParentsList(),
    proto.trace.Trace.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.trace.Trace}
 */
proto.trace.Trace.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.trace.Trace;
  return proto.trace.Trace.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.trace.Trace} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.trace.Trace}
 */
proto.trace.Trace.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setTime(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setServiceId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setServiceName(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setEvent(value);
      break;
    case 6:
      var value = msg.getMetadataMap();
      reader.readMessage(value, function(message, reader) {
        jspb.Map.deserializeBinary(message, reader, jspb.BinaryReader.prototype.readString, jspb.BinaryReader.prototype.readString, null, "", "");
         });
      break;
    case 11:
      var value = new proto.trace.Trace;
      reader.readMessage(value,proto.trace.Trace.deserializeBinaryFromReader);
      msg.addParents(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.trace.Trace.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.trace.Trace.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.trace.Trace} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.trace.Trace.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTime();
  if (f !== 0) {
    writer.writeInt64(
      2,
      f
    );
  }
  f = message.getServiceId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getServiceName();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getEvent();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getMetadataMap(true);
  if (f && f.getLength() > 0) {
    f.serializeBinary(6, writer, jspb.BinaryWriter.prototype.writeString, jspb.BinaryWriter.prototype.writeString);
  }
  f = message.getParentsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      11,
      f,
      proto.trace.Trace.serializeBinaryToWriter
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.trace.Trace.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.trace.Trace} returns this
 */
proto.trace.Trace.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional int64 time = 2;
 * @return {number}
 */
proto.trace.Trace.prototype.getTime = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.trace.Trace} returns this
 */
proto.trace.Trace.prototype.setTime = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string service_id = 3;
 * @return {string}
 */
proto.trace.Trace.prototype.getServiceId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.trace.Trace} returns this
 */
proto.trace.Trace.prototype.setServiceId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string service_name = 4;
 * @return {string}
 */
proto.trace.Trace.prototype.getServiceName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.trace.Trace} returns this
 */
proto.trace.Trace.prototype.setServiceName = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string event = 5;
 * @return {string}
 */
proto.trace.Trace.prototype.getEvent = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.trace.Trace} returns this
 */
proto.trace.Trace.prototype.setEvent = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * map<string, string> metadata = 6;
 * @param {boolean=} opt_noLazyCreate Do not create the map if
 * empty, instead returning `undefined`
 * @return {!jspb.Map<string,string>}
 */
proto.trace.Trace.prototype.getMetadataMap = function(opt_noLazyCreate) {
  return /** @type {!jspb.Map<string,string>} */ (
      jspb.Message.getMapField(this, 6, opt_noLazyCreate,
      null));
};


/**
 * Clears values from the map. The map will be non-null.
 * @return {!proto.trace.Trace} returns this
 */
proto.trace.Trace.prototype.clearMetadataMap = function() {
  this.getMetadataMap().clear();
  return this;};


/**
 * repeated Trace parents = 11;
 * @return {!Array<!proto.trace.Trace>}
 */
proto.trace.Trace.prototype.getParentsList = function() {
  return /** @type{!Array<!proto.trace.Trace>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.trace.Trace, 11));
};


/**
 * @param {!Array<!proto.trace.Trace>} value
 * @return {!proto.trace.Trace} returns this
*/
proto.trace.Trace.prototype.setParentsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 11, value);
};


/**
 * @param {!proto.trace.Trace=} opt_value
 * @param {number=} opt_index
 * @return {!proto.trace.Trace}
 */
proto.trace.Trace.prototype.addParents = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 11, opt_value, proto.trace.Trace, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.trace.Trace} returns this
 */
proto.trace.Trace.prototype.clearParentsList = function() {
  return this.setParentsList([]);
};


goog.object.extend(exports, proto.trace);
