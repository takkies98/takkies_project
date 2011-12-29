package com.sds.acube.cn.organizationlinkage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;

public class LogAgent
{
  private LinkedList m_slLogs = null;
  private LinkedList m_slGradeLogs = null;
  private LinkedList m_slPositionLogs = null;
  private String m_strFilePath = "";
  private File m_fileLog = null;
  private BufferedOutputStream m_bosLog = null;

  public LogAgent()
  {
  }

  public LogAgent(String strFilePath)
  {
    this.m_strFilePath = strFilePath;
  }

  public void startLog()
  {
    String strMsg = "";
    Date dCurTime = new Date(System.currentTimeMillis());
    strMsg = "- Start Time : " + dCurTime.toString();

    this.m_slLogs = new LinkedList();
    this.m_slLogs.addLast("============================================================");
    this.m_slLogs.addLast(strMsg);

    writeLog();
  }

  public void endLog(int nTotalCount, int nSuccessCount, int nFailCount)
  {
    String strMsg = "";

    this.m_slLogs.addLast("------------------------------------------------------------");
    strMsg = "* Total Count = " + nTotalCount;
    this.m_slLogs.addLast(strMsg);
    strMsg = "* SuccessCount = " + nSuccessCount;
    this.m_slLogs.addLast(strMsg);
    strMsg = "* FailCount = " + nFailCount;
    this.m_slLogs.addLast(strMsg);
    this.m_slLogs.addLast("------------------------------------------------------------");

    Date dCurTime = new Date(System.currentTimeMillis());
    strMsg = "- End Time : " + dCurTime.toString();

    this.m_slLogs.addLast(strMsg);
    this.m_slLogs.addLast("============================================================");

    writeLog();
  }

  public void endLog(int nTotalCount, int nCurInsertCount, int nCurUpdateCount, int nCurDeleteCount, int nCurSuccessCount, int nCurFailCount, int nInsertCount, int nUpdateCount, int nDeleteCount, int nSuccessCount, int nFailCount)
  {
    String strMsg = "";

    this.m_slLogs.addLast("------------------------------------------------------------");

    strMsg = "* Current Process Count = " + nTotalCount;
    this.m_slLogs.addLast(strMsg);

    strMsg = "* Current Insert Count = " + nCurInsertCount + " / " + "* Current Update Count = " + nCurUpdateCount + " / " + "* Current Delete Count = " + nCurDeleteCount;
    this.m_slLogs.addLast(strMsg);

    strMsg = "* Current SuccessCount = " + nCurSuccessCount;
    this.m_slLogs.addLast(strMsg);

    strMsg = "* Current FailCount = " + nCurFailCount;
    this.m_slLogs.addLast(strMsg);

    this.m_slLogs.addLast("");
    this.m_slLogs.addLast("** Total Info **********************************************");
    strMsg = "* Insert Count = " + nInsertCount + " / " + "* Update Count = " + nUpdateCount + " / " + "* Delete Count = " + nDeleteCount;
    this.m_slLogs.addLast(strMsg);

    strMsg = "* SuccessCount = " + nSuccessCount;
    this.m_slLogs.addLast(strMsg);

    strMsg = "* FailCount = " + nFailCount;
    this.m_slLogs.addLast(strMsg);

    this.m_slLogs.addLast("------------------------------------------------------------");

    Date dCurTime = new Date(System.currentTimeMillis());
    strMsg = "- End Time : " + dCurTime.toString();

    this.m_slLogs.addLast(strMsg);
    this.m_slLogs.addLast("============================================================");

    writeLog();
  }

  public void endLog(int nTotalCount, int nInsertCount, int nUpdateCount, int nDeleteCount, int nSuccessCount, int nFailCount)
  {
    String strMsg = "";

    this.m_slLogs.addLast("------------------------------------------------------------");

    strMsg = "* Current Process Count = " + nTotalCount;
    this.m_slLogs.addLast(strMsg);

    this.m_slLogs.addLast("** Total Info **********************************************");
    strMsg = "* Insert Count = " + nInsertCount + " / " + "* Update Count = " + nUpdateCount + " / " + "* Delete Count = " + nDeleteCount;
    this.m_slLogs.addLast(strMsg);

    strMsg = "* SuccessCount = " + nSuccessCount;
    this.m_slLogs.addLast(strMsg);

    strMsg = "* FailCount = " + nFailCount;
    this.m_slLogs.addLast(strMsg);

    this.m_slLogs.addLast("------------------------------------------------------------");

    Date dCurTime = new Date(System.currentTimeMillis());
    strMsg = "- End Time : " + dCurTime.toString();

    this.m_slLogs.addLast(strMsg);
    this.m_slLogs.addLast("============================================================");

    writeLog();
  }

  public boolean writeLog()
  {
    try
    {
      if (this.m_fileLog == null)
        this.m_fileLog = new File(this.m_strFilePath);
      if (!this.m_fileLog.exists()) {
        this.m_fileLog.createNewFile();
      }
      if (this.m_bosLog == null)
      {
        this.m_bosLog = new BufferedOutputStream(new FileOutputStream(this.m_fileLog, true));
      }
      String newLine = "\r\n";

      if (this.m_slLogs != null)
      {
        for (int i = 0; i < this.m_slLogs.size(); i++)
        {
          this.m_bosLog.write(this.m_slLogs.get(i).toString().getBytes("euc-kr"));
          this.m_bosLog.write(newLine.getBytes());
        }

      }

      this.m_slLogs.clear();
      this.m_bosLog.flush();
    }
    catch (IOException e)
    {
      e.getMessage();
    }

    return true;
  }

