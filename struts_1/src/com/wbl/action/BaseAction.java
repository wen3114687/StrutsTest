package com.wbl.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport{
	
	public HttpServletRequest request=ServletActionContext.getRequest();
	public HttpSession session=request.getSession();
	public ServletContext application=ServletActionContext.getServletContext();
    

}
