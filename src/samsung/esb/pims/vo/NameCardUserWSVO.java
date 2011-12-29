/**
 * NameCardUserWSVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.pims.vo;

public class NameCardUserWSVO  extends samsung.esb.pims.vo.UserVO  implements java.io.Serializable {
    private java.lang.String userNameEN;

    private java.lang.String deptNameEN;

    private java.lang.String compNameEN;

    private java.lang.String ownerId;

    private java.lang.String deptCode;

    private java.lang.String compCode;

    private java.lang.String fullName;

    private java.lang.String userTimeZone;

    public NameCardUserWSVO() {
    }

    public NameCardUserWSVO(
           java.lang.String dn,
           java.lang.String password,
           java.lang.String uid,
           java.lang.String cn,
           java.lang.String o,
           java.lang.String epOrganizationCode,
           java.lang.String epRegisterNumber,
           java.lang.String departmentNumber,
           java.lang.String department,
           java.lang.String epTitleNumber,
           java.lang.String epGradeName,
           java.lang.String epSecurityLevel,
           java.lang.String mailHost,
           java.lang.String employeeNumber,
           java.lang.String lang,
           java.lang.String epUserLevel,
           java.lang.String epUserStatus,
           java.lang.String telephoneNumber,
           java.lang.String epSubOrgCode,
           java.lang.String epSubOrgName,
           java.lang.String epBusiCode,
           java.lang.String epBusiName,
           java.lang.String epRegionCode,
           java.lang.String epRegionName,
           java.lang.String mail,
           java.lang.String epAlternativeMail,
           java.lang.String epID,
           java.lang.String epDefaultCompCode,
           java.lang.String epOrgDeptCode,
           java.lang.String epOrgCompCode,
           java.lang.String epPreferredLanguage,
           java.lang.String userNameEN,
           java.lang.String deptNameEN,
           java.lang.String compNameEN,
           java.lang.String ownerId,
           java.lang.String deptCode,
           java.lang.String compCode,
           java.lang.String fullName,
           java.lang.String userTimeZone) {
        super(
            dn,
            password,
            uid,
            cn,
            o,
            epOrganizationCode,
            epRegisterNumber,
            departmentNumber,
            department,
            epTitleNumber,
            epGradeName,
            epSecurityLevel,
            mailHost,
            employeeNumber,
            lang,
            epUserLevel,
            epUserStatus,
            telephoneNumber,
            epSubOrgCode,
            epSubOrgName,
            epBusiCode,
            epBusiName,
            epRegionCode,
            epRegionName,
            mail,
            epAlternativeMail,
            epID,
            epDefaultCompCode,
            epOrgDeptCode,
            epOrgCompCode,
            epPreferredLanguage);
        this.userNameEN = userNameEN;
        this.deptNameEN = deptNameEN;
        this.compNameEN = compNameEN;
        this.ownerId = ownerId;
        this.deptCode = deptCode;
        this.compCode = compCode;
        this.fullName = fullName;
        this.userTimeZone = userTimeZone;
    }


    /**
     * Gets the userNameEN value for this NameCardUserWSVO.
     * 
     * @return userNameEN
     */
    public java.lang.String getUserNameEN() {
        return userNameEN;
    }


    /**
     * Sets the userNameEN value for this NameCardUserWSVO.
     * 
     * @param userNameEN
     */
    public void setUserNameEN(java.lang.String userNameEN) {
        this.userNameEN = userNameEN;
    }


    /**
     * Gets the deptNameEN value for this NameCardUserWSVO.
     * 
     * @return deptNameEN
     */
    public java.lang.String getDeptNameEN() {
        return deptNameEN;
    }


    /**
     * Sets the deptNameEN value for this NameCardUserWSVO.
     * 
     * @param deptNameEN
     */
    public void setDeptNameEN(java.lang.String deptNameEN) {
        this.deptNameEN = deptNameEN;
    }


    /**
     * Gets the compNameEN value for this NameCardUserWSVO.
     * 
     * @return compNameEN
     */
    public java.lang.String getCompNameEN() {
        return compNameEN;
    }


    /**
     * Sets the compNameEN value for this NameCardUserWSVO.
     * 
     * @param compNameEN
     */
    public void setCompNameEN(java.lang.String compNameEN) {
        this.compNameEN = compNameEN;
    }


    /**
     * Gets the ownerId value for this NameCardUserWSVO.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this NameCardUserWSVO.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the deptCode value for this NameCardUserWSVO.
     * 
     * @return deptCode
     */
    public java.lang.String getDeptCode() {
        return deptCode;
    }


    /**
     * Sets the deptCode value for this NameCardUserWSVO.
     * 
     * @param deptCode
     */
    public void setDeptCode(java.lang.String deptCode) {
        this.deptCode = deptCode;
    }


    /**
     * Gets the compCode value for this NameCardUserWSVO.
     * 
     * @return compCode
     */
    public java.lang.String getCompCode() {
        return compCode;
    }


    /**
     * Sets the compCode value for this NameCardUserWSVO.
     * 
     * @param compCode
     */
    public void setCompCode(java.lang.String compCode) {
        this.compCode = compCode;
    }


    /**
     * Gets the fullName value for this NameCardUserWSVO.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this NameCardUserWSVO.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the userTimeZone value for this NameCardUserWSVO.
     * 
     * @return userTimeZone
     */
    public java.lang.String getUserTimeZone() {
        return userTimeZone;
    }


    /**
     * Sets the userTimeZone value for this NameCardUserWSVO.
     * 
     * @param userTimeZone
     */
    public void setUserTimeZone(java.lang.String userTimeZone) {
        this.userTimeZone = userTimeZone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameCardUserWSVO)) return false;
        NameCardUserWSVO other = (NameCardUserWSVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userNameEN==null && other.getUserNameEN()==null) || 
             (this.userNameEN!=null &&
              this.userNameEN.equals(other.getUserNameEN()))) &&
            ((this.deptNameEN==null && other.getDeptNameEN()==null) || 
             (this.deptNameEN!=null &&
              this.deptNameEN.equals(other.getDeptNameEN()))) &&
            ((this.compNameEN==null && other.getCompNameEN()==null) || 
             (this.compNameEN!=null &&
              this.compNameEN.equals(other.getCompNameEN()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.deptCode==null && other.getDeptCode()==null) || 
             (this.deptCode!=null &&
              this.deptCode.equals(other.getDeptCode()))) &&
            ((this.compCode==null && other.getCompCode()==null) || 
             (this.compCode!=null &&
              this.compCode.equals(other.getCompCode()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.userTimeZone==null && other.getUserTimeZone()==null) || 
             (this.userTimeZone!=null &&
              this.userTimeZone.equals(other.getUserTimeZone())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getUserNameEN() != null) {
            _hashCode += getUserNameEN().hashCode();
        }
        if (getDeptNameEN() != null) {
            _hashCode += getDeptNameEN().hashCode();
        }
        if (getCompNameEN() != null) {
            _hashCode += getCompNameEN().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getDeptCode() != null) {
            _hashCode += getDeptCode().hashCode();
        }
        if (getCompCode() != null) {
            _hashCode += getCompCode().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getUserTimeZone() != null) {
            _hashCode += getUserTimeZone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameCardUserWSVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardUserWSVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNameEN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userNameEN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptNameEN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deptNameEN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compNameEN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "compNameEN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deptCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "compCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userTimeZone"));
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
