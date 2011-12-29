package com.sds.acube.cn.organizationlinkage;

public class OrganizationHierarchyObject
{
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

  public String getGroupID()
  {
    return this.m_strGroupID;
  }

  public String getGroupName()
  {
    return this.m_strGroupName;
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

  public String getPartID()
  {
    return this.m_strPartID;
  }

  public String getPartName()
  {
    return this.m_strPartName;
  }

  public void setGroupID(String strGroupID)
  {
    this.m_strGroupID = strGroupID;
  }

  public void setGroupName(String strGroupName)
  {
    this.m_strGroupName = strGroupName;
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

  public void setPartID(String strPartID)
  {
    this.m_strPartID = strPartID;
  }

  public void setPartName(String strPartName)
  {
    this.m_strPartName = strPartName;
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

  public String getPartOtherName() {
    return this.m_strPartOtherName;
  }

  public void setPartOtherName(String strPartOtherName) {
    this.m_strPartOtherName = strPartOtherName;
  }
}