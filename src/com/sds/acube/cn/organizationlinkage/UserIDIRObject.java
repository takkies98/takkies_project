package com.sds.acube.cn.organizationlinkage;

public final class UserIDIRObject
{
  private String m_strUserID = "";
  private String m_strUserName = "";
  private String m_strUserOtherName = "";
  private String m_strUserUID = "";
  private String m_strGroupID = "";
  private String m_strGroupName = "";
  private String m_strGroupOtherName = "";
  private String m_strCompID = "";
  private String m_strCompName = "";
  private String m_strCompOtherName = "";
  private String m_strDeptID = "";
  private String m_strDeptName = "";
  private String m_strDeptOtherName = "";
  private String m_strPartID = "";
  private String m_strPartName = "";
  private String m_strPartOtherName = "";
  private String m_strOrgDisplayName = "";
  private String m_strOrgDisplayOtherName = "";
  private String m_strGradeCode = "";
  private String m_strGradeName = "";
  private String m_strGradeOtherName = "";
  private int m_nGradeOrder = 999999;
  private String m_strPositionCode = "";
  private String m_strPositionName = "";
  private String m_strPositionOtherName = "";
  private String m_strTitleCode = "";
  private String m_strTitleName = "";
  private int m_nUserOrder = 999999;
  private int m_nSecurityLevel = 5;
  private String m_strRoleCode = "";
  private String m_strResidentNO = "";
  private String m_strEmployeeID = "";
  private String m_strSysMail = "";
  private String m_strServers = "";
  private int m_nIsConcurrent = 0;
  private int m_nIsProxy = 0;
  private int m_nIsDelegate = 0;
  private int m_nIsExistence = 1;
  private String m_strUserRID = "";
  private int m_nIsDeleted = 0;
  private String m_strDescription = "";
  private String m_strReserved1 = "";
  private String m_strReserved2 = "";
  private String m_strReserved3 = "";
  private String m_strOptionalGTPName = "";

  private String m_strHomePage = "";
  private String m_strEMail = "";
  private String m_strOfficeTel = "";
  private String m_strOfficeTel2 = "";
  private String m_strOfficeAddr = "";
  private String m_strOfficeDetailAddr = "";
  private String m_strOfficeZipCode = "";
  private String m_strOfficeFAX = "";
  private String m_strMobile = "";
  private String m_strMobile2 = "";
  private String m_strPager = "";
  private String m_strHomeAddr = "";
  private String m_strHomeDetailAddr = "";
  private String m_strHomeZipCode = "";
  private String m_strHomeTel = "";
  private String m_strHomeTel2 = "";
  private String m_strHomeFax = "";
  private String m_strDuty = "";

  private String m_strPassword = "";

  private String m_strEPID = "";
  private String m_strSingleUID = "";
  private String m_strEmployeeType = "";

  public String getData()
  {
    String strData = "";

    strData = this.m_strUserID + "*" + this.m_strUserName + "*" + this.m_strUserOtherName + "*" + this.m_strUserUID + "*" + this.m_strGroupID + "*" + this.m_strGroupName + "*" + 
      this.m_strCompID + "*" + this.m_strCompName + "*" + this.m_strDeptID + "*" + this.m_strDeptName + "*" + this.m_strPartID + "*" + this.m_strPartName + "*" + 
      this.m_strOrgDisplayName + "*" + this.m_strGradeCode + "*" + this.m_strGradeName + "*" + this.m_nGradeOrder + "*" + this.m_strPositionCode + "*" + 
      this.m_strPositionName + "*" + this.m_strPositionOtherName + "*" + this.m_strTitleCode + "*" + this.m_strTitleName + "*" + this.m_nUserOrder + "*" + this.m_nSecurityLevel + "*" + this.m_strRoleCode + "*" + 
      this.m_strResidentNO + "*" + this.m_strEmployeeID + "*" + this.m_strSysMail + "*" + this.m_strServers + "*" + this.m_nIsConcurrent + "*" + this.m_nIsProxy + "*" + 
      this.m_nIsDelegate + "*" + this.m_nIsExistence + "*" + this.m_strUserRID + "*" + this.m_nIsDeleted + "*" + this.m_strDescription + "*" + this.m_strReserved1 + "*" + 
      this.m_strReserved2 + "*" + this.m_strReserved3 + "*" + this.m_strHomePage + "*" + this.m_strEMail + "*" + this.m_strOfficeTel + "*" + this.m_strOfficeTel2 + "*" + 
      this.m_strOfficeAddr + "*" + this.m_strOfficeDetailAddr + "*" + this.m_strOfficeZipCode + "*" + this.m_strOfficeFAX + "*" + this.m_strMobile + "*" + this.m_strMobile2 + "*" + 
      this.m_strPager + "*" + this.m_strHomeAddr + "*" + this.m_strHomeDetailAddr + "*" + this.m_strHomeZipCode + "*" + this.m_strHomeTel + "*" + this.m_strHomeTel2 + "*" + 
      this.m_strHomeFax + "*" + this.m_strDuty + "*" + this.m_strPassword + "*" + this.m_strEPID + "*" + this.m_strSingleUID + "*" + this.m_strEmployeeType + "*";
    return strData;
  }

