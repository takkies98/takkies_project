/**
 * PMScheduleMgmtService_InboundPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package mySingle.service;

public class PMScheduleMgmtService_InboundPortBindingStub extends org.apache.axis.client.Stub implements samsung.esb.pims.service.PMScheduleMgmtService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[13];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addSchedule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scheduleEtyVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleEtyWSVO"), samsung.esb.pims.vo.ScheduleEtyWSVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiverVOs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleReceiverWSVOList"), samsung.esb.pims.vo.ScheduleReceiverWSVO[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "scheduleReceiverWSVO"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachFileVOs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "AttachFileEtyWSVOList"), samsung.esb.pims.vo.AttachFileEtyWSVO[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "attachFileEtyWSVO"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "repeatFlag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeZone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "UserVO"), samsung.esb.pims.vo.UserVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "addSchedule_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSchedule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scheduleEtyVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleEtyWSVO"), samsung.esb.pims.vo.ScheduleEtyWSVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiverVOs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleReceiverWSVOList"), samsung.esb.pims.vo.ScheduleReceiverWSVO[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "scheduleReceiverWSVO"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attachFileVOs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "AttachFileEtyWSVOList"), samsung.esb.pims.vo.AttachFileEtyWSVO[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "attachFileEtyWSVO"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "delFileList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "StringList"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "repeatFlag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rcvRepeatFlag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeZone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "UserVO"), samsung.esb.pims.vo.UserVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "updateSchedule_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteSchedule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "schCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "repeatFlag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "deleteSchedule_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findCalendarList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "actorUserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFlag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "selectMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "CalListCustWSVOList"));
        oper.setReturnClass(samsung.esb.pims.vo.CalListCustWSVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "calListCustVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findCalendarList_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findDetailSchedule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "schCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ownerUserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleCustomWSVO"));
        oper.setReturnClass(samsung.esb.pims.vo.ScheduleCustomWSVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findDetailSchedule_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("batchScheduleByCompCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "compCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleEtyWSVOList"));
        oper.setReturnClass(samsung.esb.pims.vo.ScheduleEtyWSVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "scheduleEtyWSVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "batchScheduleByCompCode_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("batchScheduleDelHistoryByCompCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "compCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleEtyWSVOList"));
        oper.setReturnClass(samsung.esb.pims.vo.ScheduleEtyWSVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "scheduleEtyWSVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "batchScheduleDelHistoryByCompCode_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("batchScheduleReceiverByCompCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "compCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleReceiverWSVOList"));
        oper.setReturnClass(samsung.esb.pims.vo.ScheduleReceiverWSVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "scheduleReceiverWSVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "batchScheduleReceiverByCompCode_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findSchTypeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleTypeEtyWSVOList"));
        oper.setReturnClass(samsung.esb.pims.vo.ScheduleTypeEtyWSVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "scheduleEtyWSVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findSchTypeList_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findDetailSchedules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "schCodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "StringList"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ownerUserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleCustomWSVOList"));
        oper.setReturnClass(samsung.esb.pims.vo.ScheduleCustomWSVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "scheduleCustomWSVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findDetailSchedules_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findCalendarListByUpdatedDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "actorUserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "updatedDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFlag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "selectMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "CalListCustWSVOList"));
        oper.setReturnClass(samsung.esb.pims.vo.CalListCustWSVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "calListCustVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findCalendarListByUpdatedDate_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findWeatherList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeZone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "regionCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "WeatherWSVOList"));
        oper.setReturnClass(samsung.esb.pims.vo.WeatherWSVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "weatherWSVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findWeatherList_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findPersonalSchedules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "esbAuthVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBAuthVO"), samsung.esb.common.vo.ESBAuthVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scheduleReceiverWSVOs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleReceiverWSVOList"), samsung.esb.pims.vo.ScheduleReceiverWSVO[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "scheduleReceiverWSVO"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeZone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ownerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "PersonalSchedulesWSVOList"));
        oper.setReturnClass(samsung.esb.pims.vo.PersonalSchedulesWSVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "personalSchedulesWSVOList"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findPersonalSchedules_esbFaultVO"),
                      "samsung.esb.common.vo.ESBFaultVO",
                      new javax.xml.namespace.QName("http://samsung/esb/common/vo", "ESBFaultVO"), 
                      true
                     ));
        _operations[12] = oper;

    }

    public PMScheduleMgmtService_InboundPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PMScheduleMgmtService_InboundPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PMScheduleMgmtService_InboundPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "AttachFileEtyWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.AttachFileEtyWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "AttachFileEtyWSVOList");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.AttachFileEtyWSVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "AttachFileEtyWSVO");
            qName2 = new javax.xml.namespace.QName("", "attachFileEtyWSVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "CalListCustWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.CalListCustWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "CalListCustWSVOList");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.CalListCustWSVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "CalListCustWSVO");
            qName2 = new javax.xml.namespace.QName("", "calListCustVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "PersonalSchedulesWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.PersonalSchedulesWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "PersonalSchedulesWSVOList");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.PersonalSchedulesWSVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "PersonalSchedulesWSVO");
            qName2 = new javax.xml.namespace.QName("", "personalSchedulesWSVOList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleCustomWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.ScheduleCustomWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleCustomWSVOList");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.ScheduleCustomWSVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleCustomWSVO");
            qName2 = new javax.xml.namespace.QName("", "scheduleCustomWSVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleEtyWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.ScheduleEtyWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleEtyWSVOList");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.ScheduleEtyWSVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleEtyWSVO");
            qName2 = new javax.xml.namespace.QName("", "scheduleEtyWSVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleReceiverWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.ScheduleReceiverWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleReceiverWSVOList");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.ScheduleReceiverWSVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleReceiverWSVO");
            qName2 = new javax.xml.namespace.QName("", "scheduleReceiverWSVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleTypeEtyWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.ScheduleTypeEtyWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleTypeEtyWSVOList");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.ScheduleTypeEtyWSVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleTypeEtyWSVO");
            qName2 = new javax.xml.namespace.QName("", "scheduleEtyWSVO");
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

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "WeatherWSVO");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.WeatherWSVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "WeatherWSVOList");
            cachedSerQNames.add(qName);
            cls = samsung.esb.pims.vo.WeatherWSVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "WeatherWSVO");
            qName2 = new javax.xml.namespace.QName("", "weatherWSVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws-i.org/profiles/basic/1.1/xsd", "swaRef");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.URI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

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

    public java.lang.String addSchedule(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.pims.vo.ScheduleEtyWSVO scheduleEtyVO, samsung.esb.pims.vo.ScheduleReceiverWSVO[] receiverVOs, samsung.esb.pims.vo.AttachFileEtyWSVO[] attachFileVOs, java.lang.String repeatFlag, java.lang.String timeZone, samsung.esb.pims.vo.UserVO userVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "addSchedule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, scheduleEtyVO, receiverVOs, attachFileVOs, repeatFlag, timeZone, userVO});

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

    public java.lang.String updateSchedule(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.pims.vo.ScheduleEtyWSVO scheduleEtyVO, samsung.esb.pims.vo.ScheduleReceiverWSVO[] receiverVOs, samsung.esb.pims.vo.AttachFileEtyWSVO[] attachFileVOs, java.lang.String[] delFileList, java.lang.String repeatFlag, java.lang.String rcvRepeatFlag, java.lang.String timeZone, samsung.esb.pims.vo.UserVO userVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "updateSchedule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, scheduleEtyVO, receiverVOs, attachFileVOs, delFileList, repeatFlag, rcvRepeatFlag, timeZone, userVO});

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

    public java.lang.String deleteSchedule(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String schCode, java.lang.String repeatFlag) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "deleteSchedule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, schCode, repeatFlag});

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

    public samsung.esb.pims.vo.CalListCustWSVO[] findCalendarList(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String userId, java.lang.String actorUserId, long startDate, long endDate, java.lang.String searchFlag, int selectMode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findCalendarList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, userId, actorUserId, new java.lang.Long(startDate), new java.lang.Long(endDate), searchFlag, new java.lang.Integer(selectMode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.CalListCustWSVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.CalListCustWSVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.CalListCustWSVO[].class);
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

    public samsung.esb.pims.vo.ScheduleCustomWSVO findDetailSchedule(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String schCode, java.lang.String ownerUserId) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findDetailSchedule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, schCode, ownerUserId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.ScheduleCustomWSVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.ScheduleCustomWSVO) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.ScheduleCustomWSVO.class);
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

    public samsung.esb.pims.vo.ScheduleEtyWSVO[] batchScheduleByCompCode(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String compCode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "batchScheduleByCompCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, compCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.ScheduleEtyWSVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.ScheduleEtyWSVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.ScheduleEtyWSVO[].class);
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

    public samsung.esb.pims.vo.ScheduleEtyWSVO[] batchScheduleDelHistoryByCompCode(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String compCode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "batchScheduleDelHistoryByCompCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, compCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.ScheduleEtyWSVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.ScheduleEtyWSVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.ScheduleEtyWSVO[].class);
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

    public samsung.esb.pims.vo.ScheduleReceiverWSVO[] batchScheduleReceiverByCompCode(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String compCode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "batchScheduleReceiverByCompCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, compCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.ScheduleReceiverWSVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.ScheduleReceiverWSVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.ScheduleReceiverWSVO[].class);
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

    public samsung.esb.pims.vo.ScheduleTypeEtyWSVO[] findSchTypeList(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String userId) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findSchTypeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, userId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.ScheduleTypeEtyWSVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.ScheduleTypeEtyWSVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.ScheduleTypeEtyWSVO[].class);
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

    public samsung.esb.pims.vo.ScheduleCustomWSVO[] findDetailSchedules(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String[] schCodes, java.lang.String ownerUserId) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findDetailSchedules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, schCodes, ownerUserId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.ScheduleCustomWSVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.ScheduleCustomWSVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.ScheduleCustomWSVO[].class);
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

    public samsung.esb.pims.vo.CalListCustWSVO[] findCalendarListByUpdatedDate(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String userId, java.lang.String actorUserId, long updatedDate, long startDate, long endDate, java.lang.String searchFlag, int selectMode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findCalendarListByUpdatedDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, userId, actorUserId, new java.lang.Long(updatedDate), new java.lang.Long(startDate), new java.lang.Long(endDate), searchFlag, new java.lang.Integer(selectMode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.CalListCustWSVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.CalListCustWSVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.CalListCustWSVO[].class);
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

    public samsung.esb.pims.vo.WeatherWSVO[] findWeatherList(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String startDate, java.lang.String endDate, java.lang.String timeZone, java.lang.String regionCode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findWeatherList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, startDate, endDate, timeZone, regionCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.WeatherWSVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.WeatherWSVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.WeatherWSVO[].class);
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

    public samsung.esb.pims.vo.PersonalSchedulesWSVO[] findPersonalSchedules(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.pims.vo.ScheduleReceiverWSVO[] scheduleReceiverWSVOs, java.lang.String startDate, java.lang.String endDate, java.lang.String timeZone, java.lang.String ownerId) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://samsung/esb/pims/service", "findPersonalSchedules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {esbAuthVO, scheduleReceiverWSVOs, startDate, endDate, timeZone, ownerId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (samsung.esb.pims.vo.PersonalSchedulesWSVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (samsung.esb.pims.vo.PersonalSchedulesWSVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, samsung.esb.pims.vo.PersonalSchedulesWSVO[].class);
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
