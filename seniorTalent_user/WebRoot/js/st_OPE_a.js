var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
	$scope.docSuggests = []
	getDocSuggests()
	$scope.add_docSuggest = {'suggestDepName': '', 'suggestDocName': ''}
	$scope.update_docSuggest = {'suggestDepName': '', 'suggestDocName': ''}
	function getDocSuggests(){
		$http.get('ajax.action', 
				{params: {'param': {"act": "selectOrderPrintDocSuggest", "sfzh": sfzh}} })
		.success(function(res) {
			if(res.code == 1){
				$scope.docSuggests = res.result
			}else{
				alert(res.msg)
			}
		}).error(function(res){
			alert('请求失败')
		})
	}
	$scope.deleteDocSuggest = function(jlxh){
		var c = confirm('确认删除？')
		if(c){
			$http.get('ajax.action', 
					{params: {'param': {"act": "deleteOrderPrintDocSuggest", "jlxh": jlxh}} })
			.success(function(res) {
				if(res.code == 1){
					getDocSuggests()
					alert('删除成功')
				}else{
					alert(res.msg)
				}
			}).error(function(res){
				alert('请求失败')
			})
		}
		
	}
	$scope.addDocSuggest = function(){
		if($scope.add_docSuggest.suggestDepName == ''){
			alert('推荐科室不能为空')
			return
		}
		console.log($scope.add_docSuggest.suggestDepName)
		$http.get('ajax.action', 
				{params: {'param': {"act": "addOrderPrintDocSuggest", 
									"sfzh": sfzh, 
									"createYgdm": createYgdm,
									"suggestDocName": $scope.add_docSuggest.suggestDocName,
									"suggestDepName": $scope.add_docSuggest.suggestDepName}}})
		/*$http({
		  method: 'POST',
		  url: 'ajax.action',
		  data: {
			  'param': {"act": "addOrderPrintDocSuggest", 
					"sfzh": sfzh, 
					"createYgdm": createYgdm,
					"suggestDocName": $scope.add_docSuggest.suggestDocName,
					"suggestDepName": $scope.add_docSuggest.suggestDepName}
		  },
		  headers:{'Content-Type': 'application/x-www-form-urlencoded'}
		})*/.success(function(res) {
			if(res.code == 1){
				getDocSuggests()
				$('#addDocSuggestModal').modal('hide')
				$scope.add_docSuggest = {}
				alert('添加成功')
			}else{
				alert(res.msg)
			}
		}).error(function(res){
			alert('请求失败')
		})
	}
	$scope.showUpdateDocSuggestModal = function(jlxh){
		$http.get('ajax.action',
				{params: {'param': {"act": "selectOrderPrintDocSuggestById", 
									"jlxh": jlxh}}})
		.success(function(res) {
			if(res.code == 1){
				$scope.update_docSuggest = res.result
				$('#updateDocSuggestModal').modal('show')
			}else{
				alert(res.msg)
			}
		}).error(function(res){
			alert('请求失败')
		})
	}
	$scope.updateDocSuggest = function(){
		if($scope.update_docSuggest.suggestDepName == ''){
			alert('推荐科室不能为空')
			return
		}
		$http.get('ajax.action', 
				{params: {'param': {"act": "updateOrderPrintDocSuggest", 
									"jlxh": $scope.update_docSuggest.jlxh,
									"suggestDocName": $scope.update_docSuggest.suggestDocName,
									"suggestDepName": $scope.update_docSuggest.suggestDepName}}})
		.success(function(res) {
			if(res.code == 1){
				getDocSuggests()
				$('#updateDocSuggestModal').modal('hide')
				$scope.update_docSuggest = {}
				alert('修改成功')
			}else{
				alert(res.msg)
			}
		}).error(function(res){
			alert('请求失败')
		})
	}
	
	$scope.orderPrintExtraHealthResults = []
	selectOrderPrintExtraHealthResult()
	$scope.add_orderPrintExtraHealthResult = {'healthResultXmName': '', 'currentState': '', 'bz': ''}
	$scope.update_orderPrintExtraHealthResult = {'healthResultXmName': '', 'currentState': '', 'bz': ''}
	
	function selectOrderPrintExtraHealthResult(){
		$http.get('ajax.action', 
				{params: {'param': {"act": "selectOrderPrintExtraHealthResult", "sfzh": sfzh}} })
		.success(function(res) {
			if(res.code == 1){
				$scope.orderPrintExtraHealthResults = res.result
			}else{
				alert(res.msg)
			}
		}).error(function(res){
			alert('请求失败')
		})
	}
	$scope.addOrderPrintExtraHealthResult = function(){
		if($scope.add_orderPrintExtraHealthResult.healthResultXmName == ''){
			alert('健康问题不能为空')
			return
		}
		$http.get('ajax.action', 
				{params: {'param': {"act": "addOrderPrintExtraHealthResult", 
									"sfzh": sfzh, 
									"createYgdm": createYgdm,
									"healthResultXmName": $scope.add_orderPrintExtraHealthResult.healthResultXmName,
									"currentState": $scope.add_orderPrintExtraHealthResult.currentState,
									'bz': $scope.add_orderPrintExtraHealthResult.bz}}})
		.success(function(res) {
			if(res.code == 1){
				selectOrderPrintExtraHealthResult()
				$('#addOrderPrintExtraHealthResultModal').modal('hide')
				$scope.add_orderPrintExtraHealthResult = {}
				alert('添加成功')
			}else{
				alert(res.msg)
			}
		}).error(function(res){
			alert('请求失败')
		})
	}
	$scope.deleteOrderPrintExtraHealthResult = function(jlxh){
		var c = confirm('确认删除？')
		if(c){
			$http.get('ajax.action', 
					{params: {'param': {"act": "deleteOrderPrintExtraHealthResult", "jlxh": jlxh}} })
			.success(function(res) {
				if(res.code == 1){
					selectOrderPrintExtraHealthResult()
					alert('删除成功')
				}else{
					alert(res.msg)
				}
			}).error(function(res){
				alert('请求失败')
			})
		}
		
	}
	
	$scope.showUpdateOrderPrintExtraHealthResultModal = function(jlxh){
		$http.get('ajax.action',
				{params: {'param': {"act": "selectOrderPrintExtraHealthResultById", 
									"jlxh": jlxh}}})
		.success(function(res) {
			if(res.code == 1){
				$scope.update_orderPrintExtraHealthResult = res.result
				$('#updateOrderPrintExtraHealthResultModal').modal('show')
			}else{
				alert(res.msg)
			}
		}).error(function(res){
			alert('请求失败')
		})
	}
	$scope.updateOrderPrintExtraHealthResult = function(){
		if($scope.update_orderPrintExtraHealthResult.healthResultXmName == ''){
			alert('健康问题不能为空')
			return
		}
		$http.get('ajax.action', 
				{params: {'param': {"act": "updateOrderPrintExtraHealthResult", 
									"jlxh": $scope.update_orderPrintExtraHealthResult.jlxh,
									"healthResultXmName": $scope.update_orderPrintExtraHealthResult.healthResultXmName,
									"currentState": $scope.update_orderPrintExtraHealthResult.currentState,
									'bz': $scope.update_orderPrintExtraHealthResult.bz}}})
		.success(function(res) {
			if(res.code == 1){
				selectOrderPrintExtraHealthResult()
				$('#updateOrderPrintExtraHealthResultModal').modal('hide')
				$scope.update_orderPrintExtraHealthResult = {}
				alert('修改成功')
			}else{
				alert(res.msg)
			}
		}).error(function(res){
			alert('请求失败')
		})
	}
	
	$scope.OPGoals = []
	getOPGoals()
	$scope.add_OPGoal = 
	{
		'sfzh': sfzh,
		"createYgdm": createYgdm,
		'orderPrintNo': orderPrintNo,
		"healthResultXmNo": -1000,
		'goalTime': '', 
		'goalStr': '', 
		'goalValue': ''
	}
	$scope.update_OPGoal = 
	{
		'sfzh': sfzh,
		"createYgdm": createYgdm,
		'orderPrintNo': orderPrintNo,
		"healthResultXmNo": -1000,
		'goalTime': '', 
		'goalStr': '', 
		'goalValue': '', 
		'evalDate': '', 
		'evalResult': ''
	}
	function getOPGoals(){
		$http.get('ajax.action', 
				{params: {'param': {"act": "OPGoal_selectBySfzh", "sfzh": sfzh}} })
		.success(function(res) {
			if(res.code == 1){
				$scope.OPGoals = res.result
			}else{
				alert(res.msg)
			}
		}).error(function(res){
			alert('请求失败')
		})
	}
	$scope.deleteOPGoal = function(jlxh){
		var c = confirm('确认删除？')
		if(c){
			$http.get('ajax.action', 
					{params: {'param': {"act": "OPGoal_deleteByPrimaryKey", "jlxh": jlxh}} })
			.success(function(res) {
				if(res.code == 1){
					getOPGoals()
					alert('删除成功')
				}else{
					alert(res.msg)
				}
			}).error(function(res){
				alert('请求失败')
			})
		}
	}
	$scope.OPGoal_save = function(){
		if($scope.add_OPGoal.goalTime == ''){
			alert('目标时间未选择')
			return;
		}
		if($scope.add_OPGoal.goalStr == ''){
			alert('具体目标不能为空')
			return;
		}
		$http.get('ajax.action', 
				{params: {'param': {"act": "OPGoal_save", 
									"sfzh": sfzh, 
									"createYgdm": createYgdm,
									"orderPrintGoal": $scope.add_OPGoal}}})
		.success(function(res) {
			if(res.code == 1){
				getOPGoals()
				alert('添加成功')
				$('#addOPGoalModal').modal('hide')
				$scope.add_OPGoal = 
				{
					'sfzh': sfzh,
					"createYgdm": createYgdm,
					'orderPrintNo': orderPrintNo,
					"healthResultXmNo": -1000,
					'goalTime': '', 
					'goalStr': '', 
					'goalValue': ''
				}
			}else{
				alert(res.msg)
			}
		}).error(function(res){
			alert('请求失败')
		})
	}
	$scope.showUpdateOPGoalModal = function(jlxh){
		$http.get('ajax.action',
				{params: {'param': {"act": "OPGoal_selectByPrimaryKey", 
									"jlxh": jlxh}}})
		.success(function(res) {
			if(res.code == 1){
				$scope.update_OPGoal = res.result
				$scope.update_OPGoal.goalTime = new Date(res.result.goalTime)
				console.log(res.result.evalDate)
				if(res.result.evalDate == '' || res.result.evalDate == undefined){
					$scope.update_OPGoal.evalDate = new Date()
				}else{
					$scope.update_OPGoal.evalDate = new Date(res.result.evalDate)
				}
				console.log($scope.update_OPGoal)
				$('#updateOPGoalModal').modal('show')
			}else{
				alert(res.msg)
			}
		}).error(function(res){
			alert('请求失败')
		})
	}
	$scope.OPGoal_update = function(){
		/*if($scope.add_orderPrintExtraHealthResult.healthResultXmName == ''){
			alert('健康问题不能为空')
			return
		}*/
		$http.get('ajax.action', 
				{params: {'param': {"act": "OPGoal_updateByPrimaryKey",
									"orderPrintGoal": $scope.update_OPGoal}}})
		.success(function(res) {
			if(res.code == 1){
				getOPGoals()
				$scope.update_OPGoal = 
				{
					'sfzh': sfzh,
					"createYgdm": createYgdm,
					'orderPrintNo': orderPrintNo,
					"healthResultXmNo": -1000,
					'goalTime': '', 
					'goalStr': '', 
					'goalValue': '', 
					'evalDate': '', 
					'evalResult': ''
				}
				alert('更新成功')
				$('#updateOPGoalModal').modal('hide')
			}else{
				alert(res.msg)
			}
		}).error(function(res){
			alert('请求失败')
		})
	}
	
});