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
<title>健康管理-健康任务清单</title>
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
				<h3 class="text-themecolor m-b-0 m-t-0">健康任务清单</h3>
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="javascript:void(0)">首页</a></li>
					<li class="breadcrumb-item active">健康任务清单</li>
				</ol>
			</div>
			<!--  <div class="col-md-7 col-4 align-self-center">
                        <a href="#" class="btn waves-effect waves-light btn-danger pull-right hidden-sm-down"> Upgrade to Pro</a>
                    </div> -->
		</div>
		<!-- ============================================================== -->
		<!-- End Bread crumb and right sidebar toggle -->
		<!-- ============================================================== -->
		<!-- ============================================================== -->
		<!-- Start Page Content -->
		<!-- ============================================================== -->
		<div class="row">

			<div class="col-lg-12">
				<div class="card">
					<div class="card-block">
						<form id="seniorTalentForm"
							action="seniorTalentRcjcTodoList.action" name='seniorTalentForm'
							method="post">
							<input type="hidden" name="flag" id="flag"
								value="<s:property value='flag' />"> <input
								type="hidden" name="sfzh" id="sfzh"
								value="<s:property value='sfzh' />"> <input
								type="hidden" name="key" id="key"
								value="<s:property value='key' />">

							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label for="yyrq1" class="col-form-label">预约开始日期</label> <input
											type="date" class="form-control yyrq1" name="yyrq1"
											value="<s:property value='yyrq1' />" />
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<label for="yyrq2" class="col-form-label">预约结束日期</label> <input
											type="date" class="form-control yyrq2" name="yyrq2"
											value="<s:property value='yyrq2' />" />
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label for="jczt" class="col-form-label">监测状态</label> <input
											type="hidden" id="jczt_hidden"
											value="<s:property value='jczt' />" /> <select
											class="form-control jczt" name="jczt" id="jczt_query">
											<option value="">全部 </option>
											<option value="0">未测 </option>
											<option value="1">已测 </option>
											<!-- <option value="2">过期测 </option> -->
										</select>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<label for="jclx" class="col-form-label">监测类型</label> <input
											type="hidden" id="jclx_hidden"
											value="<s:property value='jclx' />" /> <select
											class="form-control disease" name="jclx" id="jclx_query">
											<option value="">全部 </option>
											<s:iterator value="adminWhList" var="y">
												<option value="<s:property value = '#y.keycode'/>">
													<s:property value = "#y.keyword"/>
												</option>
											</s:iterator>
										</select>
									</div>
								</div>
							</div>
							<button id="querytodolistbt" type="submit"
								class="btn btn-primary queryrcjcrw">查询</button>
						</form>
					</div>
				</div>
			</div>
		</div>

		<div class="row">

			<s:iterator value='rcjcTodoList' var='i'>
				<div class="col-lg-4 col-md-5">
					<div class="card">
						<div class="card-block">
							<div class="card-block text-center ">
								<ul class="list-inline m-b-0">
									<li>
										<h6 class="text-muted text-info">
											<i class="fa fa-circle font-10 m-r-10 "></i>
											<s:property value='#i.jclx_desc' />
										</h6>
									</li>

								</ul>
							</div>
							<div>
								<hr class="m-t-0 m-b-0">
							</div>
							<table>
								<tr>
									<td>监测状态:</td>
									<td><s:if test="#i.jczt==0">
											<code>
												<s:property value='#i.jczt_desc' />
											</code>
										</s:if> <s:if test="#i.jczt==1">
											<s:property value='#i.jczt_desc' />
										</s:if></td>
								<tr>
									<td>预约时间:</td>
									<td><s:date name="#i.yyrq" format="yyyy-MM-dd" /></td>
								<tr>
									<td>监测值:</td>
									<td><s:property value='#i.jcz' /></td>
								<tr>
									<td>输入时间:</td>
									<td><s:date name="#i.jlrq" format="yyyy-MM-dd" /></td>
								</tr>
							</table>
						</div>
						<div>
							<hr class="m-t-0 m-b-0">
						</div>
						<div class="card-block text-center ">
							<input class="last btn btn-sm btn-primary mr-1"
								onclick="init(this,<s:property value='#i.jlxh' />,'<s:property value="#i.jcz"/>','<s:property value="#i.jclx"/>');"
								type="button" value="输入"></input>
							<%-- <a  onclick="init(this,<s:property value='#i.jlxh' />,'<s:property value="#i.jcz"/>','<s:property value="#i.jclx"/>');" href="javascript:void();">输入</a> --%>
						</div>
					</div>
				</div>
			</s:iterator>

		</div>

		<%-- <div class="row"> 
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-block">
                                <h3 class="card-title">我的健康任务清单</h3>
                                <div class="table-responsive">
                                    <table class="table" id="myTable">
                                        <thead>
                                            <tr>
												<th data-priority="1">预约时间</th>
												<th data-priority="2">监测类型</th>
												<th data-priority="3">监测状态</th>
												<th data-priority="4">监测值</th>
												<th data-priority="5">输入时间</th>
												<th>操作</th>
											</tr>
                                        </thead>
                                        <tbody>
                                           <s:iterator value='rcjcTodoList' var='i'>
						<tr>
							<td><s:date name="#i.yyrq" format="yyyy-MM-dd" /></td>
							<td><s:property value='#i.jclx_desc' /></td>
							<td><s:property value='#i.jczt_desc' /></td>
							<td><s:property value='#i.jcz' /></td>
							<td><s:date name="#i.jlrq" format="yyyy-MM-dd" /></td> 
								<a onclick="init(this,<s:property value='#i.jlxh' />,'<s:property value="#i.jcz"/>','<s:property value="#i.jclx"/>');" href="javascript:void();">输入</a>
							 
								
								</td>
						</tr>
					</s:iterator>
                                        </tbody>
                                    </table>
                                     
				 	<div id="pager" class="pager form-inline" style="vertical-align: middle;"> 
				 	<input class="first btn btn-sm btn-primary mr-1" type="button" value="首页"></input> 
						<input class="prev btn btn-sm btn-primary mr-1"  type="button" value="&lt;&lt;" ></input> 
						<span class="pagedisplay mr-1">第0页/共0页</span>   
						<input  class="next btn btn-sm btn-primary mr-1"  type="button" value="&gt;&gt;"></input>   
					 	<input  class="last btn btn-sm btn-primary mr-1"  type="button" value="末页"></input>
						每页条数：
						<select class="pagesize form-control form-control-sm">
							<option selected="selected"  value="10">10</option>
							<option value="20">20</option>
							<option value="30">30</option>
							<option value="40">40</option>
							<option value="40">50</option>
						</select>  
					</div> 
                                </div>
                            </div>
                        </div>
                    </div>
                </div> --%>
		<!-- ============================================================== -->
		<!-- End PAge Content -->
		<!-- ============================================================== -->
	</div>
	<!-- ============================================================== -->
	<!-- End Container fluid  -->
	<!-- ============================================================== -->

	<div class="modal" id="updateStModal1" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<input class='jlxh' type='hidden' />
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">输入血压</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>

				<div class="modal-body">
					<div class="row">
						<div class="col-sm-6">
							<div class="form-group">
								<!-- <label for="xy" class="col-form-label">血压(mmHg)</label> -->
								<input type="hidden" class="form-control form-control-line jcz" /> 
								<label for="xy" class="col-form-label">上压(mmHg)</label> 
								<input type="number" class="form-control form-control-line jcz" id="print11" min="90" max="140" step="1" onchange="p2v(11)" />  
								<!--定义滑块组件-->
								<input type="range" id="slider11" min="90" max="140" step="1" value="0" onchange="v2p(11)" class="custom-range" 
								style="width: 100%; padding-left: 0; background-color: #5bc0de; -webkit-appearance: none;" />
								<label for="xy" class="col-form-label">下压(mmHg)</label> 
								<input type="number" class="form-control form-control-line jcz" id="print12" min="60" max="90" step="1" onchange="p2v(12)" />  
								<!--定义滑块组件-->
						        <input type="range" id="slider12" min="60" max="90" step="1" value="0" onchange="v2p(12)" class="custom-range"
								style="width: 100%; padding-left: 0; background-color: #5bc0de; -webkit-appearance: none;" />
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary updateStBtn"
							onclick='updatexy(1)'>确定</button>
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">关闭</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<s:iterator value = 'adminWhList' var = 'i'>
		<div class="modal" id="updateStModal<s:property value = '#i.keycode'/>" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<input class='jlxh' type='hidden' />
			<div class="modal-dialog modal-lg" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">输入<s:property value = '#i.keyword'/></h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<label for="xy" class="col-form-label"><s:property value = '#i.keyword'/>(<s:property value = '#i.descr'/>)</label> 
									<!-- <input type="number" class="form-control form-control-line jcz"
										id="print<s:property value = '#i.keycode'/>" min="0" max="30" step="0.1" onchange="p2v(<s:property value = '#i.keycode'/>)" /> -->
									<input type="text" class="form-control form-control-line jcz"
									id="print<s:property value = '#i.keycode'/>" /> 
									<!--定义滑块组件-->
								    <!-- <!<input type="range" id="slider<s:property value = '#i.keycode'/>" min="0" max="30"
									step="0.1" value="0" onchange="v2p(<s:property value = '#i.keycode'/>)" class="custom-range"
									style="width: 100%;
								    padding-left: 0;
								    background-color: #5bc0de;
								    -webkit-appearance: none;" /> -->
								</div>
							</div>
						</div>
	
						<div class="modal-footer">
							<button type="button" class="btn btn-primary updateStBtn"
								onclick='updatexy(<s:property value = '#i.keycode'/>)'>确定</button>
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">关闭</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</s:iterator>

