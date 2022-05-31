// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: package.proto

package qhx.proto.weve.update;

public final class PackageOuterClass {
  private PackageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PackageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:qhx.proto.weve.update.Package)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
     * @return Whether the manifest field is set.
     */
    boolean hasManifest();
    /**
     * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
     * @return The manifest.
     */
    qhx.proto.weve.update.Manifest.PackageManifest getManifest();
    /**
     * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
     */
    qhx.proto.weve.update.Manifest.PackageManifestOrBuilder getManifestOrBuilder();

    /**
     * <code>repeated bytes entries = 2;</code>
     * @return A list containing the entries.
     */
    java.util.List<com.google.protobuf.ByteString> getEntriesList();
    /**
     * <code>repeated bytes entries = 2;</code>
     * @return The count of entries.
     */
    int getEntriesCount();
    /**
     * <code>repeated bytes entries = 2;</code>
     * @param index The index of the element to return.
     * @return The entries at the given index.
     */
    com.google.protobuf.ByteString getEntries(int index);
  }
  /**
   * Protobuf type {@code qhx.proto.weve.update.Package}
   */
  public static final class Package extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:qhx.proto.weve.update.Package)
      PackageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Package.newBuilder() to construct.
    private Package(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Package() {
      entries_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Package();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Package(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {
              qhx.proto.weve.update.Manifest.PackageManifest.Builder subBuilder = null;
              if (manifest_ != null) {
                subBuilder = manifest_.toBuilder();
              }
              manifest_ = input.readMessage(qhx.proto.weve.update.Manifest.PackageManifest.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(manifest_);
                manifest_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                entries_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000001;
              }
              entries_.add(input.readBytes());
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          entries_ = java.util.Collections.unmodifiableList(entries_); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return qhx.proto.weve.update.PackageOuterClass.internal_static_qhx_proto_weve_update_Package_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return qhx.proto.weve.update.PackageOuterClass.internal_static_qhx_proto_weve_update_Package_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              qhx.proto.weve.update.PackageOuterClass.Package.class, qhx.proto.weve.update.PackageOuterClass.Package.Builder.class);
    }

    public static final int MANIFEST_FIELD_NUMBER = 1;
    private qhx.proto.weve.update.Manifest.PackageManifest manifest_;
    /**
     * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
     * @return Whether the manifest field is set.
     */
    @java.lang.Override
    public boolean hasManifest() {
      return manifest_ != null;
    }
    /**
     * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
     * @return The manifest.
     */
    @java.lang.Override
    public qhx.proto.weve.update.Manifest.PackageManifest getManifest() {
      return manifest_ == null ? qhx.proto.weve.update.Manifest.PackageManifest.getDefaultInstance() : manifest_;
    }
    /**
     * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
     */
    @java.lang.Override
    public qhx.proto.weve.update.Manifest.PackageManifestOrBuilder getManifestOrBuilder() {
      return getManifest();
    }

    public static final int ENTRIES_FIELD_NUMBER = 2;
    private java.util.List<com.google.protobuf.ByteString> entries_;
    /**
     * <code>repeated bytes entries = 2;</code>
     * @return A list containing the entries.
     */
    @java.lang.Override
    public java.util.List<com.google.protobuf.ByteString>
        getEntriesList() {
      return entries_;
    }
    /**
     * <code>repeated bytes entries = 2;</code>
     * @return The count of entries.
     */
    public int getEntriesCount() {
      return entries_.size();
    }
    /**
     * <code>repeated bytes entries = 2;</code>
     * @param index The index of the element to return.
     * @return The entries at the given index.
     */
    public com.google.protobuf.ByteString getEntries(int index) {
      return entries_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (manifest_ != null) {
        output.writeMessage(1, getManifest());
      }
      for (int i = 0; i < entries_.size(); i++) {
        output.writeBytes(2, entries_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (manifest_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getManifest());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < entries_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(entries_.get(i));
        }
        size += dataSize;
        size += 1 * getEntriesList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof qhx.proto.weve.update.PackageOuterClass.Package)) {
        return super.equals(obj);
      }
      qhx.proto.weve.update.PackageOuterClass.Package other = (qhx.proto.weve.update.PackageOuterClass.Package) obj;

      if (hasManifest() != other.hasManifest()) return false;
      if (hasManifest()) {
        if (!getManifest()
            .equals(other.getManifest())) return false;
      }
      if (!getEntriesList()
          .equals(other.getEntriesList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasManifest()) {
        hash = (37 * hash) + MANIFEST_FIELD_NUMBER;
        hash = (53 * hash) + getManifest().hashCode();
      }
      if (getEntriesCount() > 0) {
        hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
        hash = (53 * hash) + getEntriesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static qhx.proto.weve.update.PackageOuterClass.Package parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static qhx.proto.weve.update.PackageOuterClass.Package parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static qhx.proto.weve.update.PackageOuterClass.Package parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static qhx.proto.weve.update.PackageOuterClass.Package parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static qhx.proto.weve.update.PackageOuterClass.Package parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static qhx.proto.weve.update.PackageOuterClass.Package parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static qhx.proto.weve.update.PackageOuterClass.Package parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static qhx.proto.weve.update.PackageOuterClass.Package parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static qhx.proto.weve.update.PackageOuterClass.Package parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static qhx.proto.weve.update.PackageOuterClass.Package parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static qhx.proto.weve.update.PackageOuterClass.Package parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static qhx.proto.weve.update.PackageOuterClass.Package parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(qhx.proto.weve.update.PackageOuterClass.Package prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code qhx.proto.weve.update.Package}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:qhx.proto.weve.update.Package)
        qhx.proto.weve.update.PackageOuterClass.PackageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return qhx.proto.weve.update.PackageOuterClass.internal_static_qhx_proto_weve_update_Package_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return qhx.proto.weve.update.PackageOuterClass.internal_static_qhx_proto_weve_update_Package_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                qhx.proto.weve.update.PackageOuterClass.Package.class, qhx.proto.weve.update.PackageOuterClass.Package.Builder.class);
      }

      // Construct using qhx.proto.weve.update.PackageOuterClass.Package.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (manifestBuilder_ == null) {
          manifest_ = null;
        } else {
          manifest_ = null;
          manifestBuilder_ = null;
        }
        entries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return qhx.proto.weve.update.PackageOuterClass.internal_static_qhx_proto_weve_update_Package_descriptor;
      }

      @java.lang.Override
      public qhx.proto.weve.update.PackageOuterClass.Package getDefaultInstanceForType() {
        return qhx.proto.weve.update.PackageOuterClass.Package.getDefaultInstance();
      }

      @java.lang.Override
      public qhx.proto.weve.update.PackageOuterClass.Package build() {
        qhx.proto.weve.update.PackageOuterClass.Package result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public qhx.proto.weve.update.PackageOuterClass.Package buildPartial() {
        qhx.proto.weve.update.PackageOuterClass.Package result = new qhx.proto.weve.update.PackageOuterClass.Package(this);
        int from_bitField0_ = bitField0_;
        if (manifestBuilder_ == null) {
          result.manifest_ = manifest_;
        } else {
          result.manifest_ = manifestBuilder_.build();
        }
        if (((bitField0_ & 0x00000001) != 0)) {
          entries_ = java.util.Collections.unmodifiableList(entries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entries_ = entries_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof qhx.proto.weve.update.PackageOuterClass.Package) {
          return mergeFrom((qhx.proto.weve.update.PackageOuterClass.Package)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(qhx.proto.weve.update.PackageOuterClass.Package other) {
        if (other == qhx.proto.weve.update.PackageOuterClass.Package.getDefaultInstance()) return this;
        if (other.hasManifest()) {
          mergeManifest(other.getManifest());
        }
        if (!other.entries_.isEmpty()) {
          if (entries_.isEmpty()) {
            entries_ = other.entries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntriesIsMutable();
            entries_.addAll(other.entries_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        qhx.proto.weve.update.PackageOuterClass.Package parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (qhx.proto.weve.update.PackageOuterClass.Package) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private qhx.proto.weve.update.Manifest.PackageManifest manifest_;
      private com.google.protobuf.SingleFieldBuilderV3<
          qhx.proto.weve.update.Manifest.PackageManifest, qhx.proto.weve.update.Manifest.PackageManifest.Builder, qhx.proto.weve.update.Manifest.PackageManifestOrBuilder> manifestBuilder_;
      /**
       * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
       * @return Whether the manifest field is set.
       */
      public boolean hasManifest() {
        return manifestBuilder_ != null || manifest_ != null;
      }
      /**
       * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
       * @return The manifest.
       */
      public qhx.proto.weve.update.Manifest.PackageManifest getManifest() {
        if (manifestBuilder_ == null) {
          return manifest_ == null ? qhx.proto.weve.update.Manifest.PackageManifest.getDefaultInstance() : manifest_;
        } else {
          return manifestBuilder_.getMessage();
        }
      }
      /**
       * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
       */
      public Builder setManifest(qhx.proto.weve.update.Manifest.PackageManifest value) {
        if (manifestBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          manifest_ = value;
          onChanged();
        } else {
          manifestBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
       */
      public Builder setManifest(
          qhx.proto.weve.update.Manifest.PackageManifest.Builder builderForValue) {
        if (manifestBuilder_ == null) {
          manifest_ = builderForValue.build();
          onChanged();
        } else {
          manifestBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
       */
      public Builder mergeManifest(qhx.proto.weve.update.Manifest.PackageManifest value) {
        if (manifestBuilder_ == null) {
          if (manifest_ != null) {
            manifest_ =
              qhx.proto.weve.update.Manifest.PackageManifest.newBuilder(manifest_).mergeFrom(value).buildPartial();
          } else {
            manifest_ = value;
          }
          onChanged();
        } else {
          manifestBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
       */
      public Builder clearManifest() {
        if (manifestBuilder_ == null) {
          manifest_ = null;
          onChanged();
        } else {
          manifest_ = null;
          manifestBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
       */
      public qhx.proto.weve.update.Manifest.PackageManifest.Builder getManifestBuilder() {
        
        onChanged();
        return getManifestFieldBuilder().getBuilder();
      }
      /**
       * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
       */
      public qhx.proto.weve.update.Manifest.PackageManifestOrBuilder getManifestOrBuilder() {
        if (manifestBuilder_ != null) {
          return manifestBuilder_.getMessageOrBuilder();
        } else {
          return manifest_ == null ?
              qhx.proto.weve.update.Manifest.PackageManifest.getDefaultInstance() : manifest_;
        }
      }
      /**
       * <code>.qhx.proto.weve.update.PackageManifest manifest = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          qhx.proto.weve.update.Manifest.PackageManifest, qhx.proto.weve.update.Manifest.PackageManifest.Builder, qhx.proto.weve.update.Manifest.PackageManifestOrBuilder> 
          getManifestFieldBuilder() {
        if (manifestBuilder_ == null) {
          manifestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              qhx.proto.weve.update.Manifest.PackageManifest, qhx.proto.weve.update.Manifest.PackageManifest.Builder, qhx.proto.weve.update.Manifest.PackageManifestOrBuilder>(
                  getManifest(),
                  getParentForChildren(),
                  isClean());
          manifest_ = null;
        }
        return manifestBuilder_;
      }

      private java.util.List<com.google.protobuf.ByteString> entries_ = java.util.Collections.emptyList();
      private void ensureEntriesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entries_ = new java.util.ArrayList<com.google.protobuf.ByteString>(entries_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated bytes entries = 2;</code>
       * @return A list containing the entries.
       */
      public java.util.List<com.google.protobuf.ByteString>
          getEntriesList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(entries_) : entries_;
      }
      /**
       * <code>repeated bytes entries = 2;</code>
       * @return The count of entries.
       */
      public int getEntriesCount() {
        return entries_.size();
      }
      /**
       * <code>repeated bytes entries = 2;</code>
       * @param index The index of the element to return.
       * @return The entries at the given index.
       */
      public com.google.protobuf.ByteString getEntries(int index) {
        return entries_.get(index);
      }
      /**
       * <code>repeated bytes entries = 2;</code>
       * @param index The index to set the value at.
       * @param value The entries to set.
       * @return This builder for chaining.
       */
      public Builder setEntries(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureEntriesIsMutable();
        entries_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes entries = 2;</code>
       * @param value The entries to add.
       * @return This builder for chaining.
       */
      public Builder addEntries(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureEntriesIsMutable();
        entries_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes entries = 2;</code>
       * @param values The entries to add.
       * @return This builder for chaining.
       */
      public Builder addAllEntries(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureEntriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entries_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes entries = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntries() {
        entries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:qhx.proto.weve.update.Package)
    }

    // @@protoc_insertion_point(class_scope:qhx.proto.weve.update.Package)
    private static final qhx.proto.weve.update.PackageOuterClass.Package DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new qhx.proto.weve.update.PackageOuterClass.Package();
    }

    public static qhx.proto.weve.update.PackageOuterClass.Package getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Package>
        PARSER = new com.google.protobuf.AbstractParser<Package>() {
      @java.lang.Override
      public Package parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Package(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Package> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Package> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public qhx.proto.weve.update.PackageOuterClass.Package getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_update_Package_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_update_Package_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rpackage.proto\022\025qhx.proto.weve.update\032\016" +
      "manifest.proto\"T\n\007Package\0228\n\010manifest\030\001 " +
      "\001(\0132&.qhx.proto.weve.update.PackageManif" +
      "est\022\017\n\007entries\030\002 \003(\014b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          qhx.proto.weve.update.Manifest.getDescriptor(),
        });
    internal_static_qhx_proto_weve_update_Package_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_qhx_proto_weve_update_Package_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_update_Package_descriptor,
        new java.lang.String[] { "Manifest", "Entries", });
    qhx.proto.weve.update.Manifest.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
