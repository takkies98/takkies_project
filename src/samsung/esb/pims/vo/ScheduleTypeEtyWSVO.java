/**
 * ScheduleTypeEtyWSVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.pims.vo;

public class ScheduleTypeEtyWSVO  implements java.io.Serializable {
    private java.lang.String userId;

    private java.lang.String userSchType;

    private java.lang.String schTypeCode;

    public ScheduleTypeEtyWSVO() {
    }

    public ScheduleTypeEtyWSVO(
           java.lang.String userId,
           java.lang.String userSchType,
           java.lang.String schTypeCode) {
           this.userId = userId;
           this.userSchType = userSchType;
           this.schTypeCode = schTypeCode;
    }


    /**
     * Gets the userId value for this ScheduleTypeEtyWSVO.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ScheduleTypeEtyWSVO.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the userSchType value for this ScheduleTypeEtyWSVO.
     * 
     * @return userSchType
     */
    public java.lang.String getUserSchType() {
        return userSchType;
    }


    /**
     * Sets the userSchType value for this ScheduleTypeEtyWSVO.
     * 
     * @param userSchType
     */
    public void setUserSchType(java.lang.String userSchType) {
        this.userSchType = userSchType;
    }


    /**
     * Gets the schTypeCode value for this ScheduleTypeEtyWSVO.
     * 
     * @return schTypeCode
     */
    public java.lang.String getSchTypeCode() {
        return schTypeCode;
    }


    /**
     * Sets the schTypeCode value for this ScheduleTypeEtyWSVO.
     * 
     * @param schTypeCode
     */
    public void setSchTypeCode(java.lang.String schTypeCode) {
        this.schTypeCode = schTypeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleTypeEtyWSVO)) return false;
        ScheduleTypeEtyWSVO other = (ScheduleTypeEtyWSVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.userSchType==null && other.getUserSchType()==null) || 
             (this.userSchType!=null &&
              this.userSchType.equals(other.getUserSchType()))) &&
            ((this.schTypeCode==null && other.getSchTypeCode()==null) || 
             (this.schTypeCode!=null &&
              this.schTypeCode.equals(other.getSchTypeCode())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUserSchType() != null) {
            _hashCode += getUserSchType().hashCode();
        }
        if (getSchTypeCode() != null) {
            _hashCode += getSchTypeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleTypeEtyWSVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleTypeEtyWSVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserSchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SchTypeCode"));
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
