/**
 * 自定义工具类
 * @author zl
 */

//通过身份证号取的各种信息
//通过身份证号取得出生日期yyyy-MM-dd
function getBirthdate(sfzh){
    if(sfzh.length==18){
        var year=sfzh.substring(6,10)
        var month=sfzh.substring(10,12)
        var day=sfzh.substring(12,14)
        return year+'-'+month+'-'+day;
    }
    if(sfzh.length==15){
        var year='19'+sfzh.substring(6,8)
        var month=sfzh.substring(8,10)
        var day=sfzh.substring(10,12)
        return year+'-'+month+'-'+day;
    }
}
function getSex(sfzh){
    if(sfzh.length==18)
        return (sfzh.charAt(16)%2==0?'2':'1')
    if(sfzh.length==15)
        return (sfzh.charAt(14)%2==0?'2':'1')
}
function getAge(sfzh){
    if(sfzh == ""){
      return 0;
    }
    if(sfzh.length == 18){
      var birthYear = sfzh.substring(6, 10);
      var birthMonth = sfzh.substring(10, 12);
      var birthDay = sfzh.substring(12, 14);
    }
    if (sfzh.length == 15){
      var birthYear = sfzh.substring(6, 10);
      var birthMonth = sfzh.substring(10, 12);
      var birthDay = sfzh.substring(12, 14);
    }
    var date = new Date();
    var currentYear = date.getFullYear();
    var currentMonth = date.getMonth() + 1;
    var currentDay = date.getDate();

    var age = currentYear - birthYear -1;
    if (currentMonth > birthMonth || ((currentMonth == birthMonth) && (currentDay >= birthDay))){
      age++;
    }
    return age;
}

//检查各种数据格式
function checkSjhm(sjhm){
	if(/^1\d{10}$/.test(sjhm)){
		return true;
	}else{
		return false;
	}
}
var aCity = { 11: "北京", 12: "天津", 13: "河北", 14: "山西", 15: "内蒙古", 21: "辽宁", 22: "吉林", 23: "黑龙江", 31: "上海", 32: "江苏", 33: "浙江", 34: "安徽", 35: "福建", 36: "江西", 37: "山东", 41: "河南", 42: "湖北", 43: "湖南", 44: "广东", 45: "广西", 46: "海南", 50: "重庆", 51: "四川", 52: "贵州", 53: "云南", 54: "西藏", 61: "陕西", 62: "甘肃", 63: "青海", 64: "宁夏", 65: "新疆", 71: "台湾", 81: "香港", 82: "澳门", 91: "国外" };
function checkSfzh(sfzh_input) {
  var sfzh = sfzh_input.toUpperCase();
  // console.log(sfzh);
  var iSum = 0;
  var info = "";
  if (!/^\d{17}(\d|x)$/i.test(sfzh)){
    //console.log("身份证长度或格式错误");
    return false; 
  }
  
  sfzh = sfzh.replace(/x$/i, "a");
  if (aCity[parseInt(sfzh.substr(0, 2))] == null){
    //console.log("身份证地区非法");
    return false;
    //return "身份证地区非法";
  }
    
  var sBirthday = sfzh.substr(6, 4) + "-" + Number(sfzh.substr(10, 2)) + "-" + Number(sfzh.substr(12, 2));
  var d = new Date(sBirthday.replace(/-/g, "/"));
  if (sBirthday != (d.getFullYear() + "-" + (d.getMonth() + 1) + "-" + d.getDate())){
    //console.log("身份证上的出生日期非法");
    return false;
    //return "身份证上的出生日期非法";
  }  
    
  for (var i = 17; i >= 0; i--) 
    iSum += (Math.pow(2, i) % 11) * parseInt(sfzh.charAt(17 - i), 11);
  if (iSum % 11 != 1) 
    return false;
  //aCity[parseInt(sfzh.substr(0,2))]+","+sBirthday+","+(sfzh.substr(16,1)%2?"男":"女");//此次还可以判断出输入的身份证号的人性别
  return true;

}
function checkYymm(yymm) {
  if (yymm.length > 18 || yymm.length < 6) {
    return false;
  } else {
    return true;
  }
}
function checkBrxm(brxm) {
  var length = brxm.replace(/[^\x00-\xff]/g, "cc").length;
  console.log(length);
  if (length < 4 || length > 12) {
    return false;
  } else {
    return true;
  }
}

//自定义button ajax的显示效果，基于bootStrap
function startButtonLoading(button){
	button.attr('disabled',"true");
	button.text('提交中..');
}
function closeButtonLoading(button){
	button.removeAttr('disabled')
	button.text('提交');
}

//(new Date()).Format("yyyy-MM-dd hh:mm:ss.S")
Date.prototype.Format = function(fmt)   
{ //author: meizz   
  var o = {   
    "M+" : this.getMonth()+1,                 //月份   
    "d+" : this.getDate(),                    //日   
    "h+" : this.getHours(),                   //小时   
    "m+" : this.getMinutes(),                 //分   
    "s+" : this.getSeconds(),                 //秒   
    "q+" : Math.floor((this.getMonth()+3)/3), //季度   
    "S"  : this.getMilliseconds()             //毫秒   
  };   
  if(/(y+)/.test(fmt))   
    fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));   
  	for(var k in o)   
  		if(new RegExp("("+ k +")").test(fmt))   
  			fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));   
  return fmt;   
}  

//删除数组中的值
Array.prototype.indexOf = function(val) { 
	for (var i = 0; i < this.length; i++) { 
	if (this[i] == val) 
		return i; 
	} 
	return -1; 
}
Array.prototype.remove = function(val) { 
	var index = this.indexOf(val); 
	if (index > -1) { 
		this.splice(index, 1); 
	} 
}