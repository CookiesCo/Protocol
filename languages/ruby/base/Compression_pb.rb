# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: base/Compression.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "Compression" do
    optional :enabled, :bool, 1
    optional :type, :enum, 2, "Compression.Type"
  end
  add_enum "Compression.Type" do
    value :GZIP, 0
  end
end

Compression = Google::Protobuf::DescriptorPool.generated_pool.lookup("Compression").msgclass
Compression::Type = Google::Protobuf::DescriptorPool.generated_pool.lookup("Compression.Type").enummodule
