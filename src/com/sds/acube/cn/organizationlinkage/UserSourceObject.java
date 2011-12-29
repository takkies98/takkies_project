package com.sds.acube.cn.organizationlinkage;

public final class UserSourceObject extends SourceObject
{
  private String m_strUserID = "";
  private String m_strUserName = "";
  private String m_strUserEName = "";
  private String m_strGroupID = "";
  private String m_strGroupName = "";
  private String m_strCompID = "";
  private String m_strCompName = "";
  private String m_strDeptID = "";
  private String m_strDeptName = "";
  private String m_strGradeCode = "";
  private String m_strGradeName = "";
  private String m_strGradeAbbrName = "";
  private int m_nGradeOrder = 0;
  private String m_strTitleCode = "";
  private String m_strTitleName = "";
  private int m_nTitleOrder = 0;
  private String m_strPositionCode = "";
  private String m_strPositionName = "";
  private String m_strPositionAbbrName = "";
  private int m_nPositionOrder = 0;
  private int m_nUserOrder = 0;
  private String m_strResidentNO = "";
  private String m_strEmplyeeID = "";
  private String m_strSecurityLevel = "0";
  private String m_strSysMail = "";
  private String m_strEMail = "";
  private int m_nUserStatus = 0;
  private String m_strServers = "";
  private String m_strOfficeTel = "";
  private String m_strOfficeTel2 = "";
  private String m_strOfficeFax = "";
  private String m_strOfficeAddr = "";
  private String m_strOfficeAddrDetail = "";
  private String m_strOfficeZipCode = "";
  private String m_strHomePage = "";
  private String m_strHomeTel = "";
  private String m_strHomeTel2 = "";
  private String m_strMobile = "";
  private String m_strMobile2 = "";
  private String m_strPager = "";
  private String m_strHomeAddr = "";
  private String m_strHomeAddrDetail = "";
  private String m_strHomeZipCode = "";
  private String m_strHomeFax = "";
  private String m_strDuty = "";
  private String m_strDescription = "";
  private String m_strSystemPassword = "";
  private String m_strIsCheckPortal = "";

  public String getSource()
  {
    String strSource = "";
    strSource = this.m_strUserID + "*" + this.m_strUserName + "*" + this.m_strUserEName + "*" + this.m_strGroupID + "*" + this.m_strGroupName + "*" + this.m_strCompID + "*" + this.m_strCompName + "*" + 
      this.m_strDeptID + "*" + this.m_strDeptName + "*" + this.m_strGradeCode + "*" + this.m_strGradeName + "*" + this.m_strGradeAbbrName + "*" + this.m_nGradeOrder + "*" + 
      this.m_strTitleCode + "*" + this.m_strTitleName + "*" + this.m_nTitleOrder + "*" + this.m_strPositionCode + "*" + this.m_strPositionName + "*" + this.m_strPositionAbbrName + "*" + 
      this.m_nPositionOrder + "*" + this.m_nUserOrder + "*" + this.m_strResidentNO + "*" + this.m_strEmplyeeID + "*" + this.m_strSecurityLevel + "*" + this.m_strSysMail + "*" + 
      this.m_strEMail + "*" + this.m_nUserStatus + "*" + this.m_strServers + "*" + this.m_strOfficeTel + "*" + this.m_strOfficeTel2 + "*" + this.m_strOfficeFax + "*" + this.m_strOfficeAddr + "*" + 
      this.m_strOfficeAddrDetail + "*" + this.m_strOfficeZipCode + "*" + this.m_strHomePage + "*" + this.m_strHomeTel + "*" + this.m_strHomeTel2 + "*" + this.m_strMobile + "*" + this.m_strMobile2 + "*" + 
      this.m_strPager + "*" + this.m_strHomeAddr + "*" + this.m_strHomeAddrDetail + "*" + this.m_strHomeZipCode + "*" + this.m_strHomeFax + "*" + this.m_strDuty + "*" + 
      this.m_strDescription + "*" + this.m_strSystemPassword + "*" + this.m_strIsCheckPortal + "*" + getCreateDate() + "*";
    return strSource;
  }

  public String getDeptID()
  {
    return this.m_strDeptID;
  }

  public String getEmplyeeID()
  {
    return this.m_strEmplyeeID;
  }

  public String getGradeCode()
  {
    return this.m_strGradeCode;
  }

  public String getPositionCode()
  {
    return this.m_strPositionCode;
  }

  public String getResidentNO()
  {
    return this.m_strResidentNO;
  }