  public int getIsConcurrent()
  {
    return this.m_nIsConcurrent;
  }

  public int getIsDelegate()
  {
    return this.m_nIsDelegate;
  }

  public int getIsDeleted()
  {
    return this.m_nIsDeleted;
  }

  public int getIsExistence()
  {
    return this.m_nIsExistence;
  }

  public int getIsProxy()
  {
    return this.m_nIsProxy;
  }

  public int getSecurityLevel()
  {
    return this.m_nSecurityLevel;
  }

  public int getUserOrder()
  {
    return this.m_nUserOrder;
  }

  public String getCompID()
  {
    return this.m_strCompID;
  }

  public String getCompName()
  {
    return this.m_strCompName;
  }

  public String getDeptID()
  {
    return this.m_strDeptID;
  }

  public String getDeptName()
  {
    return this.m_strDeptName;
  }

  public String getDescription()
  {
    return this.m_strDescription;
  }

  public String getEmployeeID()
  {
    return this.m_strEmployeeID;
  }

  public String getGradeCode()
  {
    return this.m_strGradeCode;
  }

  public String getGradeName()
  {
    return this.m_strGradeName;
  }

  public int getGradeOrder()
  {
    return this.m_nGradeOrder;
  }

  public String getGroupID()
  {
    return this.m_strGroupID;
  }

  public String getGroupName()
  {
    return this.m_strGroupName;
  }

  public String getOrgDisplayName()
  {
    return this.m_strOrgDisplayName;
  }

  public String getPartID()
  {
    return this.m_strPartID;
  }

  public String getPartName()
  {
    return this.m_strPartName;
  }

  public String getPositionCode()
  {
    return this.m_strPositionCode;
  }

  public String getPositionName()
  {
    return this.m_strPositionName;
  }

  public String getPositionOtherName()
  {
    return this.m_strPositionOtherName;
  }

  public String getReserved1()
  {
    return this.m_strReserved1;
  }

  public String getReserved2()
  {
    return this.m_strReserved2;
  }

  public String getReserved3()
  {
    return this.m_strReserved3;
  }

  public String getResidentNO()
  {
    return this.m_strResidentNO;
  }

  public String getRoleCode()
  {
    return this.m_strRoleCode;
  }

  public String getServers()
  {
    return this.m_strServers;
  }

  public String getSysMail()
  {
    return this.m_strSysMail;
  }

  public String getTitleCode()
  {
    return this.m_strTitleCode;
  }

  public String getTitleName()
  {
    return this.m_strTitleName;
  }

  public String getUserID()
  {
    return this.m_strUserID;
  }

  public String getUserName()
  {
    return this.m_strUserName;
  }

  public String getUserOtherName()
  {
    return this.m_strUserOtherName;
  }

  public String getUserRID()
  {
    return this.m_strUserRID;
  }

  public String getUserUID()
  {
    return this.m_strUserUID;
  }

  public String getPassword()
  {
    return this.m_strPassword;
  }

  public void setIsConcurrent(int nIsConcurrent)
  {
    this.m_nIsConcurrent = nIsConcurrent;
  }

  public void setIsDelegate(int nIsDelegate)
  {
    this.m_nIsDelegate = nIsDelegate;
  }

  public void setIsDeleted(int nIsDeleted)
  {
    this.m_nIsDeleted = nIsDeleted;
  }

  public void setIsExistence(int nIsExistence)
  {
    this.m_nIsExistence = nIsExistence;
  }

  public void setIsProxy(int nIsProxy)
  {
    this.m_nIsProxy = nIsProxy;
  }

  public void setSecurityLevel(int nSecurityLevel)
  {
    this.m_nSecurityLevel = nSecurityLevel;
  }

  public void setUserOrder(int nUserOrder)
  {
    this.m_nUserOrder = nUserOrder;
  }

