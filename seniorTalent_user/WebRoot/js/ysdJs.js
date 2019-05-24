/*
	计算饮食单
*/
$("#tz,#sg").blur(function(){ 
	//体重 身高=》BMI 标准体重体型
	tzsgblur();
	//体型 活动量=》总热量
	anychangeYsd();
});

//活动量+体型+标准体重=联动总热量 
$("#hdl").blur(function(){
	anychangeYsd();
});

//总热量 范围取饮食单信息 (随访类别和总热量变更都触发变更饮食单)
$("#zrlfw").change(function(){//alert($(this).val());
	//setzrlfw($(this).val());
	//alert(1+"="+$('#zrlfw').val());
	if($('#zrlfw').val()==''){
		return;
	}else{
		zrlfwsplit($('#zrlfw').val());
	}
	
	zrlfw2ysd();
	 
});

//sg tz hdl 
function anychangeYsd(){//alert('anychangeYsd');
	//按照孕期计算 zrl
	//var yqjsflag = yqjsysd();
	var yqjsflag = false;
	if(yqjsflag==true){
	}else{
	//按照 体型 活动量  计算 zrl
		if($("#hdl").val()==''){
			return;
		}
		var zrlnew = txhdl2rl();
		if($("#zrl").val()!=''&&$("#zrl").val()!=zrlnew){
			$("#zrl").val(zrlnew);
			if (confirm("总热量有变化，是否变更对应饮食单")) { 	
				setzrlfw($("#zrl").val());
			}
		} else{
			$("#zrl").val(zrlnew);
			setzrlfw($("#zrl").val());
		}
		
	}
}

function txhdl2rl(){
	var zrlnew = 0;  
	if($("#tx").val()=='xs'){
		if($("#hdl").val()=='jq'){
			zrlnew = ($("#bztz").val()*25).toFixed(2); 
		}else if($("#hdl").val()=='qd'){
			zrlnew = ($("#bztz").val()*35).toFixed(2) ;
		}else if($("#hdl").val()=='zd'){
			zrlnew = ($("#bztz").val()*40).toFixed(2) ;
		}else if($("#hdl").val()=='zdd'){
			zrlnew = ($("#bztz").val()*45).toFixed(2) ;
		}
	}else if($("#tx").val()=='zc'){ 
		if($("#hdl").val()=='jq'){
			zrlnew = ($("#bztz").val()*20).toFixed(2) ;
		}else if($("#hdl").val()=='qd'){
			zrlnew = ($("#bztz").val()*30).toFixed(2) ;
		}else if($("#hdl").val()=='zd'){
			zrlnew = ($("#bztz").val()*35).toFixed(2) ;
		}else if($("#hdl").val()=='zdd'){ 
			zrlnew = ($("#bztz").val()*40).toFixed(2) ;
		}
	}else if($("#tx").val()=='fp'){
		if($("#hdl").val()=='jq'){
			zrlnew = ($("#bztz").val()*15).toFixed(2) ;
		}else if($("#hdl").val()=='qd'){
			zrlnew = ($("#bztz").val()*25).toFixed(2) ;
		}else if($("#hdl").val()=='zd'){
			zrlnew = ($("#bztz").val()*30).toFixed(2) ;
		}else if($("#hdl").val()=='zdd'){
			zrlnew = ($("#bztz").val()*35).toFixed(2) ;
		}
	}
	return zrlnew;
}

