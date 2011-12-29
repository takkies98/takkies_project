/**
 * NameCardRelationPersonWSVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.pims.vo;

public class NameCardRelationPersonWSVO  implements java.io.Serializable {
    private java.lang.String staffId;

    private java.lang.String companyCode;

    private java.lang.String ncode;

    private java.lang.String staffName;

    private java.lang.String email;

    private java.lang.String pubflag;

    public NameCardRelationPersonWSVO() {
    }

    public NameCardRelationPersonWSVO(
           java.lang.String staffId,
           java.lang.String companyCode,
           java.lang.String ncode,
           java.lang.String staffName,
           java.lang.String email,
           java.lang.String pubflag) {
           this.staffId = staffId;
           this.companyCode = companyCode;
           this.ncode = ncode;
           this.staffName = staffName;
           this.email = email;
           this.pubflag = pubflag;
    }


    /**
     * Gets the staffId value for this NameCardRelationPersonWSVO.
     * 
     * @return staffId
     */
    public java.lang.String getStaffId() {
        return staffId;
    }


    /**
     * Sets the staffId value for this NameCardRelationPersonWSVO.
     * 
     * @param staffId
     */
    public void setStaffId(java.lang.String staffId) {
        this.staffId = staffId;
    }


    /**
     * Gets the companyCode value for this NameCardRelationPersonWSVO.
     * 
     * @return companyCode
     */
    public java.lang.String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this NameCardRelationPersonWSVO.
     * 
     * @param companyCode
     */
    public void setCompanyCode(java.lang.String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * Gets the ncode value for this NameCardRelationPersonWSVO.
     * 
     * @return ncode
     */
    public java.lang.String getNcode() {
        return ncode;
    }


    /**
     * Sets the ncode value for this NameCardRelationPersonWSVO.
     * 
     * @param ncode
     */
    public void setNcode(java.lang.String ncode) {
        this.ncode = ncode;
    }


    /**
     * Gets the staffName value for this NameCardRelationPersonWSVO.
     * 
     * @return staffName
     */
    public java.lang.String getStaffName() {
        return staffName;
    }


    /**
     * Sets the staffName value for this NameCardRelationPersonWSVO.
     * 
     * @param staffName
     */
    public void setStaffName(java.lang.String staffName) {
        this.staffName = staffName;
    }


    /**
     * Gets the email value for this NameCardRelationPersonWSVO.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this NameCardRelationPersonWSVO.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the pubflag value for this NameCardRelationPersonWSVO.
     * 
     * @return pubflag
     */
    public java.lang.String getPubflag() {
        return pubflag;
    }


    /**
     * Sets the pubflag value for this NameCardRelationPersonWSVO.
     * 
     * @param pubflag
     */
    public void setPubflag(java.lang.String pubflag) {
        this.pubflag = pubflag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameCardRelationPersonWSVO)) return false;
        NameCardRelationPersonWSVO other = (NameCardRelationPersonWSVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.staffId==null && other.getStaffId()==null) || 
             (this.staffId!=null &&
              this.staffId.equals(other.getStaffId()))) &&
            ((this.companyCode==null && other.getCompanyCode()==null) || 
             (this.companyCode!=null &&
              this.companyCode.equals(other.getCompanyCode()))) &&
            ((this.ncode==null && other.getNcode()==null) || 
             (this.ncode!=null &&
              this.ncode.equals(other.getNcode()))) &&
            ((this.staffName==null && other.getStaffName()==null) || 
             (this.staffName!=null &&
              this.staffName.equals(other.getStaffName()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.pubflag==null && other.getPubflag()==null) || 
             (this.pubflag!=null &&
              this.pubflag.equals(other.getPubflag())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStaffId() != null) {
            _hashCode += getStaffId().hashCode();
        }
        if (getCompanyCode() != null) {
            _hashCode += getCompanyCode().hashCode();
        }
        if (getNcode() != null) {
            _hashCode += getNcode().hashCode();
        }
        if (getStaffName() != null) {
            _hashCode += getStaffName().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getPubflag() != null) {
            _hashCode += getPubflag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameCardRelationPersonWSVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardRelationPersonWSVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staffId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ncode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ncode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staffName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
