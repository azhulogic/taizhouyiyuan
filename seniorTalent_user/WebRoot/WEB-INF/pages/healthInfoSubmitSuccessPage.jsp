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
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
  <body>
  	<div class="container">
  		<h5 class = 'mt-1'>谢谢您的配合！</h5>
  		<!-- background: #17a2b847; -->
		<div style = '' class = 'p-1 bg-info text-light'>
			<div>1、您的体重指数是<strong><s:property value = 'BMI'/></strong>，经过计算：对于您来说，理想体重应为<strong><s:property value = 'bztz'/>千克</strong>。</div>
			<div>您现在属于：<strong><s:property value = 'bmiDescr'/></strong>。</div>
			<div>建议：<s:property value = 'bmiAdvice'/></div>
		</div>
		<div style = 'background: #17a2b847;' class = 'p-1 mt-3 bg-info text-light'>2、根据问卷调查，您存在以下健康问题：<strong><s:property value = 'abnormalStr'/></strong></div>
		<div style = 'background: #17a2b847;' class = 'p-1 mt-3 bg-info text-light'>3、根据此次的问卷调查以及您在本院的就诊和体检信息，接下来我们会花费一周左右的时间为您制定一份个性化的健康管理计划。</div>
  	</div>
    <script src="js/jquery-1.9.1.js"></script>
	<script src="bootstrap-4.1.3-dist/js/bootstrap.js"></script>
  </body>
</html>