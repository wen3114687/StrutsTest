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
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<script type="text/javascript">
		function submit(){
			window.open("<%=basePath%>/pages/sms/user/userManage.jsp","_self");
		}
	</script>
  </head>
  	
  <body>
  
  	<div class="tab">
		<input type="button" onclick="submit()" value="提交">
	</div>
  	<div class="content">2</div>
  </body>
</html>
