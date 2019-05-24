<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <base href="<%=basePath%>">
	<link rel="stylesheet" href="bootstrap-4.1.3-dist/css/bootstrap.css">
	<meta name="viewport" content="initial-scale=1, maximum-scale=1">
</head>
  <body>
  	<div style = "display: flex;margin: 10px;">
  		<div style = "margin-right: 10px;"><s:property value = "msg"/></div>
  		<h2>提交成功</h2>
  	</div>
    <script src="js/jquery-1.9.1.js"></script>
  </body>
</html>
