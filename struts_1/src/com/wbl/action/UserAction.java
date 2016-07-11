package com.wbl.action;

import com.wbl.dao.UserDAO;
import com.wbl.pojo.User;

public class UserAction extends BaseAction {
	
	private Integer id;
	private String name;
	private String password;
	
	UserDAO userdao=UserDAO.getFromApplicationContext(ctx);
	
	
	
	public String registUser(){
		User user =new User();
		user.setName(getName());
		user.setPassword(getPassword());
		userdao.save(user);
		return SUCCESS;
	}
	
	public String logOut(){
		
		return SUCCESS;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
