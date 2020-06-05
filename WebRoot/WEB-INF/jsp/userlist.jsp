<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userlist.jsp' starting page</title>
    
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
    <from action="${paeContext.request.contextPath}/user/listinfo" method="get">
    	 用户名:<input type="text" name="userName"/>
    	用户角色:<select name="userRole">
    				<option value="0">忽略</option>
    				<option value="1">管理员</option>
    				<option value="2">经理</option>
    				<option value="3">职工</option>
    			</select>
    			<input type="submit" value="查询">
    </from>
    <div>
    	<ul>
    		
    	</ul>
    </div>
  </body>
</html>