  public String getUserEName()
  {
    return this.m_strUserEName;
  }

  public String getUserID()
  {
    return this.m_strUserID;
  }

  public String getUserName()
  {
    return this.m_strUserName;
  }

  public String getDuty()
  {
    return this.m_strDuty;
  }

  public String getHomeAddr()
  {
    return this.m_strHomeAddr;
  }

  public String getHomeTel()
  {
    return this.m_strHomeTel;
  }

  public String getMobile()
  {
    return this.m_strMobile;
  }

  public String getSecurityLevel()
  {
    return this.m_strSecurityLevel;
  }

  public void setDeptID(String strDeptID)
  {
    this.m_strDeptID = strDeptID;
  }

  public void setEmplyeeID(String strEmplyeeID)
  {
    this.m_strEmplyeeID = strEmplyeeID;
  }

  public void setGradeCode(String strGradeCode)
  {
    this.m_strGradeCode = strGradeCode;
  }

  public void setPositionCode(String strPositionCode)
  {
    this.m_strPositionCode = strPositionCode;
  }

  public void setResidentNO(String strResidentNO)
  {
    this.m_strResidentNO = strResidentNO;
  }

  public void setUserEName(String strUserEName)
  {
    this.m_strUserEName = strUserEName;
  }

  public void setUserID(String strUserID)
  {
    this.m_strUserID = strUserID;
  }

  public void setUserName(String strUserName)
  {
    this.m_strUserName = strUserName;
  }

  public void setDuty(String strDuty)
  {
    this.m_strDuty = strDuty;
  }

  public void setHomeAddr(String strHomeAddr)
  {
    this.m_strHomeAddr = strHomeAddr;
  }

  public void setHomeTel(String strHomeTel)
  {
    this.m_strHomeTel = strHomeTel;
  }

  public void setMobile(String strMobile)
  {
    this.m_strMobile = strMobile;
  }

  public void setSecurityLevel(String strSecurityLevel)
  {
    this.m_strSecurityLevel = strSecurityLevel;
  }

  public String getGroupID()
  {
    return this.m_strGroupID;
  }

  public void setGroupID(String strGroupID)
  {
    this.m_strGroupID = strGroupID;
  }

  public String getGroupName()
  {
    return this.m_strGroupName;
  }

  public void setGroupName(String strGroupName)
  {
    this.m_strGroupName = strGroupName;
  }

  public String getCompID()
  {
    return this.m_strCompID;
  }

  public void setCompID(String strCompID)
  {
    this.m_strCompID = strCompID;
  }

  public String getCompName()
  {
    return this.m_strCompName;
  }

  public void setCompName(String strCompName)
  {
    this.m_strCompName = strCompName;
  }

  public String getDeptName()
  {
    return this.m_strDeptName;
  }

  public void setDeptName(String strDeptName)
  {
    this.m_strDeptName = strDeptName;
  }

  public String getGradeName()
  {
    return this.m_strGradeName;
  }

  public void setGradeName(String strGradeName)
  {
    this.m_strGradeName = strGradeName;
  }

  public String getGradeAbbrName()
  {
    return this.m_strGradeAbbrName;
  }

  public void setGradeAbbrName(String strGradeAbbrName)
  {
    this.m_strGradeAbbrName = strGradeAbbrName;
  }

  public int getGradeOrder()
  {
    return this.m_nGradeOrder;
  }

  public void setGradeOrder(int nGradeOrder)
  {
    this.m_nGradeOrder = nGradeOrder;
  }

  public String getTitleCode()
  {
    return this.m_strTitleCode;
  }

  public void setTitleCode(String strTitleCode)
  {
    this.m_strTitleCode = strTitleCode;
  }

  public String getTitleName()
  {
    return this.m_strTitleName;
  }

  public void setTitleName(String strTitleName)
  {
    this.m_strTitleName = strTitleName;
  }

  public int getTitleOrder()
  {
    return this.m_nTitleOrder;
  }

  public void setTitleOrder(int nTitleOrder)
  {
    this.m_nTitleOrder = nTitleOrder;
  }

  public String getPositionAbbrName()
  {
    return this.m_strPositionAbbrName;
  }

  public void setPositionAbbrName(String strPositionAbbrName)
  {
    this.m_strPositionAbbrName = strPositionAbbrName;
  }

  public String getPositionName()
  {
    return this.m_strPositionName;
  }

  public void setPositionName(String strPositionName)
  {
    this.m_strPositionName = strPositionName;
  }