function zrlfwsplit(zrlfw){
	if(zrlfw=='1'){ 
		$("#zrlfw1").html("0");$("#zrlfw2").html("1300");
	}else if(zrlfw=='2'){ 
		$("#zrlfw1").html("1300");$("#zrlfw2").html("1500");
	}else if(zrlfw=='3'){
		$("#zrlfw1").html("1500");$("#zrlfw2").html("1700");
	}else if(zrlfw=='4'){
		$("#zrlfw1").html("1700");$("#zrlfw2").html("1900");
	}else if(zrlfw=='5'){
		$("#zrlfw1").html("1900");$("#zrlfw2").html("2100");
	}else if(zrlfw=='6'){
		$("#zrlfw1").html("2100");$("#zrlfw2").html("9999");
	}else{
		//$("#zrljy").html("建议2200"); 
	}
}
//体重身高==》bmi 标准体重 体型
function tzsgblur(){//alert(22); 
	var tz = $("#tz").val();
	var sg = $("#sg").val();
	var bztz=0;
	tz = isNaN(parseFloat(tz))?0:parseFloat(tz);
	sg = isNaN(parseFloat(sg))?0:parseFloat(sg);
	
	if(tz!=0 && (tz>150||tz<1)){ 
		$("#tz").css('color','red'); 
		alert('体重输入有误'); return;
	}else{
		$("#tz").css('color',''); //alert(1);
	}
	if(sg!=0 && (sg>200||sg<1)){ 
		 $("#sg").css('color','red'); 
		 alert('身高输入有误');return;
	}else{
		$("#sg").css('color','');// alert(2);
	}
	//alert(tz+"||"+sg);
	if(tz>0&&sg>0){
		$("#bmi").val((tz/((sg/100)*(sg/100))).toFixed(2) ); 
		$("#bztz").val((sg-105).toFixed(2));
		
		//孕期计算饮食单
		//yqjsysd();
		//alert(tz+"=="+ ((sg-105)*(1-0.2)).toFixed(2)+"++"+ ((sg-105)*(1+0.2)).toFixed(2));
		//alert(tz+"<="+((sg-105)*(1-0.2)).toFixed(2)+"=瘦； >="+((sg-105)*(1+0.2)).toFixed(2)+"=胖； "+((sg-105)*(1+0.1)).toFixed(2)+"->"+( (sg-105)*(1-0.1)).toFixed(2)+"=正常")
		//$("#bmi_desc").html("实际体重："+tz+" ;<="+((sg-105)*(1-0.2)).toFixed(2)+":瘦； >="+((sg-105)*(1+0.2)).toFixed(2)+":胖； "+( (sg-105)*(1-0.1)).toFixed(2) +"->"+( (sg-105)*(1+0.1)).toFixed(2)+":正常");
		if(tz<=((sg-105)*(1-0.2)).toFixed(2)){
			//alert(tz+"-1-"+((sg-105)*(1-0.2)).toFixed(2));
			$("#tx").val("xs");
		}else if(tz>=( (sg-105)*(1+0.2)).toFixed(2)){
			//alert(tz+"-2-"+( (sg-105)*(1+0.2)).toFixed(2));
			$("#tx").val("fp");
		//}else if(tz<=( (sg-105)*(1+0.1)).toFixed(2) && tz>=( (sg-105)*(1-0.1)).toFixed(2)){
		//	//alert(tz+"-3-"+( (sg-105)*(1-0.1)).toFixed(2) +"->"+( (sg-105)*(1+0.1)).toFixed(2));
		//	$("#tx").val("lx");
		}else{//alert(1);
			$("#tx").val("zc");
		}
		//getzrl();

	}
}
//(随访类别和总热量变更都触发变更饮食单)
function zrlfw2ysd(){
	
	var ysdcode = '37';//妊娠 
	if($("#sflb").val()=='1'||$("#sflb").val()=='9'){
		ysdcode = '37';
	}else{
		ysdcode = '40';
	}
	if($('#zrlfw').val()==''){
		return;
	}

	var param = {
		'act': 'getTNBysd',
		'keytype': ysdcode,
		'zrlfw': $('#zrlfw').val()
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
			if(data.code == "1"){
				if(data.result==''||data.result.length==0){  
					//alert("xml is null");
				}else{ 
					setyydnull();//alert('zrlfw2ysd ajax');
					$('.ysdValueStr').val(data.result[0].keyword)
					$.each( data.result,  function(i, n){ //n.keyword,n.keycode 
						//alert(n.keyword+"=>"+n.keycode)
						setyyd(n.keyword,"ys");
					}); 
				}
			}else{
				alert(data.msg);
			}
		}
	})
	 setTimeout("jsys()",1000);
}
//孕期计算饮食单
function yqjsysd(){
	//alert($("#hyyq_data").css('display')+'-'+$("#hyyq").val()+"-"+$("#sflb").val());
	if($("#hyyq_data").css('display')!='none'
		&& $("#hyyq").val()!='' 
		&& $("#hyyq").val()>1 
		&& ($("#sflb").val()=='1'||$("#sflb").val()=='9'||$("#sflb").val()=='18')
	){
		var hyyq = $("#hyyq").val();//alert(hyyq);
		//alert(Math.floor(hyyq/7));
		//计算热卡方法为：孕4个月（16周）前为标准体重（身高-105）*30千卡/kg/天，
		//孕4个月（16周）后为标准体重（身高-105）*35千卡/kg/天
		if(Math.floor(hyyq/7)<=16){ //alert('<16');
			$("#zrl").val(($("#bztz").val()*30).toFixed(2) );
			setzrlfw($("#zrl").val());
			//$("#hyyq_rlxx").html('孕4个月（16周）前');
			//alert("妊娠期对应饮食单建议：孕4个月（16周）前为标准体重（身高-105）*30千卡/kg/天");
			$("#ysdmsg_desc").html("妊娠期饮食单建议：孕4个月（16周）前为标准体重（身高-105）*30千卡/kg/天");
		}else if(Math.floor(hyyq/7)>16){ //alert('>16');
			$("#zrl").val(($("#bztz").val()*35).toFixed(2) );
			setzrlfw($("#zrl").val());
			//$("#hyyq_rlxx").html('孕4个月（16周）后');
			//alert("妊娠期对应饮食单建议：孕4个月（16周）后为标准体重（身高-105）*35千卡/kg/天");
			$("#ysdmsg_desc").html("妊娠期饮食单建议：孕4个月（16周）后为标准体重（身高-105）*35千卡/kg/天");
		}
		return true;//按照孕期规则
	}else{
		return false;//不按照孕期规则
	}
	
}

