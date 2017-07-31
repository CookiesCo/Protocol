// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: content/ProductContent.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "content/ProductContent.pb.h"

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
class ProductContentDefaultTypeInternal : public ::google::protobuf::internal::ExplicitlyConstructed<ProductContent> {
} _ProductContent_default_instance_;

namespace protobuf_content_2fProductContent_2eproto {


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
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(ProductContent, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(ProductContent, name_),
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(ProductContent, summary_),
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(ProductContent, brand_),
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(ProductContent, media_),
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(ProductContent, usage_),
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(ProductContent, dosage_),
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(ProductContent, advice_),
};

static const ::google::protobuf::internal::MigrationSchema schemas[] = {
  { 0, -1, sizeof(ProductContent)},
};

static ::google::protobuf::Message const * const file_default_instances[] = {
  reinterpret_cast<const ::google::protobuf::Message*>(&_ProductContent_default_instance_),
};

namespace {

void protobuf_AssignDescriptors() {
  AddDescriptors();
  ::google::protobuf::MessageFactory* factory = NULL;
  AssignDescriptors(
      "content/ProductContent.proto", schemas, file_default_instances, TableStruct::offsets, factory,
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
  _ProductContent_default_instance_.Shutdown();
  delete file_level_metadata[0].reflection;
}

void TableStruct::InitDefaultsImpl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::google::protobuf::internal::InitProtobufDefaults();
  ::protobuf_content_2fName_2eproto::InitDefaults();
  ::protobuf_content_2fBrand_2eproto::InitDefaults();
  ::protobuf_content_2fContent_2eproto::InitDefaults();
  ::protobuf_media_2fMediaItem_2eproto::InitDefaults();
  _ProductContent_default_instance_.DefaultConstruct();
  _ProductContent_default_instance_.get_mutable()->name_ = const_cast< ::Name*>(
      ::Name::internal_default_instance());
  _ProductContent_default_instance_.get_mutable()->summary_ = const_cast< ::Content*>(
      ::Content::internal_default_instance());
  _ProductContent_default_instance_.get_mutable()->brand_ = const_cast< ::Brand*>(
      ::Brand::internal_default_instance());
  _ProductContent_default_instance_.get_mutable()->usage_ = const_cast< ::Content*>(
      ::Content::internal_default_instance());
  _ProductContent_default_instance_.get_mutable()->dosage_ = const_cast< ::Content*>(
      ::Content::internal_default_instance());
  _ProductContent_default_instance_.get_mutable()->advice_ = const_cast< ::Content*>(
      ::Content::internal_default_instance());
}

void InitDefaults() {
  static GOOGLE_PROTOBUF_DECLARE_ONCE(once);
  ::google::protobuf::GoogleOnceInit(&once, &TableStruct::InitDefaultsImpl);
}
void AddDescriptorsImpl() {
  InitDefaults();
  static const char descriptor[] = {
      "\n\034content/ProductContent.proto\032\022content/"
      "Name.proto\032\023content/Brand.proto\032\025content"
      "/Content.proto\032\025media/MediaItem.proto\"\277\001"
      "\n\016ProductContent\022\023\n\004name\030\001 \001(\0132\005.Name\022\031\n"
      "\007summary\030\002 \001(\0132\010.Content\022\025\n\005brand\030\003 \001(\0132"
      "\006.Brand\022\031\n\005media\030\024 \003(\0132\n.MediaItem\022\027\n\005us"
      "age\030\036 \001(\0132\010.Content\022\030\n\006dosage\030\037 \001(\0132\010.Co"
      "ntent\022\030\n\006advice\030  \001(\0132\010.ContentB\036\n\032io.bl"
      "oombox.schema.contentP\001b\006proto3"
  };
  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
      descriptor, 351);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "content/ProductContent.proto", &protobuf_RegisterTypes);
  ::protobuf_content_2fName_2eproto::AddDescriptors();
  ::protobuf_content_2fBrand_2eproto::AddDescriptors();
  ::protobuf_content_2fContent_2eproto::AddDescriptors();
  ::protobuf_media_2fMediaItem_2eproto::AddDescriptors();
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

}  // namespace protobuf_content_2fProductContent_2eproto


// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int ProductContent::kNameFieldNumber;
const int ProductContent::kSummaryFieldNumber;
const int ProductContent::kBrandFieldNumber;
const int ProductContent::kMediaFieldNumber;
const int ProductContent::kUsageFieldNumber;
const int ProductContent::kDosageFieldNumber;
const int ProductContent::kAdviceFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

ProductContent::ProductContent()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  if (GOOGLE_PREDICT_TRUE(this != internal_default_instance())) {
    protobuf_content_2fProductContent_2eproto::InitDefaults();
  }
  SharedCtor();
  // @@protoc_insertion_point(constructor:ProductContent)
}
ProductContent::ProductContent(const ProductContent& from)
  : ::google::protobuf::Message(),
      _internal_metadata_(NULL),
      media_(from.media_),
      _cached_size_(0) {
  _internal_metadata_.MergeFrom(from._internal_metadata_);
  if (from.has_name()) {
    name_ = new ::Name(*from.name_);
  } else {
    name_ = NULL;
  }
  if (from.has_summary()) {
    summary_ = new ::Content(*from.summary_);
  } else {
    summary_ = NULL;
  }
  if (from.has_brand()) {
    brand_ = new ::Brand(*from.brand_);
  } else {
    brand_ = NULL;
  }
  if (from.has_usage()) {
    usage_ = new ::Content(*from.usage_);
  } else {
    usage_ = NULL;
  }
  if (from.has_dosage()) {
    dosage_ = new ::Content(*from.dosage_);
  } else {
    dosage_ = NULL;
  }
  if (from.has_advice()) {
    advice_ = new ::Content(*from.advice_);
  } else {
    advice_ = NULL;
  }
  // @@protoc_insertion_point(copy_constructor:ProductContent)
}

void ProductContent::SharedCtor() {
  ::memset(&name_, 0, reinterpret_cast<char*>(&advice_) -
    reinterpret_cast<char*>(&name_) + sizeof(advice_));
  _cached_size_ = 0;
}

ProductContent::~ProductContent() {
  // @@protoc_insertion_point(destructor:ProductContent)
  SharedDtor();
}

void ProductContent::SharedDtor() {
  if (this != internal_default_instance()) {
    delete name_;
  }
  if (this != internal_default_instance()) {
    delete summary_;
  }
  if (this != internal_default_instance()) {
    delete brand_;
  }
  if (this != internal_default_instance()) {
    delete usage_;
  }
  if (this != internal_default_instance()) {
    delete dosage_;
  }
  if (this != internal_default_instance()) {
    delete advice_;
  }
}

void ProductContent::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* ProductContent::descriptor() {
  protobuf_content_2fProductContent_2eproto::protobuf_AssignDescriptorsOnce();
  return protobuf_content_2fProductContent_2eproto::file_level_metadata[kIndexInFileMessages].descriptor;
}

const ProductContent& ProductContent::default_instance() {
  protobuf_content_2fProductContent_2eproto::InitDefaults();
  return *internal_default_instance();
}

