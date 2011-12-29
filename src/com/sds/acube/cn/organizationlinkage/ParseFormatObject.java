package com.sds.acube.cn.organizationlinkage;

public final class ParseFormatObject
{
  private String m_strSyntax = "";
  private String m_strOtherSyntax = "";
  private int m_nType = 1;

  public int getType()
  {
    return this.m_nType;
  }

  public String getSyntax()
  {
    return this.m_strSyntax;
  }

  public void setType(int nType)
  {
    this.m_nType = nType;
  }

  public void setSyntax(String strSyntax)
  {
    this.m_strSyntax = strSyntax;
  }

  public String getOtherSyntax() {
    return this.m_strOtherSyntax;
  }

  public void setOtherSyntax(String strOtherSyntax) {
    this.m_strOtherSyntax = strOtherSyntax;
  }
}