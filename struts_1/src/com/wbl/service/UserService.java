package com.wbl.service;

import java.util.List;

import com.wbl.pojo.User;

public interface UserService {
	public List<User> getAllUser();
	
	public String saveUser();
}
