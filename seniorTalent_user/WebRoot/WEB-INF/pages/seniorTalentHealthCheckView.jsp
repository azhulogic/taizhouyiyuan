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
   		<title>体检项目选择结果</title>
   		<style>
	        html {
	            font-family: sans-serif;
	            -webkit-text-size-adjust: 100%;
	            -webkit-tap-highlight-color: rgba(0,0,0,0);
	            box-sizing: border-box
	        }
	
	        body, html {
	            font-size: 16px
	        }
	
	        body {
	            max-width: 640px;
	            margin: 0 auto;
	            color: #333;
	            font-family: Helvetica Neue,Helvetica,Arial,sans-serif;
	            line-height: 1.5;
	            background-color: #ffffff;
	        }

        </style>
	</head>

	<body>
		<div id="app">
            <h1 style="text-align: center; padding:5px;" class = 'bg-info text-white'>体检项目选择结果</h1>
            <div class="container-fluid">
                <div id="printArea">
                    <div class="zl-block2">
                        <div class="zl-block1">
                            <div>门诊号：</div>
                            <div><s:property value = "seniorTalent.mzhm"/></div>
                        </div>
                        <div class="zl-block1">
                            <div>姓名：</div>
                            <div><s:property value = "seniorTalent.name"/></div>
                        </div>
                    </div>
                    <div class="zl-block2">
                        <div class="zl-block1">
                            <div>性别：</div>
                            <div><s:property value = "seniorTalent.brxbShow"/></div>
                        </div>
                        <div class="zl-block1">
                            <div>年龄：</div>
                            <div><s:property value = "seniorTalent.age"/></div>
                        </div>
                    </div>
                    <div class="zl-block2">
                        <div class="zl-block1">
                            <div>联系电话：</div>
                            <div><s:property value = "seniorTalent.lxdh"/></div>
                        </div>
                    </div>
                    <div class="zl-block2">
                        <div class="zl-block1">
                            <div>身份证号：</div>
                            <div><s:property value = "seniorTalent.sfzh"/></div>
                        </div>
                    </div>
                    <div class="zl-block2">
                        <div class="zl-block1">
                            <div>联系地址：</div>
                            <div><s:property value = "seniorTalent.lxdz"/></div>
                        </div>
                    </div>
                    <s:iterator value = 'orderPrintHealthCheckXmList' var = 'i' status="index">
						<s:if test = '%{#i.orderPrintHealthCheckXmmxList.size() > 0}'>
		                    <h5><s:property value = '#index.index + 1'/>、<s:property value = '#i.healthCheckXmName'/></h5>
		                    <table class="table table-sm table-bordered abnormals">
		                        <thread>
		                            <tr>
		                                <th>体检项目</th>
		                                <th>价格（元）</th>
		                            </tr>
		                        </thread>
		                        <tbody>
		                        	<s:iterator value = '#i.orderPrintHealthCheckXmmxList' var = 'j' status="jIndex">
			                            <tr class="healthCheckXmmx">
			                                <td style="width: 20rem">
			                                    <s:property value = '#jIndex.index + 1'/>、<s:property value = '#j.healthCheckXmmxName'/>
			                                </td>
			                                <td style="width: 5rem"><s:property value = '#j.price'/></td>
			                            </tr>
			                        </s:iterator>
		                        </tbody>
		                    </table>
                    	</s:if>
                    </s:iterator>
                    <div>
                    	<div class = 'h-title'>温馨提醒：</div>
	                    	<div>1、实际体检费用以体检当天价格为准；</div>
	                    	<div>2、自选项目中血液检查的试管费每项另收1元；</div>
	                    	<div>3、体检咨询或预约电话：85199066、85199065。</div>
                    	</div>
                </div>
            </div>
        </div>
		<script src="js/jquery-1.9.1.js"></script>
		<script src="bootstrap-4.1.3-dist/js/bootstrap.js"></script>
		<script src="js/util.js"></script>
		<script src="js/jQuery.print.js"></script>
		<script>
			$('#printButton').click(function(){
				$('#printArea').print();
			})
		</script>
	</body>
</html>
