package com.sds.acube.cn.organizationlinkage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Properties;

public class PropertyObject
{
  public static String ORGANIZATION_CONNECTION_METHOD = "ORGANIZATION_CONNECTION_METHOD";
  public static String ORGANIZATION_CONNECTION_CLASSNAME = "ORGANIZATION_CONNECTION_CLASSNAME";
  public static String ORGANIZATION_CONNECTION_URL = "ORGANIZATION_CONNECTION_URL";
  public static String ORGANIZATION_CONNECTION_DSNAME = "ORGANIZATION_CONNECTION_DSNAME";
  public static String ORGANIZATION_CONNECTION_DB_TYPE = "ORGANIZATION_CONNECTION_DB_TYPE";
  public static String ORGANIZATION_CONNECTION_WAS_TYPE = "ORGANIZATION_CONNECTION_WAS_TYPE";
  public static String ORGANIZATION_CONNECTION_DB_USER = "ORGANIZATION_CONNECTION_DB_USER";
  public static String ORGANIZATION_CONNECTION_DB_USER_PASSWORD = "ORGANIZATION_CONNECTION_DB_USER_PASSWORD";
  public static String COMPANY_ID = "COMPANY_ID";
  public static String CID = "CID";
  public static String CID_PASSWORD = "CID_PASSWORD";
  public static String TOP_ORG_ID = "TOP_ORG_ID";
  public static String USER_ID = "USER_ID";
  public static String USER_UID = "USER_UID";
  public static String UNDELETE_IDS = "UNDELETE_IDS";
  public static String GRADE_CHECK = "GRADE_CHECK";
  public static String POSITION_CHECK = "POSITION_CHECK";
  public static String TITLE_CHECK = "TITLE_CHECK";
  public static String USE_SPECIAL_CONDITION = "USE_SPECIAL_CONDITION";
  public static String CONDITION_COUNT = "CONDITION_COUNT";
  public static String PASSWORD_INIT = "PASSWORD_INIT";
  public static String PASSWORD_DATA = "PASSWORD_DATA";
  public static String PASSWORD_TIME_CHECK = "PASSWORD_TIME_CHECK";
  public static String ADDITIONAL_DATA_CHECK = "ADDITIONAL_DATA_CHECK";
  public static String ADDITIONAL_DATA_TYPE = "ADDITIONAL_DATA_TYPE";
  public static String ADDITIONAL_ORG_DATA = "ADDITIONAL_ORG_DATA";
  public static String ADDITIONAL_USER_DATA = "ADDITIONAL_USER_DATA";
  public static String UNDELETE_ORG_IDS = "UNDELETE_ORG_IDS";
  public static String OPTIONAL_GTP_NAME = "OPTIONAL_GTP_NAME";
  public static String UNDELETED_USER_CONDITION = "UNDELETED_USER_CONDITION";
  public static String USE_INDIVIDUAL_DIVISION = "USE_INDIVIDUAL_DIVISION";
  public static String DIVISION_CODE = "DIVISION_CODE";

  private String m_strEnvFilePath = "";
  private String m_strLastError = "";

  private String m_strOrganizationConnectionMethod = "";
  private String m_strOrganizationConnectionClassName = "";
  private String m_strOrganizationConnectionURL = "";
  private String m_strOrganizationConnectionDSName = "";
  private String m_strOrganizationConnectionDBType = "";
  private String m_strOrganizationConnectionWASType = "";
  private String m_strOrganizationConnectionDBUser = "";
  private String m_strOrganizationConnectionDBUserPassword = "";
  private String m_strCompanyID = "";
  private String m_strCID = "";
  private String m_strCIDPassword = "";
  private String m_strTopOrgID = "";
  private String m_strUserID = "";
  private String m_strUserUID = "";
  private String m_strUnDeleteIDs = "";
  private String m_strGradeCheck = "";
  private String m_strPositionCheck = "";
  private String m_strTitleCheck = "";
  private String m_strUseSpecialCondition = "";
  private String m_strConditionCount = "";
  private String m_strPasswordInit = "";
  private String m_strPasswordData = "";
  private String m_strPasswordTimeCheck = "";
  private String m_strAdditionalDataCheck = "";
  private String m_strAdditionalDataType = "";
  private String m_strAdditionalOrgData = "";
  private String m_strAdditionalUserData = "";
  private String m_strUnDeleteOrgIDs = "";
  private String m_strOptionalGTPName = "";
  private String m_strUndeletedUserCondition = "";
  private int m_nUseIndividualDivision = 0;
  private String m_strDivisionCode = "";

