/**
 * @fileoverview
 * @enhanceable
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.PricingDescriptor');

goog.require('jspb.Message');
goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('proto.FreebiePricingDescriptor');
goog.require('proto.UnitPricingDescriptor');
goog.require('proto.WeightedPricingDescriptor');

goog.forwardDeclare('proto.PricingType');

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
proto.PricingDescriptor = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.PricingDescriptor, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.PricingDescriptor.displayName = 'proto.PricingDescriptor';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.PricingDescriptor.prototype.toObject = function(opt_includeInstance) {
  return proto.PricingDescriptor.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.PricingDescriptor} msg The msg instance to transform.
 * @return {!Object}
 */
proto.PricingDescriptor.toObject = function(includeInstance, msg) {
  var f, obj = {
    type: jspb.Message.getFieldWithDefault(msg, 1, 0),
    unit: (f = msg.getUnit()) && proto.UnitPricingDescriptor.toObject(includeInstance, f),
    weighted: (f = msg.getWeighted()) && proto.WeightedPricingDescriptor.toObject(includeInstance, f),
    freebie: (f = msg.getFreebie()) && proto.FreebiePricingDescriptor.toObject(includeInstance, f)
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
 * @return {!proto.PricingDescriptor}
 */
proto.PricingDescriptor.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.PricingDescriptor;
  return proto.PricingDescriptor.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.PricingDescriptor} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.PricingDescriptor}
 */
proto.PricingDescriptor.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.PricingType} */ (reader.readEnum());
      msg.setType(value);
      break;
    case 20:
      var value = new proto.UnitPricingDescriptor;
      reader.readMessage(value,proto.UnitPricingDescriptor.deserializeBinaryFromReader);
      msg.setUnit(value);
      break;
    case 21:
      var value = new proto.WeightedPricingDescriptor;
      reader.readMessage(value,proto.WeightedPricingDescriptor.deserializeBinaryFromReader);
      msg.setWeighted(value);
      break;
    case 22:
      var value = new proto.FreebiePricingDescriptor;
      reader.readMessage(value,proto.FreebiePricingDescriptor.deserializeBinaryFromReader);
      msg.setFreebie(value);
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
proto.PricingDescriptor.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.PricingDescriptor.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.PricingDescriptor} message
 * @param {!jspb.BinaryWriter} writer
 */
proto.PricingDescriptor.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getType();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getUnit();
  if (f != null) {
    writer.writeMessage(
      20,
      f,
      proto.UnitPricingDescriptor.serializeBinaryToWriter
    );
  }
  f = message.getWeighted();
  if (f != null) {
    writer.writeMessage(
      21,
      f,
      proto.WeightedPricingDescriptor.serializeBinaryToWriter
    );
  }
  f = message.getFreebie();
  if (f != null) {
    writer.writeMessage(
      22,
      f,
      proto.FreebiePricingDescriptor.serializeBinaryToWriter
    );
  }
};


/**
 * optional PricingType type = 1;
 * @return {!proto.PricingType}
 */
proto.PricingDescriptor.prototype.getType = function() {
  return /** @type {!proto.PricingType} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/** @param {!proto.PricingType} value */
proto.PricingDescriptor.prototype.setType = function(value) {
  jspb.Message.setField(this, 1, value);
};


/**
 * optional UnitPricingDescriptor unit = 20;
 * @return {?proto.UnitPricingDescriptor}
 */
proto.PricingDescriptor.prototype.getUnit = function() {
  return /** @type{?proto.UnitPricingDescriptor} */ (
    jspb.Message.getWrapperField(this, proto.UnitPricingDescriptor, 20));
};


/** @param {?proto.UnitPricingDescriptor|undefined} value */
proto.PricingDescriptor.prototype.setUnit = function(value) {
  jspb.Message.setWrapperField(this, 20, value);
};


proto.PricingDescriptor.prototype.clearUnit = function() {
  this.setUnit(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.PricingDescriptor.prototype.hasUnit = function() {
  return jspb.Message.getField(this, 20) != null;
};


/**
 * optional WeightedPricingDescriptor weighted = 21;
 * @return {?proto.WeightedPricingDescriptor}
 */
proto.PricingDescriptor.prototype.getWeighted = function() {
  return /** @type{?proto.WeightedPricingDescriptor} */ (
    jspb.Message.getWrapperField(this, proto.WeightedPricingDescriptor, 21));
};


/** @param {?proto.WeightedPricingDescriptor|undefined} value */
proto.PricingDescriptor.prototype.setWeighted = function(value) {
  jspb.Message.setWrapperField(this, 21, value);
};


proto.PricingDescriptor.prototype.clearWeighted = function() {
  this.setWeighted(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.PricingDescriptor.prototype.hasWeighted = function() {
  return jspb.Message.getField(this, 21) != null;
};


/**
 * optional FreebiePricingDescriptor freebie = 22;
 * @return {?proto.FreebiePricingDescriptor}
 */
proto.PricingDescriptor.prototype.getFreebie = function() {
  return /** @type{?proto.FreebiePricingDescriptor} */ (
    jspb.Message.getWrapperField(this, proto.FreebiePricingDescriptor, 22));
};


/** @param {?proto.FreebiePricingDescriptor|undefined} value */
proto.PricingDescriptor.prototype.setFreebie = function(value) {
  jspb.Message.setWrapperField(this, 22, value);
};


proto.PricingDescriptor.prototype.clearFreebie = function() {
  this.setFreebie(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.PricingDescriptor.prototype.hasFreebie = function() {
  return jspb.Message.getField(this, 22) != null;
};

