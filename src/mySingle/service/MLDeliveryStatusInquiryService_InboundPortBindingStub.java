/**
 * MLDeliveryStatusInquiryService_InboundPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package mySingle.service;

public class MLDeliveryStatusInquiryService_InboundPortBindingStub extends org.apache.axis.client.Stub implements samsung.esb.mail.service.MLDeliveryStatusInquiryService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMailStatusCounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mtrKeys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/mail/vo", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "mtrKeys"));
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/mail/vo", "ArrayOfStatusCountESBVO"));
        oper.setReturnClass(samsung.esb.mail.vo.StatusCountESBVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "statusCountVO"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "statusCountESBVOs"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/mail/service", "getMailStatusCounts_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRecipientStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mtrKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resourceCSVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/mail/vo", "ResourceCSVO"), samsung.esb.mail.vo.ResourceCSVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/mail/vo", "ArrayOfRecipientESBVO"));
        oper.setReturnClass(samsung.esb.mail.vo.RecipientESBVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "recipientESBVO"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "recipientESBVOs"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/mail/service", "getRecipientStatus_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[1] = oper;

    }

    public MLDeliveryStatusInquiryService_InboundPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MLDeliveryStatusInquiryService_InboundPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MLDeliveryStatusInquiryService_InboundPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.common.vo.ESBAuthVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.common.vo.ESBFaultVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/mail/vo", "ArrayOfRecipientESBVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.mail.vo.RecipientESBVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/mail/vo", "RecipientESBVO");
            qName2 = new javax.xml.namespace.QName("", "recipientESBVOs");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/mail/vo", "ArrayOfStatusCountESBVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.mail.vo.StatusCountESBVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/mail/vo", "StatusCountESBVO");
            qName2 = new javax.xml.namespace.QName("", "statusCountESBVOs");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/mail/vo", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "mtrKeys");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/mail/vo", "RecipientESBVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.mail.vo.RecipientESBVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/mail/vo", "ResourceCSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.mail.vo.ResourceCSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/mail/vo", "StatusCountESBVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.mail.vo.StatusCountESBVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Exception _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public samsung.esb.mail.vo.StatusCountESBVO[] getMailStatusCounts(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String[] mtrKeys) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/mail/service", "getMailStatusCounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, mtrKeys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.mail.vo.StatusCountESBVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.mail.vo.StatusCountESBVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.mail.vo.StatusCountESBVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof samsung.esb.common.vo.ESBFaultVO) {
              throw (samsung.esb.common.vo.ESBFaultVO) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public samsung.esb.mail.vo.RecipientESBVO[] getRecipientStatus(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String mtrKey, samsung.esb.mail.vo.ResourceCSVO resourceCSVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/mail/service", "getRecipientStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, mtrKey, resourceCSVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.mail.vo.RecipientESBVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.mail.vo.RecipientESBVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.mail.vo.RecipientESBVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof samsung.esb.common.vo.ESBFaultVO) {
              throw (samsung.esb.common.vo.ESBFaultVO) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
