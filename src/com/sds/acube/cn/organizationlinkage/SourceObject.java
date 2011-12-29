package com.sds.acube.cn.organizationlinkage;

public class SourceObject
{
  private String m_strActionType;
  private String m_strCreateDate;
  private String m_strApplyDate;
  private String m_strApp;
  private int m_nObjectType = 0;

  public int getObjectType()
  {
    return this.m_nObjectType;
  }

  public String getActionType()
  {
    return this.m_strActionType;
  }

  public String getApplyDate()
  {
    return this.m_strApplyDate;
  }

  public String getCreateDate()
  {
    return this.m_strCreateDate;
  }

  public String getApp()
  {
    return this.m_strApp;
  }

  public void setObjectType(int nObjectType)
  {
    this.m_nObjectType = nObjectType;
  }

  public void setActionType(String strActionType)
  {
    this.m_strActionType = strActionType;
  }

  public void setApplyDate(String strApplyDate)
  {
    this.m_strApplyDate = strApplyDate;
  }

  public void setCreateDate(String strCreateDate)
  {
    this.m_strCreateDate = strCreateDate;
  }

  public void setApp(String strApp)
  {
    this.m_strApp = strApp;
  }
}