  private String[] m_arrCompanyID = null;
  private String[] m_arrUnDeleteIDs = null;
  private LinkedList m_llSpecialCondition = null;
  private String[][] m_arrAdditionalOrgData = null;
  private String[][] m_arrAdditionalUserData = null;
  private String[] m_arrUnDeleteOrgIDs = null;
  private String[] m_arrUndeletedUserCondition = null;

  private String m_strMethod = "";
  private String m_strConditionType = "";
  private int m_nStart = -1;
  private int m_nCharCount = 0;
  private String m_strConditionValue = "";

  public PropertyObject()
  {
  }

  public PropertyObject(String strEnvFilePath)
  {
    this.m_strEnvFilePath = strEnvFilePath;
  }

  public String getEnvFilePath()
  {
    return this.m_strEnvFilePath;
  }

  public void setEnvFilePath(String strEnvFilePath) {
    this.m_strEnvFilePath = strEnvFilePath;
  }

  public String getLastError() {
    return this.m_strLastError;
  }

  public void setLastError(String strLastError) {
    this.m_strLastError = strLastError;
  }

  public String getAdditionalDataCheck() {
    return this.m_strAdditionalDataCheck;
  }

  public void setAdditionalDataCheck(String strAdditionalDataCheck) {
    this.m_strAdditionalDataCheck = strAdditionalDataCheck;
  }

  public String getAdditionalDataType() {
    return this.m_strAdditionalDataType;
  }

  public void setAdditionalDataType(String strAdditionalDataType) {
    this.m_strAdditionalDataType = strAdditionalDataType;
  }

  public String getAdditionalOrgData() {
    return this.m_strAdditionalOrgData;
  }

  public void setAdditionalOrgData(String strAdditionalOrgData) {
    this.m_strAdditionalOrgData = strAdditionalOrgData;
  }

  public String getAdditionalUserData() {
    return this.m_strAdditionalUserData;
  }

  public void setAdditionalUserData(String strAdditionalUserData) {
    this.m_strAdditionalUserData = strAdditionalUserData;
  }

  public String getCID() {
    return this.m_strCID;
  }

  public void setCID(String strCID) {
    this.m_strCID = strCID;
  }

  public String getCIDPassword() {
    return this.m_strCIDPassword;
  }

  public void setCIDPassword(String strCIDPassword) {
    this.m_strCIDPassword = strCIDPassword;
  }

  public String getCompanyID() {
    return this.m_strCompanyID;
  }

  public void setCompanyID(String strCompanyID) {
    this.m_strCompanyID = strCompanyID;
  }

  public String getConditionCount() {
    return this.m_strConditionCount;
  }

  public void setConditionCount(String strConditionCount) {
    this.m_strConditionCount = strConditionCount;
  }

  public String getGradeCheck() {
    return this.m_strGradeCheck;
  }

  public void setGradeCheck(String strGradeCheck) {
    this.m_strGradeCheck = strGradeCheck;
  }

  public String getOrganizationConnectionClassName() {
    return this.m_strOrganizationConnectionClassName;
  }

  public void setOrganizationConnectionClassName(String strOrganizationConnectionClassName) {
    this.m_strOrganizationConnectionClassName = strOrganizationConnectionClassName;
  }

  public String getOrganizationConnectionDBType() {
    return this.m_strOrganizationConnectionDBType;
  }

  public void setOrganizationConnectionDBType(String strOrganizationConnectionDBType) {
    this.m_strOrganizationConnectionDBType = strOrganizationConnectionDBType;
  }

  public String getOrganizationConnectionDBUser() {
    return this.m_strOrganizationConnectionDBUser;
  }

