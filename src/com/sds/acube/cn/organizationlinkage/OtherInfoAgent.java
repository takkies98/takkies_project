package com.sds.acube.cn.organizationlinkage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import com.sds.acube.cn.common.vo.ConnectionParam;

public class OtherInfoAgent extends ObjectAgent {
	public OtherInfoAgent(ConnectionParam connParamForACUBE, LogAgent logAgent) {
		super(connParamForACUBE, logAgent);
	}

	public boolean insertGrade(GradeSourceObject objSource) {
		boolean bRV = false;
		try {
			GradeObject objGrade = convertGradeSourceToIDIR(objSource);

			if (objGrade == null) {
				setLastError("[Error Function Name] insertGrade()", false);
				setLogAdmin();
				return false;
			}

			StringBuffer strCommText = new StringBuffer();
			LinkedList slCommText = new LinkedList();
			LinkedList slColText = new LinkedList();
			ArrayList val = new ArrayList();

			strCommText.append("INSERT INTO TCN_GRADEINFORMATION ");
			strCommText.append("GRADE_ID,GRADE_NAME,GRADE_OTHER_NAME,GRADE_PARENT_ID,");
			strCommText.append("COMP_ID,GRADE_ABBR_NAME,GRADE_ORDER,DESCRIPTION) VALUES(");
			strCommText.append("?,?,?,?,");
			strCommText.append("?,?,?,?) ");
			slCommText.addLast(strCommText.toString());

			val.add(objGrade.getGradeID());
			val.add(objGrade.getGradeName());
			val.add(objGrade.getGradeOtherName());
			val.add(objGrade.getGradeParentID());
			val.add(objGrade.getCompID());
			val.add(objGrade.getGradeAbbrName());
			val.add(new Integer(objGrade.getGradeOrder()));
			val.add(objGrade.getDescription());
			slColText.addLast(val);

			bRV = executeCommandPrepared(slCommText, slColText);
			if (!bRV) {
				setLastError("[Error Function Name] insertGrade()", true);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
			}
		} catch (Exception e) {
			e.printStackTrace();
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] insertGrade()", false);
			setLogAdmin();
			return false;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return bRV;
	}