</div>

<s:include value="footer.jsp"></s:include>

<script>
	 
	$(function() {
		
	    	   $('#jclx_query').val( $('#jclx_hidden').val());//'<s:property value="#request.jclx"/>'
	    	   $('#jczt_query').val($('#jczt_hidden').val());
 
		var pagerOptions = {
			 container: $(".pager"),
			 output: '第{page}/{totalPages}页(共{totalRows}条)',
			 page: 0
		 };
	    $("#myTable").tablesorter({
	     // theme: 'green',
	      //widthFixed: true,
	      widgets: ['zebra'],//Llama zebra Bison
	      headers:{12:{sorter:false},13:{sorter:false}}
	    }) .tablesorterPager(pagerOptions);
	    
	})	

		function init(obj,jlxh,jcz,jclx){
			$('#updateStModal'+jclx).modal('show');
			$('#updateStModal'+jclx+' .jlxh').val(jlxh);
			$('#updateStModal'+jclx+' .jcz').val(jcz);
			if(jclx==2||jclx==3){
				$('#updateStModal'+jclx+' .custom-range').val(jcz); 
				$('#updateStModal'+jclx+' .custom-range').trigger("change"); 
			}else if(jclx==1){
				$('#updateStModal1 .custom-range').val(jcz); 
				xyarr = jcz.split("/"); 
				if(xyarr.length==2){
					 $('#print11').val(xyarr[0]);
					 $('#print12').val(xyarr[1]);
					 $('#slider11').val(xyarr[0]);
					 $('#slider12').val(xyarr[1]);
				}
			}
		}
		
		function updatexy(jclx){
			//alert($('#updateStModal .jlxh').val());
			
			if(jclx==1){
				
				var strv = $('#print11').val()+'/'+$('#print12').val();
				/* ^([1-9][0-9]*)+(.[0-9]{1,2})?$
						^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$
						^\d{4}-\d{1,2}-\d{1,2} */
				 /*  reg=/^\d+/\d/;   
						  reg=/^http://[a-zA-Z0-9]+.[a-zA-Z0-9]+[/=?%-&_~`@[]':+!]*([^<>""])*$/;   
			        if(!reg.test(obj)){        
			             $("#test").html("<b>请输入正确的邮箱地址</b>");   
			         }else{   
			             $("#test").html("");   
			         }    */
				
				$('#updateStModal'+jclx+' .jcz').val(strv);
				//alert($('#updateStModal'+jclx+' .jcz').val())
			}
			var param = {
					'act': 'updatexy',
					'jlxh':$('#updateStModal'+jclx+' .jlxh').val(),
					'jcz':$('#updateStModal'+jclx+' .jcz').val()
				}
				$.ajax({
					type : "POST",
					url : 'ajax.action',
					timeout : 20000,
					error : function() {
						alert('网络连接失败，请检查网络');
					},
					data : "param=" + JSON.stringify(param),
					success : function(data) {
						var result = data.result
						console.log(result)
						if(data.code == "1"){
							alert('保存成功。');
							$("#seniorTalentForm").submit()
						}else{
							alert('保存失败。('+data.msg+')');
							return;
						}
						
					}
				})
				 
		}
			
		 function p2v(ind){//input->view 
			        $("#slider"+ind).val(parseFloat($("#print"+ind).val()));
			    }
		
		 //此函数用于显示滑块的当前值
		    function v2p(ind){//view->input  
		        $("#print"+ind).val(parseFloat($("#slider"+ind).val()));
		    }

		/*     //此函数负责修改value的值
		    function changeVal(){
		        //使用jquery实现
		        var value = parseFloat($("#slider").val());
		        //显示信息
		        print();
		        //修改滑块的值
		        if(value==1000 || choose == false){
		            return;
		        }else{
		            $("#slider").val(value+1);
		        }
		    } */
	</script>
</html>
