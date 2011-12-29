/**
 * ScheduleEtyWSVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.pims.vo;

public class ScheduleEtyWSVO  implements java.io.Serializable {
    private java.lang.String editor;

    private java.lang.String inLocale;

    private java.lang.String schCode;

    private java.lang.String title;

    private java.lang.String schType;

    private java.lang.String schSubType;

    private java.lang.String place;

    private long startDate;

    private long endDate;

    private java.lang.String allDayFlag;

    private java.lang.String pubFlag;

    private java.lang.String schCompCode;

    private java.lang.String schDeptCode;

    private java.lang.String commCode;

    private java.lang.String commName;

    private java.lang.String commSchFlag;

    private java.lang.String repeatFlag;

    private java.lang.String attachCnt;

    private java.lang.String userId;

    private java.lang.String userRegNo;

    private java.lang.String userName;

    private java.lang.String userDeptName;

    private java.lang.String userDeptCode;

    private java.lang.String changeFlag;

    private long creationDate;

    private long updateDate;

    private java.lang.String organizer;

    private java.lang.String supervisor;

    private java.lang.String titleColor;

    private java.lang.String titleBgColor;

    private java.lang.String entryId;

    private java.lang.String readFrom;

    private java.lang.String readTo;

    private java.lang.String repeatType;

    private java.lang.String repeatTerm;

    private java.lang.String repeatDayName;

    private java.lang.String repeatRef;

    private long repeatStartDate;

    private long repeatEndDate;

    private java.lang.String repeatEndType;

    private java.lang.String repeatEndCnt;

    private java.lang.String repeatLunar;

    private java.lang.String parentSchCode;

    private java.lang.String actionItem;

    private java.lang.String note;

    private java.lang.String placeCode;

    private java.lang.String placeChangeMode;

    private java.lang.String userCompCode;

    private java.lang.String userLocale;

    private java.lang.String relationKey;

    public ScheduleEtyWSVO() {
    }

    public ScheduleEtyWSVO(
           java.lang.String editor,
           java.lang.String inLocale,
           java.lang.String schCode,
           java.lang.String title,
           java.lang.String schType,
           java.lang.String schSubType,
           java.lang.String place,
           long startDate,
           long endDate,
           java.lang.String allDayFlag,
           java.lang.String pubFlag,
           java.lang.String schCompCode,
           java.lang.String schDeptCode,
           java.lang.String commCode,
           java.lang.String commName,
           java.lang.String commSchFlag,
           java.lang.String repeatFlag,
           java.lang.String attachCnt,
           java.lang.String userId,
           java.lang.String userRegNo,
           java.lang.String userName,
           java.lang.String userDeptName,
           java.lang.String userDeptCode,
           java.lang.String changeFlag,
           long creationDate,
           long updateDate,
           java.lang.String organizer,
           java.lang.String supervisor,
           java.lang.String titleColor,
           java.lang.String titleBgColor,
           java.lang.String entryId,
           java.lang.String readFrom,
           java.lang.String readTo,
           java.lang.String repeatType,
           java.lang.String repeatTerm,
           java.lang.String repeatDayName,
           java.lang.String repeatRef,
           long repeatStartDate,
           long repeatEndDate,
           java.lang.String repeatEndType,
           java.lang.String repeatEndCnt,
           java.lang.String repeatLunar,
           java.lang.String parentSchCode,
           java.lang.String actionItem,
           java.lang.String note,
           java.lang.String placeCode,
           java.lang.String placeChangeMode,
           java.lang.String userCompCode,
           java.lang.String userLocale,
           java.lang.String relationKey) {
           this.editor = editor;
           this.inLocale = inLocale;
           this.schCode = schCode;
           this.title = title;
           this.schType = schType;
           this.schSubType = schSubType;
           this.place = place;
           this.startDate = startDate;
           this.endDate = endDate;
           this.allDayFlag = allDayFlag;
           this.pubFlag = pubFlag;
           this.schCompCode = schCompCode;
           this.schDeptCode = schDeptCode;
           this.commCode = commCode;
           this.commName = commName;
           this.commSchFlag = commSchFlag;
           this.repeatFlag = repeatFlag;
           this.attachCnt = attachCnt;
           this.userId = userId;
           this.userRegNo = userRegNo;
           this.userName = userName;
           this.userDeptName = userDeptName;
           this.userDeptCode = userDeptCode;
           this.changeFlag = changeFlag;
           this.creationDate = creationDate;
           this.updateDate = updateDate;
           this.organizer = organizer;
           this.supervisor = supervisor;
           this.titleColor = titleColor;
           this.titleBgColor = titleBgColor;
           this.entryId = entryId;
           this.readFrom = readFrom;
           this.readTo = readTo;
           this.repeatType = repeatType;
           this.repeatTerm = repeatTerm;
           this.repeatDayName = repeatDayName;
           this.repeatRef = repeatRef;
           this.repeatStartDate = repeatStartDate;
           this.repeatEndDate = repeatEndDate;
           this.repeatEndType = repeatEndType;
           this.repeatEndCnt = repeatEndCnt;
           this.repeatLunar = repeatLunar;
           this.parentSchCode = parentSchCode;
           this.actionItem = actionItem;
           this.note = note;
           this.placeCode = placeCode;
           this.placeChangeMode = placeChangeMode;
           this.userCompCode = userCompCode;
           this.userLocale = userLocale;
           this.relationKey = relationKey;
    }


    /**
     * Gets the editor value for this ScheduleEtyWSVO.
     * 
     * @return editor
     */
    public java.lang.String getEditor() {
        return editor;
    }


    /**
     * Sets the editor value for this ScheduleEtyWSVO.
     * 
     * @param editor
     */
    public void setEditor(java.lang.String editor) {
        this.editor = editor;
    }


    /**
     * Gets the inLocale value for this ScheduleEtyWSVO.
     * 
     * @return inLocale
     */
    public java.lang.String getInLocale() {
        return inLocale;
    }


    /**
     * Sets the inLocale value for this ScheduleEtyWSVO.
     * 
     * @param inLocale
     */
    public void setInLocale(java.lang.String inLocale) {
        this.inLocale = inLocale;
    }


    /**
     * Gets the schCode value for this ScheduleEtyWSVO.
     * 
     * @return schCode
     */
    public java.lang.String getSchCode() {
        return schCode;
    }


    /**
     * Sets the schCode value for this ScheduleEtyWSVO.
     * 
     * @param schCode
     */
    public void setSchCode(java.lang.String schCode) {
        this.schCode = schCode;
    }


    /**
     * Gets the title value for this ScheduleEtyWSVO.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ScheduleEtyWSVO.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the schType value for this ScheduleEtyWSVO.
     * 
     * @return schType
     */
    public java.lang.String getSchType() {
        return schType;
    }


    /**
     * Sets the schType value for this ScheduleEtyWSVO.
     * 
     * @param schType
     */
    public void setSchType(java.lang.String schType) {
        this.schType = schType;
    }


    /**
     * Gets the schSubType value for this ScheduleEtyWSVO.
     * 
     * @return schSubType
     */
    public java.lang.String getSchSubType() {
        return schSubType;
    }


    /**
     * Sets the schSubType value for this ScheduleEtyWSVO.
     * 
     * @param schSubType
     */
    public void setSchSubType(java.lang.String schSubType) {
        this.schSubType = schSubType;
    }


    /**
     * Gets the place value for this ScheduleEtyWSVO.
     * 
     * @return place
     */
    public java.lang.String getPlace() {
        return place;
    }


    /**
     * Sets the place value for this ScheduleEtyWSVO.
     * 
     * @param place
     */
    public void setPlace(java.lang.String place) {
        this.place = place;
    }


    /**
     * Gets the startDate value for this ScheduleEtyWSVO.
     * 
     * @return startDate
     */
    public long getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ScheduleEtyWSVO.
     * 
     * @param startDate
     */
    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ScheduleEtyWSVO.
     * 
     * @return endDate
     */
    public long getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ScheduleEtyWSVO.
     * 
     * @param endDate
     */
    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the allDayFlag value for this ScheduleEtyWSVO.
     * 
     * @return allDayFlag
     */
    public java.lang.String getAllDayFlag() {
        return allDayFlag;
    }


    /**
     * Sets the allDayFlag value for this ScheduleEtyWSVO.
     * 
     * @param allDayFlag
     */
    public void setAllDayFlag(java.lang.String allDayFlag) {
        this.allDayFlag = allDayFlag;
    }


    /**
     * Gets the pubFlag value for this ScheduleEtyWSVO.
     * 
     * @return pubFlag
     */
    public java.lang.String getPubFlag() {
        return pubFlag;
    }


    /**
     * Sets the pubFlag value for this ScheduleEtyWSVO.
     * 
     * @param pubFlag
     */
    public void setPubFlag(java.lang.String pubFlag) {
        this.pubFlag = pubFlag;
    }


    /**
     * Gets the schCompCode value for this ScheduleEtyWSVO.
     * 
     * @return schCompCode
     */
    public java.lang.String getSchCompCode() {
        return schCompCode;
    }


    /**
     * Sets the schCompCode value for this ScheduleEtyWSVO.
     * 
     * @param schCompCode
     */
    public void setSchCompCode(java.lang.String schCompCode) {
        this.schCompCode = schCompCode;
    }


    /**
     * Gets the schDeptCode value for this ScheduleEtyWSVO.
     * 
     * @return schDeptCode
     */
    public java.lang.String getSchDeptCode() {
        return schDeptCode;
    }


    /**
     * Sets the schDeptCode value for this ScheduleEtyWSVO.
     * 
     * @param schDeptCode
     */
    public void setSchDeptCode(java.lang.String schDeptCode) {
        this.schDeptCode = schDeptCode;
    }


    /**
     * Gets the commCode value for this ScheduleEtyWSVO.
     * 
     * @return commCode
     */
    public java.lang.String getCommCode() {
        return commCode;
    }


    /**
     * Sets the commCode value for this ScheduleEtyWSVO.
     * 
     * @param commCode
     */
    public void setCommCode(java.lang.String commCode) {
        this.commCode = commCode;
    }


    /**
     * Gets the commName value for this ScheduleEtyWSVO.
     * 
     * @return commName
     */
    public java.lang.String getCommName() {
        return commName;
    }


    /**
     * Sets the commName value for this ScheduleEtyWSVO.
     * 
     * @param commName
     */
    public void setCommName(java.lang.String commName) {
        this.commName = commName;
    }


    /**
     * Gets the commSchFlag value for this ScheduleEtyWSVO.
     * 
     * @return commSchFlag
     */
    public java.lang.String getCommSchFlag() {
        return commSchFlag;
    }


    /**
     * Sets the commSchFlag value for this ScheduleEtyWSVO.
     * 
     * @param commSchFlag
     */
    public void setCommSchFlag(java.lang.String commSchFlag) {
        this.commSchFlag = commSchFlag;
    }


    /**
     * Gets the repeatFlag value for this ScheduleEtyWSVO.
     * 
     * @return repeatFlag
     */
    public java.lang.String getRepeatFlag() {
        return repeatFlag;
    }


    /**
     * Sets the repeatFlag value for this ScheduleEtyWSVO.
     * 
     * @param repeatFlag
     */
    public void setRepeatFlag(java.lang.String repeatFlag) {
        this.repeatFlag = repeatFlag;
    }


    /**
     * Gets the attachCnt value for this ScheduleEtyWSVO.
     * 
     * @return attachCnt
     */
    public java.lang.String getAttachCnt() {
        return attachCnt;
    }


    /**
     * Sets the attachCnt value for this ScheduleEtyWSVO.
     * 
     * @param attachCnt
     */
    public void setAttachCnt(java.lang.String attachCnt) {
        this.attachCnt = attachCnt;
    }


    /**
     * Gets the userId value for this ScheduleEtyWSVO.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ScheduleEtyWSVO.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the userRegNo value for this ScheduleEtyWSVO.
     * 
     * @return userRegNo
     */
    public java.lang.String getUserRegNo() {
        return userRegNo;
    }


    /**
     * Sets the userRegNo value for this ScheduleEtyWSVO.
     * 
     * @param userRegNo
     */
    public void setUserRegNo(java.lang.String userRegNo) {
        this.userRegNo = userRegNo;
    }


    /**
     * Gets the userName value for this ScheduleEtyWSVO.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ScheduleEtyWSVO.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userDeptName value for this ScheduleEtyWSVO.
     * 
     * @return userDeptName
     */
    public java.lang.String getUserDeptName() {
        return userDeptName;
    }


    /**
     * Sets the userDeptName value for this ScheduleEtyWSVO.
     * 
     * @param userDeptName
     */
    public void setUserDeptName(java.lang.String userDeptName) {
        this.userDeptName = userDeptName;
    }


    /**
     * Gets the userDeptCode value for this ScheduleEtyWSVO.
     * 
     * @return userDeptCode
     */
    public java.lang.String getUserDeptCode() {
        return userDeptCode;
    }


    /**
     * Sets the userDeptCode value for this ScheduleEtyWSVO.
     * 
     * @param userDeptCode
     */
    public void setUserDeptCode(java.lang.String userDeptCode) {
        this.userDeptCode = userDeptCode;
    }


    /**
     * Gets the changeFlag value for this ScheduleEtyWSVO.
     * 
     * @return changeFlag
     */
    public java.lang.String getChangeFlag() {
        return changeFlag;
    }


    /**
     * Sets the changeFlag value for this ScheduleEtyWSVO.
     * 
     * @param changeFlag
     */
    public void setChangeFlag(java.lang.String changeFlag) {
        this.changeFlag = changeFlag;
    }


    /**
     * Gets the creationDate value for this ScheduleEtyWSVO.
     * 
     * @return creationDate
     */
    public long getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this ScheduleEtyWSVO.
     * 
     * @param creationDate
     */
    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the updateDate value for this ScheduleEtyWSVO.
     * 
     * @return updateDate
     */
    public long getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this ScheduleEtyWSVO.
     * 
     * @param updateDate
     */
    public void setUpdateDate(long updateDate) {
        this.updateDate = updateDate;
    }


    /**
     * Gets the organizer value for this ScheduleEtyWSVO.
     * 
     * @return organizer
     */
    public java.lang.String getOrganizer() {
        return organizer;
    }


    /**
     * Sets the organizer value for this ScheduleEtyWSVO.
     * 
     * @param organizer
     */
    public void setOrganizer(java.lang.String organizer) {
        this.organizer = organizer;
    }


    /**
     * Gets the supervisor value for this ScheduleEtyWSVO.
     * 
     * @return supervisor
     */
    public java.lang.String getSupervisor() {
        return supervisor;
    }


    /**
     * Sets the supervisor value for this ScheduleEtyWSVO.
     * 
     * @param supervisor
     */
    public void setSupervisor(java.lang.String supervisor) {
        this.supervisor = supervisor;
    }


    /**
     * Gets the titleColor value for this ScheduleEtyWSVO.
     * 
     * @return titleColor
     */
    public java.lang.String getTitleColor() {
        return titleColor;
    }


    /**
     * Sets the titleColor value for this ScheduleEtyWSVO.
     * 
     * @param titleColor
     */
    public void setTitleColor(java.lang.String titleColor) {
        this.titleColor = titleColor;
    }


    /**
     * Gets the titleBgColor value for this ScheduleEtyWSVO.
     * 
     * @return titleBgColor
     */
    public java.lang.String getTitleBgColor() {
        return titleBgColor;
    }


    /**
     * Sets the titleBgColor value for this ScheduleEtyWSVO.
     * 
     * @param titleBgColor
     */
    public void setTitleBgColor(java.lang.String titleBgColor) {
        this.titleBgColor = titleBgColor;
    }


    /**
     * Gets the entryId value for this ScheduleEtyWSVO.
     * 
     * @return entryId
     */
    public java.lang.String getEntryId() {
        return entryId;
    }


    /**
     * Sets the entryId value for this ScheduleEtyWSVO.
     * 
     * @param entryId
     */
    public void setEntryId(java.lang.String entryId) {
        this.entryId = entryId;
    }


    /**
     * Gets the readFrom value for this ScheduleEtyWSVO.
     * 
     * @return readFrom
     */
    public java.lang.String getReadFrom() {
        return readFrom;
    }


    /**
     * Sets the readFrom value for this ScheduleEtyWSVO.
     * 
     * @param readFrom
     */
    public void setReadFrom(java.lang.String readFrom) {
        this.readFrom = readFrom;
    }


    /**
     * Gets the readTo value for this ScheduleEtyWSVO.
     * 
     * @return readTo
     */
    public java.lang.String getReadTo() {
        return readTo;
    }


    /**
     * Sets the readTo value for this ScheduleEtyWSVO.
     * 
     * @param readTo
     */
    public void setReadTo(java.lang.String readTo) {
        this.readTo = readTo;
    }


    /**
     * Gets the repeatType value for this ScheduleEtyWSVO.
     * 
     * @return repeatType
     */
    public java.lang.String getRepeatType() {
        return repeatType;
    }


    /**
     * Sets the repeatType value for this ScheduleEtyWSVO.
     * 
     * @param repeatType
     */
    public void setRepeatType(java.lang.String repeatType) {
        this.repeatType = repeatType;
    }


    /**
     * Gets the repeatTerm value for this ScheduleEtyWSVO.
     * 
     * @return repeatTerm
     */
    public java.lang.String getRepeatTerm() {
        return repeatTerm;
    }


    /**
     * Sets the repeatTerm value for this ScheduleEtyWSVO.
     * 
     * @param repeatTerm
     */
    public void setRepeatTerm(java.lang.String repeatTerm) {
        this.repeatTerm = repeatTerm;
    }


    /**
     * Gets the repeatDayName value for this ScheduleEtyWSVO.
     * 
     * @return repeatDayName
     */
    public java.lang.String getRepeatDayName() {
        return repeatDayName;
    }


    /**
     * Sets the repeatDayName value for this ScheduleEtyWSVO.
     * 
     * @param repeatDayName
     */
    public void setRepeatDayName(java.lang.String repeatDayName) {
        this.repeatDayName = repeatDayName;
    }


    /**
     * Gets the repeatRef value for this ScheduleEtyWSVO.
     * 
     * @return repeatRef
     */
    public java.lang.String getRepeatRef() {
        return repeatRef;
    }


    /**
     * Sets the repeatRef value for this ScheduleEtyWSVO.
     * 
     * @param repeatRef
     */
    public void setRepeatRef(java.lang.String repeatRef) {
        this.repeatRef = repeatRef;
    }


    /**
     * Gets the repeatStartDate value for this ScheduleEtyWSVO.
     * 
     * @return repeatStartDate
     */
    public long getRepeatStartDate() {
        return repeatStartDate;
    }


    /**
     * Sets the repeatStartDate value for this ScheduleEtyWSVO.
     * 
     * @param repeatStartDate
     */
    public void setRepeatStartDate(long repeatStartDate) {
        this.repeatStartDate = repeatStartDate;
    }


    /**
     * Gets the repeatEndDate value for this ScheduleEtyWSVO.
     * 
     * @return repeatEndDate
     */
    public long getRepeatEndDate() {
        return repeatEndDate;
    }


    /**
     * Sets the repeatEndDate value for this ScheduleEtyWSVO.
     * 
     * @param repeatEndDate
     */
    public void setRepeatEndDate(long repeatEndDate) {
        this.repeatEndDate = repeatEndDate;
    }


    /**
     * Gets the repeatEndType value for this ScheduleEtyWSVO.
     * 
     * @return repeatEndType
     */
    public java.lang.String getRepeatEndType() {
        return repeatEndType;
    }


    /**
     * Sets the repeatEndType value for this ScheduleEtyWSVO.
     * 
     * @param repeatEndType
     */
    public void setRepeatEndType(java.lang.String repeatEndType) {
        this.repeatEndType = repeatEndType;
    }


    /**
     * Gets the repeatEndCnt value for this ScheduleEtyWSVO.
     * 
     * @return repeatEndCnt
     */
    public java.lang.String getRepeatEndCnt() {
        return repeatEndCnt;
    }


    /**
     * Sets the repeatEndCnt value for this ScheduleEtyWSVO.
     * 
     * @param repeatEndCnt
     */
    public void setRepeatEndCnt(java.lang.String repeatEndCnt) {
        this.repeatEndCnt = repeatEndCnt;
    }


    /**
     * Gets the repeatLunar value for this ScheduleEtyWSVO.
     * 
     * @return repeatLunar
     */
    public java.lang.String getRepeatLunar() {
        return repeatLunar;
    }


    /**
     * Sets the repeatLunar value for this ScheduleEtyWSVO.
     * 
     * @param repeatLunar
     */
    public void setRepeatLunar(java.lang.String repeatLunar) {
        this.repeatLunar = repeatLunar;
    }


    /**
     * Gets the parentSchCode value for this ScheduleEtyWSVO.
     * 
     * @return parentSchCode
     */
    public java.lang.String getParentSchCode() {
        return parentSchCode;
    }


    /**
     * Sets the parentSchCode value for this ScheduleEtyWSVO.
     * 
     * @param parentSchCode
     */
    public void setParentSchCode(java.lang.String parentSchCode) {
        this.parentSchCode = parentSchCode;
    }


    /**
     * Gets the actionItem value for this ScheduleEtyWSVO.
     * 
     * @return actionItem
     */
    public java.lang.String getActionItem() {
        return actionItem;
    }


    /**
     * Sets the actionItem value for this ScheduleEtyWSVO.
     * 
     * @param actionItem
     */
    public void setActionItem(java.lang.String actionItem) {
        this.actionItem = actionItem;
    }


    /**
     * Gets the note value for this ScheduleEtyWSVO.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this ScheduleEtyWSVO.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the placeCode value for this ScheduleEtyWSVO.
     * 
     * @return placeCode
     */
    public java.lang.String getPlaceCode() {
        return placeCode;
    }


    /**
     * Sets the placeCode value for this ScheduleEtyWSVO.
     * 
     * @param placeCode
     */
    public void setPlaceCode(java.lang.String placeCode) {
        this.placeCode = placeCode;
    }


    /**
     * Gets the placeChangeMode value for this ScheduleEtyWSVO.
     * 
     * @return placeChangeMode
     */
    public java.lang.String getPlaceChangeMode() {
        return placeChangeMode;
    }


    /**
     * Sets the placeChangeMode value for this ScheduleEtyWSVO.
     * 
     * @param placeChangeMode
     */
    public void setPlaceChangeMode(java.lang.String placeChangeMode) {
        this.placeChangeMode = placeChangeMode;
    }


    /**
     * Gets the userCompCode value for this ScheduleEtyWSVO.
     * 
     * @return userCompCode
     */
    public java.lang.String getUserCompCode() {
        return userCompCode;
    }


    /**
     * Sets the userCompCode value for this ScheduleEtyWSVO.
     * 
     * @param userCompCode
     */
    public void setUserCompCode(java.lang.String userCompCode) {
        this.userCompCode = userCompCode;
    }


    /**
     * Gets the userLocale value for this ScheduleEtyWSVO.
     * 
     * @return userLocale
     */
    public java.lang.String getUserLocale() {
        return userLocale;
    }


    /**
     * Sets the userLocale value for this ScheduleEtyWSVO.
     * 
     * @param userLocale
     */
    public void setUserLocale(java.lang.String userLocale) {
        this.userLocale = userLocale;
    }


    /**
     * Gets the relationKey value for this ScheduleEtyWSVO.
     * 
     * @return relationKey
     */
    public java.lang.String getRelationKey() {
        return relationKey;
    }


    /**
     * Sets the relationKey value for this ScheduleEtyWSVO.
     * 
     * @param relationKey
     */
    public void setRelationKey(java.lang.String relationKey) {
        this.relationKey = relationKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleEtyWSVO)) return false;
        ScheduleEtyWSVO other = (ScheduleEtyWSVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.editor==null && other.getEditor()==null) || 
             (this.editor!=null &&
              this.editor.equals(other.getEditor()))) &&
            ((this.inLocale==null && other.getInLocale()==null) || 
             (this.inLocale!=null &&
              this.inLocale.equals(other.getInLocale()))) &&
            ((this.schCode==null && other.getSchCode()==null) || 
             (this.schCode!=null &&
              this.schCode.equals(other.getSchCode()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.schType==null && other.getSchType()==null) || 
             (this.schType!=null &&
              this.schType.equals(other.getSchType()))) &&
            ((this.schSubType==null && other.getSchSubType()==null) || 
             (this.schSubType!=null &&
              this.schSubType.equals(other.getSchSubType()))) &&
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              this.place.equals(other.getPlace()))) &&
            this.startDate == other.getStartDate() &&
            this.endDate == other.getEndDate() &&
            ((this.allDayFlag==null && other.getAllDayFlag()==null) || 
             (this.allDayFlag!=null &&
              this.allDayFlag.equals(other.getAllDayFlag()))) &&
            ((this.pubFlag==null && other.getPubFlag()==null) || 
             (this.pubFlag!=null &&
              this.pubFlag.equals(other.getPubFlag()))) &&
            ((this.schCompCode==null && other.getSchCompCode()==null) || 
             (this.schCompCode!=null &&
              this.schCompCode.equals(other.getSchCompCode()))) &&
            ((this.schDeptCode==null && other.getSchDeptCode()==null) || 
             (this.schDeptCode!=null &&
              this.schDeptCode.equals(other.getSchDeptCode()))) &&
            ((this.commCode==null && other.getCommCode()==null) || 
             (this.commCode!=null &&
              this.commCode.equals(other.getCommCode()))) &&
            ((this.commName==null && other.getCommName()==null) || 
             (this.commName!=null &&
              this.commName.equals(other.getCommName()))) &&
            ((this.commSchFlag==null && other.getCommSchFlag()==null) || 
             (this.commSchFlag!=null &&
              this.commSchFlag.equals(other.getCommSchFlag()))) &&
            ((this.repeatFlag==null && other.getRepeatFlag()==null) || 
             (this.repeatFlag!=null &&
              this.repeatFlag.equals(other.getRepeatFlag()))) &&
            ((this.attachCnt==null && other.getAttachCnt()==null) || 
             (this.attachCnt!=null &&
              this.attachCnt.equals(other.getAttachCnt()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.userRegNo==null && other.getUserRegNo()==null) || 
             (this.userRegNo!=null &&
              this.userRegNo.equals(other.getUserRegNo()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.userDeptName==null && other.getUserDeptName()==null) || 
             (this.userDeptName!=null &&
              this.userDeptName.equals(other.getUserDeptName()))) &&
            ((this.userDeptCode==null && other.getUserDeptCode()==null) || 
             (this.userDeptCode!=null &&
              this.userDeptCode.equals(other.getUserDeptCode()))) &&
            ((this.changeFlag==null && other.getChangeFlag()==null) || 
             (this.changeFlag!=null &&
              this.changeFlag.equals(other.getChangeFlag()))) &&
            this.creationDate == other.getCreationDate() &&
            this.updateDate == other.getUpdateDate() &&
            ((this.organizer==null && other.getOrganizer()==null) || 
             (this.organizer!=null &&
              this.organizer.equals(other.getOrganizer()))) &&
            ((this.supervisor==null && other.getSupervisor()==null) || 
             (this.supervisor!=null &&
              this.supervisor.equals(other.getSupervisor()))) &&
            ((this.titleColor==null && other.getTitleColor()==null) || 
             (this.titleColor!=null &&
              this.titleColor.equals(other.getTitleColor()))) &&
            ((this.titleBgColor==null && other.getTitleBgColor()==null) || 
             (this.titleBgColor!=null &&
              this.titleBgColor.equals(other.getTitleBgColor()))) &&
            ((this.entryId==null && other.getEntryId()==null) || 
             (this.entryId!=null &&
              this.entryId.equals(other.getEntryId()))) &&
            ((this.readFrom==null && other.getReadFrom()==null) || 
             (this.readFrom!=null &&
              this.readFrom.equals(other.getReadFrom()))) &&
            ((this.readTo==null && other.getReadTo()==null) || 
             (this.readTo!=null &&
              this.readTo.equals(other.getReadTo()))) &&
            ((this.repeatType==null && other.getRepeatType()==null) || 
             (this.repeatType!=null &&
              this.repeatType.equals(other.getRepeatType()))) &&
            ((this.repeatTerm==null && other.getRepeatTerm()==null) || 
             (this.repeatTerm!=null &&
              this.repeatTerm.equals(other.getRepeatTerm()))) &&
            ((this.repeatDayName==null && other.getRepeatDayName()==null) || 
             (this.repeatDayName!=null &&
              this.repeatDayName.equals(other.getRepeatDayName()))) &&
            ((this.repeatRef==null && other.getRepeatRef()==null) || 
             (this.repeatRef!=null &&
              this.repeatRef.equals(other.getRepeatRef()))) &&
            this.repeatStartDate == other.getRepeatStartDate() &&
            this.repeatEndDate == other.getRepeatEndDate() &&
            ((this.repeatEndType==null && other.getRepeatEndType()==null) || 
             (this.repeatEndType!=null &&
              this.repeatEndType.equals(other.getRepeatEndType()))) &&
            ((this.repeatEndCnt==null && other.getRepeatEndCnt()==null) || 
             (this.repeatEndCnt!=null &&
              this.repeatEndCnt.equals(other.getRepeatEndCnt()))) &&
            ((this.repeatLunar==null && other.getRepeatLunar()==null) || 
             (this.repeatLunar!=null &&
              this.repeatLunar.equals(other.getRepeatLunar()))) &&
            ((this.parentSchCode==null && other.getParentSchCode()==null) || 
             (this.parentSchCode!=null &&
              this.parentSchCode.equals(other.getParentSchCode()))) &&
            ((this.actionItem==null && other.getActionItem()==null) || 
             (this.actionItem!=null &&
              this.actionItem.equals(other.getActionItem()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.placeCode==null && other.getPlaceCode()==null) || 
             (this.placeCode!=null &&
              this.placeCode.equals(other.getPlaceCode()))) &&
            ((this.placeChangeMode==null && other.getPlaceChangeMode()==null) || 
             (this.placeChangeMode!=null &&
              this.placeChangeMode.equals(other.getPlaceChangeMode()))) &&
            ((this.userCompCode==null && other.getUserCompCode()==null) || 
             (this.userCompCode!=null &&
              this.userCompCode.equals(other.getUserCompCode()))) &&
            ((this.userLocale==null && other.getUserLocale()==null) || 
             (this.userLocale!=null &&
              this.userLocale.equals(other.getUserLocale()))) &&
            ((this.relationKey==null && other.getRelationKey()==null) || 
             (this.relationKey!=null &&
              this.relationKey.equals(other.getRelationKey())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEditor() != null) {
            _hashCode += getEditor().hashCode();
        }
        if (getInLocale() != null) {
            _hashCode += getInLocale().hashCode();
        }
        if (getSchCode() != null) {
            _hashCode += getSchCode().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getSchType() != null) {
            _hashCode += getSchType().hashCode();
        }
        if (getSchSubType() != null) {
            _hashCode += getSchSubType().hashCode();
        }
        if (getPlace() != null) {
            _hashCode += getPlace().hashCode();
        }
        _hashCode += new Long(getStartDate()).hashCode();
        _hashCode += new Long(getEndDate()).hashCode();
        if (getAllDayFlag() != null) {
            _hashCode += getAllDayFlag().hashCode();
        }
        if (getPubFlag() != null) {
            _hashCode += getPubFlag().hashCode();
        }
        if (getSchCompCode() != null) {
            _hashCode += getSchCompCode().hashCode();
        }
        if (getSchDeptCode() != null) {
            _hashCode += getSchDeptCode().hashCode();
        }
        if (getCommCode() != null) {
            _hashCode += getCommCode().hashCode();
        }
        if (getCommName() != null) {
            _hashCode += getCommName().hashCode();
        }
        if (getCommSchFlag() != null) {
            _hashCode += getCommSchFlag().hashCode();
        }
        if (getRepeatFlag() != null) {
            _hashCode += getRepeatFlag().hashCode();
        }
        if (getAttachCnt() != null) {
            _hashCode += getAttachCnt().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUserRegNo() != null) {
            _hashCode += getUserRegNo().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserDeptName() != null) {
            _hashCode += getUserDeptName().hashCode();
        }
        if (getUserDeptCode() != null) {
            _hashCode += getUserDeptCode().hashCode();
        }
        if (getChangeFlag() != null) {
            _hashCode += getChangeFlag().hashCode();
        }
        _hashCode += new Long(getCreationDate()).hashCode();
        _hashCode += new Long(getUpdateDate()).hashCode();
        if (getOrganizer() != null) {
            _hashCode += getOrganizer().hashCode();
        }
        if (getSupervisor() != null) {
            _hashCode += getSupervisor().hashCode();
        }
        if (getTitleColor() != null) {
            _hashCode += getTitleColor().hashCode();
        }
        if (getTitleBgColor() != null) {
            _hashCode += getTitleBgColor().hashCode();
        }
        if (getEntryId() != null) {
            _hashCode += getEntryId().hashCode();
        }
        if (getReadFrom() != null) {
            _hashCode += getReadFrom().hashCode();
        }
        if (getReadTo() != null) {
            _hashCode += getReadTo().hashCode();
        }
        if (getRepeatType() != null) {
            _hashCode += getRepeatType().hashCode();
        }
        if (getRepeatTerm() != null) {
            _hashCode += getRepeatTerm().hashCode();
        }
        if (getRepeatDayName() != null) {
            _hashCode += getRepeatDayName().hashCode();
        }
        if (getRepeatRef() != null) {
            _hashCode += getRepeatRef().hashCode();
        }
        _hashCode += new Long(getRepeatStartDate()).hashCode();
        _hashCode += new Long(getRepeatEndDate()).hashCode();
        if (getRepeatEndType() != null) {
            _hashCode += getRepeatEndType().hashCode();
        }
        if (getRepeatEndCnt() != null) {
            _hashCode += getRepeatEndCnt().hashCode();
        }
        if (getRepeatLunar() != null) {
            _hashCode += getRepeatLunar().hashCode();
        }
        if (getParentSchCode() != null) {
            _hashCode += getParentSchCode().hashCode();
        }
        if (getActionItem() != null) {
            _hashCode += getActionItem().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getPlaceCode() != null) {
            _hashCode += getPlaceCode().hashCode();
        }
        if (getPlaceChangeMode() != null) {
            _hashCode += getPlaceChangeMode().hashCode();
        }
        if (getUserCompCode() != null) {
            _hashCode += getUserCompCode().hashCode();
        }
        if (getUserLocale() != null) {
            _hashCode += getUserLocale().hashCode();
        }
        if (getRelationKey() != null) {
            _hashCode += getRelationKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleEtyWSVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "ScheduleEtyWSVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inLocale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inLocale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place");
        elemField.setXmlName(new javax.xml.namespace.QName("", "place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allDayFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allDayFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schCompCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schCompCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schDeptCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schDeptCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commSchFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commSchFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeatFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachCnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachCnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRegNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userRegNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDeptName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userDeptName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDeptCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userDeptCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organizer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supervisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleColor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titleColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleBgColor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titleBgColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeatType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeatTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatDayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeatDayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeatRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeatStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeatEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatEndType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeatEndType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatEndCnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeatEndCnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatLunar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeatLunar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentSchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentSchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeChangeMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placeChangeMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCompCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCompCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLocale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLocale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
