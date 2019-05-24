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
   		<link rel="stylesheet" href="iconfont/iconfont.css">
   		<title>问卷调查</title>
	</head>
	<body>
		<div class="container-fluid">
			<h3 style = "text-align: center;">个人健康信息调查表</h3>
			<div>
				<div>姓名： <s:property value = "seniorTalent.name"/></div>
				<div>身份证号： <s:property value = "seniorTalent.sfzh"/></div>
			</div>
			<div>
				<div></div>
				<div></div>
			</div>
			<div>
				<div class = 'mt-2 mb-4'>
					<h5>基本信息</h5>
					<div class = 'mt-1'>
						<div>文化程度</div>
						<div style = 'display: flex; flex-wrap: wrap;' class="ml-2">
							<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'education' name = 'education' type = 'radio' value = '大专及以下' /> 大专及以下
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'education' name = 'education' type = 'radio' value = '本科'/> 本科
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'education' name = 'education' type = 'radio' value = '硕士'/> 硕士
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'education' name = 'education' type = 'radio' value = '博士'/> 博士
						 	</div>
						</div>
					</div>
					
					<div class = 'mt-1'>
						<div>ABO血型</div>
						<div style = 'display: flex; flex-wrap: wrap;' class="ml-2">
							<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'bloodType' name = 'bloodType' type = 'radio' value = 'A型' /> A型
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'bloodType' name = 'bloodType' type = 'radio' value = 'B型'/> B型
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'bloodType' name = 'bloodType' type = 'radio' value = 'O型'/> O型
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'bloodType' name = 'bloodType' type = 'radio' value = 'AB型'/> AB型
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'bloodType' name = 'bloodType' type = 'radio' value = '未知'/> 未知
						 	</div>
						</div>
					</div>
					<div class = 'mt-1'>
						<div>婚姻</div>
						<div style = 'display: flex; flex-wrap: wrap;' class="ml-2">
							<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'marriage' name = 'marriage' type = 'radio' value = '未婚' /> 未婚
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'marriage' name = 'marriage' type = 'radio' value = '已婚'/> 已婚
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'marriage' name = 'marriage' type = 'radio' value = '丧偶'/> 丧偶
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'marriage' name = 'marriage' type = 'radio' value = '离婚'/> 离婚
						 	</div>
						</div>
					</div>
					<div class = 'mt-1'>
						<div>职业类型</div>
						<div style = 'display: flex; flex-wrap: wrap;' class="ml-2">
							<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'profession' name = 'profession' type = 'radio' value = '政府机关' /> 政府机关
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'profession' name = 'profession' type = 'radio' value = '企业管理人员'/> 企业管理人员
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'profession' name = 'profession' type = 'radio' value = '专业技术人员'/> 专业技术人员
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'profession' name = 'profession' type = 'radio' value = '公司职员'/> 公司职员
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'profession' name = 'profession' type = 'radio' value = '工人'/> 工人
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'profession' name = 'profession' type = 'radio' value = '自由职业'/> 自由职业
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'profession' name = 'profession' type = 'radio' value = '退休'/> 退休
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'profession' name = 'profession' type = 'radio' value = '其他'/> 其他
						 	</div>
						</div>
					</div>
					<div style = 'display: flex;' class = 'mt-1'>
						<div>门诊号码</div>
						<div style = 'display: flex;' class = 'ml-2'>
							<input class = 'form-control form-control-sm mzhm' type = 'text' value = '<s:property value = "seniorTalent.mzhm"/>'/>
						</div>
					</div>
					<div style = 'display: flex;' class = 'mt-1'>
						<div>单位</div>
						<div style = 'display: flex;' class = 'ml-2'>
							<input class = 'form-control form-control-sm unit' type = 'text' value = '<s:property value = "seniorTalent.unit"/>'/>
						</div>
					</div>
					<div style = 'display: flex;' class = 'mt-1'>
						<div>现住地址</div>
						<div style = 'display: flex;' class = 'ml-2'>
							<input class = 'form-control form-control-sm lxdz' type = 'text' value = '<s:property value = "seniorTalent.lxdz"/>'/>
						</div>
					</div>
					<div style = 'display: flex;' class = 'mt-1'>
						<div>身高</div>
						<div style = 'display: flex;' class = 'ml-2'>
							<input class = 'form-control form-control-sm height' type = 'number' value = '<s:property value = "seniorTalent.height"/>'/>
							<div style = "font-size: 20px; margin-left: .3rem;">cm</div>
						</div>
					</div>
					<div style = 'display: flex;' class = 'mt-1'>
						<div>体重</div>
						<div style = 'display: flex;' class = 'ml-2'>
							<input class = 'form-control form-control-sm weight' type = 'number' value = '<s:property value = "seniorTalent.weight"/>'/>
							<div style = "font-size: 20px; margin-left: .3rem;">kg</div>
						</div>
					</div>
					<div style = 'display: flex;' class = 'mt-1'>
						<div>血压</div>
						<div style = 'display: flex;' class = 'ml-2'>
							<input class = 'form-control form-control-sm topBloodPressure inputW' type = 'number' value = '<s:property value = "seniorTalent.topBloodPressure"/>' placeholder="上压"/>
							<div style = 'display: flex;align-items: center;' class = 'pl-1 pr-1'>/</div>
							<input class = 'form-control form-control-sm downBloodPressure inputW' type = 'number' value = '<s:property value = "seniorTalent.downBloodPressure"/>' placeholder="下压"/>
							<div style = "font-size: 20px; margin-left: .3rem;">mmHg</div>
						</div>
					</div>
					<div style = 'display: flex;' class = 'mt-1'>
						<div>血糖</div>
						<div style = 'display: flex;' class = 'ml-2'>
							<input class = 'form-control form-control-sm bloodSugar' type = 'number' value = '<s:property value = "seniorTalent.bloodSugar"/>'/>
							<div style = "font-size: 20px; margin-left: .3rem;">mmol/L</div>
						</div>
					</div>
					<div class = 'mt-1'>
						<div>过敏史</div>
						<div style = 'display: flex; flex-wrap: wrap;' class="ml-2">
							<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'gms' name = 'gms' type = 'checkBox' value = '无' /> 无
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'gms' name = 'gms' type = 'checkBox' value = '青霉素类'/> 青霉素类
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'gms' name = 'gms' type = 'checkBox' value = '头孢类'/> 头孢类
						 	</div>
						 	<div style = "margin-right: .5rem; width: 5.2rem;">
						 		<input style="transform: scale(1.5);" class = 'gms' name = 'gms' type = 'checkBox' value = '链霉素'/> 链霉素
						 	</div>
						 	<!-- <div style = "margin-right: .5rem;">
						 		<input name = 'gms' type = 'checkBox' value = '其他'/>其他
							</div> -->
						</div>
						<div class = 'extraGms' data-extra-gms = '<s:property value = "seniorTalent.extraGms"/>'>
							<div class = 'btn btn-primary btn-sm' data-toggle="modal" data-target="#addExtraGmsModal">
								添加过敏史
							</div>
							<!--<s:property value = '#j.healthInfo.extraValue'/> -->
							<s:if test= '%{seniorTalent.extraGms neq null && seniorTalent.extraGms neq ""}' >
								<s:iterator value = '%{seniorTalent.extraGms.split(",")}'>
									<div class = 'btn btn-outline-primary btn-sm ml-1 deleteExtraGmsBtn'>
										<span><s:property /></span>
										<i class="iconfont icon-shanchu"></i>
									</div>
								</s:iterator>
							</s:if>
						</div>
						
					</div>
				</div>
				<form id = "hiInfo">
					<s:iterator value = "healthInfoXmList" var = "i">
						<div class = "healthInfoXm mb-4">
							<h5 class = "xmName"><s:property value = "#i.xmName"/></h5>
							<s:iterator value = "#i.healthInfoXmmxList" var = "j" status="index">
								<div class = "xmmx">
									<div class = "xmmxName"><s:property value = "%{#index.index + 1}"/>.<s:property value = "#j.xmmxName"/>
										<span style = "color: grey;"><s:property value = "#j.note"/></span>
									</div>
									<div style = "display : flex; flex-wrap: wrap;" class = 'ml-2'>
										<s:iterator value = "#j.healthInfoXmmxOptionList" var = "k">
											<div style = "margin-right: 5px; width: 5.2rem;">
												<input style="transform: scale(1.5);"
													class = 'xmmx<s:property value = "#j.xmNo"/>_<s:property value = "#j.xmmxNo"/>'
													type = "<s:if test = "%{#j.selectType == 1}">radio</s:if><s:if test = "%{#j.selectType == 2}">checkBox</s:if>" 
													name = "xmmx<s:property value = "#j.xmNo"/>_<s:property value = "#j.xmmxNo"/>"
													value="<s:property value = "#k.optionName"/>"
													<s:if test = "%{#j.selectType == 1}">
														<s:if test= "%{#j.value == #k.optionName}">checked</s:if>
													</s:if>
													<s:if test = "%{#j.selectType == 2}">
														<s:iterator value = "#j.valueArray" var = "m" >
															<s:if test= "%{#m == #k.optionName}">checked</s:if>
														</s:iterator>
													</s:if>
												/>
												<s:property value = "#k.optionName"/>
											</div>
										</s:iterator>
									</div>
									<s:if test="%{#j.extraAddBz == 1}">
										<div class = 'extraAdd extraAdd<s:property value = "#j.xmNo"/>_<s:property value = "#j.xmmxNo"/>' data-extra-add = '<s:property value = "#j.healthInfo.extraValue"/>'>
											<div class = 'btn btn-primary btn-sm' data-toggle="modal" data-target="#addExtraAddModal">
												添加病史
											</div>
											<!--<s:property value = '#j.healthInfo.extraValue'/> -->
											<s:if test= '%{#j.healthInfo.extraValue neq null && #j.healthInfo.extraValue.trim() neq ""}' >
												<s:iterator value = '%{#j.healthInfo.extraValue.split(",")}'>
													<div class = 'btn btn-outline-primary btn-sm ml-1 deleteExtraAddBtn'>
														<span><s:property /></span>
														<i class="iconfont icon-shanchu"></i>
													</div>
												</s:iterator>
											</s:if>
										</div>
									</s:if>
								</div>
							</s:iterator>
						</div>
					</s:iterator>
					<p>
						<div>备注说明：</div>
						<div>1、健康管理系统配套量表，请根据近两月真实感受选择答案，<input type = 'radio' />单选，<input type = 'checkBox' />多选。</div>
						<div>2、单位：退休者写最后工作单位全称。</div>
						<div>3、既往史：如有其他疾病史、手术、外伤、输血史等写在“其他”空格。</div>
					</p>
					<div class = "mb-2">
						<button type = "button" id = "sfSubmit" class = "btn btn-primary" style = "cursor:pointer">提交</button>
					</div>
				</form>
			</div>
		</div>
		<div class="modal fade" id="addExtraAddModal" tabindex="-1" role="dialog">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLabel">添加自定义既往史</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        <div class="form-group">
			    	<label>既往史</label>
			    	<input type="text" class="form-control extraAddItem" placeholder="请输入既往史">
			  	</div>
		      </div>
		      <div class="modal-footer">
		      	<button type="button" class="btn btn-primary addExtraAddBtn" >确定</button>
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
		      </div>
		    </div>
		  </div>
		</div>
		<div class="modal fade" id="addExtraGmsModal" tabindex="-1" role="dialog">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLabel">添加自定义过敏史</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        <div class="form-group">
			    	<label>过敏史</label>
			    	<input type="text" class="form-control extraGmsItem" placeholder="请输入过敏史">
			  	</div>
		      </div>
		      <div class="modal-footer">
		      	<button type="button" class="btn btn-primary addExtraGmsBtn" >确定</button>
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
		      </div>
		    </div>
		  </div>
		</div>
		<script src="js/jquery-1.9.1.js"></script>
		<script src="bootstrap-4.1.3-dist/js/bootstrap.js"></script>
		<script src="js/util.js"></script>
		<script>
			var hideFlag = $('.xmmx5_23')[0].checked
			if(hideFlag){
				$('.xmmx5_23').parents('.healthInfoXm').find('.xmmx + .xmmx').hide()
				$('.xmmx5_23').parents('.healthInfoXm').find('.xmmx + .xmmx').find('input').removeAttr("checked")
			}else{
				$('.xmmx5_23').parents('.healthInfoXm').find('.xmmx + .xmmx').show()
			}
			hideFlag = $('.xmmx6_29')[0].checked
			if(hideFlag){
				$('.xmmx6_29').parents('.healthInfoXm').find('.xmmx + .xmmx').hide()
				$('.xmmx6_29').parents('.healthInfoXm').find('.xmmx + .xmmx').find('input').removeAttr("checked")
			}else{
				$('.xmmx6_29').parents('.healthInfoXm').find('.xmmx + .xmmx').show()
			}
			
			$('.xmmx5_23').click(function(){
				var hideFlag1 = $('.xmmx5_23')[0].checked
				if(hideFlag1){
					$(this).parents('.healthInfoXm').find('.xmmx + .xmmx').hide()
					$(this).parents('.healthInfoXm').find('.xmmx + .xmmx').find('input').removeAttr("checked")
				}else{
					$(this).parents('.healthInfoXm').find('.xmmx + .xmmx').show()
				}
			})
			
			$('.xmmx6_29').click(function(){
				var hideFlag1 = $('.xmmx6_29')[0].checked
				if(hideFlag1){
					$(this).parents('.healthInfoXm').find('.xmmx + .xmmx').hide()
					$(this).parents('.healthInfoXm').find('.xmmx + .xmmx').find('input').removeAttr("checked")
				}else{
					$(this).parents('.healthInfoXm').find('.xmmx + .xmmx').show()
				}
			})
			var gms = '<s:property value = "seniorTalent.gms"/>'
			$('.gms').each(function(){
				if(gms.indexOf($(this).val()) != -1){
					$(this).attr('checked', 'checked')
				}
			})
			
			var education = '<s:property value = "seniorTalent.education"/>'
			$('.education').each(function(){
				if(education == $(this).val()){
					$(this).attr('checked', 'checked')
				}
			})
			var bloodType = '<s:property value = "seniorTalent.bloodType"/>'
			$('.bloodType').each(function(){
				if(bloodType == $(this).val()){
					$(this).attr('checked', 'checked')
				}
			})
			var marriage = '<s:property value = "seniorTalent.marriage"/>'
			$('.marriage').each(function(){
				if(marriage == $(this).val()){
					$(this).attr('checked', 'checked')
				}
			})
			var profession = '<s:property value = "seniorTalent.profession"/>'
			$('.profession').each(function(){
				if(profession == $(this).val()){
					$(this).attr('checked', 'checked')
				}
			})
			
			var extraGmsArray = []
			if($.trim($('.extraGms').data('extraGms')) != ''){
				extraGmsArray = $.trim($('.extraGms').data('extraGms')).split(',')
			}
			
			var xmmx1_1ExtraValueArray = []
			if($.trim($('.extraAdd1_1').data('extraAdd')) != ''){
				xmmx1_1ExtraValueArray = $.trim($('.extraAdd1_1').data('extraAdd')).split(',')
			}
			$('#sfSubmit').click(function(){
				var height = $('.height').val()/100;
				var weight = $('.weight').val();
				if(height > 9.99 || height <= 0){
					alert('身高范围为0~999cm')
					return
				}
				if(weight <= 0 || weight > 999.9){
					alert('体重范围为0~999.9kg')
					return
				}
				gms = ''
				$('.gms').each(function(){
					if($(this).is(":checked")){
						gms += ($(this).val() + ',')
					}
				})
				var mzhm = $.trim($('.mzhm').val())
				var unit = $.trim($('.unit').val())
				var lxdz = $.trim($('.lxdz').val())
				var topBloodPressure = $('.topBloodPressure').val()
				var downBloodPressure = $('.downBloodPressure').val()
				var bloodSugar = $('.bloodSugar').val()
				education = $('.education:checked').val()
				bloodType = $('.bloodType:checked').val()
				marriage = $('.marriage:checked').val()
				profession = $('.profession:checked').val()
				
				if(education == '' || unit == '' || lxdz == '' || bloodType == undefined || marriage == undefined || profession == undefined){
					alert("基本信息有未填项");
					return;
				}
				if('' == height){
					alert("身高不能为空");
					return;
				}
				if('' == weight){
					alert("体重不能为空");
					return;
				}
				if('' == gms){
					alert("过敏史未选择");
					return;
				}
				if('' == topBloodPressure){
					alert("上压不能为空");
					return;
				}
				if('' == downBloodPressure){
					alert("下压不能为空");
					return;
				}
				if('' == bloodSugar){
					alert("血糖不能为空");
					return;
				}
				
				
				//提示哪些项目未选择
				var checkFlag = true;
				$('#hiInfo .xmmx').each(function(){
					if($(this).css('display') != 'none'){
						if($(this).find('input:checked').val() == undefined){
							var xmName = $(this).parents('.healthInfoXm').find('.xmName').text().replace(/^\s+|\s+$/g,'');
							var xmmxName = $(this).find('.xmmxName').text().replace(/^\s+|\s+$/g,'');
							alert(xmName + ' ' + xmmxName + ' 未选择');
							checkFlag = false;
							return false;
						}
					}
				})
				if(!checkFlag){
					return;
				}
				var healthInfoList = $('#hiInfo').serializeArray();
				var healthInfoNameList = [];
				var healthInfoNoList = [];
				//healthInfoXmmxNameArray 所有xmmx序号
				<s:iterator value = "healthInfoXmmxNameArray" var = "i">
					healthInfoNameList.push('<s:property />');
					healthInfoNoList.push(0);
				</s:iterator>
				
				//计算每个xmmx勾选的项目数 如果大于1 则需要用逗号隔开各个值连接处理
				for(var i = 0; i < healthInfoNameList.length; i++){
					var healthInfoName = healthInfoNameList[i];
					var healthInfoNo = 0;
					for(var j = 0; j < healthInfoList.length; j++){
						if(healthInfoName == healthInfoList[j].name){
							healthInfoNo ++;
						}
					}
					healthInfoNoList[i] = healthInfoNo;
				}

				var healthInfoList2 = [];
				for(var i = 0; i < healthInfoNameList.length; i++){
					var healthInfoname = healthInfoNameList[i];
					var healthInfoList2Item = {
						'name': healthInfoname,
						'value': "",
						'extraValue': ''
					};
					if(healthInfoname == 'xmmx1_1'){
						healthInfoList2Item.extraValue = xmmx1_1ExtraValueArray.toString()
					}
					var healthInfoValue = "";
					if(healthInfoNoList[i] == 1){
						
						for(var j = 0; j < healthInfoList.length; j++){
							if(healthInfoname == healthInfoList[j].name){
								healthInfoValue = healthInfoList[j].value;
								break;
							}
						}
					}else if(healthInfoNoList[i] > 1){
						var isFirstValue  = true;
						for(var j = 0; j < healthInfoList.length; j++){
							if(healthInfoname == healthInfoList[j].name){
								if(isFirstValue){
									healthInfoValue += healthInfoList[j].value;
									isFirstValue = false;
								}else{
									healthInfoValue += (',' + healthInfoList[j].value);
								}	
							}
						}
					}
					healthInfoList2Item.value = healthInfoValue
					healthInfoList2.push(healthInfoList2Item);
				}
				var param = {
					'act': 'submitHealthInfo',
					'height': height,
					'weight': weight,
					'gms': gms,
					'extraGms': extraGmsArray.toString(),
					'education': education,
					'mzhm': mzhm,
					'unit': unit,
					'bloodType': bloodType,
					'marriage': marriage,
					'profession': profession,
					'lxdz': lxdz,
					'healthInfoNoList': healthInfoList2,
					'topBloodPressure': topBloodPressure,
					'downBloodPressure': downBloodPressure,
					'bloodSugar': bloodSugar,
					'sfzh': '<s:property value = "seniorTalent.sfzh"/>',
					'createYgdm': '<s:property value = "#session.ygdm"/>'
				}
				startButtonLoading($('#sfSubmit'));
				$.ajax({
					type : "POST",
					url : 'ajax.action',
					timeout : 20000,
					error : function(XMLHttpRequest, textStatus, errorThrown) {
						closeButtonLoading($('#sfSubmit'))
						alert('网络连接失败，请检查网络');
					},
					data : "param=" + JSON.stringify(param),
					success : function(data) {
						closeButtonLoading($('#sfSubmit'))
						var dataJson = data;
						var code = dataJson.code;
						if(code == "1"){
							alert('提交成功');
							window.location.href = 'healthInfoSubmitSuccess.action?sfzh=<s:property value = 'sfzh'/>&key=<s:property value = 'key'/>'
						}else{
							alert(data.msg);
						}
					}
				})
				
			});

			$('#sendHealthInfoTextMsgButton').click(function(){
				var sfzh = '<s:property value = "sfzh"/>';
				var sjhm = '<s:property value = "seniorTalent.lxdh"/>';
				var param = {
					'act': 'sendHealthInfoTextMsg',
					'sfzh': sfzh,
					'sjhm': sjhm,
					'createYgdm': '<s:property value = "#session.ygdm"/>'
				}

				$('#sendHealthInfoTextMsgButton').attr('disabled',"true");
				$('#sendHealthInfoTextMsgButton').text('提交中..');//发送调查表短信
				$.ajax({
					type : "POST",
					url : 'ajax.action',
					timeout : 20000,
					error : function() {
						$('#sendHealthInfoTextMsgButton').removeAttr('disabled')
						$('#sendHealthInfoTextMsgButton').text('发送调查表短信');
						alert('网络连接失败，请检查网络');
					},
					data : "param=" + JSON.stringify(param),
					success : function(data) {
						$('#sendHealthInfoTextMsgButton').removeAttr('disabled')
						$('#sendHealthInfoTextMsgButton').text('发送调查表短信');
						var dataJson = data;
						var code = dataJson.code;
						if(code == "1"){
							alert('发送成功');
						}else{
							alert(dataJson.msg)
						}
					}
				})
			})
			
			$('.addExtraAddBtn').click(function(){
				var extraAddItem = $(this).parents('#addExtraAddModal').find('.extraAddItem').val()
				xmmx1_1ExtraValueArray.push(extraAddItem)
				$('#addExtraAddModal').find('.extraAddItem').val('')
				$('#addExtraAddModal').modal('hide')
				var appendEle = 
					'<div class = \'btn btn-outline-primary btn-sm ml-1 deleteExtraAddBtn\'>' +
						'<span>' + extraAddItem  + '</span>' +
						'<i class="iconfont icon-shanchu"></i>' +
					'</div>'
					
				$('.extraAdd1_1').append(appendEle)
			})
			$('body').on('click','.extraAdd1_1 .deleteExtraAddBtn',function(e){
				//alert($(this).find('span').text())
				//console.log($(this).find('span').text())
				//console.log(xmmx1_1ExtraValueArray)
				xmmx1_1ExtraValueArray.remove($(this).find('span').text())
				$(this).remove();
			});
			$('.addExtraGmsBtn').click(function(){
				var extraGmsItem = $(this).parents('#addExtraGmsModal').find('.extraGmsItem').val()
				extraGmsArray.push(extraGmsItem)
				$('#addExtraGmsModal').find('.extraGmsItem').val('')
				$('#addExtraGmsModal').modal('hide')
				var appendEle = 
					'<div class = \'btn btn-outline-primary btn-sm ml-1 deleteExtraGmsBtn\'>' +
						'<span>' + extraGmsItem  + '</span>' +
						'<i class="iconfont icon-shanchu"></i>' +
					'</div>'
					
				$('.extraGms').append(appendEle)
			})
			$('body').on('click','.extraGms .deleteExtraGmsBtn',function(e){
				extraGmsArray.remove($(this).find('span').text())
				$(this).remove();
			});
			
			//点击 无 自动去除其他选项 点击 其他选项 自动去除 无
			<s:iterator value = 'checkBoxXmmxArray' var = 'i'>
				$('<s:property />').click(function(){
					if($(this).val() == '无' && $(this).is(":checked")){
						$('<s:property />').each(function(){
							if($(this).val() != '无'){
								$(this).removeAttr("checked")
							}
						})
					}else if($(this).val() != '无' && $(this).is(":checked")){
						$('<s:property />').each(function(){
							if($(this).val() == '无'){
								$(this).removeAttr("checked")
							}
						})
					}
				})
			</s:iterator>
		</script>
		
	</body>
</html>
