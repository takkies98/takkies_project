/**
 * PMBizCardMgmtService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.pims.service;

public interface PMBizCardMgmtService extends java.rmi.Remote {
    public samsung.esb.pims.vo.NameCardWSVO[] getPersonalNameCardList(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String userID) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.NameCardCustWSVO[] findNameCardListByUpdatedDate(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String userID, long updatedDate) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public java.lang.String deleteNameCard(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String[] ncodes) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public java.lang.String updateNameCard(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.pims.vo.NameCardWSVO nameCardVO, samsung.esb.pims.vo.GroupMemberWSVO[] groupMemberVOs, samsung.esb.pims.vo.NameCardRelationPersonWSVO[] relationPersonVOs, samsung.esb.pims.vo.NameCardUserWSVO nameCardUserVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public java.lang.String addNameCard(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.pims.vo.NameCardWSVO nameCardVO, samsung.esb.pims.vo.GroupMemberWSVO[] groupMemberVOs, samsung.esb.pims.vo.NameCardRelationPersonWSVO[] relationPersonVOs, samsung.esb.pims.vo.NameCardUserWSVO nameCardUserVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.NameCardWSVO findDetailNameCard(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String nCode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.NameCardCustWSVO[] findPersonalNameCardList(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String owenerID, java.lang.String srchField, java.lang.String srchValue) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.NameCardCustWSVO[] findPersonalNameCardListbyPhone(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String ownerId, java.lang.String number, java.lang.String srchIdx) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.NameCardDetailWSVO findDetailNameCardInfo(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String ownerId, java.lang.String nCode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
}