  public void setOrganizationConnectionDBUser(String strOrganizationConnectionDBUser) {
    this.m_strOrganizationConnectionDBUser = strOrganizationConnectionDBUser;
  }

  public String getOrganizationConnectionDBUserPassword() {
    return this.m_strOrganizationConnectionDBUserPassword;
  }

  public void setOrganizationConnectionDBUserPassword(String strOrganizationConnectionDBUserPassword) {
    this.m_strOrganizationConnectionDBUserPassword = strOrganizationConnectionDBUserPassword;
  }

  public String getOrganizationConnectionDSName() {
    return this.m_strOrganizationConnectionDSName;
  }

  public void setOrganizationConnectionDSName(String strOrganizationConnectionDSName) {
    this.m_strOrganizationConnectionDSName = strOrganizationConnectionDSName;
  }

  public String getOrganizationConnectionMethod() {
    return this.m_strOrganizationConnectionMethod;
  }

  public void setOrganizationConnectionMethod(String strOrganizationConnectionMethod) {
    this.m_strOrganizationConnectionMethod = strOrganizationConnectionMethod;
  }

  public String getOrganizationConnectionURL() {
    return this.m_strOrganizationConnectionURL;
  }

  public void setOrganizationConnectionURL(String strOrganizationConnectionURL) {
    this.m_strOrganizationConnectionURL = strOrganizationConnectionURL;
  }

  public String getOrganizationConnectionWASType() {
    return this.m_strOrganizationConnectionWASType;
  }

  public void setOrganizationConnectionWASType(String strOrganizationConnectionWASType) {
    this.m_strOrganizationConnectionWASType = strOrganizationConnectionWASType;
  }

  public String getPasswordData() {
    return this.m_strPasswordData;
  }

  public void setPasswordData(String strPasswordData) {
    this.m_strPasswordData = strPasswordData;
  }

  public String getPasswordInit() {
    return this.m_strPasswordInit;
  }

  public void setPasswordInit(String strPasswordInit) {
    this.m_strPasswordInit = strPasswordInit;
  }

  public String getPasswordTimeCheck() {
    return this.m_strPasswordTimeCheck;
  }

  public void setPasswordTimeCheck(String strPasswordTimeCheck) {
    this.m_strPasswordTimeCheck = strPasswordTimeCheck;
  }

  public String getPositionCheck() {
    return this.m_strPositionCheck;
  }

  public void setPositionCheck(String strPositionCheck) {
    this.m_strPositionCheck = strPositionCheck;
  }

  public String getTitleCheck() {
    return this.m_strTitleCheck;
  }

  public void setTitleCheck(String strTitleCheck) {
    this.m_strTitleCheck = strTitleCheck;
  }

  public String getTopOrgID() {
    return this.m_strTopOrgID;
  }

  public void setTopOrgID(String strTopOrgID) {
    this.m_strTopOrgID = strTopOrgID;
  }

  public String getUnDeleteIDs() {
    return this.m_strUnDeleteIDs;
  }

  public void setUnDeleteIDs(String strUnDeleteIDs) {
    this.m_strUnDeleteIDs = strUnDeleteIDs;
  }

  public String getUserID() {
    return this.m_strUserID;
  }

  public void setUserID(String strUserID) {
    this.m_strUserID = strUserID;
  }

  public String getUserUID() {
    return this.m_strUserUID;
  }

  public void setUserUID(String strUserUID) {
    this.m_strUserUID = strUserUID;
  }

  public String getUseSpecialCondition() {
    return this.m_strUseSpecialCondition;
  }

  public void setUseSpecialCondition(String strUseSpecialCondition) {
    this.m_strUseSpecialCondition = strUseSpecialCondition;
  }

  public int getUseIndividualDivision() {
    return this.m_nUseIndividualDivision;
  }

  public void setUseIndividualDivision(int nUseIndividualDivision) {
    this.m_nUseIndividualDivision = nUseIndividualDivision;
  }

  public String getDivisionCode() {
    return this.m_strDivisionCode;
  }

  public void setDivisionCode(String strDivisionCode) {
    this.m_strDivisionCode = strDivisionCode;
  }