	public boolean updateGrade(GradeSourceObject objSource) {
		boolean bRV = false;
		try {
			GradeObject objNewGrade = convertGradeSourceToIDIR(objSource);
			GradeObject objOldGrade = getGradeInfo(objSource.getGradeID());

			if (objNewGrade == null) {
				setLastError("[Error Function Name] updateGrade()", false);
				setLogAdmin();
				return false;
			}
			if (objOldGrade == null) {
				setLastError("[Error Function Name] updateGrade()", false);
				setLogAdmin();
				return false;
			}

			StringBuffer strCommText = new StringBuffer();
			StringBuffer strCond = new StringBuffer();
			LinkedList slCommText = new LinkedList();
			LinkedList slColText = new LinkedList();
			ArrayList val = new ArrayList();

			String strFilter = "";
			if (objNewGrade.getGradeName().compareTo(objOldGrade.getGradeName()) != 0) {
				strCond.append("GRADE_NAME=?,");
				val.add(objNewGrade.getGradeName());
			}
			if (objNewGrade.getGradeOtherName().compareTo(objOldGrade.getGradeOtherName()) != 0) {
				strCond.append("GRADE_OTHER_NAME=?,");
				val.add(objNewGrade.getGradeOtherName());
			}
			if (objNewGrade.getGradeParentID().compareTo(objOldGrade.getGradeParentID()) != 0) {
				strCond.append("GRADE_PARENT_ID=,");
				val.add(objNewGrade.getGradeParentID());
			}
			if (objNewGrade.getGradeAbbrName().compareTo(objOldGrade.getGradeAbbrName()) != 0) {
				strCond.append("GRADE_ABBR_NAME=?,");
				val.add(objNewGrade.getGradeAbbrName());
			}
			if (objNewGrade.getGradeOrder() != objOldGrade.getGradeOrder()) {
				strCond.append("GRADE_ORDER=?,");
				val.add(new Integer(objNewGrade.getGradeOrder()));
			}
			strFilter = strCond.toString();
			if ((strFilter != null) && (strFilter.length() > 0)) {
				if (strFilter.endsWith(",")) {
					strFilter = strFilter.substring(0, strFilter.length() - 1);
				}
				strCommText.append("UPDATE TCN_GRADEINFORMATION SET ");
				strCommText.append(strFilter);
				strCommText.append(" WHERE GRADE_ID=?");
				val.add(objNewGrade.getGradeID());
				slCommText.addLast(strCommText.toString());
				slColText.addLast(val);

				bRV = executeCommandPrepared(slCommText, slColText);

				if (!bRV) {
					setLastError("[Error Function Name] updateGrade()", true);
					setLogAdmin();
					this.m_connectionBroker.clearPreparedQuery();
				}
			} else {
				setLastError("[ErrorDescription] 변경된 직급정보가 없습니다.", true);
				setLastError("[Error Function Name] updateGrade()", false);
				setLogAdmin();
				bRV = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] updateGrade()", false);
			setLogAdmin();
			return false;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return bRV;
	}

	public boolean deleteGrade(GradeSourceObject objSource) {
		boolean bRV = false;
		try {
			StringBuffer strCommText = new StringBuffer();
			LinkedList slCommText = new LinkedList();
			LinkedList slColText = new LinkedList();
			ArrayList val = new ArrayList();

			strCommText.append("UPDATE TCN_USERINFORMATION_BASIC ");
			strCommText.append("SET GRADE_CODE='' ");
			strCommText.append("WHERE GRADE_CODE=?");
			slCommText.addLast(strCommText.toString());
			val.add(objSource.getGradeID());
			slColText.addLast(val);

			strCommText.setLength(0);
			strCommText.append("DELETE TCN_GRADEINFORMATION WHERE GRADE_ID=?");
			slCommText.addLast(strCommText.toString());
			//val.clear();
			ArrayList val1 = new ArrayList();
			val1.add(objSource.getGradeID());
			slColText.addLast(val1);

			bRV = executeCommandPrepared(slCommText, slColText);
			if (!bRV) {
				setLastError("[Error Function Name] deleteGrade()", true);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
			}
		} catch (Exception e) {
			e.printStackTrace();
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] deleteGrade()", false);
			setLogAdmin();
			return false;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return true;
	}

	public boolean insertPosition(PositionSourceObject objSource) {
		boolean bRV = false;
		try {
			PositionObject objPosition = convertPositionSourceToIDIR(objSource);

			if (objPosition == null) {
				setLastError("[Error Function Name] insertPosition()", false);
				setLogAdmin();
				return false;
			}

			StringBuffer strCommText = new StringBuffer();
			LinkedList slCommText = new LinkedList();
			LinkedList slColText = new LinkedList();
			ArrayList val = new ArrayList();

			strCommText.append("INSERT INTO TCN_POSITIONINFORMATION ");
			strCommText.append("POSITION_ID,POSITION_NAME,POSITION_ABBR_NAME,POSITION_OTHER_NAME,");
			strCommText.append("POSITION_PARENT_ID,COMP_ID,POSITION_ORDER,DESCRIPTION) VALUES(");
			strCommText.append("?,?,?,?,");
			strCommText.append("?,?,?,?)");
			val.add(objPosition.getPositionID());
			val.add(objPosition.getPositionName());
			val.add(objPosition.getPositionAbbrName());
			val.add(objPosition.getPositionOtherName());
			val.add(objPosition.getPositionParentID());
			val.add(objPosition.getCompID());
			val.add(new Integer(objPosition.getPositionOrder()));
			val.add(objPosition.getDescription());

			bRV = executeCommandPrepared(slCommText, slColText);
			if (!bRV) {
				setLastError("[Error Function Name] insertPosition()", false);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
			}
		} catch (Exception e) {
			e.printStackTrace();
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] insertPosition()", false);
			setLogAdmin();
			return false;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}

		return bRV;
	}

