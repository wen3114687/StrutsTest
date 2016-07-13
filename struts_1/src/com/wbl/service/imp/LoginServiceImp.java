package com.wbl.service.imp;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wbl.dao.UserDAO;
import com.wbl.service.BaseService;
import com.wbl.service.LoginService;
@Service
public class LoginServiceImp extends BaseService implements LoginService {
	
	
	@Override
	public boolean isExist(String username,String password) {
		
		UserDAO userdao=UserDAO.getFromApplicationContext(ctx);
		userdao.isExist(username, password);
		return false;
	}

}
