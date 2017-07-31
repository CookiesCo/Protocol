// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: content/ProductContent.proto

#ifndef PROTOBUF_content_2fProductContent_2eproto__INCLUDED
#define PROTOBUF_content_2fProductContent_2eproto__INCLUDED

#include <string>

#include <google/protobuf/stubs/common.h>

#if GOOGLE_PROTOBUF_VERSION < 3003000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please update
#error your headers.
#endif
#if 3003002 < GOOGLE_PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/arena.h>
#include <google/protobuf/arenastring.h>
#include <google/protobuf/generated_message_table_driven.h>
#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/metadata.h>
#include <google/protobuf/message.h>
#include <google/protobuf/repeated_field.h>  // IWYU pragma: export
#include <google/protobuf/extension_set.h>  // IWYU pragma: export
#include <google/protobuf/unknown_field_set.h>
#include "content/Name.pb.h"
#include "content/Brand.pb.h"
#include "content/Content.pb.h"
#include "media/MediaItem.pb.h"
// @@protoc_insertion_point(includes)
class Brand;
class BrandDefaultTypeInternal;
extern BrandDefaultTypeInternal _Brand_default_instance_;
class Content;
class ContentDefaultTypeInternal;
extern ContentDefaultTypeInternal _Content_default_instance_;
class MediaItem;
class MediaItemDefaultTypeInternal;
extern MediaItemDefaultTypeInternal _MediaItem_default_instance_;
class Name;
class NameDefaultTypeInternal;
extern NameDefaultTypeInternal _Name_default_instance_;
class ProductContent;
class ProductContentDefaultTypeInternal;
extern ProductContentDefaultTypeInternal _ProductContent_default_instance_;

namespace protobuf_content_2fProductContent_2eproto {
// Internal implementation detail -- do not call these.
struct TableStruct {
  static const ::google::protobuf::internal::ParseTableField entries[];
  static const ::google::protobuf::internal::AuxillaryParseTableField aux[];
  static const ::google::protobuf::internal::ParseTable schema[];
  static const ::google::protobuf::uint32 offsets[];
  static void InitDefaultsImpl();
  static void Shutdown();
};
void AddDescriptors();
void InitDefaults();
}  // namespace protobuf_content_2fProductContent_2eproto

// ===================================================================

class ProductContent : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:ProductContent) */ {
 public:
  ProductContent();
  virtual ~ProductContent();

  ProductContent(const ProductContent& from);

