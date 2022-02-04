/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.kmc.shemaRegistry;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class GoogleProducer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5978296490569194547L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GoogleProducer\",\"namespace\":\"com.kmc.shemaRegistry\",\"fields\":[{\"name\":\"username\",\"type\":\"string\"},{\"name\":\"mobileno\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GoogleProducer> ENCODER =
      new BinaryMessageEncoder<GoogleProducer>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GoogleProducer> DECODER =
      new BinaryMessageDecoder<GoogleProducer>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GoogleProducer> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GoogleProducer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GoogleProducer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GoogleProducer>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GoogleProducer to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GoogleProducer from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GoogleProducer instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GoogleProducer fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence username;
  private java.lang.CharSequence mobileno;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GoogleProducer() {}

  /**
   * All-args constructor.
   * @param username The new value for username
   * @param mobileno The new value for mobileno
   */
  public GoogleProducer(java.lang.CharSequence username, java.lang.CharSequence mobileno) {
    this.username = username;
    this.mobileno = mobileno;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return username;
    case 1: return mobileno;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: username = (java.lang.CharSequence)value$; break;
    case 1: mobileno = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'username' field.
   * @return The value of the 'username' field.
   */
  public java.lang.CharSequence getUsername() {
    return username;
  }


  /**
   * Sets the value of the 'username' field.
   * @param value the value to set.
   */
  public void setUsername(java.lang.CharSequence value) {
    this.username = value;
  }

  /**
   * Gets the value of the 'mobileno' field.
   * @return The value of the 'mobileno' field.
   */
  public java.lang.CharSequence getMobileno() {
    return mobileno;
  }


  /**
   * Sets the value of the 'mobileno' field.
   * @param value the value to set.
   */
  public void setMobileno(java.lang.CharSequence value) {
    this.mobileno = value;
  }

  /**
   * Creates a new GoogleProducer RecordBuilder.
   * @return A new GoogleProducer RecordBuilder
   */
  public static com.kmc.shemaRegistry.GoogleProducer.Builder newBuilder() {
    return new com.kmc.shemaRegistry.GoogleProducer.Builder();
  }

  /**
   * Creates a new GoogleProducer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GoogleProducer RecordBuilder
   */
  public static com.kmc.shemaRegistry.GoogleProducer.Builder newBuilder(com.kmc.shemaRegistry.GoogleProducer.Builder other) {
    if (other == null) {
      return new com.kmc.shemaRegistry.GoogleProducer.Builder();
    } else {
      return new com.kmc.shemaRegistry.GoogleProducer.Builder(other);
    }
  }

  /**
   * Creates a new GoogleProducer RecordBuilder by copying an existing GoogleProducer instance.
   * @param other The existing instance to copy.
   * @return A new GoogleProducer RecordBuilder
   */
  public static com.kmc.shemaRegistry.GoogleProducer.Builder newBuilder(com.kmc.shemaRegistry.GoogleProducer other) {
    if (other == null) {
      return new com.kmc.shemaRegistry.GoogleProducer.Builder();
    } else {
      return new com.kmc.shemaRegistry.GoogleProducer.Builder(other);
    }
  }

  /**
   * RecordBuilder for GoogleProducer instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GoogleProducer>
    implements org.apache.avro.data.RecordBuilder<GoogleProducer> {

    private java.lang.CharSequence username;
    private java.lang.CharSequence mobileno;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.kmc.shemaRegistry.GoogleProducer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.username)) {
        this.username = data().deepCopy(fields()[0].schema(), other.username);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.mobileno)) {
        this.mobileno = data().deepCopy(fields()[1].schema(), other.mobileno);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing GoogleProducer instance
     * @param other The existing instance to copy.
     */
    private Builder(com.kmc.shemaRegistry.GoogleProducer other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.username)) {
        this.username = data().deepCopy(fields()[0].schema(), other.username);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mobileno)) {
        this.mobileno = data().deepCopy(fields()[1].schema(), other.mobileno);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'username' field.
      * @return The value.
      */
    public java.lang.CharSequence getUsername() {
      return username;
    }


    /**
      * Sets the value of the 'username' field.
      * @param value The value of 'username'.
      * @return This builder.
      */
    public com.kmc.shemaRegistry.GoogleProducer.Builder setUsername(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.username = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'username' field has been set.
      * @return True if the 'username' field has been set, false otherwise.
      */
    public boolean hasUsername() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'username' field.
      * @return This builder.
      */
    public com.kmc.shemaRegistry.GoogleProducer.Builder clearUsername() {
      username = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'mobileno' field.
      * @return The value.
      */
    public java.lang.CharSequence getMobileno() {
      return mobileno;
    }


    /**
      * Sets the value of the 'mobileno' field.
      * @param value The value of 'mobileno'.
      * @return This builder.
      */
    public com.kmc.shemaRegistry.GoogleProducer.Builder setMobileno(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.mobileno = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'mobileno' field has been set.
      * @return True if the 'mobileno' field has been set, false otherwise.
      */
    public boolean hasMobileno() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'mobileno' field.
      * @return This builder.
      */
    public com.kmc.shemaRegistry.GoogleProducer.Builder clearMobileno() {
      mobileno = null;
      fieldSetFlags()[1] = false;
      return this;
    }

   
    @SuppressWarnings("unchecked")
    public GoogleProducer build() {
      try {
        GoogleProducer record = new GoogleProducer();
        record.username = fieldSetFlags()[0] ? this.username : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.mobileno = fieldSetFlags()[1] ? this.mobileno : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GoogleProducer>
    WRITER$ = (org.apache.avro.io.DatumWriter<GoogleProducer>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GoogleProducer>
    READER$ = (org.apache.avro.io.DatumReader<GoogleProducer>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.username);

    out.writeString(this.mobileno);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.username = in.readString(this.username instanceof Utf8 ? (Utf8)this.username : null);

      this.mobileno = in.readString(this.mobileno instanceof Utf8 ? (Utf8)this.mobileno : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.username = in.readString(this.username instanceof Utf8 ? (Utf8)this.username : null);
          break;

        case 1:
          this.mobileno = in.readString(this.mobileno instanceof Utf8 ? (Utf8)this.mobileno : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









