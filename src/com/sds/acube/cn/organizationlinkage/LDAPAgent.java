package com.sds.acube.cn.organizationlinkage;

import java.util.LinkedList;

import model.outldap.samsung.net.Employee;
import model.outldap.samsung.net.Organization;
import mySingle.service.EmpServiceLocator;
import mySingle.service.OrgServiceLocator;

import org.apache.axis.AxisFault;

import OutldapFindEmpLib.UserService.UserService;
import OutldapFindOrgLib.OrganizationService.OrganizationService;

public class LDAPAgent {
	private String m_strCID = "";
	private String m_strCIDPassword = "";
	private OrgServiceLocator orgServiceLocator = null;
	private OrganizationService clientStubOrg = null;
	private EmpServiceLocator empServiceLocator = null;
	private UserService clientStubUser = null;

	public LDAPAgent(String strCID, String strCIDPassword) {
		this.m_strCID = strCID;
		this.m_strCIDPassword = strCIDPassword;
	}

	public Organization[] getOrgInfo(String strCompanyID) {
		try {
			if (!connectOrgService()) {
				return null;
			}
			Organization[] organization = this.clientStubOrg.findByEpOrganizationNumber(this.m_strCID, strCompanyID, this.m_strCIDPassword);

			return organization;
		} catch (AxisFault fault) {
			System.out.println("ESB ERROR [getOrgInfo]");
			System.out.println("Fault Actor : " + fault.getFaultActor());
			System.out.println("Fault Code : " + fault.getFaultCode());
			System.out.println("Fault String : " + fault.getFaultString());
		} catch (Exception ex) {
			System.out.println("ESB ERROR [getOrgInfo]: " + ex.getMessage());
			ex.printStackTrace();
		}

		return null;
	}

	public Organization[] getOrgInfoByDeptID(String strCompanyID, String strDeptID) {
		try {
			if (!connectOrgService()) {
				return null;
			}
			LinkedList llOrgs = new LinkedList();
			Organization[] topOrganization = this.clientStubOrg.findByDepartmentNumber(this.m_strCID, strCompanyID, strDeptID, this.m_strCIDPassword);
			if (topOrganization == null) {
				return topOrganization;
			}
			llOrgs.add(topOrganization);

			for (int i = 0; i < llOrgs.size(); i++) {
				Organization[] tmpOrganization = (Organization[]) llOrgs.get(i);
				for (int j = 0; j < tmpOrganization.length; j++) {
					Organization[] subOrganization = (Organization[]) null;
					String strParentID = tmpOrganization[j].getCn();
					subOrganization = this.clientStubOrg.findByEpHighDeptNumber(this.m_strCID, strCompanyID, strParentID, this.m_strCIDPassword);

					if ((subOrganization == null) || (subOrganization.length <= 0))
						continue;
					llOrgs.add(subOrganization);
				}
			}
			int nTotalLen = 0;
			for (int i = 0; i < llOrgs.size(); i++) {
				Organization[] tmpOrganization = (Organization[]) llOrgs.get(i);
				nTotalLen += tmpOrganization.length;
			}
			Organization[] organization = new Organization[nTotalLen];
			int i = 0;
			for (int n = 0; i < llOrgs.size(); i++) {
				Organization[] tmpOrganization = (Organization[]) llOrgs.get(i);
				for (int j = 0; j < tmpOrganization.length; n++) {
					organization[n] = tmpOrganization[j];

					j++;
				}
			}
			return organization;
		} catch (AxisFault fault) {
			System.out.println("ESB ERROR [getOrgInfoByDeptID]");
			System.out.println("Fault Actor : " + fault.getFaultActor());
			System.out.println("Fault Code : " + fault.getFaultCode());
			System.out.println("Fault String : " + fault.getFaultString());
		} catch (Exception ex) {
			System.out.println("ESB ERROR [getOrgInfoByDeptID]: " + ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}

	public Organization[] getOrgInfoByPartial(String strCompanyID, String strDeptID) {
		try {
			if (!connectOrgService()) {
				return null;
			}
			Organization[] organization = this.clientStubOrg.findByEpHighDeptNumber(this.m_strCID, strCompanyID, strDeptID, this.m_strCIDPassword);
			return organization;
		} catch (AxisFault fault) {
			System.out.println("ESB ERROR [getOrgInfoByPartial]");
			System.out.println("Fault Actor : " + fault.getFaultActor());
			System.out.println("Fault Code : " + fault.getFaultCode());
			System.out.println("Fault String : " + fault.getFaultString());
		} catch (Exception ex) {
			System.out.println("ESB ERROR [getOrgInfoByPartial]: " + ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}

	public Employee[] getOrgUsers(String strCompanyID, String strDepartmentID) {
		try {
			if (!connectUserService()) {
				return null;
			}
			Employee[] employee = (Employee[]) null;
			employee = this.clientStubUser.findByCompDepartmentNumber(this.m_strCID, strCompanyID, strDepartmentID, this.m_strCIDPassword);
			return employee;
		} catch (AxisFault fault) {
			System.out.println("ESB ERROR [getOrgUsers]");
			System.out.println("Fault Actor : " + fault.getFaultActor());
			System.out.println("Fault Code : " + fault.getFaultCode());
			System.out.println("Fault String : " + fault.getFaultString());
		} catch (Exception ex) {
			System.out.println("ESB ERROR [getOrgUsers]: " + ex.getMessage());
			System.out.println("ESB ERROR : " + ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}

	public void disconnectService() {
		if (this.orgServiceLocator != null) {
			this.clientStubOrg = null;
			this.orgServiceLocator = null;
		}

		if (this.empServiceLocator != null) {
			this.clientStubUser = null;
			this.empServiceLocator = null;
		}
	}

	private boolean connectOrgService() throws AxisFault {
		boolean bRV = true;
		try {
			if (this.orgServiceLocator == null) {
				this.orgServiceLocator = new OrgServiceLocator();
				// 2011.12.27 change stage end-point address-start
				this.orgServiceLocator.setOrgService_InboundPortEndpointAddress("http://wsstage.samsung.net/wsgwsoaphttp1/soaphttpengine/WSGWBus/OrgService/OrgService_InboundPort");
				// 2011.12.27 change stage end-point address-end
				this.clientStubOrg = this.orgServiceLocator.getOrgService_InboundPort();
			}
		} catch (Exception ex) {
			System.out.println("ESB ERROR [connectOrgService] : " + ex.getMessage());
			ex.printStackTrace();
			bRV = false;
		}
		return bRV;
	}

	private boolean connectUserService() throws AxisFault {
		boolean bRV = true;
		try {
			if (this.empServiceLocator == null) {
				this.empServiceLocator = new EmpServiceLocator();
				// 2011.12.27 change stage end-point address-start
				this.empServiceLocator.setEmpService_InboundPortEndpointAddress("http://wsstage.samsung.net/wsgwsoaphttp1/soaphttpengine/WSGWBus/EmpService/EmpService_InboundPort");
				// 2011.12.27 change stage end-point address-end
				this.clientStubUser = this.empServiceLocator.getEmpService_InboundPort();
			}
		} catch (Exception ex) {
			System.out.println("ESB ERROR [connectUserService] : " + ex.getMessage());
			ex.printStackTrace();
			bRV = false;
		}
		return bRV;
	}
}