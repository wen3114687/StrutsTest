package com.wbl.service.imp;

import java.util.List;

import com.wbl.dao.UserDAO;
import com.wbl.pojo.User;
import com.wbl.service.BaseService;
import com.wbl.service.UserService;

public class UserServiceImp extends BaseService implements UserService {

	@Override
	public List<User> getAllUser() {
		UserDAO userdao=UserDAO.getFromApplicationContext(ctx);
		List<User> userlist= userdao.findAll();
		return userlist;
	}

	@Override
	public String saveUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
