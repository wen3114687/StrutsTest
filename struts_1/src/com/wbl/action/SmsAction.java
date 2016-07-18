package com.wbl.action;

import java.util.Date;
import com.wbl.dao.SmsDAO;
import com.wbl.pojo.Sms;

public class SmsAction extends BaseAction {
	public String code;
	public String srcMobile;
	public String destMobile;//接收手机号
	public String message;//短信
	public String type;//类型
	public String sysName;//系统名称
	public String status;//状态
	public Date reciveTime;//接收时间
	SmsDAO smsDAO=SmsDAO.getFromApplicationContext(ctx);
	
	public String sendMessage() {
		Sms sms=new Sms();
		sms.setCode("platform");
		sms.setDestMobile(getDestMobile());
		sms.setMessage(getMessage());
		sms.setReciveTime(new Date());
		sms.setStatus("0");
		sms.setSysName("platform");
		sms.setSrcMobile("管理员");
		sms.setType("0");
		smsDAO.save(sms);
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

	public Date getReciveTime() {
		return reciveTime;
	}

	public void setReciveTime(Date reciveTime) {
		this.reciveTime = reciveTime;
	}

	

}
