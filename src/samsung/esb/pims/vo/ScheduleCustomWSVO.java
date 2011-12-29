/**
 * ScheduleCustomWSVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.pims.vo;

public class ScheduleCustomWSVO  implements java.io.Serializable {
    private java.lang.String updateFlag;

    private java.lang.String receiverFlag;

    private java.lang.String deptUpdateFlag;

    private samsung.esb.pims.vo.AttachFileEtyWSVO[] attachFileEtyWSVO;

    private samsung.esb.pims.vo.ScheduleReceiverWSVO[] scheduleReceiverWSVO;

    private samsung.esb.pims.vo.ScheduleEtyWSVO scheduleEtyWSVO;

    public ScheduleCustomWSVO() {
    }

    public ScheduleCustomWSVO(
           java.lang.String updateFlag,
           java.lang.String receiverFlag,
           java.lang.String deptUpdateFlag,
           samsung.esb.pims.vo.AttachFileEtyWSVO[] attachFileEtyWSVO,
           samsung.esb.pims.vo.ScheduleReceiverWSVO[] scheduleReceiverWSVO,
           samsung.esb.pims.vo.ScheduleEtyWSVO scheduleEtyWSVO) {
           this.updateFlag = updateFlag;
           this.receiverFlag = receiverFlag;
           this.deptUpdateFlag = deptUpdateFlag;
           this.attachFileEtyWSVO = attachFileEtyWSVO;
           this.scheduleReceiverWSVO = scheduleReceiverWSVO;
           this.scheduleEtyWSVO = scheduleEtyWSVO;
    }


    /**
     * Gets the updateFlag value for this ScheduleCustomWSVO.
     * 
     * @return updateFlag
     */
    public java.lang.String getUpdateFlag() {
        return updateFlag;
    }


    /**
     * Sets the updateFlag value for this ScheduleCustomWSVO.
     * 
     * @param updateFlag
     */
    public void setUpdateFlag(java.lang.String updateFlag) {
        this.updateFlag = updateFlag;
    }


    /**
     * Gets the receiverFlag value for this ScheduleCustomWSVO.
     * 
     * @return receiverFlag
     */
    public java.lang.String getReceiverFlag() {
        return receiverFlag;
    }


    /**
     * Sets the receiverFlag value for this ScheduleCustomWSVO.
     * 
     * @param receiverFlag
     */
    public void setReceiverFlag(java.lang.String receiverFlag) {
        this.receiverFlag = receiverFlag;
    }


    /**
     * Gets the deptUpdateFlag value for this ScheduleCustomWSVO.
     * 
     * @return deptUpdateFlag
     */
    public java.lang.String getDeptUpdateFlag() {
        return deptUpdateFlag;
    }


    /**
     * Sets the deptUpdateFlag value for this ScheduleCustomWSVO.
     * 
     * @param deptUpdateFlag
     */
    public void setDeptUpdateFlag(java.lang.String deptUpdateFlag) {
        this.deptUpdateFlag = deptUpdateFlag;
    }


    /**
     * Gets the attachFileEtyWSVO value for this ScheduleCustomWSVO.
     * 
     * @return attachFileEtyWSVO
     */
    public samsung.esb.pims.vo.AttachFileEtyWSVO[] getAttachFileEtyWSVO() {
        return attachFileEtyWSVO;
    }


    /**
     * Sets the attachFileEtyWSVO value for this ScheduleCustomWSVO.
     * 
     * @param attachFileEtyWSVO
     */
    public void setAttachFileEtyWSVO(samsung.esb.pims.vo.AttachFileEtyWSVO[] attachFileEtyWSVO) {
        this.attachFileEtyWSVO = attachFileEtyWSVO;
    }

    public samsung.esb.pims.vo.AttachFileEtyWSVO getAttachFileEtyWSVO(int i) {
        return this.attachFileEtyWSVO[i];
    }

    public void setAttachFileEtyWSVO(int i, samsung.esb.pims.vo.AttachFileEtyWSVO _value) {
        this.attachFileEtyWSVO[i] = _value;
    }


    /**
     * Gets the scheduleReceiverWSVO value for this ScheduleCustomWSVO.
     * 
     * @return scheduleReceiverWSVO
     */
    public samsung.esb.pims.vo.ScheduleReceiverWSVO[] getScheduleReceiverWSVO() {
        return scheduleReceiverWSVO;
    }


    /**
     * Sets the scheduleReceiverWSVO value for this ScheduleCustomWSVO.
     * 
     * @param scheduleReceiverWSVO
     */
    public void setScheduleReceiverWSVO(samsung.esb.pims.vo.ScheduleReceiverWSVO[] scheduleReceiverWSVO) {
        this.scheduleReceiverWSVO = scheduleReceiverWSVO;
    }

    public samsung.esb.pims.vo.ScheduleReceiverWSVO getScheduleReceiverWSVO(int i) {
        return this.scheduleReceiverWSVO[i];
    }

    public void setScheduleReceiverWSVO(int i, samsung.esb.pims.vo.ScheduleReceiverWSVO _value) {
        this.scheduleReceiverWSVO[i] = _value;
    }


    /**
     * Gets the scheduleEtyWSVO value for this ScheduleCustomWSVO.
     * 
     * @return scheduleEtyWSVO
     */
    public samsung.esb.pims.vo.ScheduleEtyWSVO getScheduleEtyWSVO() {
        return scheduleEtyWSVO;
    }


    /**
     * Sets the scheduleEtyWSVO value for this ScheduleCustomWSVO.
     * 
     * @param scheduleEtyWSVO
     */
    public void setScheduleEtyWSVO(samsung.esb.pims.vo.ScheduleEtyWSVO scheduleEtyWSVO) {
        this.scheduleEtyWSVO = scheduleEtyWSVO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleCustomWSVO)) return false;
        ScheduleCustomWSVO other = (ScheduleCustomWSVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateFlag==null && other.getUpdateFlag()==null) || 
             (this.updateFlag!=null &&
              this.updateFlag.equals(other.getUpdateFlag()))) &&
            ((this.receiverFlag==null && other.getReceiverFlag()==null) || 
             (this.receiverFlag!=null &&
              this.receiverFlag.equals(other.getReceiverFlag()))) &&
            ((this.deptUpdateFlag==null && other.getDeptUpdateFlag()==null) || 
             (this.deptUpdateFlag!=null &&
              this.deptUpdateFlag.equals(other.getDeptUpdateFlag()))) &&
            ((this.attachFileEtyWSVO==null && other.getAttachFileEtyWSVO()==null) || 
             (this.attachFileEtyWSVO!=null &&
              java.util.Arrays.equals(this.attachFileEtyWSVO, other.getAttachFileEtyWSVO()))) &&
            ((this.scheduleReceiverWSVO==null && other.getScheduleReceiverWSVO()==null) || 
             (this.scheduleReceiverWSVO!=null &&
              java.util.Arrays.equals(this.scheduleReceiverWSVO, other.getScheduleReceiverWSVO()))) &&
            ((this.scheduleEtyWSVO==null && other.getScheduleEtyWSVO()==null) || 
             (this.scheduleEtyWSVO!=null &&
              this.scheduleEtyWSVO.equals(other.getScheduleEtyWSVO())));
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
        if (getUpdateFlag() != null) {
            _hashCode += getUpdateFlag().hashCode();
        }
        if (getReceiverFlag() != null) {
            _hashCode += getReceiverFlag().hashCode();
        }
        if (getDeptUpdateFlag() != null) {
            _hashCode += getDeptUpdateFlag().hashCode();
        }
        if (getAttachFileEtyWSVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachFileEtyWSVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachFileEtyWSVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduleReceiverWSVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduleReceiverWSVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduleReceiverWSVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduleEtyWSVO() != null) {
            _hashCode += getScheduleEtyWSVO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleCustomWSVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleCustomWSVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptUpdateFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deptUpdateFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachFileEtyWSVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachFileEtyWSVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "AttachFileEtyWSVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleReceiverWSVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleReceiverWSVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleReceiverWSVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleEtyWSVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleEtyWSVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleEtyWSVO"));
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
