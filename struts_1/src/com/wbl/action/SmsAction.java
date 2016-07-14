package com.wbl.action;

import com.wbl.pojo.Sms;

public class SmsAction extends BaseAction {
	public String code;
	public String srcMobile;
	public String destMobile;
	public String message;
	public String type;
	public String sysName;
	public String status;
	public String reciveTime;
	
	public String sendMessage() {
		Sms sms=new Sms();
		sms.setCode("platform");
		sms.setDestMobile(getDestMobile());
		
		
		return SUCCESS;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSrcMobile() {
		return srcMobile;
	}

	public void setSrcMobile(String srcMobile) {
		this.srcMobile = srcMobile;
	}

	public String getDestMobile() {
		return destMobile;
	}

	public void setDestMobile(String destMobile) {
		this.destMobile = destMobile;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSysName() {
		return sysName;
	}

	public void setSysName(String sysName) {
		this.sysName = sysName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReciveTime() {
		return reciveTime;
	}

	public void setReciveTime(String reciveTime) {
		this.reciveTime = reciveTime;
	}
	
}