  public boolean readData()
  {
    boolean bRV = false;
    FileInputStream envFile = null;
    try
    {
      envFile = new FileInputStream(new File(this.m_strEnvFilePath));
      Properties property = new Properties();
      property.load(envFile);

      this.m_strOrganizationConnectionMethod = property.getProperty(ORGANIZATION_CONNECTION_METHOD);
      this.m_strOrganizationConnectionClassName = property.getProperty(ORGANIZATION_CONNECTION_CLASSNAME);
      this.m_strOrganizationConnectionURL = property.getProperty(ORGANIZATION_CONNECTION_URL);
      this.m_strOrganizationConnectionDSName = property.getProperty(ORGANIZATION_CONNECTION_DSNAME);
      this.m_strOrganizationConnectionDBType = property.getProperty(ORGANIZATION_CONNECTION_DB_TYPE);
      this.m_strOrganizationConnectionWASType = property.getProperty(ORGANIZATION_CONNECTION_WAS_TYPE);
      this.m_strOrganizationConnectionDBUser = property.getProperty(ORGANIZATION_CONNECTION_DB_USER);
      this.m_strOrganizationConnectionDBUserPassword = property.getProperty(ORGANIZATION_CONNECTION_DB_USER_PASSWORD);
      this.m_strCompanyID = property.getProperty(COMPANY_ID);
      this.m_strCID = property.getProperty(CID);
      this.m_strCIDPassword = property.getProperty(CID_PASSWORD);
      this.m_strTopOrgID = property.getProperty(TOP_ORG_ID);
      this.m_strUserID = property.getProperty(USER_ID);
      this.m_strUserUID = property.getProperty(USER_UID);
      this.m_strUnDeleteIDs = property.getProperty(UNDELETE_IDS);
      this.m_strGradeCheck = property.getProperty(GRADE_CHECK);
      this.m_strPositionCheck = property.getProperty(POSITION_CHECK);
      this.m_strTitleCheck = property.getProperty(TITLE_CHECK);
      this.m_strUseSpecialCondition = property.getProperty(USE_SPECIAL_CONDITION);
      this.m_strConditionCount = property.getProperty(CONDITION_COUNT);
      this.m_strPasswordInit = property.getProperty(PASSWORD_INIT);
      this.m_strPasswordData = property.getProperty(PASSWORD_DATA);
      this.m_strPasswordTimeCheck = property.getProperty(PASSWORD_TIME_CHECK);
      this.m_strAdditionalDataCheck = property.getProperty(ADDITIONAL_DATA_CHECK);
      this.m_strAdditionalDataType = property.getProperty(ADDITIONAL_DATA_TYPE);
      this.m_strAdditionalOrgData = property.getProperty(ADDITIONAL_ORG_DATA);
      this.m_strAdditionalUserData = property.getProperty(ADDITIONAL_USER_DATA);
      this.m_strUnDeleteOrgIDs = property.getProperty(UNDELETE_ORG_IDS);
      this.m_strOptionalGTPName = property.getProperty(OPTIONAL_GTP_NAME);
      this.m_strUndeletedUserCondition = property.getProperty(UNDELETED_USER_CONDITION);

      String strUserIndividualDivision = property.getProperty(USE_INDIVIDUAL_DIVISION);
      this.m_nUseIndividualDivision = ((strUserIndividualDivision == null) || (strUserIndividualDivision.equals("")) ? 0 : Integer.parseInt(property.getProperty(USE_INDIVIDUAL_DIVISION)));
      this.m_strDivisionCode = property.getProperty(DIVISION_CODE);

      envFile.close();

      setCompanyIDs(this.m_strCompanyID);
      setArrUnDeleteIDs(this.m_strUnDeleteIDs);
      setArrUnDeleteOrgIDs(this.m_strUnDeleteOrgIDs);

      if (this.m_strUseSpecialCondition.equals("Y"))
      {
        setSpecialCondition(property);
      }

      if (this.m_strAdditionalDataCheck.toUpperCase().equals("Y"))
      {
        switch (Integer.parseInt(this.m_strAdditionalDataType))
        {
        case 4:
          setArrAdditionalOrgData();
          setArrAdditionalUserData();
          break;
        case 2:
          setArrAdditionalUserData();
          break;
        case 1:
          setArrAdditionalUserData();
        case 3:
        }
      }

      if ((this.m_strUndeletedUserCondition != null) && (this.m_strUndeletedUserCondition.length() > 0))
      {
        this.m_arrUndeletedUserCondition = this.m_strUndeletedUserCondition.split("/");
        setUndeletedUserConditionOtherData();
      }

      bRV = true;
    }
    catch (IOException e)
    {
      this.m_strLastError = e.getMessage();
      bRV = false;
    }

    return bRV;
  }

