<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'stuList.jsp' starting page</title>
    
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
  
  	<div>
 
	    <form action="" method="post">
	    	昵称：<input type="text" name="stuCustom.nicheng" >
	    	姓名：<input type="text" name="stuCustom.name" >
	    	<input type="submit" value="查找">    
	    	<input type="button" value="添加" onclick="location=''">	
	    </form>
	    
    </div>
    <div> 
    	<form action="" method="post">
    	<table border="1">
    		<tr>
    			<td></td>
    			<td>编号</td>
    			<td>姓名</td>
    			<td>课程</td>
    			<td>成绩</td>
    			<td>操作</td>
    		</tr>
    		
    		<c:forEach items="${stu }" var="stu" varStatus="num">
    			<tr>
    				<td>${num.index +1 }</td>
    				<td>${stu.id }</td>
    				<td>${stu.name }</td>
    				<td>${stu.kecheng }</td>
    				<td>${stu.chengji }</td>
    				<td>
    					<a href="">修改</a>
    					<a href="" onclick="return confirm('确定要删除吗?')">删除</a>
    				</td>
    			</tr>   		
    		</c:forEach>
    	</table>
    		<input type="submit" value="批量删除">
    	</form>
    </div>
  </body>
</html>
