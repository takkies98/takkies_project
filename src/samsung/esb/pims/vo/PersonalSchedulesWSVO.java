/**
 * PersonalSchedulesWSVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.pims.vo;

public class PersonalSchedulesWSVO  implements java.io.Serializable {
    private samsung.esb.pims.vo.CalListCustWSVO[] calListCustWSVOs;

    private java.lang.String userGrade;

    private java.lang.String userId;

    private java.lang.String userName;

    public PersonalSchedulesWSVO() {
    }

    public PersonalSchedulesWSVO(
           samsung.esb.pims.vo.CalListCustWSVO[] calListCustWSVOs,
           java.lang.String userGrade,
           java.lang.String userId,
           java.lang.String userName) {
           this.calListCustWSVOs = calListCustWSVOs;
           this.userGrade = userGrade;
           this.userId = userId;
           this.userName = userName;
    }


    /**
     * Gets the calListCustWSVOs value for this PersonalSchedulesWSVO.
     * 
     * @return calListCustWSVOs
     */
    public samsung.esb.pims.vo.CalListCustWSVO[] getCalListCustWSVOs() {
        return calListCustWSVOs;
    }


    /**
     * Sets the calListCustWSVOs value for this PersonalSchedulesWSVO.
     * 
     * @param calListCustWSVOs
     */
    public void setCalListCustWSVOs(samsung.esb.pims.vo.CalListCustWSVO[] calListCustWSVOs) {
        this.calListCustWSVOs = calListCustWSVOs;
    }

    public samsung.esb.pims.vo.CalListCustWSVO getCalListCustWSVOs(int i) {
        return this.calListCustWSVOs[i];
    }

    public void setCalListCustWSVOs(int i, samsung.esb.pims.vo.CalListCustWSVO _value) {
        this.calListCustWSVOs[i] = _value;
    }


    /**
     * Gets the userGrade value for this PersonalSchedulesWSVO.
     * 
     * @return userGrade
     */
    public java.lang.String getUserGrade() {
        return userGrade;
    }


    /**
     * Sets the userGrade value for this PersonalSchedulesWSVO.
     * 
     * @param userGrade
     */
    public void setUserGrade(java.lang.String userGrade) {
        this.userGrade = userGrade;
    }


    /**
     * Gets the userId value for this PersonalSchedulesWSVO.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this PersonalSchedulesWSVO.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this PersonalSchedulesWSVO.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this PersonalSchedulesWSVO.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonalSchedulesWSVO)) return false;
        PersonalSchedulesWSVO other = (PersonalSchedulesWSVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calListCustWSVOs==null && other.getCalListCustWSVOs()==null) || 
             (this.calListCustWSVOs!=null &&
              java.util.Arrays.equals(this.calListCustWSVOs, other.getCalListCustWSVOs()))) &&
            ((this.userGrade==null && other.getUserGrade()==null) || 
             (this.userGrade!=null &&
              this.userGrade.equals(other.getUserGrade()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName())));
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
        if (getCalListCustWSVOs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalListCustWSVOs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalListCustWSVOs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserGrade() != null) {
            _hashCode += getUserGrade().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonalSchedulesWSVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "PersonalSchedulesWSVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calListCustWSVOs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calListCustWSVOs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "CalListCustWSVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userGrade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userGrade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