  public String[] getCompanyIDs() {
    return this.m_arrCompanyID;
  }

  public String getCompanyIDs(int nIndex) {
    return this.m_arrCompanyID[nIndex];
  }

  public void setCompanyIDs(String[] companyID) {
    this.m_arrCompanyID = companyID;
  }

  public void setCompanyIDs(String strCompanyIDs) {
    this.m_arrCompanyID = strCompanyIDs.split("/");
  }

  public String[] getArrUnDeleteIDs() {
    return this.m_arrUnDeleteIDs;
  }

  public String getUnDeleteID(int nIndex) {
    return this.m_arrUnDeleteIDs[nIndex];
  }

  public void setArrUnDeleteIDs(String[] arrUnDeleteIDs) {
    this.m_arrUnDeleteIDs = arrUnDeleteIDs;
  }

  public void setArrUnDeleteIDs(String strUnDeleteIDs) {
    this.m_arrUnDeleteIDs = strUnDeleteIDs.split("/");
  }

  public LinkedList getSpecialCondition() {
    return this.m_llSpecialCondition;
  }

  public SpecialConditionObject getSpecialCondition(int nIndex)
  {
    return (SpecialConditionObject)this.m_llSpecialCondition.get(nIndex);
  }

  public void setSpecialCondition(LinkedList llSpecialCodition) {
    this.m_llSpecialCondition = llSpecialCodition;
  }

