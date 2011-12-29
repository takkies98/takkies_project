package com.sds.acube.cn.organizationlinkage;

public class GradeSourceObject extends SourceObject {
	private String m_strGradeID = "";
	private String m_strGradeName = "";
	private String m_strGradeOtherName = "";
	private String m_strGradeParentID = "";
	private String m_strGradeAbbrName = "";
	private int m_nGradeOrder = 0;

	public String getSource() {
		String strSource = "";
		strSource = this.m_strGradeID + "*" + this.m_strGradeName + "*" + this.m_strGradeOtherName + "*" + this.m_strGradeParentID + "*" + this.m_strGradeAbbrName + "*"
				+ this.m_nGradeOrder + "*" + getCreateDate() + "*";
		return strSource;
	}

	public int getGradeOrder() {
		return this.m_nGradeOrder;
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