//更加总热量设置饮食单 zrl=总热量
function setzrlfw(zrl){
	if(zrl<1300){
		$("#zrlfw").val("1");
		//$("#zrljy").html("建议1200"); 
		$("#zrlfw1").html("0");$("#zrlfw2").html("1300");
	}else if(1300<=zrl && zrl<=1500){
		$("#zrlfw").val("2");
		//$("#zrljy").html("建议1200或1400"); 
		$("#zrlfw1").html("1300");$("#zrlfw2").html("1500");
	}else if(1500<=zrl && zrl<=1700){
		$("#zrlfw").val("3");
		//$("#zrljy").html("建议1400或1600"); 
		$("#zrlfw1").html("1500");$("#zrlfw2").html("1700");
	}else if(1700<=zrl && zrl<=1900){
		$("#zrlfw").val("4");
		//$("#zrljy").html("建议1600或1800"); 
		$("#zrlfw1").html("1700");$("#zrlfw2").html("1900");
	}else if(1900<=zrl && zrl<=2100){
		$("#zrlfw").val("5");
		//$("#zrljy").html("建议1800或2000"); 
		$("#zrlfw1").html("1900");$("#zrlfw2").html("2100");
	}else if(2100<=zrl){
		$("#zrlfw").val("6");
		//$("#zrljy").html("建议2000或2200"); 
		$("#zrlfw1").html("2100");$("#zrlfw2").html("9999");
	}else{
		//$("#zrljy").html("建议2200"); 
	}
	$("#zrlfw").change();
	//
	//alert(222+"=="+$("#zrlfw").val());
}

