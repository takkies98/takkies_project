/**
 * MLDeliveryStatusInquiryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.mail.service;

public interface MLDeliveryStatusInquiryService extends java.rmi.Remote {
    public samsung.esb.mail.vo.StatusCountESBVO[] getMailStatusCounts(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String[] mtrKeys) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.mail.vo.RecipientESBVO[] getRecipientStatus(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String mtrKey, samsung.esb.mail.vo.ResourceCSVO resourceCSVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
}
