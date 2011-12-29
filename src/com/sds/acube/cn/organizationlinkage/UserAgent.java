package com.sds.acube.cn.organizationlinkage;

import java.lang.reflect.Method;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import model.outldap.samsung.net.Employee;
import sutil.Encrypt;

import com.sds.acube.cn.common.GUID;
import com.sds.acube.cn.common.vo.ConnectionParam;

public class UserAgent extends ObjectAgent {
	private PropertyObject m_objProperty = null;
	private OrgAgent m_orgAgent = null;

	private int m_nSuccessCount = 0;
	private int m_nFailCount = 0;
	private int m_nInsertCount = 0;
	private int m_nUpdateCount = 0;
	private int m_nDeleteCount = 0;

	private int m_nCurSuccessCount = 0;
	private int m_nCurFailCount = 0;
	private int m_nCurInsertCount = 0;
	private int m_nCurUpdateCount = 0;
	private int m_nCurDeleteCount = 0;

	private String m_strResidentNoEncoding = "";

	boolean m_bChangeUserID = true;

	public UserAgent(ConnectionParam connParamForACUBE, LogAgent logAgent) {
		super(connParamForACUBE, logAgent);
	}

	public UserAgent(ConnectionParam connParamForACUBE, LogAgent logAgent, OrgAgent orgAgent) {
		super(connParamForACUBE, logAgent);

		this.m_orgAgent = orgAgent;
	}

	public UserAgent(ConnectionParam connParamForACUBE, LogAgent logAgent, PropertyObject objProperty) {
		super(connParamForACUBE, logAgent);
		this.m_objProperty = objProperty;
	}

	public UserAgent(ConnectionParam connParamForACUBE, LogAgent logAgent, PropertyObject objProperty, OrgAgent orgAgent) {
		super(connParamForACUBE, logAgent);
		this.m_objProperty = objProperty;
		this.m_orgAgent = orgAgent;
	}

	public void setOrgAgent(OrgAgent orgAgent) {
		this.m_orgAgent = orgAgent;
	}

	public boolean processData(Employee[] employee, String strOrgID) {
		boolean bRV = false;
		clearCurInfo();
		if (this.m_strResidentNoEncoding.equals("")) {
			this.m_strResidentNoEncoding = getResidentNoEncoding();
		}
		StringBuffer strLog = new StringBuffer();
		for (int i = 0; i < employee.length; i++) {
			UserIDIRObject objIDIRNew = convertLDAPToUser(employee[i], strOrgID);
			UserIDIRObject objIDIROld = null;

			String strUserUID = "";

			switch (this.m_objProperty.getUserUID().charAt(0)) {
			case 'A':
				this.m_bChangeUserID = false;
				break;
			case 'S':
				strUserUID = objIDIRNew.getUserID();
				break;
			case 'N':
				String strUIDColumn = this.m_objProperty.getUserUID().substring(1);
				if (strUIDColumn.equals("employeenumber")) {
					strUserUID = objIDIRNew.getEmployeeID();
				} else if (strUIDColumn.equals("epregisternumber")) {
					strUserUID = objIDIRNew.getResidentNO();
				} else if (strUIDColumn.equals("epid")) {
					strUserUID = objIDIRNew.getEPID();
				} else {
					if (!strUIDColumn.equals("uid"))
						break;
					strUserUID = objIDIRNew.getSingleUID();
				}

			}

			if (this.m_bChangeUserID)
				objIDIROld = getUserInfoByUID(strUserUID, true);
			else {
				objIDIROld = getUserInfo(objIDIRNew.getUserID(), true);
			}
			strLog.setLength(0);
			strLog.append("==================== [" + i + " ] " + objIDIRNew.getUserID() + "[ " + getStringNull(objIDIRNew.getUserUID()) + " ] / ");
			strLog.append(objIDIRNew.getUserName() + " / " + getStringNull(employee[i].getMobile()) + " / " + getStringNull(objIDIRNew.getMobile()));
			System.out.println(strLog.toString());

			if (objIDIROld == null) {
				this.m_nInsertCount += 1;
				this.m_nCurInsertCount += 1;
				this.m_logAgent.addProcess("InsertUser()", objIDIRNew.getData());
				bRV = insertUser(objIDIRNew);

				if (bRV) {
					this.m_nSuccessCount += 1;
					this.m_nCurSuccessCount += 1;
					this.m_logAgent.addLog("[Result] Success");
				} else {
					this.m_nFailCount += 1;
					this.m_nCurFailCount += 1;
					this.m_logAgent.addLog("[Result] Fail");
				}
			} else {
				this.m_nUpdateCount += 1;
				this.m_nCurUpdateCount += 1;
				this.m_logAgent.addProcess("UpdateUser()", objIDIRNew.getData());

				bRV = updateUser(objIDIRNew, objIDIROld);
				if (bRV) {
					this.m_nSuccessCount += 1;
					this.m_nCurSuccessCount += 1;
					this.m_logAgent.addLog("[Result] Success");
				} else {
					this.m_nFailCount += 1;
					this.m_nCurFailCount += 1;
					this.m_logAgent.addLog("[Result] Fail");
				}
			}
			this.m_logAgent.addEndProcess();
		}
		this.m_logAgent.endLog(employee.length, this.m_nCurInsertCount, this.m_nCurUpdateCount, this.m_nCurDeleteCount, this.m_nCurSuccessCount, this.m_nCurFailCount,
				this.m_nInsertCount, this.m_nUpdateCount, this.m_nDeleteCount, this.m_nSuccessCount, this.m_nFailCount);
		return true;
	}

	public boolean processDelete(Employee[] employee, String strOrgID) {
		try {
			LinkedList slIDIRSource = null;
			LinkedList olIDIR = null;
			slIDIRSource = convertEmployeeToIDIR(employee);
			boolean bRV = false;
			clearCurInfo();

			olIDIR = getUsersByOrgIDForDelete(strOrgID);
			if ((slIDIRSource != null) && (slIDIRSource.size() > 0) && (olIDIR != null)) {
				LinkedList slSubtract = subtractDiffType(olIDIR, slIDIRSource);
				this.m_nCurDeleteCount = slSubtract.size();
				this.m_nDeleteCount += this.m_nCurDeleteCount;
				if (slSubtract != null && slSubtract.size() > 0) {
					for (Iterator iterator = slSubtract.iterator(); iterator.hasNext();) {
						UserIDIRObject objDeleteUser = (UserIDIRObject) iterator.next();
						this.m_logAgent.addProcess("DeleteUser()", objDeleteUser.getUserID());
						System.out.println("=== delete user === " + objDeleteUser.getUserID());
						boolean bUndeleteUser = false;
						if ((this.m_objProperty.getArrUnDeleteIDs() != null) && (this.m_objProperty.getArrUnDeleteIDs().length > 0)) {
							bUndeleteUser = isExistUndeleteIDs(objDeleteUser.getUserID());
						}
						if (!bUndeleteUser) {
							if ((this.m_objProperty.getArrUndeletedUserCondition() != null) && (this.m_objProperty.getArrUndeletedUserCondition().length > 0)) {
								bUndeleteUser = isExistUndeleteUserCondition(objDeleteUser);
							}
						}
						if (!bUndeleteUser) {
							bRV = deleteUser(objDeleteUser.getUserID());
							if (bRV) {
								this.m_nSuccessCount += 1;
								this.m_nCurSuccessCount += 1;
								this.m_logAgent.addLog("[Result] Success");
							} else {
								this.m_nFailCount += 1;
								this.m_nCurFailCount += 1;
								this.m_logAgent.addLog("[Result] Fail");
							}
						} else {
							this.m_nSuccessCount += 1;
							this.m_nCurSuccessCount += 1;
							this.m_logAgent.addLog("[Result] Delete Except User");
						}
					}
				}
				this.m_logAgent.endLog(this.m_nCurDeleteCount, this.m_nCurInsertCount, this.m_nCurUpdateCount, this.m_nCurDeleteCount, this.m_nCurSuccessCount,
						this.m_nCurFailCount, this.m_nInsertCount, this.m_nUpdateCount, this.m_nDeleteCount, this.m_nSuccessCount, this.m_nFailCount);
			}
		} catch (Exception e) {
			System.out.println("[ERROR UserAgent#processDelete] " + e.getMessage());
			return false;
		}

		return true;
	}

