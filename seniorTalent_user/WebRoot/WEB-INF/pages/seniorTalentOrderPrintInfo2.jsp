<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
	<title>健康管理-健康管理计划书</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<s:include value="header.jsp"></s:include>

<!-- Page wrapper  -->
<!-- ============================================================== -->
<div class="page-wrapper">
	<!-- ============================================================== -->
	<!-- Container fluid  -->
	<!-- ============================================================== -->
	<div class="container-fluid">
		<!-- ============================================================== -->
		<!-- Bread crumb and right sidebar toggle -->
		<!-- ============================================================== -->
		<div class="row page-titles">
			<div class="col-md-5 col-8 align-self-center">
				<h3 class="text-themecolor m-b-0 m-t-0">健康管理计划书</h3>
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="javascript:void(0)">首页</a></li>
					<li class="breadcrumb-item active">健康管理计划书</li>
				</ol>
			</div>
			<!--  <div class="col-md-7 col-4 align-self-center">
                        <a href="#" class="btn waves-effect waves-light btn-danger pull-right hidden-sm-down"> Upgrade to Pro</a>
                    </div> -->
		</div>
		<div class="row1" style="min-width: 880px;">
			<div>
				<div class="card">
					<div class="card-block">
						<div>
							<s:if test = 'true'>
								<div id="printArea">
									<h1 style="text-align: center;">健康管理计划书</h1>
									<table class="table" style="margin-top: 20px; width: 100%;">
										<tr>
											<td style="padding:10px;">门诊号：</td>
											<td style="padding:10px;"><s:property
													value="seniorTalent.mzhm" /></td>
											<td style="padding:10px;">姓名：</td>
											<td style="padding:10px;"><s:property
													value="seniorTalent.name" /></td>
											<td style="padding:10px;">性别：</td>
											<td style="padding:10px;"><s:property
													value="seniorTalent.brxbShow" /></td>
											<td style="padding:10px;">年龄：</td>
											<td style="padding:10px;"><s:property
													value="seniorTalent.age" /></td>
											<td style="padding:10px;">联系电话：</td>
											<td style="padding:10px;"><s:property
													value="seniorTalent.lxdh" /></td>
										</tr>
										<tr>
											<td style="padding:10px;">身份证号：</td>
											<td style="padding:10px;"><s:property
													value="seniorTalent.sfzh" /></td>
											<td style="padding:10px;">联系地址：</td>
											<td style="padding:10px;"><s:property
													value="seniorTalent.lxdz" /></td>
										</tr>
									</table>
									<div class='table-responsive'>
										<h5 class='h-title'>
											健康评估<span style="font-size: .8rem;">（根据调查表及历年体检结果评估，您可能存在的健康问题或不良生活惯）</span>
										</h5>
									</div>
									<table class="table" style="min-width: 800px;">
										<thead>
											<tr>
												<td style='width: 10rem'>健康问题</td>
												<td>目前状态</td>
												<td>参考值</td>
											</tr>
										</thead>
										<tbody>
											<s:iterator value = "abnormalArray" var = "i">
												<tr>
													<td style = 'width: 10rem'><s:property /></td>
													<td></td>
													<td>
														<s:if test = '%{#i eq "消瘦" || #i eq "超重" || #i eq "肥胖"}'>
															实际体重（kg）/身高（m²）=BMI，＜18.5是消瘦，24~27.9是超重，≥28是肥胖
														</s:if>
													</td>
												</tr>
											</s:iterator>
											<s:iterator value="healthResultXmList" var="i">
												<s:if
													test='%{ #i.healthResultXmmxList[0].orderPrintHealthResult.zfpb == 0  }'>
													<tr>
														<td style='width: 10rem'><s:property value="#i.xmName" /></td>
														<td style=' width: 10rem;'>
															<div>
																<s:iterator value='#i.healthResultXmmxList' var='j'>
																	<div style="display: flex;">
																		<div style="width: 9rem;">
																			<s:property value='#j.healthResultXmmxName' />
																		</div>
																		<div style="margin-left: .5rem;">
																			<s:property value='#j.orderPrintHealthResult.nowValue' />
																		</div>
																		<div style="margin-left: .5rem;">
																			<s:property value='#j.unit' />
																		</div>
	
																	</div>
																</s:iterator>
															</div>
														</td>
														<td><s:property value="#i.normalValue" /></td>
													</tr>
												</s:if>
											</s:iterator>
											<s:iterator value='orderPrintExtraHealthResultList'
												var='orderPrintExtraHealthResult'>
												<tr>
													<td><s:property
															value='#orderPrintExtraHealthResult.healthResultXmName' /></td>
													<td><s:property
															value='#orderPrintExtraHealthResult.currentState' /></td>
													<td><s:property value='#orderPrintExtraHealthResult.bz' /></td>
												</tr>
											</s:iterator>
										</tbody>
									</table>
									<h5 class='h-title' style="margin-top: 1rem; margin-bottom: .5rem;">健康目标及评估</h5>
									<table class = "table-bordered" style = "width: 100%;">
										<tr>
											<td style = "width: 10rem;">健康管理目标</td>
											<td>
												<table class = 'table table-sm'>
													<tr>
														<td colspan="3">健康目标</td>
														<td colspan="2">动态评估</td>
													</tr>
													<tr>
														<td style = 'width: 6rem;'>目标时间</td>
														<td>具体目标</td>
														<td>备注</td>
														<td style = 'width: 6rem;'>评估时间</td>
														<td style = 'width: 5rem;'>评估结果</td>
													</tr>
													
													<!-- 自定义目标 -->
													<s:iterator value = 'orderPrintGoals' var = 'i'>
														<tr <s:if test= '%{#i.evalResult == 1}' >class = 'bg-info' style = 'color: white'</s:if> >
															<td><s:if test = '#i.goalTime neq null'><s:date name="#i.goalTime" format="yyyy-MM-dd"/></s:if></td>
															<td><s:property value = '#i.goalStr'/></td>
															<td><s:property value = '#i.goalValue'/></td>
															<td><s:if test = '#i.evalDate neq null'><s:date name = "#i.evalDate" format="yyyy-MM-dd"/></s:if></td>
															<td>
																<s:if test = '#i.evalResult == 0'>未达标</s:if>
																<s:if test = '#i.evalResult == 1'>达标</s:if>
															</td>
														</tr>
													</s:iterator>
												</table>
											</td>
										</tr>
									</table>
									
	
									<h5 class='h-title' style="margin-top: 1rem; margin-bottom: .5rem;">健康管理计划</h5>
									<table class = "table-bordered" style = "width: 100%;">
										<tr>
											<td>健康管理清单</td>
											<td>
												<div style = "display: flex;">
													<div style = "width: 10rem;" class = "bottomRightBorder">饮食</div>
													<div style = "flex: 1; border-bottom: 1px solid #dee2e6;">
														<div class = 'p-1 border-bottom'>
															<div class="container mb-1">
															  <div class="row mb-1">
															    <div class="col-3" style = 'display: flex;'>
															   		<div style = 'width: 4rem;'>身高:</div>
															   		<div style = 'width: 5rem;'>
															      		<input class = 'form-control form-control-sm' id = 'sg' type = 'number' 
															      		value = '<s:property value = 'seniorTalent.height * 100'/>' disabled="disabled"/>
															      	</div>
															      	<div class = 'ml-1'>
															      		cm
															      	</div>
															    </div>
															    <div class="col-3" style = 'display: flex;'>
															   		<div style = 'width: 4rem;'>体重:</div>
															   		<div style = 'width: 5rem;'>
															      		<input class = 'form-control form-control-sm' id = 'tz' type = 'number' 
															      		value = '<s:property value = 'seniorTalent.weight'/>' disabled="disabled"/>
															      	</div>
															      	<div class = 'ml-1'>
															      		kg
															      	</div>
															    </div>
															    <div class="col-3" style = 'display: flex;'>
															   		<div style = 'width: 4rem;'>BMI:</div>
															   		<div style = 'width: 5rem;'>
															      		<input class = 'form-control form-control-sm' id = 'bmi' type = 'number' 
															      		value = '<s:property value = "orderPrint.ysdBMI"/>' disabled="disabled"/>
															      	</div>
															      	<div class = 'ml-1'>
															      		
															      	</div>
															    </div>
															    <!-- <div class="col-3" style = 'display: flex;'>
															   		<div style = 'width: 4rem;'>血压:</div>
															   		<div style = 'width: 4rem;'>
															      		<input class = 'form-control form-control-sm' id = 'xy' type = 'text' />
															      	</div>
															      	<div class = 'ml-1'>
															      		mmhg
															      	</div>
															    </div> -->
															    <div class="col" style = 'display: flex;'>
															   		
															    </div>
															  </div>
															  <div class="row">
															    <div class="col-3" style = 'display: flex;'>
															   		<div style = 'width: 4rem;' class = 'pr-1'>对应标准体重:</div>
															   		<div style = 'width: 5rem;'>
															      		<input class = 'form-control form-control-sm' id = 'bztz' type = 'text' 
															      		value = '<s:property value = "orderPrint.ysdBztz"/>' disabled="disabled"/>
															      	</div>
															      	<div class = 'ml-1'>
															      		kg
															      	</div>
															    </div>
															    <div class="col-3" style = 'display: flex;'>
															   		<div style = 'width: 4rem;'>体型:</div>
															   		<div>
															      		<select id="tx" class = 'form-control form-control-sm' disabled="disabled">
																			<option value=""></option>
																			<option value="xs">消瘦</option>
																			<option value="zc">正常</option>
																			<option value="cz">超重</option>
																			<option value="fp">肥胖</option>
																		</select>
															      	</div>
															      	<div class = 'ml-1'>
															      		
															      	</div>
															    </div>
														     	
															    
															  </div>
															  <div class="row">
															  	<div class="col-3" style = 'display: flex;'>
															   		<div style = 'width: 4rem;'>活动量:</div>
															   		<div>
															      		<select id="hdl" name="hdl" class = 'form-control form-control-sm' disabled="disabled">
															      			<option value=""></option>
															      			<option value="jq">极轻劳动</option>
																			<option value="qd">轻度劳动</option>
																			<option value="zd">中度劳动</option>
																			<option value="zdd">重度劳动</option>
																		</select>
															      	</div>
															      	<div class = 'ml-1'>
															      		
															      	</div>
															    </div>
															    <div class="col-5" style = 'display: flex;'>
															   		<div style = 'width: 6rem;'>饮食单套餐/总热量：</div>
															   		<div>
															   			<div style = 'display:flex;'>
															   				<div style = 'width: 10rem;'>
															   					<select id="zrlfw" name="zrlfw" class = 'form-control form-control-sm' disabled="disabled">
																					<option value=""></option>
																					<option value="1">小于1300千卡</option>
																					<option value="2">1300-1500千卡</option>
																					<option value="3">1500-1700千卡</option>
																					<option value="4">1700-1900千卡</option>
																					<option value="5">1900-2100千卡</option>
																					<option value="6">大于2200千卡</option>
																				</select>
															   				</div>
															   				<div class = 'pl-1 pr-1'>/</div>
															   				<div style = 'width: 5rem;'>
															   					<input class = 'form-control form-control-sm' id='zrl' 
															   					value = '<s:property value = "orderPrint.ysdZrl"/>' disabled="disabled"/>
															   				</div>
															   			</div>
															      	</div>
															      	<div class = 'ml-1'>
															      		
															      	</div>
															    </div>
															    <div class="col" style = 'display: flex;'>
															   		<span id="ysd_desc"></span><br><span id="ysdmsg_desc"></span>
															    </div>
															  </div>
															</div>
															<table class = 'table table-sm'>
																<thread>
																	<tr>
																		<th style = 'width: 6rem;'>
																			<input type="hidden" name="ystb" id="ystb">
																		</th>
																		<th style = 'width: 9rem;'>早餐</th>
																		<th style = 'width: 9rem;'>点心</th>
																		<th style = 'width: 9rem;'>中餐</th>
																		<th style = 'width: 9rem;'>点心</th>
																		<th style = 'width: 9rem;'>晚餐</th>
																		<th style = 'width: 9rem;'>点心</th>
																	</tr>
																</thread>
																<tbody>
																	<s:iterator value = 'ysdRowNameArray' var = 'i' status="sts">	
																		<tr class = 'ysd_tr'>	
																			<td><s:property/></td>
																			<s:iterator begin="1" end = "6" var = 'j'>
																				<td>
																					<div style = 'display: flex;' class = 'ysdItem'>
																						<div><input id="ys_<s:property value = "#sts.index + 1"/>_<s:property value = "#j"/>" class = 'ysdItemValue form-control form-control-sm' style = 'width: 3rem;' type = 'text' disabled="disabled"/></div>
																						<div class = 'ml-1 energy'></div>
																					</div>
																				</td>
																			</s:iterator>
																		</tr>
																	</s:iterator>
															</table>
														</div>
														<div class = 'p-1 border-bottom'>
															按时进餐
														</div>
													</div>
												</div>
	
												<div style = "display: flex;">
													<div style = "width: 10rem;" class = "bottomRightBorder">吸烟</div>
													<div style = "flex: 1; border-bottom: 1px solid #dee2e6;" class = 'p-1'>
														<textarea class="form-control smoke" rows="3" disabled="disabled"><s:property value = 'orderPrint.smoke'/></textarea>
													</div>
												</div>
												<div style = "display: flex;">
													<div style = "width: 10rem;" class = "bottomRightBorder">饮酒</div>
													<div style = "flex: 1; border-bottom: 1px solid #dee2e6;" class = 'p-1'>
														<textarea class="form-control drink" rows="3" disabled="disabled"><s:property value = 'orderPrint.drink'/></textarea>
													</div>
												</div>
												<div style = "display: flex;">
													<div style = "width: 10rem;" class = "bottomRightBorder">运动</div>
													<div style = "flex: 1; border-bottom: 1px solid #dee2e6;">
														<div class = 'p-1 border-bottom'>
															运动时间：饭后0.5-1小时开始运动，持续30-60分钟
														</div>
														<div class = 'p-1 border-bottom'>
															运动频率：每周至少150分钟，至少隔天1次
														</div>
														<div class = 'p-1 border-bottom'>
															<div>
														      <label for="ydqd">运动强度：</label>
														      <select id="ydqd" name="ydqd" class="form-control form-control-sm" style = 'width: 30rem;' disabled>
																  <option value=""></option>
																  <option value="1">轻度有氧运动，如步行、广播操等</option>
																  <option value="2">中等强度有氧运动，如骑自行车、乒乓球、羽毛球、广场舞等</option>
																  <option value="3">重度有氧运动，如跑步、游泳、篮球、足球等</option> 
															  </select>
														    </div>									
														</div>
														<div class = 'p-1 border-bottom'>
															<label>运动注意事项:</label>
															<textarea class="form-control exerciseAttention" rows="3" disabled="disabled"><s:property value = 'orderPrint.exerciseAttention'/></textarea>
														</div>
														<div class = 'p-1'>
															阻抗运动1-2次/周，如哑铃、深蹲、双腿并举上抬
														</div>
													</div>
												</div>
												<div style = "display: flex;">
													<div style = "width: 10rem;" class = "bottomRightBorder">用药指导</div>
													<div style = "flex: 1; border-bottom: 1px solid #dee2e6;" class = 'p-1'>
														<textarea id="yyzd" name="yyzd" class="form-control" rows="3" disabled><s:property value = "orderPrint.yyzd"/></textarea>
													</div>
												</div>
												
												<div style = "display: flex;">
													<div style = "width: 10rem; cursor: pointer" class = "bottomRightBorder"
														onclick = 'javascript: window.location.href = "seniorTalentHealthCheckEdit.action?sfzh=<s:property value = "seniorTalent.sfzh"/>"'>
														健康体检建议
													</div>
													<div style = "flex: 1; border-bottom: 1px solid #dee2e6;" class = 'p-1'>
														<textarea class="form-control checkAdvice" rows="3" disabled="disabled"><s:property value = 'orderPrint.checkAdvice'/></textarea>
													</div>
												</div>
												<div style = "display: flex;" class = 'bottomBorder'>
													<div style = "width: 10rem; " class = "rightBorder">就医建议</div>
													<div style = "flex: 1; ">
														<s:iterator value = 'orderPrintDocSuggestList' var = "i">
															<div style = 'display: flex;' class = 'p-1'>
																<div>推荐科室:</div><div style = 'margin-left: .5rem; width: 6rem;'><s:property value = '#i.suggestDepName'/></div>
																<div style = 'margin-left: 1rem;'>推荐医生:</div><div style = 'margin-left: .5rem; width: 6rem;'><s:property value = '#i.suggestDocName'/></div>
															</div>
														</s:iterator>
													</div>
												</div>
												<div style = "display: flex;">
													<div style = "width: 10rem; border-right: 1px solid #dee2e6;">日常监测</div>
													<div class = 'p-1' style = "flex: 1;">
														具体监测内容、频次及数据记录请登录健康日志
														<!-- <table class="table table-sm" id="SortingTable" style = "width: 100%;">
															<thead class="thead-light" > 
																<tr> 
																	<th>
																		监测类型
																	</th>
																	<th>
																		开始时间
																	</th>
																	<th>
																		监测频率
																	</th>
																	<th>
																		监测次数
																	</th>
																</tr>
															</thead>
															<tbody>
																<tr>
																	<td>血压监测</td>
																	<td>2019-03-31</td>
																	<td>一个月一次</td>
																	<td>2</td>
																</tr>
																<tr>
																	<td>血压监测</td>
																	<td>2019-03-31</td>
																	<td>一年一次</td>
																	<td>2</td>
																</tr>
																<tr>
																	<td>体温</td>
																	<td>2019-03-31</td>
																	<td>一个月一次</td>
																	<td>2</td>
																</tr>
															</tbody>
														</table> -->
													</div>
												</div>
											</td>
										</tr>
									</table>
									
									<h5 class='h-title' style="margin-top: 1rem; margin-bottom: .5rem; display: flex;">
										<div>年度健康评价</div>
									</h5>
									<!-- <table class = 'table table-sm' style = 'width: 50rem;'>
										<thread>
											<tr>
												<th>健康问题</th>
												<th>评价</th>
												<th>备注</th>
											</tr>
										</thread>
										<tbody>
											<tr>
												<td>高血压</td>
												<td>
													优良
												</td>
												<td>控制平稳（空腹：4.4-7.0mmol/L或非空腹：<10.0mmol/L）</td>
											</tr>
										</tbody>
									</table> -->
									<div>
										<textarea class='form-control yearEval' rows="3"
											disabled="disabled"><s:property value = 'orderPrint.yearEval'/></textarea>
									</div>
								</div>
							</s:if>
							<s:else>
								健康计划书仍在编辑中
							</s:else>
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="display: none;">
				<div class="col-lg-8 col-md-7">
					<div class="card">
						<div class="card-block">
							<div class="modal fade bd-example-modal-lg"
								id="aboutKnowledgeInfoModal" tabindex="-1" role="dialog"
								aria-labelledby="exampleModalLabel" aria-hidden="true">
								<div class="modal-dialog modal-lg" role="document">
									<div class="modal-content">
										<div class="modal-header">
											<h5 class="modal-title" id="exampleModalLabel">相关知识</h5>
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
										</div>
										<div class="modal-body">
											<img class='aboutKnowledgeInfoModalImg' src='images/BMI.png' />
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-secondary"
												data-dismiss="modal">关闭</button>
										</div>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<s:include value="footer.jsp"></s:include>
	<%-- 		<script src="js/jquery-1.9.1.js"></script>
		<script src="bootstrap-4.1.3-dist/js/bootstrap.js"></script>
		<script src="js/jQuery.print.js"></script> --%>
	<script src='js/ysdJs.js'></script>

	<script>
		$('#tx').val('<s:property value = "orderPrint.ysdTx"/>')
		$('#hdl').val('<s:property value = "orderPrint.ysdHdl"/>')
		$('#zrlfw').val('<s:property value = "orderPrint.ysdZrlfw"/>')
		$('#ydqd').val('<s:property value = "orderPrint.ydqd"/>')
		var ysdValueStr = '<s:property value = "orderPrint.ysdValueStr"/>'
		setyyd(ysdValueStr,"ys")
		jsysdzrl(ysdValueStr)
		
		$('#printButton').click(function(){
			$('#printArea').print();
		})
		$('.showAboutKnowledge').click(function(){
			var healthProblem = $(this).data('healthproblem');
			var imgName = '';
			if('消瘦' == healthProblem || '超重肥胖' == healthProblem){
				imgName = 'BMI'
			}else if('' == healthProblem){
				
			}
			$('.aboutKnowledgeInfoModalImg').attr('src', 'images/' + imgName + '.png' )
			$('#aboutKnowledgeInfoModal').modal('show')
		})
	</script>
</body>
</html>
