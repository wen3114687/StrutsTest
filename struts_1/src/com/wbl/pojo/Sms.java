package com.wbl.pojo;

import java.sql.Timestamp;

/**
 * Sms entity. @author MyEclipse Persistence Tools
 */

public class Sms implements java.io.Serializable {

	// Fields

	private String id;
	private String code;
	private String srcMobile;
	private String destMobile;
	private String message;
	private String type;
	private String sysName;
	private String status;
	private String result;
	private String remark;
	private Timestamp reciveTime;
	private Timestamp sendTime;
	private Timestamp feedbackTime;

	// Constructors

	/** default constructor */
	public Sms() {
	}

	/** minimal constructor */
	public Sms(String id, String message, String type, String sysName,
			String status) {
		this.id = id;
		this.message = message;
		this.type = type;
		this.sysName = sysName;
		this.status = status;
	}

	/** full constructor */
	public Sms(String id, String code, String srcMobile, String destMobile,
			String message, String type, String sysName, String status,
			String result, String remark, Timestamp reciveTime,
			Timestamp sendTime, Timestamp feedbackTime) {
		this.id = id;
		this.code = code;
		this.srcMobile = srcMobile;
		this.destMobile = destMobile;
		this.message = message;
		this.type = type;
		this.sysName = sysName;
		this.status = status;
		this.result = result;
		this.remark = remark;
		this.reciveTime = reciveTime;
		this.sendTime = sendTime;
		this.feedbackTime = feedbackTime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSrcMobile() {
		return this.srcMobile;
	}

	public void setSrcMobile(String srcMobile) {
		this.srcMobile = srcMobile;
	}

	public String getDestMobile() {
		return this.destMobile;
	}

	public void setDestMobile(String destMobile) {
		this.destMobile = destMobile;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSysName() {
		return this.sysName;
	}

	public void setSysName(String sysName) {
		this.sysName = sysName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getReciveTime() {
		return this.reciveTime;
	}

	public void setReciveTime(Timestamp reciveTime) {
		this.reciveTime = reciveTime;
	}

	public Timestamp getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

	public Timestamp getFeedbackTime() {
		return this.feedbackTime;
	}

	public void setFeedbackTime(Timestamp feedbackTime) {
		this.feedbackTime = feedbackTime;
	}

}