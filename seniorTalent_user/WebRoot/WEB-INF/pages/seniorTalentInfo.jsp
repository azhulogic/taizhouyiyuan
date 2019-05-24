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
<title>健康管理-用户信息</title>
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
                        <h3 class="text-themecolor m-b-0 m-t-0">用户信息</h3>
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="javascript:void(0)">首页</a></li>
                            <li class="breadcrumb-item active">用户信息</li>
                        </ol>
                    </div>
                 <!--    <div class="col-md-7 col-4 align-self-center">
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
                    <!-- Column -->
                    <div class="col-lg-4 col-xlg-3 col-md-5">
                        <div class="card">
                            <div class="card-block">
                                <center class="m-t-30"> <img src="lite/images/users/<s:property value='seniorTalent.brxb' />a.jpg" class="img-circle" width="150">
                                    <h4 class="card-title m-t-10"><s:property value="seniorTalent.name" /></h4>
                                    <h6 class="card-subtitle"><s:property value="seniorTalent.brxbShow" /></h6>
                                    <div class="row text-center justify-content-md-center">
                                        <div class="col-4"><a href="javascript:void(0)" class="link"><i class="icon-people"></i> <font class="font-medium">待处理任务<s:property value="dcl" /></font></a></div>
                                        <!-- <div class="col-4"><a href="javascript:void(0)" class="link"><i class="icon-picture"></i> <font class="font-medium">54</font></a></div> -->
                                    </div>
                                </center>
                            </div>
                        </div>
                    </div>
                    <!-- Column -->
                    <!-- Column -->
                    <div class="col-lg-8 col-xlg-9 col-md-7">
                        <div class="card">
                            <div class="card-block">
                                <form class="form-horizontal form-material">
                                    <div class="form-group">
                                        <label class="col-md-12">姓名</label>
                                        <div class="col-md-12">
                                            <input type="text" placeholder='<s:property value="seniorTalent.name" />' class="form-control form-control-line">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="example-email" class="col-md-12">性别</label>
                                        <div class="col-md-12">
                                            <input type="text" placeholder='<s:property value="seniorTalent.brxbShow" />' class="form-control form-control-line" name="example-email" id="example-email">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-12">年龄</label>
                                        <div class="col-md-12">
                                            <input type="text"  placeholder='<s:property value="seniorTalent.age" />' class="form-control form-control-line">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-12">联系电话</label>
                                        <div class="col-md-12">
                                            <input type="text" placeholder='<s:property value="seniorTalent.lxdh" />' class="form-control form-control-line">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-12">身份证号</label>
                                        <div class="col-md-12"> 
                                            <input type="text" placeholder='<s:property value="seniorTalent.sfzh" />' class="form-control form-control-line">
                                        </div>
                                    </div>
                                   <div class="form-group">
                                        <label class="col-md-12">单位</label>
                                        <div class="col-md-12"> 
                                            <input type="text" placeholder='<s:property value="seniorTalent.unit" />' class="form-control form-control-line">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-12">职业</label>
                                        <div class="col-md-12"> 
                                            <input type="text" placeholder='<s:property value="seniorTalent.profession" />' class="form-control form-control-line">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-sm-12">
                                            <button class="btn btn-success">更新</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <!-- Column -->
                </div>
               
                <!-- ============================================================== -->
                <!-- End PAge Content -->
                <!-- ============================================================== -->
            </div>
            <!-- ============================================================== -->
            <!-- End Container fluid  -->
            <!-- ============================================================== -->
         
		</div>

 <s:include value="footer.jsp"></s:include>
 
 	<script>
	 
	$(function() {
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
	    
	    toastr.options = {
		  "closeButton": false,
		  "debug": false,
		  "newestOnTop": false,
		  "progressBar": false,
		  "positionClass": "toast-top-right",
		  "preventDuplicates": false,
		  "showDuration": "300",
		  "hideDuration": "1000",
		  "timeOut": "5000",
		  "extendedTimeOut": "1000",
		  "showEasing": "swing",
		  "hideEasing": "linear",
		  "showMethod": "fadeIn",
		  "hideMethod": "fadeOut"
		}
	    toastr.options.onclick = function (e) {
	    	//var jlxh = this.data('jlxh');
			/*var flag = confirm("确定已完成该计划吗")
			
			if(flag){
				
			}*/
       };
       
	    /* showOrderExecuteTime();
	    var ref = setInterval(function(){
	    	showOrderExecuteTime();
	    },7000);*/
	})	

		/* 	var ysdValueStr = '<s:property value = "orderPrint.ysdValueStr"/>'
			setyyd(ysdValueStr,"ys")
			jsysdzrl(ysdValueStr)
			$('#ydqd').val('<s:property value = "orderPrint.ydqd"/>')
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
			}) */
			
		function init(obj,jlxh,jcz){
			//alert(jlxh+"test"+jcz);
			//alert( $(obj));
			//alert( $(obj).parent().parent().find("td:eq(1)").html());//.children[2].innerHTML
			//return;
			
			$('#updateStModal').modal('show');
			$('#updateStModal .jlxh').val(jlxh);
			$('#updateStModal .xy').val(jcz);
			
		}
		
		function updatexy(){
			//alert($('#updateStModal .jlxh').val());
			 
			var param = {
					'act': 'updatexy',
					'jlxh':$('#updateStModal .jlxh').val(),
					'jcz':$('#updateStModal .xy').val()
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
						if(data.code = "1"){
							alert('保存成功。');
							$("#seniorTalentForm").submit()
						}else{
							alert('保存失败。('+data.msg+')');
							return;
						}
						
					}
				})
				 
		}
			
	</script>
</html>
