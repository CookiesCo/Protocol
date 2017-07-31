// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: content/Name.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "content/Name.pb.h"

#include <algorithm>

#include <google/protobuf/stubs/common.h>
#include <google/protobuf/stubs/port.h>
#include <google/protobuf/stubs/once.h>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/wire_format_lite_inl.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)
class NameDefaultTypeInternal : public ::google::protobuf::internal::ExplicitlyConstructed<Name> {
} _Name_default_instance_;

namespace protobuf_content_2fName_2eproto {


namespace {

::google::protobuf::Metadata file_level_metadata[1];

}  // namespace

PROTOBUF_CONSTEXPR_VAR ::google::protobuf::internal::ParseTableField
    const TableStruct::entries[] = {
  {0, 0, 0, ::google::protobuf::internal::kInvalidMask, 0, 0},
};

PROTOBUF_CONSTEXPR_VAR ::google::protobuf::internal::AuxillaryParseTableField
    const TableStruct::aux[] = {
  ::google::protobuf::internal::AuxillaryParseTableField(),
};
PROTOBUF_CONSTEXPR_VAR ::google::protobuf::internal::ParseTable const
    TableStruct::schema[] = {
  { NULL, NULL, 0, -1, -1, false },
};

const ::google::protobuf::uint32 TableStruct::offsets[] = {
  ~0u,  // no _has_bits_
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(Name, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(Name, primary_),
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(Name, display_),
};

static const ::google::protobuf::internal::MigrationSchema schemas[] = {
  { 0, -1, sizeof(Name)},
};

static ::google::protobuf::Message const * const file_default_instances[] = {
  reinterpret_cast<const ::google::protobuf::Message*>(&_Name_default_instance_),
};

namespace {

void protobuf_AssignDescriptors() {
  AddDescriptors();
  ::google::protobuf::MessageFactory* factory = NULL;
  AssignDescriptors(
      "content/Name.proto", schemas, file_default_instances, TableStruct::offsets, factory,
      file_level_metadata, NULL, NULL);
}

void protobuf_AssignDescriptorsOnce() {
  static GOOGLE_PROTOBUF_DECLARE_ONCE(once);
  ::google::protobuf::GoogleOnceInit(&once, &protobuf_AssignDescriptors);
}

void protobuf_RegisterTypes(const ::std::string&) GOOGLE_ATTRIBUTE_COLD;
void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::internal::RegisterAllTypes(file_level_metadata, 1);
}

}  // namespace

void TableStruct::Shutdown() {
  _Name_default_instance_.Shutdown();
  delete file_level_metadata[0].reflection;
}

void TableStruct::InitDefaultsImpl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::google::protobuf::internal::InitProtobufDefaults();
  _Name_default_instance_.DefaultConstruct();
}

void InitDefaults() {
  static GOOGLE_PROTOBUF_DECLARE_ONCE(once);
  ::google::protobuf::GoogleOnceInit(&once, &TableStruct::InitDefaultsImpl);
}
void AddDescriptorsImpl() {
  InitDefaults();
  static const char descriptor[] = {
      "\n\022content/Name.proto\"(\n\004Name\022\017\n\007primary\030"
      "\001 \001(\t\022\017\n\007display\030\002 \001(\tB\036\n\032io.bloombox.sc"
      "hema.contentP\001b\006proto3"
  };
  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
      descriptor, 102);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "content/Name.proto", &protobuf_RegisterTypes);
  ::google::protobuf::internal::OnShutdown(&TableStruct::Shutdown);
}

void AddDescriptors() {
  static GOOGLE_PROTOBUF_DECLARE_ONCE(once);
  ::google::protobuf::GoogleOnceInit(&once, &AddDescriptorsImpl);
}
// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer {
  StaticDescriptorInitializer() {
    AddDescriptors();
  }
} static_descriptor_initializer;

}  // namespace protobuf_content_2fName_2eproto


// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int Name::kPrimaryFieldNumber;
const int Name::kDisplayFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