  public void setCompID(String strCompID)
  {
    this.m_strCompID = strCompID;
  }

  public void setCompName(String strCompName)
  {
    this.m_strCompName = strCompName;
  }

  public void setDeptID(String strDeptID)
  {
    this.m_strDeptID = strDeptID;
  }

  public void setDeptName(String strDeptName)
  {
    this.m_strDeptName = strDeptName;
  }

  public void setDescription(String strDescription)
  {
    this.m_strDescription = strDescription;
  }

  public void setEmployeeID(String strEmployeeID)
  {
    this.m_strEmployeeID = strEmployeeID;
  }

  public void setGradeCode(String strGradeCode)
  {
    this.m_strGradeCode = strGradeCode;
  }

  public void setGradeName(String strGradeName)
  {
    this.m_strGradeName = strGradeName;
  }

  public void setGradeOrder(int nGradeOrder)
  {
    this.m_nGradeOrder = nGradeOrder;
  }

  public void setGroupID(String strGroupID)
  {
    this.m_strGroupID = strGroupID;
  }

  public void setGroupName(String strGroupName)
  {
    this.m_strGroupName = strGroupName;
  }

  public void setOrgDisplayName(String strOrgDisplayName)
  {
    this.m_strOrgDisplayName = strOrgDisplayName;
  }

  public void setPartID(String strPartID)
  {
    this.m_strPartID = strPartID;
  }

  public void setPartName(String strPartName)
  {
    this.m_strPartName = strPartName;
  }

  public void setPositionCode(String strPositionCode)
  {
    this.m_strPositionCode = strPositionCode;
  }

  public void setPositionName(String strPositionName)
  {
    this.m_strPositionName = strPositionName;
  }

  public void setPositionOtherName(String strPositionOtherName)
  {
    this.m_strPositionOtherName = strPositionOtherName;
  }

  public void setReserved1(String strReserved1)
  {
    this.m_strReserved1 = strReserved1;
  }

  public void setReserved2(String strReserved2)
  {
    this.m_strReserved2 = strReserved2;
  }

  public void setReserved3(String strReserved3)
  {
    this.m_strReserved3 = strReserved3;
  }

  public void setResidentNO(String strResidentNO)
  {
    this.m_strResidentNO = strResidentNO;
  }

  public void setRoleCode(String strRoleCode)
  {
    this.m_strRoleCode = strRoleCode;
  }

  public void setServers(String strServers)
  {
    this.m_strServers = strServers;
  }

  public void setSysMail(String strSysMail)
  {
    this.m_strSysMail = strSysMail;
  }

  public void setTitleCode(String strTitleCode)
  {
    this.m_strTitleCode = strTitleCode;
  }

  public void setTitleName(String strTitleName)
  {
    this.m_strTitleName = strTitleName;
  }

  public void setUserID(String strUserID)
  {
    this.m_strUserID = strUserID;
  }

  public void setUserName(String strUserName)
  {
    this.m_strUserName = strUserName;
  }

  public void setUserOtherName(String strUserOtherName)
  {
    this.m_strUserOtherName = strUserOtherName;
  }

  public void setUserRID(String strUserRID)
  {
    this.m_strUserRID = strUserRID;
  }

  public void setUserUID(String strUserUID)
  {
    this.m_strUserUID = strUserUID;
  }

  public void setPassword(String strPassword)
  {
    this.m_strPassword = strPassword;
  }

  public String getHomeAddr()
  {
    return this.m_strHomeAddr;
  }

  public String getHomeDetailAddr()
  {
    return this.m_strHomeDetailAddr;
  }

  public String getHomeTel()
  {
    return this.m_strHomeTel;
  }

  public String getHomeZipCode()
  {
    return this.m_strHomeZipCode;
  }

  public String getMobile()
  {
    return this.m_strMobile;
  }

  public String getOfficeAddr()
  {
    return this.m_strOfficeAddr;
  }

  public String getOfficeDetailAddr()
  {
    return this.m_strOfficeDetailAddr;
  }

  public String getOfficeFAX()
  {
    return this.m_strOfficeFAX;
  }

  public String getOfficeTel()
  {
    return this.m_strOfficeTel;
  }

  public String getOfficeZipCode()
  {
    return this.m_strOfficeZipCode;
  }

  public String getEMail()
  {
    return this.m_strEMail;
  }

  public void setHomeAddr(String strHomeAddr)
  {
    this.m_strHomeAddr = strHomeAddr;
  }

  public void setHomeDetailAddr(String strHomeDetailAddr)
  {
    this.m_strHomeDetailAddr = strHomeDetailAddr;
  }