	public boolean updatePosition(PositionSourceObject objSource) {
		boolean bRV = false;
		try {
			PositionObject objNewPosition = convertPositionSourceToIDIR(objSource);
			PositionObject objOldPosition = getPositionInfo(objSource.getPositionID());

			if (objNewPosition == null) {
				setLastError("[Error Function Name] updatePosition()", false);
				setLogAdmin();
				return false;
			}
			if (objOldPosition == null) {
				setLastError("[Error Function Name] updatePosition()", false);
				setLogAdmin();
				return false;
			}

			StringBuffer strCommText = new StringBuffer();
			StringBuffer strCond = new StringBuffer();
			LinkedList slCommText = new LinkedList();
			LinkedList slColText = new LinkedList();
			ArrayList val = new ArrayList();
			String strFilter = "";

			if (objNewPosition.getPositionName().compareTo(objOldPosition.getPositionName()) != 0) {
				strCond.append("POSITION_NAME=?,");
				val.add(objNewPosition.getPositionName());
			}
			if (objNewPosition.getPositionOtherName().compareTo(objOldPosition.getPositionOtherName()) != 0) {
				strCond.append("POSITION_OTHER_NAME=?,");
				val.add(objNewPosition.getPositionOtherName());
			}
			if (objNewPosition.getPositionParentID().compareTo(objOldPosition.getPositionParentID()) != 0) {
				strCond.append("POSITION_PARENT_ID=?,");
				val.add(objNewPosition.getPositionParentID());
			}
			if (objNewPosition.getPositionAbbrName().compareTo(objOldPosition.getPositionAbbrName()) != 0) {
				strCond.append("POSITION_ABBR_NAME=?,");
				val.add(objNewPosition.getPositionAbbrName());
			}
			if (objNewPosition.getPositionOrder() != objOldPosition.getPositionOrder()) {
				strCond.append("POSITION_ORDER=?,");
				val.add(new Integer(objNewPosition.getPositionOrder()));
			}
			strFilter = strCond.toString();
			if ((strFilter != null) && (strFilter.length() > 0)) {
				if (strFilter.endsWith(",")) {
					strFilter = strFilter.substring(0, strFilter.length() - 1);
				}
				strCommText.append("UPDATE TCN_POSITIONINFORMATION SET ");
				strCommText.append(strFilter);
				strCommText.append(" WHERE POSITION_ID=?");
				slCommText.addLast(strCommText.toString());
				val.add(objNewPosition.getPositionID());
				slColText.addLast(val);

				bRV = executeCommandPrepared(slCommText, slColText);
				if (!bRV) {
					setLastError("[Error Function Name] updatePosition()", true);
					setLogAdmin();
					this.m_connectionBroker.clearPreparedQuery();
				}
			} else {
				setLastError("[ErrorDescription] 변경된 직위정보가 없습니다.", true);
				setLastError("[Error Function Name] updatePosition()", false);
				setLogAdmin();
				bRV = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] updatePosition()", false);
			setLogAdmin();
			return false;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}

		return bRV;
	}

	public boolean deletePosition(PositionSourceObject objSource) {
		boolean bRV = false;
		try {
			StringBuffer strCommText = new StringBuffer();
			LinkedList slCommText = new LinkedList();
			LinkedList slColText = new LinkedList();
			ArrayList val = new ArrayList();

			strCommText.append("UPDATE TCN_USERINFORMATION_BASIC ");
			strCommText.append("SET POSITION_CODE='' ");
			strCommText.append("WHERE POSITION_CODE=?");
			slCommText.addLast(strCommText.toString());
			val.add(objSource.getPositionID());
			slColText.addLast(val);

			strCommText.setLength(0);
			strCommText.append("DELETE TCN_POSITIONINFORMATION WHERE POSITION_ID=?");
			slCommText.addLast(strCommText.toString());
			//val.clear();
			ArrayList val1 = new ArrayList();
			val1.add(objSource.getPositionID());
			slColText.addLast(val1);

			bRV = executeCommandPrepared(slCommText, slColText);
			if (!bRV) {
				setLastError("[Error Function Name] deletePosition()", true);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
			}
		} catch (Exception e) {
			e.printStackTrace();
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] deletePosition()", false);
			setLogAdmin();
			return false;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return true;
	}

	private GradeObject convertGradeSourceToIDIR(GradeSourceObject objSource) {
		GradeObject objGrade = new GradeObject();

		objGrade.setGradeID(objSource.getGradeID());
		objGrade.setGradeName(objSource.getGradeName());

		objGrade.setGradeParentID(objSource.getGradeParentID());
		objGrade.setGradeOrder(objSource.getGradeOrder());
		objGrade.setCompID("DEFAULT");

		return objGrade;
	}

	private PositionObject convertPositionSourceToIDIR(PositionSourceObject objSource) {
		PositionObject objPosition = new PositionObject();

		objPosition.setPositionID(objSource.getPositionID());
		objPosition.setPositionName(objSource.getPositionName());
		objPosition.setPositionOtherName(objSource.getPositionOtherName());
		objPosition.setPositionAbbrName(objSource.getPositionAbbrName());
		objPosition.setPositionParentID(objSource.getPositionParentID());
		objPosition.setPositionOrder(objSource.getPositionOrder());
		objPosition.setCompID("DEFAULT");

		return objPosition;
	}