  public void setSpecialCondition(Properties property)
  {
    this.m_llSpecialCondition = new LinkedList();
    int nConditionCount = Integer.parseInt(this.m_strConditionCount);
    for (int i = 0; i < nConditionCount; i++)
    {
      SpecialConditionObject objSpecialCondition = new SpecialConditionObject();
      String strConditionColum = "CONDITION_COLUMN";
      String strRetrictionAction = "RESTRICTION_ACTION";

      String strConditionColumnValue = "";
      String strRetrictionActionValue = "";

      strConditionColumnValue = property.getProperty(strConditionColum + (i + 1));
      strRetrictionActionValue = property.getProperty(strRetrictionAction + (i + 1));

      String[] arrColumnInfo = strConditionColumnValue.split("/");
      objSpecialCondition.setConditionColumn(arrColumnInfo[0]);

      String[] arrColumnValue = arrColumnInfo[1].split(":");
      objSpecialCondition.setValues(arrColumnValue);

      String[] arrRestrictionAction = strRetrictionActionValue.split("/");
      String[] arrInsertInfo = arrRestrictionAction[0].split(":");

      if (arrInsertInfo[1].equals("Y"))
      {
        objSpecialCondition.setInsert(true);

        String[] arrColumns = arrInsertInfo[2].split(",");
        for (int j = 0; j < arrColumns.length; j++)
        {
          RestrictionColumnInfoObject objRestrictionColumnInfo = new RestrictionColumnInfoObject();
          objRestrictionColumnInfo.setType(arrColumns[j].substring(0, 1));
          String strColumn = arrColumns[j].substring(2);

          if (objRestrictionColumnInfo.getType().equals("S"))
          {
            objRestrictionColumnInfo.setColumnName(strColumn.substring(0, strColumn.indexOf("=")));
            objRestrictionColumnInfo.setColumnValue(strColumn.substring(strColumn.indexOf("=") + 1));
          }
          else {
            objRestrictionColumnInfo.setColumnName(strColumn);
          }objSpecialCondition.addInsertColumn(objRestrictionColumnInfo);
        }
      }
      else
      {
        objSpecialCondition.setInsert(false);
      }

      String[] arrUpdateInfo = arrRestrictionAction[1].split(":");
      if (arrUpdateInfo[1].equals("Y"))
      {
        objSpecialCondition.setUpdate(true);

        String[] arrColumns = arrUpdateInfo[2].split(",");
        for (int j = 0; j < arrColumns.length; j++)
        {
          RestrictionColumnInfoObject objRestrictionColumnInfo = new RestrictionColumnInfoObject();
          objRestrictionColumnInfo.setType(arrColumns[j].substring(0, 1));
          String strColumn = arrColumns[j].substring(2);

          if (objRestrictionColumnInfo.getType().equals("S"))
          {
            objRestrictionColumnInfo.setColumnName(strColumn.substring(0, strColumn.indexOf("=")));
            objRestrictionColumnInfo.setColumnValue(strColumn.substring(strColumn.indexOf("=")));
          }
          else {
            objRestrictionColumnInfo.setColumnName(strColumn);
          }objSpecialCondition.addUpdateColumn(objRestrictionColumnInfo);
        }
      }
      else
      {
        objSpecialCondition.setUpdate(false);
      }

      String[] arrDeleteInfo = arrRestrictionAction[2].split(":");
      if (arrDeleteInfo[1].equals("Y"))
      {
        objSpecialCondition.setUpdate(true);

        String[] arrColumns = arrDeleteInfo[2].split(",");
        for (int j = 0; j < arrColumns.length; j++)
        {
          RestrictionColumnInfoObject objRestrictionColumnInfo = new RestrictionColumnInfoObject();
          objRestrictionColumnInfo.setType(arrColumns[j].substring(0, 1));
          String strColumn = arrColumns[j].substring(2);

          if (objRestrictionColumnInfo.getType().equals("S"))
          {
            objRestrictionColumnInfo.setColumnName(strColumn.substring(0, strColumn.indexOf("=")));
            objRestrictionColumnInfo.setColumnValue(strColumn.substring(strColumn.indexOf("=")));
          }
          else {
            objRestrictionColumnInfo.setColumnName(strColumn);
          }objSpecialCondition.addDeleteColumn(objRestrictionColumnInfo);
        }
      }
      else
      {
        objSpecialCondition.setDelete(false);
      }

      this.m_llSpecialCondition.add(objSpecialCondition);
    }
  }

  public String[][] getArrAdditionalOrgData() {
    return this.m_arrAdditionalOrgData;
  }

  public String getArrAdditionalOrgData(int i, int j)
  {
    return this.m_arrAdditionalOrgData[i][j];
  }

  public void setArrAdditionalOrgData(String[][] ArrAdditionalOrgData) {
    this.m_arrAdditionalOrgData = ArrAdditionalOrgData;
  }

  public void setArrAdditionalOrgData()
  {
    String[] arrOrgData = this.m_strAdditionalOrgData.split("/");

    this.m_arrAdditionalOrgData = new String[arrOrgData.length][2];

    for (int i = 0; i < arrOrgData.length; i++)
    {
      String strFields = arrOrgData[i];

      this.m_arrAdditionalOrgData[i][0] = strFields.substring(0, strFields.indexOf(58));
      this.m_arrAdditionalOrgData[i][1] = strFields.substring(strFields.indexOf(58) + 1);
    }
  }

  public String[][] getArrAdditionalUserData() {
    return this.m_arrAdditionalUserData;
  }

  public String getArrAdditionalUserData(int i, int j)
  {
    return this.m_arrAdditionalUserData[i][j];
  }

  public void setArrAdditionalUserData(String[][] ArrAdditionalUserData) {
    this.m_arrAdditionalUserData = ArrAdditionalUserData;
  }

  public void setArrAdditionalUserData()
  {
    String[] arrUserData = this.m_strAdditionalUserData.split("/");

    this.m_arrAdditionalUserData = new String[arrUserData.length][2];

    for (int i = 0; i < arrUserData.length; i++)
    {
      String strFields = arrUserData[i];

      this.m_arrAdditionalUserData[i][0] = strFields.substring(0, strFields.indexOf(58));
      this.m_arrAdditionalUserData[i][1] = strFields.substring(strFields.indexOf(58) + 1);
    }
  }

