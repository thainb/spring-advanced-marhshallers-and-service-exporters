// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crm.proto

package org.springframework.obm.protocolbuffers.crm;

public final class Crm {
  private Crm() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class Customer extends
      com.google.protobuf.GeneratedMessage {
    // Use Customer.newBuilder() to construct.
    private Customer() {
      initFields();
    }
    private Customer(boolean noInit) {}
    
    private static final Customer defaultInstance;
    public static Customer getDefaultInstance() {
      return defaultInstance;
    }
    
    public Customer getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.springframework.obm.protocolbuffers.crm.Crm.internal_static_crm_Customer_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.springframework.obm.protocolbuffers.crm.Crm.internal_static_crm_Customer_fieldAccessorTable;
    }
    
    // required string firstName = 1;
    public static final int FIRSTNAME_FIELD_NUMBER = 1;
    private boolean hasFirstName;
    private java.lang.String firstName_ = "";
    public boolean hasFirstName() { return hasFirstName; }
    public java.lang.String getFirstName() { return firstName_; }
    
    // required string lastName = 2;
    public static final int LASTNAME_FIELD_NUMBER = 2;
    private boolean hasLastName;
    private java.lang.String lastName_ = "";
    public boolean hasLastName() { return hasLastName; }
    public java.lang.String getLastName() { return lastName_; }
    
    // required string email = 3;
    public static final int EMAIL_FIELD_NUMBER = 3;
    private boolean hasEmail;
    private java.lang.String email_ = "";
    public boolean hasEmail() { return hasEmail; }
    public java.lang.String getEmail() { return email_; }
    
    // optional int64 id = 4;
    public static final int ID_FIELD_NUMBER = 4;
    private boolean hasId;
    private long id_ = 0L;
    public boolean hasId() { return hasId; }
    public long getId() { return id_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasFirstName) return false;
      if (!hasLastName) return false;
      if (!hasEmail) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasFirstName()) {
        output.writeString(1, getFirstName());
      }
      if (hasLastName()) {
        output.writeString(2, getLastName());
      }
      if (hasEmail()) {
        output.writeString(3, getEmail());
      }
      if (hasId()) {
        output.writeInt64(4, getId());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasFirstName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getFirstName());
      }
      if (hasLastName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getLastName());
      }
      if (hasEmail()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getEmail());
      }
      if (hasId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, getId());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static org.springframework.obm.protocolbuffers.crm.Crm.Customer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.springframework.obm.protocolbuffers.crm.Crm.Customer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.springframework.obm.protocolbuffers.crm.Crm.Customer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.springframework.obm.protocolbuffers.crm.Crm.Customer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.springframework.obm.protocolbuffers.crm.Crm.Customer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.springframework.obm.protocolbuffers.crm.Crm.Customer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.springframework.obm.protocolbuffers.crm.Crm.Customer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.springframework.obm.protocolbuffers.crm.Crm.Customer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.springframework.obm.protocolbuffers.crm.Crm.Customer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.springframework.obm.protocolbuffers.crm.Crm.Customer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.springframework.obm.protocolbuffers.crm.Crm.Customer prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private org.springframework.obm.protocolbuffers.crm.Crm.Customer result;
      
      // Construct using org.springframework.obm.protocolbuffers.crm.Crm.Customer.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new org.springframework.obm.protocolbuffers.crm.Crm.Customer();
        return builder;
      }
      
      protected org.springframework.obm.protocolbuffers.crm.Crm.Customer internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new org.springframework.obm.protocolbuffers.crm.Crm.Customer();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.springframework.obm.protocolbuffers.crm.Crm.Customer.getDescriptor();
      }
      
      public org.springframework.obm.protocolbuffers.crm.Crm.Customer getDefaultInstanceForType() {
        return org.springframework.obm.protocolbuffers.crm.Crm.Customer.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public org.springframework.obm.protocolbuffers.crm.Crm.Customer build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private org.springframework.obm.protocolbuffers.crm.Crm.Customer buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public org.springframework.obm.protocolbuffers.crm.Crm.Customer buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        org.springframework.obm.protocolbuffers.crm.Crm.Customer returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.springframework.obm.protocolbuffers.crm.Crm.Customer) {
          return mergeFrom((org.springframework.obm.protocolbuffers.crm.Crm.Customer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.springframework.obm.protocolbuffers.crm.Crm.Customer other) {
        if (other == org.springframework.obm.protocolbuffers.crm.Crm.Customer.getDefaultInstance()) return this;
        if (other.hasFirstName()) {
          setFirstName(other.getFirstName());
        }
        if (other.hasLastName()) {
          setLastName(other.getLastName());
        }
        if (other.hasEmail()) {
          setEmail(other.getEmail());
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setFirstName(input.readString());
              break;
            }
            case 18: {
              setLastName(input.readString());
              break;
            }
            case 26: {
              setEmail(input.readString());
              break;
            }
            case 32: {
              setId(input.readInt64());
              break;
            }
          }
        }
      }
      
      
      // required string firstName = 1;
      public boolean hasFirstName() {
        return result.hasFirstName();
      }
      public java.lang.String getFirstName() {
        return result.getFirstName();
      }
      public Builder setFirstName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasFirstName = true;
        result.firstName_ = value;
        return this;
      }
      public Builder clearFirstName() {
        result.hasFirstName = false;
        result.firstName_ = getDefaultInstance().getFirstName();
        return this;
      }
      
      // required string lastName = 2;
      public boolean hasLastName() {
        return result.hasLastName();
      }
      public java.lang.String getLastName() {
        return result.getLastName();
      }
      public Builder setLastName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasLastName = true;
        result.lastName_ = value;
        return this;
      }
      public Builder clearLastName() {
        result.hasLastName = false;
        result.lastName_ = getDefaultInstance().getLastName();
        return this;
      }
      
      // required string email = 3;
      public boolean hasEmail() {
        return result.hasEmail();
      }
      public java.lang.String getEmail() {
        return result.getEmail();
      }
      public Builder setEmail(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasEmail = true;
        result.email_ = value;
        return this;
      }
      public Builder clearEmail() {
        result.hasEmail = false;
        result.email_ = getDefaultInstance().getEmail();
        return this;
      }
      
      // optional int64 id = 4;
      public boolean hasId() {
        return result.hasId();
      }
      public long getId() {
        return result.getId();
      }
      public Builder setId(long value) {
        result.hasId = true;
        result.id_ = value;
        return this;
      }
      public Builder clearId() {
        result.hasId = false;
        result.id_ = 0L;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:crm.Customer)
    }
    
    static {
      defaultInstance = new Customer(true);
      org.springframework.obm.protocolbuffers.crm.Crm.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:crm.Customer)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_crm_Customer_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_crm_Customer_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tcrm.proto\022\003crm\"J\n\010Customer\022\021\n\tfirstNam" +
      "e\030\001 \002(\t\022\020\n\010lastName\030\002 \002(\t\022\r\n\005email\030\003 \002(\t" +
      "\022\n\n\002id\030\004 \001(\003B4\n+org.springframework.obm." +
      "protocolbuffers.crmB\003CrmH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_crm_Customer_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_crm_Customer_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_crm_Customer_descriptor,
              new java.lang.String[] { "FirstName", "LastName", "Email", "Id", },
              org.springframework.obm.protocolbuffers.crm.Crm.Customer.class,
              org.springframework.obm.protocolbuffers.crm.Crm.Customer.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