//获取饮食单数据 
function getyyd(idname){
	 
	/**	饮食图表*/	
	var tmp="",tmpi="";
		for(i=1;i<=6;i++){ //
			tmpi="";
			for(j=1;j<=6;j++){ 
				//alert(i+"_"+j);
				tmpi+=($("#"+idname+"_"+i+"_"+j).val()+";");
			}
			//alert(tmpi)
			tmp+= (tmpi+"@");
		}//alert(tmp);
		
		$("#"+idname+"tb").val(tmp);
}

function setyydnull( ){//ys_tb_last ys_tb_now
	 $("#ys_tb_now>tr>td>input").each(function(i, n){ //n.keyword,n.keycode  
		 $(n).val("");
		}); 
}

//设置饮食单数据 
function setyyd(v,idnamet){
	 tmp = v;
	 var lineNum = tmp.split('@').length - 1
	 var itemNum = 0  //行内元素个数
	 $(tmp.split('@')).each(function(a,b){
		if(a < lineNum){
			itemNum = b.split(';').length - 1
			$(b.split(';')).each(function(c,d){ 
				if(c < itemNum){
					$("#"+idnamet+"_"+(a+1)+"_"+(c+1)).val(d);
				}
		    }); 
		}
    });
}

function jsys(){//alert(1);
	 getyyd('ys');
	 jsysdzrl($("#ystb").val());
}

function jsysdzrl(ystbtmp){
	 row1 = 0, row2 = 0, row3 = 0, row4 = 0, row5 = 0, row6 = 0; 
	
	$(ystbtmp.split('@')).each(function(a,b){//alert(a+":"+b);alert(b.split(';').length);
		 //alert(a+" a=b "+b );
	 	$(b.split(';')).each(function(c,d){
			var idid = "#ys_"+(a+1)+"_"+(c+1);
	 			//alert(idid);
			if(d==0){
				$(idid).parents('.ysdItem').find('.energy').html("");
				return true;
			}
			
	 		 if(a==0){
	 			row1 += d*180;//谷薯类
	 			// alert(row1+" = "+d*180); 
	 			$(idid).parents('.ysdItem').find('.energy').html("("+d*180+"千卡)");
			 }else if(a==1){//蔬菜类
	 			row2 += d*90;
	 			// alert(row2+" = "+d*180);
	 			$(idid).parents('.ysdItem').find('.energy').html("("+d*90+"千卡)");
			 }else  if(a==2){//低糖水果
	 			row3 += (d*90)/4;
	 			// alert(row2+" = "+d*180);
	 			$(idid).parents('.ysdItem').find('.energy').html("("+((d*90)/4)+"千卡)");
			 }else  if(a==3){//肉蛋豆类
	 			row4 += d*90;//(d*50)*4;
	 			// alert(row2+" = "+d*180);
	 			$(idid).parents('.ysdItem').find('.energy').html( "("+d*90+"千卡)");
			 }else  if(a==4){//浆乳类
	 			row5 +=  d*180;
	 			// alert(row2+" = "+d*180);
	 			$(idid).parents('.ysdItem').find('.energy').html("("+d*180+"千卡)");
			 }else  if(a==5){//油脂类
	 			row6 +=  d*15*9;
	 			// alert(row2+" = "+d*180);
	 			$(idid).parents('.ysdItem').find('.energy').html("("+d*15*9+"千卡)");
			 }
	 		 
	    }); 
    });
	rowskll = row1+row2+row3+row4+row5+row6;
	$("#ysd_desc").html("饮食单实际热量："+rowskll+"千卡");
	$("#ysd_zrl").html(rowskll);
	
	if($("#zrlfw1").html()!=""&&$("#zrlfw2").html()!="" 
			&& ($("#zrlfw1").html()>$("#ysd_zrl").html() 
			|| $("#zrlfw2").html()<$("#ysd_zrl").html()) 
		){//zrl ysd_zrl
		alert('饮食单总热量：'+$("#ysd_zrl").html()+".超出"+$("#zrlfw1").html()+"-"+$("#zrlfw2").html()+".请调整饮食单。");//
		$("#ysd_desc").css("color","red"); 
	}else{$("#ysd_desc").css("color","blue"); }
}
