package com.Single;

public class InfoSingle {                        //活动信息类
	public int id; // 活动ID
	public String username; //报名用户
	public int infoType; // 活动类型
	public String infoTitle; // 活动标题
	public String infoContent; // 活动内容
	public String infoLinkman; // 发布人
	public String infoPhone; // 联系电话
	public String infoEmail; // E-mail地址
	public String infoDate1; // 信息发布时间
	public String infoDate2; // 活动时间
	public String infoState; // 信息审核状态
	public String infoPeopleNum; // 活动报名人数
	public String infoPeopleFreeNum; // 活动报名剩余人数
	
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getInfoType() {
		return infoType;
	}
	public void setInfoType(int infoType) {
		this.infoType = infoType;
	}
	public String getInfoTitle() {
		return infoTitle;
	}
	public void setInfoTitle(String infoTitle) {
		this.infoTitle = infoTitle;
	}
	public String getInfoContent() {
		return infoContent;
	}
	public void setInfoContent(String infoContent) {
		this.infoContent = infoContent;
	}
	public String getInfoLinkman() {
		return infoLinkman;
	}
	public void setInfoLinkman(String infoLinkman) {
		this.infoLinkman = infoLinkman;
	}
	public String getInfoPhone() {
		return infoPhone;
	}
	public void setInfoPhone(String infoPhone) {
		this.infoPhone = infoPhone;
	}
	public String getInfoEmail() {
		return infoEmail;
	}
	public void setInfoEmail(String infoEmail) {
		this.infoEmail = infoEmail;
	}
	public String getInfoDate1() {
		return infoDate1;
	}
	public void setInfoDate1(String infoDate1) {
		this.infoDate1 = infoDate1;
	}
	public String getInfoDate2() {
		return infoDate2;
	}
	public void setInfoDate2(String infoDate2) {
		this.infoDate2 = infoDate2;
	}
	public String getInfoState() {
		return infoState;
	}
	public void setInfoState(String infoState) {
		this.infoState = infoState;
	}
	public String getInfoPeopleNum() {
		return infoPeopleNum;
	}
	public void setInfoPeopleNum(String infoPeopleNum) {
		this.infoPeopleNum = infoPeopleNum;
	}
	public String getInfoPeopleFreeNum() {
		return infoPeopleFreeNum;
	}
	public void setInfoPeopleFreeNum(String infoPeopleFreeNum) {
		this.infoPeopleFreeNum = infoPeopleFreeNum;
	}

	
	
}