// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: structs/FlagsDescriptor.proto
//
// For information on using the generated types, please see the documenation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that your are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

public enum ProductFlag: SwiftProtobuf.Enum {
  public typealias RawValue = Int
  case visible // = 0
  case premium // = 1
  case featured // = 2
  case lastchance // = 3
  case inhouse // = 4
  case UNRECOGNIZED(Int)

  public init() {
    self = .visible
  }

  public init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .visible
    case 1: self = .premium
    case 2: self = .featured
    case 3: self = .lastchance
    case 4: self = .inhouse
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  public var rawValue: Int {
    switch self {
    case .visible: return 0
    case .premium: return 1
    case .featured: return 2
    case .lastchance: return 3
    case .inhouse: return 4
    case .UNRECOGNIZED(let i): return i
    }
  }

}

public struct ProductFlagValue: SwiftProtobuf.Message {
  public static let protoMessageName: String = "ProductFlagValue"

  public var type: ProductFlag = .visible

  public var value: Bool = false

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  /// Used by the decoding initializers in the SwiftProtobuf library, not generally
  /// used directly. `init(serializedData:)`, `init(jsonUTF8Data:)`, and other decoding
  /// initializers are defined in the SwiftProtobuf library. See the Message and
  /// Message+*Additions` files.
  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularEnumField(value: &self.type)
      case 2: try decoder.decodeSingularBoolField(value: &self.value)
      default: break
      }
    }
  }

  /// Used by the encoding methods of the SwiftProtobuf library, not generally
  /// used directly. `Message.serializedData()`, `Message.jsonUTF8Data()`, and
  /// other serializer methods are defined in the SwiftProtobuf library. See the
  /// `Message` and `Message+*Additions` files.
  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.type != .visible {
      try visitor.visitSingularEnumField(value: self.type, fieldNumber: 1)
    }
    if self.value != false {
      try visitor.visitSingularBoolField(value: self.value, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }
}

public struct ProductFlagset: SwiftProtobuf.Message {
  public static let protoMessageName: String = "ProductFlagset"

  public var flags: [ProductFlagValue] = []

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  /// Used by the decoding initializers in the SwiftProtobuf library, not generally
  /// used directly. `init(serializedData:)`, `init(jsonUTF8Data:)`, and other decoding
  /// initializers are defined in the SwiftProtobuf library. See the Message and
  /// Message+*Additions` files.
  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeRepeatedMessageField(value: &self.flags)
      default: break
      }
    }
  }

  /// Used by the encoding methods of the SwiftProtobuf library, not generally
  /// used directly. `Message.serializedData()`, `Message.jsonUTF8Data()`, and
  /// other serializer methods are defined in the SwiftProtobuf library. See the
  /// `Message` and `Message+*Additions` files.
  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.flags.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.flags, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }
}

public struct FlagsDescriptor: SwiftProtobuf.Message {
  public static let protoMessageName: String = "FlagsDescriptor"

  public var visible: Bool = false

  public var premium: Bool = false

  public var featured: Bool = false

  public var lastchance: Bool = false

  public var inhouse: Bool = false

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  /// Used by the decoding initializers in the SwiftProtobuf library, not generally
  /// used directly. `init(serializedData:)`, `init(jsonUTF8Data:)`, and other decoding
  /// initializers are defined in the SwiftProtobuf library. See the Message and
  /// Message+*Additions` files.
  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularBoolField(value: &self.visible)
      case 2: try decoder.decodeSingularBoolField(value: &self.premium)
      case 3: try decoder.decodeSingularBoolField(value: &self.featured)
      case 4: try decoder.decodeSingularBoolField(value: &self.lastchance)
      case 5: try decoder.decodeSingularBoolField(value: &self.inhouse)
      default: break
      }
    }
  }

  /// Used by the encoding methods of the SwiftProtobuf library, not generally
  /// used directly. `Message.serializedData()`, `Message.jsonUTF8Data()`, and
  /// other serializer methods are defined in the SwiftProtobuf library. See the
  /// `Message` and `Message+*Additions` files.
  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.visible != false {
      try visitor.visitSingularBoolField(value: self.visible, fieldNumber: 1)
    }
    if self.premium != false {
      try visitor.visitSingularBoolField(value: self.premium, fieldNumber: 2)
    }
    if self.featured != false {
      try visitor.visitSingularBoolField(value: self.featured, fieldNumber: 3)
    }
    if self.lastchance != false {
      try visitor.visitSingularBoolField(value: self.lastchance, fieldNumber: 4)
    }
    if self.inhouse != false {
      try visitor.visitSingularBoolField(value: self.inhouse, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

extension ProductFlag: SwiftProtobuf._ProtoNameProviding {
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "VISIBLE"),
    1: .same(proto: "PREMIUM"),
    2: .same(proto: "FEATURED"),
    3: .same(proto: "LASTCHANCE"),
    4: .same(proto: "INHOUSE"),
  ]
}

extension ProductFlagValue: SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "type"),
    2: .same(proto: "value"),
  ]

  public func _protobuf_generated_isEqualTo(other: ProductFlagValue) -> Bool {
    if self.type != other.type {return false}
    if self.value != other.value {return false}
    if unknownFields != other.unknownFields {return false}
    return true
  }
}

extension ProductFlagset: SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "flags"),
  ]

  public func _protobuf_generated_isEqualTo(other: ProductFlagset) -> Bool {
    if self.flags != other.flags {return false}
    if unknownFields != other.unknownFields {return false}
    return true
  }
}

extension FlagsDescriptor: SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "visible"),
    2: .same(proto: "premium"),
    3: .same(proto: "featured"),
    4: .same(proto: "lastchance"),
    5: .same(proto: "inhouse"),
  ]

  public func _protobuf_generated_isEqualTo(other: FlagsDescriptor) -> Bool {
    if self.visible != other.visible {return false}
    if self.premium != other.premium {return false}
    if self.featured != other.featured {return false}
    if self.lastchance != other.lastchance {return false}
    if self.inhouse != other.inhouse {return false}
    if unknownFields != other.unknownFields {return false}
    return true
  }
}
