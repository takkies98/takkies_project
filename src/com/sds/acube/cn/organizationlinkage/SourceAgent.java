package com.sds.acube.cn.organizationlinkage;

import com.sds.acube.cn.common.vo.ConnectionParam;
import com.sds.acube.cn.org.db.ConnectionBroker;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class SourceAgent {
	public static final String SYCN_ORG_TABLE_NAME = "TKMID_ORGANIZATIONINFORMATION";
	public static final String SYCN_USER_TABLE_NAME = "TKMID_USERINFORMATION_BASIC";
	public static final String SYCN_POSITION_TABLE_NAME = "TKMID_POSITIONINFORMATION";
	public static final String SYCN_GRADE_TABLE_NAME = "TKMID_GRADEINFORMATION";
	private String m_strLastError;
	private LinkedList m_slErrors = null;
	private LogAgent m_logAgent = null;

	private ConnectionParam m_connParamForMIS = null;
	private ConnectionBroker m_connectionBroker = null;
	private LinkedList m_olData = null;

	private String m_strStandardDate = "";
	private int m_nNonCompareLastIndex = 0;
	private int m_nLastIndex = 0;

	public SourceAgent(ConnectionParam connParamForMIS, LinkedList olData, LogAgent logAgent) {
		this.m_connParamForMIS = connParamForMIS;
		this.m_olData = olData;
		this.m_logAgent = logAgent;
	}

	public boolean readSourceData() {
		StringBuffer strCommText = new StringBuffer();

		this.m_strStandardDate = getToday();

		if (!getConnection()) {
			setLastError("[Error Function Name] readSourceData() " + m_strStandardDate, false);
			setLogAdmin();
			return false;
		}

		strCommText.append("SELECT GRADE_ID,GRADE_NAME,GRADE_ORDER,GRADE_PARENT_ID,COMP_ID,ACTION_TYPE,");
		strCommText.append("TO_CHAR(MODIFY_DATE,'yyyy/mm/dd HH24:MI:SS.SSSSS') MODIFY_DATE,");
		strCommText.append("TO_CHAR(APPLY_DATE,'yyyy/mm/dd HH24:MI:SS.SSSSS') APPLY_DATE,IS_APPLY ");
		strCommText.append("FROM TKMID_GRADEINFORMATION WHERE IS_APPLY='B' ORDER BY MODIFY_DATE");

		if (this.m_connectionBroker.excuteQuery(strCommText.toString())) {
			if (!getSourceGradeFields()) {
				setLastError("[Error Function Name] readSourceData() - GradeInfo", false);
				setLogAdmin();
				return false;
			}
		} else {
			setLastError("[Error Function Name] readSourceData() - GradeInfo", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			setLogAdmin();
			this.m_connectionBroker.clearQuery();
			return false;
		}
		strCommText.setLength(0);
		strCommText.append("SELECT POSITION_ID,POSITION_NAME,POSITION_ORDER,POSITION_PARENT_ID,");
		strCommText.append("COMP_ID,TO_CHAR(MODIFY_DATE,'yyyy/mm/dd HH24:MI:SS.SSSSS') MODIFY_DATE,");
		strCommText.append("ACTION_TYPE,IS_APPLY,TO_CHAR(APPLY_DATE,'yyyy/mm/dd HH24:MI:SS.SSSSS') APPLY_DATE ");
		strCommText.append("FROM TKMID_POSITIONINFORMATION WHERE IS_APPLY='B' ORDER BY MODIFY_DATE");

		if (this.m_connectionBroker.excuteQuery(strCommText.toString())) {
			if (!getSourcePositionFields()) {
				setLastError("[Error Function Name] readSourceData() - PositionInfo", false);
				setLogAdmin();
				return false;
			}
		} else {
			setLastError("[Error Function Name] readSourceData() - PositionInfo", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			setLogAdmin();
			this.m_connectionBroker.clearQuery();
			return false;
		}
		strCommText.setLength(0);
		strCommText.append("SELECT ORG_NAME,ORG_ABBR_NAME,ORG_ID,ORG_CODE,ORG_PARENT_ID,ORG_ORDER,");
		strCommText.append("DESCRIPTION,HOMEPAGE,EMAIL,ADDRESS,ADDRESS_DETAIL,ZIP_CODE,TELEPHONE,FAX,IS_DELETED,");
		strCommText.append("ACTION_TYPE,TO_CHAR(MODIFY_DATE,'yyyy/mm/dd HH24:MI:SS.SSSSS') MODIFY_DATE,");
		strCommText.append("TO_CHAR(APPLY_DATE,'yyyy/mm/dd HH24:MI:SS.SSSSS') APPLY_DATE,IS_APPLY ");
		strCommText.append("FROM TKMID_ORGANIZATIONINFORMATION WHERE IS_APPLY='B' ORDER BY MODIFY_DATE");

		if (this.m_connectionBroker.excuteQuery(strCommText.toString())) {
			if (!getSourceOrgFields()) {
				setLastError("[Error Function Name] readSourceData() - OrganizationInfo", false);
				setLogAdmin();
				return false;
			}
		} else {
			setLastError("[Error Function Name] readSourceData() - OrganizationInfo", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			setLogAdmin();
			this.m_connectionBroker.clearQuery();
			return false;
		}
		strCommText.setLength(0);
		strCommText.append("SELECT USER_ID,USER_NAME,GROUP_ID,GROUP_NAME,COMP_ID,COMP_NAME,DEPT_ID,DEPT_NAME,");
		strCommText.append("GRADE_NAME,GRADE_ABBR_NAME,GRADE_CODE,GRADE_ORDER,TITLE_NAME,TITLE_CODE,TITLE_ORDER,");
		strCommText.append("POSITION_NAME,POSITION_CODE,POSITION_ABBR_NAME,POSITION_ORDER,USER_ORDER,SECURITY_LEVEL,");
		strCommText.append("RESIDENT_NO,EMPLOYEE_UID,SYSMAIL,EMAIL,USER_STATUS,SERVERS,DUTY,HOMEPAGE,OFFICE_TEL,OFFICE_TEL2,");
		strCommText.append("OFFICE_ADDR,OFFICE_DETAIL_ADDR,OFFICE_ZIPCODE,OFFICE_FAX,MOBILE,MOBILE2,PAGER,");
		strCommText.append("HOME_ADDR,HOME_DETAIL_ADDR,HOME_ZIPCODE,HOME_TEL,HOME_TEL2,HOME_FAX,DESCRIPTION,SYSTEM_PASSWORD,");
		strCommText.append("ACTION_TYPE,TO_CHAR(MODIFY_DATE,'yyyy/mm/dd HH24:MI:SS.SSSSS') MODIFY_DATE,");
		strCommText.append("TO_CHAR(APPLY_DATE,'yyyy/mm/dd HH24:MI:SS.SSSSS') APPLY_DATE,IS_CHECK_POTAL,IS_APPLY ");
		strCommText.append("FROM TKMID_USERINFORMATION_BASIC WHERE IS_APPLY='B' ORDER BY MODIFY_DATE");

		if (this.m_connectionBroker.excuteQuery(strCommText.toString())) {
			this.m_nLastIndex = this.m_nNonCompareLastIndex;
			if (!getSourceUserFields()) {
				setLastError("[Error Function Name] readSourceData() - User Info", false);
				setLogAdmin();
				return false;
			}
		} else {
			setLastError("[Error Function Name] readSourceData() - User Info", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			setLogAdmin();
			this.m_connectionBroker.clearQuery();
			return false;
		}

		if (this.m_olData.size() < 1) {
			setLastError("[Error Function Name] readSourceData()", true);
			setLastError("[Error Description] 처리할 데이터가 없습니다..", true);
			setLogAdmin();
			return false;
		}

		return true;
	}

	public boolean updateSourceDataForUser(UserSourceObject objUserSource) {
		boolean bRetVal = true;
		StringBuffer strCommText = new StringBuffer();

		if (!getConnection()) {
			return false;
		}
		strCommText.append("UPDATE TKMID_USERINFORMATION_BASIC SET IS_APPLY=?,APPLY_DATE=SYSDATE ");
		strCommText.append("WHERE USER_ID=? AND MODIFY_DATE=TO_DATE(?,'yyyy/mm/dd HH24:MI:SS.SSSSS')");

		int idx = 1;
		this.m_connectionBroker.prepareStatement(strCommText.toString());
		this.m_connectionBroker.setString(idx++, objUserSource.getApp());
		this.m_connectionBroker.setString(idx++, objUserSource.getUserID());
		this.m_connectionBroker.setString(idx++, objUserSource.getCreateDate());

		if (this.m_connectionBroker.executePreparedUpdate() < 1) {
			setLastError("[Error Function Name] updateSourceDataForUser()", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			setLogAdmin();
			this.m_connectionBroker.clearPreparedQuery();
			return false;
		}

		return bRetVal;
	}

	public boolean updateSourceDataForOrg(OrgSourceObject objOrgSource) {
		boolean bRetVal = true;
		StringBuffer strCommText = new StringBuffer();

		if (!getConnection()) {
			return false;
		}
		strCommText.append("UPDATE TKMID_ORGANIZATIONINFORMATION SET IS_APPLY=? ,APPLY_DATE=SYSDATE ");
		strCommText.append("WHERE ORG_ID=? AND MODIFY_DATE=TO_DATE(?,'yyyy/mm/dd HH24:MI:SS.SSSSS')");
		int idx = 1;
		this.m_connectionBroker.prepareStatement(strCommText.toString());
		this.m_connectionBroker.setString(idx++, objOrgSource.getApp());
		this.m_connectionBroker.setString(idx++, objOrgSource.getOrgID());
		this.m_connectionBroker.setString(idx++, objOrgSource.getCreateDate());
		if (this.m_connectionBroker.executePreparedUpdate() < 1) {		
			setLastError("[Error Function Name] updateSourceDataForOrg()", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			setLogAdmin();
			this.m_connectionBroker.clearPreparedQuery();
			return false;
		}

		return bRetVal;
	}

	public boolean updateSourceDataForGrade(GradeSourceObject objGradeSource) {
		boolean bRetVal = true;
		StringBuffer strCommText = new StringBuffer();

		if (!getConnection()) {
			return false;
		}
		strCommText.append("UPDATE TKMID_GRADEINFORMATION SET IS_APPLY=? ,APPLY_DATE=SYSDATE ");
		strCommText.append("WHERE GRADE_ID=? AND MODIFY_DATE=TO_DATE(?,'yyyy/mm/dd HH24:MI:SS.SSSSS')");
		
		int idx = 1;
		this.m_connectionBroker.prepareStatement(strCommText.toString());
		this.m_connectionBroker.setString(idx++, objGradeSource.getApp());
		this.m_connectionBroker.setString(idx++, objGradeSource.getGradeID());
		this.m_connectionBroker.setString(idx++, objGradeSource.getCreateDate());
		
		if (this.m_connectionBroker.executePreparedUpdate() < 1) {		
			setLastError("[Error Function Name] updateSourceDataForGrade()", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			setLogAdmin();
			this.m_connectionBroker.clearPreparedQuery();
			return false;
		}

		return bRetVal;
	}

	public boolean updateSourceDataForPosition(PositionSourceObject objPositionSource) {
		boolean bRetVal = true;
		StringBuffer strCommText = new StringBuffer();

		if (!getConnection()) {
			return false;
		}
		strCommText.append("UPDATE TKMID_POSITIONINFORMATION SET IS_APPLY=? ,APPLY_DATE=SYSDATE ");
		strCommText.append("WHERE POSITION_ID=? AND MODIFY_DATE=TO_DATE(?,'yyyy/mm/dd HH24:MI:SS.SSSSS')");
		
		int idx = 1;
		this.m_connectionBroker.prepareStatement(strCommText.toString());
		this.m_connectionBroker.setString(idx++, objPositionSource.getApp());
		this.m_connectionBroker.setString(idx++, objPositionSource.getPositionID());
		this.m_connectionBroker.setString(idx++, objPositionSource.getCreateDate());
		
		if (this.m_connectionBroker.executePreparedUpdate() < 1) {		
			setLastError("[Error Function Name] updateSourceDataForPosition()", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			setLogAdmin();
			this.m_connectionBroker.clearPreparedQuery();
			return false;
		}

		return bRetVal;
	}

	private boolean getSourceGradeFields() {
		String strValue = "";
		int nValue = 0;
		try {
			int n = 0;
			ResultSet rs = this.m_connectionBroker.getResultSet();

			while (rs.next()) {
				GradeSourceObject objGradeSource = new GradeSourceObject();
				objGradeSource.setObjectType(3);

				strValue = rs.getString("MODIFY_DATE");
				if (strValue != null) {
					objGradeSource.setCreateDate(strValue);
				}

				strValue = rs.getString("IS_APPLY");
				if (strValue != null) {
					objGradeSource.setApp(strValue);
				}

				strValue = rs.getString("ACTION_TYPE");
				if (strValue != null) {
					objGradeSource.setActionType(strValue);
				}

				strValue = rs.getString("GRADE_ID");
				if (strValue != null) {
					objGradeSource.setGradeID(strValue);
				}

				strValue = rs.getString("GRADE_NAME");
				if (strValue != null) {
					objGradeSource.setGradeName(strValue);
				}

				strValue = rs.getString("GRADE_PARENT_ID");
				if (strValue != null) {
					objGradeSource.setGradeParentID(strValue);
				}

				nValue = rs.getInt("GRADE_ORDER");
				objGradeSource.setGradeOrder(nValue);

				strValue = rs.getString("APPLY_DATE");
				if (strValue != null) {
					objGradeSource.setApplyDate(strValue);
				}

				this.m_olData.addLast(objGradeSource);

				n++;
			}

			this.m_nNonCompareLastIndex = this.m_olData.size();
		} catch (SQLException e) {
			setLastError("[Error Function Name] getSourceGradeFields()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return false;
		}

		return true;
	}

	private boolean getSourcePositionFields() {
		String strValue = "";
		int nValue = 0;
		try {
			int n = 0;
			ResultSet rs = this.m_connectionBroker.getResultSet();

			while (rs.next()) {
				PositionSourceObject objPositionSource = new PositionSourceObject();
				objPositionSource.setObjectType(2);

				strValue = rs.getString("MODIFY_DATE");
				if (strValue != null) {
					objPositionSource.setCreateDate(strValue);
				}

				strValue = rs.getString("IS_APPLY");
				if (strValue != null) {
					objPositionSource.setApp(strValue);
				}

				strValue = rs.getString("ACTION_TYPE");
				if (strValue != null) {
					objPositionSource.setActionType(strValue);
				}

				strValue = rs.getString("POSITION_ID");
				if (strValue != null) {
					objPositionSource.setPositionID(strValue);
				}

				strValue = rs.getString("POSITION_NAME");
				if (strValue != null) {
					objPositionSource.setPositionName(strValue);
				}

				strValue = rs.getString("POSITION_PARENT_ID");
				if (strValue != null) {
					objPositionSource.setPositionParentID(strValue);
				}

				strValue = rs.getString("POSITION_PARENT_ID");
				if (strValue != null) {
					objPositionSource.setPositionParentID(strValue);
				}

				nValue = rs.getInt("POSITION_ORDER");
				objPositionSource.setPositionOrder(nValue);

				strValue = rs.getString("APPLY_DATE");
				if (strValue != null) {
					objPositionSource.setApplyDate(strValue);
				}

				this.m_olData.addLast(objPositionSource);

				n++;
			}

			this.m_nNonCompareLastIndex = this.m_olData.size();
		} catch (SQLException e) {
			setLastError("[Error Function Name] getSourcePositionFields()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return false;
		}

		return true;
	}

	private boolean getSourceOrgFields() {
		String strValue = "";
		int nValue = 0;
		try {
			int n = 0;
			ResultSet rs = this.m_connectionBroker.getResultSet();

			while (rs.next()) {
				OrgSourceObject objOrgSource = new OrgSourceObject();
				strValue = rs.getString("MODIFY_DATE");
				if (strValue != null) {
					objOrgSource.setCreateDate(strValue);
				}

				strValue = rs.getString("IS_APPLY");
				if (strValue != null) {
					objOrgSource.setApp(strValue);
				}

				strValue = rs.getString("ACTION_TYPE");
				if (strValue != null) {
					objOrgSource.setActionType(strValue);
				}

				strValue = rs.getString("ORG_ID");
				if (strValue != null) {
					objOrgSource.setOrgID(strValue);
				}

				strValue = rs.getString("ORG_CODE");
				if (strValue != null) {
					objOrgSource.setOrgCode(strValue);
				}

				strValue = rs.getString("ORG_NAME");
				if (strValue != null) {
					objOrgSource.setOrgName(strValue);
				}

				strValue = rs.getString("ORG_PARENT_ID");
				if (strValue != null) {
					objOrgSource.setOrgParentID(strValue);
				}

				nValue = rs.getInt("ORG_ORDER");
				objOrgSource.setOrgOrder(nValue);

				strValue = rs.getString("ORG_ABBR_NAME");
				if (strValue != null) {
					objOrgSource.setOrgAbbrName(strValue);
				}

				strValue = rs.getString("DESCRIPTION");
				if (strValue != null) {
					objOrgSource.setDescription(strValue);
				}

				strValue = rs.getString("HOMEPAGE");
				if (strValue != null) {
					objOrgSource.setHomePage(strValue);
				}

				strValue = rs.getString("EMAIL");
				if (strValue != null) {
					objOrgSource.setEMail(strValue);
				}

				strValue = rs.getString("ADDRESS");
				if (strValue != null) {
					objOrgSource.setAddress(strValue);
				}

				strValue = rs.getString("ADDRESS_DETAIL");
				if (strValue != null) {
					objOrgSource.setAddressDetail(strValue);
				}

				strValue = rs.getString("ZIP_CODE");
				if (strValue != null) {
					objOrgSource.setZipCode(strValue);
				}

				strValue = rs.getString("TELEPHONE");
				if (strValue != null) {
					objOrgSource.setTelephone(strValue);
				}

				strValue = rs.getString("FAX");
				if (strValue != null) {
					objOrgSource.setFax(strValue);
				}

				nValue = rs.getInt("IS_DELETED");
				objOrgSource.setIsDeleted(nValue);

				strValue = rs.getString("APPLY_DATE");
				if (strValue != null) {
					objOrgSource.setApplyDate(strValue);
				}

				this.m_olData.addLast(objOrgSource);

				n++;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] getSourceOrgFields()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return false;
		}

		return true;
	}

	private boolean getSourceUserFields() {
		String strValue = "";
		int nValue = 0;
		boolean bAddLast = false;
		try {
			if ((this.m_olData == null) || (this.m_olData.size() < 1)) {
				bAddLast = true;
			}
			int n = 0;
			ResultSet rs = this.m_connectionBroker.getResultSet();

			while (rs.next()) {
				UserSourceObject objUserSource = new UserSourceObject();
				objUserSource.setObjectType(1);

				strValue = rs.getString("MODIFY_DATE");
				if (strValue != null) {
					objUserSource.setCreateDate(strValue);
				}

				strValue = rs.getString("ACTION_TYPE");
				if (strValue != null) {
					objUserSource.setActionType(strValue);
				}

				strValue = rs.getString("IS_APPLY");
				if (strValue != null) {
					objUserSource.setApp(strValue);
				}

				strValue = rs.getString("USER_ID");
				if (strValue != null) {
					objUserSource.setUserID(strValue);
				}

				strValue = rs.getString("USER_NAME");
				if (strValue != null) {
					objUserSource.setUserName(strValue);
				}

				strValue = rs.getString("GROUP_ID");
				if (strValue != null) {
					objUserSource.setGroupID(strValue);
				}

				strValue = rs.getString("GROUP_NAME");
				if (strValue != null) {
					objUserSource.setGroupName(strValue);
				}

				strValue = rs.getString("COMP_ID");
				if (strValue != null) {
					objUserSource.setCompID(strValue);
				}

				strValue = rs.getString("COMP_NAME");
				if (strValue != null) {
					objUserSource.setCompName(strValue);
				}

				strValue = rs.getString("DEPT_ID");
				if (strValue != null) {
					objUserSource.setDeptID(strValue);
				}

				strValue = rs.getString("DEPT_NAME");
				if (strValue != null) {
					objUserSource.setDeptName(strValue);
				}

				strValue = rs.getString("GRADE_CODE");
				if (strValue != null) {
					objUserSource.setGradeCode(strValue);
				}

				strValue = rs.getString("GRADE_NAME");
				if (strValue != null) {
					objUserSource.setGradeName(strValue);
				}

				strValue = rs.getString("GRADE_ABBR_NAME");
				if (strValue != null) {
					objUserSource.setGradeAbbrName(strValue);
				}

				nValue = rs.getInt("GRADE_ORDER");
				objUserSource.setGradeOrder(nValue);

				strValue = rs.getString("TITLE_NAME");
				if (strValue != null) {
					objUserSource.setTitleName(strValue);
				}

				strValue = rs.getString("TITLE_CODE");
				if (strValue != null) {
					objUserSource.setTitleCode(strValue);
				}

				nValue = rs.getInt("TITLE_ORDER");
				objUserSource.setTitleOrder(nValue);

				strValue = rs.getString("POSITION_CODE");
				if (strValue != null) {
					strValue = strValue.trim();
					objUserSource.setPositionCode(strValue);
				}

				strValue = rs.getString("POSITION_NAME");
				if (strValue != null) {
					strValue = strValue.trim();
					objUserSource.setPositionName(strValue);
				}

				strValue = rs.getString("POSITION_ABBR_NAME");
				if (strValue != null) {
					strValue = strValue.trim();
					objUserSource.setPositionAbbrName(strValue);
				}

				nValue = rs.getInt("POSITION_ORDER");
				objUserSource.setPositionOrder(nValue);

				nValue = rs.getInt("USER_ORDER");
				objUserSource.setUserOrder(nValue);

				strValue = rs.getString("RESIDENT_NO");
				if (strValue != null) {
					objUserSource.setResidentNO(strValue);
				}

				strValue = rs.getString("EMPLOYEE_UID");
				if (strValue != null) {
					objUserSource.setEmplyeeID(strValue);
				}

				strValue = rs.getString("SECURITY_LEVEL");
				if (strValue != null) {
					objUserSource.setSecurityLevel(strValue);
				}

				strValue = rs.getString("SYSMAIL");
				if (strValue != null) {
					objUserSource.setSysMail(strValue);
				}

				strValue = rs.getString("EMAIL");
				if (strValue != null) {
					objUserSource.setEMail(strValue);
				}

				nValue = rs.getInt("USER_STATUS");
				objUserSource.setUserStatus(nValue);

				strValue = rs.getString("SERVERS");
				if (strValue != null) {
					objUserSource.setServers(strValue);
				}

				strValue = rs.getString("DUTY");
				if (strValue != null) {
					objUserSource.setDuty(strValue);
				}

				strValue = rs.getString("HOMEPAGE");
				if (strValue != null) {
					objUserSource.setDuty(strValue);
				}

				strValue = rs.getString("OFFICE_TEL");
				if (strValue != null) {
					objUserSource.setOfficeTel(strValue);
				}

				strValue = rs.getString("OFFICE_TEL2");
				if (strValue != null) {
					objUserSource.setOfficeTel2(strValue);
				}

				strValue = rs.getString("OFFICE_FAX");
				if (strValue != null) {
					objUserSource.setOfficeFax(strValue);
				}

				strValue = rs.getString("OFFICE_ADDR");
				if (strValue != null) {
					objUserSource.setOfficeAddr(strValue);
				}

				strValue = rs.getString("OFFICE_DETAIL_ADDR");
				if (strValue != null) {
					objUserSource.setOfficeAddrDetail(strValue);
				}

				strValue = rs.getString("OFFICE_ZIPCODE");
				if (strValue != null) {
					objUserSource.setOfficeZipCode(strValue);
				}

				strValue = rs.getString("HOME_TEL");
				if (strValue != null) {
					objUserSource.setHomeTel(strValue);
				}

				strValue = rs.getString("HOME_TEL2");
				if (strValue != null) {
					objUserSource.setHomeTel2(strValue);
				}

				strValue = rs.getString("HOME_FAX");
				if (strValue != null) {
					objUserSource.setHomeFax(strValue);
				}

				strValue = rs.getString("MOBILE");
				if (strValue != null) {
					objUserSource.setMobile(strValue);
				}

				strValue = rs.getString("MOBILE2");
				if (strValue != null) {
					objUserSource.setMobile2(strValue);
				}

				strValue = rs.getString("PAGER");
				if (strValue != null) {
					objUserSource.setPager(strValue);
				}

				strValue = rs.getString("HOME_ADDR");
				if (strValue != null) {
					objUserSource.setHomeAddr(strValue);
				}

				strValue = rs.getString("HOME_DETAIL_ADDR");
				if (strValue != null) {
					objUserSource.setHomeAddrDetail(strValue);
				}

				strValue = rs.getString("HOME_ZIPCODE");
				if (strValue != null) {
					objUserSource.setHomeZipCode(strValue);
				}

				strValue = rs.getString("DESCRIPTION");
				if (strValue != null) {
					objUserSource.setDescription(strValue);
				}

				strValue = rs.getString("SYSTEM_PASSWORD");
				if (strValue != null) {
					objUserSource.setSystemPassword(strValue);
				}

				strValue = rs.getString("IS_CHECK_POTAL");
				if (strValue != null) {
					objUserSource.setIsCheckPortal(strValue);
				}

				strValue = rs.getString("APPLY_DATE");
				if (strValue != null) {
					objUserSource.setApplyDate(strValue);
				}

				if (bAddLast)
					this.m_olData.addLast(objUserSource);
				else {
					addObject(objUserSource);
				}
				n++;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] getSourceUserFields()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return false;
		}

		return true;
	}

	private void addObject(SourceObject objUserSource) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss.SSSSS");
		ParsePosition pos = new ParsePosition(0);

		for (int nIndex = this.m_olData.size() - 1; nIndex >= this.m_nLastIndex; nIndex--) {
			SourceObject objSourceBefore = (SourceObject) this.m_olData.get(nIndex);

			pos.setIndex(0);
			Date dtSourceBefore = sdf.parse(objSourceBefore.getCreateDate(), pos);

			pos.setIndex(0);
			Date dtUser = sdf.parse(objUserSource.getCreateDate(), pos);

			if (dtUser.before(dtSourceBefore))
				continue;
			this.m_olData.add(nIndex + 1, objUserSource);
			this.m_nLastIndex = (nIndex + 1);
			return;
		}
	}

	private boolean getConnection() {
		try {
			if (this.m_connectionBroker != null) {
				if (this.m_connectionBroker.IsConnectionClosed()) {
					return this.m_connectionBroker.openConnection();
				}
				return true;
			}

			this.m_connectionBroker = new ConnectionBroker(this.m_connParamForMIS);

			if (!this.m_connectionBroker.openConnection()) {
				setLastError("[Error Function Name] getConnection()", true);
				setLastError(this.m_connectionBroker.getLastError(), true);

				return false;
			}
		} catch (Exception e) {
			setLastError("[Error Function Name] getConnection()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return false;
		}

		return true;
	}

	public void closeConnection() {
		if (this.m_connectionBroker != null) {
			this.m_connectionBroker.clearConnectionBroker();
		}
	}

	private String getToday() {
		String strToday = "";

		Date objDate = new Date();

		int nYear = 1900 + objDate.getYear();
		int nMonth = objDate.getMonth() + 1;
		int nDay = objDate.getDate();

		String strYear = "" + nYear;
		String strMonth = "" + nMonth;
		if (nMonth < 10)
			strMonth = "0" + strMonth;

		String strDay = "" + nDay;
		if (nDay < 10)
			strDay = "0" + strDay;

		strToday = strYear + strMonth + strDay;

		return strToday;
	}

//	private String getLastError() {
//		return this.m_strLastError;
//	}

	private void setLastError(String strLastError, boolean bAddLast) {
		if (this.m_slErrors == null) {
			this.m_slErrors = new LinkedList();
		}
		this.m_strLastError = strLastError;
		if (bAddLast)
			this.m_slErrors.addLast(this.m_strLastError);
		else
			this.m_slErrors.addFirst(this.m_strLastError);
	}

	private void setLogAdmin() {
		this.m_logAgent.addLogList(this.m_slErrors);
		this.m_slErrors.clear();
	}

	// private int getErrorCount() {
	// if (this.m_slErrors == null) {
	// return 0;
	// }
	// return this.m_slErrors.size();
	// }
}