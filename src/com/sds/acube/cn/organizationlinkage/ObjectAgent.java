package com.sds.acube.cn.organizationlinkage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import com.sds.acube.cn.common.vo.ConnectionParam;
import com.sds.acube.cn.org.db.ConnectionBroker;

/**
 * @author Administrator
 * 
 *         To change this generated comment edit the template variable "typecomment": Window>Preferences>Java>Templates. To enable and disable the creation of type comments go to
 *         Window>Preferences>Java>Code Generation.
 */
public class ObjectAgent {
	public ObjectAgent(ConnectionParam connParamForACUBE, LogAgent logAgent) {
		m_connParamForACUBE = connParamForACUBE;
		m_logAgent = logAgent;
	}

	public void closeConnection() {
		if (m_connectionBroker != null) {
			m_connectionBroker.clearConnectionBroker();
			m_connectionBroker.closeConnection();
		}
	}

	protected boolean getConnection() {
		try {
			if (m_connectionBroker != null) {
				if (m_connectionBroker.IsConnectionClosed())
					return m_connectionBroker.openConnection();

				return true;
			}

			m_connectionBroker = new ConnectionBroker(m_connParamForACUBE);

			if (!m_connectionBroker.openConnection()) {
				setLastError("[Error Function Name] getConnection() - openConnection", true);
				setLastError(m_connectionBroker.getLastError(), true);

				return false;
			}
		} catch (Exception e) {
			setLastError("[Error Function Name] getConnection() - Exception", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			m_connectionBroker = null;
			m_connectionBroker = new ConnectionBroker(m_connParamForACUBE);

			if (!m_connectionBroker.openConnection()) {
				setLastError("[Error Function Name] getConnection() - ReConnection", true);
				setLastError(m_connectionBroker.getLastError(), true);

				return false;
			}

			setLastError("[Error Function Name] getConnection() - ReConnection OK", true);
			return true;
		}

		return true;
	}

	/**
	 * <pre>
	 * 2011.12.23 신설
	 * 일단 String 과 Integer 값만 처리하도록 구성함.
	 * 나머지는 Object 형태로 처리함.
	 * </pre>
	 * 
	 * @param strQrys
	 * @param strValues
	 * @return
	 */
	protected boolean executeCommandPrepared(LinkedList strQrys, LinkedList strValues) {
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] executeCommandPrepared()", false);
				return false;
			}
			String strCommText = "";
			m_connectionBroker.setAutoCommit(false);

