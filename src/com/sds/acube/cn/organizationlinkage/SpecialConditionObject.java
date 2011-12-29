package com.sds.acube.cn.organizationlinkage;

import java.util.LinkedList;

public class SpecialConditionObject
{
  private String m_strConditionColumn = "";
  private String[] m_arrValues = null;
  private boolean m_bInsert = false;
  private boolean m_bUpdate = false;
  private boolean m_bDelete = false;

  private LinkedList m_llInsertRestrictionInfo = null;
  private LinkedList m_llUpdateRestrictionInfo = null;
  private LinkedList m_llDeleteRestrictionInfo = null;

  public boolean isDelete()
  {
    return this.m_bDelete;
  }

  public void setDelete(boolean delete) {
    this.m_bDelete = delete;
  }

  public boolean isInsert() {
    return this.m_bInsert;
  }

  public void setInsert(boolean insert) {
    this.m_bInsert = insert;
  }

  public boolean isUpdate() {
    return this.m_bUpdate;
  }

  public void setUpdate(boolean update) {
    this.m_bUpdate = update;
  }

  public LinkedList getDeleteRestrictionInfo() {
    return this.m_llDeleteRestrictionInfo;
  }

  public void setDeleteRestrictionInfo(LinkedList deleteRestrictionInfo) {
    this.m_llDeleteRestrictionInfo = deleteRestrictionInfo;
  }

  public LinkedList getInsertRestrictionInfo() {
    return this.m_llInsertRestrictionInfo;
  }

  public void setInsertRestrictionInfo(LinkedList insertRestrictionInfo) {
    this.m_llInsertRestrictionInfo = insertRestrictionInfo;
  }

  public LinkedList getUpdateRestrictionInfo() {
    return this.m_llUpdateRestrictionInfo;
  }

  public void setUpdateRestrictionInfo(LinkedList updateRestrictionInfo) {
    this.m_llUpdateRestrictionInfo = updateRestrictionInfo;
  }

  public String getConditionColumn() {
    return this.m_strConditionColumn;
  }

  public void setConditionColumn(String conditionColumn) {
    this.m_strConditionColumn = conditionColumn;
  }

  public void createInsertResttrictionInfo()
  {
    this.m_llInsertRestrictionInfo = new LinkedList();
  }

  public void createUpdateRestrictionInfo()
  {
    this.m_llUpdateRestrictionInfo = new LinkedList();
  }

  public void createDeleteRestrictionInfo()
  {
    this.m_llDeleteRestrictionInfo = new LinkedList();
  }

  public String[] getValues() {
    return this.m_arrValues;
  }

  public void setValues(String[] values) {
    this.m_arrValues = values;
  }

  public void addInsertColumn(Object obj) {
    if (this.m_llInsertRestrictionInfo == null) {
      this.m_llInsertRestrictionInfo = new LinkedList();
    }
    this.m_llInsertRestrictionInfo.addLast(obj);
  }

  public void addUpdateColumn(Object obj) {
    if (this.m_llUpdateRestrictionInfo == null) {
      this.m_llUpdateRestrictionInfo = new LinkedList();
    }
    this.m_llUpdateRestrictionInfo.addLast(obj);
  }

  public void addDeleteColumn(Object obj) {
    if (this.m_llDeleteRestrictionInfo == null) {
      this.m_llDeleteRestrictionInfo = new LinkedList();
    }
    this.m_llDeleteRestrictionInfo.addLast(obj);
  }

  public boolean isExistColumnValue(String strValue)
  {
    for (int i = 0; i < this.m_arrValues.length; i++)
    {
      if (this.m_arrValues[i].equals(strValue)) {
        return true;
      }
    }
    return false;
  }
}