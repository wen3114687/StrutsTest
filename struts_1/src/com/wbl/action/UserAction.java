package com.wbl.action;

import java.util.List;

import com.wbl.dao.UserDAO;
import com.wbl.pojo.User;

public class UserAction extends BaseAction {
	
	private Integer id;
	private String name;
	private String password;
	private List<User> userlist;
	
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
	
	public String getAll(){
		this.userlist=userdao.findAll();
		request.setAttribute("userlist", userlist);
		return SUCCESS;
	}
	
	
	
	
	public List<User> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
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
