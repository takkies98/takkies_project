/**
 * APWithdrawService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.approval.service;

public interface APWithdrawService extends java.rmi.Remote {
    public java.lang.String cancelApproval(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.approval.vo.CancelProcessWSVO cancelProcessWSVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
}
