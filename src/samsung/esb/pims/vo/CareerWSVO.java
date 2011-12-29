/**
 * CareerWSVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.pims.vo;

public class CareerWSVO  implements java.io.Serializable {
    private java.lang.String careerSeq;

    private java.lang.String ncode;

    private java.lang.String activityFrom;

    private java.lang.String activityTo;

    private java.lang.String careerNote;

    public CareerWSVO() {
    }

    public CareerWSVO(
           java.lang.String careerSeq,
           java.lang.String ncode,
           java.lang.String activityFrom,
           java.lang.String activityTo,
           java.lang.String careerNote) {
           this.careerSeq = careerSeq;
           this.ncode = ncode;
           this.activityFrom = activityFrom;
           this.activityTo = activityTo;
           this.careerNote = careerNote;
    }


    /**
     * Gets the careerSeq value for this CareerWSVO.
     * 
     * @return careerSeq
     */
    public java.lang.String getCareerSeq() {
        return careerSeq;
    }


    /**
     * Sets the careerSeq value for this CareerWSVO.
     * 
     * @param careerSeq
     */
    public void setCareerSeq(java.lang.String careerSeq) {
        this.careerSeq = careerSeq;
    }


    /**
     * Gets the ncode value for this CareerWSVO.
     * 
     * @return ncode
     */
    public java.lang.String getNcode() {
        return ncode;
    }


    /**
     * Sets the ncode value for this CareerWSVO.
     * 
     * @param ncode
     */
    public void setNcode(java.lang.String ncode) {
        this.ncode = ncode;
    }


    /**
     * Gets the activityFrom value for this CareerWSVO.
     * 
     * @return activityFrom
     */
    public java.lang.String getActivityFrom() {
        return activityFrom;
    }


    /**
     * Sets the activityFrom value for this CareerWSVO.
     * 
     * @param activityFrom
     */
    public void setActivityFrom(java.lang.String activityFrom) {
        this.activityFrom = activityFrom;
    }


    /**
     * Gets the activityTo value for this CareerWSVO.
     * 
     * @return activityTo
     */
    public java.lang.String getActivityTo() {
        return activityTo;
    }


    /**
     * Sets the activityTo value for this CareerWSVO.
     * 
     * @param activityTo
     */
    public void setActivityTo(java.lang.String activityTo) {
        this.activityTo = activityTo;
    }


    /**
     * Gets the careerNote value for this CareerWSVO.
     * 
     * @return careerNote
     */
    public java.lang.String getCareerNote() {
        return careerNote;
    }


    /**
     * Sets the careerNote value for this CareerWSVO.
     * 
     * @param careerNote
     */
    public void setCareerNote(java.lang.String careerNote) {
        this.careerNote = careerNote;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CareerWSVO)) return false;
        CareerWSVO other = (CareerWSVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.careerSeq==null && other.getCareerSeq()==null) || 
             (this.careerSeq!=null &&
              this.careerSeq.equals(other.getCareerSeq()))) &&
            ((this.ncode==null && other.getNcode()==null) || 
             (this.ncode!=null &&
              this.ncode.equals(other.getNcode()))) &&
            ((this.activityFrom==null && other.getActivityFrom()==null) || 
             (this.activityFrom!=null &&
              this.activityFrom.equals(other.getActivityFrom()))) &&
            ((this.activityTo==null && other.getActivityTo()==null) || 
             (this.activityTo!=null &&
              this.activityTo.equals(other.getActivityTo()))) &&
            ((this.careerNote==null && other.getCareerNote()==null) || 
             (this.careerNote!=null &&
              this.careerNote.equals(other.getCareerNote())));
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
        if (getCareerSeq() != null) {
            _hashCode += getCareerSeq().hashCode();
        }
        if (getNcode() != null) {
            _hashCode += getNcode().hashCode();
        }
        if (getActivityFrom() != null) {
            _hashCode += getActivityFrom().hashCode();
        }
        if (getActivityTo() != null) {
            _hashCode += getActivityTo().hashCode();
        }
        if (getCareerNote() != null) {
            _hashCode += getCareerNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CareerWSVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "CareerWSVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("careerSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "careerSeq"));
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
        elemField.setFieldName("activityFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("careerNote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "careerNote"));
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
