package com.wbl.action;

import com.wbl.dao.UserDAO;



public class LoginAction extends BaseAction{
	public String username;
	public String password;
	

	UserDAO userdao=UserDAO.getFromApplicationContext(ctx);
	private static final long serialVersionUID = 1L;
	
	
	public String login() throws Exception {
		
		if(userdao.isExist(this.getUsername(), this.getPassword())){
			session.setAttribute("userInfo", "用户名");
			session.setMaxInactiveInterval(10);
			return SUCCESS;
		}else{
			session.setAttribute("loginInfo", "用户名或密码错误");
			return INPUT;
		}
	}
	
	public String logOut(){
		session.removeAttribute("userInfo");
		return SUCCESS;
	}
	
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
