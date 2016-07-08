<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎登陆统一消息管理平台</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
  
  <body>
    <s:form action="checkLogin" namespace="/login" method="post">
   		<p id="loginInfo" style="display: none;"><s:property value="#session.loginInfo"/></p>
    	<s:textfield name="username" label="用户名"></s:textfield>
    	<s:password name="password" label="密码"></s:password>
    	<s:submit value="提交"></s:submit>
    </s:form>
  </body>
<script type="text/javascript">
	var msg = document.getElementById("loginInfo").innerHTML;
	if (msg != "") {
		alert(msg);
	}
</script>
</html>
