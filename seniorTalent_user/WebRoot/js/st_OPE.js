setyyd(ysdValueStr,"ys")
jsysdzrl(ysdValueStr)
$('#saveButton').click(function(){
	var orderInfoList = [];
	var orderPrintHealthResultJsonList = [];
	var orderPrintGoalJsonList = [];
	var checkFlag = true
	/*$('.abnormal').each(function(){
		var orderPrintPlan = $(this).find('.orderPrintPlanValue').val()
		if('' == orderPrintPlan){
			checkFlag = false
			alert('健康管理目标存在未填项')
			return false;
		}
		orderPrintPlanList.push(orderPrintPlan)
	})*/
	$('.healthResultXmmx').each(function(){
		var healthResultXmCheck = $(this).parents('.abnormal').find('.healthResultXmCheck').is(':checked')
		var healthResultXmNo = $(this).data('healthResultXmNo')
		var healthResultXmmxNo = $(this).data('healthResultXmmxNo')
		if(healthResultXmCheck){
			var unit = $(this).data('unit')
			var nowValue = $(this).find('.nowValue').val()
			if('' == nowValue){
				checkFlag = false
				alert('健康评估存在未填项')
				return false;
			}
			var orderPrintHealthResultJson = {
				//'healthResultXmNo': parseInt(healthResultXmNo),
				'healthResultXmNo': healthResultXmNo,
				'healthResultXmmxNo': healthResultXmmxNo,
				'nowValue': nowValue,
				'unit': unit,
				'zfpb': 0
			}
			orderPrintHealthResultJsonList.push(orderPrintHealthResultJson)	
		}else{
			var orderPrintHealthResultJson = {
				//'healthResultXmNo': parseInt(healthResultXmNo),
				'healthResultXmNo': healthResultXmNo,
				'healthResultXmmxNo': healthResultXmmxNo,
				'nowValue': '',
				'unit': '',
				'zfpb': 1
			}
			orderPrintHealthResultJsonList.push(orderPrintHealthResultJson)	
		}
	})
	$('.orderPrintGoal').each(function(){
		//healthResultXmNo,goalTime,goalStr,goalValue,unit,zfpb
		var jlxh = $(this).data('jlxh')
		var healthResultXmNo = $(this).data('healthResultXmNo')
		var goalXmmxNo = $(this).data('goalXmmxNo')
		var goalStr = $(this).data('goalStr')
		var goalCheck = $(this).find('.goalCheck').is(':checked')
		if(goalCheck){
			var goalTime = $(this).find('.goalTime').val()
			
			var goalValue = $(this).find('.goalValue').val()
			var unit = $(this).data('unit')
			var hasValueBz = $(this).data('hasValueBz')
			if('' == goalTime){
				checkFlag = false
				alert('健康管理目标存在未填项')
				return false;
			}
			var orderPrintGoalJson = {
				'jlxh': jlxh,	
				'goalTime': goalTime,
				'healthResultXmNo': healthResultXmNo,
				'goalXmmxNo': goalXmmxNo,
				'goalStr': goalStr,
				'goalValue': goalValue,
				'unit': unit,
				'hasValueBz': hasValueBz,
				'zfpb': 0
			}
			
			orderPrintGoalJsonList.push(orderPrintGoalJson)
		}else{
			var orderPrintGoalJson = {
				'jlxh': jlxh,
				'healthResultXmNo': healthResultXmNo,
				'goalXmmxNo': goalXmmxNo,
				'goalStr': goalStr,
				'zfpb': 1
			}
			
			orderPrintGoalJsonList.push(orderPrintGoalJson)
		}
		
	})
	if(!checkFlag){
		return;
	}
	ysdValueStr = ''
	var ysdTrStr = ''
	$('.ysd_tr').each(function(){
		ysdTrStr = ''
		$(this).find('.ysdItemValue').each(function(){
			ysdTrStr += ($(this).val() + ';')
		})
		ysdTrStr += '@'
		ysdValueStr += ysdTrStr
	})
	
	var param = {
		'act': 'addOrderPrint',
		'orderPrintHealthResultJsonList': orderPrintHealthResultJsonList,
		'orderPrintGoalJsonList': orderPrintGoalJsonList,
		'orderPrintJlxh': orderPrintNo,
		'ysdValueStr': ysdValueStr,
		'ydqd': $('#ydqd').val(),
		'yyzd': $('#yyzd').val(),
		'sfzh': sfzh,
		'createYgdm': createYgdm
	}
	startButtonLoading($('#saveButton'));
	console.log(orderPrintGoalJsonList)
	if(orderPrintHealthResultJsonList.length > 0 || orderPrintGoalJsonList.length > 0){
		$.ajax({
			type : "POST",
			url : 'ajax.action',
			timeout : 20000,
			error : function() {
				alert('网络连接失败，请检查网络');
				closeButtonLoading($('#saveButton'));
			},
			data : "param=" + JSON.stringify(param).replace(/\%/g,'%25'),
			success : function(data) {
				closeButtonLoading($('#saveButton'));
				var dataJson = data;
				var code = dataJson.code;
				if(code == "1"){
					alert('提交成功');
					
					window.location.href = ('seniorTalentOrderPrintInfo.action?sfzh=' + sfzh);
				}else{
					alert(dataJson.msg);
				}
			}
		})
	}else{
		closeButtonLoading($('#saveButton'));
		alert('没有要保存的内容');
	}
});
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

function openWindow(sfzh, title){
	window.target='_blank';
	window.open('seniorTalentHealthCheck.action?sfzh=' + sfzh , title,"width=1200,resizable=yes,scrollbars=yes")
}