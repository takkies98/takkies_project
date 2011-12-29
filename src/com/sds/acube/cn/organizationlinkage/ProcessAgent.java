package com.sds.acube.cn.organizationlinkage;

import java.util.LinkedList;

import model.outldap.samsung.net.Employee;
import model.outldap.samsung.net.Organization;

import com.sds.acube.cn.common.vo.ConnectionParam;

public class ProcessAgent {
	private LogAgent m_logAgent = null;
	// private LinkedList m_slErrors = null;

	private int m_nSuccessCount = 0;
	private int m_nFailCount = 0;
	private int m_nSourceFailCount = 0;

	private LinkedList m_olData = null;
	private ConnectionParam m_connParamForACUBE = null;
	private PropertyObject m_objProperty = null;

	private CompanyObject[] m_arrCompany = null;

	private LDAPAgent ldapAgent = null;
	private UserAgent userAgent = null;
	private OrgAgent orgAgent = null;
	private OtherInfoAgent otherInfoAgent = null;

	public ProcessAgent(ConnectionParam connParamForACUBE, LogAgent logAgent, PropertyObject objProperty) {
		this.m_connParamForACUBE = connParamForACUBE;
		this.m_logAgent = logAgent;
		this.m_objProperty = objProperty;

		this.m_olData = new LinkedList();
	}

