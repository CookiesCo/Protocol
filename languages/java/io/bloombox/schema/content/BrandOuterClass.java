// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: content/Brand.proto

package io.bloombox.schema.content;

public final class BrandOuterClass {
  private BrandOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Brand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Brand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023content/Brand.proto\032\022content/Name.prot" +
      "o\032\025content/Content.proto\032\025media/MediaIte" +
      "m.proto\"j\n\005Brand\022\023\n\004name\030\001 \001(\0132\005.Name\022\026\n" +
      "\006parent\030\002 \001(\0132\006.Brand\022\031\n\007summary\030\003 \001(\0132\010" +
      ".Content\022\031\n\005media\030\024 \003(\0132\n.MediaItemB\036\n\032i" +
      "o.bloombox.schema.contentP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.bloombox.schema.content.NameOuterClass.getDescriptor(),
          io.bloombox.schema.content.ContentOuterClass.getDescriptor(),
          io.bloombox.schema.media.MediaItemOuterClass.getDescriptor(),
        }, assigner);
    internal_static_Brand_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Brand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Brand_descriptor,
        new java.lang.String[] { "Name", "Parent", "Summary", "Media", });
    io.bloombox.schema.content.NameOuterClass.getDescriptor();
    io.bloombox.schema.content.ContentOuterClass.getDescriptor();
    io.bloombox.schema.media.MediaItemOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
