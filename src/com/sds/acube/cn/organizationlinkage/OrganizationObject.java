package com.sds.acube.cn.organizationlinkage;

public class OrganizationObject
{
  private String m_strOrgID = "";
  private String m_strOrgParentID = "";
  private String m_strOrgName = "";
  private String m_strOrgOtherName = "";
  private String m_strOrgCode = "";
  private String m_strCompanyID = "";
  private int m_nOrgOrder = 0;
  private int m_nOrgType = 2;
  private String m_strOrgAbbrName = "";
  private String m_strHomePage = "";
  private String m_strDescription = "";
  private String m_strEMail = "";
  private String m_strAddress = "";
  private String m_strAddressDetail = "";
  private String m_strZipCode = "";
  private String m_strTelephone = "";
  private String m_strFax = "";
  private int m_nIsDeleted = 0;
  private int m_nIsODCD = 0;
  private int m_nIsInstitution = 0;
  private int m_nIsInspection = 0;
  private int m_nIsProxyDocHandleDept = 0;

  private int m_nOrgLevel = 0;
  private String m_strLDAPOrgID = "";

  public int getOrgType()
  {
    return this.m_nOrgType;
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

  public String getCompanyID()
  {
    return this.m_strCompanyID;
  }

  public String getOrgCode()
  {
    return this.m_strOrgCode;
  }

  public int getIsInspection()
  {
    return this.m_nIsInspection;
  }

  public int getIsInstitution()
  {
    return this.m_nIsInstitution;
  }

  public int getIsODCD()
  {
    return this.m_nIsODCD;
  }

  public int getIsProxyDocHandleDept()
  {
    return this.m_nIsProxyDocHandleDept;
  }

  public void setOrgType(int nOrgType)
  {
    this.m_nOrgType = nOrgType;
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

  public void setCompanyID(String strCompanyID)
  {
    this.m_strCompanyID = strCompanyID;
  }

  public void setOrgCode(String strOrgCode)
  {
    this.m_strOrgCode = strOrgCode;
  }

  public void setIsInspection(int nIsInspection)
  {
    this.m_nIsInspection = nIsInspection;
  }

  public void setIsInstitution(int nIsInstitution)
  {
    this.m_nIsInstitution = nIsInstitution;
  }

  public void setIsODCD(int nIsODCD)
  {
    this.m_nIsODCD = nIsODCD;
  }

  public void setIsProxyDocHandleDept(int nIsProxyDocHandleDept)
  {
    this.m_nIsProxyDocHandleDept = nIsProxyDocHandleDept;
  }

  public String getOrgAbbrName()
  {
    return this.m_strOrgAbbrName;
  }

  public void setOrgAbbrName(String strOrgAbbrName)
  {
    this.m_strOrgAbbrName = strOrgAbbrName;
  }

  public String getHomePage()
  {
    return this.m_strHomePage;
  }

  public void setHomePage(String strHomePage)
  {
    this.m_strHomePage = strHomePage;
  }

  public String getDescription()
  {
    return this.m_strDescription;
  }

  public void setDescription(String strDescription)
  {
    this.m_strDescription = strDescription;
  }

  public String getEMail()
  {
    return this.m_strEMail;
  }

  public void setEMail(String strEmail)
  {
    this.m_strEMail = strEmail;
  }

  public String getAddress()
  {
    return this.m_strAddress;
  }

  public void setAddress(String strAddress)
  {
    this.m_strAddress = strAddress;
  }

  public String getAddressDetail()
  {
    return this.m_strAddressDetail;
  }

  public void setAddressDetail(String strAddressDetail)
  {
    this.m_strAddressDetail = strAddressDetail;
  }

  public String getZipCode()
  {
    return this.m_strZipCode;
  }

  public void setZipCode(String strZipCode)
  {
    this.m_strZipCode = strZipCode;
  }

  public String getTelephone()
  {
    return this.m_strTelephone;
  }

  public void setTelephone(String strTelephone)
  {
    this.m_strTelephone = strTelephone;
  }

  public String getFax()
  {
    return this.m_strFax;
  }

  public void setFax(String strFax)
  {
    this.m_strFax = strFax;
  }

  public int getIsDeleted()
  {
    return this.m_nIsDeleted;
  }

  public void setIsDeleted(int nIsDeleted)
  {
    this.m_nIsDeleted = nIsDeleted;
  }

  public void setOrgOtherName(String strOrgOtherName) {
    this.m_strOrgOtherName = strOrgOtherName;
  }

  public String getOrgOtherName()
  {
    return this.m_strOrgOtherName;
  }

  public int getOrgLevel() {
    return this.m_nOrgLevel;
  }

  public void setOrgLevel(int nOrgLevel) {
    this.m_nOrgLevel = nOrgLevel;
  }

  public String getLDAPOrgID()
  {
    return this.m_strLDAPOrgID;
  }

  public void setLDAPOrgID(String strOrgID) {
    this.m_strLDAPOrgID = strOrgID;
  }

  public String getData()
  {
    String strData = "";

    strData = this.m_strOrgID + "*" + this.m_strOrgParentID + "*" + this.m_strOrgName + "*" + this.m_strOrgOtherName + "*" + this.m_strOrgCode + "*" + 
      this.m_strCompanyID + "*" + this.m_nOrgOrder + "*" + this.m_nOrgType + "*";
    return strData;
  }
}