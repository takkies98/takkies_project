/**
 * PMScheduleMgmtServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package mySingle.service;

public class PMScheduleMgmtServiceLocator extends org.apache.axis.client.Service implements mySingle.service.PMScheduleMgmtService {

    public PMScheduleMgmtServiceLocator() {
    }


    public PMScheduleMgmtServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PMScheduleMgmtServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PMScheduleMgmtService_InboundPort
    private java.lang.String PMScheduleMgmtService_InboundPort_address = "http://wsstage.samsung.net/wsgwsoaphttp1/soaphttpengine/WSGWBus/PMScheduleMgmtService/PMScheduleMgmtService_InboundPort";

    public java.lang.String getPMScheduleMgmtService_InboundPortAddress() {
        return PMScheduleMgmtService_InboundPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PMScheduleMgmtService_InboundPortWSDDServiceName = "PMScheduleMgmtService_InboundPort";

    public java.lang.String getPMScheduleMgmtService_InboundPortWSDDServiceName() {
        return PMScheduleMgmtService_InboundPortWSDDServiceName;
    }

    public void setPMScheduleMgmtService_InboundPortWSDDServiceName(java.lang.String name) {
        PMScheduleMgmtService_InboundPortWSDDServiceName = name;
    }

    public samsung.esb.pims.service.PMScheduleMgmtService getPMScheduleMgmtService_InboundPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PMScheduleMgmtService_InboundPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPMScheduleMgmtService_InboundPort(endpoint);
    }

    public samsung.esb.pims.service.PMScheduleMgmtService getPMScheduleMgmtService_InboundPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mySingle.service.PMScheduleMgmtService_InboundPortBindingStub _stub = new mySingle.service.PMScheduleMgmtService_InboundPortBindingStub(portAddress, this);
            _stub.setPortName(getPMScheduleMgmtService_InboundPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPMScheduleMgmtService_InboundPortEndpointAddress(java.lang.String address) {
        PMScheduleMgmtService_InboundPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (samsung.esb.pims.service.PMScheduleMgmtService.class.isAssignableFrom(serviceEndpointInterface)) {
                mySingle.service.PMScheduleMgmtService_InboundPortBindingStub _stub = new mySingle.service.PMScheduleMgmtService_InboundPortBindingStub(new java.net.URL(PMScheduleMgmtService_InboundPort_address), this);
                _stub.setPortName(getPMScheduleMgmtService_InboundPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PMScheduleMgmtService_InboundPort".equals(inputPortName)) {
            return getPMScheduleMgmtService_InboundPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:service.mySingle/Service", "PMScheduleMgmtService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:service.mySingle/Service", "PMScheduleMgmtService_InboundPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PMScheduleMgmtService_InboundPort".equals(portName)) {
            setPMScheduleMgmtService_InboundPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
