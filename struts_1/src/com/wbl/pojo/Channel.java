package com.wbl.pojo;

/**
 * Channel entity. @author MyEclipse Persistence Tools
 */

public class Channel implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String enable;
	private String operateMode;

	// Constructors

	/** default constructor */
	public Channel() {
	}

	/** minimal constructor */
	public Channel(String name, String enable) {
		this.name = name;
		this.enable = enable;
	}

	/** full constructor */
	public Channel(String name, String enable, String operateMode) {
		this.name = name;
		this.enable = enable;
		this.operateMode = operateMode;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnable() {
		return this.enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getOperateMode() {
		return this.operateMode;
	}

	public void setOperateMode(String operateMode) {
		this.operateMode = operateMode;
	}

}