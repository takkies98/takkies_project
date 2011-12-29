/**
 * PMScheduleMgmtService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.pims.service;

public interface PMScheduleMgmtService extends java.rmi.Remote {
    public java.lang.String addSchedule(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.pims.vo.ScheduleEtyWSVO scheduleEtyVO, samsung.esb.pims.vo.ScheduleReceiverWSVO[] receiverVOs, samsung.esb.pims.vo.AttachFileEtyWSVO[] attachFileVOs, java.lang.String repeatFlag, java.lang.String timeZone, samsung.esb.pims.vo.UserVO userVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public java.lang.String updateSchedule(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.pims.vo.ScheduleEtyWSVO scheduleEtyVO, samsung.esb.pims.vo.ScheduleReceiverWSVO[] receiverVOs, samsung.esb.pims.vo.AttachFileEtyWSVO[] attachFileVOs, java.lang.String[] delFileList, java.lang.String repeatFlag, java.lang.String rcvRepeatFlag, java.lang.String timeZone, samsung.esb.pims.vo.UserVO userVO) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public java.lang.String deleteSchedule(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String schCode, java.lang.String repeatFlag) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.CalListCustWSVO[] findCalendarList(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String userId, java.lang.String actorUserId, long startDate, long endDate, java.lang.String searchFlag, int selectMode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.ScheduleCustomWSVO findDetailSchedule(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String schCode, java.lang.String ownerUserId) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.ScheduleEtyWSVO[] batchScheduleByCompCode(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String compCode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.ScheduleEtyWSVO[] batchScheduleDelHistoryByCompCode(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String compCode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.ScheduleReceiverWSVO[] batchScheduleReceiverByCompCode(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String compCode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.ScheduleTypeEtyWSVO[] findSchTypeList(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String userId) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.ScheduleCustomWSVO[] findDetailSchedules(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String[] schCodes, java.lang.String ownerUserId) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.CalListCustWSVO[] findCalendarListByUpdatedDate(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String userId, java.lang.String actorUserId, long updatedDate, long startDate, long endDate, java.lang.String searchFlag, int selectMode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.WeatherWSVO[] findWeatherList(samsung.esb.common.vo.ESBAuthVO esbAuthVO, java.lang.String startDate, java.lang.String endDate, java.lang.String timeZone, java.lang.String regionCode) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
    public samsung.esb.pims.vo.PersonalSchedulesWSVO[] findPersonalSchedules(samsung.esb.common.vo.ESBAuthVO esbAuthVO, samsung.esb.pims.vo.ScheduleReceiverWSVO[] scheduleReceiverWSVOs, java.lang.String startDate, java.lang.String endDate, java.lang.String timeZone, java.lang.String ownerId) throws java.rmi.RemoteException, samsung.esb.common.vo.ESBFaultVO;
}