	private GradeObject getGradeInfo(String strGradeID) {
		StringBuffer strCommText = new StringBuffer();

		strCommText.append("SELECT GRADE_ID,GRADE_NAME,GRADE_OTHER_NAME,GRADE_PARENT_ID,COMP_ID,GRADE_ABBR_NAME,");
		strCommText.append("GRADE_ORDER FROM TCN_GRADEINFORMATION WHERE GRADE_ID=?");

		if (!getConnection()) {
			setLastError("[Error Function Name] getGradeInfo()", false);
			return null;
		}

		int idx = 1;
		this.m_connectionBroker.prepareStatement(strCommText.toString());
		this.m_connectionBroker.setString(idx++, strGradeID);
		if (!this.m_connectionBroker.executePreparedQuery()) {
			setLastError("[Error Function Name] getGradeInfo()", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			this.m_connectionBroker.clearPreparedQuery();
			return null;
		}

		GradeObject objGrade = getGradeFields();
		if (objGrade == null) {
			setLastError("[Error Function Name] getGradeInfo()", false);
			this.m_connectionBroker.clearQuery();
			return null;
		}

		this.m_connectionBroker.clearPreparedQuery();
		return objGrade;
	}

	private PositionObject getPositionInfo(String strPositionID) {
		StringBuffer strCommText = new StringBuffer();
		strCommText.append("SELECT POSITION_ID,POSITION_NAME,POSITION_ABBR_NAME,POSITION_OTHER_NAME,");
		strCommText.append("POSITION_PARENT_ID,COMP_ID,POSITION_ORDER FROM TCN_POSITIONINFORMATION WHERE POSITION_ID=?");

		if (!getConnection()) {
			setLastError("[Error Function Name] getPositionInfo()", false);
			return null;
		}

		int idx = 1;
		this.m_connectionBroker.prepareStatement(strCommText.toString());
		this.m_connectionBroker.setString(idx++, strPositionID);
		if (!this.m_connectionBroker.executePreparedQuery()) {
			setLastError("[Error Function Name] getPositionInfo()", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			this.m_connectionBroker.clearPreparedQuery();
			return null;
		}

		PositionObject objPosition = getPositionFields();
		if (objPosition == null) {
			setLastError("[Error Function Name] getPositionInfo()", false);
			this.m_connectionBroker.clearQuery();
			return null;
		}
		this.m_connectionBroker.clearPreparedQuery();
		return objPosition;
	}

	private GradeObject getGradeFields() {
		GradeObject objGrade = new GradeObject();
		String strValue = "";
		int nValue = 0;
		try {
			int n = 0;
			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				strValue = rs.getString("GRADE_ID");
				if (strValue != null) {
					objGrade.setGradeID(strValue);
				}
				strValue = rs.getString("GRADE_NAME");
				if (strValue != null) {
					objGrade.setGradeName(strValue);
				}
				strValue = rs.getString("GRADE_OTHER_NAME");
				if (strValue != null) {
					objGrade.setGradeOtherName(strValue);
				}
				strValue = rs.getString("GRADE_PARENT_ID");
				if (strValue != null) {
					objGrade.setGradeParentID(strValue);
				}
				strValue = rs.getString("COMP_ID");
				if (strValue != null) {
					objGrade.setCompID(strValue);
				}
				strValue = rs.getString("GRADE_ABBR_NAME");
				if (strValue != null) {
					objGrade.setGradeAbbrName(strValue);
				}
				nValue = rs.getInt("GRADE_ORDER");
				objGrade.setGradeOrder(nValue);

				n++;
			}

			if (n < 1) {
				setLastError("[Error Function Name] getGradeFields()", true);
				setLastError("[Error Description] 직급 정보를 찾을 수 없습니다.", true);
				return null;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] getGradeFields()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return null;
		}

		return objGrade;
	}

	private PositionObject getPositionFields() {
		PositionObject objPosition = new PositionObject();
		String strValue = "";
		int nValue = 0;
		try {
			int n = 0;
			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				strValue = rs.getString("POSITION_ID");
				if (strValue != null) {
					objPosition.setPositionID(strValue);
				}
				strValue = rs.getString("POSITION_NAME");
				if (strValue != null) {
					objPosition.setPositionName(strValue);
				}
				strValue = rs.getString("POSITION_OTHER_NAME");
				if (strValue != null) {
					objPosition.setPositionOtherName(strValue);
				}
				strValue = rs.getString("POSITION_PARENT_ID");
				if (strValue != null) {
					objPosition.setPositionParentID(strValue);
				}
				strValue = rs.getString("COMP_ID");
				if (strValue != null) {
					objPosition.setCompID(strValue);
				}
				strValue = rs.getString("POSITION_ABBR_NAME");
				if (strValue != null) {
					objPosition.setPositionAbbrName(strValue);
				}
				nValue = rs.getInt("POSITION_ORDER");
				objPosition.setPositionOrder(nValue);

				n++;
			}

			if (n < 1) {
				setLastError("[Error Function Name] getPositionFields()", true);
				setLastError("[Error Description] 직위 정보를 찾을 수 없습니다.", true);
				return null;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] getPositionFields()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return null;
		}

		return objPosition;
	}
}