package com.wbl.pojo;

/**
 * Interface entity. @author MyEclipse Persistence Tools
 */

public class Interface implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String url;
	private String type;
	private String remark;

	// Constructors

	/** default constructor */
	public Interface() {
	}

	/** minimal constructor */
	public Interface(String name, String url, String type) {
		this.name = name;
		this.url = url;
		this.type = type;
	}

	/** full constructor */
	public Interface(String name, String url, String type, String remark) {
		this.name = name;
		this.url = url;
		this.type = type;
		this.remark = remark;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}