	public boolean insertUser(UserIDIRObject objIDIR) {
		boolean bRV = false;
		try {
			if (objIDIR == null) {
				setLastError("[Error Function Name] insertUser()", false);
				setLogAdmin();
				return false;
			}

			String strUserUID = "";
			switch (this.m_objProperty.getUserUID().charAt(0)) {
			case 'A':
				GUID objGuid = new GUID(32);
				strUserUID = "U" + objGuid.toString().substring(0, 19);
				break;
			case 'S':
				strUserUID = objIDIR.getUserID();
				break;
			case 'N':
				String strUIDColumn = this.m_objProperty.getUserUID().substring(1);
				if (strUIDColumn.equals("employeenumber")) {
					strUserUID = objIDIR.getEmployeeID();
				} else if (strUIDColumn.equals("epregisternumber")) {
					strUserUID = objIDIR.getResidentNO();
				} else if (strUIDColumn.equals("epid")) {
					strUserUID = objIDIR.getEPID();
				} else {
					if (!strUIDColumn.equals("uid"))
						break;
					strUserUID = objIDIR.getSingleUID();
				}
			}

			objIDIR.setUserUID(strUserUID);

			StringBuffer strCommText = new StringBuffer();
			LinkedList slCommText = new LinkedList();
			LinkedList slColsText = new LinkedList();
			String strGradeCode = "";
			String strPositionCode = "";
			String strTitleCode = "";

			switch (this.m_objProperty.getGradeCheck().toUpperCase().charAt(0)) {
			case 'Y':
				if (objIDIR.getGradeCode().length() <= 0)
					break;
				if (isExistGradeID(objIDIR.getGradeCode())) {
					strGradeCode = objIDIR.getGradeCode();
				} else {
					String strGradeLog = "";
					strGradeLog = objIDIR.getGradeCode() + " / " + objIDIR.getGradeName() + " / " + objIDIR.getGradeOtherName();
					setGradeLog(strGradeLog);
					strGradeCode = "";
				}
				break;
			case 'I':
				strGradeCode = "";
				break;
			case 'N':
			default:
				strGradeCode = objIDIR.getGradeCode();
			}

			switch (this.m_objProperty.getPositionCheck().toUpperCase().charAt(0)) {
			case 'Y':
				if (objIDIR.getPositionCode().length() <= 0)
					break;
				if (isExistPositionID(objIDIR.getPositionCode())) {
					strPositionCode = objIDIR.getPositionCode();
				} else {
					strPositionCode = "";
				}
				break;
			case 'I':
				strPositionCode = "";
				break;
			case 'N':
			default:
				strPositionCode = objIDIR.getPositionCode();
			}

			switch (this.m_objProperty.getTitleCheck().toUpperCase().charAt(0)) {
			case 'Y':
				if (objIDIR.getTitleCode().length() <= 0)
					break;
				if (isExistTitleID(objIDIR.getTitleCode()))
					strTitleCode = objIDIR.getTitleCode();
				else {
					strTitleCode = "";
				}
				break;
			case 'I':
				strTitleCode = "";
				break;
			case 'N':
			default:
				strTitleCode = objIDIR.getTitleCode();
			}

			int iIsDeleted = 0;
			String strEmployeeID = objIDIR.getEmployeeID();
			String strResidentNO = objIDIR.getResidentNO();
			if (this.m_objProperty.getSpecialCondition() != null) {
				for (int i = 0; i < this.m_objProperty.getSpecialCondition().size(); i++) {
					SpecialConditionObject objSpecialCondition = this.m_objProperty.getSpecialCondition(i);
					if (!objSpecialCondition.getConditionColumn().equals("employeetype"))
						continue;
					if (!objSpecialCondition.isExistColumnValue(objIDIR.getEmployeeType()))
						continue;
					LinkedList llInsertResctrictionInfo = objSpecialCondition.getInsertRestrictionInfo();
					if (llInsertResctrictionInfo == null)
						continue;
					for (int j = 0; j < llInsertResctrictionInfo.size(); j++) {
						RestrictionColumnInfoObject objRestrictionColumn = (RestrictionColumnInfoObject) llInsertResctrictionInfo.get(j);

						if (objRestrictionColumn.getColumnName().equals("IS_DELETED")) {
							switch (objRestrictionColumn.getType().charAt(0)) {
							case 'S':
								if (objRestrictionColumn.getColumnValue() == null || objRestrictionColumn.getColumnValue().equals("")) {
									iIsDeleted = 0;
								} else {
									iIsDeleted = Integer.parseInt(objRestrictionColumn.getColumnValue());
								}
								break;
							case 'I':
								iIsDeleted = objIDIR.getIsDeleted();
								break;
							default:
								iIsDeleted = objIDIR.getIsDeleted();
							}
						}

						if (objRestrictionColumn.getColumnName().equals("EMPLOYEE_ID")) {
							switch (objRestrictionColumn.getType().charAt(0)) {
							case 'S':
								strEmployeeID = objRestrictionColumn.getColumnValue();
								break;
							case 'I':
								strEmployeeID = objIDIR.getEmployeeID();
								break;
							default:
								strEmployeeID = objIDIR.getEmployeeID();
							}
						}

						if (!objRestrictionColumn.getColumnName().equals("RESIDENT_NO"))
							continue;
						switch (objRestrictionColumn.getType().charAt(0)) {
						case 'S':
							strResidentNO = objRestrictionColumn.getColumnValue();
							break;
						case 'I':
							strResidentNO = objIDIR.getResidentNO();
							break;
						default:
							strResidentNO = objIDIR.getResidentNO();
						}
					}
				}
			}

			if (this.m_objProperty.getPasswordInit().toUpperCase().equals("Y")) {
				String strSystemPasswordColumn = this.m_objProperty.getPasswordData().substring(1);
				String strSystemPasswordData = "";
				switch (this.m_objProperty.getPasswordData().charAt(0)) {
				case 'C':
					if (strSystemPasswordColumn.equals("employeeid"))
						strSystemPasswordData = objIDIR.getEmployeeID();
					if (strSystemPasswordColumn.equals("residentno"))
						strSystemPasswordData = objIDIR.getResidentNO().substring(6);
					if (strSystemPasswordColumn.equals("userid")) {
						strSystemPasswordData = objIDIR.getUserID();
					}
					if (strSystemPasswordData.length() <= 9)
						break;
					strSystemPasswordData = strSystemPasswordData.substring(0, 7);
					break;
				case 'R':
					strSystemPasswordData = strSystemPasswordColumn;
				}
				if (strSystemPasswordData.length() > 0) {
					objIDIR.setPassword(EncodeBySType(strSystemPasswordData));
				}
			}

			String strNewResidentNo = "";
			strNewResidentNo = strResidentNO;
			if (this.m_strResidentNoEncoding.equalsIgnoreCase("Y")) {
				if (strResidentNO.length() > 0) {
					strNewResidentNo = EncodeBySType(strResidentNO);
				}
			}

			strCommText.append("INSERT INTO TCN_USERINFORMATION_BASIC ");
			strCommText.append("(USER_ID,USER_NAME,USER_OTHER_NAME,USER_UID,GROUP_ID,GROUP_NAME,GROUP_OTHER_NAME,");
			strCommText.append("COMP_ID,COMP_NAME,COMP_OTHER_NAME,DEPT_ID,DEPT_NAME,DEPT_OTHER_NAME,PART_ID,PART_NAME,");
			strCommText.append("PART_OTHER_NAME,ORG_DISPLAY_NAME,ORG_DISPLAY_OTHER_NAME,GRADE_CODE,");
			strCommText.append("TITLE_CODE,POSITION_CODE,USER_ORDER,SECURITY_LEVEL,ROLE_CODE,RESIDENT_NO,EMPLOYEE_ID,");
			strCommText.append("SYSMAIL,SERVERS,IS_CONCURRENT,IS_PROXY,IS_DELEGATE,IS_EXISTENCE,USER_RID,IS_DELETED,");
			strCommText.append("DESCRIPTION,RESERVED1,RESERVED2,RESERVED3,OPTIONAL_GTP_NAME,DISPLAY_ORDER,DEFAULT_USER,");
			strCommText.append("CERTIFICATION_ID,DUTY_CODE) VALUES (");
			strCommText.append("?,?,?,?,?,?,?,");
			strCommText.append("?,?,?,?,?,?,?,?,");
			strCommText.append("?,?,?,?,");
			strCommText.append("?,?,?,?,?,?,?,");
			strCommText.append("?,?,?,?,?,?,?,?,");
			strCommText.append("?,?,?,?,?,?,?,");
			strCommText.append("?,?) ");
			slCommText.addLast(strCommText.toString());
			ArrayList val = new ArrayList();
			val.add(objIDIR.getUserID());// USER_ID,
			val.add(objIDIR.getUserName());// USER_NAME,
			val.add(objIDIR.getUserOtherName());// USER_OTHER_NAME,
			val.add(objIDIR.getUserUID());// USER_UID,
			val.add(objIDIR.getGroupID());// GROUP_ID,
			val.add(objIDIR.getGroupName());// GROUP_NAME,
			val.add(objIDIR.getGroupOtherName());// GROUP_OTHER_NAME,
			val.add(objIDIR.getCompID());// COMP_ID,
			val.add(objIDIR.getCompName());// COMP_NAME,
			val.add(getStringNull(objIDIR.getCompOtherName()));// COMP_OTHER_NAME,
			val.add(objIDIR.getDeptID());// DEPT_ID,
			val.add(objIDIR.getDeptName());// DEPT_NAME,
			val.add(getStringNull(objIDIR.getDeptOtherName()));// DEPT_OTHER_NAME,
			val.add(getStringNull(objIDIR.getPartID()));// PART_ID,
			val.add(getStringNull(objIDIR.getPartName()));// PART_NAME,
			val.add(getStringNull(objIDIR.getPartOtherName()));// PART_OTHER_NAME,
			val.add(getStringNull(objIDIR.getOrgDisplayName()));// ORG_DISPLAY_NAME,
			val.add(getStringNull(objIDIR.getOrgDisplayOtherName()));// ORG_DISPLAY_OTHER_NAME,
			val.add(getStringNull(strGradeCode));// GRADE_CODE,
			val.add(getStringNull(strTitleCode));// TITLE_CODE,
			val.add(getStringNull(strPositionCode));// POSITION_CODE,
			val.add(new Integer(objIDIR.getUserOrder()));// USER_ORDER,
			val.add(new Integer(objIDIR.getSecurityLevel()));// SECURITY_LEVEL,
			val.add(getStringNull(objIDIR.getRoleCode()));// ROLE_CODE,
			val.add(getStringNull(strNewResidentNo));// RESIDENT_NO,
			val.add(getStringNull(strEmployeeID));// EMPLOYEE_ID,
			val.add(getStringNull(objIDIR.getSysMail()));// SYSMAIL,
			val.add(getStringNull(objIDIR.getServers()));// SERVERS,
			val.add(new Integer(objIDIR.getIsConcurrent()));// IS_CONCURRENT,
			val.add(new Integer(objIDIR.getIsProxy()));// IS_PROXY,
			val.add(new Integer(objIDIR.getIsDelegate()));// IS_DELEGATE,
			val.add(new Integer(objIDIR.getIsExistence()));// IS_EXISTENCE,
			val.add(getStringNull(objIDIR.getUserRID()));// USER_RID,
			val.add(new Integer(iIsDeleted));// IS_DELETED,
			val.add(getStringNull(objIDIR.getDescription()));// DESCRIPTION,
			val.add(getStringNull(objIDIR.getReserved1()));// RESERVED1,
			val.add(getStringNull(objIDIR.getReserved2()));// RESERVED2,
			val.add(getStringNull(objIDIR.getReserved3()));// RESERVED3,
			val.add(getStringNull(objIDIR.getOptionalGTPName()));// OPTIONAL_GTP_NAME,
			val.add(new Integer(0));// DISPLAY_ORDER,
			val.add(new Integer(0));// DEFAULT_USER,
			val.add("");// CERTIFICATION_ID,
			val.add("");// DUTY_CODE
			slColsText.addLast(val);

			strCommText.setLength(0);
			strCommText.append("INSERT INTO TCN_USERINFORMATION_STATUS ");
			strCommText.append("(USER_ID,USER_STATUS,EMPTY_SET) ");
			strCommText.append("VALUES(?,?,?)");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val1 = new ArrayList();
			val1.add(objIDIR.getUserUID());
			val1.add(new Integer(iIsDeleted));
			val1.add(new Integer(0));
			slColsText.addLast(val1);

			strCommText.setLength(0);
			strCommText.append("INSERT INTO TCN_USERINFORMATION_ADDR ");
			strCommText.append("(USER_ID,EMAIL,DUTY,HOMEPAGE,OFFICE_TEL,OFFICE_TEL2,OFFICE_ADDR,OFFICE_DETAIL_ADDR,");
			strCommText.append("OFFICE_ZIPCODE,OFFICE_FAX,MOBILE,MOBILE2,PAGER,HOME_ADDR,HOME_DETAIL_ADDR,HOME_ZIPCODE,");
			strCommText.append("HOME_TEL,HOME_TEL2,HOME_FAX) VALUES (");
			strCommText.append("?,?,?,?,?,?,?,?,");
			strCommText.append("?,?,?,?,?,?,?,?,");
			strCommText.append("?,?,?) ");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val2 = new ArrayList();
			val2.add(objIDIR.getUserUID());
			val2.add(getStringNull(objIDIR.getEMail()));
			val2.add(getStringNull(objIDIR.getDuty()));
			val2.add(getStringNull(objIDIR.getHomePage()));
			val2.add(getStringCutter(getStringNull(objIDIR.getOfficeTel()), 20));
			val2.add(getStringCutter(getStringNull(objIDIR.getOfficeTel2()), 20));
			val2.add(getStringCutter(getStringNull(objIDIR.getOfficeAddr()), 70));
			val2.add(getStringCutter(getStringNull(objIDIR.getOfficeDetailAddr()), 70));
			val2.add(getStringNull(objIDIR.getOfficeZipCode()));
			val2.add(getStringNull(objIDIR.getOfficeFAX()));
			val2.add(getStringCutter(getStringNull(objIDIR.getMobile()), 20));
			val2.add(getStringCutter(getStringNull(objIDIR.getMobile2()), 20));
			val2.add(getStringNull(objIDIR.getPager()));
			val2.add(getStringCutter(getStringNull(objIDIR.getHomeAddr()), 70));
			val2.add(getStringCutter(getStringNull(objIDIR.getHomeDetailAddr()), 70));
			val2.add(getStringNull(objIDIR.getHomeZipCode()));
			val2.add(getStringCutter(getStringNull(objIDIR.getHomeTel()), 20));
			val2.add(getStringCutter(getStringNull(objIDIR.getHomeTel2()), 20));
			val2.add(getStringNull(objIDIR.getHomeFax()));
			slColsText.addLast(val2);

			strCommText.setLength(0);
			strCommText.append("INSERT INTO TCN_USERINFORMATION_IMAGE ");
			strCommText.append("(USER_ID,STAMP_OR_SIGN) ");
			strCommText.append("VALUES(?,?) ");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val3 = new ArrayList();
			val3.add(objIDIR.getUserUID());
			val3.add(new Integer(0));
			slColsText.addLast(val3);

			strCommText.setLength(0);
			strCommText.append("INSERT INTO TCN_USERINFORMATION_PASSWORD ");
			strCommText.append("(USER_ID,PASSWORD_TYPE,SYSTEM_PASSWORD) ");
			strCommText.append("VALUES(?,?,?) ");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val4 = new ArrayList();
			val4.add(objIDIR.getUserUID());
			val4.add(new Integer(0));
			val4.add(objIDIR.getPassword());
			slColsText.addLast(val4);

			if (this.m_objProperty.getPasswordTimeCheck().toUpperCase().equals("Y")) {
				strCommText.setLength(0);
				switch (this.m_connParamForACUBE.getDBType()) {
				case 0:
					strCommText.append("INSERT INTO TCN_USERINFORMATION_TIME ");
					strCommText.append("(USER_ID,WHEN_CREATED,WHEN_CHANGED_PASSWORD) ");
					strCommText.append("VALUES(?,sysdate,sysdate)");
					slCommText.addLast(strCommText.toString());
					// val.clear();
					ArrayList val5 = new ArrayList();
					val5.add(objIDIR.getUserUID());
					slColsText.addLast(val5);
					break;
				case 1:
					strCommText.append("INSERT INTO TCN_USERINFORMATION_TIME ");
					strCommText.append("(USER_ID,WHEN_CREATED,WHEN_CHANGED_PASSWORD) ");
					strCommText.append("VALUES(?,GETDATE(),GETDATE())");
					slCommText.addLast(strCommText.toString());
					// val.clear();
					ArrayList val6 = new ArrayList();
					val6.add(objIDIR.getUserUID());
					slColsText.addLast(val6);
				default:
					break;
				}
			} else {
				strCommText.setLength(0);
				switch (this.m_connParamForACUBE.getDBType()) {
				case 0:
					strCommText.append("INSERT INTO TCN_USERINFORMATION_TIME ");
					strCommText.append("(USER_ID,WHEN_CREATED) ");
					strCommText.append("VALUES(?,sysdate)");
					slCommText.addLast(strCommText.toString());
					// val.clear();
					ArrayList val7 = new ArrayList();
					val7.add(objIDIR.getUserUID());
					slColsText.addLast(val7);
					break;
				case 1:
					strCommText.append("INSERT INTO TCN_USERINFORMATION_TIME ");
					strCommText.append("(USER_ID,WHEN_CREATED) ");
					strCommText.append("VALUES(?,GETDATE())");
					slCommText.addLast(strCommText.toString());
					// val.clear();
					ArrayList val8 = new ArrayList();
					val8.add(objIDIR.getUserUID());
					slColsText.addLast(val8);
				}
			}
			bRV = executeCommandPrepared(slCommText, slColsText);
			if (!bRV) {
				setLastError("[Error Function Name] insertUser()", true);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
			}
		} catch (Exception e) {
			System.out.println("[ERROR insertUser]" + e.getMessage());
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] insertUser()", false);
			setLogAdmin();
			this.m_connectionBroker.clearPreparedQuery();
			return false;
		}

