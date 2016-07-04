<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>统一短信平台</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body style="background: #e3e3e3">
	<ul class="menu">
		接口管理
		<li class="submenu"><a href="<%=basePath%>/pages/sms/interface/interface.jsp" target="center">短信接口列表</a></li>
	</ul>
	<ul class="menu">
		通道管理
		<li class="submenu"><a href="<%=basePath%>/pages/sms/channal/channal.jsp" target="center">短信通道列表</a></li>
	</ul>
	<ul class="menu">
		用户管理
		<li class="submenu"><a href="<%=basePath%>/pages/sms/user/userManage.jsp" target="center">用户管理</a></li>
	</ul>
	<ul class="menu">
		短信管理
		<li class="submenu"><a href="<%=basePath%>/pages/sms/message/sendMessage.jsp" target="center">发送短信</a></li>
		<li class="submenu"><a href="<%=basePath%>/pages/sms/message/downMessage.jsp" target="center">下行短信管理</a></li>
		<li class="submenu"><a href="<%=basePath%>/pages/sms/message/upMessage.jsp" target="center">上行短信管理</a></li>
		<li class="submenu"><a href="<%=basePath%>/pages/sms/message/messageCount.jsp" target="center">短信统计</a></li>
	</ul>
</body>
</html>
