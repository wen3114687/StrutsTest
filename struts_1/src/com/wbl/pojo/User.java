package com.wbl.pojo;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String password;
	private String purview;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	/** full constructor */
	public User(String name, String password, String purview) {
		this.name = name;
		this.password = password;
		this.purview = purview;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPurview() {
		return this.purview;
	}

	public void setPurview(String purview) {
		this.purview = purview;
	}

}