		return bRV;
	}

	public boolean updateUser(UserIDIRObject objIDIRNew, UserIDIRObject objIDIROld) {
		boolean bRV = false;
		try {
			LinkedList slCommText = new LinkedList();
			LinkedList slColText = new LinkedList();
			ArrayList val = new ArrayList();
			StringBuffer strCommText = new StringBuffer();
			StringBuffer strCond = new StringBuffer();
			if (objIDIRNew.getDeptID().compareTo(objIDIROld.getDeptID()) != 0) {
				strCond.append("GROUP_ID=?,GROUP_NAME=?,GROUP_OTHER_NAME=?,COMP_ID=?,COMP_NAME=?,COMP_OTHER_NAME=?,");
				strCond.append("DEPT_ID=?,DEPT_NAME=?,DEPT_OTHER_NAME=?,PART_ID=?,PART_NAME=?,PART_OTHER_NAME=?,");
				val.add(objIDIRNew.getGroupID());
				val.add(objIDIRNew.getGroupName());
				val.add(getStringNull(objIDIRNew.getGroupOtherName()));
				val.add(objIDIRNew.getCompID());
				val.add(objIDIRNew.getCompName());
				val.add(getStringNull(objIDIRNew.getCompOtherName()));
				val.add(objIDIRNew.getDeptID());
				val.add(objIDIRNew.getDeptName());
				val.add(getStringNull(objIDIRNew.getDeptOtherName()));
				val.add(getStringNull(objIDIRNew.getPartID()));
				val.add(getStringNull(objIDIRNew.getPartName()));
				val.add(getStringNull(objIDIRNew.getPartOtherName()));
			}

			if (objIDIRNew.getOrgDisplayName() != null) {
				if (objIDIRNew.getOrgDisplayName().length() == 0) {
					makeupOrgDisplayName(objIDIRNew);
					strCond.append("ORG_DISPLAY_NAME=?,ORG_DISPLAY_OTHER_NAME=?,");
					val.add(getStringNull(objIDIRNew.getOrgDisplayName()));
					val.add(getStringNull(objIDIRNew.getOrgDisplayOtherName()));
				} else if (objIDIROld.getOrgDisplayName().compareTo(objIDIRNew.getOrgDisplayName()) != 0) {
					strCond.append("ORG_DISPLAY_NAME=?,ORG_DISPLAY_OTHER_NAME=?,");
					val.add(getStringNull(objIDIRNew.getOrgDisplayName()));
					val.add(getStringNull(objIDIRNew.getOrgDisplayOtherName()));
				}
			}
			if (this.m_bChangeUserID) {
				if (objIDIROld.getUserID().compareTo(objIDIRNew.getUserID()) != 0) {
					strCond.append("USER_ID=?,");
					val.add(objIDIRNew.getUserID());
				}
			}
			if (objIDIROld.getUserName().compareTo(objIDIRNew.getUserName()) != 0) {
				strCond.append("USER_NAME=?,");
				val.add(objIDIRNew.getUserName());
			}
			if (objIDIROld.getUserOtherName().compareTo(objIDIRNew.getUserOtherName()) != 0) {
				strCond.append("USER_OTHER_NAME=?,");
				val.add(getStringNull(objIDIRNew.getUserOtherName()));
			}

			if ((this.m_objProperty.getArrAdditionalUserData() != null) && (this.m_objProperty.getArrAdditionalUserData().length > 0)) {
				int nLength = this.m_objProperty.getArrAdditionalUserData().length;
				for (int i = 0; i < nLength; i++) {
					String strIDirMethodName = "get" + this.m_objProperty.getArrAdditionalUserData(i, 0).substring(0, 1).toUpperCase()
							+ this.m_objProperty.getArrAdditionalUserData(i, 0).substring(1);
					try {
						String strOldValue = "";
						String strNewValue = "";

						Method methodGet = UserIDIRObject.class.getDeclaredMethod(strIDirMethodName, null);
						if (methodGet != null) {
							strOldValue = (String) methodGet.invoke(objIDIROld, null);
							if (strOldValue == null)
								strOldValue = "";
							strNewValue = (String) methodGet.invoke(objIDIRNew, null);
							if (strNewValue == null) {
								strNewValue = "";
							}
						}
						if (strOldValue.equals(strNewValue))
							continue;
						strCond.append(this.m_objProperty.getArrAdditionalUserData(i, 0).toUpperCase());
						strCond.append("=?,");
						val.add(getStringNull(strNewValue));
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("[ERROR updateUser1]" + e.getMessage());
					}
				}
			}

			switch (this.m_objProperty.getGradeCheck().toUpperCase().charAt(0)) {
			case 'Y':
				if (objIDIROld.getGradeCode().compareTo(objIDIRNew.getGradeCode()) == 0)
					break;
				if (objIDIRNew.getGradeCode().length() > 0) {
					if (isExistGradeID(objIDIRNew.getGradeCode())) {
						strCond.append("GRADE_CODE=?,");
						val.add(getStringNull(objIDIRNew.getGradeCode()));
					} else {
						String strGradeLog = "";
						strGradeLog = objIDIRNew.getGradeCode() + " / " + objIDIRNew.getGradeName() + " / " + objIDIRNew.getGradeOtherName();
						setGradeLog(strGradeLog);
						strCond.append("GRADE_CODE=?,");
						val.add("");
					}
				} else {
					strCond.append("GRADE_CODE=?,");
					val.add("");
				}
				break;
			case 'N':
				if (objIDIROld.getGradeCode().compareTo(objIDIRNew.getGradeCode()) == 0)
					break;
				strCond.append("GRADE_CODE=?,");
				val.add(getStringNull(objIDIRNew.getGradeCode()));
				break;
			case 'I':
				break;
			default:
				if (objIDIROld.getGradeCode().compareTo(objIDIRNew.getGradeCode()) == 0)
					break;
				strCond.append("GRADE_CODE=?,");
				val.add(getStringNull(objIDIRNew.getGradeCode()));
			}

			switch (this.m_objProperty.getPositionCheck().toUpperCase().charAt(0)) {
			case 'Y':
				if (objIDIROld.getPositionCode().compareTo(objIDIRNew.getPositionCode()) == 0)
					break;
				if (objIDIRNew.getPositionCode().length() > 0) {
					if (isExistPositionID(objIDIRNew.getPositionCode())) {
						strCond.append("POSITION_CODE=?,");
						val.add(getStringNull(objIDIRNew.getPositionCode()));
					} else {
						strCond.append("POSITION_CODE=?,");
						val.add("");
					}
				} else {
					strCond.append("POSITION_CODE=?,");
					val.add("");
				}
				break;
			case 'N':
				if (objIDIROld.getPositionCode().compareTo(objIDIRNew.getPositionCode()) == 0)
					break;
				strCond.append("POSITION_CODE=?,");
				val.add(getStringNull(objIDIRNew.getPositionCode()));
				break;
			case 'I':
				break;
			default:
				if (objIDIROld.getPositionCode().compareTo(objIDIRNew.getPositionCode()) == 0)
					break;
				strCond.append("POSITION_CODE=?,");
				val.add(getStringNull(objIDIRNew.getPositionCode()));
			}

			switch (this.m_objProperty.getTitleCheck().toUpperCase().charAt(0)) {
			case 'Y':
				if (objIDIROld.getTitleCode().compareTo(objIDIRNew.getTitleCode()) == 0)
					break;
				if (objIDIRNew.getTitleCode().length() > 0) {
					if (isExistTitleID(objIDIRNew.getTitleCode())) {
						strCond.append("TITLE_CODE=?,");
						val.add(getStringNull(objIDIRNew.getTitleCode()));
					} else {
						strCond.append("TITLE_CODE=?,");
						val.add("");
					}
				} else {
					strCond.append("TITLE_CODE=?,");
					val.add("");
				}
				break;
			case 'N':
				if (objIDIROld.getTitleCode().compareTo(objIDIRNew.getTitleCode()) == 0)
					break;
				strCond.append("TITLE_CODE=?,");
				val.add(getStringNull(objIDIRNew.getTitleCode()));
				break;
			case 'I':
				break;
			default:
				if (objIDIROld.getTitleCode().compareTo(objIDIRNew.getTitleCode()) == 0)
					break;
				strCond.append("TITLE_CODE=?,");
				val.add(getStringNull(objIDIRNew.getTitleCode()));
			}

			if (objIDIROld.getSecurityLevel() != objIDIRNew.getSecurityLevel()) {
				strCond.append("SECURITY_LEVEL=?,");
				val.add(new Integer(objIDIRNew.getSecurityLevel()));
			}
			if (!objIDIROld.getSysMail().equals(objIDIRNew.getSysMail())) {
				strCond.append("SYSMAIL=?,");
				val.add(getStringNull(objIDIRNew.getSysMail()));
			}
			if (objIDIROld.getUserOrder() != objIDIRNew.getUserOrder()) {
				strCond.append("USER_ORDER=?,");
				val.add(new Integer(objIDIRNew.getUserOrder()));
			}

			if (this.m_objProperty.getSpecialCondition() != null) {
				for (int i = 0; i < this.m_objProperty.getSpecialCondition().size(); i++) {
					SpecialConditionObject objSpecialCondition = this.m_objProperty.getSpecialCondition(i);
					if (!objSpecialCondition.getConditionColumn().equals("employeetype"))
						continue;
					if (!objSpecialCondition.isExistColumnValue(objIDIRNew.getEmployeeType()))
						continue;
					LinkedList llInsertResctrictionInfo = objSpecialCondition.getUpdateRestrictionInfo();
					if (llInsertResctrictionInfo == null)
						continue;
					for (int j = 0; j < llInsertResctrictionInfo.size(); j++) {
						RestrictionColumnInfoObject objRestrictionColumn = (RestrictionColumnInfoObject) llInsertResctrictionInfo.get(j);
						if (objRestrictionColumn.getColumnName().equals("IS_DELETED")) {
							switch (objRestrictionColumn.getType().charAt(0)) {
							case 'S':
								strCond.append("IS_DELETED=?,");
								if (objRestrictionColumn.getColumnValue() == null || objRestrictionColumn.getColumnValue().equals("")) {
									val.add(new Integer(0));
								} else {
									val.add(new Integer(Integer.parseInt(objRestrictionColumn.getColumnValue())));
								}
								break;
							case 'I':
								break;
							default:
								if (objIDIROld.getIsDeleted() == objIDIRNew.getIsDeleted())
									break;
								strCond.append("IS_DELETED=?,");
								val.add(new Integer(objIDIRNew.getIsDeleted()));
							}
						}
						if (objRestrictionColumn.getColumnName().equals("EMPLOYEE_ID")) {
							switch (objRestrictionColumn.getType().charAt(0)) {
							case 'S':
								strCond.append("EMPLOYEE_ID=?,");
								val.add(getStringNull(objRestrictionColumn.getColumnValue()));
								break;
							case 'I':
								break;
							default:
								if (objIDIROld.getEmployeeID().equals(objIDIRNew.getEmployeeID()))
									break;
								strCond.append("EMPLOYEE_ID=?,");
								val.add(getStringNull(objIDIRNew.getEmployeeID()));
							}
						}
						if (!objRestrictionColumn.getColumnName().equals("RESIDENT_NO"))
							continue;
						switch (objRestrictionColumn.getType().charAt(0)) {
						case 'S':
							String strResidentNO = objRestrictionColumn.getColumnValue();
							if ((strResidentNO.length() > 0) && (this.m_strResidentNoEncoding.equals("Y")))
								strResidentNO = EncodeBySType(strResidentNO);
							strCond.append("RESIDENT_NO=?,");
							val.add(strResidentNO);
							break;
						case 'I':
							break;
						default:
							if (this.m_strResidentNoEncoding.equals("N")) {
								if (objIDIROld.getResidentNO().equals(objIDIRNew.getResidentNO()))
									continue;
								strCond.append("RESIDENT_NO=?,");
								val.add(getStringNull(objIDIRNew.getResidentNO()));
							} else {
								if (DecodeBySType(objIDIROld.getResidentNO()).equals(objIDIRNew.getResidentNO()))
									continue;
								strCond.append("RESIDENT_NO=?,");
								val.add(EncodeBySType(objIDIRNew.getResidentNO()));
							}
						}
					}
				}
			} else {
				if (objIDIROld.getIsDeleted() != objIDIRNew.getIsDeleted()) {
					strCond.append("IS_DELETED=?,");
					val.add(new Integer(objIDIRNew.getIsDeleted()));
				}
				if (!objIDIROld.getEmployeeID().equals(objIDIRNew.getEmployeeID())) {
					strCond.append("EMPLOYEE_ID=?,");
					val.add(getStringNull(objIDIRNew.getEmployeeID()));
				}
				if (!objIDIROld.getResidentNO().equals(objIDIRNew.getResidentNO())) {
					strCond.append("RESIDENT_NO=?,");
					val.add(getStringNull(objIDIRNew.getResidentNO()));
				}
			}
			if ((this.m_objProperty.getOptionalGTPName() != null) && (this.m_objProperty.getOptionalGTPName().length() > 0)) {
				if (!objIDIROld.getOptionalGTPName().equals(objIDIRNew.getOptionalGTPName())) {
					strCond.append("OPTIONAL_GTP_NAME=?,");
					val.add(getStringNull(objIDIRNew.getOptionalGTPName()));
				}
			}

			// -- userinformation_basic update start
			String strFilter = strCond.toString();
			if ((strFilter != null) && (strFilter.length() > 0)) {
				if (strFilter.endsWith(",")) {
					strFilter = strFilter.substring(0, strFilter.length() - 1);
				}
				strCommText.append("UPDATE TCN_USERINFORMATION_BASIC SET ");
				strCommText.append(strFilter);
				strCommText.append(" WHERE USER_ID=? ");
				val.add(objIDIROld.getUserID());
				slCommText.addLast(strCommText.toString());
				slColText.addLast(val);
			}
			// -- userinformation_basic update end

			// -- userinformation_addr update start
			strCommText.setLength(0);
			strCond.setLength(0);
			// val.clear();
			ArrayList val2 = new ArrayList();
			if (objIDIROld.getDuty().compareTo(objIDIRNew.getDuty()) != 0) {
				strCond.append("DUTY=?,");
				val2.add(getStringNull(objIDIRNew.getDuty()));
			}
			if (objIDIROld.getHomeAddr().compareTo(objIDIRNew.getHomeAddr()) != 0) {
				strCond.append("HOME_ADDR=?,");
				val2.add(getStringCutter(getStringNull(objIDIRNew.getHomeAddr()), 70));
			}
			if (objIDIROld.getHomeZipCode().compareTo(objIDIRNew.getHomeZipCode()) != 0) {
				strCond.append("HOME_ZIPCODE=?,");
				val2.add(getStringNull(objIDIRNew.getHomeZipCode()));
			}
			if (objIDIROld.getHomeTel().compareTo(objIDIRNew.getHomeTel()) != 0) {
				strCond.append("HOME_TEL=?,");
				val2.add(getStringCutter(getStringNull(objIDIRNew.getHomeTel()), 20));
			}
			if (objIDIROld.getHomeDetailAddr().compareTo(objIDIRNew.getHomeDetailAddr()) != 0) {
				strCond.append("HOME_DETAIL_ADDR=?,");
				val2.add(getStringCutter(getStringNull(objIDIRNew.getHomeDetailAddr()), 70));
			}
			if (objIDIROld.getOfficeAddr().compareTo(objIDIRNew.getOfficeAddr()) != 0) {
				strCond.append("OFFICE_ADDR=?,");
				val2.add(getStringCutter(getStringNull(objIDIRNew.getOfficeAddr()), 70));
			}
			if (objIDIROld.getMobile().compareTo(objIDIRNew.getMobile()) != 0) {
				strCond.append("MOBILE=?,");
				val2.add(getStringCutter(getStringNull(objIDIRNew.getMobile()), 20));
			}
			if (objIDIROld.getHomeFax().compareTo(objIDIRNew.getHomeFax()) != 0) {
				strCond.append("HOME_FAX=?,");
				val2.add(getStringNull(objIDIRNew.getHomeFax()));
			}
			if (objIDIROld.getOfficeDetailAddr().compareTo(objIDIRNew.getOfficeDetailAddr()) != 0) {
				strCond.append("OFFICE_DETAIL_ADDR=?,");
				val2.add(getStringCutter(getStringNull(objIDIRNew.getOfficeDetailAddr()), 70));
			}
			if (objIDIROld.getOfficeZipCode().compareTo(objIDIRNew.getOfficeZipCode()) != 0) {
				strCond.append("OFFICE_ZIPCODE=?,");
				val2.add(getStringNull(objIDIRNew.getOfficeZipCode()));
			}
			if (objIDIROld.getOfficeTel().compareTo(objIDIRNew.getOfficeTel()) != 0) {
				strCond.append("OFFICE_TEL=?,");
				val2.add(getStringCutter(getStringNull(objIDIRNew.getOfficeTel()), 20));
			}

			strFilter = strCond.toString();
			if ((strFilter != null) && (strFilter.length() > 0)) {
				if (strFilter.endsWith(",")) {
					strFilter = strFilter.substring(0, strFilter.length() - 1);
				}
				strCommText.append("UPDATE TCN_USERINFORMATION_ADDR SET ");
				strCommText.append(strFilter);
				strCommText.append(" WHERE USER_ID=? ");
				val2.add(objIDIROld.getUserUID());
				slCommText.addLast(strCommText.toString());
				slColText.addLast(val2);
			}
			// -- userinformation_addr update end

			bRV = executeCommandPrepared(slCommText, slColText);
			if (!bRV) {
				setLastError("[Error Function Name] updateUser()", false);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR updateUser2]" + e.getMessage());
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] updateUser()", false);
			setLogAdmin();
			bRV = false;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return bRV;
	}

	public boolean deleteUser(String strUserID) {
		StringBuffer strCommText = new StringBuffer();
		LinkedList slCommText = new LinkedList();
		LinkedList slColsText = new LinkedList();
		String strUserUID = "";
		String strUserRID = "";
		int nIsExistence = 0;
		int nIsDeleted = 0;
		int nIsConcurrent = 0;

		try {
			strCommText.append("SELECT USER_UID, IS_EXISTENCE, IS_CONCURRENT, USER_RID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_ID=? ");

			ArrayList vals = new ArrayList();
			vals.add(strUserID);

			if (!executeQueryPrepared(strCommText.toString(), vals)) {
				setLastError("[Error Function Name] deleteUser()- 겸직자 여부 체크", false);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
				return false;
			}
			try {
				ResultSet rs = this.m_connectionBroker.getResultSet();
				while (rs.next()) {
					strUserUID = rs.getString("USER_UID");
					strUserRID = rs.getString("USER_RID");
					strUserRID = (strUserRID == null) ? "" : strUserRID;
					nIsExistence = rs.getInt("IS_EXISTENCE");
					nIsConcurrent = rs.getInt("IS_CONCURRENT");
				}
			} catch (Exception e) {
				setLastError("[Error Function Name] deleteUser() - 겸직자 여부 체크", true);
				setLastError("[Error Description] " + e.getMessage(), false);
				return false;
			}
			if (nIsExistence == 1) {
				slCommText.clear();
				slColsText.clear();
				ArrayList val1 = new ArrayList();
				strCommText.setLength(0);
				switch (nIsConcurrent) {
				case 0:
				case 1:
					strCommText.append("UPDATE TCN_USERINFORMATION_BASIC SET IS_DELETED=2 WHERE USER_ID=?");
					slCommText.addLast(strCommText.toString());
					val1.add(strUserID);
					slColsText.addLast(val1);
					break;
				default:
					strCommText.append("UPDATE TCN_USERINFORMATION_BASIC SET IS_DELETED=2 WHERE USER_RID=?");
					slCommText.addLast(strCommText.toString());
					val1.add(strUserUID);
					slColsText.addLast(val1);

					strCommText.setLength(0);
					strCommText.append("UPDATE TCN_USERINFORMATION_BASIC SET IS_DELETED=2 WHERE USER_ID=?");
					slCommText.addLast(strCommText.toString());
					ArrayList val2 = new ArrayList();
					val2.add(strUserID);
					slColsText.addLast(val2);
				}
				if (!executeCommandPrepared(slCommText, slColsText)) {
					setLastError("[Error Function Name] deleteUser() - 원직자 삭제", false);
					setLogAdmin();
					this.m_connectionBroker.clearPreparedQuery();
					return false;
				}
			} else {
				strCommText.setLength(0);
				// val.clear();
				ArrayList val3 = new ArrayList();
				strCommText.append("SELECT IS_DELETED FROM TCN_USERINFORMATION_BASIC WHERE USER_UID=?");
				val3.add(strUserRID);
				if (!executeQueryPrepared(strCommText.toString(), val3)) {
					setLastError("[Error Function Name] deleteUser()- 원직자 삭제여부체크", false);
					setLogAdmin();
					this.m_connectionBroker.clearPreparedQuery();
					return false;
				}
				try {
					ResultSet rs = this.m_connectionBroker.getResultSet();
					while (rs.next()) {
						nIsDeleted = rs.getInt("IS_DELETED");
					}
				} catch (SQLException e) {
					setLastError("[Error Function Name] deleteUser() - 원직자 삭제여부체크", true);
					setLastError("[Error Description] " + e.getMessage(), false);
					return false;
				}
				if (nIsDeleted == 2) {
					slCommText.clear();
					slColsText.clear();
					// val.clear();
					ArrayList val4 = new ArrayList();
					strCommText.setLength(0);
					strCommText.append("UPDATE TCN_USERINFORMATION_BASIC SET IS_DELETED=2 WHERE USER_ID=?");
					slCommText.addLast(strCommText);
					val4.add(strUserID);
					slColsText.addLast(val4);

					if (!executeCommandPrepared(slCommText, slColsText)) {
						setLastError("[Error Function Name] deleteUser() - 겸직자 삭제", false);
						setLogAdmin();
						this.m_connectionBroker.clearPreparedQuery();
						return false;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("[UserAgent#deleteUser] " + e.getMessage());
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return true;
	}

	public boolean deleteUser(UserSourceObject objSource) {
		boolean bRV = true;
		StringBuffer strCommText = new StringBuffer();
		LinkedList slCommText = new LinkedList();
		LinkedList slColText = new LinkedList();
		ArrayList val = new ArrayList();
		try {
			strCommText.append("DELETE FROM TCN_USERINFORMATION_ASSOCIATED ");
			strCommText.append("WHERE USER_ID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_RID=(SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_ID=?))");
			slCommText.addLast(strCommText.toString());
			val.add(objSource.getUserID());
			slColText.addLast(val);

			strCommText.setLength(0);
			strCommText.append("DELETE FROM TCN_COMMONGROUPMEMBERS ");
			strCommText.append("WHERE MEMBER_ID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_RID=(SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_ID=?))");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val1 = new ArrayList();
			val1.add(objSource.getUserID());
			slColText.addLast(val1);

			strCommText.setLength(0);
			strCommText.append("DELETE FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_RID=(SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_ID=?)");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val2 = new ArrayList();
			val2.add(objSource.getUserID());
			slColText.addLast(val2);

			strCommText.setLength(0);
			strCommText.append("DELETE FROM TCN_USERINFORMATION_ADDR ");
			strCommText.append("WHERE USER_ID=(SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_ID=?)");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val3 = new ArrayList();
			val3.add(objSource.getUserID());
			slColText.addLast(val3);

			strCommText.setLength(0);
			strCommText.append("DELETE FROM TCN_USERINFORMATION_IMAGE ");
			strCommText.append("WHERE USER_ID=(SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_ID=?)");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val4 = new ArrayList();
			val4.add(objSource.getUserID());
			slColText.addLast(val4);

			strCommText.setLength(0);
			strCommText.append("DELETE FROM TCN_USERINFORMATION_TIME ");
			strCommText.append("WHERE USER_ID=(SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_ID=?)");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val5 = new ArrayList();
			val5.add(objSource.getUserID());
			slColText.addLast(val5);

			strCommText.setLength(0);
			strCommText.append("DELETE FROM TCN_USERINFORMATION_STATUS ");
			strCommText.append("WHERE USER_ID=(SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_ID=?)");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val6 = new ArrayList();
			val6.add(objSource.getUserID());
			slColText.addLast(val6);

			strCommText.setLength(0);
			strCommText.append("DELETE FROM TCN_USERINFORMATION_ASSOCIATED ");
			strCommText.append("WHERE USER_ID=(SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_ID=?)");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val7 = new ArrayList();
			val7.add(objSource.getUserID());
			slColText.addLast(val7);

			strCommText.setLength(0);
			strCommText.append("DELETE FROM TCN_USERINFORMATION_PASSWORD ");
			strCommText.append("WHERE USER_ID=(SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_ID=?)");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val8 = new ArrayList();
			val8.add(objSource.getUserID());
			slColText.addLast(val8);

			strCommText.setLength(0);
			strCommText.append("DELETE FROM TCN_COMMONGROUPMEMBERS ");
			strCommText.append("WHERE MEMBER_ID=(SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_ID=?)");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val9 = new ArrayList();
			val9.add(objSource.getUserID());
			slColText.addLast(val9);

			strCommText.setLength(0);
			strCommText.append("DELETE FROM TCN_USERINFORMATION_OPTION ");
			strCommText.append("WHERE USER_ID=(SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
			strCommText.append("WHERE USER_ID=?)");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val10 = new ArrayList();
			val10.add(objSource.getUserID());
			slColText.addLast(val10);

			strCommText.setLength(0);
			strCommText.append("DELETE FROM TCN_USERINFORMATION_BASIC WHERE USER_ID=?");
			slCommText.addLast(strCommText.toString());
			// val.clear();
			ArrayList val11 = new ArrayList();
			val11.add(objSource.getUserID());
			slColText.addLast(val11);

			if (!getConnection()) {
				setLastError("[Error Function Name] deleteUser()", false);
				setLogAdmin();
				bRV = false;
				closeConnection();
				return bRV;
			}

			if (!(bRV = executeCommandPrepared(slCommText, slColText))) {
				setLastError("[Error Function Name] deleteUser()", false);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
				bRV = false;
			}

		} catch (Exception e) {
			setLastError("[Error Function Name] deletUser()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			setLogAdmin();
			bRV = false;
		}

		return bRV;
	}

	public boolean deleteC10User() {
		boolean bRV = true;
		StringBuffer strCommText = new StringBuffer();
		LinkedList slCommText = new LinkedList();
		LinkedList slColText = new LinkedList();
		ArrayList val = new ArrayList();
		try {
			strCommText.append("DELETE FROM TCN_USERINFORMATION_BASIC WHERE COMP_ID=?");
			slCommText.add(slCommText);
			val.add("C10");
			slColText.add(val);

			if (!getConnection()) {
				setLastError("[Error Function Name] deleteC10User()", false);
				setLogAdmin();
				bRV = false;
				closeConnection();
				return bRV;
			}

			if (!(bRV = executeCommandPrepared(slCommText, slColText))) {
				setLastError("[Error Function Name] deleteC10User()", false);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
				bRV = false;
			}
		} catch (Exception e) {
			setLastError("[Error Function Name] deleteC10User()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			setLogAdmin();
			bRV = false;
		}

		return bRV;
	}

	public void closeConnection() {
		if (this.m_connectionBroker != null) {
			this.m_connectionBroker.clearConnectionBroker();
		}
	}

	/**
	 * @deprecated
	 * @param objSource
	 * @return
	 */
	private UserIDIRObject convertSourceToIDIRForInsert(UserSourceObject objSource) {
		try {
			if (this.m_orgAgent == null)
				this.m_orgAgent = new OrgAgent(this.m_connParamForACUBE, this.m_logAgent);
			OrganizationHierarchyObject objMyOrgInfo = this.m_orgAgent.getMyOrganizationInfo(objSource.getDeptID());
			if (objMyOrgInfo == null) {
				setLastError("[Error Function Name] convertSourceToIDIRForInsert()", true);
				setLastError("[Error Description] 사용자 계층 조직 정보를 찾을 수 없습니다.", true);
				return null;
			}

			UserIDIRObject objIDIR = new UserIDIRObject();

			objIDIR.setGroupID(objMyOrgInfo.getGroupID());
			objIDIR.setGroupName(objMyOrgInfo.getGroupName());
			objIDIR.setGroupOtherName(objMyOrgInfo.getGroupOtherName());
			objIDIR.setCompID(objMyOrgInfo.getCompID());
			objIDIR.setCompName(objMyOrgInfo.getCompName());
			objIDIR.setCompOtherName(objMyOrgInfo.getCompOtherName());
			objIDIR.setDeptID(objMyOrgInfo.getDeptID());
			objIDIR.setDeptName(objMyOrgInfo.getDeptName());
			objIDIR.setDeptOtherName(objMyOrgInfo.getDeptOtherName());

			objIDIR.setUserID(objSource.getUserID());
			objIDIR.setUserName(objSource.getUserName());
			objIDIR.setUserOtherName(objSource.getUserEName());

			objIDIR.setGradeCode(objSource.getGradeCode());
			objIDIR.setPositionCode(objSource.getPositionCode());
			objIDIR.setTitleCode(objSource.getTitleCode());

			objIDIR.setSecurityLevel(Integer.parseInt(objSource.getSecurityLevel()));
			objIDIR.setUserOrder(objSource.getUserOrder());

			objIDIR.setResidentNO(objSource.getResidentNO());
			objIDIR.setEmployeeID(objSource.getEmplyeeID());

			objIDIR.setSysMail(objSource.getSysMail());
			objIDIR.setEMail(objSource.getEMail());

			objIDIR.setHomePage(objSource.getHomePage());

			objIDIR.setOfficeTel(objSource.getOfficeTel());
			objIDIR.setOfficeTel2(objSource.getOfficeTel2());
			objIDIR.setOfficeAddr(objSource.getOfficeAddr());
			objIDIR.setOfficeDetailAddr(objSource.getOfficeAddrDetail());
			objIDIR.setOfficeFAX(objSource.getOfficeFax());
			objIDIR.setOfficeZipCode(objSource.getOfficeZipCode());

			objIDIR.setHomeTel(objSource.getHomeTel());
			objIDIR.setHomeTel2(objSource.getHomeTel2());
			objIDIR.setHomeFax(objSource.getHomeFax());
			objIDIR.setHomeAddr(objSource.getHomeAddr());
			objIDIR.setHomeDetailAddr(objSource.getHomeAddrDetail());
			objIDIR.setHomeZipCode(objSource.getHomeZipCode());

			objIDIR.setMobile(objSource.getMobile());
			objIDIR.setMobile2(objSource.getMobile2());
			objIDIR.setPager(objSource.getPager());

			objIDIR.setDuty(objSource.getDuty());
			objIDIR.setDescription(objSource.getDescription());
			objIDIR.setReserved1(objSource.getIsCheckPortal());

			if (!objSource.getSystemPassword().equals("")) {
				objIDIR.setPassword(EncodeBySType(objSource.getSystemPassword()));
			}

			objIDIR.setUserUID(objIDIR.getUserID());

			objIDIR.setIsExistence(1);

			switch (objSource.getUserStatus()) {
			case 1:
				objIDIR.setIsDeleted(0);
				break;
			case 2:
				objIDIR.setIsDeleted(1);
				break;
			case 4:
				objIDIR.setIsDeleted(2);
				break;
			case 3:
			default:
				objIDIR.setIsDeleted(0);
			}

			makeupOrgDisplayName(objIDIR);

			return objIDIR;
		} catch (Exception e) {
			setLastError("[Error Function Name] convertSourceToIDIRForInsert()", false);
			setLastError("[Error Description]" + e.getMessage(), false);
		}
		return null;
	}

	/**
	 * @deprecated
	 * @param objSource
	 * @return
	 */
	private UserIDIRObject convertSourceToIDIRForUpdate(UserSourceObject objSource) {
		try {
			if (this.m_orgAgent == null)
				this.m_orgAgent = new OrgAgent(this.m_connParamForACUBE, this.m_logAgent);
			OrganizationHierarchyObject objMyOrgInfo = this.m_orgAgent.getMyOrganizationInfo(objSource.getDeptID());
			if (objMyOrgInfo == null) {
				setLastError("[Error Function Name] convertSourceToIDIRForUpdate()", true);
				setLastError("[Error Description] 사용자 계층 조직 정보를 찾을 수 없습니다.", true);
				return null;
			}

			UserIDIRObject objIDIR = new UserIDIRObject();

			objIDIR.setGroupID(objMyOrgInfo.getGroupID());
			objIDIR.setGroupName(objMyOrgInfo.getGroupName());
			objIDIR.setGroupOtherName(objMyOrgInfo.getGroupOtherName());
			objIDIR.setCompID(objMyOrgInfo.getCompID());
			objIDIR.setCompName(objMyOrgInfo.getCompName());
			objIDIR.setCompOtherName(objMyOrgInfo.getCompOtherName());
			objIDIR.setDeptID(objMyOrgInfo.getDeptID());
			objIDIR.setDeptName(objMyOrgInfo.getDeptName());
			objIDIR.setDeptOtherName(objMyOrgInfo.getDeptOtherName());

			objIDIR.setUserID(objSource.getUserID());
			objIDIR.setUserName(objSource.getUserName());

			objIDIR.setGradeCode(objSource.getGradeCode());
			objIDIR.setPositionCode(objSource.getPositionCode());
			objIDIR.setTitleCode(objSource.getTitleCode());

			objIDIR.setSecurityLevel(Integer.parseInt(objSource.getSecurityLevel()));
			objIDIR.setUserOrder(objSource.getUserOrder());

			objIDIR.setResidentNO(objSource.getResidentNO());
			objIDIR.setEmployeeID(objSource.getEmplyeeID());

			objIDIR.setSysMail(objSource.getSysMail());
			objIDIR.setEMail(objSource.getEMail());

			objIDIR.setReserved1(objSource.getIsCheckPortal());

			if (!objSource.getSystemPassword().equals("")) {
				objIDIR.setPassword(EncodeBySType(objSource.getSystemPassword()));
			}

			objIDIR.setUserUID(objIDIR.getUserID());

			objIDIR.setIsExistence(1);
			switch (objSource.getUserStatus()) {
			case 1:
				objIDIR.setIsDeleted(0);
				break;
			case 2:
				objIDIR.setIsDeleted(1);
				break;
			case 4:
				objIDIR.setIsDeleted(2);
				break;
			case 3:
			default:
				objIDIR.setIsDeleted(0);
			}

			return objIDIR;
		} catch (Exception e) {
			setLastError("[Error Function Name] convertSourceToIDIRForUpdate()", false);
			setLastError("[Error Description]" + e.getMessage(), false);
		}
		return null;
	}

	private UserIDIRObject getUserInfo(String strUserID, boolean bOnlyCheckData) {
		StringBuffer strCommText = new StringBuffer();
		strCommText.append("SELECT a.*,b.*,c.SYSTEM_PASSWORD ");
		strCommText.append("FROM (SELECT * FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE USER_ID=?) a, ");
		strCommText.append("TCN_USERINFORMATION_ADDR b, ");
		strCommText.append("TCN_USERINFORMATION_PASSWORD c ");
		strCommText.append("WHERE b.USER_ID=a.USER_UID AND c.USER_ID=a.USER_UID");

		if (!getConnection()) {
			if (!bOnlyCheckData)
				setLastError("[Error Function Name] getUserInfo()", false);
			return null;
		}

		int idx = 1;
		this.m_connectionBroker.prepareStatement(strCommText.toString());
		this.m_connectionBroker.setString(idx++, strUserID);
		if (!this.m_connectionBroker.executePreparedQuery()) {
			if (!bOnlyCheckData) {
				setLastError("[Error Function Name] getUserInfo()", true);
				setLastError(this.m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
			}
			return null;
		}

		UserIDIRObject objIDIR = getUserIDIRFields(bOnlyCheckData);
		if (objIDIR == null) {
			if (!bOnlyCheckData)
				setLastError("[Error Function Name] getUserInfo()", false);
			this.m_connectionBroker.clearPreparedQuery();
			return null;
		}

		this.m_connectionBroker.clearPreparedQuery();
		return objIDIR;
	}

	private UserIDIRObject getUserInfoByUID(String strUserUID, boolean bOnlyCheckData) {
		StringBuffer strCommText = new StringBuffer();
		strCommText.append("SELECT a.*,b.*,c.SYSTEM_PASSWORD ");
		strCommText.append("FROM (SELECT * FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE USER_UID=?) a, ");
		strCommText.append("TCN_USERINFORMATION_ADDR b, TCN_USERINFORMATION_PASSWORD c ");
		strCommText.append("WHERE b.USER_ID=a.USER_UID AND c.USER_ID=a.USER_UID");

		if (!getConnection()) {
			if (!bOnlyCheckData)
				setLastError("[Error Function Name] getUserInfoByUID()", false);
			return null;
		}

		int idx = 1;
		this.m_connectionBroker.prepareStatement(strCommText.toString());
		this.m_connectionBroker.setString(idx++, strUserUID);
		if (!this.m_connectionBroker.executePreparedQuery()) {
			if (!bOnlyCheckData) {
				setLastError("[Error Function Name] getUserInfoByUID()", true);
				setLastError(this.m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
			}
			return null;
		}

		UserIDIRObject objIDIR = getUserIDIRFields(bOnlyCheckData);
		if (objIDIR == null) {
			if (!bOnlyCheckData)
				setLastError("[Error Function Name] getUserInfoByUID()", false);
			this.m_connectionBroker.clearPreparedQuery();
			return null;
		}

		this.m_connectionBroker.clearPreparedQuery();
		return objIDIR;
	}

	/**
	 * @deprecated
	 * @param strUserRID
	 * @return
	 */
	private UserIDIRObject getUserInfoByUserRID(String strUserRID) {
		StringBuffer strCommText = new StringBuffer();

		strCommText.append("SELECT a.USER_ID,a.USER_NAME,a.USER_OTHER_NAME,a.USER_UID,a.GROUP_ID,a.GROUP_NAME,");
		strCommText.append("a.COMP_ID,a.COMP_NAME,a.DEPT_ID,a.DEPT_NAME,a.GRADE_CODE,a.TITLE_CODE,a.POSITION_CODE,");
		strCommText.append("a.RESIDENT_NO,a.EMPLOYEE_ID,a.RESERVED1,b,DUTY,b.OFFICE_TEL,b.OFFICE_ADDR,b.OFFICE_DETAIL_ADDR,");
		strCommText.append("b.OFFICE_ZIPCODE,b.OFFICE_FAX,b.MOBILE,b.HOME_ADDR,b.HOME_DETAIL_ADDR,b.HOME_ZIPCODE,b.HOME_TEL ");
		strCommText.append("FROM TCN_USERINFORMATION_ADDR b, ");
		strCommText.append("(SELECT * FROM TCN_USERINFORMATION_BASIC WHERE USER_RID=?) a WHERE b.USER_ID=a.USER_UID");

		if (!getConnection()) {
			setLastError("[Error Function Name] getUserInfoByUserRID()", false);
			return null;
		}

		int idx = 1;
		this.m_connectionBroker.prepareStatement(strCommText.toString());
		this.m_connectionBroker.setString(idx++, strUserRID);

		if (!this.m_connectionBroker.executePreparedQuery()) {
			setLastError("[Error Function Name] getUserInfoByUserRID()", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			return null;
		}

		UserIDIRObject objIDIR = getUserIDIRFields(false);
		if (objIDIR == null) {
			setLastError("[Error Function Name] getUserInfoByUserRID()", false);
			this.m_connectionBroker.clearPreparedQuery();
			return null;
		}
		this.m_connectionBroker.clearPreparedQuery();
		return objIDIR;
	}

	private UserIDIRObject getUserBasicInfoByUserRID(String strUserRID, String strDeptID) {
		StringBuffer strCommText = new StringBuffer();

		strCommText.append("SELECT c.USER_ID,c.USER_NAME,c.USER_OTHER_NAME,c.USER_UID,c.GROUP_ID,c.GROUP_NAME,");
		strCommText.append("c.COMP_ID,c.COMP_NAME,c.DEPT_ID,c.DEPT_NAME,c.GRADE_CODE,c.TITLE_CODE,c.POSITION_CODE,");
		strCommText.append("c.RESIDENT_NO,c.EMPLOYEE_ID FROM TCN_USERINFORMATION_BASIC c ");
		strCommText.append("WHERE c.USER_ID=(SELECT USER_ID FROM TCN_USERINFORMATION_BASIC a, ");
		strCommText.append("(SELECT USER_UID FROM TCN_USERINFORMATION_BASIC WHERE USER_ID=? ");
		strCommText.append("AND DEPT_ID=?) b WHERE a.USER_RID=b.USER_UID)");
		if (!getConnection()) {
			setLastError("[Error Function Name] getUserBasicInfoByUserRID()", false);
			return null;
		}

		int idx = 1;
		this.m_connectionBroker.prepareStatement(strCommText.toString());
		this.m_connectionBroker.setString(idx++, strUserRID);
		this.m_connectionBroker.setString(idx++, strDeptID);
		if (!this.m_connectionBroker.executePreparedQuery()) {
			setLastError("[Error Function Name] getUserBasicInfoByUserRID()", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			return null;
		}

		UserIDIRObject objIDIR = getUserBasicIDIRFields();
		if (objIDIR == null) {
			setLastError("[Error Function Name] getUserBasicInfoByUserRID()", false);
			this.m_connectionBroker.clearPreparedQuery();
			return null;
		}

		this.m_connectionBroker.clearPreparedQuery();
		return objIDIR;
	}

	private UserIDIRObject getUserIDIRFields(boolean bOnlyCheckData) {
		UserIDIRObject objIDIR = new UserIDIRObject();
		String strValue = "";
		int nValue = 0;
		try {
			int n = 0;
			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				strValue = rs.getString("USER_ID");
				if (strValue != null) {
					objIDIR.setUserID(strValue);
				}
				strValue = rs.getString("USER_NAME");
				if (strValue != null) {
					objIDIR.setUserName(strValue);
				}
				strValue = rs.getString("USER_UID");
				if (strValue != null) {
					objIDIR.setUserUID(strValue);
				}
				strValue = rs.getString("GROUP_ID");
				if (strValue != null) {
					objIDIR.setGroupID(strValue);
				}
				strValue = rs.getString("GROUP_NAME");
				if (strValue != null) {
					objIDIR.setGroupName(strValue);
				}
				strValue = rs.getString("GROUP_OTHER_NAME");
				if (strValue != null) {
					objIDIR.setGroupOtherName(strValue);
				}
				strValue = rs.getString("COMP_ID");
				if (strValue != null) {
					objIDIR.setCompID(strValue);
				}
				strValue = rs.getString("COMP_NAME");
				if (strValue != null) {
					objIDIR.setCompName(strValue);
				}
				strValue = rs.getString("COMP_OTHER_NAME");
				if (strValue != null) {
					objIDIR.setCompOtherName(strValue);
				}
				strValue = rs.getString("DEPT_ID");
				if (strValue != null) {
					objIDIR.setDeptID(strValue);
				}
				strValue = rs.getString("DEPT_NAME");
				if (strValue != null) {
					objIDIR.setDeptName(strValue);
				}
				strValue = rs.getString("DEPT_OTHER_NAME");
				if (strValue != null) {
					objIDIR.setDeptOtherName(strValue);
				}
				strValue = rs.getString("ORG_DISPLAY_NAME");
				if (strValue != null) {
					objIDIR.setOrgDisplayName(strValue);
				}
				strValue = rs.getString("ORG_DISPLAY_OTHER_NAME");
				if (strValue != null) {
					objIDIR.setOrgDisplayOtherName(strValue);
				}
				strValue = rs.getString("GRADE_CODE");
				if (strValue != null) {
					objIDIR.setGradeCode(strValue);
				}
				strValue = rs.getString("POSITION_CODE");
				if (strValue != null) {
					objIDIR.setPositionCode(strValue);
				}
				strValue = rs.getString("TITLE_CODE");
				if (strValue != null) {
					objIDIR.setTitleCode(strValue);
				}
				strValue = rs.getString("RESIDENT_NO");
				if (strValue != null) {
					objIDIR.setResidentNO(strValue);
				}
				strValue = rs.getString("EMPLOYEE_ID");
				if (strValue != null) {
					objIDIR.setEmployeeID(strValue);
				}
				strValue = rs.getString("SYSMAIL");
				if (strValue != null) {
					objIDIR.setSysMail(strValue);
				}
				nValue = rs.getInt("USER_ORDER");
				objIDIR.setUserOrder(nValue);

				nValue = rs.getInt("SECURITY_LEVEL");
				objIDIR.setSecurityLevel(nValue);

				nValue = rs.getInt("IS_DELETED");
				objIDIR.setIsDeleted(nValue);

				strValue = rs.getString("DESCRIPTION");
				if (strValue != null) {
					objIDIR.setDescription(strValue);
				}
				strValue = rs.getString("RESERVED1");
				if (strValue != null) {
					objIDIR.setReserved1(strValue);
				}
				strValue = rs.getString("RESERVED2");
				if (strValue != null) {
					objIDIR.setReserved2(strValue);
				}
				strValue = rs.getString("RESERVED3");
				if (strValue != null) {
					objIDIR.setReserved3(strValue);
				}
				strValue = rs.getString("OPTIONAL_GTP_NAME");
				if (strValue != null) {
					objIDIR.setOptionalGTPName(strValue);
				}
				strValue = rs.getString("DUTY");
				if (strValue != null) {
					objIDIR.setDuty(strValue);
				}
				strValue = rs.getString("HOME_TEL");
				if (strValue != null) {
					objIDIR.setHomeTel(strValue);
				}
				strValue = rs.getString("HOME_DETAIL_ADDR");
				if (strValue != null) {
					objIDIR.setHomeDetailAddr(strValue);
				}
				strValue = rs.getString("OFFICE_ADDR");
				if (strValue != null) {
					objIDIR.setOfficeAddr(strValue);
				}
				strValue = rs.getString("MOBILE");
				if (strValue != null) {
					objIDIR.setMobile(strValue);
				}
				strValue = rs.getString("HOME_FAX");
				if (strValue != null) {
					objIDIR.setHomeFax(strValue);
				}
				strValue = rs.getString("OFFICE_DETAIL_ADDR");
				if (strValue != null) {
					objIDIR.setOfficeDetailAddr(strValue);
				}
				strValue = rs.getString("OFFICE_ZIPCODE");
				if (strValue != null) {
					objIDIR.setOfficeZipCode(strValue);
				}
				strValue = rs.getString("OFFICE_TEL");
				if (strValue != null) {
					objIDIR.setOfficeTel(strValue);
				}
				strValue = rs.getString("SYSTEM_PASSWORD");
				if (strValue != null) {
					objIDIR.setPassword(strValue);
				}
				n++;
			}

			if ((n < 1) && (!bOnlyCheckData)) {
				setLastError("[Error Function Name] getUserIDIRFields()", true);
				setLastError("[Error Description] 사용자 정보를 찾을 수 없습니다.", true);
			}
			if (n < 1) {
				System.out.println("[getUserIDIRFields] null!!!");
				return null;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] getUserIDIRFields()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return null;
		}
		return objIDIR;
	}

	private UserIDIRObject getUserBasicIDIRFields() {
		UserIDIRObject objIDIR = new UserIDIRObject();
		String strValue = "";
		try {
			int n = 0;
			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				strValue = rs.getString("USER_ID");
				if (strValue != null) {
					objIDIR.setUserID(strValue);
				}
				strValue = rs.getString("USER_NAME");
				if (strValue != null) {
					objIDIR.setUserName(strValue);
				}
				strValue = rs.getString("USER_UID");
				if (strValue != null) {
					objIDIR.setUserUID(strValue);
				}
				strValue = rs.getString("GROUP_ID");
				if (strValue != null) {
					objIDIR.setGroupID(strValue);
				}
				strValue = rs.getString("GROUP_NAME");
				if (strValue != null) {
					objIDIR.setGroupName(strValue);
				}
				strValue = rs.getString("COMP_ID");
				if (strValue != null) {
					objIDIR.setCompID(strValue);
				}
				strValue = rs.getString("COMP_NAME");
				if (strValue != null) {
					objIDIR.setCompName(strValue);
				}
				strValue = rs.getString("DEPT_ID");
				if (strValue != null) {
					objIDIR.setDeptID(strValue);
				}
				strValue = rs.getString("DEPT_NAME");
				if (strValue != null) {
					objIDIR.setDeptName(strValue);
				}
				strValue = rs.getString("GRADE_CODE");
				if (strValue != null) {
					objIDIR.setGradeCode(strValue);
				}
				strValue = rs.getString("POSITION_CODE");
				if (strValue != null) {
					objIDIR.setPositionCode(strValue);
				}
				strValue = rs.getString("TITLE_CODE");
				if (strValue != null) {
					objIDIR.setTitleCode(strValue);
				}
				strValue = rs.getString("RESIDENT_NO");
				if (strValue != null) {
					objIDIR.setResidentNO(strValue);
				}
				strValue = rs.getString("EMPLOYEE_ID");
				if (strValue != null) {
					objIDIR.setEmployeeID(strValue);
				}
				n++;
			}

			if (n < 1) {
				setLastError("[Error Function Name] getUserBasicIDIRFields()", true);
				setLastError("[Error Description] 사용자 정보를 찾을 수 없습니다.", true);
				return null;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] getUserBasicIDIRFields()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return null;
		}
		return objIDIR;
	}

	/**
	 * @deprecated
	 * @return
	 */
	private boolean isExistPictureInfo() {
		boolean bRV = false;
		Blob pictureBlob = null;
		try {
			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				pictureBlob = rs.getBlob("PICTURE");
				if (pictureBlob == null)
					continue;
				bRV = true;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] isExistPictureInfo()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return false;
		}
		return bRV;
	}

	/**
	 * 
	 * @deprecated
	 * @param strUserID
	 * @return
	 */
	private String getUserUIDByUserID(String strUserID) {
		String strRV = "";
		StringBuffer strCommText = new StringBuffer();
		strCommText.append("SELECT USER_UID FROM TCN_USERINFORMATION_BASIC WHERE USER_ID=?");
		if (!getConnection()) {
			setLastError("[Error Function Name] getUserUIDByUserID()", false);
			return null;
		}
		int idx = 1;
		this.m_connectionBroker.prepareStatement(strCommText.toString());
		this.m_connectionBroker.setString(idx++, strUserID);
		if (!this.m_connectionBroker.executePreparedQuery()) {
			setLastError("[Error Function Name] getUserUIDByUserID()", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			this.m_connectionBroker.clearPreparedQuery();
			return null;
		}
		try {
			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				strRV = rs.getString("USER_UID");
				// if (strRV != null)
				// continue;
				// strRV = "";
			}
			this.m_connectionBroker.clearPreparedQuery();
		} catch (SQLException e) {
			setLastError("[Error Function Name] getUserUIDByUserID()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return "";
		}
		return strRV;
	}

	private LinkedList getOptionByNO(String strOptionID) {
		LinkedList olOptions = null;
		StringBuffer strCommText = new StringBuffer();
		strCommText.append("SELECT * FROM TCN_OPTIONINFORMATION WHERE OPTION_ID=?");
		if (!getConnection()) {
			setLastError("[Error Function Name] getOptionByNO()", false);
			return null;
		}
		int idx = 1;
		this.m_connectionBroker.prepareStatement(strCommText.toString());
		this.m_connectionBroker.setString(idx++, strOptionID);
		if (!this.m_connectionBroker.executePreparedQuery()) {
			setLastError("[Error Function Name] getOptionByNO()", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			this.m_connectionBroker.clearPreparedQuery();
			return null;
		}
		olOptions = getOptionFields();
		if (olOptions == null) {
			setLastError("[Error Function Name] getOptionByNO()", false);
			this.m_connectionBroker.clearPreparedQuery();
			return null;
		}
		this.m_connectionBroker.clearPreparedQuery();
		return olOptions;
	}

	private LinkedList getOptionFields() {
		LinkedList olOptions = new LinkedList();
		String strValue = "";
		int nValue = 0;
		try {
			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				OptionObject objOption = new OptionObject();

				strValue = rs.getString("OPTION_ID");
				if (strValue != null) {
					objOption.setOptionID(strValue);
				}
				strValue = rs.getString("COMP_ID");
				if (strValue != null) {
					objOption.setCompID(strValue);
				}
				strValue = rs.getString("OPTION_TYPE");
				if (strValue != null) {
					objOption.setOptionType(strValue);
				}
				nValue = rs.getInt("VALUE_TYPE");
				objOption.setValueType(nValue);

				nValue = rs.getInt("INTEGER_VALUE");
				objOption.setIntegerValue(nValue);

				strValue = rs.getString("STRING_VALUE");
				if (strValue != null) {
					objOption.setStringValue(strValue);
				}
				strValue = rs.getString("MSTRING_VALUE");
				if (strValue != null) {
					objOption.setMStringValue(strValue);
				}
				strValue = rs.getString("DESCRIPTION");
				if (strValue != null) {
					objOption.setDescription(strValue);
				}
				olOptions.addLast(objOption);
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] getOptionFields()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return null;
		}

		return olOptions;
	}

	private void makeupOrgDisplayName(UserIDIRObject objIDIR) {
		String strInstitutionName = "";
		String strInstitutionOtherName = "";
		String strHierarchyNames = "";
		String strHierarchyOtherNames = "";
		String strGroupName = "";
		String strGroupOtherName = "";
		String strCompanyName = "";
		String strCompanyOtherName = "";
		String strDeptName = "";
		String strDeptOtherName = "";
		String strPartName = "";
		String strPartOtherName = "";
		String strFormat = "";
		String strOrgDisplayName = "";
		String strOrgDisplayOtherName = "";
		LinkedList olOptions = null;
		LinkedList olFormat = null;
		int nOrgType = 0;
		boolean bFind = false;

		olOptions = getOptionByNO("AIOPT69");
		if (olOptions == null) {
			return;
		}
		if (objIDIR.getDeptName().length() > 0)
			nOrgType = 2;
		else if (objIDIR.getCompName().length() > 0) {
			nOrgType = 1;
		}
		switch (nOrgType) {
		case 0:
			strGroupName = objIDIR.getGroupName();
			strCompanyName = objIDIR.getGroupName();
			strDeptName = objIDIR.getGroupName();
			strPartName = objIDIR.getPartName();

			strGroupOtherName = objIDIR.getGroupOtherName();
			strCompanyOtherName = objIDIR.getGroupOtherName();
			strDeptOtherName = objIDIR.getGroupOtherName();
			strPartOtherName = objIDIR.getPartOtherName();
			break;
		case 1:
			strGroupName = objIDIR.getGroupName();
			strCompanyName = objIDIR.getCompName();
			strDeptName = objIDIR.getCompName();
			strPartName = objIDIR.getPartName();

			strGroupOtherName = objIDIR.getGroupOtherName();
			strCompanyOtherName = objIDIR.getCompOtherName();
			strDeptOtherName = objIDIR.getCompOtherName();
			strPartOtherName = objIDIR.getPartOtherName();
			break;
		case 2:
			strGroupName = objIDIR.getGroupName();
			strCompanyName = objIDIR.getCompName();
			strDeptName = objIDIR.getDeptName();
			strPartName = objIDIR.getPartName();

			strGroupOtherName = objIDIR.getGroupOtherName();
			strCompanyOtherName = objIDIR.getCompOtherName();
			strDeptOtherName = objIDIR.getDeptOtherName();
			strPartOtherName = objIDIR.getPartOtherName();
		}

		if (nOrgType > 0) {
			for (int n = 0; (n < olOptions.size()) && (!bFind); n++) {
				OptionObject objOption = (OptionObject) olOptions.get(n);
				if (objOption.getCompID().compareTo(objIDIR.getCompID()) != 0)
					continue;
				strFormat = objOption.getStringValue();
				bFind = true;
			}

		}

		if (!bFind) {
			for (int n = 0; (!bFind) && (n < olOptions.size()); n++) {
				OptionObject objOption = (OptionObject) olOptions.get(n);
				if (objOption.getCompID().compareTo("DEFAULT") != 0)
					continue;
				strFormat = objOption.getStringValue();
				bFind = true;
			}

		}

		if ((strFormat.length() < 1) || (strFormat.indexOf("%") < 0)) {
			strOrgDisplayName = strFormat;
			strOrgDisplayOtherName = strFormat;
			return;
		}

		if (strFormat.indexOf("%D") > -1) {
			if (this.m_orgAgent == null)
				this.m_orgAgent = new OrgAgent(this.m_connParamForACUBE, this.m_logAgent);
			this.m_orgAgent.getMyInstitution(objIDIR.getDeptID(), strInstitutionName, strInstitutionOtherName);

			if (strInstitutionName.length() < 1) {
				switch (nOrgType) {
				case 0:
					strInstitutionName = objIDIR.getGroupName();
					strInstitutionOtherName = objIDIR.getGroupOtherName();
					break;
				case 1:
				case 2:
				case 3:
					strInstitutionName = objIDIR.getCompName();
					strInstitutionOtherName = objIDIR.getCompOtherName();
				}
			}
		}

		if (strFormat.indexOf("%F") > -1) {
			if (this.m_orgAgent == null)
				this.m_orgAgent = new OrgAgent(this.m_connParamForACUBE, this.m_logAgent);
			LinkedList llMyHierarchy = this.m_orgAgent.getMyHierarchyAllOrganizationInfo(objIDIR.getDeptID());

			if (llMyHierarchy != null) {
				for (int i = llMyHierarchy.size() - 1; i > 0; i--) {
					OrganizationObject objOrg = (OrganizationObject) llMyHierarchy.get(i);
					strHierarchyNames = strHierarchyNames + objOrg.getOrgName();
					strHierarchyOtherNames = strHierarchyOtherNames + objOrg.getOrgOtherName();

					if (i <= 1)
						continue;
					strHierarchyNames = strHierarchyNames + " ";
					strHierarchyOtherNames = strHierarchyOtherNames + " ";
				}
			}
		}

		String strTmp = strFormat;
		int nPos = -1;
		olFormat = new LinkedList();
		while (strTmp.length() > 0) {
			String strLeft = "";
			String strMid = "";
			String strRight = "";
			nPos = strTmp.indexOf("%");

			if (nPos < 0) {
				strLeft = strTmp;
				strTmp = "";
			} else {
				strLeft = strTmp.substring(0, nPos);
				strMid = strTmp.substring(nPos, nPos + 2);
				strRight = strTmp.substring(nPos + 2);
				strTmp = strRight;
			}

			if (strLeft.length() > 0) {
				ParseFormatObject objLeft = new ParseFormatObject();
				objLeft.setSyntax(strLeft);
				objLeft.setOtherSyntax(strLeft);
				olFormat.addLast(objLeft);
			}

			if (strMid.length() <= 0)
				continue;
			ParseFormatObject objMid = new ParseFormatObject();
			switch (strMid.charAt(1)) {
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
				objMid.setSyntax(strMid);
				objMid.setOtherSyntax(strMid);
				objMid.setType(0);
				break;
			default:
				objMid.setSyntax(strMid);
				objMid.setOtherSyntax(strMid);
			}
			olFormat.addLast(objMid);
		}

		for (int n = 0; n < olFormat.size(); n++) {
			ParseFormatObject objFormat = (ParseFormatObject) olFormat.get(n);
			if (objFormat.getType() != 0)
				continue;
			if (objFormat.getSyntax().compareTo("%A") == 0) {
				objFormat.setSyntax(strGroupName);
				objFormat.setOtherSyntax(strGroupOtherName);
			}
			if (objFormat.getSyntax().compareTo("%B") == 0) {
				objFormat.setSyntax(strCompanyName);
				objFormat.setOtherSyntax(strCompanyOtherName);
			}
			if (objFormat.getSyntax().compareTo("%C") == 0) {
				objFormat.setSyntax(strDeptName);
				objFormat.setOtherSyntax(strDeptOtherName);
			}
			if (objFormat.getSyntax().compareTo("%D") == 0) {
				objFormat.setSyntax(strInstitutionName);
				objFormat.setOtherSyntax(strInstitutionOtherName);
			}
			if (objFormat.getSyntax().compareTo("%E") == 0) {
				objFormat.setSyntax(strPartName);
				objFormat.setOtherSyntax(strPartOtherName);
			}
			if (objFormat.getSyntax().compareTo("%F") != 0)
				continue;
			objFormat.setSyntax(strHierarchyNames);
			objFormat.setOtherSyntax(strHierarchyOtherNames);
		}

		for (int n = 0; n < olFormat.size(); n++) {
			ParseFormatObject objFormat = (ParseFormatObject) olFormat.get(n);
			strOrgDisplayName = strOrgDisplayName + objFormat.getSyntax();
			strOrgDisplayOtherName = strOrgDisplayOtherName + objFormat.getOtherSyntax();
		}
		objIDIR.setOrgDisplayName(strOrgDisplayName);
		objIDIR.setOrgDisplayOtherName(strOrgDisplayOtherName);
	}

	public static String EncodeBySType(String strData) {
		return Encrypt.com_Encode(":" + strData + ":sisenc");
	}

	public static String DecodeBySType(String strData) {
		String strRet = "";
		int e = 0;
		int d = 0;
		strRet = Encrypt.com_Decode(strData);
		e = strRet.indexOf(":");
		d = strRet.indexOf(":sisenc");
		if ((e > -1) && (d > -1))
			strRet = strRet.substring(e + 1, d);
		return strRet;
	}

	private UserIDIRObject convertLDAPToUser(Employee employee, String strOrgID) {
		UserIDIRObject objUser = new UserIDIRObject();

		if (this.m_objProperty.getUserID().equals("employeenumber")) {
			objUser.setUserID(employee.getEmployeenumber());
		} else if (this.m_objProperty.getUserID().equals("epregisternumber")) {
			objUser.setUserID(employee.getEpregisternumber());
		} else if (this.m_objProperty.getUserID().equals("epid")) {
			objUser.setUserID(employee.getEpid());
		} else if (this.m_objProperty.getUserID().equals("uid")) {
			objUser.setUserID(employee.getUserid());
		}

		if (employee.getCn() != null)
			objUser.setUserName(employee.getCn());
		if (employee.getEpencn() != null)
			objUser.setUserOtherName(employee.getEpencn());
		if (employee.getDepartment() != null)
			objUser.setDeptName(employee.getDepartment());
		if (employee.getDepartmentnumber() != null)
			objUser.setDeptID(employee.getDepartmentnumber());
		if (employee.getEporganizationnumber() != null)
			objUser.setCompID(employee.getEporganizationnumber());
		if (employee.getEmployeenumber() != null)
			objUser.setEmployeeID(employee.getEmployeenumber());
		if (employee.getEpregisternumber() != null)
			objUser.setResidentNO(employee.getEpregisternumber());
		if (employee.getEptitlenumber() != null)
			objUser.setGradeCode(employee.getEptitlenumber());
		if (employee.getEpgradename() != null)
			objUser.setGradeName(employee.getEpgradename());
		if (employee.getEpentitle() != null) {
			objUser.setGradeOtherName(employee.getEpentitle());
		}
		if (employee.getMail() != null) {
			objUser.setSysMail(employee.getMail());
		}
		if (employee.getEpid() != null)
			objUser.setEPID(employee.getEpid());
		if (employee.getUserid() != null)
			objUser.setSingleUID(employee.getUserid());
		if (employee.getEmployeetype() != null) {
			objUser.setEmployeeType(employee.getEmployeetype());
		}
		switch (employee.getEpuserstatus().charAt(0)) {
		case 'B':
			objUser.setIsDeleted(0);
			break;
		}

		if (employee.getDescription() != null)
			objUser.setDuty(employee.getDescription().replaceAll("\"", ""));
		if (employee.getEphomel() != null)
			objUser.setHomeAddr(employee.getEphomel());
		if (employee.getEphomepostalcode() != null)
			objUser.setHomeZipCode(employee.getEphomepostalcode());
		if (employee.getHomephone() != null)
			objUser.setHomeTel(employee.getHomephone());
		if (employee.getHomepostaladdress() != null)
			objUser.setHomeDetailAddr(employee.getHomepostaladdress());
		if (employee.getL() != null)
			objUser.setOfficeAddr(employee.getL());
		if (employee.getMobile() != null)
			objUser.setMobile(employee.getMobile());
		if (employee.getOtherfacsimiletelephonenumber() != null)
			objUser.setHomeFax(employee.getOtherfacsimiletelephonenumber());
		if (employee.getPostaladdress() != null)
			objUser.setOfficeDetailAddr(employee.getPostaladdress());
		if (employee.getPostalcode() != null)
			objUser.setOfficeZipCode(employee.getPostalcode());
		if (employee.getTelephonenumber() != null) {
			objUser.setOfficeTel(employee.getTelephonenumber());
		}

		if ((this.m_objProperty.getArrAdditionalUserData() != null) && (this.m_objProperty.getArrAdditionalUserData().length > 0)) {
			int nLength = this.m_objProperty.getArrAdditionalUserData().length;
			for (int i = 0; i < nLength; i++) {
				String strIDirMethodName = "set" + this.m_objProperty.getArrAdditionalUserData(i, 0).substring(0, 1).toUpperCase()
						+ this.m_objProperty.getArrAdditionalUserData(i, 0).substring(1);
				String strEmployeeMethodName = "get" + this.m_objProperty.getArrAdditionalUserData(i, 1).substring(0, 1).toUpperCase()
						+ this.m_objProperty.getArrAdditionalUserData(i, 1).substring(1);
				try {
					String strEmpployeeValue = "";
					Method methodEmployee = employee.getClass().getDeclaredMethod(strEmployeeMethodName, null);
					if (methodEmployee != null) {
						strEmpployeeValue = (String) methodEmployee.invoke(employee, null);
					}
					if (strEmpployeeValue == null)
						continue;
					Class[] idirClass = new Class[1];
					idirClass[0] = String.class;
					Method methodIDir = objUser.getClass().getDeclaredMethod(strIDirMethodName, idirClass);
					Object[] params = new Object[1];
					params[0] = strEmpployeeValue;
					methodIDir.invoke(objUser, params);
				} catch (Exception e) {
					System.out.println("[convertLDAPToUser] " + e.getMessage());
					e.printStackTrace();
				}
			}
		}

		if ((this.m_objProperty.getOptionalGTPName() != null) && (this.m_objProperty.getOptionalGTPName().length() > 0)) {
			if (this.m_objProperty.getOptionalGTPName().compareTo("epgradename") > 0) {
				objUser.setOptionalGTPName(employee.getEpgradename());
			} else if (this.m_objProperty.getOptionalGTPName().compareTo("title") > 0) {
				objUser.setOptionalGTPName(employee.getTitle());
			}
		}

		if (this.m_orgAgent == null)
			this.m_orgAgent = new OrgAgent(this.m_connParamForACUBE, this.m_logAgent);
		OrganizationHierarchyObject objMyOrgInfo = this.m_orgAgent.getMyOrganizationInfo(strOrgID);
		if (objMyOrgInfo == null) {
			setLastError(this.m_orgAgent.getLastError(), true);
			setLastError("[Error Description] 사용자 계층 조직 정보를 찾을 수 없습니다.", true);
			setLastError("[Error Function Name] convertLDAPToUser()", true);
			return objUser;
		}

		objUser.setGroupID(objMyOrgInfo.getGroupID());
		objUser.setGroupName(objMyOrgInfo.getGroupName());
		objUser.setGroupOtherName(objMyOrgInfo.getGroupOtherName());
		objUser.setCompID(objMyOrgInfo.getCompID());
		objUser.setCompName(objMyOrgInfo.getCompName());
		objUser.setCompOtherName(objMyOrgInfo.getCompOtherName());
		objUser.setDeptID(objMyOrgInfo.getDeptID());
		objUser.setDeptName(objMyOrgInfo.getDeptName());
		objUser.setDeptOtherName(objMyOrgInfo.getDeptOtherName());

		makeupOrgDisplayName(objUser);

		return objUser;
	}

	LinkedList convertEmployeeToIDIR(Employee[] employee) {
		LinkedList slLinkedList = new LinkedList();
		for (int i = 0; i < employee.length; i++) {
			String strUserID = "";
			if (this.m_objProperty.getUserID().equals("employeenumber")) {
				strUserID = employee[i].getEmployeenumber();
			} else if (this.m_objProperty.getUserID().equals("epregisternumber")) {
				strUserID = employee[i].getEpregisternumber();
			} else if (this.m_objProperty.getUserID().equals("epid")) {
				strUserID = employee[i].getEpid();
			} else if (this.m_objProperty.getUserID().equals("uid")) {
				strUserID = employee[i].getUserid();
			}
			slLinkedList.addLast(strUserID);
		}
		return slLinkedList;
	}

	LinkedList getUsersByOrgID(String strOrgID) {
		LinkedList slLinkedList = null;
		StringBuffer strCommText = new StringBuffer();
		String strValue = "";
		strCommText.append("SELECT USER_ID FROM TCN_USERINFORMATION_BASIC WHERE DEPT_ID=?");
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] getUsersByOrgID()", false);
				return null;
			}
			int idx = 1;
			this.m_connectionBroker.prepareStatement(strCommText.toString());
			this.m_connectionBroker.setString(idx++, strOrgID);
			if (!this.m_connectionBroker.executePreparedQuery()) {
				setLastError("[Error Function Name] getUsersByOrgID()", true);
				setLastError(this.m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
				this.m_connectionBroker.clearPreparedQuery();
				return null;
			}
			int n = 0;
			ResultSet rs = this.m_connectionBroker.getResultSet();
			if (rs != null)
				slLinkedList = new LinkedList();
			while (rs.next()) {
				strValue = rs.getString("USER_ID");
				if (strValue != null)
					slLinkedList.addLast(strValue);
				n++;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] getUsersByOrgID() - SQLException", true);
			setLastError(e.getMessage(), true);
			LinkedList localLinkedList1 = slLinkedList;
			return localLinkedList1;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return slLinkedList;
	}

	LinkedList getUsersByOrgIDForDelete(String strOrgID) {
		LinkedList slLinkedList = null;
		StringBuffer strCommText = new StringBuffer();
		String strValue = "";
		strCommText.append("SELECT USER_ID,GRADE_CODE,POSITION_CODE,TITLE_CODE,RESERVED1,RESERVED2,RESERVED3,DESCRIPTION ");
		strCommText.append("FROM TCN_USERINFORMATION_BASIC WHERE DEPT_ID=?");
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] getUsersByOrgID()", false);
				return null;
			}
			int idx = 1;
			this.m_connectionBroker.prepareStatement(strCommText.toString());
			this.m_connectionBroker.setString(idx++, strOrgID);
			if (!this.m_connectionBroker.executePreparedQuery()) {
				setLastError("[Error Function Name] getUsersByOrgID()", true);
				setLastError(this.m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
				return null;
			}
			int n = 0;
			ResultSet rs = this.m_connectionBroker.getResultSet();
			if (rs != null)
				slLinkedList = new LinkedList();
			while (rs.next()) {
				UserIDIRObject objUser = new UserIDIRObject();
				strValue = rs.getString("USER_ID");
				if (strValue != null) {
					objUser.setUserID(strValue);
				}
				strValue = rs.getString("GRADE_CODE");
				if (strValue != null) {
					objUser.setGradeCode(strValue);
				}
				strValue = rs.getString("POSITION_CODE");
				if (strValue != null) {
					objUser.setPositionCode(strValue);
				}
				strValue = rs.getString("TITLE_CODE");
				if (strValue != null) {
					objUser.setTitleCode(strValue);
				}
				strValue = rs.getString("RESERVED1");
				if (strValue != null) {
					objUser.setReserved1(strValue);
				}
				strValue = rs.getString("RESERVED2");
				if (strValue != null) {
					objUser.setReserved2(strValue);
				}
				strValue = rs.getString("RESERVED3");
				if (strValue != null) {
					objUser.setReserved3(strValue);
				}
				strValue = rs.getString("DESCRIPTION");
				if (strValue != null) {
					objUser.setDescription(strValue);
				}
				slLinkedList.add(objUser);
				n++;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] getUsersByOrgID() - SQLException", true);
			setLastError(e.getMessage(), true);
			LinkedList localLinkedList1 = slLinkedList;
			return localLinkedList1;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return slLinkedList;
	}

	void clearCurInfo() {
		this.m_nCurSuccessCount = 0;
		this.m_nCurFailCount = 0;
		this.m_nCurInsertCount = 0;
		this.m_nCurUpdateCount = 0;
		this.m_nCurDeleteCount = 0;
	}

	boolean isExistUndeleteIDs(String strUserID) {
		boolean bRV = false;
		for (int i = 0; i < this.m_objProperty.getArrUnDeleteIDs().length; i++) {
			if (this.m_objProperty.getUnDeleteID(i).equals(strUserID)) {
				return true;
			}
		}
		return bRV;
	}

	boolean isExistGradeID(String strGradeID) {
		boolean bRV = false;
		StringBuffer strCommText = new StringBuffer();
		String strValue = "";

		strCommText.append("SELECT GRADE_ID FROM TCN_GRADEINFORMATION  WHERE GRADE_ID=?");
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] isExistGradeID()", false);
			}
			int idx = 1;
			this.m_connectionBroker.prepareStatement(strCommText.toString());
			this.m_connectionBroker.setString(idx++, strGradeID);
			if (!this.m_connectionBroker.executePreparedQuery()) {
				setLastError("[Error Function Name] isExistGradeID()", true);
				setLastError(this.m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
			}
			ResultSet rs = this.m_connectionBroker.getResultSet();

			while (rs.next()) {
				strValue = rs.getString("GRADE_ID");
				if (strValue != null)
					bRV = true;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] isExistPositionID() - SQLException", true);
			setLastError(e.getMessage(), true);
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return bRV;
	}

	boolean isExistPositionID(String strPositionID) {
		boolean bRV = false;
		StringBuffer strCommText = new StringBuffer();
		String strValue = "";
		strCommText.append("SELECT POSITION_ID FROM TCN_POSITIONINFORMATION WHERE POSITION_ID=?");
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] isExistPositionID()", false);
			}
			int idx = 1;
			this.m_connectionBroker.prepareStatement(strCommText.toString());
			this.m_connectionBroker.setString(idx++, strPositionID);
			if (!this.m_connectionBroker.executePreparedQuery()) {
				setLastError("[Error Function Name] isExistPositionID()", true);
				setLastError(this.m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
			}

			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				strValue = rs.getString("POSITION_ID");
				if (strValue != null)
					bRV = true;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] isExistPositionID() - SQLException", true);
			setLastError(e.getMessage(), true);
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}

		return bRV;
	}

	boolean isExistTitleID(String strTitleID) {
		boolean bRV = false;
		StringBuffer strCommText = new StringBuffer();
		String strValue = "";

		strCommText.append("SELECT TITLE_ID FROM TCN_TITLEINFORMATION WHERE TITLE_ID=?");
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] isExistTitleID()", false);
			}
			int idx = 1;
			this.m_connectionBroker.prepareStatement(strCommText.toString());
			this.m_connectionBroker.setString(idx++, strTitleID);
			if (!this.m_connectionBroker.executePreparedQuery()) {
				setLastError("[Error Function Name] isExistTitleID()", true);
				setLastError(this.m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
			}

			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				strValue = rs.getString("TITLE_ID");
				if (strValue != null)
					bRV = true;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] isExistTitleID() - SQLException", true);
			setLastError(e.getMessage(), true);
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return bRV;
	}

	private boolean isExistUndeleteUserCondition(UserIDIRObject objUser) {
		boolean bRV = false;
		try {
			String strValue = "";
			Method methodGet = UserIDIRObject.class.getDeclaredMethod(this.m_objProperty.getMethod(), null);
			if (methodGet != null) {
				strValue = (String) methodGet.invoke(objUser, null);
				if (this.m_objProperty.getConditionType().equals("P")) {
					strValue = strValue.substring(this.m_objProperty.getStart(), this.m_objProperty.getStart() + this.m_objProperty.getCharCount());
				}
			}
			if (strValue.equals(this.m_objProperty.getConditionValue()))
				bRV = true;
		} catch (Exception e) {
			setLastError("[Error Function Name] isExistUndeleteUserCondition() - Exception", true);
			setLastError(e.getMessage(), true);
			return false;
		}
		return bRV;
	}

	private String getResidentNoEncoding() {
		String strRV = "N";
		StringBuffer strCommText = new StringBuffer();
		strCommText.append("SELECT INFO_VALUE FROM TCN_GLOBAL_INFORMATION WHERE INFO_ID=?");
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] getResidentNoEncoding()", false);
				return null;
			}

			int idx = 1;
			this.m_connectionBroker.prepareStatement(strCommText.toString());
			this.m_connectionBroker.setString(idx++, "GI7");
			if (!this.m_connectionBroker.executePreparedQuery()) {
				setLastError("[Error Function Name] getResidentNoEncoding()", true);
				setLastError(this.m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
				this.m_connectionBroker.clearPreparedQuery();
				return null;
			}

			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				strRV = rs.getString("INFO_VALUE");
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] isExistTitleID() - SQLException", true);
			setLastError(e.getMessage(), true);
			return strRV;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return strRV;
	}

	private String getStringCutter(String val, int collen) {
		if (val == null) {
			return "";
		}
		String r_val = val;
		int oL = 0, rF = 0, rL = 0;
		try {
			byte[] bytes = r_val.getBytes("UTF-8"); // 바이트로 보관

			if (bytes.length <= collen) {
				return val;
			}
			
			int j = 0;
			j = rF;
			while (j < bytes.length) {
				if ((bytes[j] & 0x80) != 0) {
					if (oL + 2 > collen) {
						break;
					}
					oL += 2;
					rL += 3;
					j += 3;
				} else {
					if (oL + 1 > collen) {
						break;
					}
					++oL;
					++rL;
					++j;
				}
			}
			r_val = new String(bytes, rF, rL, "UTF-8");
		} catch (Exception e) {
			r_val = "";
		}
		return r_val;
	}

	private String getStringNull(String val) {
		if (val == null) {
			return "";
		}
		return val;
	}
}