  public String getUnDeleteOrgIDs() {
    return this.m_strUnDeleteOrgIDs;
  }

  public void setUnDeleteOrgIDs(String strUnDeleteOrgIDs) {
    this.m_strUnDeleteOrgIDs = strUnDeleteOrgIDs;
  }

  public String[] getArrUnDeleteOrgIDs() {
    return this.m_arrUnDeleteOrgIDs;
  }

  public void setArrUnDeleteOrgIDs(String[] arrUnDeleteOrgIDs) {
    this.m_arrUnDeleteOrgIDs = arrUnDeleteOrgIDs;
  }

  public void setArrUnDeleteOrgIDs(String strUnDeleteOrgIDs) {
    this.m_arrUnDeleteOrgIDs = strUnDeleteOrgIDs.split("/");
  }

  public boolean isExistUnDeleteOrgIDs(String strOrgID)
  {
    if (this.m_arrUnDeleteOrgIDs == null) {
      return false;
    }
    for (int i = 0; i < this.m_arrUnDeleteOrgIDs.length; i++)
    {
      if (this.m_arrUnDeleteOrgIDs[i].equals(strOrgID)) {
        return true;
      }
    }
    return false;
  }

  public String getOptionalGTPName()
  {
    return this.m_strOptionalGTPName;
  }

  public void setOptionalGTPName(String strOptionalGTPName)
  {
    this.m_strOptionalGTPName = strOptionalGTPName;
  }

  public String getUndeletedUserCondition() {
    return this.m_strUndeletedUserCondition;
  }

  public void setUndeletedUserCondition(String strUndeletedUserCondition) {
    this.m_strUndeletedUserCondition = strUndeletedUserCondition;
  }

  public String[] getArrUndeletedUserCondition() {
    return this.m_arrUndeletedUserCondition;
  }

  public void setArrUndeletedUserCondition(String[] arrUndeletedUserCondition) {
    this.m_arrUndeletedUserCondition = arrUndeletedUserCondition;
  }

  public int getCharCount() {
    return this.m_nCharCount;
  }

  public void setCharCount(int nCharCount) {
    this.m_nCharCount = nCharCount;
  }

  public int getStart() {
    return this.m_nStart;
  }

  public void setStart(int nStart) {
    this.m_nStart = nStart;
  }

  public String getConditionType() {
    return this.m_strConditionType;
  }

  public void setConditionType(String strConditionType) {
    this.m_strConditionType = strConditionType;
  }

  public String getMethod() {
    return this.m_strMethod;
  }

  public void setMethod(String strMethod) {
    this.m_strMethod = strMethod;
  }

  public String getConditionValue() {
    return this.m_strConditionValue;
  }

  public void setConditionValue(String strConditionValue) {
    this.m_strConditionValue = strConditionValue;
  }

  public void setUndeletedUserConditionOtherData()
  {
    String strColumn = ""; String strCondition = "";
    strColumn = this.m_arrUndeletedUserCondition[0];
    strCondition = this.m_arrUndeletedUserCondition[1];
    this.m_strConditionValue = this.m_arrUndeletedUserCondition[2];
    strColumn = strColumn.toLowerCase();
    if (strColumn.indexOf("_") > -1)
      strColumn = strColumn.substring(0, 1).toUpperCase() + strColumn.substring(1, strColumn.indexOf("_")) + strColumn.substring(strColumn.indexOf("_") + 1, strColumn.indexOf("_") + 2).toUpperCase() + strColumn.substring(strColumn.indexOf("_") + 2);
    else
      strColumn = strColumn.substring(0, 1).toUpperCase() + strColumn.substring(1);
    this.m_strMethod = ("get" + strColumn);

    String[] arrCondition = strCondition.split(":");

    this.m_strConditionType = arrCondition[0];

    if (this.m_strConditionType.equals("P"))
    {
      this.m_nStart = Integer.parseInt(arrCondition[1]);
      this.m_nCharCount = Integer.parseInt(arrCondition[2]);
    }
  }
}