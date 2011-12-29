/**
 * GroupMemberWSVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.pims.vo;

public class GroupMemberWSVO  implements java.io.Serializable {
    private java.lang.String ccode;

    private java.lang.String ncode;

    private java.lang.String nameCardEmail;

    private java.lang.String groupName;

    private java.lang.String nameCardName;

    private java.lang.String companyName;

    private java.lang.String deptName;

    private java.lang.String title;

    public GroupMemberWSVO() {
    }

    public GroupMemberWSVO(
           java.lang.String ccode,
           java.lang.String ncode,
           java.lang.String nameCardEmail,
           java.lang.String groupName,
           java.lang.String nameCardName,
           java.lang.String companyName,
           java.lang.String deptName,
           java.lang.String title) {
           this.ccode = ccode;
           this.ncode = ncode;
           this.nameCardEmail = nameCardEmail;
           this.groupName = groupName;
           this.nameCardName = nameCardName;
           this.companyName = companyName;
           this.deptName = deptName;
           this.title = title;
    }


    /**
     * Gets the ccode value for this GroupMemberWSVO.
     * 
     * @return ccode
     */
    public java.lang.String getCcode() {
        return ccode;
    }


    /**
     * Sets the ccode value for this GroupMemberWSVO.
     * 
     * @param ccode
     */
    public void setCcode(java.lang.String ccode) {
        this.ccode = ccode;
    }


    /**
     * Gets the ncode value for this GroupMemberWSVO.
     * 
     * @return ncode
     */
    public java.lang.String getNcode() {
        return ncode;
    }


    /**
     * Sets the ncode value for this GroupMemberWSVO.
     * 
     * @param ncode
     */
    public void setNcode(java.lang.String ncode) {
        this.ncode = ncode;
    }


    /**
     * Gets the nameCardEmail value for this GroupMemberWSVO.
     * 
     * @return nameCardEmail
     */
    public java.lang.String getNameCardEmail() {
        return nameCardEmail;
    }


    /**
     * Sets the nameCardEmail value for this GroupMemberWSVO.
     * 
     * @param nameCardEmail
     */
    public void setNameCardEmail(java.lang.String nameCardEmail) {
        this.nameCardEmail = nameCardEmail;
    }


    /**
     * Gets the groupName value for this GroupMemberWSVO.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this GroupMemberWSVO.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the nameCardName value for this GroupMemberWSVO.
     * 
     * @return nameCardName
     */
    public java.lang.String getNameCardName() {
        return nameCardName;
    }


    /**
     * Sets the nameCardName value for this GroupMemberWSVO.
     * 
     * @param nameCardName
     */
    public void setNameCardName(java.lang.String nameCardName) {
        this.nameCardName = nameCardName;
    }


    /**
     * Gets the companyName value for this GroupMemberWSVO.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this GroupMemberWSVO.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the deptName value for this GroupMemberWSVO.
     * 
     * @return deptName
     */
    public java.lang.String getDeptName() {
        return deptName;
    }


    /**
     * Sets the deptName value for this GroupMemberWSVO.
     * 
     * @param deptName
     */
    public void setDeptName(java.lang.String deptName) {
        this.deptName = deptName;
    }


    /**
     * Gets the title value for this GroupMemberWSVO.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this GroupMemberWSVO.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GroupMemberWSVO)) return false;
        GroupMemberWSVO other = (GroupMemberWSVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ccode==null && other.getCcode()==null) || 
             (this.ccode!=null &&
              this.ccode.equals(other.getCcode()))) &&
            ((this.ncode==null && other.getNcode()==null) || 
             (this.ncode!=null &&
              this.ncode.equals(other.getNcode()))) &&
            ((this.nameCardEmail==null && other.getNameCardEmail()==null) || 
             (this.nameCardEmail!=null &&
              this.nameCardEmail.equals(other.getNameCardEmail()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.nameCardName==null && other.getNameCardName()==null) || 
             (this.nameCardName!=null &&
              this.nameCardName.equals(other.getNameCardName()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.deptName==null && other.getDeptName()==null) || 
             (this.deptName!=null &&
              this.deptName.equals(other.getDeptName()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        if (getCcode() != null) {
            _hashCode += getCcode().hashCode();
        }
        if (getNcode() != null) {
            _hashCode += getNcode().hashCode();
        }
        if (getNameCardEmail() != null) {
            _hashCode += getNameCardEmail().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getNameCardName() != null) {
            _hashCode += getNameCardName().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getDeptName() != null) {
            _hashCode += getDeptName().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupMemberWSVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "GroupMemberWSVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ccode"));
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
        elemField.setFieldName("nameCardEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameCardEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameCardName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameCardName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deptName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
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
