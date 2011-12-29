package com.sds.acube.cn.organizationlinkage;

public class RestrictionColumnInfoObject
{
  private String m_strType = "";
  private String m_strColumnName = "";
  private String m_strColumnValue = "";

  public String getColumnName()
  {
    return this.m_strColumnName;
  }
  public void setColumnName(String strColumnName) {
    this.m_strColumnName = strColumnName;
  }
  public String getColumnValue() {
    return this.m_strColumnValue;
  }
  public void setColumnValue(String strColumnValue) {
    this.m_strColumnValue = strColumnValue;
  }
  public String getType() {
    return this.m_strType;
  }
  public void setType(String strType) {
    this.m_strType = strType;
  }
}