ProductContent* ProductContent::New(::google::protobuf::Arena* arena) const {
  ProductContent* n = new ProductContent;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void ProductContent::Clear() {
// @@protoc_insertion_point(message_clear_start:ProductContent)
  media_.Clear();
  if (GetArenaNoVirtual() == NULL && name_ != NULL) {
    delete name_;
  }
  name_ = NULL;
  if (GetArenaNoVirtual() == NULL && summary_ != NULL) {
    delete summary_;
  }
  summary_ = NULL;
  if (GetArenaNoVirtual() == NULL && brand_ != NULL) {
    delete brand_;
  }
  brand_ = NULL;
  if (GetArenaNoVirtual() == NULL && usage_ != NULL) {
    delete usage_;
  }
  usage_ = NULL;
  if (GetArenaNoVirtual() == NULL && dosage_ != NULL) {
    delete dosage_;
  }
  dosage_ = NULL;
  if (GetArenaNoVirtual() == NULL && advice_ != NULL) {
    delete advice_;
  }
  advice_ = NULL;
}

bool ProductContent::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:ProductContent)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoffNoLastTag(16383u);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // .Name name = 1;
      case 1: {
        if (static_cast< ::google::protobuf::uint8>(tag) ==
            static_cast< ::google::protobuf::uint8>(10u)) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadMessageNoVirtual(
               input, mutable_name()));
        } else {
          goto handle_unusual;
        }
        break;
      }

      // .Content summary = 2;
      case 2: {
        if (static_cast< ::google::protobuf::uint8>(tag) ==
            static_cast< ::google::protobuf::uint8>(18u)) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadMessageNoVirtual(
               input, mutable_summary()));
        } else {
          goto handle_unusual;
        }
        break;
      }

      // .Brand brand = 3;
      case 3: {
        if (static_cast< ::google::protobuf::uint8>(tag) ==
            static_cast< ::google::protobuf::uint8>(26u)) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadMessageNoVirtual(
               input, mutable_brand()));
        } else {
          goto handle_unusual;
        }
        break;
      }

      // repeated .MediaItem media = 20;
      case 20: {
        if (static_cast< ::google::protobuf::uint8>(tag) ==
            static_cast< ::google::protobuf::uint8>(162u)) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadMessageNoVirtual(
                input, add_media()));
        } else {
          goto handle_unusual;
        }
        break;
      }

      // .Content usage = 30;
      case 30: {
        if (static_cast< ::google::protobuf::uint8>(tag) ==
            static_cast< ::google::protobuf::uint8>(242u)) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadMessageNoVirtual(
               input, mutable_usage()));
        } else {
          goto handle_unusual;
        }
        break;
      }

      // .Content dosage = 31;
      case 31: {
        if (static_cast< ::google::protobuf::uint8>(tag) ==
            static_cast< ::google::protobuf::uint8>(250u)) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadMessageNoVirtual(
               input, mutable_dosage()));
        } else {
          goto handle_unusual;
        }
        break;
      }

      // .Content advice = 32;
      case 32: {
        if (static_cast< ::google::protobuf::uint8>(tag) ==
            static_cast< ::google::protobuf::uint8>(258u)) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadMessageNoVirtual(
               input, mutable_advice()));
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
  // @@protoc_insertion_point(parse_success:ProductContent)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:ProductContent)
  return false;
#undef DO_
}

void ProductContent::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:ProductContent)
  ::google::protobuf::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  // .Name name = 1;
  if (this->has_name()) {
    ::google::protobuf::internal::WireFormatLite::WriteMessageMaybeToArray(
      1, *this->name_, output);
  }

  // .Content summary = 2;
  if (this->has_summary()) {
    ::google::protobuf::internal::WireFormatLite::WriteMessageMaybeToArray(
      2, *this->summary_, output);
  }

  // .Brand brand = 3;
  if (this->has_brand()) {
    ::google::protobuf::internal::WireFormatLite::WriteMessageMaybeToArray(
      3, *this->brand_, output);
  }

  // repeated .MediaItem media = 20;
  for (unsigned int i = 0, n = this->media_size(); i < n; i++) {
    ::google::protobuf::internal::WireFormatLite::WriteMessageMaybeToArray(
      20, this->media(i), output);
  }

  // .Content usage = 30;
  if (this->has_usage()) {
    ::google::protobuf::internal::WireFormatLite::WriteMessageMaybeToArray(
      30, *this->usage_, output);
  }

  // .Content dosage = 31;
  if (this->has_dosage()) {
    ::google::protobuf::internal::WireFormatLite::WriteMessageMaybeToArray(
      31, *this->dosage_, output);
  }

  // .Content advice = 32;
  if (this->has_advice()) {
    ::google::protobuf::internal::WireFormatLite::WriteMessageMaybeToArray(
      32, *this->advice_, output);
  }

  // @@protoc_insertion_point(serialize_end:ProductContent)
}

