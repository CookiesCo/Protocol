# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: content/ProductContent.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from content import Name_pb2 as content_dot_Name__pb2
from content import Brand_pb2 as content_dot_Brand__pb2
from content import Content_pb2 as content_dot_Content__pb2
from media import MediaItem_pb2 as media_dot_MediaItem__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='content/ProductContent.proto',
  package='',
  syntax='proto3',
  serialized_pb=_b('\n\x1c\x63ontent/ProductContent.proto\x1a\x12\x63ontent/Name.proto\x1a\x13\x63ontent/Brand.proto\x1a\x15\x63ontent/Content.proto\x1a\x15media/MediaItem.proto\"\xbf\x01\n\x0eProductContent\x12\x13\n\x04name\x18\x01 \x01(\x0b\x32\x05.Name\x12\x19\n\x07summary\x18\x02 \x01(\x0b\x32\x08.Content\x12\x15\n\x05\x62rand\x18\x03 \x01(\x0b\x32\x06.Brand\x12\x19\n\x05media\x18\x14 \x03(\x0b\x32\n.MediaItem\x12\x17\n\x05usage\x18\x1e \x01(\x0b\x32\x08.Content\x12\x18\n\x06\x64osage\x18\x1f \x01(\x0b\x32\x08.Content\x12\x18\n\x06\x61\x64vice\x18  \x01(\x0b\x32\x08.ContentB\x1e\n\x1aio.bloombox.schema.contentP\x01\x62\x06proto3')
  ,
  dependencies=[content_dot_Name__pb2.DESCRIPTOR,content_dot_Brand__pb2.DESCRIPTOR,content_dot_Content__pb2.DESCRIPTOR,media_dot_MediaItem__pb2.DESCRIPTOR,])




_PRODUCTCONTENT = _descriptor.Descriptor(
  name='ProductContent',
  full_name='ProductContent',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='ProductContent.name', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='summary', full_name='ProductContent.summary', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='brand', full_name='ProductContent.brand', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='media', full_name='ProductContent.media', index=3,
      number=20, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='usage', full_name='ProductContent.usage', index=4,
      number=30, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='dosage', full_name='ProductContent.dosage', index=5,
      number=31, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='advice', full_name='ProductContent.advice', index=6,
      number=32, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=120,
  serialized_end=311,
)

_PRODUCTCONTENT.fields_by_name['name'].message_type = content_dot_Name__pb2._NAME
_PRODUCTCONTENT.fields_by_name['summary'].message_type = content_dot_Content__pb2._CONTENT
_PRODUCTCONTENT.fields_by_name['brand'].message_type = content_dot_Brand__pb2._BRAND
_PRODUCTCONTENT.fields_by_name['media'].message_type = media_dot_MediaItem__pb2._MEDIAITEM
_PRODUCTCONTENT.fields_by_name['usage'].message_type = content_dot_Content__pb2._CONTENT
_PRODUCTCONTENT.fields_by_name['dosage'].message_type = content_dot_Content__pb2._CONTENT
_PRODUCTCONTENT.fields_by_name['advice'].message_type = content_dot_Content__pb2._CONTENT
DESCRIPTOR.message_types_by_name['ProductContent'] = _PRODUCTCONTENT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ProductContent = _reflection.GeneratedProtocolMessageType('ProductContent', (_message.Message,), dict(
  DESCRIPTOR = _PRODUCTCONTENT,
  __module__ = 'content.ProductContent_pb2'
  # @@protoc_insertion_point(class_scope:ProductContent)
  ))
_sym_db.RegisterMessage(ProductContent)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('\n\032io.bloombox.schema.contentP\001'))
# @@protoc_insertion_point(module_scope)
