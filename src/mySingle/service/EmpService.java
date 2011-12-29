/**
 * EmpService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package mySingle.service;

public interface EmpService extends javax.xml.rpc.Service {
    public java.lang.String getEmpService_InboundPortAddress();

    public OutldapFindEmpLib.UserService.UserService getEmpService_InboundPort() throws javax.xml.rpc.ServiceException;

    public OutldapFindEmpLib.UserService.UserService getEmpService_InboundPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