::google::protobuf::uint8* ProductContent::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  (void)deterministic; // Unused
  // @@protoc_insertion_point(serialize_to_array_start:ProductContent)
  ::google::protobuf::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  // .Name name = 1;
  if (this->has_name()) {
    target = ::google::protobuf::internal::WireFormatLite::
      InternalWriteMessageNoVirtualToArray(
        1, *this->name_, deterministic, target);
  }

  // .Content summary = 2;
  if (this->has_summary()) {
    target = ::google::protobuf::internal::WireFormatLite::
      InternalWriteMessageNoVirtualToArray(
        2, *this->summary_, deterministic, target);
  }

  // .Brand brand = 3;
  if (this->has_brand()) {
    target = ::google::protobuf::internal::WireFormatLite::
      InternalWriteMessageNoVirtualToArray(
        3, *this->brand_, deterministic, target);
  }

  // repeated .MediaItem media = 20;
  for (unsigned int i = 0, n = this->media_size(); i < n; i++) {
    target = ::google::protobuf::internal::WireFormatLite::
      InternalWriteMessageNoVirtualToArray(
        20, this->media(i), deterministic, target);
  }

  // .Content usage = 30;
  if (this->has_usage()) {
    target = ::google::protobuf::internal::WireFormatLite::
      InternalWriteMessageNoVirtualToArray(
        30, *this->usage_, deterministic, target);
  }

  // .Content dosage = 31;
  if (this->has_dosage()) {
    target = ::google::protobuf::internal::WireFormatLite::
      InternalWriteMessageNoVirtualToArray(
        31, *this->dosage_, deterministic, target);
  }

  // .Content advice = 32;
  if (this->has_advice()) {
    target = ::google::protobuf::internal::WireFormatLite::
      InternalWriteMessageNoVirtualToArray(
        32, *this->advice_, deterministic, target);
  }

  // @@protoc_insertion_point(serialize_to_array_end:ProductContent)
  return target;
}

size_t ProductContent::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:ProductContent)
  size_t total_size = 0;

  // repeated .MediaItem media = 20;
  {
    unsigned int count = this->media_size();
    total_size += 2UL * count;
    for (unsigned int i = 0; i < count; i++) {
      total_size +=
        ::google::protobuf::internal::WireFormatLite::MessageSizeNoVirtual(
          this->media(i));
    }
  }

  // .Name name = 1;
  if (this->has_name()) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::MessageSizeNoVirtual(
        *this->name_);
  }

  // .Content summary = 2;
  if (this->has_summary()) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::MessageSizeNoVirtual(
        *this->summary_);
  }

  // .Brand brand = 3;
  if (this->has_brand()) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::MessageSizeNoVirtual(
        *this->brand_);
  }

  // .Content usage = 30;
  if (this->has_usage()) {
    total_size += 2 +
      ::google::protobuf::internal::WireFormatLite::MessageSizeNoVirtual(
        *this->usage_);
  }

  // .Content dosage = 31;
  if (this->has_dosage()) {
    total_size += 2 +
      ::google::protobuf::internal::WireFormatLite::MessageSizeNoVirtual(
        *this->dosage_);
  }

  // .Content advice = 32;
  if (this->has_advice()) {
    total_size += 2 +
      ::google::protobuf::internal::WireFormatLite::MessageSizeNoVirtual(
        *this->advice_);
  }

  int cached_size = ::google::protobuf::internal::ToCachedSize(total_size);
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = cached_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void ProductContent::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:ProductContent)
  GOOGLE_DCHECK_NE(&from, this);
  const ProductContent* source =
      ::google::protobuf::internal::DynamicCastToGenerated<const ProductContent>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:ProductContent)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:ProductContent)
    MergeFrom(*source);
  }
}

void ProductContent::MergeFrom(const ProductContent& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:ProductContent)
  GOOGLE_DCHECK_NE(&from, this);
  _internal_metadata_.MergeFrom(from._internal_metadata_);
  ::google::protobuf::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  media_.MergeFrom(from.media_);
  if (from.has_name()) {
    mutable_name()->::Name::MergeFrom(from.name());
  }
  if (from.has_summary()) {
    mutable_summary()->::Content::MergeFrom(from.summary());
  }
  if (from.has_brand()) {
    mutable_brand()->::Brand::MergeFrom(from.brand());
  }
  if (from.has_usage()) {
    mutable_usage()->::Content::MergeFrom(from.usage());
  }
  if (from.has_dosage()) {
    mutable_dosage()->::Content::MergeFrom(from.dosage());
  }
  if (from.has_advice()) {
    mutable_advice()->::Content::MergeFrom(from.advice());
  }
}

void ProductContent::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:ProductContent)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void ProductContent::CopyFrom(const ProductContent& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:ProductContent)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool ProductContent::IsInitialized() const {
  return true;
}