  public int getPositionOrder()
  {
    return this.m_nPositionOrder;
  }

  public void setPositionOrder(int nPositionOrder)
  {
    this.m_nPositionOrder = nPositionOrder;
  }

  public int getUserOrder()
  {
    return this.m_nUserOrder;
  }

  public void setUserOrder(int nUserOrder)
  {
    this.m_nUserOrder = nUserOrder;
  }

  public String getEMail()
  {
    return this.m_strEMail;
  }

  public void setEMail(String strEmail)
  {
    this.m_strEMail = strEmail;
  }

  public String getSysMail()
  {
    return this.m_strSysMail;
  }

  public void setSysMail(String strSysMail)
  {
    this.m_strSysMail = strSysMail;
  }

  public int getUserStatus()
  {
    return this.m_nUserStatus;
  }

  public void setUserStatus(int nUserStatus)
  {
    this.m_nUserStatus = nUserStatus;
  }

  public String getServers()
  {
    return this.m_strServers;
  }

  public void setServers(String strServers)
  {
    this.m_strServers = strServers;
  }

  public String getOfficeAddr()
  {
    return this.m_strOfficeAddr;
  }

  public void setOfficeAddr(String strOfficeAddr)
  {
    this.m_strOfficeAddr = strOfficeAddr;
  }

  public String getOfficeAddrDetail()
  {
    return this.m_strOfficeAddrDetail;
  }

  public void setOfficeAddrDetail(String strOfficeAddrDetail)
  {
    this.m_strOfficeAddrDetail = strOfficeAddrDetail;
  }

  public String getOfficeFax()
  {
    return this.m_strOfficeFax;
  }

  public void setOfficeFax(String strOfficeFax)
  {
    this.m_strOfficeFax = strOfficeFax;
  }

  public String getOfficeTel()
  {
    return this.m_strOfficeTel;
  }

  public void setOfficeTel(String strOfficeTel)
  {
    this.m_strOfficeTel = strOfficeTel;
  }

  public String getOfficeTel2()
  {
    return this.m_strOfficeTel2;
  }

  public void setOfficeTel2(String strOfficeTel2)
  {
    this.m_strOfficeTel2 = strOfficeTel2;
  }

  public String getOfficeZipCode()
  {
    return this.m_strOfficeZipCode;
  }

  public void setOfficeZipCode(String strOfficeZipCode)
  {
    this.m_strOfficeZipCode = strOfficeZipCode;
  }

  public String getHomeAddrDetail()
  {
    return this.m_strHomeAddrDetail;
  }

  public void setHomeAddrDetail(String strHomeAddrDetail)
  {
    this.m_strHomeAddrDetail = strHomeAddrDetail;
  }

  public String getHomeFax()
  {
    return this.m_strHomeFax;
  }

  public void setHomeFax(String strHomeFax)
  {
    this.m_strHomeFax = strHomeFax;
  }

  public String getHomeTel2()
  {
    return this.m_strHomeTel2;
  }

  public void setHomeTel2(String strHomeTel2)
  {
    this.m_strHomeTel2 = strHomeTel2;
  }

  public String getHomeZipCode()
  {
    return this.m_strHomeZipCode;
  }

  public void setHomeZipCode(String strHomeZipCode)
  {
    this.m_strHomeZipCode = strHomeZipCode;
  }

  public String getMobile2()
  {
    return this.m_strMobile2;
  }

  public void setMobile2(String strMobile2)
  {
    this.m_strMobile2 = strMobile2;
  }

  public String getPager()
  {
    return this.m_strPager;
  }

  public void setPager(String strPager)
  {
    this.m_strPager = strPager;
  }

  public String getDescription()
  {
    return this.m_strDescription;
  }

  public void setDescription(String strDescription)
  {
    this.m_strDescription = strDescription;
  }

  public String getIsCheckPortal()
  {
    return this.m_strIsCheckPortal;
  }

  public void setIsCheckPortal(String strIsCheckPortal)
  {
    this.m_strIsCheckPortal = strIsCheckPortal;
  }

  public String getSystemPassword()
  {
    return this.m_strSystemPassword;
  }

  public void setSystemPassword(String strSystemPassword)
  {
    this.m_strSystemPassword = strSystemPassword;
  }

  public String getHomePage()
  {
    return this.m_strHomePage;
  }

  public void setHomePage(String strHomePage) {
    this.m_strHomePage = strHomePage;
  }
}