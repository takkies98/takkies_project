/**
 * NameCardDetailWSVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.pims.vo;

public class NameCardDetailWSVO  implements java.io.Serializable {
    private samsung.esb.pims.vo.GroupMemberWSVO[] groupMemberWSVOs;

    private samsung.esb.pims.vo.NameCardWSVO nameCardWSVO;

    private samsung.esb.pims.vo.NameCardRelationPersonWSVO[] relationPersonWSVOs;

    public NameCardDetailWSVO() {
    }

    public NameCardDetailWSVO(
           samsung.esb.pims.vo.GroupMemberWSVO[] groupMemberWSVOs,
           samsung.esb.pims.vo.NameCardWSVO nameCardWSVO,
           samsung.esb.pims.vo.NameCardRelationPersonWSVO[] relationPersonWSVOs) {
           this.groupMemberWSVOs = groupMemberWSVOs;
           this.nameCardWSVO = nameCardWSVO;
           this.relationPersonWSVOs = relationPersonWSVOs;
    }


    /**
     * Gets the groupMemberWSVOs value for this NameCardDetailWSVO.
     * 
     * @return groupMemberWSVOs
     */
    public samsung.esb.pims.vo.GroupMemberWSVO[] getGroupMemberWSVOs() {
        return groupMemberWSVOs;
    }


    /**
     * Sets the groupMemberWSVOs value for this NameCardDetailWSVO.
     * 
     * @param groupMemberWSVOs
     */
    public void setGroupMemberWSVOs(samsung.esb.pims.vo.GroupMemberWSVO[] groupMemberWSVOs) {
        this.groupMemberWSVOs = groupMemberWSVOs;
    }

    public samsung.esb.pims.vo.GroupMemberWSVO getGroupMemberWSVOs(int i) {
        return this.groupMemberWSVOs[i];
    }

    public void setGroupMemberWSVOs(int i, samsung.esb.pims.vo.GroupMemberWSVO _value) {
        this.groupMemberWSVOs[i] = _value;
    }


    /**
     * Gets the nameCardWSVO value for this NameCardDetailWSVO.
     * 
     * @return nameCardWSVO
     */
    public samsung.esb.pims.vo.NameCardWSVO getNameCardWSVO() {
        return nameCardWSVO;
    }


    /**
     * Sets the nameCardWSVO value for this NameCardDetailWSVO.
     * 
     * @param nameCardWSVO
     */
    public void setNameCardWSVO(samsung.esb.pims.vo.NameCardWSVO nameCardWSVO) {
        this.nameCardWSVO = nameCardWSVO;
    }


    /**
     * Gets the relationPersonWSVOs value for this NameCardDetailWSVO.
     * 
     * @return relationPersonWSVOs
     */
    public samsung.esb.pims.vo.NameCardRelationPersonWSVO[] getRelationPersonWSVOs() {
        return relationPersonWSVOs;
    }


    /**
     * Sets the relationPersonWSVOs value for this NameCardDetailWSVO.
     * 
     * @param relationPersonWSVOs
     */
    public void setRelationPersonWSVOs(samsung.esb.pims.vo.NameCardRelationPersonWSVO[] relationPersonWSVOs) {
        this.relationPersonWSVOs = relationPersonWSVOs;
    }

    public samsung.esb.pims.vo.NameCardRelationPersonWSVO getRelationPersonWSVOs(int i) {
        return this.relationPersonWSVOs[i];
    }

    public void setRelationPersonWSVOs(int i, samsung.esb.pims.vo.NameCardRelationPersonWSVO _value) {
        this.relationPersonWSVOs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameCardDetailWSVO)) return false;
        NameCardDetailWSVO other = (NameCardDetailWSVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupMemberWSVOs==null && other.getGroupMemberWSVOs()==null) || 
             (this.groupMemberWSVOs!=null &&
              java.util.Arrays.equals(this.groupMemberWSVOs, other.getGroupMemberWSVOs()))) &&
            ((this.nameCardWSVO==null && other.getNameCardWSVO()==null) || 
             (this.nameCardWSVO!=null &&
              this.nameCardWSVO.equals(other.getNameCardWSVO()))) &&
            ((this.relationPersonWSVOs==null && other.getRelationPersonWSVOs()==null) || 
             (this.relationPersonWSVOs!=null &&
              java.util.Arrays.equals(this.relationPersonWSVOs, other.getRelationPersonWSVOs())));
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
        if (getGroupMemberWSVOs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupMemberWSVOs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupMemberWSVOs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNameCardWSVO() != null) {
            _hashCode += getNameCardWSVO().hashCode();
        }
        if (getRelationPersonWSVOs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelationPersonWSVOs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelationPersonWSVOs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameCardDetailWSVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardDetailWSVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMemberWSVOs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupMemberWSVOs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "GroupMemberWSVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameCardWSVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameCardWSVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardWSVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationPersonWSVOs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationPersonWSVOs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardRelationPersonWSVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