  inline ProductContent& operator=(const ProductContent& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const ProductContent& default_instance();

  static inline const ProductContent* internal_default_instance() {
    return reinterpret_cast<const ProductContent*>(
               &_ProductContent_default_instance_);
  }
  static PROTOBUF_CONSTEXPR int const kIndexInFileMessages =
    0;

  void Swap(ProductContent* other);

  // implements Message ----------------------------------------------

  inline ProductContent* New() const PROTOBUF_FINAL { return New(NULL); }

  ProductContent* New(::google::protobuf::Arena* arena) const PROTOBUF_FINAL;
  void CopyFrom(const ::google::protobuf::Message& from) PROTOBUF_FINAL;
  void MergeFrom(const ::google::protobuf::Message& from) PROTOBUF_FINAL;
  void CopyFrom(const ProductContent& from);
  void MergeFrom(const ProductContent& from);
  void Clear() PROTOBUF_FINAL;
  bool IsInitialized() const PROTOBUF_FINAL;

  size_t ByteSizeLong() const PROTOBUF_FINAL;
  bool MergePartialFromCodedStream(
      ::google::protobuf::io::CodedInputStream* input) PROTOBUF_FINAL;
  void SerializeWithCachedSizes(
      ::google::protobuf::io::CodedOutputStream* output) const PROTOBUF_FINAL;
  ::google::protobuf::uint8* InternalSerializeWithCachedSizesToArray(
      bool deterministic, ::google::protobuf::uint8* target) const PROTOBUF_FINAL;
  int GetCachedSize() const PROTOBUF_FINAL { return _cached_size_; }
  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const PROTOBUF_FINAL;
  void InternalSwap(ProductContent* other);
  private:
  inline ::google::protobuf::Arena* GetArenaNoVirtual() const {
    return NULL;
  }
  inline void* MaybeArenaPtr() const {
    return NULL;
  }
  public:

  ::google::protobuf::Metadata GetMetadata() const PROTOBUF_FINAL;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated .MediaItem media = 20;
  int media_size() const;
  void clear_media();
  static const int kMediaFieldNumber = 20;
  const ::MediaItem& media(int index) const;
  ::MediaItem* mutable_media(int index);
  ::MediaItem* add_media();
  ::google::protobuf::RepeatedPtrField< ::MediaItem >*
      mutable_media();
  const ::google::protobuf::RepeatedPtrField< ::MediaItem >&
      media() const;

  // .Name name = 1;
  bool has_name() const;
  void clear_name();
  static const int kNameFieldNumber = 1;
  const ::Name& name() const;
  ::Name* mutable_name();
  ::Name* release_name();
  void set_allocated_name(::Name* name);

  // .Content summary = 2;
  bool has_summary() const;
  void clear_summary();
  static const int kSummaryFieldNumber = 2;
  const ::Content& summary() const;
  ::Content* mutable_summary();
  ::Content* release_summary();
  void set_allocated_summary(::Content* summary);

  // .Brand brand = 3;
  bool has_brand() const;
  void clear_brand();
  static const int kBrandFieldNumber = 3;
  const ::Brand& brand() const;
  ::Brand* mutable_brand();
  ::Brand* release_brand();
  void set_allocated_brand(::Brand* brand);

  // .Content usage = 30;
  bool has_usage() const;
  void clear_usage();
  static const int kUsageFieldNumber = 30;
  const ::Content& usage() const;
  ::Content* mutable_usage();
  ::Content* release_usage();
  void set_allocated_usage(::Content* usage);

  // .Content dosage = 31;
  bool has_dosage() const;
  void clear_dosage();
  static const int kDosageFieldNumber = 31;
  const ::Content& dosage() const;
  ::Content* mutable_dosage();
  ::Content* release_dosage();
  void set_allocated_dosage(::Content* dosage);

  // .Content advice = 32;
  bool has_advice() const;
  void clear_advice();
  static const int kAdviceFieldNumber = 32;
  const ::Content& advice() const;
  ::Content* mutable_advice();
  ::Content* release_advice();
  void set_allocated_advice(::Content* advice);

  // @@protoc_insertion_point(class_scope:ProductContent)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::RepeatedPtrField< ::MediaItem > media_;
  ::Name* name_;
  ::Content* summary_;
  ::Brand* brand_;
  ::Content* usage_;
  ::Content* dosage_;
  ::Content* advice_;
  mutable int _cached_size_;
  friend struct protobuf_content_2fProductContent_2eproto::TableStruct;
};
// ===================================================================


// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
// ProductContent

// .Name name = 1;
inline bool ProductContent::has_name() const {
  return this != internal_default_instance() && name_ != NULL;
}
inline void ProductContent::clear_name() {
  if (GetArenaNoVirtual() == NULL && name_ != NULL) delete name_;
  name_ = NULL;
}
inline const ::Name& ProductContent::name() const {
  // @@protoc_insertion_point(field_get:ProductContent.name)
  return name_ != NULL ? *name_
                         : *::Name::internal_default_instance();
}
inline ::Name* ProductContent::mutable_name() {
  
  if (name_ == NULL) {
    name_ = new ::Name;
  }
  // @@protoc_insertion_point(field_mutable:ProductContent.name)
  return name_;
}
inline ::Name* ProductContent::release_name() {
  // @@protoc_insertion_point(field_release:ProductContent.name)
  
  ::Name* temp = name_;
  name_ = NULL;
  return temp;
}
inline void ProductContent::set_allocated_name(::Name* name) {
  delete name_;
  name_ = name;
  if (name) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:ProductContent.name)
}

// .Content summary = 2;
inline bool ProductContent::has_summary() const {
  return this != internal_default_instance() && summary_ != NULL;
}
inline void ProductContent::clear_summary() {
  if (GetArenaNoVirtual() == NULL && summary_ != NULL) delete summary_;
  summary_ = NULL;
}
inline const ::Content& ProductContent::summary() const {
  // @@protoc_insertion_point(field_get:ProductContent.summary)
  return summary_ != NULL ? *summary_
                         : *::Content::internal_default_instance();
}
inline ::Content* ProductContent::mutable_summary() {
  
  if (summary_ == NULL) {
    summary_ = new ::Content;
  }
  // @@protoc_insertion_point(field_mutable:ProductContent.summary)
  return summary_;
}
inline ::Content* ProductContent::release_summary() {
  // @@protoc_insertion_point(field_release:ProductContent.summary)
  
  ::Content* temp = summary_;
  summary_ = NULL;
  return temp;
}
inline void ProductContent::set_allocated_summary(::Content* summary) {
  delete summary_;
  summary_ = summary;
  if (summary) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:ProductContent.summary)
}

// .Brand brand = 3;
inline bool ProductContent::has_brand() const {
  return this != internal_default_instance() && brand_ != NULL;
}
inline void ProductContent::clear_brand() {
  if (GetArenaNoVirtual() == NULL && brand_ != NULL) delete brand_;
  brand_ = NULL;
}
inline const ::Brand& ProductContent::brand() const {
  // @@protoc_insertion_point(field_get:ProductContent.brand)
  return brand_ != NULL ? *brand_
                         : *::Brand::internal_default_instance();
}
inline ::Brand* ProductContent::mutable_brand() {
  
  if (brand_ == NULL) {
    brand_ = new ::Brand;
  }
  // @@protoc_insertion_point(field_mutable:ProductContent.brand)
  return brand_;
}
inline ::Brand* ProductContent::release_brand() {
  // @@protoc_insertion_point(field_release:ProductContent.brand)
  
  ::Brand* temp = brand_;
  brand_ = NULL;
  return temp;
}
inline void ProductContent::set_allocated_brand(::Brand* brand) {
  delete brand_;
  brand_ = brand;
  if (brand) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:ProductContent.brand)
}

