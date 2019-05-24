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
	    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
	    <base href="<%=basePath%>">
   		<link rel="stylesheet" href="bootstrap-4.1.3-dist/css/bootstrap.css">
   		<link rel="stylesheet" href="css/style.css">
   		<title>高级人才推送</title>
   		
	</head>

	<body>
		<div class="container-fluid">
            <h1><s:property value = 'pushContent.title'/></h1>
            <p><s:property value = 'pushContent.content' escapeHtml="false"/><br></p>
        </div>
		<script src="js/jquery-1.9.1.js"></script>
		<script src="bootstrap-4.1.3-dist/js/bootstrap.js"></script>
		<script src="js/util.js"></script>
		<script src="js/jQuery.print.js"></script>
	</body>
</html>