  public boolean writeGradeLog()
  {
    try
    {
      if (this.m_fileLog == null)
        this.m_fileLog = new File(this.m_strFilePath);
      if (!this.m_fileLog.exists()) {
        this.m_fileLog.createNewFile();
      }
      if (this.m_bosLog == null)
      {
        this.m_bosLog = new BufferedOutputStream(new FileOutputStream(this.m_fileLog, true));
      }
      String newLine = "\r\n";

      if (this.m_slGradeLogs != null)
      {
        String strDescription = "";

        strDescription = "------------------------------------------------------------";
        this.m_slGradeLogs.addFirst(strDescription);

        strDescription = "* Extract GradeInfo";
        this.m_slGradeLogs.addFirst(strDescription);

        strDescription = "============================================================";
        this.m_slGradeLogs.addFirst(strDescription);

        strDescription = "============================================================\r\n";
        this.m_slGradeLogs.addLast(strDescription);

        for (int i = 0; i < this.m_slGradeLogs.size(); i++)
        {
          this.m_bosLog.write(this.m_slGradeLogs.get(i).toString().getBytes("euc-kr"));
          this.m_bosLog.write(newLine.getBytes());
        }

      }

      this.m_slGradeLogs.clear();
      this.m_bosLog.flush();
    }
    catch (IOException e)
    {
      e.getMessage();
    }

    return true;
  }

  public boolean writeLog(String strFileName)
  {
    try
    {
      if (this.m_fileLog == null)
        this.m_fileLog = new File(this.m_strFilePath);
      if (!this.m_fileLog.exists()) {
        this.m_fileLog.createNewFile();
      }
      if (this.m_bosLog == null)
      {
        this.m_bosLog = new BufferedOutputStream(new FileOutputStream(this.m_fileLog, true));
      }

      String newLine = "\r\n";

      if (this.m_slLogs != null)
      {
        for (int i = 0; i < this.m_slLogs.size(); i++)
        {
          this.m_bosLog.write(this.m_slLogs.get(i).toString().getBytes("euc-kr"));
          this.m_bosLog.write(newLine.getBytes());
        }
      }

      if ((this.m_slGradeLogs != null) && (this.m_slGradeLogs.size() > 0))
      {
        String strDescription = "";

        strDescription = "------------------------------------------------------------";
        this.m_slGradeLogs.addFirst(strDescription);

        strDescription = "* Extract GradeInfo";
        this.m_slGradeLogs.addFirst(strDescription);

        strDescription = "============================================================";
        this.m_slGradeLogs.addFirst(strDescription);

        strDescription = "============================================================\r\n";
        this.m_slGradeLogs.addLast(strDescription);

        for (int i = 0; i < this.m_slGradeLogs.size(); i++)
        {
          this.m_bosLog.write(this.m_slGradeLogs.get(i).toString().getBytes("euc-kr"));
          this.m_bosLog.write(newLine.getBytes());
        }

        this.m_slGradeLogs.clear();
      }

      this.m_slLogs.clear();
      this.m_bosLog.flush();
      this.m_bosLog.close();
      this.m_bosLog = null;
      this.m_fileLog = null;
    }
    catch (IOException e)
    {
      e.getMessage();
    }

    return true;
  }

  public void addTitle(String strTitle)
  {
    this.m_slLogs.addLast("");
    this.m_slLogs.addLast("============================================================");
    this.m_slLogs.addLast(strTitle);
    this.m_slLogs.addLast("============================================================");
  }

  public void addProcess(String strProcessName, String strProcessData)
  {
    this.m_slLogs.addLast("------------------------------------------------------------");
    this.m_slLogs.addLast("[Process Name] " + strProcessName);
    this.m_slLogs.addLast("[Source Data] " + strProcessData);
    this.m_slLogs.addLast("");
  }

  public void addEndProcess()
  {
    this.m_slLogs.addLast("------------------------------------------------------------");
    this.m_slLogs.addLast("");
  }

  public void addLog(String strError)
  {
    this.m_slLogs.addLast(strError);
  }

  public void addLogList(LinkedList slErrors)
  {
    for (int i = 0; i < slErrors.size(); i++)
    {
      this.m_slLogs.addLast(slErrors.get(i));
    }
  }

  public void addGradeLog(String strLog)
  {
    if (this.m_slGradeLogs == null) {
      this.m_slGradeLogs = new LinkedList();
    }
    if (!this.m_slGradeLogs.contains(strLog))
      this.m_slGradeLogs.addLast(strLog);
  }

  public void addPositionLog(String strLog)
  {
    if (this.m_slPositionLogs == null) {
      this.m_slPositionLogs = new LinkedList();
    }
    if (!this.m_slPositionLogs.contains(strLog))
      this.m_slPositionLogs.addLast(strLog);
  }
}