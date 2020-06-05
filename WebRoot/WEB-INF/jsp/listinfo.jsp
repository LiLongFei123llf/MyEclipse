<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'listinfo.jsp' starting page</title>
    
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
    <form action="${pageContext.request.contextPath}/user/listinfo" method="get">
    	 用户名:<input type="text" name="userName"/>
    	用户角色:<select name="userRole">
    				<option value="0">忽略</option>
    				<option value="1">管理员</option>
    				<option value="2">经理</option>
    				<option value="3">职工</option>
    			</select>
    			<input type="submit" value="查询">
    </form>
    <div>	
    	<ul>
    		<li>ID</li>	
    		<li>姓名</li>	
    		<li>昵称</li>	
    		<li>生日</li>	
    		<li>操作</li>	
    	</ul>
    	<ul>
    	<c:forEach items="${userList }" var="user">
    		<li>${user.userName }</li>
    		<li>${user.userCode }</li>
    		<li>${user.birthday }</li>
    		<li><a href="#">查看</a><a href="${pageContext.request.contextPath}/useradd/add">增加</a></li>
    		<li><a href="${pageContext.request.contextPath}/user/update">修改</a></li>
    		<li></li>
    	</c:forEach>
    	
    		<c:forEach begin="1" end="${pageCount }" var="i" step="1">
    			<a href="${pageContext.request.contextPath }/user/listinfo?pageNum=<c:out value="${i }"></c:out><c:if test="${userName!=null and userName!='' }">&userName=${userName }</c:if><c:if test="${userRole!=null and userRole!='' }">&userRole=${userRole }</c:if>">
	    			<c:out value="第${i }页"></c:out>
	    		</a>
    			<%-- <a href="${paeContext.request.contextPath}/user/listinfo">${i}<c:if test="${userName !=null}">&userName=${userName }</c:if><c:if test="test="${userRole !=null}">&userRole=${userRole }</c:if></a>
    		 --%>
    		</c:forEach>
    		
    	</ul>
    </div>
  </body>
</html>
