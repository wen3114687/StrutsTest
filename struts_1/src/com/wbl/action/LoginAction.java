package com.wbl.action;



public class LoginAction extends BaseAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		if(this.username.equals("admin")&&this.password.equals("1234")){
			request.setAttribute("loginInfo", "µÇÂ¼³É¹¦");
			return SUCCESS;
		}else{
			return INPUT;
		}
	}
	
	
	public String username;
	public String password;
	
	
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
