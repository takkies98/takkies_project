/**
 * APStatusInquiryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.approval.service;

public interface APStatusInquiryService extends java.rmi.Remote {
    public samsung.esb.approval.vo.ProcessStatusWSVO getStatusByMisId(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.approval.vo.MisKeyWSVO misKeyWSVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.approval.vo.ProcessBriefStatusWSVO[] getStatusByBulkMisId(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.approval.vo.MisKeyWSVO[] misKeyWSVOs) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.approval.vo.ProcessListWSVO[] getListByUserKey(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.approval.vo.UserKeyWSVO userKeyWSVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
}