Name::Name()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  if (GOOGLE_PREDICT_TRUE(this != internal_default_instance())) {
    protobuf_content_2fName_2eproto::InitDefaults();
  }
  SharedCtor();
  // @@protoc_insertion_point(constructor:Name)
}
Name::Name(const Name& from)
  : ::google::protobuf::Message(),
      _internal_metadata_(NULL),
      _cached_size_(0) {
  _internal_metadata_.MergeFrom(from._internal_metadata_);
  primary_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  if (from.primary().size() > 0) {
    primary_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.primary_);
  }
  display_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  if (from.display().size() > 0) {
    display_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.display_);
  }
  // @@protoc_insertion_point(copy_constructor:Name)
}

void Name::SharedCtor() {
  primary_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  display_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  _cached_size_ = 0;
}

Name::~Name() {
  // @@protoc_insertion_point(destructor:Name)
  SharedDtor();
}

void Name::SharedDtor() {
  primary_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  display_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

void Name::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* Name::descriptor() {
  protobuf_content_2fName_2eproto::protobuf_AssignDescriptorsOnce();
  return protobuf_content_2fName_2eproto::file_level_metadata[kIndexInFileMessages].descriptor;
}

const Name& Name::default_instance() {
  protobuf_content_2fName_2eproto::InitDefaults();
  return *internal_default_instance();
}

Name* Name::New(::google::protobuf::Arena* arena) const {
  Name* n = new Name;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void Name::Clear() {
// @@protoc_insertion_point(message_clear_start:Name)
  primary_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  display_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

bool Name::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:Name)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoffNoLastTag(127u);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // string primary = 1;
      case 1: {
        if (static_cast< ::google::protobuf::uint8>(tag) ==
            static_cast< ::google::protobuf::uint8>(10u)) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_primary()));
          DO_(::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
            this->primary().data(), this->primary().length(),
            ::google::protobuf::internal::WireFormatLite::PARSE,
            "Name.primary"));
        } else {
          goto handle_unusual;
        }
        break;
      }

      // string display = 2;
      case 2: {
        if (static_cast< ::google::protobuf::uint8>(tag) ==
            static_cast< ::google::protobuf::uint8>(18u)) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_display()));
          DO_(::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
            this->display().data(), this->display().length(),
            ::google::protobuf::internal::WireFormatLite::PARSE,
            "Name.display"));
        } else {
          goto handle_unusual;
        }
        break;
      }

      default: {
      handle_unusual:
        if (tag == 0 ||
            ::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
          goto success;
        }
        DO_(::google::protobuf::internal::WireFormatLite::SkipField(input, tag));
        break;
      }
    }
  }
success:
  // @@protoc_insertion_point(parse_success:Name)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:Name)
  return false;
#undef DO_
}

void Name::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:Name)
  ::google::protobuf::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  // string primary = 1;
  if (this->primary().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->primary().data(), this->primary().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "Name.primary");
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      1, this->primary(), output);
  }

  // string display = 2;
  if (this->display().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->display().data(), this->display().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "Name.display");
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      2, this->display(), output);
  }

  // @@protoc_insertion_point(serialize_end:Name)
}

::google::protobuf::uint8* Name::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  (void)deterministic; // Unused
  // @@protoc_insertion_point(serialize_to_array_start:Name)
  ::google::protobuf::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  // string primary = 1;
  if (this->primary().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->primary().data(), this->primary().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "Name.primary");
    target =
      ::google::protobuf::internal::WireFormatLite::WriteStringToArray(
        1, this->primary(), target);
  }

  // string display = 2;
  if (this->display().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->display().data(), this->display().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "Name.display");
    target =
      ::google::protobuf::internal::WireFormatLite::WriteStringToArray(
        2, this->display(), target);
  }

  // @@protoc_insertion_point(serialize_to_array_end:Name)
  return target;
}

