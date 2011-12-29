package com.sds.acube.cn.organizationlinkage;

public final class OrgSourceObject extends SourceObject
{
  private String m_strOrgID = "";
  private String m_strOrgName = "";
  private String m_strOrgAbbrName = "";
  private int m_nOrgOrder = 0;
  private String m_strOrgCode = "";
  private String m_strOrgParentID = "";
  private int m_nOrgType = 2;
  private String m_strHomePage = "";
  private String m_strDescription = "";
  private String m_strEMail = "";
  private String m_strAddress = "";
  private String m_strAddressDetail = "";
  private String m_strZipCode = "";
  private String m_strTelephone = "";
  private String m_strFax = "";
  private int m_nIsDeleted = 0;

  public String getSource()
  {
    String strRV = "";
    strRV = this.m_strOrgID + "*" + this.m_strOrgName + "*" + this.m_strOrgAbbrName + "*" + this.m_nOrgOrder + "*" + this.m_strOrgCode + "*" + this.m_strOrgParentID + "*" + 
      this.m_nOrgType + "*" + this.m_strHomePage + "*" + this.m_strDescription + "*" + this.m_strEMail + "*" + this.m_strAddress + "*" + this.m_strAddressDetail + "*" + 
      this.m_strZipCode + "*" + this.m_strTelephone + "*" + this.m_strFax + "*" + this.m_nIsDeleted + "*" + getCreateDate();
    return strRV;
  }

  public String getOrgID()
  {
    return this.m_strOrgID;
  }

  public String getOrgName()
  {
    return this.m_strOrgName;
  }

  public String getOrgParentID()
  {
    return this.m_strOrgParentID;
  }

  public int getOrgOrder()
  {
    return this.m_nOrgOrder;
  }

  public int getOrgType()
  {
    return this.m_nOrgType;
  }

  public String getOrgCode()
  {
    return this.m_strOrgCode;
  }

  public String getOrgAbbrName()
  {
    return this.m_strOrgAbbrName;
  }

  public String getDescription()
  {
    return this.m_strDescription;
  }

  public String getHomePage()
  {
    return this.m_strHomePage;
  }

  public String getEMail()
  {
    return this.m_strEMail;
  }

  public String getAddress()
  {
    return this.m_strAddress;
  }

  public String getAddressDetail()
  {
    return this.m_strAddressDetail;
  }

  public String getZipCode()
  {
    return this.m_strZipCode;
  }

  public String getTelephone()
  {
    return this.m_strTelephone;
  }

  public String getFax()
  {
    return this.m_strFax;
  }

  public int getIsDeleted()
  {
    return this.m_nIsDeleted;
  }

  public void setOrgID(String strOrgID)
  {
    this.m_strOrgID = strOrgID;
  }

  public void setOrgName(String strOrgName)
  {
    this.m_strOrgName = strOrgName;
  }

  public void setOrgParentID(String strOrgParentID)
  {
    this.m_strOrgParentID = strOrgParentID;
  }

  public void setOrgOrder(int nOrgOrder)
  {
    this.m_nOrgOrder = nOrgOrder;
  }

  public void setOrgType(int nOrgType)
  {
    this.m_nOrgType = nOrgType;
  }

  public void setOrgCode(String strOrgCode)
  {
    this.m_strOrgCode = strOrgCode;
  }

  public void setOrgAbbrName(String strOrgAbbrName)
  {
    this.m_strOrgAbbrName = strOrgAbbrName;
  }

  public void setDescription(String strDescription)
  {
    this.m_strDescription = strDescription;
  }

  public void setHomePage(String strHomePage)
  {
    this.m_strHomePage = strHomePage;
  }

  public void setEMail(String strEMail)
  {
    this.m_strEMail = strEMail;
  }

  public void setAddress(String strAddress)
  {
    this.m_strAddress = strAddress;
  }

  public void setAddressDetail(String strAddressDetail)
  {
    this.m_strAddressDetail = strAddressDetail;
  }

  public void setZipCode(String strZipCode)
  {
    this.m_strZipCode = strZipCode;
  }

  public void setTelephone(String strTelephone)
  {
    this.m_strTelephone = strTelephone;
  }

  public void setFax(String strFax)
  {
    this.m_strFax = strFax;
  }

  public void setIsDeleted(int nIsDeleted)
  {
    this.m_nIsDeleted = nIsDeleted;
  }
}