package com.sds.acube.cn.organizationlinkage;

public class UserRoleObject
{
  private String m_strOrgID = "";
  private String m_strUserUID = "";
  private String m_strRoleCode = "";

  public String getOrgID() {
    return this.m_strOrgID;
  }

  public void setOrgID(String strOrgID) {
    this.m_strOrgID = strOrgID;
  }

  public String getUserUID() {
    return this.m_strUserUID;
  }

  public void setUserUID(String strUserUID) {
    this.m_strUserUID = strUserUID;
  }

  public String getRoleCode() {
    return this.m_strRoleCode;
  }

  public void setRoleCode(String strRoleCode) {
    this.m_strRoleCode = strRoleCode;
  }
}