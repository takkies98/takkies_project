/**
 * PMBizCardMgmtService_InboundPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package mySingle.service;

public class PMBizCardMgmtService_InboundPortBindingStub extends org.apache.axis.client.Stub implements samsung.esb.pims.service.PMBizCardMgmtService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPersonalNameCardList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardWSVOList"));
        oper.setReturnClass(samsung.esb.pims.vo.NameCardWSVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "nameCardWSVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "getPersonalNameCardList_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findNameCardListByUpdatedDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "updatedDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardCustWSVOList"));
        oper.setReturnClass(samsung.esb.pims.vo.NameCardCustWSVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "nameCardCustWSVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findNameCardListByUpdatedDate_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteNameCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ncodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "StringList"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "deleteNameCard_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateNameCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nameCardVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardWSVO"), samsung.esb.pims.vo.NameCardWSVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupMemberVOs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "GroupMemberWSVOList"), samsung.esb.pims.vo.GroupMemberWSVO[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "groupMemberWSVO"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relationPersonVOs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardRelationPersonWSVOList"), samsung.esb.pims.vo.NameCardRelationPersonWSVO[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "nameCardRelationPersonWSVO"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nameCardUserVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardUserWSVO"), samsung.esb.pims.vo.NameCardUserWSVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "updateNameCard_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addNameCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nameCardVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardWSVO"), samsung.esb.pims.vo.NameCardWSVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupMemberVOs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "GroupMemberWSVOList"), samsung.esb.pims.vo.GroupMemberWSVO[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "groupMemberWSVO"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relationPersonVOs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardRelationPersonWSVOList"), samsung.esb.pims.vo.NameCardRelationPersonWSVO[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "nameCardRelationPersonWSVO"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nameCardUserVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardUserWSVO"), samsung.esb.pims.vo.NameCardUserWSVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "addNameCard_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findDetailNameCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardWSVO"));
        oper.setReturnClass(samsung.esb.pims.vo.NameCardWSVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findDetailNameCard_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findPersonalNameCardList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "owenerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "srchField"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "srchValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardCustWSVOList"));
        oper.setReturnClass(samsung.esb.pims.vo.NameCardCustWSVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "nameCardCustWSVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findPersonalNameCardList_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findPersonalNameCardListbyPhone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ownerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "srchIdx"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardCustWSVOList"));
        oper.setReturnClass(samsung.esb.pims.vo.NameCardCustWSVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "nameCardCustWSVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findPersonalNameCardListbyPhone_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findDetailNameCardInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ownerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardDetailWSVO"));
        oper.setReturnClass(samsung.esb.pims.vo.NameCardDetailWSVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findDetailNameCardInfo_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[8] = oper;

    }

    public PMBizCardMgmtService_InboundPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PMBizCardMgmtService_InboundPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PMBizCardMgmtService_InboundPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "CareerWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.CareerWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "GroupMemberWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.GroupMemberWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "GroupMemberWSVOList");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.GroupMemberWSVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "GroupMemberWSVO");
            qName2 = new javax.xml.namespace.QName("", "groupMemberWSVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "HumanNetworkWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.HumanNetworkWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardCustWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.NameCardCustWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardCustWSVOList");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.NameCardCustWSVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardCustWSVO");
            qName2 = new javax.xml.namespace.QName("", "nameCardCustWSVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardDetailWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.NameCardDetailWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardRelationPersonWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.NameCardRelationPersonWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardRelationPersonWSVOList");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.NameCardRelationPersonWSVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardRelationPersonWSVO");
            qName2 = new javax.xml.namespace.QName("", "nameCardRelationPersonWSVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardUserWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.NameCardUserWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.NameCardWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardWSVOList");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.NameCardWSVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardWSVO");
            qName2 = new javax.xml.namespace.QName("", "nameCardWSVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "StringList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "UserVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.UserVO.class;
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

    public samsung.esb.pims.vo.NameCardWSVO[] getPersonalNameCardList(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String userID) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "getPersonalNameCardList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, userID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.NameCardWSVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.NameCardWSVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.NameCardWSVO[].class);
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

    public samsung.esb.pims.vo.NameCardCustWSVO[] findNameCardListByUpdatedDate(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String userID, long updatedDate) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findNameCardListByUpdatedDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, userID, new java.lang.Long(updatedDate)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.NameCardCustWSVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.NameCardCustWSVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.NameCardCustWSVO[].class);
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

    public java.lang.String deleteNameCard(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String[] ncodes) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "deleteNameCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, ncodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
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

    public java.lang.String updateNameCard(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.pims.vo.NameCardWSVO nameCardVO, samsung.esb.pims.vo.GroupMemberWSVO[] groupMemberVOs, samsung.esb.pims.vo.NameCardRelationPersonWSVO[] relationPersonVOs, samsung.esb.pims.vo.NameCardUserWSVO nameCardUserVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "updateNameCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, nameCardVO, groupMemberVOs, relationPersonVOs, nameCardUserVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
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

    public java.lang.String addNameCard(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.pims.vo.NameCardWSVO nameCardVO, samsung.esb.pims.vo.GroupMemberWSVO[] groupMemberVOs, samsung.esb.pims.vo.NameCardRelationPersonWSVO[] relationPersonVOs, samsung.esb.pims.vo.NameCardUserWSVO nameCardUserVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "addNameCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, nameCardVO, groupMemberVOs, relationPersonVOs, nameCardUserVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
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

    public samsung.esb.pims.vo.NameCardWSVO findDetailNameCard(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String nCode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findDetailNameCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, nCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.NameCardWSVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.NameCardWSVO) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.NameCardWSVO.class);
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

    public samsung.esb.pims.vo.NameCardCustWSVO[] findPersonalNameCardList(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String owenerID, java.lang.String srchField, java.lang.String srchValue) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findPersonalNameCardList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, owenerID, srchField, srchValue});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.NameCardCustWSVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.NameCardCustWSVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.NameCardCustWSVO[].class);
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

    public samsung.esb.pims.vo.NameCardCustWSVO[] findPersonalNameCardListbyPhone(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String ownerId, java.lang.String number, java.lang.String srchIdx) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findPersonalNameCardListbyPhone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, ownerId, number, srchIdx});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.NameCardCustWSVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.NameCardCustWSVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.NameCardCustWSVO[].class);
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

    public samsung.esb.pims.vo.NameCardDetailWSVO findDetailNameCardInfo(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String ownerId, java.lang.String nCode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findDetailNameCardInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, ownerId, nCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.NameCardDetailWSVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.NameCardDetailWSVO) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.NameCardDetailWSVO.class);
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