// repeated .MediaItem media = 20;
inline int ProductContent::media_size() const {
  return media_.size();
}
inline void ProductContent::clear_media() {
  media_.Clear();
}
inline const ::MediaItem& ProductContent::media(int index) const {
  // @@protoc_insertion_point(field_get:ProductContent.media)
  return media_.Get(index);
}
inline ::MediaItem* ProductContent::mutable_media(int index) {
  // @@protoc_insertion_point(field_mutable:ProductContent.media)
  return media_.Mutable(index);
}
inline ::MediaItem* ProductContent::add_media() {
  // @@protoc_insertion_point(field_add:ProductContent.media)
  return media_.Add();
}
inline ::google::protobuf::RepeatedPtrField< ::MediaItem >*
ProductContent::mutable_media() {
  // @@protoc_insertion_point(field_mutable_list:ProductContent.media)
  return &media_;
}
inline const ::google::protobuf::RepeatedPtrField< ::MediaItem >&
ProductContent::media() const {
  // @@protoc_insertion_point(field_list:ProductContent.media)
  return media_;
}

// .Content usage = 30;
inline bool ProductContent::has_usage() const {
  return this != internal_default_instance() && usage_ != NULL;
}
inline void ProductContent::clear_usage() {
  if (GetArenaNoVirtual() == NULL && usage_ != NULL) delete usage_;
  usage_ = NULL;
}
inline const ::Content& ProductContent::usage() const {
  // @@protoc_insertion_point(field_get:ProductContent.usage)
  return usage_ != NULL ? *usage_
                         : *::Content::internal_default_instance();
}
inline ::Content* ProductContent::mutable_usage() {
  
  if (usage_ == NULL) {
    usage_ = new ::Content;
  }
  // @@protoc_insertion_point(field_mutable:ProductContent.usage)
  return usage_;
}
inline ::Content* ProductContent::release_usage() {
  // @@protoc_insertion_point(field_release:ProductContent.usage)
  
  ::Content* temp = usage_;
  usage_ = NULL;
  return temp;
}
inline void ProductContent::set_allocated_usage(::Content* usage) {
  delete usage_;
  usage_ = usage;
  if (usage) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:ProductContent.usage)
}

// .Content dosage = 31;
inline bool ProductContent::has_dosage() const {
  return this != internal_default_instance() && dosage_ != NULL;
}
inline void ProductContent::clear_dosage() {
  if (GetArenaNoVirtual() == NULL && dosage_ != NULL) delete dosage_;
  dosage_ = NULL;
}
inline const ::Content& ProductContent::dosage() const {
  // @@protoc_insertion_point(field_get:ProductContent.dosage)
  return dosage_ != NULL ? *dosage_
                         : *::Content::internal_default_instance();
}
inline ::Content* ProductContent::mutable_dosage() {
  
  if (dosage_ == NULL) {
    dosage_ = new ::Content;
  }
  // @@protoc_insertion_point(field_mutable:ProductContent.dosage)
  return dosage_;
}
inline ::Content* ProductContent::release_dosage() {
  // @@protoc_insertion_point(field_release:ProductContent.dosage)
  
  ::Content* temp = dosage_;
  dosage_ = NULL;
  return temp;
}
inline void ProductContent::set_allocated_dosage(::Content* dosage) {
  delete dosage_;
  dosage_ = dosage;
  if (dosage) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:ProductContent.dosage)
}

// .Content advice = 32;
inline bool ProductContent::has_advice() const {
  return this != internal_default_instance() && advice_ != NULL;
}
inline void ProductContent::clear_advice() {
  if (GetArenaNoVirtual() == NULL && advice_ != NULL) delete advice_;
  advice_ = NULL;
}
inline const ::Content& ProductContent::advice() const {
  // @@protoc_insertion_point(field_get:ProductContent.advice)
  return advice_ != NULL ? *advice_
                         : *::Content::internal_default_instance();
}
inline ::Content* ProductContent::mutable_advice() {
  
  if (advice_ == NULL) {
    advice_ = new ::Content;
  }
  // @@protoc_insertion_point(field_mutable:ProductContent.advice)
  return advice_;
}
inline ::Content* ProductContent::release_advice() {
  // @@protoc_insertion_point(field_release:ProductContent.advice)
  
  ::Content* temp = advice_;
  advice_ = NULL;
  return temp;
}
inline void ProductContent::set_allocated_advice(::Content* advice) {
  delete advice_;
  advice_ = advice;
  if (advice) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:ProductContent.advice)
}

#endif  // !PROTOBUF_INLINE_NOT_IN_HEADERS

// @@protoc_insertion_point(namespace_scope)


// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_content_2fProductContent_2eproto__INCLUDED
