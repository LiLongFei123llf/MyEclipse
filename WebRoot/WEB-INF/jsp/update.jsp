<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
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
    <fm:form modelAttribute="user" method="post" action="${pageContext.request.contextPath}"
    enctype="multipart/form-data"> 
    	<fm:hidden path="id"/>
    	用户名:<fm:input path="userName"/><fm:errors path="userName"></fm:errors><br>
    	用户昵称:<fm:input path="userName"/><fm:errors path="userName"></fm:errors><br>
    	选择角色:<fm:select path="userRole">
    					<fm:option value="1">1</fm:option>
    					<fm:option value="2">2</fm:option>
    					<fm:option value="3">3</fm:option>
    			</fm:select><br>
    			<c:if test="${user.userPhoto !=null and user.userPhoto !=''}">	
    			<fm:hidden path="userPhoto"/>
    			<img src="${pageContext.request.contextPath}/statics/uploads/${user.userPhoto}">
    			</c:if>
    			<c:if test="${user.userPhoto == null or user.userPhoto=='' }">
    				<input type="file" name="multipartFile">
    			</c:if>
    			
    			<input type="submit" value="增加用户">
    </fm:form>
  </body>
</html>
