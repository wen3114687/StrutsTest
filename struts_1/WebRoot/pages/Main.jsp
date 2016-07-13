<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>统一消息管理平台</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   	    <table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
   	    
        <tr>
            <td colspan="3" height="100"  >
            	<input type="button" onclick="logOut()" value="退出"></input>
				<iframe height="100%" width="100%" frameborder="0" src="pages/layout/top.jsp"
                    name="leftFrame"></iframe>
			</td>
        </tr>
        <tr>
            <td width="190" id="frmTitle" noWrap="noWrap" name=fmTitle" valign="top" height="100%">
                <iframe height="100%" width="100%" frameborder="0" src="pages/layout/leftMenu.jsp"
                    name="leftFrame"></iframe>
            </td>
            <td width="6" style="width: 6px; background: #1568b4" valign="middle" 
                height="100%">
                <span  id="switchPoint" title="关闭/打开侧边栏">
                    <label onclick="switchSysBar()" style="cursor:pointer;">click</label>
                </span>
            </td>
            <td valign="top" width="100%" height="100%">
                <iframe height="100%" width="100%" frameborder="0" name="center" src="pages/layout/rightContent.jsp">
                </iframe>
            </td>
        </tr>
    </table>
  </body>
  <script type="text/javascript">
  		function logOut(){
  			window.open("<%=path %>/index.jsp","_self");
  		}
  </script>
</html>
