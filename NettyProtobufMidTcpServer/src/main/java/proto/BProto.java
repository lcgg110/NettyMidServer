// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BProto.proto

package proto;

public final class BProto {
  private BProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetCFromCReq_2001OrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 a = 1;
    /**
     * <code>optional int32 a = 1;</code>
     */
    boolean hasA();
    /**
     * <code>optional int32 a = 1;</code>
     */
    int getA();
  }
  /**
   * Protobuf type {@code protoFiles.GetCFromCReq_2001}
   *
   * <pre>
   *请求登录
   * </pre>
   */
  public static final class GetCFromCReq_2001 extends
      com.google.protobuf.GeneratedMessage
      implements GetCFromCReq_2001OrBuilder {
    // Use GetCFromCReq_2001.newBuilder() to construct.
    private GetCFromCReq_2001(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetCFromCReq_2001(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetCFromCReq_2001 defaultInstance;
    public static GetCFromCReq_2001 getDefaultInstance() {
      return defaultInstance;
    }

    public GetCFromCReq_2001 getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetCFromCReq_2001(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              a_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.BProto.internal_static_protoFiles_GetCFromCReq_2001_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.BProto.internal_static_protoFiles_GetCFromCReq_2001_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.BProto.GetCFromCReq_2001.class, proto.BProto.GetCFromCReq_2001.Builder.class);
    }

    public static com.google.protobuf.Parser<GetCFromCReq_2001> PARSER =
        new com.google.protobuf.AbstractParser<GetCFromCReq_2001>() {
      public GetCFromCReq_2001 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetCFromCReq_2001(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetCFromCReq_2001> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 a = 1;
    public static final int A_FIELD_NUMBER = 1;
    private int a_;
    /**
     * <code>optional int32 a = 1;</code>
     */
    public boolean hasA() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 a = 1;</code>
     */
    public int getA() {
      return a_;
    }

    private void initFields() {
      a_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, a_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, a_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static proto.BProto.GetCFromCReq_2001 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.BProto.GetCFromCReq_2001 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.BProto.GetCFromCReq_2001 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.BProto.GetCFromCReq_2001 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.BProto.GetCFromCReq_2001 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static proto.BProto.GetCFromCReq_2001 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static proto.BProto.GetCFromCReq_2001 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static proto.BProto.GetCFromCReq_2001 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static proto.BProto.GetCFromCReq_2001 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static proto.BProto.GetCFromCReq_2001 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(proto.BProto.GetCFromCReq_2001 prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protoFiles.GetCFromCReq_2001}
     *
     * <pre>
     *请求登录
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements proto.BProto.GetCFromCReq_2001OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return proto.BProto.internal_static_protoFiles_GetCFromCReq_2001_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return proto.BProto.internal_static_protoFiles_GetCFromCReq_2001_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                proto.BProto.GetCFromCReq_2001.class, proto.BProto.GetCFromCReq_2001.Builder.class);
      }

      // Construct using proto.BProto.GetCFromCReq_2001.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        a_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return proto.BProto.internal_static_protoFiles_GetCFromCReq_2001_descriptor;
      }

      public proto.BProto.GetCFromCReq_2001 getDefaultInstanceForType() {
        return proto.BProto.GetCFromCReq_2001.getDefaultInstance();
      }

      public proto.BProto.GetCFromCReq_2001 build() {
        proto.BProto.GetCFromCReq_2001 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public proto.BProto.GetCFromCReq_2001 buildPartial() {
        proto.BProto.GetCFromCReq_2001 result = new proto.BProto.GetCFromCReq_2001(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.a_ = a_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof proto.BProto.GetCFromCReq_2001) {
          return mergeFrom((proto.BProto.GetCFromCReq_2001)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(proto.BProto.GetCFromCReq_2001 other) {
        if (other == proto.BProto.GetCFromCReq_2001.getDefaultInstance()) return this;
        if (other.hasA()) {
          setA(other.getA());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        proto.BProto.GetCFromCReq_2001 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (proto.BProto.GetCFromCReq_2001) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 a = 1;
      private int a_ ;
      /**
       * <code>optional int32 a = 1;</code>
       */
      public boolean hasA() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 a = 1;</code>
       */
      public int getA() {
        return a_;
      }
      /**
       * <code>optional int32 a = 1;</code>
       */
      public Builder setA(int value) {
        bitField0_ |= 0x00000001;
        a_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 a = 1;</code>
       */
      public Builder clearA() {
        bitField0_ = (bitField0_ & ~0x00000001);
        a_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protoFiles.GetCFromCReq_2001)
    }

    static {
      defaultInstance = new GetCFromCReq_2001(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protoFiles.GetCFromCReq_2001)
  }

  public interface GetCFromCResp_2001OrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 c = 1;
    /**
     * <code>optional int32 c = 1;</code>
     */
    boolean hasC();
    /**
     * <code>optional int32 c = 1;</code>
     */
    int getC();
  }
  /**
   * Protobuf type {@code protoFiles.GetCFromCResp_2001}
   */
  public static final class GetCFromCResp_2001 extends
      com.google.protobuf.GeneratedMessage
      implements GetCFromCResp_2001OrBuilder {
    // Use GetCFromCResp_2001.newBuilder() to construct.
    private GetCFromCResp_2001(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetCFromCResp_2001(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetCFromCResp_2001 defaultInstance;
    public static GetCFromCResp_2001 getDefaultInstance() {
      return defaultInstance;
    }

    public GetCFromCResp_2001 getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetCFromCResp_2001(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              c_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.BProto.internal_static_protoFiles_GetCFromCResp_2001_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.BProto.internal_static_protoFiles_GetCFromCResp_2001_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.BProto.GetCFromCResp_2001.class, proto.BProto.GetCFromCResp_2001.Builder.class);
    }

    public static com.google.protobuf.Parser<GetCFromCResp_2001> PARSER =
        new com.google.protobuf.AbstractParser<GetCFromCResp_2001>() {
      public GetCFromCResp_2001 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetCFromCResp_2001(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetCFromCResp_2001> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 c = 1;
    public static final int C_FIELD_NUMBER = 1;
    private int c_;
    /**
     * <code>optional int32 c = 1;</code>
     */
    public boolean hasC() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 c = 1;</code>
     */
    public int getC() {
      return c_;
    }

    private void initFields() {
      c_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, c_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, c_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static proto.BProto.GetCFromCResp_2001 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.BProto.GetCFromCResp_2001 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.BProto.GetCFromCResp_2001 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.BProto.GetCFromCResp_2001 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.BProto.GetCFromCResp_2001 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static proto.BProto.GetCFromCResp_2001 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static proto.BProto.GetCFromCResp_2001 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static proto.BProto.GetCFromCResp_2001 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static proto.BProto.GetCFromCResp_2001 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static proto.BProto.GetCFromCResp_2001 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(proto.BProto.GetCFromCResp_2001 prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protoFiles.GetCFromCResp_2001}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements proto.BProto.GetCFromCResp_2001OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return proto.BProto.internal_static_protoFiles_GetCFromCResp_2001_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return proto.BProto.internal_static_protoFiles_GetCFromCResp_2001_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                proto.BProto.GetCFromCResp_2001.class, proto.BProto.GetCFromCResp_2001.Builder.class);
      }

      // Construct using proto.BProto.GetCFromCResp_2001.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        c_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return proto.BProto.internal_static_protoFiles_GetCFromCResp_2001_descriptor;
      }

      public proto.BProto.GetCFromCResp_2001 getDefaultInstanceForType() {
        return proto.BProto.GetCFromCResp_2001.getDefaultInstance();
      }

      public proto.BProto.GetCFromCResp_2001 build() {
        proto.BProto.GetCFromCResp_2001 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public proto.BProto.GetCFromCResp_2001 buildPartial() {
        proto.BProto.GetCFromCResp_2001 result = new proto.BProto.GetCFromCResp_2001(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.c_ = c_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof proto.BProto.GetCFromCResp_2001) {
          return mergeFrom((proto.BProto.GetCFromCResp_2001)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(proto.BProto.GetCFromCResp_2001 other) {
        if (other == proto.BProto.GetCFromCResp_2001.getDefaultInstance()) return this;
        if (other.hasC()) {
          setC(other.getC());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        proto.BProto.GetCFromCResp_2001 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (proto.BProto.GetCFromCResp_2001) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 c = 1;
      private int c_ ;
      /**
       * <code>optional int32 c = 1;</code>
       */
      public boolean hasC() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 c = 1;</code>
       */
      public int getC() {
        return c_;
      }
      /**
       * <code>optional int32 c = 1;</code>
       */
      public Builder setC(int value) {
        bitField0_ |= 0x00000001;
        c_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 c = 1;</code>
       */
      public Builder clearC() {
        bitField0_ = (bitField0_ & ~0x00000001);
        c_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protoFiles.GetCFromCResp_2001)
    }

    static {
      defaultInstance = new GetCFromCResp_2001(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protoFiles.GetCFromCResp_2001)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protoFiles_GetCFromCReq_2001_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protoFiles_GetCFromCReq_2001_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protoFiles_GetCFromCResp_2001_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protoFiles_GetCFromCResp_2001_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014BProto.proto\022\nprotoFiles\"\036\n\021GetCFromCR" +
      "eq_2001\022\t\n\001a\030\001 \001(\005\"\037\n\022GetCFromCResp_2001" +
      "\022\t\n\001c\030\001 \001(\005B\017\n\005protoB\006BProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_protoFiles_GetCFromCReq_2001_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_protoFiles_GetCFromCReq_2001_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protoFiles_GetCFromCReq_2001_descriptor,
              new java.lang.String[] { "A", });
          internal_static_protoFiles_GetCFromCResp_2001_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_protoFiles_GetCFromCResp_2001_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protoFiles_GetCFromCResp_2001_descriptor,
              new java.lang.String[] { "C", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
