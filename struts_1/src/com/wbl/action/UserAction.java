package com.wbl.action;

import com.wbl.dao.UserDAO;
import com.wbl.pojo.User;

public class UserAction extends BaseAction {
	
	private User user;
	private Integer id;
	
	UserDAO userdao=UserDAO.getFromApplicationContext(ctx);
	
	
	
	public void saveUser(User user){
		
		//ÒµÎñÂß¼­
		
		userdao.save(user);
	}



	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
