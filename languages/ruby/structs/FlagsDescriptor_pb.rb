# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: structs/FlagsDescriptor.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "ProductFlagValue" do
    optional :type, :enum, 1, "ProductFlag"
    optional :value, :bool, 2
  end
  add_message "ProductFlagset" do
    repeated :flags, :message, 1, "ProductFlagValue"
  end
  add_message "FlagsDescriptor" do
    optional :visible, :bool, 1
    optional :premium, :bool, 2
    optional :featured, :bool, 3
    optional :lastchance, :bool, 4
    optional :inhouse, :bool, 5
  end
  add_enum "ProductFlag" do
    value :VISIBLE, 0
    value :PREMIUM, 1
    value :FEATURED, 2
    value :LASTCHANCE, 3
    value :INHOUSE, 4
  end
end

ProductFlagValue = Google::Protobuf::DescriptorPool.generated_pool.lookup("ProductFlagValue").msgclass
ProductFlagset = Google::Protobuf::DescriptorPool.generated_pool.lookup("ProductFlagset").msgclass
FlagsDescriptor = Google::Protobuf::DescriptorPool.generated_pool.lookup("FlagsDescriptor").msgclass
ProductFlag = Google::Protobuf::DescriptorPool.generated_pool.lookup("ProductFlag").enummodule
