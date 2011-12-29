package com.sds.acube.cn.organizationlinkage;

public class PositionSourceObject extends SourceObject
{
  private String m_strPositionID = "";
  private String m_strPositionName = "";
  private String m_strPositionOtherName = "";
  private String m_strPositionParentID = "";
  private String m_strPositionAbbrName = "";
  private int m_nPositionOrder = 0;

  public String getSource()
  {
    String strSource = "";
    strSource = this.m_strPositionID + "*" + this.m_strPositionName + "*" + this.m_strPositionOtherName + "*" + this.m_strPositionParentID + "*" + 
      this.m_strPositionAbbrName + "*" + this.m_nPositionOrder + "*" + getCreateDate() + "*";
    return strSource;
  }

  public int getPositionOrder()
  {
    return this.m_nPositionOrder;
  }

  public String getPositionAbbrName()
  {
    return this.m_strPositionAbbrName;
  }

  public String getPositionID()
  {
    return this.m_strPositionID;
  }

  public String getPositionName()
  {
    return this.m_strPositionName;
  }

  public String getPositionOtherName()
  {
    return this.m_strPositionOtherName;
  }

  public String getPositionParentID()
  {
    return this.m_strPositionParentID;
  }

  public void setPositionOrder(int nPositionOrder)
  {
    this.m_nPositionOrder = nPositionOrder;
  }

  public void setPositionAbbrName(String strPositionAbbrName)
  {
    this.m_strPositionAbbrName = strPositionAbbrName;
  }

  public void setPositionID(String strPositionID)
  {
    this.m_strPositionID = strPositionID;
  }

  public void setPositionName(String strPositionName)
  {
    this.m_strPositionName = strPositionName;
  }

  public void setPositionOtherName(String strPositionOtherName)
  {
    this.m_strPositionOtherName = strPositionOtherName;
  }

  public void setPositionParentID(String strPositionParentID)
  {
    this.m_strPositionParentID = strPositionParentID;
  }
}