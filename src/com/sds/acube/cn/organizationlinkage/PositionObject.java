package com.sds.acube.cn.organizationlinkage;

public class PositionObject
{
  private String m_strPositionID = "";
  private String m_strPositionName = "";
  private String m_strPositionAbbrName = "";
  private String m_strPositionOtherName = "";
  private String m_strPositionParentID = "";
  private String m_strCompID = "";
  private int m_nPositionOrder = 0;
  private String m_strDescription = "";

  public int getPositionOrder()
  {
    return this.m_nPositionOrder;
  }

  public String getCompID()
  {
    return this.m_strCompID;
  }

  public String getDescription()
  {
    return this.m_strDescription;
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

  public void setCompID(String strCompID)
  {
    this.m_strCompID = strCompID;
  }

  public void setDescription(String strDescription)
  {
    this.m_strDescription = strDescription;
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