			for (int i = 0; i < strQrys.size(); i++) {
				strCommText = (String) strQrys.get(i);
				ArrayList arrColValues = (ArrayList) strValues.get(i);
				m_connectionBroker.prepareStatement(strCommText);
				int idx = 1;
				if (arrColValues != null && arrColValues.size() > 0) {
					for (int j = 0; j < arrColValues.size(); j++) {
						if (arrColValues.get(j) instanceof String) {
							String val = (String) arrColValues.get(j);
							if (val == null) {
								m_connectionBroker.setString(idx++, "");
							} else {
								m_connectionBroker.setString(idx++, val);
							}
						} else if (arrColValues.get(j) instanceof Integer) {
							m_connectionBroker.setInt(idx++, ((Integer) arrColValues.get(j)).intValue());
						} else {
							Object val = (Object) arrColValues.get(j);
							if (val == null) {
								m_connectionBroker.setObject(idx++, "");
							} else {
								m_connectionBroker.setObject(idx++, val);
							}
						}
					}
				}
				if (m_connectionBroker.executePreparedUpdate() < 1) {
					m_connectionBroker.rollback();
					setLastError("[Error Function Name] executeCommandPrepared()", true);
					setLastError(m_connectionBroker.getLastError(), true);
					setLastError("[SQL] " + strCommText, true);
					m_connectionBroker.clearPreparedQuery();
					return false;
				}
			}
			m_connectionBroker.commit();
		} catch (Exception e) {
			setLastError("[Error Function Name] executeCommandPrepared()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			m_connectionBroker.clearPreparedQuery();
			return false;
		}
		return true;
	}

	protected boolean executeCommand(LinkedList slCommText) {
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] executeCommad()", false);
				return false;
			}

			String strCommText = "";
			m_connectionBroker.setAutoCommit(false);

			for (int i = 0; i < slCommText.size(); i++) {
				strCommText = slCommText.get(i).toString();

				if (m_connectionBroker.executeUpdate(strCommText) < 1) {
					m_connectionBroker.rollback();
					setLastError("[Error Function Name] executeCommand()", true);
					setLastError(m_connectionBroker.getLastError(), true);
					setLastError("[SQL] " + strCommText, true);
					return false;
				}

			}
			m_connectionBroker.commit();
			m_connectionBroker.clearQuery();
		} catch (Exception e) {
			setLastError("[Error Function Name] executeCommand()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return false;
		}
		return true;
	}

	protected boolean executeCommand(LinkedList slCommText, boolean bCommit) {
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] executeCommad()", false);
				return false;
			}

			String strCommText = "";
			m_connectionBroker.setAutoCommit(false);

			for (int i = 0; i < slCommText.size(); i++) {
				strCommText = slCommText.get(i).toString();

				if (m_connectionBroker.executeUpdate(strCommText) < 1) {
					m_connectionBroker.rollback();
					setLastError("[Error Function Name] executeCommand()", true);
					setLastError(m_connectionBroker.getLastError(), true);
					setLastError("[SQL] " + strCommText, true);
					return false;
				}
			}
			if (bCommit)
				m_connectionBroker.commit();
			m_connectionBroker.clearQuery();

		} catch (Exception e) {
			setLastError("[Error Function Name] executeCommand()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return false;
		}
		return true;
	}

	protected boolean executeCommand(String strCommText, boolean bCommit) {
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] executeCommad()", false);
				return false;
			}

			if (m_connectionBroker.executeUpdate(strCommText) < 1) {
				m_connectionBroker.rollback();
				setLastError("[Error Function Name] executeCommand()", true);
				setLastError(m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
				return false;
			}

			if (bCommit)
				m_connectionBroker.commit();
			m_connectionBroker.clearQuery();

		} catch (Exception e) {
			setLastError("[Error Function Name] executeCommand()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return false;
		}
		return true;
	}

	protected boolean executeCommandNoResult(LinkedList slCommText) {
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] executeCommad()", false);
				return false;
			}

			String strCommText = "";
			m_connectionBroker.setAutoCommit(false);

			for (int i = 0; i < slCommText.size(); i++) {
				strCommText = slCommText.get(i).toString();

				if (!m_connectionBroker.executeQuery(strCommText)) {
					m_connectionBroker.rollback();
					setLastError("[Error Function Name] executeCommand()", true);
					setLastError(m_connectionBroker.getLastError(), true);
					setLastError("[SQL] " + strCommText, true);
					return false;
				}
			}
			m_connectionBroker.commit();
			m_connectionBroker.clearQuery();
		} catch (Exception e) {
			setLastError("[Error Function Name] executeCommand()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return false;
		}
		return true;
	}

	protected boolean executeCommandNoResult(LinkedList slCommText, boolean bCommit) {
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] executeCommad()", false);
				return false;
			}

			String strCommText = "";
			m_connectionBroker.setAutoCommit(false);

			for (int i = 0; i < slCommText.size(); i++) {
				strCommText = slCommText.get(i).toString();

				if (!m_connectionBroker.executeQuery(strCommText)) {
					m_connectionBroker.rollback();
					setLastError("[Error Function Name] executeCommand()", true);
					setLastError(m_connectionBroker.getLastError(), true);
					setLastError("[SQL] " + strCommText, true);
					return false;
				}
			}

			if (bCommit)
				m_connectionBroker.commit();
			m_connectionBroker.clearQuery();

		} catch (Exception e) {
			setLastError("[Error Function Name] executeCommand()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return false;
		}
		return true;
	}

	protected boolean executeCommand(String strCommText) {
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] executeCommad()", false);
				return false;
			}

			if (m_connectionBroker.executeUpdate(strCommText) < 1) {
				m_connectionBroker.rollback();
				setLastError("[Error Function Name] executeCommand()", true);
				setLastError(m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
				return false;
			}

			m_connectionBroker.commit();
			m_connectionBroker.clearQuery();

		} catch (Exception e) {
			setLastError("[Error Function Name] executeCommand()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return false;
		}
		return true;
	}

	protected boolean executeQuery(String strCommText) {
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] executeCommad()", false);
				return false;
			}

			if (!m_connectionBroker.executeQuery(strCommText)) {
				m_connectionBroker.rollback();
				setLastError("[Error Function Name] executeCommand()", true);
				setLastError(m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
				return false;
			}

		} catch (Exception e) {
			setLastError("[Error Function Name] executeCommand()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			return false;
		}
		return true;
	}

	/**
	 * <pre>
	 * 2011.12.23 신설
	 * 일단 String 과 Integer 값만 처리하도록 구성함.
	 * 나머지는 Object 형태로 처리함.
	 * </pre>
	 * 
	 * @param strCommText
	 * @param vals
	 * @return
	 */
	protected boolean executeQueryPrepared(String strCommText, ArrayList vals) {
		try {
			if (!getConnection()) {
				setLastError("[Error Function Name] executeQueryPrepared()", false);
				return false;
			}
			m_connectionBroker.prepareStatement(strCommText);
			if (vals != null && vals.size() > 0) {
				int idx = 1;
				for (int i = 0; i < vals.size(); i++) {
					if (vals.get(i) instanceof String) {
						String val = (String) vals.get(i);
						if (val == null) {
							m_connectionBroker.setString(idx++, "");
						} else {
							m_connectionBroker.setString(idx++, val);
						}
					} else if (vals.get(i) instanceof Integer) {
						m_connectionBroker.setInt(idx++, ((Integer) vals.get(i)).intValue());
					} else {
						Object val = (Object) vals.get(i);
						if (val == null) {
							m_connectionBroker.setObject(idx++, "");
						} else {
							m_connectionBroker.setObject(idx++, val);
						}
					}
				}
			}
			if (!m_connectionBroker.executePreparedQuery()) {
				m_connectionBroker.rollback();
				setLastError("[Error Function Name] executeQueryPrepared()", true);
				setLastError(m_connectionBroker.getLastError(), true);
				setLastError("[SQL] " + strCommText, true);
				m_connectionBroker.clearPreparedQuery();
				return false;
			}
		} catch (Exception e) {
			setLastError("[Error Function Name] executeQueryPrepared()", true);
			setLastError("[Error Description] " + e.getMessage(), true);
			m_connectionBroker.clearPreparedQuery();
			return false;
		}
		return true;
	}

	protected void clearQuery() {
		if (m_connectionBroker != null)
			m_connectionBroker.clearQuery();

	}

	protected String getLastError() {
		return m_strLastError;
	}

	protected void setLastError(String strLastError, boolean bAddLast) {
		if (m_slErrors == null)
			m_slErrors = new LinkedList();

		m_strLastError = strLastError;
		if (bAddLast)
			m_slErrors.addLast(m_strLastError);
		else
			m_slErrors.addFirst(m_strLastError);
	}

	protected void setLogAdmin() {
		m_logAgent.addLogList(m_slErrors);
		m_slErrors.clear();
	}

	protected void setGradeLog(String strGradeLog) {
		m_logAgent.addGradeLog(strGradeLog);
	}

	protected int getErrorCount() {
		if (m_slErrors == null)
			return 0;

		return m_slErrors.size();
	}

	protected LinkedList subtract(LinkedList llSource, LinkedList llTarget) {
		LinkedList arraylist = new LinkedList(llSource);
		for (Iterator iterator = llTarget.iterator(); iterator.hasNext(); arraylist.remove(iterator.next()))
			;
		return arraylist;
	}

	protected LinkedList subtractDiffType(LinkedList olSource, LinkedList llTarget) {
		LinkedList olTmpSource = new LinkedList(olSource);
		for (Iterator iterator = llTarget.iterator(); iterator.hasNext();) {
			String str = (String) iterator.next();
			for (Iterator iterator2 = olTmpSource.iterator(); iterator2.hasNext();) {
				UserIDIRObject objUser = (UserIDIRObject) iterator2.next();
				if (objUser.getUserID().equals(str)) {
					olTmpSource.remove(objUser);
					break;
				}
			}
		}
		return olTmpSource;
	}

	String replaceAsp(String str) {
		if (str != null)
			return str.replaceAll("'", "''");
		else
			return str;
	}

	/*
	 * 일시 : 09.05.07 사이트 : 중공업 내용 : 연동모듈에서 발생하는 모든 쿼리를 확인하기 위해 작성
	 */
	protected void writeQueryToFile(LinkedList slCommText) {

		SimpleDateFormat form = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String dateStr = form.format(date);

		String fileName = "/acube/acube50/idir/web/cn/svcs/NotiSvc/organizationLinkage/logs/QueryLog" + dateStr + ".log";

		File file = new File(fileName);
		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					// System.out.println("log file is created successfully");
				} else {
					// System.out.println("log file creation fail");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

			writer.write("**********************************************************************************************************************************************");
			writer.newLine();
			for (int i = 0; i < slCommText.size(); i++) {
				writer.write(slCommText.get(i).toString());
				writer.newLine();
			}
			writer.write("**********************************************************************************************************************************************");
			writer.newLine();

			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 일시 : 09.05.07 사이트 : 중공업 내용 : 연동모듈에서 발생하는 모든 쿼리를 확인하기 위해 작성
	 */
	protected void writeQueryToFile(String slCommText) {

		SimpleDateFormat form = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String dateStr = form.format(date);

		String fileName = "/acube/acube50/idir/web/cn/svcs/NotiSvc/organizationLinkage/logs/QueryLog" + dateStr + ".log";

		File file = new File(fileName);
		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					// System.out.println("log file is created successfully");
				} else {
					// System.out.println("log file creation fail");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

			writer.write("**********************************************************************************************************************************************");
			writer.newLine();
			writer.write(slCommText);
			writer.newLine();
			writer.write("**********************************************************************************************************************************************");
			writer.newLine();

			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String m_strLastError;
	private LinkedList m_slErrors = null;

	protected LogAgent m_logAgent = null;
	protected ConnectionParam m_connParamForACUBE = null;
	protected ConnectionBroker m_connectionBroker = null;
}
