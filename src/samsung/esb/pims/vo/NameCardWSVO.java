/**
 * NameCardWSVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package samsung.esb.pims.vo;

public class NameCardWSVO  implements java.io.Serializable {
    private java.lang.String acqflag;

    private java.lang.String annivDay;

    private java.lang.String birthDay;

    private java.lang.String birthDayLunar;

    private java.lang.String chkCareer;

    private java.lang.String companyCode;

    private java.lang.String companyFax;

    private java.lang.String companyName;

    private java.lang.Long creationTime;

    private java.lang.String deptName;

    private java.lang.String description;

    private java.lang.String email1;

    private java.lang.String email2;

    private java.lang.String entryID;

    private java.lang.String familiarity;

    private java.lang.String filenm;

    private java.lang.String firstName;

    private java.lang.String fPhone;

    private java.lang.String fullName;

    private java.lang.String groupName;

    private java.lang.String hobby;

    private java.lang.String homeAddress;

    private java.lang.String homeDetail;

    private java.lang.String homeNation;

    private java.lang.String homePage;

    private java.lang.String homePhone;

    private java.lang.String homePost;

    private samsung.esb.pims.vo.HumanNetworkWSVO[] human;

    private java.lang.String lastName;

    private java.lang.String main;

    private java.lang.String mobilePhone;

    private java.lang.Long modificationTime;

    private java.lang.String myhomePage;

    private java.lang.String ncode;

    private java.lang.String nickName;

    private java.lang.String note;

    private java.lang.String ownerCompanyCode;

    private java.lang.String ownerDeptCode;

    private java.lang.String ownerId;

    private java.lang.String ownerName;

    private java.lang.String parentNcode;

    private java.lang.String pubCompCode;

    private java.lang.String pubDeptCode;

    private java.lang.String publicFlag;

    private java.lang.String readFrom;

    private java.lang.String readTo;

    private java.lang.String relation;

    private java.lang.String service;

    private java.lang.String sex;

    private java.lang.String srchRange;

    private java.lang.String srcKey;

    private java.lang.String srcType;

    private java.lang.String title;

    private java.lang.String userDefinedField1;

    private java.lang.String userDefinedField2;

    private java.lang.String userDefinedField3;

    private java.lang.String userDefinedField4;

    private java.lang.String userDefinedFieldName1;

    private java.lang.String userDefinedFieldName2;

    private java.lang.String userDefinedFieldName3;

    private java.lang.String userDefinedFieldName4;

    private java.lang.String workAddress;

    private java.lang.String workDetail;

    private java.lang.String workNation;

    private java.lang.String workPhone;

    private java.lang.String workPost;

    private byte[] photoImg;

    private java.lang.String annivDayAlarm;

    private java.lang.String annivDayRelationSchCode;

    private java.lang.String birthDayAlarm;

    private java.lang.String birthDayRelationSchCode;

    private java.lang.String changeMf;

    private int childCount;

    private java.lang.String en_companyName;

    private java.lang.String en_deptName;

    private java.lang.String en_description;

    private java.lang.String en_firstName;

    private java.lang.String en_fullName;

    private java.lang.String en_lastName;

    private java.lang.String en_title;

    private java.lang.String orderInfo;

    private boolean sameOldAndNewAnniv;

    private boolean sameOldAndNewBirth;

    private java.lang.String syncyn;

    private samsung.esb.pims.vo.CareerWSVO[] careerVO;

    public NameCardWSVO() {
    }

    public NameCardWSVO(
           java.lang.String acqflag,
           java.lang.String annivDay,
           java.lang.String birthDay,
           java.lang.String birthDayLunar,
           java.lang.String chkCareer,
           java.lang.String companyCode,
           java.lang.String companyFax,
           java.lang.String companyName,
           java.lang.Long creationTime,
           java.lang.String deptName,
           java.lang.String description,
           java.lang.String email1,
           java.lang.String email2,
           java.lang.String entryID,
           java.lang.String familiarity,
           java.lang.String filenm,
           java.lang.String firstName,
           java.lang.String fPhone,
           java.lang.String fullName,
           java.lang.String groupName,
           java.lang.String hobby,
           java.lang.String homeAddress,
           java.lang.String homeDetail,
           java.lang.String homeNation,
           java.lang.String homePage,
           java.lang.String homePhone,
           java.lang.String homePost,
           samsung.esb.pims.vo.HumanNetworkWSVO[] human,
           java.lang.String lastName,
           java.lang.String main,
           java.lang.String mobilePhone,
           java.lang.Long modificationTime,
           java.lang.String myhomePage,
           java.lang.String ncode,
           java.lang.String nickName,
           java.lang.String note,
           java.lang.String ownerCompanyCode,
           java.lang.String ownerDeptCode,
           java.lang.String ownerId,
           java.lang.String ownerName,
           java.lang.String parentNcode,
           java.lang.String pubCompCode,
           java.lang.String pubDeptCode,
           java.lang.String publicFlag,
           java.lang.String readFrom,
           java.lang.String readTo,
           java.lang.String relation,
           java.lang.String service,
           java.lang.String sex,
           java.lang.String srchRange,
           java.lang.String srcKey,
           java.lang.String srcType,
           java.lang.String title,
           java.lang.String userDefinedField1,
           java.lang.String userDefinedField2,
           java.lang.String userDefinedField3,
           java.lang.String userDefinedField4,
           java.lang.String userDefinedFieldName1,
           java.lang.String userDefinedFieldName2,
           java.lang.String userDefinedFieldName3,
           java.lang.String userDefinedFieldName4,
           java.lang.String workAddress,
           java.lang.String workDetail,
           java.lang.String workNation,
           java.lang.String workPhone,
           java.lang.String workPost,
           byte[] photoImg,
           java.lang.String annivDayAlarm,
           java.lang.String annivDayRelationSchCode,
           java.lang.String birthDayAlarm,
           java.lang.String birthDayRelationSchCode,
           java.lang.String changeMf,
           int childCount,
           java.lang.String en_companyName,
           java.lang.String en_deptName,
           java.lang.String en_description,
           java.lang.String en_firstName,
           java.lang.String en_fullName,
           java.lang.String en_lastName,
           java.lang.String en_title,
           java.lang.String orderInfo,
           boolean sameOldAndNewAnniv,
           boolean sameOldAndNewBirth,
           java.lang.String syncyn,
           samsung.esb.pims.vo.CareerWSVO[] careerVO) {
           this.acqflag = acqflag;
           this.annivDay = annivDay;
           this.birthDay = birthDay;
           this.birthDayLunar = birthDayLunar;
           this.chkCareer = chkCareer;
           this.companyCode = companyCode;
           this.companyFax = companyFax;
           this.companyName = companyName;
           this.creationTime = creationTime;
           this.deptName = deptName;
           this.description = description;
           this.email1 = email1;
           this.email2 = email2;
           this.entryID = entryID;
           this.familiarity = familiarity;
           this.filenm = filenm;
           this.firstName = firstName;
           this.fPhone = fPhone;
           this.fullName = fullName;
           this.groupName = groupName;
           this.hobby = hobby;
           this.homeAddress = homeAddress;
           this.homeDetail = homeDetail;
           this.homeNation = homeNation;
           this.homePage = homePage;
           this.homePhone = homePhone;
           this.homePost = homePost;
           this.human = human;
           this.lastName = lastName;
           this.main = main;
           this.mobilePhone = mobilePhone;
           this.modificationTime = modificationTime;
           this.myhomePage = myhomePage;
           this.ncode = ncode;
           this.nickName = nickName;
           this.note = note;
           this.ownerCompanyCode = ownerCompanyCode;
           this.ownerDeptCode = ownerDeptCode;
           this.ownerId = ownerId;
           this.ownerName = ownerName;
           this.parentNcode = parentNcode;
           this.pubCompCode = pubCompCode;
           this.pubDeptCode = pubDeptCode;
           this.publicFlag = publicFlag;
           this.readFrom = readFrom;
           this.readTo = readTo;
           this.relation = relation;
           this.service = service;
           this.sex = sex;
           this.srchRange = srchRange;
           this.srcKey = srcKey;
           this.srcType = srcType;
           this.title = title;
           this.userDefinedField1 = userDefinedField1;
           this.userDefinedField2 = userDefinedField2;
           this.userDefinedField3 = userDefinedField3;
           this.userDefinedField4 = userDefinedField4;
           this.userDefinedFieldName1 = userDefinedFieldName1;
           this.userDefinedFieldName2 = userDefinedFieldName2;
           this.userDefinedFieldName3 = userDefinedFieldName3;
           this.userDefinedFieldName4 = userDefinedFieldName4;
           this.workAddress = workAddress;
           this.workDetail = workDetail;
           this.workNation = workNation;
           this.workPhone = workPhone;
           this.workPost = workPost;
           this.photoImg = photoImg;
           this.annivDayAlarm = annivDayAlarm;
           this.annivDayRelationSchCode = annivDayRelationSchCode;
           this.birthDayAlarm = birthDayAlarm;
           this.birthDayRelationSchCode = birthDayRelationSchCode;
           this.changeMf = changeMf;
           this.childCount = childCount;
           this.en_companyName = en_companyName;
           this.en_deptName = en_deptName;
           this.en_description = en_description;
           this.en_firstName = en_firstName;
           this.en_fullName = en_fullName;
           this.en_lastName = en_lastName;
           this.en_title = en_title;
           this.orderInfo = orderInfo;
           this.sameOldAndNewAnniv = sameOldAndNewAnniv;
           this.sameOldAndNewBirth = sameOldAndNewBirth;
           this.syncyn = syncyn;
           this.careerVO = careerVO;
    }


    /**
     * Gets the acqflag value for this NameCardWSVO.
     * 
     * @return acqflag
     */
    public java.lang.String getAcqflag() {
        return acqflag;
    }


    /**
     * Sets the acqflag value for this NameCardWSVO.
     * 
     * @param acqflag
     */
    public void setAcqflag(java.lang.String acqflag) {
        this.acqflag = acqflag;
    }


    /**
     * Gets the annivDay value for this NameCardWSVO.
     * 
     * @return annivDay
     */
    public java.lang.String getAnnivDay() {
        return annivDay;
    }


    /**
     * Sets the annivDay value for this NameCardWSVO.
     * 
     * @param annivDay
     */
    public void setAnnivDay(java.lang.String annivDay) {
        this.annivDay = annivDay;
    }


    /**
     * Gets the birthDay value for this NameCardWSVO.
     * 
     * @return birthDay
     */
    public java.lang.String getBirthDay() {
        return birthDay;
    }


    /**
     * Sets the birthDay value for this NameCardWSVO.
     * 
     * @param birthDay
     */
    public void setBirthDay(java.lang.String birthDay) {
        this.birthDay = birthDay;
    }


    /**
     * Gets the birthDayLunar value for this NameCardWSVO.
     * 
     * @return birthDayLunar
     */
    public java.lang.String getBirthDayLunar() {
        return birthDayLunar;
    }


    /**
     * Sets the birthDayLunar value for this NameCardWSVO.
     * 
     * @param birthDayLunar
     */
    public void setBirthDayLunar(java.lang.String birthDayLunar) {
        this.birthDayLunar = birthDayLunar;
    }


    /**
     * Gets the chkCareer value for this NameCardWSVO.
     * 
     * @return chkCareer
     */
    public java.lang.String getChkCareer() {
        return chkCareer;
    }


    /**
     * Sets the chkCareer value for this NameCardWSVO.
     * 
     * @param chkCareer
     */
    public void setChkCareer(java.lang.String chkCareer) {
        this.chkCareer = chkCareer;
    }


    /**
     * Gets the companyCode value for this NameCardWSVO.
     * 
     * @return companyCode
     */
    public java.lang.String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this NameCardWSVO.
     * 
     * @param companyCode
     */
    public void setCompanyCode(java.lang.String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * Gets the companyFax value for this NameCardWSVO.
     * 
     * @return companyFax
     */
    public java.lang.String getCompanyFax() {
        return companyFax;
    }


    /**
     * Sets the companyFax value for this NameCardWSVO.
     * 
     * @param companyFax
     */
    public void setCompanyFax(java.lang.String companyFax) {
        this.companyFax = companyFax;
    }


    /**
     * Gets the companyName value for this NameCardWSVO.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this NameCardWSVO.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the creationTime value for this NameCardWSVO.
     * 
     * @return creationTime
     */
    public java.lang.Long getCreationTime() {
        return creationTime;
    }


    /**
     * Sets the creationTime value for this NameCardWSVO.
     * 
     * @param creationTime
     */
    public void setCreationTime(java.lang.Long creationTime) {
        this.creationTime = creationTime;
    }


    /**
     * Gets the deptName value for this NameCardWSVO.
     * 
     * @return deptName
     */
    public java.lang.String getDeptName() {
        return deptName;
    }


    /**
     * Sets the deptName value for this NameCardWSVO.
     * 
     * @param deptName
     */
    public void setDeptName(java.lang.String deptName) {
        this.deptName = deptName;
    }


    /**
     * Gets the description value for this NameCardWSVO.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this NameCardWSVO.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the email1 value for this NameCardWSVO.
     * 
     * @return email1
     */
    public java.lang.String getEmail1() {
        return email1;
    }


    /**
     * Sets the email1 value for this NameCardWSVO.
     * 
     * @param email1
     */
    public void setEmail1(java.lang.String email1) {
        this.email1 = email1;
    }


    /**
     * Gets the email2 value for this NameCardWSVO.
     * 
     * @return email2
     */
    public java.lang.String getEmail2() {
        return email2;
    }


    /**
     * Sets the email2 value for this NameCardWSVO.
     * 
     * @param email2
     */
    public void setEmail2(java.lang.String email2) {
        this.email2 = email2;
    }


    /**
     * Gets the entryID value for this NameCardWSVO.
     * 
     * @return entryID
     */
    public java.lang.String getEntryID() {
        return entryID;
    }


    /**
     * Sets the entryID value for this NameCardWSVO.
     * 
     * @param entryID
     */
    public void setEntryID(java.lang.String entryID) {
        this.entryID = entryID;
    }


    /**
     * Gets the familiarity value for this NameCardWSVO.
     * 
     * @return familiarity
     */
    public java.lang.String getFamiliarity() {
        return familiarity;
    }


    /**
     * Sets the familiarity value for this NameCardWSVO.
     * 
     * @param familiarity
     */
    public void setFamiliarity(java.lang.String familiarity) {
        this.familiarity = familiarity;
    }


    /**
     * Gets the filenm value for this NameCardWSVO.
     * 
     * @return filenm
     */
    public java.lang.String getFilenm() {
        return filenm;
    }


    /**
     * Sets the filenm value for this NameCardWSVO.
     * 
     * @param filenm
     */
    public void setFilenm(java.lang.String filenm) {
        this.filenm = filenm;
    }


    /**
     * Gets the firstName value for this NameCardWSVO.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this NameCardWSVO.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the fPhone value for this NameCardWSVO.
     * 
     * @return fPhone
     */
    public java.lang.String getFPhone() {
        return fPhone;
    }


    /**
     * Sets the fPhone value for this NameCardWSVO.
     * 
     * @param fPhone
     */
    public void setFPhone(java.lang.String fPhone) {
        this.fPhone = fPhone;
    }


    /**
     * Gets the fullName value for this NameCardWSVO.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this NameCardWSVO.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the groupName value for this NameCardWSVO.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this NameCardWSVO.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the hobby value for this NameCardWSVO.
     * 
     * @return hobby
     */
    public java.lang.String getHobby() {
        return hobby;
    }


    /**
     * Sets the hobby value for this NameCardWSVO.
     * 
     * @param hobby
     */
    public void setHobby(java.lang.String hobby) {
        this.hobby = hobby;
    }


    /**
     * Gets the homeAddress value for this NameCardWSVO.
     * 
     * @return homeAddress
     */
    public java.lang.String getHomeAddress() {
        return homeAddress;
    }


    /**
     * Sets the homeAddress value for this NameCardWSVO.
     * 
     * @param homeAddress
     */
    public void setHomeAddress(java.lang.String homeAddress) {
        this.homeAddress = homeAddress;
    }


    /**
     * Gets the homeDetail value for this NameCardWSVO.
     * 
     * @return homeDetail
     */
    public java.lang.String getHomeDetail() {
        return homeDetail;
    }


    /**
     * Sets the homeDetail value for this NameCardWSVO.
     * 
     * @param homeDetail
     */
    public void setHomeDetail(java.lang.String homeDetail) {
        this.homeDetail = homeDetail;
    }


    /**
     * Gets the homeNation value for this NameCardWSVO.
     * 
     * @return homeNation
     */
    public java.lang.String getHomeNation() {
        return homeNation;
    }


    /**
     * Sets the homeNation value for this NameCardWSVO.
     * 
     * @param homeNation
     */
    public void setHomeNation(java.lang.String homeNation) {
        this.homeNation = homeNation;
    }


    /**
     * Gets the homePage value for this NameCardWSVO.
     * 
     * @return homePage
     */
    public java.lang.String getHomePage() {
        return homePage;
    }


    /**
     * Sets the homePage value for this NameCardWSVO.
     * 
     * @param homePage
     */
    public void setHomePage(java.lang.String homePage) {
        this.homePage = homePage;
    }


    /**
     * Gets the homePhone value for this NameCardWSVO.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this NameCardWSVO.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the homePost value for this NameCardWSVO.
     * 
     * @return homePost
     */
    public java.lang.String getHomePost() {
        return homePost;
    }


    /**
     * Sets the homePost value for this NameCardWSVO.
     * 
     * @param homePost
     */
    public void setHomePost(java.lang.String homePost) {
        this.homePost = homePost;
    }


    /**
     * Gets the human value for this NameCardWSVO.
     * 
     * @return human
     */
    public samsung.esb.pims.vo.HumanNetworkWSVO[] getHuman() {
        return human;
    }


    /**
     * Sets the human value for this NameCardWSVO.
     * 
     * @param human
     */
    public void setHuman(samsung.esb.pims.vo.HumanNetworkWSVO[] human) {
        this.human = human;
    }

    public samsung.esb.pims.vo.HumanNetworkWSVO getHuman(int i) {
        return this.human[i];
    }

    public void setHuman(int i, samsung.esb.pims.vo.HumanNetworkWSVO _value) {
        this.human[i] = _value;
    }


    /**
     * Gets the lastName value for this NameCardWSVO.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this NameCardWSVO.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the main value for this NameCardWSVO.
     * 
     * @return main
     */
    public java.lang.String getMain() {
        return main;
    }


    /**
     * Sets the main value for this NameCardWSVO.
     * 
     * @param main
     */
    public void setMain(java.lang.String main) {
        this.main = main;
    }


    /**
     * Gets the mobilePhone value for this NameCardWSVO.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this NameCardWSVO.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the modificationTime value for this NameCardWSVO.
     * 
     * @return modificationTime
     */
    public java.lang.Long getModificationTime() {
        return modificationTime;
    }


    /**
     * Sets the modificationTime value for this NameCardWSVO.
     * 
     * @param modificationTime
     */
    public void setModificationTime(java.lang.Long modificationTime) {
        this.modificationTime = modificationTime;
    }


    /**
     * Gets the myhomePage value for this NameCardWSVO.
     * 
     * @return myhomePage
     */
    public java.lang.String getMyhomePage() {
        return myhomePage;
    }


    /**
     * Sets the myhomePage value for this NameCardWSVO.
     * 
     * @param myhomePage
     */
    public void setMyhomePage(java.lang.String myhomePage) {
        this.myhomePage = myhomePage;
    }


    /**
     * Gets the ncode value for this NameCardWSVO.
     * 
     * @return ncode
     */
    public java.lang.String getNcode() {
        return ncode;
    }


    /**
     * Sets the ncode value for this NameCardWSVO.
     * 
     * @param ncode
     */
    public void setNcode(java.lang.String ncode) {
        this.ncode = ncode;
    }


    /**
     * Gets the nickName value for this NameCardWSVO.
     * 
     * @return nickName
     */
    public java.lang.String getNickName() {
        return nickName;
    }


    /**
     * Sets the nickName value for this NameCardWSVO.
     * 
     * @param nickName
     */
    public void setNickName(java.lang.String nickName) {
        this.nickName = nickName;
    }


    /**
     * Gets the note value for this NameCardWSVO.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this NameCardWSVO.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the ownerCompanyCode value for this NameCardWSVO.
     * 
     * @return ownerCompanyCode
     */
    public java.lang.String getOwnerCompanyCode() {
        return ownerCompanyCode;
    }


    /**
     * Sets the ownerCompanyCode value for this NameCardWSVO.
     * 
     * @param ownerCompanyCode
     */
    public void setOwnerCompanyCode(java.lang.String ownerCompanyCode) {
        this.ownerCompanyCode = ownerCompanyCode;
    }


    /**
     * Gets the ownerDeptCode value for this NameCardWSVO.
     * 
     * @return ownerDeptCode
     */
    public java.lang.String getOwnerDeptCode() {
        return ownerDeptCode;
    }


    /**
     * Sets the ownerDeptCode value for this NameCardWSVO.
     * 
     * @param ownerDeptCode
     */
    public void setOwnerDeptCode(java.lang.String ownerDeptCode) {
        this.ownerDeptCode = ownerDeptCode;
    }


    /**
     * Gets the ownerId value for this NameCardWSVO.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this NameCardWSVO.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the ownerName value for this NameCardWSVO.
     * 
     * @return ownerName
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this NameCardWSVO.
     * 
     * @param ownerName
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the parentNcode value for this NameCardWSVO.
     * 
     * @return parentNcode
     */
    public java.lang.String getParentNcode() {
        return parentNcode;
    }


    /**
     * Sets the parentNcode value for this NameCardWSVO.
     * 
     * @param parentNcode
     */
    public void setParentNcode(java.lang.String parentNcode) {
        this.parentNcode = parentNcode;
    }


    /**
     * Gets the pubCompCode value for this NameCardWSVO.
     * 
     * @return pubCompCode
     */
    public java.lang.String getPubCompCode() {
        return pubCompCode;
    }


    /**
     * Sets the pubCompCode value for this NameCardWSVO.
     * 
     * @param pubCompCode
     */
    public void setPubCompCode(java.lang.String pubCompCode) {
        this.pubCompCode = pubCompCode;
    }


    /**
     * Gets the pubDeptCode value for this NameCardWSVO.
     * 
     * @return pubDeptCode
     */
    public java.lang.String getPubDeptCode() {
        return pubDeptCode;
    }


    /**
     * Sets the pubDeptCode value for this NameCardWSVO.
     * 
     * @param pubDeptCode
     */
    public void setPubDeptCode(java.lang.String pubDeptCode) {
        this.pubDeptCode = pubDeptCode;
    }


    /**
     * Gets the publicFlag value for this NameCardWSVO.
     * 
     * @return publicFlag
     */
    public java.lang.String getPublicFlag() {
        return publicFlag;
    }


    /**
     * Sets the publicFlag value for this NameCardWSVO.
     * 
     * @param publicFlag
     */
    public void setPublicFlag(java.lang.String publicFlag) {
        this.publicFlag = publicFlag;
    }


    /**
     * Gets the readFrom value for this NameCardWSVO.
     * 
     * @return readFrom
     */
    public java.lang.String getReadFrom() {
        return readFrom;
    }


    /**
     * Sets the readFrom value for this NameCardWSVO.
     * 
     * @param readFrom
     */
    public void setReadFrom(java.lang.String readFrom) {
        this.readFrom = readFrom;
    }


    /**
     * Gets the readTo value for this NameCardWSVO.
     * 
     * @return readTo
     */
    public java.lang.String getReadTo() {
        return readTo;
    }


    /**
     * Sets the readTo value for this NameCardWSVO.
     * 
     * @param readTo
     */
    public void setReadTo(java.lang.String readTo) {
        this.readTo = readTo;
    }


    /**
     * Gets the relation value for this NameCardWSVO.
     * 
     * @return relation
     */
    public java.lang.String getRelation() {
        return relation;
    }


    /**
     * Sets the relation value for this NameCardWSVO.
     * 
     * @param relation
     */
    public void setRelation(java.lang.String relation) {
        this.relation = relation;
    }


    /**
     * Gets the service value for this NameCardWSVO.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this NameCardWSVO.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }


    /**
     * Gets the sex value for this NameCardWSVO.
     * 
     * @return sex
     */
    public java.lang.String getSex() {
        return sex;
    }


    /**
     * Sets the sex value for this NameCardWSVO.
     * 
     * @param sex
     */
    public void setSex(java.lang.String sex) {
        this.sex = sex;
    }


    /**
     * Gets the srchRange value for this NameCardWSVO.
     * 
     * @return srchRange
     */
    public java.lang.String getSrchRange() {
        return srchRange;
    }


    /**
     * Sets the srchRange value for this NameCardWSVO.
     * 
     * @param srchRange
     */
    public void setSrchRange(java.lang.String srchRange) {
        this.srchRange = srchRange;
    }


    /**
     * Gets the srcKey value for this NameCardWSVO.
     * 
     * @return srcKey
     */
    public java.lang.String getSrcKey() {
        return srcKey;
    }


    /**
     * Sets the srcKey value for this NameCardWSVO.
     * 
     * @param srcKey
     */
    public void setSrcKey(java.lang.String srcKey) {
        this.srcKey = srcKey;
    }


    /**
     * Gets the srcType value for this NameCardWSVO.
     * 
     * @return srcType
     */
    public java.lang.String getSrcType() {
        return srcType;
    }


    /**
     * Sets the srcType value for this NameCardWSVO.
     * 
     * @param srcType
     */
    public void setSrcType(java.lang.String srcType) {
        this.srcType = srcType;
    }


    /**
     * Gets the title value for this NameCardWSVO.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this NameCardWSVO.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the userDefinedField1 value for this NameCardWSVO.
     * 
     * @return userDefinedField1
     */
    public java.lang.String getUserDefinedField1() {
        return userDefinedField1;
    }


    /**
     * Sets the userDefinedField1 value for this NameCardWSVO.
     * 
     * @param userDefinedField1
     */
    public void setUserDefinedField1(java.lang.String userDefinedField1) {
        this.userDefinedField1 = userDefinedField1;
    }


    /**
     * Gets the userDefinedField2 value for this NameCardWSVO.
     * 
     * @return userDefinedField2
     */
    public java.lang.String getUserDefinedField2() {
        return userDefinedField2;
    }


    /**
     * Sets the userDefinedField2 value for this NameCardWSVO.
     * 
     * @param userDefinedField2
     */
    public void setUserDefinedField2(java.lang.String userDefinedField2) {
        this.userDefinedField2 = userDefinedField2;
    }


    /**
     * Gets the userDefinedField3 value for this NameCardWSVO.
     * 
     * @return userDefinedField3
     */
    public java.lang.String getUserDefinedField3() {
        return userDefinedField3;
    }


    /**
     * Sets the userDefinedField3 value for this NameCardWSVO.
     * 
     * @param userDefinedField3
     */
    public void setUserDefinedField3(java.lang.String userDefinedField3) {
        this.userDefinedField3 = userDefinedField3;
    }


    /**
     * Gets the userDefinedField4 value for this NameCardWSVO.
     * 
     * @return userDefinedField4
     */
    public java.lang.String getUserDefinedField4() {
        return userDefinedField4;
    }


    /**
     * Sets the userDefinedField4 value for this NameCardWSVO.
     * 
     * @param userDefinedField4
     */
    public void setUserDefinedField4(java.lang.String userDefinedField4) {
        this.userDefinedField4 = userDefinedField4;
    }


    /**
     * Gets the userDefinedFieldName1 value for this NameCardWSVO.
     * 
     * @return userDefinedFieldName1
     */
    public java.lang.String getUserDefinedFieldName1() {
        return userDefinedFieldName1;
    }


    /**
     * Sets the userDefinedFieldName1 value for this NameCardWSVO.
     * 
     * @param userDefinedFieldName1
     */
    public void setUserDefinedFieldName1(java.lang.String userDefinedFieldName1) {
        this.userDefinedFieldName1 = userDefinedFieldName1;
    }


    /**
     * Gets the userDefinedFieldName2 value for this NameCardWSVO.
     * 
     * @return userDefinedFieldName2
     */
    public java.lang.String getUserDefinedFieldName2() {
        return userDefinedFieldName2;
    }


    /**
     * Sets the userDefinedFieldName2 value for this NameCardWSVO.
     * 
     * @param userDefinedFieldName2
     */
    public void setUserDefinedFieldName2(java.lang.String userDefinedFieldName2) {
        this.userDefinedFieldName2 = userDefinedFieldName2;
    }


    /**
     * Gets the userDefinedFieldName3 value for this NameCardWSVO.
     * 
     * @return userDefinedFieldName3
     */
    public java.lang.String getUserDefinedFieldName3() {
        return userDefinedFieldName3;
    }


    /**
     * Sets the userDefinedFieldName3 value for this NameCardWSVO.
     * 
     * @param userDefinedFieldName3
     */
    public void setUserDefinedFieldName3(java.lang.String userDefinedFieldName3) {
        this.userDefinedFieldName3 = userDefinedFieldName3;
    }


    /**
     * Gets the userDefinedFieldName4 value for this NameCardWSVO.
     * 
     * @return userDefinedFieldName4
     */
    public java.lang.String getUserDefinedFieldName4() {
        return userDefinedFieldName4;
    }


    /**
     * Sets the userDefinedFieldName4 value for this NameCardWSVO.
     * 
     * @param userDefinedFieldName4
     */
    public void setUserDefinedFieldName4(java.lang.String userDefinedFieldName4) {
        this.userDefinedFieldName4 = userDefinedFieldName4;
    }


    /**
     * Gets the workAddress value for this NameCardWSVO.
     * 
     * @return workAddress
     */
    public java.lang.String getWorkAddress() {
        return workAddress;
    }


    /**
     * Sets the workAddress value for this NameCardWSVO.
     * 
     * @param workAddress
     */
    public void setWorkAddress(java.lang.String workAddress) {
        this.workAddress = workAddress;
    }


    /**
     * Gets the workDetail value for this NameCardWSVO.
     * 
     * @return workDetail
     */
    public java.lang.String getWorkDetail() {
        return workDetail;
    }


    /**
     * Sets the workDetail value for this NameCardWSVO.
     * 
     * @param workDetail
     */
    public void setWorkDetail(java.lang.String workDetail) {
        this.workDetail = workDetail;
    }


    /**
     * Gets the workNation value for this NameCardWSVO.
     * 
     * @return workNation
     */
    public java.lang.String getWorkNation() {
        return workNation;
    }


    /**
     * Sets the workNation value for this NameCardWSVO.
     * 
     * @param workNation
     */
    public void setWorkNation(java.lang.String workNation) {
        this.workNation = workNation;
    }


    /**
     * Gets the workPhone value for this NameCardWSVO.
     * 
     * @return workPhone
     */
    public java.lang.String getWorkPhone() {
        return workPhone;
    }


    /**
     * Sets the workPhone value for this NameCardWSVO.
     * 
     * @param workPhone
     */
    public void setWorkPhone(java.lang.String workPhone) {
        this.workPhone = workPhone;
    }


    /**
     * Gets the workPost value for this NameCardWSVO.
     * 
     * @return workPost
     */
    public java.lang.String getWorkPost() {
        return workPost;
    }


    /**
     * Sets the workPost value for this NameCardWSVO.
     * 
     * @param workPost
     */
    public void setWorkPost(java.lang.String workPost) {
        this.workPost = workPost;
    }


    /**
     * Gets the photoImg value for this NameCardWSVO.
     * 
     * @return photoImg
     */
    public byte[] getPhotoImg() {
        return photoImg;
    }


    /**
     * Sets the photoImg value for this NameCardWSVO.
     * 
     * @param photoImg
     */
    public void setPhotoImg(byte[] photoImg) {
        this.photoImg = photoImg;
    }


    /**
     * Gets the annivDayAlarm value for this NameCardWSVO.
     * 
     * @return annivDayAlarm
     */
    public java.lang.String getAnnivDayAlarm() {
        return annivDayAlarm;
    }


    /**
     * Sets the annivDayAlarm value for this NameCardWSVO.
     * 
     * @param annivDayAlarm
     */
    public void setAnnivDayAlarm(java.lang.String annivDayAlarm) {
        this.annivDayAlarm = annivDayAlarm;
    }


    /**
     * Gets the annivDayRelationSchCode value for this NameCardWSVO.
     * 
     * @return annivDayRelationSchCode
     */
    public java.lang.String getAnnivDayRelationSchCode() {
        return annivDayRelationSchCode;
    }


    /**
     * Sets the annivDayRelationSchCode value for this NameCardWSVO.
     * 
     * @param annivDayRelationSchCode
     */
    public void setAnnivDayRelationSchCode(java.lang.String annivDayRelationSchCode) {
        this.annivDayRelationSchCode = annivDayRelationSchCode;
    }


    /**
     * Gets the birthDayAlarm value for this NameCardWSVO.
     * 
     * @return birthDayAlarm
     */
    public java.lang.String getBirthDayAlarm() {
        return birthDayAlarm;
    }


    /**
     * Sets the birthDayAlarm value for this NameCardWSVO.
     * 
     * @param birthDayAlarm
     */
    public void setBirthDayAlarm(java.lang.String birthDayAlarm) {
        this.birthDayAlarm = birthDayAlarm;
    }


    /**
     * Gets the birthDayRelationSchCode value for this NameCardWSVO.
     * 
     * @return birthDayRelationSchCode
     */
    public java.lang.String getBirthDayRelationSchCode() {
        return birthDayRelationSchCode;
    }


    /**
     * Sets the birthDayRelationSchCode value for this NameCardWSVO.
     * 
     * @param birthDayRelationSchCode
     */
    public void setBirthDayRelationSchCode(java.lang.String birthDayRelationSchCode) {
        this.birthDayRelationSchCode = birthDayRelationSchCode;
    }


    /**
     * Gets the changeMf value for this NameCardWSVO.
     * 
     * @return changeMf
     */
    public java.lang.String getChangeMf() {
        return changeMf;
    }


    /**
     * Sets the changeMf value for this NameCardWSVO.
     * 
     * @param changeMf
     */
    public void setChangeMf(java.lang.String changeMf) {
        this.changeMf = changeMf;
    }


    /**
     * Gets the childCount value for this NameCardWSVO.
     * 
     * @return childCount
     */
    public int getChildCount() {
        return childCount;
    }


    /**
     * Sets the childCount value for this NameCardWSVO.
     * 
     * @param childCount
     */
    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }


    /**
     * Gets the en_companyName value for this NameCardWSVO.
     * 
     * @return en_companyName
     */
    public java.lang.String getEn_companyName() {
        return en_companyName;
    }


    /**
     * Sets the en_companyName value for this NameCardWSVO.
     * 
     * @param en_companyName
     */
    public void setEn_companyName(java.lang.String en_companyName) {
        this.en_companyName = en_companyName;
    }


    /**
     * Gets the en_deptName value for this NameCardWSVO.
     * 
     * @return en_deptName
     */
    public java.lang.String getEn_deptName() {
        return en_deptName;
    }


    /**
     * Sets the en_deptName value for this NameCardWSVO.
     * 
     * @param en_deptName
     */
    public void setEn_deptName(java.lang.String en_deptName) {
        this.en_deptName = en_deptName;
    }


    /**
     * Gets the en_description value for this NameCardWSVO.
     * 
     * @return en_description
     */
    public java.lang.String getEn_description() {
        return en_description;
    }


    /**
     * Sets the en_description value for this NameCardWSVO.
     * 
     * @param en_description
     */
    public void setEn_description(java.lang.String en_description) {
        this.en_description = en_description;
    }


    /**
     * Gets the en_firstName value for this NameCardWSVO.
     * 
     * @return en_firstName
     */
    public java.lang.String getEn_firstName() {
        return en_firstName;
    }


    /**
     * Sets the en_firstName value for this NameCardWSVO.
     * 
     * @param en_firstName
     */
    public void setEn_firstName(java.lang.String en_firstName) {
        this.en_firstName = en_firstName;
    }


    /**
     * Gets the en_fullName value for this NameCardWSVO.
     * 
     * @return en_fullName
     */
    public java.lang.String getEn_fullName() {
        return en_fullName;
    }


    /**
     * Sets the en_fullName value for this NameCardWSVO.
     * 
     * @param en_fullName
     */
    public void setEn_fullName(java.lang.String en_fullName) {
        this.en_fullName = en_fullName;
    }


    /**
     * Gets the en_lastName value for this NameCardWSVO.
     * 
     * @return en_lastName
     */
    public java.lang.String getEn_lastName() {
        return en_lastName;
    }


    /**
     * Sets the en_lastName value for this NameCardWSVO.
     * 
     * @param en_lastName
     */
    public void setEn_lastName(java.lang.String en_lastName) {
        this.en_lastName = en_lastName;
    }


    /**
     * Gets the en_title value for this NameCardWSVO.
     * 
     * @return en_title
     */
    public java.lang.String getEn_title() {
        return en_title;
    }


    /**
     * Sets the en_title value for this NameCardWSVO.
     * 
     * @param en_title
     */
    public void setEn_title(java.lang.String en_title) {
        this.en_title = en_title;
    }


    /**
     * Gets the orderInfo value for this NameCardWSVO.
     * 
     * @return orderInfo
     */
    public java.lang.String getOrderInfo() {
        return orderInfo;
    }


    /**
     * Sets the orderInfo value for this NameCardWSVO.
     * 
     * @param orderInfo
     */
    public void setOrderInfo(java.lang.String orderInfo) {
        this.orderInfo = orderInfo;
    }


    /**
     * Gets the sameOldAndNewAnniv value for this NameCardWSVO.
     * 
     * @return sameOldAndNewAnniv
     */
    public boolean isSameOldAndNewAnniv() {
        return sameOldAndNewAnniv;
    }


    /**
     * Sets the sameOldAndNewAnniv value for this NameCardWSVO.
     * 
     * @param sameOldAndNewAnniv
     */
    public void setSameOldAndNewAnniv(boolean sameOldAndNewAnniv) {
        this.sameOldAndNewAnniv = sameOldAndNewAnniv;
    }


    /**
     * Gets the sameOldAndNewBirth value for this NameCardWSVO.
     * 
     * @return sameOldAndNewBirth
     */
    public boolean isSameOldAndNewBirth() {
        return sameOldAndNewBirth;
    }


    /**
     * Sets the sameOldAndNewBirth value for this NameCardWSVO.
     * 
     * @param sameOldAndNewBirth
     */
    public void setSameOldAndNewBirth(boolean sameOldAndNewBirth) {
        this.sameOldAndNewBirth = sameOldAndNewBirth;
    }


    /**
     * Gets the syncyn value for this NameCardWSVO.
     * 
     * @return syncyn
     */
    public java.lang.String getSyncyn() {
        return syncyn;
    }


    /**
     * Sets the syncyn value for this NameCardWSVO.
     * 
     * @param syncyn
     */
    public void setSyncyn(java.lang.String syncyn) {
        this.syncyn = syncyn;
    }


    /**
     * Gets the careerVO value for this NameCardWSVO.
     * 
     * @return careerVO
     */
    public samsung.esb.pims.vo.CareerWSVO[] getCareerVO() {
        return careerVO;
    }


    /**
     * Sets the careerVO value for this NameCardWSVO.
     * 
     * @param careerVO
     */
    public void setCareerVO(samsung.esb.pims.vo.CareerWSVO[] careerVO) {
        this.careerVO = careerVO;
    }

    public samsung.esb.pims.vo.CareerWSVO getCareerVO(int i) {
        return this.careerVO[i];
    }

    public void setCareerVO(int i, samsung.esb.pims.vo.CareerWSVO _value) {
        this.careerVO[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameCardWSVO)) return false;
        NameCardWSVO other = (NameCardWSVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acqflag==null && other.getAcqflag()==null) || 
             (this.acqflag!=null &&
              this.acqflag.equals(other.getAcqflag()))) &&
            ((this.annivDay==null && other.getAnnivDay()==null) || 
             (this.annivDay!=null &&
              this.annivDay.equals(other.getAnnivDay()))) &&
            ((this.birthDay==null && other.getBirthDay()==null) || 
             (this.birthDay!=null &&
              this.birthDay.equals(other.getBirthDay()))) &&
            ((this.birthDayLunar==null && other.getBirthDayLunar()==null) || 
             (this.birthDayLunar!=null &&
              this.birthDayLunar.equals(other.getBirthDayLunar()))) &&
            ((this.chkCareer==null && other.getChkCareer()==null) || 
             (this.chkCareer!=null &&
              this.chkCareer.equals(other.getChkCareer()))) &&
            ((this.companyCode==null && other.getCompanyCode()==null) || 
             (this.companyCode!=null &&
              this.companyCode.equals(other.getCompanyCode()))) &&
            ((this.companyFax==null && other.getCompanyFax()==null) || 
             (this.companyFax!=null &&
              this.companyFax.equals(other.getCompanyFax()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.creationTime==null && other.getCreationTime()==null) || 
             (this.creationTime!=null &&
              this.creationTime.equals(other.getCreationTime()))) &&
            ((this.deptName==null && other.getDeptName()==null) || 
             (this.deptName!=null &&
              this.deptName.equals(other.getDeptName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.email1==null && other.getEmail1()==null) || 
             (this.email1!=null &&
              this.email1.equals(other.getEmail1()))) &&
            ((this.email2==null && other.getEmail2()==null) || 
             (this.email2!=null &&
              this.email2.equals(other.getEmail2()))) &&
            ((this.entryID==null && other.getEntryID()==null) || 
             (this.entryID!=null &&
              this.entryID.equals(other.getEntryID()))) &&
            ((this.familiarity==null && other.getFamiliarity()==null) || 
             (this.familiarity!=null &&
              this.familiarity.equals(other.getFamiliarity()))) &&
            ((this.filenm==null && other.getFilenm()==null) || 
             (this.filenm!=null &&
              this.filenm.equals(other.getFilenm()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.fPhone==null && other.getFPhone()==null) || 
             (this.fPhone!=null &&
              this.fPhone.equals(other.getFPhone()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.hobby==null && other.getHobby()==null) || 
             (this.hobby!=null &&
              this.hobby.equals(other.getHobby()))) &&
            ((this.homeAddress==null && other.getHomeAddress()==null) || 
             (this.homeAddress!=null &&
              this.homeAddress.equals(other.getHomeAddress()))) &&
            ((this.homeDetail==null && other.getHomeDetail()==null) || 
             (this.homeDetail!=null &&
              this.homeDetail.equals(other.getHomeDetail()))) &&
            ((this.homeNation==null && other.getHomeNation()==null) || 
             (this.homeNation!=null &&
              this.homeNation.equals(other.getHomeNation()))) &&
            ((this.homePage==null && other.getHomePage()==null) || 
             (this.homePage!=null &&
              this.homePage.equals(other.getHomePage()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.homePost==null && other.getHomePost()==null) || 
             (this.homePost!=null &&
              this.homePost.equals(other.getHomePost()))) &&
            ((this.human==null && other.getHuman()==null) || 
             (this.human!=null &&
              java.util.Arrays.equals(this.human, other.getHuman()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.main==null && other.getMain()==null) || 
             (this.main!=null &&
              this.main.equals(other.getMain()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.modificationTime==null && other.getModificationTime()==null) || 
             (this.modificationTime!=null &&
              this.modificationTime.equals(other.getModificationTime()))) &&
            ((this.myhomePage==null && other.getMyhomePage()==null) || 
             (this.myhomePage!=null &&
              this.myhomePage.equals(other.getMyhomePage()))) &&
            ((this.ncode==null && other.getNcode()==null) || 
             (this.ncode!=null &&
              this.ncode.equals(other.getNcode()))) &&
            ((this.nickName==null && other.getNickName()==null) || 
             (this.nickName!=null &&
              this.nickName.equals(other.getNickName()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.ownerCompanyCode==null && other.getOwnerCompanyCode()==null) || 
             (this.ownerCompanyCode!=null &&
              this.ownerCompanyCode.equals(other.getOwnerCompanyCode()))) &&
            ((this.ownerDeptCode==null && other.getOwnerDeptCode()==null) || 
             (this.ownerDeptCode!=null &&
              this.ownerDeptCode.equals(other.getOwnerDeptCode()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.ownerName==null && other.getOwnerName()==null) || 
             (this.ownerName!=null &&
              this.ownerName.equals(other.getOwnerName()))) &&
            ((this.parentNcode==null && other.getParentNcode()==null) || 
             (this.parentNcode!=null &&
              this.parentNcode.equals(other.getParentNcode()))) &&
            ((this.pubCompCode==null && other.getPubCompCode()==null) || 
             (this.pubCompCode!=null &&
              this.pubCompCode.equals(other.getPubCompCode()))) &&
            ((this.pubDeptCode==null && other.getPubDeptCode()==null) || 
             (this.pubDeptCode!=null &&
              this.pubDeptCode.equals(other.getPubDeptCode()))) &&
            ((this.publicFlag==null && other.getPublicFlag()==null) || 
             (this.publicFlag!=null &&
              this.publicFlag.equals(other.getPublicFlag()))) &&
            ((this.readFrom==null && other.getReadFrom()==null) || 
             (this.readFrom!=null &&
              this.readFrom.equals(other.getReadFrom()))) &&
            ((this.readTo==null && other.getReadTo()==null) || 
             (this.readTo!=null &&
              this.readTo.equals(other.getReadTo()))) &&
            ((this.relation==null && other.getRelation()==null) || 
             (this.relation!=null &&
              this.relation.equals(other.getRelation()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.sex==null && other.getSex()==null) || 
             (this.sex!=null &&
              this.sex.equals(other.getSex()))) &&
            ((this.srchRange==null && other.getSrchRange()==null) || 
             (this.srchRange!=null &&
              this.srchRange.equals(other.getSrchRange()))) &&
            ((this.srcKey==null && other.getSrcKey()==null) || 
             (this.srcKey!=null &&
              this.srcKey.equals(other.getSrcKey()))) &&
            ((this.srcType==null && other.getSrcType()==null) || 
             (this.srcType!=null &&
              this.srcType.equals(other.getSrcType()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.userDefinedField1==null && other.getUserDefinedField1()==null) || 
             (this.userDefinedField1!=null &&
              this.userDefinedField1.equals(other.getUserDefinedField1()))) &&
            ((this.userDefinedField2==null && other.getUserDefinedField2()==null) || 
             (this.userDefinedField2!=null &&
              this.userDefinedField2.equals(other.getUserDefinedField2()))) &&
            ((this.userDefinedField3==null && other.getUserDefinedField3()==null) || 
             (this.userDefinedField3!=null &&
              this.userDefinedField3.equals(other.getUserDefinedField3()))) &&
            ((this.userDefinedField4==null && other.getUserDefinedField4()==null) || 
             (this.userDefinedField4!=null &&
              this.userDefinedField4.equals(other.getUserDefinedField4()))) &&
            ((this.userDefinedFieldName1==null && other.getUserDefinedFieldName1()==null) || 
             (this.userDefinedFieldName1!=null &&
              this.userDefinedFieldName1.equals(other.getUserDefinedFieldName1()))) &&
            ((this.userDefinedFieldName2==null && other.getUserDefinedFieldName2()==null) || 
             (this.userDefinedFieldName2!=null &&
              this.userDefinedFieldName2.equals(other.getUserDefinedFieldName2()))) &&
            ((this.userDefinedFieldName3==null && other.getUserDefinedFieldName3()==null) || 
             (this.userDefinedFieldName3!=null &&
              this.userDefinedFieldName3.equals(other.getUserDefinedFieldName3()))) &&
            ((this.userDefinedFieldName4==null && other.getUserDefinedFieldName4()==null) || 
             (this.userDefinedFieldName4!=null &&
              this.userDefinedFieldName4.equals(other.getUserDefinedFieldName4()))) &&
            ((this.workAddress==null && other.getWorkAddress()==null) || 
             (this.workAddress!=null &&
              this.workAddress.equals(other.getWorkAddress()))) &&
            ((this.workDetail==null && other.getWorkDetail()==null) || 
             (this.workDetail!=null &&
              this.workDetail.equals(other.getWorkDetail()))) &&
            ((this.workNation==null && other.getWorkNation()==null) || 
             (this.workNation!=null &&
              this.workNation.equals(other.getWorkNation()))) &&
            ((this.workPhone==null && other.getWorkPhone()==null) || 
             (this.workPhone!=null &&
              this.workPhone.equals(other.getWorkPhone()))) &&
            ((this.workPost==null && other.getWorkPost()==null) || 
             (this.workPost!=null &&
              this.workPost.equals(other.getWorkPost()))) &&
            ((this.photoImg==null && other.getPhotoImg()==null) || 
             (this.photoImg!=null &&
              java.util.Arrays.equals(this.photoImg, other.getPhotoImg()))) &&
            ((this.annivDayAlarm==null && other.getAnnivDayAlarm()==null) || 
             (this.annivDayAlarm!=null &&
              this.annivDayAlarm.equals(other.getAnnivDayAlarm()))) &&
            ((this.annivDayRelationSchCode==null && other.getAnnivDayRelationSchCode()==null) || 
             (this.annivDayRelationSchCode!=null &&
              this.annivDayRelationSchCode.equals(other.getAnnivDayRelationSchCode()))) &&
            ((this.birthDayAlarm==null && other.getBirthDayAlarm()==null) || 
             (this.birthDayAlarm!=null &&
              this.birthDayAlarm.equals(other.getBirthDayAlarm()))) &&
            ((this.birthDayRelationSchCode==null && other.getBirthDayRelationSchCode()==null) || 
             (this.birthDayRelationSchCode!=null &&
              this.birthDayRelationSchCode.equals(other.getBirthDayRelationSchCode()))) &&
            ((this.changeMf==null && other.getChangeMf()==null) || 
             (this.changeMf!=null &&
              this.changeMf.equals(other.getChangeMf()))) &&
            this.childCount == other.getChildCount() &&
            ((this.en_companyName==null && other.getEn_companyName()==null) || 
             (this.en_companyName!=null &&
              this.en_companyName.equals(other.getEn_companyName()))) &&
            ((this.en_deptName==null && other.getEn_deptName()==null) || 
             (this.en_deptName!=null &&
              this.en_deptName.equals(other.getEn_deptName()))) &&
            ((this.en_description==null && other.getEn_description()==null) || 
             (this.en_description!=null &&
              this.en_description.equals(other.getEn_description()))) &&
            ((this.en_firstName==null && other.getEn_firstName()==null) || 
             (this.en_firstName!=null &&
              this.en_firstName.equals(other.getEn_firstName()))) &&
            ((this.en_fullName==null && other.getEn_fullName()==null) || 
             (this.en_fullName!=null &&
              this.en_fullName.equals(other.getEn_fullName()))) &&
            ((this.en_lastName==null && other.getEn_lastName()==null) || 
             (this.en_lastName!=null &&
              this.en_lastName.equals(other.getEn_lastName()))) &&
            ((this.en_title==null && other.getEn_title()==null) || 
             (this.en_title!=null &&
              this.en_title.equals(other.getEn_title()))) &&
            ((this.orderInfo==null && other.getOrderInfo()==null) || 
             (this.orderInfo!=null &&
              this.orderInfo.equals(other.getOrderInfo()))) &&
            this.sameOldAndNewAnniv == other.isSameOldAndNewAnniv() &&
            this.sameOldAndNewBirth == other.isSameOldAndNewBirth() &&
            ((this.syncyn==null && other.getSyncyn()==null) || 
             (this.syncyn!=null &&
              this.syncyn.equals(other.getSyncyn()))) &&
            ((this.careerVO==null && other.getCareerVO()==null) || 
             (this.careerVO!=null &&
              java.util.Arrays.equals(this.careerVO, other.getCareerVO())));
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
        if (getAcqflag() != null) {
            _hashCode += getAcqflag().hashCode();
        }
        if (getAnnivDay() != null) {
            _hashCode += getAnnivDay().hashCode();
        }
        if (getBirthDay() != null) {
            _hashCode += getBirthDay().hashCode();
        }
        if (getBirthDayLunar() != null) {
            _hashCode += getBirthDayLunar().hashCode();
        }
        if (getChkCareer() != null) {
            _hashCode += getChkCareer().hashCode();
        }
        if (getCompanyCode() != null) {
            _hashCode += getCompanyCode().hashCode();
        }
        if (getCompanyFax() != null) {
            _hashCode += getCompanyFax().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getCreationTime() != null) {
            _hashCode += getCreationTime().hashCode();
        }
        if (getDeptName() != null) {
            _hashCode += getDeptName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEmail1() != null) {
            _hashCode += getEmail1().hashCode();
        }
        if (getEmail2() != null) {
            _hashCode += getEmail2().hashCode();
        }
        if (getEntryID() != null) {
            _hashCode += getEntryID().hashCode();
        }
        if (getFamiliarity() != null) {
            _hashCode += getFamiliarity().hashCode();
        }
        if (getFilenm() != null) {
            _hashCode += getFilenm().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getFPhone() != null) {
            _hashCode += getFPhone().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getHobby() != null) {
            _hashCode += getHobby().hashCode();
        }
        if (getHomeAddress() != null) {
            _hashCode += getHomeAddress().hashCode();
        }
        if (getHomeDetail() != null) {
            _hashCode += getHomeDetail().hashCode();
        }
        if (getHomeNation() != null) {
            _hashCode += getHomeNation().hashCode();
        }
        if (getHomePage() != null) {
            _hashCode += getHomePage().hashCode();
        }
        if (getHomePhone() != null) {
            _hashCode += getHomePhone().hashCode();
        }
        if (getHomePost() != null) {
            _hashCode += getHomePost().hashCode();
        }
        if (getHuman() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHuman());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHuman(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getMain() != null) {
            _hashCode += getMain().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getModificationTime() != null) {
            _hashCode += getModificationTime().hashCode();
        }
        if (getMyhomePage() != null) {
            _hashCode += getMyhomePage().hashCode();
        }
        if (getNcode() != null) {
            _hashCode += getNcode().hashCode();
        }
        if (getNickName() != null) {
            _hashCode += getNickName().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getOwnerCompanyCode() != null) {
            _hashCode += getOwnerCompanyCode().hashCode();
        }
        if (getOwnerDeptCode() != null) {
            _hashCode += getOwnerDeptCode().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getOwnerName() != null) {
            _hashCode += getOwnerName().hashCode();
        }
        if (getParentNcode() != null) {
            _hashCode += getParentNcode().hashCode();
        }
        if (getPubCompCode() != null) {
            _hashCode += getPubCompCode().hashCode();
        }
        if (getPubDeptCode() != null) {
            _hashCode += getPubDeptCode().hashCode();
        }
        if (getPublicFlag() != null) {
            _hashCode += getPublicFlag().hashCode();
        }
        if (getReadFrom() != null) {
            _hashCode += getReadFrom().hashCode();
        }
        if (getReadTo() != null) {
            _hashCode += getReadTo().hashCode();
        }
        if (getRelation() != null) {
            _hashCode += getRelation().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getSex() != null) {
            _hashCode += getSex().hashCode();
        }
        if (getSrchRange() != null) {
            _hashCode += getSrchRange().hashCode();
        }
        if (getSrcKey() != null) {
            _hashCode += getSrcKey().hashCode();
        }
        if (getSrcType() != null) {
            _hashCode += getSrcType().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUserDefinedField1() != null) {
            _hashCode += getUserDefinedField1().hashCode();
        }
        if (getUserDefinedField2() != null) {
            _hashCode += getUserDefinedField2().hashCode();
        }
        if (getUserDefinedField3() != null) {
            _hashCode += getUserDefinedField3().hashCode();
        }
        if (getUserDefinedField4() != null) {
            _hashCode += getUserDefinedField4().hashCode();
        }
        if (getUserDefinedFieldName1() != null) {
            _hashCode += getUserDefinedFieldName1().hashCode();
        }
        if (getUserDefinedFieldName2() != null) {
            _hashCode += getUserDefinedFieldName2().hashCode();
        }
        if (getUserDefinedFieldName3() != null) {
            _hashCode += getUserDefinedFieldName3().hashCode();
        }
        if (getUserDefinedFieldName4() != null) {
            _hashCode += getUserDefinedFieldName4().hashCode();
        }
        if (getWorkAddress() != null) {
            _hashCode += getWorkAddress().hashCode();
        }
        if (getWorkDetail() != null) {
            _hashCode += getWorkDetail().hashCode();
        }
        if (getWorkNation() != null) {
            _hashCode += getWorkNation().hashCode();
        }
        if (getWorkPhone() != null) {
            _hashCode += getWorkPhone().hashCode();
        }
        if (getWorkPost() != null) {
            _hashCode += getWorkPost().hashCode();
        }
        if (getPhotoImg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhotoImg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhotoImg(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnnivDayAlarm() != null) {
            _hashCode += getAnnivDayAlarm().hashCode();
        }
        if (getAnnivDayRelationSchCode() != null) {
            _hashCode += getAnnivDayRelationSchCode().hashCode();
        }
        if (getBirthDayAlarm() != null) {
            _hashCode += getBirthDayAlarm().hashCode();
        }
        if (getBirthDayRelationSchCode() != null) {
            _hashCode += getBirthDayRelationSchCode().hashCode();
        }
        if (getChangeMf() != null) {
            _hashCode += getChangeMf().hashCode();
        }
        _hashCode += getChildCount();
        if (getEn_companyName() != null) {
            _hashCode += getEn_companyName().hashCode();
        }
        if (getEn_deptName() != null) {
            _hashCode += getEn_deptName().hashCode();
        }
        if (getEn_description() != null) {
            _hashCode += getEn_description().hashCode();
        }
        if (getEn_firstName() != null) {
            _hashCode += getEn_firstName().hashCode();
        }
        if (getEn_fullName() != null) {
            _hashCode += getEn_fullName().hashCode();
        }
        if (getEn_lastName() != null) {
            _hashCode += getEn_lastName().hashCode();
        }
        if (getEn_title() != null) {
            _hashCode += getEn_title().hashCode();
        }
        if (getOrderInfo() != null) {
            _hashCode += getOrderInfo().hashCode();
        }
        _hashCode += (isSameOldAndNewAnniv() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSameOldAndNewBirth() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSyncyn() != null) {
            _hashCode += getSyncyn().hashCode();
        }
        if (getCareerVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCareerVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCareerVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameCardWSVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "NameCardWSVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acqflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acqflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annivDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annivDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDayLunar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthDayLunar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chkCareer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chkCareer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyFax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyFax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deptName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familiarity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "familiarity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filenm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filenm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hobby");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hobby"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeNation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeNation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homePost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("human");
        elemField.setXmlName(new javax.xml.namespace.QName("", "human"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "HumanNetworkWSVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main");
        elemField.setXmlName(new javax.xml.namespace.QName("", "main"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modificationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myhomePage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "myhomePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ncode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ncode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nickName"));
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
        elemField.setFieldName("ownerCompanyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerCompanyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerDeptCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerDeptCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentNcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentNcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubCompCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubCompCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubDeptCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubDeptCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicFlag"));
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
        elemField.setFieldName("relation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srchRange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srchRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcType"));
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
        elemField.setFieldName("userDefinedField1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userDefinedField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedField2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userDefinedField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedField3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userDefinedField3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedField4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userDefinedField4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedFieldName1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userDefinedFieldName1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedFieldName2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userDefinedFieldName2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedFieldName3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userDefinedFieldName3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedFieldName4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userDefinedFieldName4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workNation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workNation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workPost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photoImg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "photoImg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annivDayAlarm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annivDayAlarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annivDayRelationSchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annivDayRelationSchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDayAlarm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthDayAlarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDayRelationSchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthDayRelationSchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeMf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeMf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "childCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("en_companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "en_companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("en_deptName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "en_deptName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("en_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "en_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("en_firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "en_firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("en_fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "en_fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("en_lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "en_lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("en_title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "en_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameOldAndNewAnniv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sameOldAndNewAnniv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameOldAndNewBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sameOldAndNewBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncyn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syncyn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("careerVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "careerVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://samsung/esb/pims/vo", "CareerWSVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
