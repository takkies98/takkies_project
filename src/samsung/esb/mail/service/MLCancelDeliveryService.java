/**
 * MLCancelDeliveryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.mail.service;

public interface MLCancelDeliveryService extends java.rmi.Remote {
    public java.lang.String cancelMISMailByRecipient(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String mtrKey, java.lang.String[] addressForCancel, samsung.esb.mail.vo.ResourceCSVO resourceCSVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
}
