package com.sds.acube.cn.organizationlinkage;

import java.io.File;
import java.util.Date;

import com.sds.acube.cn.common.vo.ConnectionParam;

public class SyncAgent {
	private String m_strLastError;
	private PropertyObject m_objProperty = null;
	private ConnectionParam m_connParamForACUBE = null;
	private String m_strEnvFilePath;
	private String m_strLogPath;
	private LogAgent m_logAgent = null;

	public boolean StartSync(ConnectionParam connParam, String strConfigPath) {
		try {
			boolean bRV = false;

			this.m_strEnvFilePath = (strConfigPath + "OrgLinkerEnv.properties");
			int nPos = strConfigPath.lastIndexOf("config");

			String strTime = getCurrentTime();

			this.m_strLogPath = (strConfigPath.substring(0, nPos) + "logs" + File.separator + strTime + ".log");

			this.m_logAgent = new LogAgent(this.m_strLogPath);
			this.m_logAgent.startLog();

			this.m_objProperty = new PropertyObject(this.m_strEnvFilePath);
			bRV = this.m_objProperty.readData();

			if (bRV) {
				this.m_connParamForACUBE = new ConnectionParam();

				this.m_connParamForACUBE.setClassName(this.m_objProperty.getOrganizationConnectionClassName());
				this.m_connParamForACUBE.setURL(this.m_objProperty.getOrganizationConnectionURL());
				this.m_connParamForACUBE.setDBType(Integer.parseInt(this.m_objProperty.getOrganizationConnectionDBType()));
				this.m_connParamForACUBE.setUser(this.m_objProperty.getOrganizationConnectionDBUser());
				this.m_connParamForACUBE.setPassword(this.m_objProperty.getOrganizationConnectionDBUserPassword());
				this.m_connParamForACUBE.setMethod(0);

				this.m_logAgent.addTitle("ACUBE DB INFO");
				this.m_logAgent.addLog("[ DS Name ]" + this.m_objProperty.getOrganizationConnectionURL());
				this.m_logAgent.addLog("[ DB USER ]" + this.m_objProperty.getOrganizationConnectionDBUser());
				this.m_logAgent.addLog("[ DB USER PASSWORD]" + this.m_objProperty.getOrganizationConnectionDBUserPassword());
				this.m_logAgent.addEndProcess();

				this.m_logAgent.addTitle("ESB INFO");
				this.m_logAgent.addLog("[ CompanyIDs ]" + this.m_objProperty.getCompanyIDs());
				this.m_logAgent.addLog("[ CID ]" + this.m_objProperty.getCID());
				this.m_logAgent.addLog("[ CID PASSWORD]" + this.m_objProperty.getCIDPassword());

				this.m_logAgent.addEndProcess();

				this.m_logAgent.addTitle("PASSWORD OPTION");
				this.m_logAgent.addLog("[ PASSWORD_INIT ]" + this.m_objProperty.getPasswordInit());
				this.m_logAgent.addLog("[ PASSWORD_DATA ]" + this.m_objProperty.getPasswordData());
				this.m_logAgent.addLog("[ CID PASSWORD_TIME_CHECK]" + this.m_objProperty.getPasswordTimeCheck());

				this.m_logAgent.addEndProcess();
			} else {
				this.m_logAgent.addLog(this.m_objProperty.getLastError());
				this.m_logAgent.writeLog(this.m_strLogPath);
				return false;
			}

			ProcessAgent procAgent = new ProcessAgent(this.m_connParamForACUBE, this.m_logAgent, this.m_objProperty);

			bRV = procAgent.processData();

			this.m_logAgent.writeLog(this.m_strLogPath);

			return true;
		} catch (Exception e) {
			this.m_strLastError = e.getMessage();
			System.out.println("[StartSync] " + e.getMessage());
			if (this.m_logAgent != null) {
				this.m_logAgent.addLog(this.m_strLastError);
				this.m_logAgent.endLog(0, 0, 0);
				this.m_logAgent.writeLog(this.m_strLogPath);
			}
		}
		return false;
	}

	private String getCurrentTime() {
		String strCurrentTime = "";

		Date objDate = new Date();

		int nYear = 1900 + objDate.getYear();
		int nMonth = objDate.getMonth() + 1;
		int nDay = objDate.getDate();
		int nHour = objDate.getHours();
		int nMinute = objDate.getMinutes();
		int nSecond = objDate.getSeconds();
		String strYear = "" + nYear;
		String strMonth = "" + nMonth;
		if (nMonth < 10)
			strMonth = "0" + strMonth;

		String strDay = "" + nDay;
		if (nDay < 10)
			strDay = "0" + strDay;

		String strHour = "" + nHour;
		if (nHour < 10)
			strHour = "0" + strHour;
		String strMinute = "" + nMinute;
		if (nMinute < 10)
			strMinute = "0" + strMinute;

		String strSecond = "" + nSecond;
		if (nSecond < 10)
			strSecond = "0" + strSecond;

		strCurrentTime = strYear + strMonth + strDay + strHour + strMinute + strSecond;

		return strCurrentTime;
	}
}