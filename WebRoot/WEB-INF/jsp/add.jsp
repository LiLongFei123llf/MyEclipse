int insertuser(User user);<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
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
   	<fm:form modelAttribute="user" method="post" action="${pageContext.request.contextPath}/useradd/insert" enctype="multipart/form-data">
   		用户名：	<fm:input path="userName"/><fm:errors path="userName"></fm:errors>
   		用户角色：<fm:input path="userCode"/><fm:errors path="userCode"></fm:errors>
   		用户密码：<fm:input path="userPassword"/><fm:errors path="userPassword"></fm:errors>
   		用户角色:<select name="userRole">
    				<option value="0">忽略</option>
    				<option value="1">管理员</option>
    				<option value="2">经理</option>
    				<option value="3">职工</option>
    			</select>
   		<input type="file" name="multipartFile"/>
   		<input type="submit" value="增加"/>
   		
   	</fm:form>
  </body>
</html>
