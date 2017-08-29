// Code generated by protoc-gen-go. DO NOT EDIT.
// source: geo/Address.proto

package schema

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

type Address struct {
	FirstLine  string `protobuf:"bytes,1,opt,name=first_line,json=firstLine" json:"first_line,omitempty"`
	SecondLine string `protobuf:"bytes,2,opt,name=second_line,json=secondLine" json:"second_line,omitempty"`
	City       string `protobuf:"bytes,3,opt,name=city" json:"city,omitempty"`
	State      string `protobuf:"bytes,4,opt,name=state" json:"state,omitempty"`
	Zipcode    string `protobuf:"bytes,5,opt,name=zipcode" json:"zipcode,omitempty"`
	Country    string `protobuf:"bytes,6,opt,name=country" json:"country,omitempty"`
}

func (m *Address) Reset()                    { *m = Address{} }
func (m *Address) String() string            { return proto.CompactTextString(m) }
func (*Address) ProtoMessage()               {}
func (*Address) Descriptor() ([]byte, []int) { return fileDescriptor11, []int{0} }

func (m *Address) GetFirstLine() string {
	if m != nil {
		return m.FirstLine
	}
	return ""
}

func (m *Address) GetSecondLine() string {
	if m != nil {
		return m.SecondLine
	}
	return ""
}

func (m *Address) GetCity() string {
	if m != nil {
		return m.City
	}
	return ""
}

func (m *Address) GetState() string {
	if m != nil {
		return m.State
	}
	return ""
}

func (m *Address) GetZipcode() string {
	if m != nil {
		return m.Zipcode
	}
	return ""
}

func (m *Address) GetCountry() string {
	if m != nil {
		return m.Country
	}
	return ""
}

func init() {
	proto.RegisterType((*Address)(nil), "Address")
}

func init() { proto.RegisterFile("geo/Address.proto", fileDescriptor11) }

var fileDescriptor11 = []byte{
	// 190 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x34, 0x8f, 0xbf, 0x4e, 0xc3, 0x30,
	0x10, 0x87, 0x65, 0xc8, 0x1f, 0xe5, 0x98, 0xb0, 0x10, 0xf2, 0x00, 0x02, 0x31, 0x31, 0x99, 0x81,
	0x27, 0x80, 0xa9, 0x43, 0x87, 0xaa, 0x2f, 0x50, 0x25, 0xf6, 0x35, 0xb5, 0x94, 0xf8, 0x22, 0xdb,
	0x95, 0x9a, 0xbe, 0x50, 0x5f, 0xb3, 0xea, 0x39, 0xdd, 0xee, 0xfb, 0xbe, 0x5b, 0x7e, 0xf0, 0xdc,
	0x23, 0xfd, 0xfc, 0x59, 0x1b, 0x30, 0x46, 0x3d, 0x05, 0x4a, 0xf4, 0x75, 0x11, 0x50, 0x2f, 0x46,
	0xbe, 0x03, 0xec, 0x5d, 0x88, 0x69, 0x37, 0x38, 0x8f, 0x4a, 0x7c, 0x8a, 0xef, 0x66, 0xdb, 0xb0,
	0x59, 0x3b, 0x8f, 0xf2, 0x03, 0x9e, 0x22, 0x1a, 0xf2, 0x36, 0xf7, 0x07, 0xee, 0x90, 0x15, 0x3f,
	0x48, 0x28, 0x8c, 0x4b, 0xb3, 0x7a, 0xe4, 0xc2, 0xb7, 0x7c, 0x81, 0x32, 0xa6, 0x36, 0xa1, 0x2a,
	0x58, 0x66, 0x90, 0x0a, 0xea, 0xb3, 0x9b, 0x0c, 0x59, 0x54, 0x25, 0xfb, 0x3b, 0xde, 0x8a, 0xa1,
	0xa3, 0x4f, 0x61, 0x56, 0x55, 0x2e, 0x0b, 0xfe, 0xbf, 0xc1, 0xab, 0x23, 0xdd, 0x0d, 0x44, 0x63,
	0x47, 0x27, 0x1d, 0xcd, 0x01, 0xc7, 0x56, 0xf7, 0x48, 0x2b, 0xb1, 0x11, 0x5d, 0xc5, 0x73, 0x7e,
	0xaf, 0x01, 0x00, 0x00, 0xff, 0xff, 0x9d, 0xc3, 0x6f, 0x10, 0xe3, 0x00, 0x00, 0x00,
}