size_t Name::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:Name)
  size_t total_size = 0;

  // string primary = 1;
  if (this->primary().size() > 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::StringSize(
        this->primary());
  }

  // string display = 2;
  if (this->display().size() > 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::StringSize(
        this->display());
  }

  int cached_size = ::google::protobuf::internal::ToCachedSize(total_size);
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = cached_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void Name::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:Name)
  GOOGLE_DCHECK_NE(&from, this);
  const Name* source =
      ::google::protobuf::internal::DynamicCastToGenerated<const Name>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:Name)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:Name)
    MergeFrom(*source);
  }
}

void Name::MergeFrom(const Name& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:Name)
  GOOGLE_DCHECK_NE(&from, this);
  _internal_metadata_.MergeFrom(from._internal_metadata_);
  ::google::protobuf::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  if (from.primary().size() > 0) {

    primary_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.primary_);
  }
  if (from.display().size() > 0) {

    display_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.display_);
  }
}

void Name::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:Name)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void Name::CopyFrom(const Name& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:Name)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool Name::IsInitialized() const {
  return true;
}

void Name::Swap(Name* other) {
  if (other == this) return;
  InternalSwap(other);
}
void Name::InternalSwap(Name* other) {
  primary_.Swap(&other->primary_);
  display_.Swap(&other->display_);
  std::swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata Name::GetMetadata() const {
  protobuf_content_2fName_2eproto::protobuf_AssignDescriptorsOnce();
  return protobuf_content_2fName_2eproto::file_level_metadata[kIndexInFileMessages];
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// Name

// string primary = 1;
void Name::clear_primary() {
  primary_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
const ::std::string& Name::primary() const {
  // @@protoc_insertion_point(field_get:Name.primary)
  return primary_.GetNoArena();
}
void Name::set_primary(const ::std::string& value) {
  
  primary_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:Name.primary)
}
#if LANG_CXX11
void Name::set_primary(::std::string&& value) {
  
  primary_.SetNoArena(
    &::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::move(value));
  // @@protoc_insertion_point(field_set_rvalue:Name.primary)
}
#endif
void Name::set_primary(const char* value) {
  GOOGLE_DCHECK(value != NULL);
  
  primary_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:Name.primary)
}
void Name::set_primary(const char* value, size_t size) {
  
  primary_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:Name.primary)
}
::std::string* Name::mutable_primary() {
  
  // @@protoc_insertion_point(field_mutable:Name.primary)
  return primary_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
::std::string* Name::release_primary() {
  // @@protoc_insertion_point(field_release:Name.primary)
  
  return primary_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void Name::set_allocated_primary(::std::string* primary) {
  if (primary != NULL) {
    
  } else {
    
  }
  primary_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), primary);
  // @@protoc_insertion_point(field_set_allocated:Name.primary)
}

// string display = 2;
void Name::clear_display() {
  display_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
const ::std::string& Name::display() const {
  // @@protoc_insertion_point(field_get:Name.display)
  return display_.GetNoArena();
}
void Name::set_display(const ::std::string& value) {
  
  display_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:Name.display)
}
#if LANG_CXX11
void Name::set_display(::std::string&& value) {
  
  display_.SetNoArena(
    &::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::move(value));
  // @@protoc_insertion_point(field_set_rvalue:Name.display)
}
#endif
void Name::set_display(const char* value) {
  GOOGLE_DCHECK(value != NULL);
  
  display_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:Name.display)
}
void Name::set_display(const char* value, size_t size) {
  
  display_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:Name.display)
}
::std::string* Name::mutable_display() {
  
  // @@protoc_insertion_point(field_mutable:Name.display)
  return display_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
::std::string* Name::release_display() {
  // @@protoc_insertion_point(field_release:Name.display)
  
  return display_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void Name::set_allocated_display(::std::string* display) {
  if (display != NULL) {
    
  } else {
    
  }
  display_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), display);
  // @@protoc_insertion_point(field_set_allocated:Name.display)
}

#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// @@protoc_insertion_point(namespace_scope)

// @@protoc_insertion_point(global_scope)
