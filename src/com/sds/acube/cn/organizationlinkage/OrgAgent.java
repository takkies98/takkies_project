package com.sds.acube.cn.organizationlinkage;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import model.outldap.samsung.net.Organization;

import com.sds.acube.cn.common.vo.ConnectionParam;

public class OrgAgent extends ObjectAgent {
	private PropertyObject m_objProperty = null;

	private int[] m_arrIndexInfo = null;

	private int m_nInsertCount = 0;
	private int m_nUpdateCount = 0;
	private int m_nFailCount = 0;
	private int m_nSuccessCount = 0;

	public OrgAgent(ConnectionParam connParamForACUBE, LogAgent logAgent) {
		super(connParamForACUBE, logAgent);
	}

	public OrgAgent(ConnectionParam connParamForACUBE, LogAgent logAgent, PropertyObject objProperty) {
		super(connParamForACUBE, logAgent);
		this.m_objProperty = objProperty;
	}

	public boolean processData(Organization[] organization, LinkedList olOrgData) {
		try {
			this.m_arrIndexInfo = new int[20];
			for (int i = 0; i < 20; i++) {
				this.m_arrIndexInfo[i] = -1;
			}

			for (int i = 0; i < organization.length; i++) {
				OrganizationObject obj = convertLDAPToOrg(organization[i]);

				if (olOrgData.size() == 0) {
					olOrgData.add(obj);
					this.m_arrIndexInfo[obj.getOrgLevel()] = 0;
				} else {
					int nCurIndexInfo = this.m_arrIndexInfo[obj.getOrgLevel()];
					if (nCurIndexInfo == -1) {
						if (obj.getOrgLevel() == 0) {
							olOrgData.add(0, obj);
							this.m_arrIndexInfo[obj.getOrgLevel()] = 0;
						} else {
							int nBeforeIndex = -1;
							int j = obj.getOrgLevel() - 1;
							do {
								nBeforeIndex = this.m_arrIndexInfo[j];
								j--;
							} while (nBeforeIndex > 0);

							nBeforeIndex++;
							olOrgData.add(nBeforeIndex, obj);
							this.m_arrIndexInfo[obj.getOrgLevel()] = nBeforeIndex;
						}

						for (int k = obj.getOrgLevel() + 1; k < 20; k++) {
							int nIndexInfo = this.m_arrIndexInfo[k];
							if (nIndexInfo > -1) {
								int tmp209_207 = k;
								int[] tmp209_204 = this.m_arrIndexInfo;
								int tmp213_212 = (tmp209_204[tmp209_207] + 1);
								tmp209_204[tmp209_207] = tmp213_212;
								this.m_arrIndexInfo[k] = tmp213_212;
							}
						}
					} else {
						nCurIndexInfo++;
						olOrgData.add(nCurIndexInfo, obj);
						this.m_arrIndexInfo[obj.getOrgLevel()] = nCurIndexInfo;

						for (int j = obj.getOrgLevel() + 1; j < 20; j++) {
							int nIndexInfo = this.m_arrIndexInfo[j];
							if (nIndexInfo > -1) {
								int tmp291_289 = j;
								int[] tmp291_286 = this.m_arrIndexInfo;
								int tmp295_294 = (tmp291_286[tmp291_289] + 1);
								tmp291_286[tmp291_289] = tmp295_294;
								this.m_arrIndexInfo[j] = tmp295_294;
							}
						}
					}
				}
			}
			boolean bRV = false;
			for (int i = 0; i < olOrgData.size(); i++) {
				OrganizationObject objNew = (OrganizationObject) olOrgData.get(i);
				OrganizationObject objOld = null;
				objOld = getOrganizationInfo(objNew.getOrgID());
				if (objOld == null) {
					this.m_nInsertCount += 1;
					this.m_logAgent.addProcess("InsertOrganization()", objNew.getData());
					bRV = insertOrganization(objNew);
					if (bRV) {
						this.m_nSuccessCount += 1;
						this.m_logAgent.addLog("[Result] Success");
					} else {
						this.m_nFailCount += 1;
						this.m_logAgent.addLog("[Result] Fail");
					}
				} else {
					this.m_nUpdateCount += 1;
					this.m_logAgent.addProcess("UpdateOrganization()", objNew.getData());
					bRV = updateOrganization(objOld, objNew);
					if (bRV) {
						this.m_nSuccessCount += 1;
						this.m_logAgent.addLog("[Result] Success");
					} else {
						this.m_nFailCount += 1;
						this.m_logAgent.addLog("[Result] Fail");
					}
				}
				this.m_logAgent.addEndProcess();
			}
			this.m_logAgent.endLog(olOrgData.size(), this.m_nInsertCount, this.m_nUpdateCount, 0, this.m_nSuccessCount, this.m_nFailCount);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] processData()", false);
			setLogAdmin();
		}
		return false;
	}

	public boolean processDelete(LinkedList olOrgData, String strCompanyID) {
		try {
			LinkedList slIDIRSource = null;
			LinkedList slIDIR = null;
			
			slIDIRSource = convertOrganizationToIDIR(olOrgData);

			slIDIR = getOrgsByCompanyID(strCompanyID);
			if ((slIDIRSource == null) || (slIDIRSource.size() < 0)) {
				System.out.println("[processDelete] null !!!");
			} else if (slIDIR != null) {
				LinkedList slSubtract = subtract(slIDIR, slIDIRSource);

				System.out.println("[ Total Count ] : " + slIDIRSource.size() + " - " + slIDIR.size() + " = " + slSubtract.size());
				for (int i = 0; i < slSubtract.size(); i++) {
					if ((!this.m_objProperty.isExistUnDeleteOrgIDs((String) slSubtract.get(i))) && (!this.m_objProperty.getTopOrgID().equals((String) slSubtract.get(i)))
							&& (!this.m_objProperty.getDivisionCode().equals((String) slSubtract.get(i)))) {
						System.out.println("processDelete#deleteOrganization : " + (String) slSubtract.get(i));
						deleteOrganization((String) slSubtract.get(i));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[processDelete] " + e.getMessage());
			return false;
		}
		return true;
	}

	public boolean preProcessDelete(String strCompanyID) {
		boolean bRV = true;
		StringBuffer strCommText = new StringBuffer();
		LinkedList slCommText = new LinkedList();
		LinkedList slColText = new LinkedList();
		ArrayList val = new ArrayList();
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] preProcessDelete() - getConnection", false);
				setLogAdmin();
				return false;
			}

			strCommText.append("UPDATE TCN_ORGANIZATIONINFORMATION SET IS_DELETED = 1 WHERE COMPANY_ID=?");
			slCommText.addLast(strCommText.toString());
			val.add(strCompanyID);
			slColText.addLast(val);

			if (this.m_objProperty.getArrUnDeleteOrgIDs().length > 0) {
				for (int i = 0; i < this.m_objProperty.getArrUnDeleteOrgIDs().length; i++) {
					strCommText.setLength(0);
					strCommText.append("UPDATE TCN_ORGANIZATIONINFORMATION ");
					strCommText.append("SET IS_DELETED = 0 ");
					strCommText.append("WHERE ORG_ID=? ");
					slCommText.addLast(strCommText.toString());
					val.clear();
					val.add(this.m_objProperty.getArrUnDeleteOrgIDs()[i]);
					slColText.addLast(val);
				}
			}
			bRV = executeCommandPrepared(slCommText, slColText);
			if (!bRV) {
				setLastError("[Error Function Name] preProcessDelete() - executeCommand", true);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
			}
		} catch (Exception e) {
			e.printStackTrace();
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] preProcessDelete() - Exception", false);
			setLogAdmin();
			return false;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return bRV;
	}

	public boolean insertOrganization(OrganizationObject objOrg) {
		boolean bRV = true;
		try {
			StringBuffer strCommText = new StringBuffer();
			LinkedList slCommText = new LinkedList();
			LinkedList slColText = new LinkedList();
			ArrayList val = new ArrayList();

			if (!getConnection()) {
				setLastError("[Error Function Name] insertOrganization() - getConnection", false);
				setLogAdmin();
				return false;
			}

			strCommText.append("INSERT INTO TCN_ORGANIZATIONINFORMATION ");
			strCommText.append("(ORG_ID,ORG_CODE,ORG_PARENT_ID,ORG_NAME,ORG_OTHER_NAME,ORG_ABBR_NAME,ORG_ORDER,");
			strCommText.append("SERVERS,ORG_TYPE,DESCRIPTION,ODCD_CODE,IS_ODCD,IS_INSTITUTION,IS_INSPECTION,");
			strCommText.append("ADDR_SYMBOL,IS_PROXY_DOC_HANDLE_DEPT,PROXY_DOC_HANDLE_DEPT_CODE,CHIEF_POSITION,");
			strCommText.append("FORMBOX_INFO,COMPANY_ID,HOMEPAGE,EMAIL,ADDRESS,ADDRESS_DETAIL,ZIP_CODE,");
			strCommText.append("TELEPHONE,FAX,IS_DELETED,IS_PROCESS) ");
			strCommText.append("VALUES (");
			strCommText.append("?,?,?,?,?,?,?,");
			strCommText.append("?,?,?,?,?,?,?,");
			strCommText.append("?,?,?,?,");
			strCommText.append("?,?,?,?,?,?,?,");
			strCommText.append("?,?,?,?) ");
			slCommText.addLast(strCommText.toString());

			val.add(objOrg.getOrgID());// ORG_ID,
			val.add(objOrg.getOrgCode());// ORG_CODE,
			val.add(objOrg.getOrgParentID());// ORG_PARENT_ID,
			val.add(objOrg.getOrgName());// ORG_NAME,
			val.add(objOrg.getOrgOtherName());// ORG_OTHER_NAME,
			val.add("");// ORG_ABBR_NAME,
			val.add(new Integer(objOrg.getOrgOrder()));// ORG_ORDER
			val.add("");// SERVERS,
			val.add(new Integer(objOrg.getOrgType()));// ORG_TYPE,
			val.add(objOrg.getDescription());// DESCRIPTION,
			val.add("");// //ODCD_CODE,
			val.add(new Integer(objOrg.getIsODCD()));// IS_ODCD,
			val.add(new Integer(objOrg.getIsInstitution()));// IS_INSTITUTION,
			val.add(new Integer(objOrg.getIsInspection()));// IS_INSPECTION,
			val.add("");// ADDR_SYMBOL,
			val.add(new Integer(objOrg.getIsProxyDocHandleDept()));// IS_PROXY_DOC_HANDLE_DEPT,
			val.add(new Integer(0));// PROXY_DOC_HANDLE_DEPT_CODE,
			val.add(""); // CHIEF_POSITION,
			val.add("");// FORMBOX_INFO,
			val.add(objOrg.getCompanyID());// COMPANY_ID,
			val.add(objOrg.getHomePage());// HOMEPAGE,
			val.add(objOrg.getEMail());// EMAIL,
			val.add(objOrg.getAddress());// ADDRESS,
			val.add(objOrg.getAddressDetail());// ADDRESS_DETAIL,
			val.add(objOrg.getZipCode());// ZIP_CODE,
			val.add(objOrg.getTelephone());// TELEPHONE,
			val.add(objOrg.getFax());// FAX,
			val.add(new Integer(objOrg.getIsDeleted()));// IS_DELETED,
			val.add(new Integer(0));// IS_PROCESS

			slColText.addLast(val);

			if (objOrg.getOrgType() == 1) {
				strCommText.setLength(0);
				strCommText.append("INSERT INTO TCN_COMPANYCONFINFO ");
				strCommText.append("(COMP_ID,IS_CREATE_GRADE,IS_CREATE_POSITION,IS_CREATE_TITLE,IS_CREATE_CLASSIFICATION,");
				strCommText.append("IS_CREATE_OPTION,IS_CREATE_DUTY,IS_CREATE_PROCESS_ROLE,IS_CREATE_RELATION) VALUES(");
				strCommText.append("?,0,0,0,0,0,0,0,0) ");
				slCommText.addLast(strCommText.toString());
				// val.clear();
				val = new ArrayList();
				val.add(objOrg.getOrgID());
				slColText.addLast(val);
			}
			bRV = executeCommandPrepared(slCommText, slColText);
			if (!bRV) {
				setLastError("[Error Function Name] insertOrganization() - executeCommand", true);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
			}

		} catch (Exception e) {
			e.printStackTrace();
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] insertOrganization() - Exception", false);
			setLogAdmin();
			return false;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}

		return bRV;
	}

	public boolean updateOrganization(OrganizationObject objOrgOld, OrganizationObject objOrgNew) {
		boolean bRV = true;
		try {
			LinkedList slCommText = new LinkedList();
			LinkedList slColText = new LinkedList();
			ArrayList condVal = new ArrayList();

			StringBuffer strCommText = new StringBuffer();
			StringBuffer strCond = new StringBuffer();
			String strFilter = "";
			if (objOrgOld.getOrgName().compareTo(objOrgNew.getOrgName()) != 0) {
				switch (objOrgNew.getOrgType()) {
				case 1:
					strCommText.append("UPDATE TCN_USERINFORMATION_BASIC ");
					strCommText.append("SET COMP_NAME=? WHERE COMP_ID=?");
					break;
				case 2:
					strCommText.append("UPDATE TCN_USERINFORMATION_BASIC ");
					strCommText.append("SET DEPT_NAME=? WHERE DEPT_ID=?");
					break;
				case 3:
					strCommText.append("UPDATE TCN_USERINFORMATION_BASIC ");
					strCommText.append("SET PART_NAME=? WHERE PART_ID=?");
					break;
				}

				slCommText.addLast(strCommText.toString());
				ArrayList val = new ArrayList();
				val.add(objOrgNew.getOrgName());
				val.add(objOrgNew.getOrgID());
				slColText.addLast(val);

				strCond.append("ORG_NAME=?,");
				condVal.add(objOrgNew.getOrgName());
			}

			if ((this.m_objProperty.getArrAdditionalOrgData() != null) && (this.m_objProperty.getArrAdditionalOrgData().length > 0)) {
				int nLength = this.m_objProperty.getArrAdditionalOrgData().length;
				for (int i = 0; i < nLength; i++) {
					String strIDirMethodName = "get" + this.m_objProperty.getArrAdditionalOrgData(i, 0).substring(0, 1).toUpperCase()
							+ this.m_objProperty.getArrAdditionalOrgData(i, 0).substring(1);
					try {
						String strOldValue = "";
						String strNewValue = "";

						Method methodGet = UserIDIRObject.class.getDeclaredMethod(strIDirMethodName, null);
						if (methodGet != null) {
							strOldValue = (String) methodGet.invoke(objOrgOld, null);
							if (strOldValue == null)
								strOldValue = "";
							strNewValue = (String) methodGet.invoke(objOrgNew, null);
							if (strNewValue == null) {
								strNewValue = "";
							}
						}
						if (strOldValue == strNewValue)
							continue;
						strCond.append(this.m_objProperty.getArrAdditionalUserData(i, 0).toUpperCase());
						strCond.append("=?,");
						condVal.add(strNewValue);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

			if (objOrgOld.getOrgParentID().compareTo(objOrgNew.getOrgParentID()) != 0) {
				OrganizationObject objOldCompany = null;
				OrganizationObject objNewCompany = null;

				objOldCompany = getMyCompany(objOrgOld.getOrgID());
				objNewCompany = getMyCompany(objOrgNew.getOrgID());

				if ((objOldCompany == null) || (objNewCompany == null)) {
					setLastError("[Error Function Name] updateOrganization()", true);
					setLogAdmin();
					bRV = false;
					return bRV;
				}

				if (objOldCompany.getOrgID().compareTo(objNewCompany.getOrgID()) != 0) {
					strCommText.setLength(0);
					strCommText.append("UPDATE TCN_USERINFORMATION_BASIC ");
					strCommText.append("SET COMP_ID=?, COMP_NAME=? WHERE DEPT_ID=?");
					slCommText.addLast(strCommText.toString());
					ArrayList val = new ArrayList();
					val.add(objNewCompany.getOrgID());
					val.add(objNewCompany.getOrgName());
					val.add(objOrgNew.getOrgID());
					slColText.addLast(val);
					strCond.append("COMPANY_ID=?,");
					condVal.add(objNewCompany.getOrgID());
				}
				strCond.append("ORG_PARENT_ID=?,");
				condVal.add(objOrgNew.getOrgParentID());
			}
			if (slCommText.size() > 0) {
				bRV = executeCommandPrepared(slCommText, slColText);
				if (!bRV) {
					setLastError("[Error Function Name] updateOrganization()", true);
					setLogAdmin();
					this.m_connectionBroker.clearPreparedQuery();
					return bRV;
				}
			}

			slCommText.clear();
			slColText.clear();
			if (!objOrgOld.getOrgCode().equals(objOrgNew.getOrgCode())) {
				strCond.append("ORG_CODE=?,");
				condVal.add(objOrgNew.getOrgCode());
			}
			if (!objOrgOld.getOrgOtherName().equals(objOrgNew.getOrgOtherName())) {
				strCond.append("ORG_OTHER_NAME=?,");
				condVal.add(objOrgNew.getOrgOtherName());
			}
			if (objOrgOld.getOrgOrder() != objOrgNew.getOrgOrder()) {
				strCond.append("ORG_ORDER=?,");
				condVal.add(new Integer(objOrgNew.getOrgOrder()));
			}
			if (objOrgOld.getIsDeleted() != objOrgNew.getIsDeleted()) {
				strCond.append("IS_DELETED=?,");
				condVal.add(new Integer(objOrgNew.getIsDeleted()));
			}
			strFilter = strCond.toString();
			if ((strFilter != null) && (strFilter.length() > 0)) {
				if (strFilter.endsWith(",")) {
					strFilter = strFilter.substring(0, strFilter.length() - 1);
				}
				strCommText.setLength(0);
				strCommText.append("UPDATE TCN_ORGANIZATIONINFORMATION SET ");
				strCommText.append(strFilter);
				strCommText.append(" WHERE ORG_ID=?");

				slCommText.addFirst(strCommText.toString());
				condVal.add(objOrgNew.getOrgID());
				slColText.addFirst(condVal);
			}

			bRV = executeCommandPrepared(slCommText, slColText);
			if (!bRV) {
				setLastError("[Error Function Name] updateOrganization()", true);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
			}
		} catch (Exception e) {
			e.printStackTrace();
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] updateOrganization()", false);
			setLogAdmin();
			bRV = false;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return bRV;
	}

	public boolean deleteOrganization(OrgSourceObject objOrgSource) {
		boolean bRV = false;
		boolean bIsExist = false;
		try {
			if ((objOrgSource.getOrgID() == null) || (objOrgSource.getOrgID().length() < 1)) {
				setLastError("[Error Function Name] deleteOrganization()", false);
				setLastError("[Error Description] 조직코드가 없습니다.", false);
				setLogAdmin();
				return false;
			}

			if ((objOrgSource.getOrgParentID() == null) || (objOrgSource.getOrgParentID().length() < 1)) {
				setLastError("[Error Function Name] deleteOrganization()", false);
				setLastError("[Error Description] 조직 상위코드가 없습니다.", false);
				setLogAdmin();
				return false;
			}

			if (objOrgSource.getOrgParentID().compareTo(objOrgSource.getOrgID()) == 0) {
				setLastError("[Error Function Name] deleteOrganization()", false);
				setLastError("[Error Description] 조직코드와 상위코드가 동일합니다.", false);
				setLogAdmin();
				return false;
			}
			LinkedList slCommText = new LinkedList();
			LinkedList slColText = new LinkedList();
			ArrayList val = new ArrayList();
			StringBuffer strCommText = new StringBuffer();

			bIsExist = isExistUser(objOrgSource.getOrgID());
			if (bIsExist) {
				setLastError("[Error Description] 조직에 사용자가 존재합니다.", true);
				setLastError("[Error Function Name] deleteOrganization() - isExistUser", false);
				setLogAdmin();
				return false;
			}

			bIsExist = isExistSubOrg(objOrgSource.getOrgID());
			if (bIsExist) {
				setLastError("[Error Description] 하위 조직이 존재합니다.", true);
				setLastError("[Error Function Name] deleteOrganization() - isExistSubOrg", false);
				setLogAdmin();
				return false;
			}

			strCommText.append("UPDATE TCN_ORGANIZATIONINFORMATION ");
			strCommText.append("SET IS_DELETED=1 WHERE ORG_ID=?");
			slCommText.addLast(strCommText.toString());
			val.add(objOrgSource.getOrgID());
			slColText.addLast(val);
			bRV = executeCommandPrepared(slCommText, slColText);
			if (!bRV) {
				setLastError("[Error Function Name] deleteOrganization() - executeCommand", true);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
			}
		} catch (Exception e) {
			e.printStackTrace();
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] deleteOrganization()", false);
			setLogAdmin();
			bRV = false;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}

		return bRV;
	}

	public boolean deleteOrganization(String strOrgID) {
		boolean bRV = false;
		try {
			StringBuffer strCommText = new StringBuffer();
			LinkedList slCommText = new LinkedList();
			LinkedList slColText = new LinkedList();
			ArrayList val = new ArrayList();
			strCommText.append("UPDATE TCN_ORGANIZATIONINFORMATION ");
			strCommText.append("SET IS_DELETED=1 WHERE ORG_ID=?");
			slCommText.addLast(strCommText.toString());
			val.add(strOrgID);
			slColText.addLast(val);
			bRV = executeCommandPrepared(slCommText, slColText);
			if (!bRV) {
				setLastError("[Error Function Name] deleteOrganization() - executeCommand", true);
				setLogAdmin();
				this.m_connectionBroker.clearPreparedQuery();
			}
		} catch (Exception e) {
			e.printStackTrace();
			setLastError("[Error Description] " + e.getMessage(), true);
			setLastError("[Error Function Name] deleteOrganization()", false);
			setLogAdmin();
			bRV = false;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}

		return bRV;
	}

	public OrganizationObject getOrganizationInfo(String strOrgID) {
		if (!getConnection()) {
			setLastError("[Error Function Name] getOrganizationInfo()", false);
			return null;
		}
		StringBuffer strCommText = new StringBuffer();
		strCommText.append("SELECT * FROM TCN_ORGANIZATIONINFORMATION ");
		strCommText.append("WHERE ORG_ID=?");
		int idx = 1;
		this.m_connectionBroker.prepareStatement(strCommText.toString());
		this.m_connectionBroker.setString(idx++, strOrgID);
		if (!this.m_connectionBroker.executePreparedQuery()) {
			setLastError("[Error Function Name] getOrganizationInfo()", true);
			setLastError(this.m_connectionBroker.getLastError(), true);
			setLastError("[SQL] " + strCommText, true);
			this.m_connectionBroker.clearPreparedQuery();
			return null;
		}

		OrganizationObject objOrgInfo = getOrganizationFields();
		if (objOrgInfo == null) {
			setLastError("[Error Function Name] getOrganizationInfo()", false);
		}
		this.m_connectionBroker.clearPreparedQuery();
		return objOrgInfo;
	}

	public LinkedList getMyHierarchyOrganizationInfo(String strOrgID) {
		LinkedList llOrgInfo = null;
		OrganizationObject objMyOrgInfo = getOrganizationInfo(strOrgID);
		if (objMyOrgInfo != null) {
			llOrgInfo = new LinkedList();
			switch (objMyOrgInfo.getOrgType()) {
			case 0:
				llOrgInfo.addLast(objMyOrgInfo);
				break;
			case 1:
				OrganizationObject objOrgInfo = getOrganizationInfo(objMyOrgInfo.getOrgParentID());
				if (objOrgInfo != null) {
					llOrgInfo.addLast(objMyOrgInfo);
					llOrgInfo.addFirst(objOrgInfo);
					break;
				}

				return null;
			case 2:
				int nOrgType = 2;
				String strOrgParentID = objMyOrgInfo.getOrgParentID();
				do {
					OrganizationObject objOrgInfo1 = getOrganizationInfo(strOrgParentID);
					if (objOrgInfo1 == null) {
						return null;
					}
					if (objOrgInfo1.getOrgType() != 2) {
						llOrgInfo.addFirst(objOrgInfo1);
					}
					strOrgParentID = objOrgInfo1.getOrgParentID();
					nOrgType = objOrgInfo1.getOrgType();
				} while (nOrgType != 0);
				llOrgInfo.addLast(objMyOrgInfo);

				break;
			case 3:
				OrganizationObject objDeptInfo = getOrganizationInfo(objMyOrgInfo.getOrgParentID());
				if (objDeptInfo == null) {
					return null;
				}
				llOrgInfo.addFirst(objMyOrgInfo);
				llOrgInfo.addFirst(objDeptInfo);
				int nOrgType1 = 2;
				String strOrgParentID1 = objDeptInfo.getOrgParentID();
				do {
					OrganizationObject objOrgInfo1 = getOrganizationInfo(strOrgParentID1);
					if (objOrgInfo1 == null) {
						return null;
					}
					if (objOrgInfo1.getOrgType() != 2) {
						llOrgInfo.addFirst(objOrgInfo1);
					}
					strOrgParentID1 = objOrgInfo1.getOrgParentID();
					nOrgType1 = objOrgInfo1.getOrgType();
				} while (nOrgType1 != 0);
			default:
				break;
			}
		} else {
			setLastError("[Error Function Name] getMyHierarchyOrganizationInfo()", false);
			return null;
		}
		return llOrgInfo;
	}

	public OrganizationHierarchyObject getMyOrganizationInfo(String strOrgID) {
		OrganizationHierarchyObject objMyOrgInfo = null;
		LinkedList llMyHierarchyOrgInfo = getMyHierarchyOrganizationInfo(strOrgID);
		if (llMyHierarchyOrgInfo != null) {
			objMyOrgInfo = new OrganizationHierarchyObject();
			for (int i = 0; i < llMyHierarchyOrgInfo.size(); i++) {
				OrganizationObject objOrgInfo = (OrganizationObject) llMyHierarchyOrgInfo.get(i);
				switch (objOrgInfo.getOrgType()) {
				case 0:
					objMyOrgInfo.setGroupID(objOrgInfo.getOrgID());
					objMyOrgInfo.setGroupName(objOrgInfo.getOrgName());
					objMyOrgInfo.setGroupOtherName(objOrgInfo.getOrgOtherName());
					break;
				case 1:
					objMyOrgInfo.setCompID(objOrgInfo.getOrgID());
					objMyOrgInfo.setCompName(objOrgInfo.getOrgName());
					objMyOrgInfo.setCompOtherName(objOrgInfo.getOrgOtherName());
					break;
				case 2:
					objMyOrgInfo.setDeptID(objOrgInfo.getOrgID());
					objMyOrgInfo.setDeptName(objOrgInfo.getOrgName());
					objMyOrgInfo.setDeptOtherName(objOrgInfo.getOrgOtherName());
					break;
				case 3:
					objMyOrgInfo.setPartID(objOrgInfo.getOrgID());
					objMyOrgInfo.setPartName(objOrgInfo.getOrgName());
					objMyOrgInfo.setPartOtherName(objOrgInfo.getOrgOtherName());
				}
			}
			if (objMyOrgInfo.getDeptID().length() == 0) {
				if (objMyOrgInfo.getCompID() != null)
					objMyOrgInfo.setDeptID(objMyOrgInfo.getCompID());
				else if (objMyOrgInfo.getGroupID() != null) {
					objMyOrgInfo.setDeptID(objMyOrgInfo.getGroupID());
				}
			}
			llMyHierarchyOrgInfo.clear();
		} else {
			setLastError("[Error Function Name] getMyOrganizationInfo()", false);
			return null;
		}
		return objMyOrgInfo;
	}

	public LinkedList getMyHierarchyAllOrganizationInfo(String strOrgID) {
		LinkedList olOrgInfo = null;
		OrganizationObject objMyOrgInfo = getOrganizationInfo(strOrgID);
		if (objMyOrgInfo != null) {
			olOrgInfo = new LinkedList();
			switch (objMyOrgInfo.getOrgType()) {
			case 0:
				olOrgInfo.addLast(objMyOrgInfo);
				break;
			case 1:
				OrganizationObject objOrgInfo = getOrganizationInfo(objMyOrgInfo.getOrgParentID());
				if (objOrgInfo != null) {
					olOrgInfo.addLast(objMyOrgInfo);
					olOrgInfo.addFirst(objOrgInfo);
					break;
				}
				setLastError("[Error Function Name] getMyHierarchAllOrganizationInfo()", false);
				return null;
			case 2:
				int nOrgType = 2;
				String strOrgParentID = objMyOrgInfo.getOrgParentID();
				do {
					OrganizationObject objOrgInfo1 = getOrganizationInfo(strOrgParentID);
					if (objOrgInfo1 == null) {
						setLastError("[Error Function Name] getMyHierarchAllOrganizationInfo()", false);
						return null;
					}
					olOrgInfo.addFirst(objOrgInfo1);
					strOrgParentID = objOrgInfo1.getOrgParentID();
					nOrgType = objOrgInfo1.getOrgType();
				} while (nOrgType != 0);
				olOrgInfo.addLast(objMyOrgInfo);
				break;
			case 3:
				OrganizationObject objDeptInfo = getOrganizationInfo(objMyOrgInfo.getOrgParentID());
				if (objDeptInfo == null) {
					setLastError("[Error Function Name] getMyHierarchAllOrganizationInfo()", false);
					return null;
				}
				olOrgInfo.addFirst(objDeptInfo);
				int nOrgType1 = 2;
				String strOrgParentID1 = objDeptInfo.getOrgParentID();
				do {
					OrganizationObject objOrgInfo1 = getOrganizationInfo(strOrgParentID1);
					if (objOrgInfo1 == null) {
						setLastError("[Error Function Name] getMyHierarchAllOrganizationInfo()", false);
						return null;
					}
					olOrgInfo.addFirst(objOrgInfo1);
					strOrgParentID1 = objOrgInfo1.getOrgParentID();
					nOrgType1 = objOrgInfo1.getOrgType();
				} while (nOrgType1 != 0);
				olOrgInfo.addLast(objMyOrgInfo);
			default:
				break;
			}
		} else {
			setLastError("[Error Function Name] getMyHierarchAllOrganizationInfo()", false);
			return null;
		}
		return olOrgInfo;
	}

	public OrganizationObject getOrganizationFields() {
		OrganizationObject objOrgInfo = new OrganizationObject();
		String strValue = "";
		try {
			int n = 0;
			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				strValue = rs.getString("ORG_ID");
				if (strValue != null) {
					objOrgInfo.setOrgID(strValue);
				}
				strValue = rs.getString("ORG_CODE");
				if (strValue != null) {
					objOrgInfo.setOrgCode(strValue);
				}
				strValue = rs.getString("ORG_NAME");
				if (strValue != null) {
					objOrgInfo.setOrgName(strValue);
				}
				strValue = rs.getString("ORG_OTHER_NAME");
				if (strValue != null) {
					objOrgInfo.setOrgOtherName(strValue);
				}
				strValue = rs.getString("ORG_PARENT_ID");
				if (strValue != null) {
					objOrgInfo.setOrgParentID(strValue);
				}
				objOrgInfo.setOrgOrder(rs.getInt("ORG_ORDER"));
				objOrgInfo.setOrgType(rs.getInt("ORG_TYPE"));
				objOrgInfo.setIsODCD(rs.getInt("IS_ODCD"));
				objOrgInfo.setIsInspection(rs.getInt("IS_INSPECTION"));
				objOrgInfo.setIsInstitution(rs.getInt("IS_INSTITUTION"));
				objOrgInfo.setIsProxyDocHandleDept(rs.getInt("IS_PROXY_DOC_HANDLE_DEPT"));
				objOrgInfo.setIsDeleted(rs.getInt("IS_DELETED"));
				n++;
			}
			if (n < 1) {
				setLastError("[Error Function Name] getOrganizationFields()", true);
				setLastError("[Error Description] 조직 정보를 찾을 수 없습니다.", true);
				return null;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] getOrganizationFields() - SQLException", true);
			setLastError("[Error Description]" + e.getMessage(), true);
			return null;
		}
		return objOrgInfo;
	}

	/**
	 * @deprecated
	 * @param objOrgSource
	 * @return
	 */
	private OrganizationObject convertSourceToOrg(OrgSourceObject objOrgSource) {
		try {
			if ((objOrgSource.getOrgID() == null) || (objOrgSource.getOrgID().length() < 1)) {
				setLastError("[Error Function Name] convertSourceToOrg()", false);
				setLastError("[Error Description] 조직코드가 없습니다.", false);
				return null;
			}

			if ((objOrgSource.getOrgParentID() == null) || (objOrgSource.getOrgParentID().length() < 1)) {
				setLastError("[Error Function Name] convertSourceToOrg()", false);
				setLastError("[Error Description] 조직 상위코드가 없습니다.", false);
				return null;
			}

			if (objOrgSource.getOrgParentID().compareTo(objOrgSource.getOrgID()) == 0) {
				setLastError("[Error Function Name] convertSourceToOrg()", false);
				setLastError("[Error Description] 조직코드와 상위코드가 동일합니다.", false);
				return null;
			}

			OrganizationObject objOrg = new OrganizationObject();

			objOrg.setOrgCode(objOrgSource.getOrgID());
			objOrg.setOrgID(objOrgSource.getOrgID());
			objOrg.setOrgType(objOrgSource.getOrgType());
			objOrg.setOrgParentID(objOrgSource.getOrgParentID());
			objOrg.setOrgName(objOrgSource.getOrgName());
			objOrg.setOrgAbbrName(objOrgSource.getOrgAbbrName());
			objOrg.setHomePage(objOrgSource.getHomePage());
			objOrg.setEMail(objOrgSource.getEMail());
			objOrg.setAddress(objOrgSource.getAddress());
			objOrg.setAddressDetail(objOrgSource.getAddressDetail());
			objOrg.setZipCode(objOrgSource.getZipCode());
			objOrg.setTelephone(objOrgSource.getTelephone());
			objOrg.setFax(objOrgSource.getFax());
			objOrg.setOrgOrder(objOrgSource.getOrgOrder());
			objOrg.setIsDeleted(objOrgSource.getIsDeleted());
			objOrg.setCompanyID("");
			objOrg.setDescription(objOrgSource.getDescription());

			switch (objOrg.getOrgType()) {
			case 1:
				objOrg.setCompanyID(objOrg.getOrgID());
				break;
			case 2:
			case 3:
				OrganizationObject objCompany = getMyCompany(objOrg.getOrgParentID());
				if (objCompany == null) {
					setLastError("[Error Function Name] convertSourceToOrg()", false);
					return null;
				}
				objOrg.setCompanyID(objCompany.getOrgID());
			}
			return objOrg;
		} catch (Exception e) {
			setLastError("[Error Function Name] convertSourceToOrg() - Exception", false);
			setLastError("[Error Description]" + e.getMessage(), false);
		}
		return null;
	}

	private OrganizationObject getMyCompany(String strOrgID) {
		OrganizationObject objCompany = null;
		LinkedList lsMyHierarchy = getMyHierarchyOrganizationInfo(strOrgID);
		if (lsMyHierarchy == null) {
			setLastError("[Error Function Name] getMyCompany()", false);
			return objCompany;
		}
		for (int n = 0; n < lsMyHierarchy.size(); n++) {
			objCompany = (OrganizationObject) lsMyHierarchy.get(n);
			if (objCompany.getOrgType() == 1) {
				return objCompany;
			}
		}
		return objCompany;
	}

	/**
	 * @deprecated
	 * @param strOrgID
	 * @return
	 */
	private LinkedList getMySubOrg(String strOrgID) {
		LinkedList olMySubOrg = null;
		StringBuffer strCommText = new StringBuffer();
		String strValue = "";
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] getMySubDepartment()", false);
				return null;
			}
			strCommText.append("SELECT ORG_ID,ORG_NAME,ORG_PARENT_ID,ORG_TYPE ");
			strCommText.append("FROM TCN_ORGANIZATIONINFORMATION ");
			strCommText.append("WHERE ORG_TYPE < 3 ");
			strCommText.append("START WITH ORG_ID=? CONNECT BY PRIOR ORG_ID=ORG_PARENT_ID");

			int idx = 1;
			this.m_connectionBroker.prepareStatement(strCommText.toString());
			this.m_connectionBroker.setString(idx++, strOrgID);

			if (!this.m_connectionBroker.executePreparedQuery()) {
				setLastError("[Error Function Name] getMySubDepartment()", true);
				setLastError(this.m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
				this.m_connectionBroker.clearPreparedQuery();
				return olMySubOrg;
			}

			int n = 0;

			ResultSet rs = this.m_connectionBroker.getResultSet();
			if (rs != null)
				olMySubOrg = new LinkedList();
			while (rs.next()) {
				OrganizationObject objOrgInfo = new OrganizationObject();

				strValue = rs.getString("ORG_ID");
				if (strValue != null) {
					objOrgInfo.setOrgID(strValue);
				}
				strValue = rs.getString("ORG_NAME");
				if (strValue != null) {
					objOrgInfo.setOrgName(strValue);
				}
				strValue = rs.getString("ORG_PARENT_ID");
				if (strValue != null) {
					objOrgInfo.setOrgParentID(strValue);
				}
				objOrgInfo.setOrgType(rs.getInt("ORG_TYPE"));
				olMySubOrg.addLast(objOrgInfo);
				n++;
			}
			if (n < 1) {
				setLastError("[Error Function Name] getMySubDepartment()", true);
				setLastError("[Error Description] 조직 정보를 찾을 수 없습니다.", true);
				return null;
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] getMySubDepartment() - SQLException", true);
			setLastError(e.getMessage(), true);
			return olMySubOrg;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}

		return olMySubOrg;
	}

	private LinkedList getOrgsByCompanyID(String strCompanyID) {
		LinkedList olOrgs = null;

		StringBuffer strCommText = new StringBuffer();
		String strValue = "";
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] getOrgsByCompanyID()", false);
			}
			strCommText.append("SELECT * FROM TCN_ORGANIZATIONINFORMATION ");
			strCommText.append("WHERE COMPANY_ID=?");

			int idx = 1;
			this.m_connectionBroker.prepareStatement(strCommText.toString());
			this.m_connectionBroker.setString(idx++, strCompanyID);

			if (!this.m_connectionBroker.executePreparedQuery()) {
				setLastError("[Error Function Name] getOrgsByCompanyID()", true);
				setLastError(this.m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
				this.m_connectionBroker.clearPreparedQuery();
				return null;
			}

			int n = 0;

			ResultSet rs = this.m_connectionBroker.getResultSet();
			if (rs != null)
				olOrgs = new LinkedList();
			while (rs.next()) {
				strValue = rs.getString("ORG_ID");
				olOrgs.addLast(strValue);
				n++;
			}
			if (n < 1) {
				setLastError("[Error Function Name] getOrgsByCompanyID()", true);
				setLastError("[Error Description] 조직 정보를 찾을 수 없습니다.", true);
			}

		} catch (SQLException e) {
			setLastError("[Error Function Name] getOrgsByCompanyID() - SQLException", true);
			setLastError(e.getMessage(), true);
			LinkedList localLinkedList1 = olOrgs;
			return localLinkedList1;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}

		return olOrgs;
	}

	/**
	 * @deprecated
	 * @param strOrgID
	 * @return
	 */
	private LinkedList deleteUser(String strOrgID) {
		LinkedList slCommText = new LinkedList();
		LinkedList slColText = new LinkedList();
		ArrayList val = new ArrayList();
		StringBuffer strCommText = new StringBuffer();

		strCommText.append("DELETE FROM TCN_USERINFORMATION_ASSOCIATED ");
		strCommText.append("WHERE USER_ID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE USER_RID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE DEPT_ID=?))");
		slCommText.addLast(strCommText.toString());
		val.add(strOrgID);
		slColText.addLast(val);

		strCommText.setLength(0);
		strCommText.append("DELETE FROM TCN_COMMONGROUPMEMBERS ");
		strCommText.append("WHERE MEMBER_ID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE USER_RID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE DEPT_ID=?))");
		slCommText.addLast(strCommText.toString());
		val.clear();
		val.add(strOrgID);
		slColText.addLast(val);

		strCommText.setLength(0);
		strCommText.append("DELETE FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE USER_RID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE DEPT_ID=?)");
		slCommText.addLast(strCommText.toString());
		val.clear();
		val.add(strOrgID);
		slColText.addLast(val);

		strCommText.setLength(0);
		strCommText.append("DELETE FROM TCN_USERINFORMATION_ADDR ");
		strCommText.append("WHERE USER_ID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE DEPT_ID=?)");
		slCommText.addLast(strCommText.toString());
		val.clear();
		val.add(strOrgID);
		slColText.addLast(val);

		strCommText.setLength(0);
		strCommText.append("DELETE FROM TCN_USERINFORMATION_IMAGE ");
		strCommText.append("WHERE USER_ID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE DEPT_ID=?)");
		slCommText.addLast(strCommText.toString());
		val.clear();
		val.add(strOrgID);
		slColText.addLast(val);

		strCommText.setLength(0);
		strCommText.append("DELETE FROM TCN_USERINFORMATION_TIME ");
		strCommText.append("WHERE USER_ID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE DEPT_ID=?)");
		slCommText.addLast(strCommText.toString());
		val.clear();
		val.add(strOrgID);
		slColText.addLast(val);

		strCommText.setLength(0);
		strCommText.append("DELETE FROM TCN_USERINFORMATION_STATUS ");
		strCommText.append("WHERE USER_ID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE DEPT_ID=?)");
		slCommText.addLast(strCommText.toString());
		val.clear();
		val.add(strOrgID);
		slColText.addLast(val);

		strCommText.setLength(0);
		strCommText.append("DELETE FROM TCN_USERINFORMATION_ASSOCIATED ");
		strCommText.append("WHERE USER_ID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE DEPT_ID=?)");
		slCommText.addLast(strCommText.toString());
		val.clear();
		val.add(strOrgID);
		slColText.addLast(val);

		strCommText.setLength(0);
		strCommText.append("DELETE FROM TCN_USERINFORMATION_PASSWORD ");
		strCommText.append("WHERE USER_ID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE DEPT_ID=?)");
		slCommText.addLast(strCommText.toString());
		val.clear();
		val.add(strOrgID);
		slColText.addLast(val);

		strCommText.setLength(0);
		strCommText.append("DELETE FROM TCN_COMMONGROUPMEMBERS ");
		strCommText.append("WHERE MEMBER_ID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE DEPT_ID=?)");
		slCommText.addLast(strCommText.toString());
		val.clear();
		val.add(strOrgID);
		slColText.addLast(val);

		strCommText.setLength(0);
		strCommText.append("DELETE FROM TCN_USERINFORMATION_OPTION ");
		strCommText.append("WHERE USER_ID IN (SELECT USER_UID FROM TCN_USERINFORMATION_BASIC ");
		strCommText.append("WHERE DEPT_ID=?)");
		slCommText.addLast(strCommText.toString());
		val.clear();
		val.add(strOrgID);
		slColText.addLast(val);

		strCommText.setLength(0);
		strCommText.append("DELETE FROM TCN_USERINFORMATION_BASIC WHERE DEPT_ID=?");
		slCommText.addLast(strCommText.toString());
		val.clear();
		val.add(strOrgID);
		slColText.addLast(val);

		return slCommText;
	}

	private boolean isExistUser(String strOrgID) {
		boolean bRV = false;
		StringBuffer strCommText = new StringBuffer();
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] isExistUser() - getConnection", false);
				return true;
			}
			strCommText.append("SELECT COUNT(*) COUNT FROM TCN_USERINFORMATION_BASIC WHERE DEPT_ID=?");
			int idx = 1;
			this.m_connectionBroker.prepareStatement(strCommText.toString());
			this.m_connectionBroker.setString(idx++, strOrgID);
			if (!this.m_connectionBroker.executePreparedQuery()) {
				setLastError("[Error Function Name] isExistUser() - excuteQuery", true);
				setLastError(this.m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
				this.m_connectionBroker.clearPreparedQuery();
				return true;
			}
			int n = 0;
			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				n = rs.getInt("COUNT");
			}
			if (n < 1) {
				bRV = false;
			} else
				bRV = true;
		} catch (SQLException e) {
			setLastError("[Error Function Name] isExistUser() - SQLException", true);
			setLastError(e.getMessage(), true);
			return true;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return bRV;
	}

	private boolean isExistSubOrg(String strOrgID) {
		boolean bRV = false;
		StringBuffer strCommText = new StringBuffer();
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] isExistSubOrg() - getConnection", false);
				return true;
			}
			strCommText.append("SELECT COUNT(*) COUNT FROM TCN_ORGANIZATIONINFORMATION WHERE ORG_PARENT_ID=?");
			int idx = 1;
			this.m_connectionBroker.prepareStatement(strCommText.toString());
			this.m_connectionBroker.setString(idx++, strOrgID);
			if (!this.m_connectionBroker.executePreparedQuery()) {
				setLastError("[Error Function Name] isExistSubOrg() - excuteQuery", true);
				setLastError(this.m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
				this.m_connectionBroker.clearPreparedQuery();
				return true;
			}
			int n = 0;
			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				n = rs.getInt("COUNT");
			}
			if (n < 1) {
				bRV = false;
			} else
				bRV = true;
		} catch (SQLException e) {
			setLastError("[Error Function Name] isExistSubOrg() - SQLException", true);
			setLastError(e.getMessage(), true);
			return true;
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return bRV;
	}

	/**
	 * @deprecated
	 * @return
	 */
	private String getGroupID() {
		String strRV = "";
		StringBuffer strCommText = new StringBuffer();
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] getGroupID()", false);
				return "";
			}
			strCommText.append("SELECT ORG_ID FROM TCN_ORGANIZATIONINFORMATION WHERE ORG_TYPE=?");
			int idx = 1;
			this.m_connectionBroker.prepareStatement(strCommText.toString());
			this.m_connectionBroker.setInt(idx++, 0);
			if (!this.m_connectionBroker.executePreparedQuery()) {
				setLastError("[Error Function Name] getGroupID()", true);
				setLastError(this.m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
				this.m_connectionBroker.clearPreparedQuery();
			}
			ResultSet rs = this.m_connectionBroker.getResultSet();
			while (rs.next()) {
				strRV = rs.getString("ORG_ID");
				setLastError("[POSITION] getGroupID()", true);
				setLastError("getGroupID() : " + strRV, true);
			}
			if ((strRV == null) || (strRV.length() < 1)) {
				setLastError("[Error Function Name] getGroupID()", true);
				setLastError("[Error Description] 그룹ID를 찾을 수 없습니다.", true);
				strRV = "";
			}
		} catch (SQLException e) {
			setLastError("[Error Function Name] getGroupID() - SQLException", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			strRV = "";
		} finally {
			this.m_connectionBroker.clearPreparedQuery();
		}
		return strRV;
	}

	public void getMyInstitution(String strOrgID, String strInstitutionName, String strInstitutionOtherName) {
		LinkedList olHierarchy = null;
		olHierarchy = getMyHierarchyAllOrganizationInfo(strOrgID);
		if (olHierarchy != null) {
			for (int i = olHierarchy.size() - 1; i >= 0; i--) {
				OrganizationObject objOrgInfo = (OrganizationObject) olHierarchy.get(i);
				if (objOrgInfo.getIsInstitution() != 1)
					continue;
				strInstitutionName = objOrgInfo.getOrgName();
				strInstitutionOtherName = objOrgInfo.getOrgOtherName();
				return;
			}
		} else {
			setLastError("[Error Function Name] getMyInstitution()", false);
		}
	}

	public OrganizationObject convertLDAPToOrg(Organization objLDAPOrg) {
		OrganizationObject orgIDIR = new OrganizationObject();
		String strValue = "";
		orgIDIR.setLDAPOrgID(objLDAPOrg.getCn());
		switch (this.m_objProperty.getUseIndividualDivision()) {
		case 0:
			if (objLDAPOrg.getCn().equals("TOP")) {
				orgIDIR.setOrgID(objLDAPOrg.getEphighdeptnumber());
				orgIDIR.setOrgParentID(this.m_objProperty.getTopOrgID());
				orgIDIR.setOrgType(1);
			} else {
				orgIDIR.setOrgID(objLDAPOrg.getCn());
				if (objLDAPOrg.getEphighdeptnumber().equals("TOP"))
					orgIDIR.setOrgParentID(objLDAPOrg.getEporganizationnumber());
				else
					orgIDIR.setOrgParentID(objLDAPOrg.getEphighdeptnumber());
			}
			break;
		case 1:
			if (objLDAPOrg.getCn().equals(this.m_objProperty.getDivisionCode())) {
				orgIDIR.setOrgID(objLDAPOrg.getCn());
				orgIDIR.setOrgParentID(this.m_objProperty.getTopOrgID());
				orgIDIR.setOrgType(1);
			} else {
				orgIDIR.setOrgID(objLDAPOrg.getCn());
				orgIDIR.setOrgParentID(objLDAPOrg.getEphighdeptnumber());
			}
			break;
		case 2:
			orgIDIR.setOrgID(objLDAPOrg.getCn());
			if (objLDAPOrg.getEphighdeptnumber().equals("TOP"))
				orgIDIR.setOrgParentID(objLDAPOrg.getEporganizationnumber());
			else {
				orgIDIR.setOrgParentID(objLDAPOrg.getEphighdeptnumber());
			}
		}
		orgIDIR.setOrgName(objLDAPOrg.getOu());
		strValue = objLDAPOrg.getEpendepartment();
		if (strValue != null)
			orgIDIR.setOrgOtherName(strValue);
		orgIDIR.setOrgOrder(Integer.parseInt(objLDAPOrg.getEpdeptorder()));
		strValue = objLDAPOrg.getEpindeptcode();
		if (strValue != null)
			orgIDIR.setOrgCode(strValue);
		else {
			orgIDIR.setOrgCode(orgIDIR.getOrgID());
		}
		orgIDIR.setCompanyID(objLDAPOrg.getEporganizationnumber());
		orgIDIR.setOrgLevel(Integer.parseInt(objLDAPOrg.getEpdeptlevel()));
		if ((this.m_objProperty.getArrAdditionalOrgData() != null) && (this.m_objProperty.getArrAdditionalOrgData().length > 0)) {
			int nLength = this.m_objProperty.getArrAdditionalOrgData().length;
			for (int i = 0; i < nLength; i++) {
				String strIDirMethodName = "set" + this.m_objProperty.getArrAdditionalOrgData(i, 0).substring(0, 1).toUpperCase()
						+ this.m_objProperty.getArrAdditionalOrgData(i, 0).substring(1);
				String strEmployeeMethodName = "get" + this.m_objProperty.getArrAdditionalOrgData(i, 1).substring(0, 1).toUpperCase()
						+ this.m_objProperty.getArrAdditionalOrgData(i, 1).substring(1);
				try {
					String strLDAPValue = "";
					Method methodLDAP = Organization.class.getDeclaredMethod(strEmployeeMethodName, null);
					if (methodLDAP != null) {
						strLDAPValue = (String) methodLDAP.invoke(objLDAPOrg, null);
					}
					if (strLDAPValue == null)
						continue;
					Class[] idirClass = new Class[1];
					idirClass[0] = String.class;
					Method methodIDir = OrganizationObject.class.getDeclaredMethod(strIDirMethodName, idirClass);
					Object[] params = new Object[1];
					params[0] = strLDAPValue;
					methodIDir.invoke(orgIDIR, params);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return orgIDIR;
	}

	private LinkedList convertOrganizationToIDIR(LinkedList olOrgData) {
		LinkedList slOrgIDs = new LinkedList();
		try {
			for (int i = 0; i < olOrgData.size(); i++) {
				slOrgIDs.addLast(((OrganizationObject) olOrgData.get(i)).getOrgID());
			}
		} catch (Exception e) {
			System.out.println("[convertOrganizationToIDIR] " + e.getMessage());
		}
		return slOrgIDs;
	}
}