  public void setHomeTel(String strHomeTel)
  {
    this.m_strHomeTel = strHomeTel;
  }

  public void setHomeZipCode(String strHomeZipCode)
  {
    this.m_strHomeZipCode = strHomeZipCode;
  }

  public void setMobile(String strMobile)
  {
    this.m_strMobile = strMobile;
  }

  public void setOfficeAddr(String strOfficeAddr)
  {
    this.m_strOfficeAddr = strOfficeAddr;
  }

  public void setOfficeDetailAddr(String strOfficeDetailAddr)
  {
    this.m_strOfficeDetailAddr = strOfficeDetailAddr;
  }

  public void setOfficeFAX(String strOfficeFAX)
  {
    this.m_strOfficeFAX = strOfficeFAX;
  }

  public void setOfficeTel(String strOfficeTel)
  {
    this.m_strOfficeTel = strOfficeTel;
  }

  public void setOfficeZipCode(String strOfficeZipCode)
  {
    this.m_strOfficeZipCode = strOfficeZipCode;
  }

  public void setEMail(String strEMail)
  {
    this.m_strEMail = strEMail;
  }

  public String getDuty()
  {
    return this.m_strDuty;
  }

  public void setDuty(String strDuty)
  {
    this.m_strDuty = strDuty;
  }

  public String getHomePage()
  {
    return this.m_strHomePage;
  }

  public void setHomePage(String strHomePage)
  {
    this.m_strHomePage = strHomePage;
  }

  public String getOfficeTel2()
  {
    return this.m_strOfficeTel2;
  }

  public void setOfficeTel2(String strOfficeTel2)
  {
    this.m_strOfficeTel2 = strOfficeTel2;
  }

  public String getMobile2()
  {
    return this.m_strMobile2;
  }

  public void setMobile2(String strMobile2)
  {
    this.m_strMobile2 = strMobile2;
  }

  public String getHomeTel2()
  {
    return this.m_strHomeTel2;
  }

  public void setHomeTel2(String strHomeTel2)
  {
    this.m_strHomeTel2 = strHomeTel2;
  }

  public String getPager()
  {
    return this.m_strPager;
  }

  public void setPager(String strPager)
  {
    this.m_strPager = strPager;
  }

  public String getHomeFax()
  {
    return this.m_strHomeFax;
  }

  public void setHomeFax(String strHomeFax)
  {
    this.m_strHomeFax = strHomeFax;
  }

  public String getEPID() {
    return this.m_strEPID;
  }

  public void setEPID(String strEPID) {
    this.m_strEPID = strEPID;
  }

  public String getSingleUID() {
    return this.m_strSingleUID;
  }

  public void setSingleUID(String strSingleUID) {
    this.m_strSingleUID = strSingleUID;
  }

  public String getEmployeeType() {
    return this.m_strEmployeeType;
  }

  public void setEmployeeType(String strEmployeeType) {
    this.m_strEmployeeType = strEmployeeType;
  }

  public String getGradeOtherName() {
    return this.m_strGradeOtherName;
  }

  public void setGradeOtherName(String strGradeOtherName) {
    this.m_strGradeOtherName = strGradeOtherName;
  }

  public String getCompOtherName() {
    return this.m_strCompOtherName;
  }

  public void setCompOtherName(String strCompOtherName) {
    this.m_strCompOtherName = strCompOtherName;
  }

  public String getDeptOtherName() {
    return this.m_strDeptOtherName;
  }

  public void setDeptOtherName(String strDeptOtherName) {
    this.m_strDeptOtherName = strDeptOtherName;
  }

  public String getGroupOtherName() {
    return this.m_strGroupOtherName;
  }

  public void setGroupOtherName(String strGroupOtherName) {
    this.m_strGroupOtherName = strGroupOtherName;
  }

  public String getOrgDisplayOtherName() {
    return this.m_strOrgDisplayOtherName;
  }

  public void setOrgDisplayOtherName(String strOrgDisplayOtherName) {
    this.m_strOrgDisplayOtherName = strOrgDisplayOtherName;
  }

  public String getPartOtherName() {
    return this.m_strPartOtherName;
  }

  public void setPartOtherName(String strPartOtherName) {
    this.m_strPartOtherName = strPartOtherName;
  }

  public String getOptionalGTPName() {
    return this.m_strOptionalGTPName;
  }

  public void setOptionalGTPName(String strOptionalGTPName) {
    this.m_strOptionalGTPName = strOptionalGTPName;
  }
}