	public boolean processData() {
		// boolean bRetVal = false;
		SourceAgent sourceAgent = null;
		Organization[] organization = (Organization[]) null;
		try {
			this.ldapAgent = new LDAPAgent(this.m_objProperty.getCID(), this.m_objProperty.getCIDPassword());
			this.userAgent = new UserAgent(this.m_connParamForACUBE, this.m_logAgent, this.m_objProperty);
			this.orgAgent = new OrgAgent(this.m_connParamForACUBE, this.m_logAgent, this.m_objProperty);

			this.userAgent.setOrgAgent(this.orgAgent);

			int nCompanyCount = this.m_objProperty.getCompanyIDs().length;
			this.m_arrCompany = new CompanyObject[nCompanyCount];

			for (int i = 0; i < nCompanyCount; i++) {
				this.m_arrCompany[i] = new CompanyObject();
				this.m_arrCompany[i].setCompanyID(this.m_objProperty.getCompanyIDs(i));

				if ((this.m_objProperty.getUseIndividualDivision() > 0) && (!this.m_objProperty.getDivisionCode().equals(""))) {
					organization = this.ldapAgent.getOrgInfoByDeptID(this.m_arrCompany[i].getCompanyID(), this.m_objProperty.getDivisionCode());
				} else {
					if (this.m_arrCompany[i].getProcessType().equalsIgnoreCase("P")) {
						boolean bRepeat = true;
						String strParentID = this.m_arrCompany[i].getCompanyID();

						if (!this.orgAgent.preProcessDelete(strParentID)) {
							System.out.println("[ERROR 1] " + this.orgAgent.getLastError());
						}

						while (bRepeat) {
							organization = this.ldapAgent.getOrgInfoByPartial(this.m_arrCompany[i].getCompanyID(), strParentID);
							if ((organization == null) || (organization.length < 1)) {
								this.m_logAgent.addLog("[Result] There is no data.");
								this.m_logAgent.addEndProcess();
								break;
							}
							if (organization.length == 1) {
								execution(organization, i);
								strParentID = organization[0].getCn();
							} else {
								if (organization.length <= 1)
									continue;
								System.out.println("****** organization length is " + organization.length);
								for (int j = 0; j < organization.length; j++) {
									System.out.println("****** organization > 1 " + organization[j].getCn() + "/" + organization[j].getOu());

									Organization[] tmpOrganization = new Organization[1];
									tmpOrganization[0] = organization[j];
									execution(tmpOrganization, i);
									tmpOrganization = (Organization[]) null;

									Organization[] midOrganization = this.ldapAgent.getOrgInfoByPartial(this.m_arrCompany[i].getCompanyID(), organization[j].getCn());
									if ((midOrganization == null) || (midOrganization.length < 1)) {
										System.out.println("****** midOrganization = 0");
									} else if (midOrganization.length == 1) {
										System.out.println("****** midOrganization = 1 [" + midOrganization[0].getCn() + "/" + midOrganization[0].getOu());
										execution(midOrganization, i);
									} else if (midOrganization.length > 1) {
										for (int k = 0; k < midOrganization.length; k++) {
											System.out.println("****** midOrganization > 1 [" + midOrganization[k].getCn() + "/" + midOrganization[k].getOu());

											Organization[] tmp2Organization = new Organization[1];
											tmp2Organization[0] = midOrganization[k];
											execution(tmp2Organization, i);
											tmp2Organization = (Organization[]) null;

											Organization[] mid2Organization = this.ldapAgent.getOrgInfoByPartial(this.m_arrCompany[i].getCompanyID(), midOrganization[k].getCn());
											if ((mid2Organization == null) || (mid2Organization.length < 1)) {
												System.out.println("****** mid2Organization = 0");
											} else if (mid2Organization.length == 1) {
												System.out.println("****** mid2Organization = 1 [" + mid2Organization[0].getCn() + "/" + mid2Organization[0].getOu());
												execution(mid2Organization, i);
											} else if (mid2Organization.length > 1) {
												for (int l = 0; l < mid2Organization.length; l++) {
													System.out.println("****** mid2Organization > 1 [" + mid2Organization[l].getCn() + "/" + mid2Organization[l].getOu());
													Organization[] subOrganization = this.ldapAgent.getOrgInfoByDeptID(this.m_arrCompany[i].getCompanyID(),
															mid2Organization[l].getCn());
													execution(subOrganization, i);
													subOrganization = (Organization[]) null;
												}
											}
											mid2Organization = (Organization[]) null;
										}
									}
									midOrganization = (Organization[]) null;
								}
								bRepeat = false;
							}
						}
					} else {
						organization = this.ldapAgent.getOrgInfo(this.m_arrCompany[i].getCompanyID());
						execution(organization, i);
						this.m_logAgent.writeGradeLog();
					}
					organization = (Organization[]) null;
				}
			}
			this.ldapAgent.disconnectService();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR 2] " + e.getMessage());
			return false;
		} finally {
			if (sourceAgent != null) {
				sourceAgent.closeConnection();
			}
			if (this.orgAgent != null)
				this.orgAgent.closeConnection();
			if (this.userAgent != null) {
				this.userAgent.closeConnection();
			}
			if (this.otherInfoAgent != null) {
				this.otherInfoAgent.closeConnection();
			}
		}
		return true;
	}

	public boolean execution(Organization[] organization, int nCompanyIndex) {
		boolean bRV = true;
		try {
			this.m_arrCompany[nCompanyIndex].createList();
			this.m_logAgent.addTitle("Organization Process - CompanyID : " + this.m_arrCompany[nCompanyIndex].getCompanyID());
			this.orgAgent.processData(organization, this.m_arrCompany[nCompanyIndex].getOrgData());
			this.m_logAgent.addEndProcess();

			for (int j = 0; j < organization.length; j++) {
				System.out.println("[ " + j + " ]" + organization[j].getCn() + " / " + organization[j].getDepartmentnumber() + " / " + organization[j].getOu() + " / ");
				Employee[] employee = this.ldapAgent.getOrgUsers(this.m_arrCompany[nCompanyIndex].getCompanyID(), organization[j].getCn());
				if ((employee != null) && (employee.length > 0)) {
					this.m_logAgent.addTitle("User Process - OrgInfo : [ " + j + " ]" + organization[j].getCn() + " / " + organization[j].getOu() + " / " + employee.length);
					this.userAgent.processData(employee, organization[j].getCn());
				} else {
					this.m_logAgent.addTitle("User Process - OrgInfo : [ " + j + " ]" + organization[j].getCn() + " / " + organization[j].getOu() + " / " + 0);
				}

				if (!this.m_objProperty.isExistUnDeleteOrgIDs(organization[j].getCn())) {
					if ((employee != null) && (employee.length > 0)) {
						this.m_logAgent.addTitle("User Process - [ Delete User ] OrgInfo : [ " + j + " ]" + organization[j].getCn() + " / " + organization[j].getOu() + " / "
								+ employee.length);
						this.userAgent.processDelete(employee, organization[j].getCn());
					} else {
						this.m_logAgent.addTitle("User Process - OrgInfo : [ " + j + " ]" + organization[j].getCn() + " / " + organization[j].getOu() + " / " + 0);
					}
				}
				employee = (Employee[]) null;
			}
			if (this.m_arrCompany[nCompanyIndex].getProcessType().equalsIgnoreCase("A")) {
				this.orgAgent.processDelete(this.m_arrCompany[nCompanyIndex].getOrgData(), this.m_arrCompany[nCompanyIndex].getCompanyID());
			}
			this.m_arrCompany[nCompanyIndex].deleteList();
			this.m_logAgent.addEndProcess();
		} catch (Exception e) {
			System.out.println("[ERROR 3] " + e.getMessage());
		}
		return bRV;
	}

	public int getSuccessCount() {
		return this.m_nSuccessCount;
	}

	public int getFailCount() {
		return this.m_nFailCount;
	}

	public int getSourcFailCount() {
		return this.m_nSourceFailCount;
	}
}