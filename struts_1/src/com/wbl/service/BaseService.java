package com.wbl.service;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wbl.dao.UserDAO;

public class BaseService {
	public ServletContext application=ServletActionContext.getServletContext();
	public  ApplicationContext ctx  = WebApplicationContextUtils.getRequiredWebApplicationContext(application);
	UserDAO userdao=UserDAO.getFromApplicationContext(ctx);
}
