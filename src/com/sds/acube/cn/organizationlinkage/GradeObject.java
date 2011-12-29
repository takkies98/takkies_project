package com.sds.acube.cn.organizationlinkage;

public class GradeObject {
	private String m_strGradeID = "";
	private String m_strGradeName = "";
	private String m_strGradeOtherName = "";
	private String m_strGradeParentID = "";
	private String m_strCompID = "";
	private String m_strGradeAbbrName = "";
	private int m_nGradeOrder = 0;
	private String m_strDescription = "";

	public int getGradeOrder() {
		return this.m_nGradeOrder;
	}

	public String getCompID() {
		return this.m_strCompID;
	}

	public String getDescription() {
		return this.m_strDescription;
	}

	public String getGradeAbbrName() {
		return this.m_strGradeAbbrName;
	}

	public String getGradeID() {
		return this.m_strGradeID;
	}

	public String getGradeName() {
		return this.m_strGradeName;
	}

	public String getGradeOtherName() {
		return this.m_strGradeOtherName;
	}

	public String getGradeParentID() {
		return this.m_strGradeParentID;
	}

	public void setGradeOrder(int nGradeOrder) {
		this.m_nGradeOrder = nGradeOrder;
	}

	public void setCompID(String strCompID) {
		this.m_strCompID = strCompID;
	}

	public void setDescription(String strDescription) {
		this.m_strDescription = strDescription;
	}

	public void setGradeAbbrName(String strGradeAbbrName) {
		this.m_strGradeAbbrName = strGradeAbbrName;
	}

	public void setGradeID(String strGradeID) {
		this.m_strGradeID = strGradeID;
	}

	public void setGradeName(String strGradeName) {
		this.m_strGradeName = strGradeName;
	}

	public void setGradeOtherName(String strGradeOtherName) {
		this.m_strGradeOtherName = strGradeOtherName;
	}

	public void setGradeParentID(String strGradeParentID) {
		this.m_strGradeParentID = strGradeParentID;
	}
}