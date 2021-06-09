/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetRoleGrantsForPrincipalResponse implements org.apache.thrift.TBase<GetRoleGrantsForPrincipalResponse, GetRoleGrantsForPrincipalResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetRoleGrantsForPrincipalResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetRoleGrantsForPrincipalResponse");

  private static final org.apache.thrift.protocol.TField PRINCIPAL_GRANTS_FIELD_DESC = new org.apache.thrift.protocol.TField("principalGrants", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetRoleGrantsForPrincipalResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetRoleGrantsForPrincipalResponseTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<RolePrincipalGrant> principalGrants; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRINCIPAL_GRANTS((short)1, "principalGrants");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PRINCIPAL_GRANTS
          return PRINCIPAL_GRANTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRINCIPAL_GRANTS, new org.apache.thrift.meta_data.FieldMetaData("principalGrants", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RolePrincipalGrant.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetRoleGrantsForPrincipalResponse.class, metaDataMap);
  }

  public GetRoleGrantsForPrincipalResponse() {
  }

  public GetRoleGrantsForPrincipalResponse(
    java.util.List<RolePrincipalGrant> principalGrants)
  {
    this();
    this.principalGrants = principalGrants;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetRoleGrantsForPrincipalResponse(GetRoleGrantsForPrincipalResponse other) {
    if (other.isSetPrincipalGrants()) {
      java.util.List<RolePrincipalGrant> __this__principalGrants = new java.util.ArrayList<RolePrincipalGrant>(other.principalGrants.size());
      for (RolePrincipalGrant other_element : other.principalGrants) {
        __this__principalGrants.add(new RolePrincipalGrant(other_element));
      }
      this.principalGrants = __this__principalGrants;
    }
  }

  public GetRoleGrantsForPrincipalResponse deepCopy() {
    return new GetRoleGrantsForPrincipalResponse(this);
  }

  @Override
  public void clear() {
    this.principalGrants = null;
  }

  public int getPrincipalGrantsSize() {
    return (this.principalGrants == null) ? 0 : this.principalGrants.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<RolePrincipalGrant> getPrincipalGrantsIterator() {
    return (this.principalGrants == null) ? null : this.principalGrants.iterator();
  }

  public void addToPrincipalGrants(RolePrincipalGrant elem) {
    if (this.principalGrants == null) {
      this.principalGrants = new java.util.ArrayList<RolePrincipalGrant>();
    }
    this.principalGrants.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<RolePrincipalGrant> getPrincipalGrants() {
    return this.principalGrants;
  }

  public void setPrincipalGrants(@org.apache.thrift.annotation.Nullable java.util.List<RolePrincipalGrant> principalGrants) {
    this.principalGrants = principalGrants;
  }

  public void unsetPrincipalGrants() {
    this.principalGrants = null;
  }

  /** Returns true if field principalGrants is set (has been assigned a value) and false otherwise */
  public boolean isSetPrincipalGrants() {
    return this.principalGrants != null;
  }

  public void setPrincipalGrantsIsSet(boolean value) {
    if (!value) {
      this.principalGrants = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PRINCIPAL_GRANTS:
      if (value == null) {
        unsetPrincipalGrants();
      } else {
        setPrincipalGrants((java.util.List<RolePrincipalGrant>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PRINCIPAL_GRANTS:
      return getPrincipalGrants();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PRINCIPAL_GRANTS:
      return isSetPrincipalGrants();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof GetRoleGrantsForPrincipalResponse)
      return this.equals((GetRoleGrantsForPrincipalResponse)that);
    return false;
  }

  public boolean equals(GetRoleGrantsForPrincipalResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_principalGrants = true && this.isSetPrincipalGrants();
    boolean that_present_principalGrants = true && that.isSetPrincipalGrants();
    if (this_present_principalGrants || that_present_principalGrants) {
      if (!(this_present_principalGrants && that_present_principalGrants))
        return false;
      if (!this.principalGrants.equals(that.principalGrants))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPrincipalGrants()) ? 131071 : 524287);
    if (isSetPrincipalGrants())
      hashCode = hashCode * 8191 + principalGrants.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetRoleGrantsForPrincipalResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPrincipalGrants(), other.isSetPrincipalGrants());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrincipalGrants()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.principalGrants, other.principalGrants);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetRoleGrantsForPrincipalResponse(");
    boolean first = true;

    sb.append("principalGrants:");
    if (this.principalGrants == null) {
      sb.append("null");
    } else {
      sb.append(this.principalGrants);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetPrincipalGrants()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'principalGrants' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetRoleGrantsForPrincipalResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetRoleGrantsForPrincipalResponseStandardScheme getScheme() {
      return new GetRoleGrantsForPrincipalResponseStandardScheme();
    }
  }

  private static class GetRoleGrantsForPrincipalResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetRoleGrantsForPrincipalResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetRoleGrantsForPrincipalResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRINCIPAL_GRANTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list134 = iprot.readListBegin();
                struct.principalGrants = new java.util.ArrayList<RolePrincipalGrant>(_list134.size);
                @org.apache.thrift.annotation.Nullable RolePrincipalGrant _elem135;
                for (int _i136 = 0; _i136 < _list134.size; ++_i136)
                {
                  _elem135 = new RolePrincipalGrant();
                  _elem135.read(iprot);
                  struct.principalGrants.add(_elem135);
                }
                iprot.readListEnd();
              }
              struct.setPrincipalGrantsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetRoleGrantsForPrincipalResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.principalGrants != null) {
        oprot.writeFieldBegin(PRINCIPAL_GRANTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.principalGrants.size()));
          for (RolePrincipalGrant _iter137 : struct.principalGrants)
          {
            _iter137.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetRoleGrantsForPrincipalResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetRoleGrantsForPrincipalResponseTupleScheme getScheme() {
      return new GetRoleGrantsForPrincipalResponseTupleScheme();
    }
  }

  private static class GetRoleGrantsForPrincipalResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetRoleGrantsForPrincipalResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetRoleGrantsForPrincipalResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.principalGrants.size());
        for (RolePrincipalGrant _iter138 : struct.principalGrants)
        {
          _iter138.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetRoleGrantsForPrincipalResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list139 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.principalGrants = new java.util.ArrayList<RolePrincipalGrant>(_list139.size);
        @org.apache.thrift.annotation.Nullable RolePrincipalGrant _elem140;
        for (int _i141 = 0; _i141 < _list139.size; ++_i141)
        {
          _elem140 = new RolePrincipalGrant();
          _elem140.read(iprot);
          struct.principalGrants.add(_elem140);
        }
      }
      struct.setPrincipalGrantsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