void ProductContent::Swap(ProductContent* other) {
  if (other == this) return;
  InternalSwap(other);
}
void ProductContent::InternalSwap(ProductContent* other) {
  media_.InternalSwap(&other->media_);
  std::swap(name_, other->name_);
  std::swap(summary_, other->summary_);
  std::swap(brand_, other->brand_);
  std::swap(usage_, other->usage_);
  std::swap(dosage_, other->dosage_);
  std::swap(advice_, other->advice_);
  std::swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata ProductContent::GetMetadata() const {
  protobuf_content_2fProductContent_2eproto::protobuf_AssignDescriptorsOnce();
  return protobuf_content_2fProductContent_2eproto::file_level_metadata[kIndexInFileMessages];
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// ProductContent

// .Name name = 1;
bool ProductContent::has_name() const {
  return this != internal_default_instance() && name_ != NULL;
}
void ProductContent::clear_name() {
  if (GetArenaNoVirtual() == NULL && name_ != NULL) delete name_;
  name_ = NULL;
}
const ::Name& ProductContent::name() const {
  // @@protoc_insertion_point(field_get:ProductContent.name)
  return name_ != NULL ? *name_
                         : *::Name::internal_default_instance();
}
::Name* ProductContent::mutable_name() {
  
  if (name_ == NULL) {
    name_ = new ::Name;
  }
  // @@protoc_insertion_point(field_mutable:ProductContent.name)
  return name_;
}
::Name* ProductContent::release_name() {
  // @@protoc_insertion_point(field_release:ProductContent.name)
  
  ::Name* temp = name_;
  name_ = NULL;
  return temp;
}
void ProductContent::set_allocated_name(::Name* name) {
  delete name_;
  name_ = name;
  if (name) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:ProductContent.name)
}

// .Content summary = 2;
bool ProductContent::has_summary() const {
  return this != internal_default_instance() && summary_ != NULL;
}
void ProductContent::clear_summary() {
  if (GetArenaNoVirtual() == NULL && summary_ != NULL) delete summary_;
  summary_ = NULL;
}
const ::Content& ProductContent::summary() const {
  // @@protoc_insertion_point(field_get:ProductContent.summary)
  return summary_ != NULL ? *summary_
                         : *::Content::internal_default_instance();
}
::Content* ProductContent::mutable_summary() {
  
  if (summary_ == NULL) {
    summary_ = new ::Content;
  }
  // @@protoc_insertion_point(field_mutable:ProductContent.summary)
  return summary_;
}
::Content* ProductContent::release_summary() {
  // @@protoc_insertion_point(field_release:ProductContent.summary)
  
  ::Content* temp = summary_;
  summary_ = NULL;
  return temp;
}
void ProductContent::set_allocated_summary(::Content* summary) {
  delete summary_;
  summary_ = summary;
  if (summary) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:ProductContent.summary)
}

// .Brand brand = 3;
bool ProductContent::has_brand() const {
  return this != internal_default_instance() && brand_ != NULL;
}
void ProductContent::clear_brand() {
  if (GetArenaNoVirtual() == NULL && brand_ != NULL) delete brand_;
  brand_ = NULL;
}
const ::Brand& ProductContent::brand() const {
  // @@protoc_insertion_point(field_get:ProductContent.brand)
  return brand_ != NULL ? *brand_
                         : *::Brand::internal_default_instance();
}
::Brand* ProductContent::mutable_brand() {
  
  if (brand_ == NULL) {
    brand_ = new ::Brand;
  }
  // @@protoc_insertion_point(field_mutable:ProductContent.brand)
  return brand_;
}
::Brand* ProductContent::release_brand() {
  // @@protoc_insertion_point(field_release:ProductContent.brand)
  
  ::Brand* temp = brand_;
  brand_ = NULL;
  return temp;
}
void ProductContent::set_allocated_brand(::Brand* brand) {
  delete brand_;
  brand_ = brand;
  if (brand) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:ProductContent.brand)
}

