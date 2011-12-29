package com.sds.acube.cn.organizationlinkage;

public final class OptionObject {
	private String m_strOptionID = "";
	private String m_strCompID = "";
	private String m_strCompName = "";
	private String m_strOptionType = "";
	private int m_nValueType = 0;
	private int m_nIntegerValue = 0;
	private String m_strStringValue = "";
	private String m_strMStringValue = "";
	private String m_strDescription = "";

	public int getIntegerValue() {
		return this.m_nIntegerValue;
	}

	public int getValueType() {
		return this.m_nValueType;
	}

	public String getCompID() {
		return this.m_strCompID;
	}

	public String getCompName() {
		return this.m_strCompName;
	}

	public String getDescription() {
		return this.m_strDescription;
	}

	public String getMStringValue() {
		return this.m_strMStringValue;
	}

	public String getOptionID() {
		return this.m_strOptionID;
	}

	public String getOptionType() {
		return this.m_strOptionType;
	}

	public String getStringValue() {
		return this.m_strStringValue;
	}

	public void setIntegerValue(int nIntegerValue) {
		this.m_nIntegerValue = nIntegerValue;
	}

	public void setValueType(int nValueType) {
		this.m_nValueType = nValueType;
	}

	public void setCompID(String strCompID) {
		this.m_strCompID = strCompID;
	}

	public void setCompName(String strCompName) {
		this.m_strCompName = strCompName;
	}

	public void setDescription(String strDescription) {
		this.m_strDescription = strDescription;
	}

	public void setMStringValue(String strMStringValue) {
		this.m_strMStringValue = strMStringValue;
	}

	public void setOptionID(String strOptionID) {
		this.m_strOptionID = strOptionID;
	}

	public void setOptionType(String strOptionType) {
		this.m_strOptionType = strOptionType;
	}

	public void setStringValue(String strStringValue) {
		this.m_strStringValue = strStringValue;
	}
}