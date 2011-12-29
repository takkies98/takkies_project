package com.sds.acube.cn.organizationlinkage;

import java.util.LinkedList;

public class CompanyObject {
	private String m_strCompanyID = "";
	private String m_strProcessType = "A";
	private LinkedList m_olOrgData = null;
	private LinkedList m_olChiefData = null;

	public LinkedList getOrgData() {
		return this.m_olOrgData;
	}

	public void setOrgData(LinkedList olOrgData) {
		this.m_olOrgData = olOrgData;
	}

	public String getCompanyID() {
		return this.m_strCompanyID;
	}

	public void setCompanyID(String strCompanyID) {
		int nIndex = strCompanyID.indexOf(":");
		if (nIndex > 0) {
			setProcessType(strCompanyID.substring(nIndex + 1));
			this.m_strCompanyID = strCompanyID.substring(0, nIndex);
		} else {
			this.m_strCompanyID = strCompanyID;
		}
	}

	public String getProcessType() {
		return this.m_strProcessType;
	}

	public void setProcessType(String strProcessType) {
		this.m_strProcessType = strProcessType;
	}

	public void createList() {
		if (this.m_olOrgData == null)
			this.m_olOrgData = new LinkedList();
	}

	public void deleteList() {
		if (this.m_olOrgData != null)
			this.m_olOrgData.clear();
	}

	public void createChiefList() {
		if (this.m_olChiefData == null)
			this.m_olChiefData = new LinkedList();
	}

	public void deleteChiefList() {
		if (this.m_olChiefData != null)
			this.m_olChiefData.clear();
	}
}