// repeated .MediaItem media = 20;
int ProductContent::media_size() const {
  return media_.size();
}
void ProductContent::clear_media() {
  media_.Clear();
}
const ::MediaItem& ProductContent::media(int index) const {
  // @@protoc_insertion_point(field_get:ProductContent.media)
  return media_.Get(index);
}
::MediaItem* ProductContent::mutable_media(int index) {
  // @@protoc_insertion_point(field_mutable:ProductContent.media)
  return media_.Mutable(index);
}
::MediaItem* ProductContent::add_media() {
  // @@protoc_insertion_point(field_add:ProductContent.media)
  return media_.Add();
}
::google::protobuf::RepeatedPtrField< ::MediaItem >*
ProductContent::mutable_media() {
  // @@protoc_insertion_point(field_mutable_list:ProductContent.media)
  return &media_;
}
const ::google::protobuf::RepeatedPtrField< ::MediaItem >&
ProductContent::media() const {
  // @@protoc_insertion_point(field_list:ProductContent.media)
  return media_;
}

// .Content usage = 30;
bool ProductContent::has_usage() const {
  return this != internal_default_instance() && usage_ != NULL;
}
void ProductContent::clear_usage() {
  if (GetArenaNoVirtual() == NULL && usage_ != NULL) delete usage_;
  usage_ = NULL;
}
const ::Content& ProductContent::usage() const {
  // @@protoc_insertion_point(field_get:ProductContent.usage)
  return usage_ != NULL ? *usage_
                         : *::Content::internal_default_instance();
}
::Content* ProductContent::mutable_usage() {
  
  if (usage_ == NULL) {
    usage_ = new ::Content;
  }
  // @@protoc_insertion_point(field_mutable:ProductContent.usage)
  return usage_;
}
::Content* ProductContent::release_usage() {
  // @@protoc_insertion_point(field_release:ProductContent.usage)
  
  ::Content* temp = usage_;
  usage_ = NULL;
  return temp;
}
void ProductContent::set_allocated_usage(::Content* usage) {
  delete usage_;
  usage_ = usage;
  if (usage) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:ProductContent.usage)
}

// .Content dosage = 31;
bool ProductContent::has_dosage() const {
  return this != internal_default_instance() && dosage_ != NULL;
}
void ProductContent::clear_dosage() {
  if (GetArenaNoVirtual() == NULL && dosage_ != NULL) delete dosage_;
  dosage_ = NULL;
}
const ::Content& ProductContent::dosage() const {
  // @@protoc_insertion_point(field_get:ProductContent.dosage)
  return dosage_ != NULL ? *dosage_
                         : *::Content::internal_default_instance();
}
::Content* ProductContent::mutable_dosage() {
  
  if (dosage_ == NULL) {
    dosage_ = new ::Content;
  }
  // @@protoc_insertion_point(field_mutable:ProductContent.dosage)
  return dosage_;
}
::Content* ProductContent::release_dosage() {
  // @@protoc_insertion_point(field_release:ProductContent.dosage)
  
  ::Content* temp = dosage_;
  dosage_ = NULL;
  return temp;
}
void ProductContent::set_allocated_dosage(::Content* dosage) {
  delete dosage_;
  dosage_ = dosage;
  if (dosage) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:ProductContent.dosage)
}

// .Content advice = 32;
bool ProductContent::has_advice() const {
  return this != internal_default_instance() && advice_ != NULL;
}
void ProductContent::clear_advice() {
  if (GetArenaNoVirtual() == NULL && advice_ != NULL) delete advice_;
  advice_ = NULL;
}
const ::Content& ProductContent::advice() const {
  // @@protoc_insertion_point(field_get:ProductContent.advice)
  return advice_ != NULL ? *advice_
                         : *::Content::internal_default_instance();
}
::Content* ProductContent::mutable_advice() {
  
  if (advice_ == NULL) {
    advice_ = new ::Content;
  }
  // @@protoc_insertion_point(field_mutable:ProductContent.advice)
  return advice_;
}
::Content* ProductContent::release_advice() {
  // @@protoc_insertion_point(field_release:ProductContent.advice)
  
  ::Content* temp = advice_;
  advice_ = NULL;
  return temp;
}
void ProductContent::set_allocated_advice(::Content* advice) {
  delete advice_;
  advice_ = advice;
  if (advice) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:ProductContent.advice)
}

#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// @@protoc_insertion_point(namespace_scope)

// @@protoc_insertion_point(global_scope)
