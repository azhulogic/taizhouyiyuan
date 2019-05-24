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
	    <title>高级人才信息表</title>
		<link rel="stylesheet" href="Mottie-tablesorter-2.14.3/addons/pager/jquery.tablesorter.pager.css">
		<link rel="stylesheet" href="bootstrap-4.1.3-dist/css/bootstrap.css">
		<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="toastr/toastr.min.css">
		
	</head>
	<body>		
		<div class = "container-fluid">
			<h1>肥胖</h1>
肥胖对人体有哪些危害？
肥胖可增加机体脏器的负担,加速衰老的进程,同时又使心血管病、糖尿病、肝胆疾病、骨关节炎及痛风症等发病率明显增高。被世界卫生组织列为导致疾病负担的十大危险因素之一。据相关报道，肥胖与慢性病的关系密切，大家可以来看一组数据：90%合并脂肪肝、60%合并高血压、30%合并高脂血症、20%合并糖尿病；可见肥胖对人体可谓有百害而无一益。
<!-- 有哪些原因可引起肥胖？
肥胖的原因比较明确的因素主要有遗传因素，比如说父母中有特别胖的，那么他得肥胖的可能性就比一般的人要大得多；第二个最主要的因素是生活方式，也就是我们平时所说的多吃少动。有一句老话是这样说的：一口吃不出胖子，而胖子却是一口一口吃出来的，日复一日的饮食过量就吃成了胖子了。还有一个对我们现在的城市居民来说就是体力活动的减少，吃得多动得少成了肥胖的主要病因了。还有部分女性在孕期由于不合理的营养导致体重增长过多，如果产后仍然不注意合理饮食和适当锻炼，也会引起成年肥胖。随着二胎政策开放后出生率的增长，由于怀孕不合理饮食造成的肥胖人群也在不断增多。
如何评价自己的体重是否超标？
答：测一测体重：家里买个体重称，称体重的时间固定，最好都选在早上空腹时，穿轻薄衣服，每周至少测体重一次。评价方法：用身高（厘米）— 105=理想体重（公斤），在这个标准范围的正负10%以内，就说明体重正常，超过10%，体重超重了，超过20%，就说明肥胖了。
体质指数如何来计算和评价？
答：算一算体质指数：体重评价的另一个比较精确的标准就是体质指数。体重指数（BMI）：直立、免冠、脱鞋并仅穿内衣情况下测体重及身高。
BMI=体重(kg)/身长 (m)2，正常值为18.5-23.9，说明体重在比较标准的范围之内；小于18.5说明偏瘦了，需增加体重；在24.0-27.9之间，说明体重超重了，台州人体重在这一档的人比较多，看上去胖了。如果大于28.0说明是肥胖症了。
以上两个方法可请专业的营养医师来帮您评价你的体重是否正常。
超重或肥胖的评判标准
（1）休质指数BMI≥24  
（2）体脂率：女性体脂率≥28%，男性体脂率≥20%
（3）腰围：男性腰围≥90cm、女性腰围≥85cm
腰粗也是肥胖吗？
答：量一量：测量腰围和臀围。腰围找最细，臀围找最粗的地方测量。那我们的腰围多少是否也有标准的呢？中国肥胖问题工作组 ：男性＞85cm，女性＞80cm 为腹部脂肪蓄积的诊断界值。应该说腹部肥胖的危害性比体重超标更大，有些中老年女性由于体力活动较少，四肢肌肉不发达，但腹部脂肪却堆积较多。所以我们中国人男性的腰围不要超过2尺6，女性腰围不要超过2尺4。超过这个标准就是肥胖了。
腰粗腹大有哪些危害？
答：不少老百姓看上去体重比较高，肚皮也大，一看就是肥胖的样子。还有些人体重没超标，但是肚皮大腰杆粗，我们台州俗称啤酒肚，按脂肪组织块的分布， 分为两种体型：中心性肥胖者脂肪主要分布在腹腔和腰部，多见于男性，又称为内脏型、苹果型、男性型；另一型多见于女性，脂肪主要分布在腰以下， 如下腹部、臀部、大腿，称为梨型、女性型。苹果型发生各种慢性病的的危险性大于梨型。
成人如何预防肥胖？
答：最根本的预防措施是平衡膳食、适量运动；适当控制进食量，自觉避免高能量、高脂肪饮食，膳食不宜过油、过甜和过多，增加粗粮和蔬菜；同时，注意体育锻炼并做到持之以恒，如游泳、爬山、跑步、骑自行车、打乒乓球等运动，均有助于减肥，一旦停止体育锻炼，体重还会恢复到肥胖状态。 
儿童如何预防肥胖？
答：预防肥胖应从婴幼儿开始，哺乳期提倡母乳喂养，如人工喂养应避免过度喂养。孩子稍大后，培养爱活动、少吃零食、不暴食等良好的生活及饮食习惯，随着年龄的增长应及时调整日常饮食与作息，避免体内能量过剩，定时测量体重，按标准体重来进行评价。有肥胖家族史的人更应重视早防早治。在平时的生活中，家长应教育孩子尽量不吃校门口的各式点心及奶茶类食物。也不得以带孩子去吃肯德基等洋快餐作为对孩子的奖励在。
肥胖患者体重该怎么减重？
答：肥胖主要的非药物减肥方法主要是合理饮食加运动。现在社会上关于减肥的讲法各式各样，不少减肥机构甚至说一个月让你体重减少20-30斤。肥胖治疗的最终目的是体重平稳地控制在理想范围内。一般来说，在饮食疗法开始后的1-2个月内，可减重3-4公斤，以后保持每月减重2公斤左右。
不吃主食来减肥，这样可行吗？
答：不少肥胖的人由于减肥心切，会认为自己肥胖就是由于米饭吃多了，所以为了在短时间内把体重降下来，就不吃主食，实际上这样做是不可取的。成年人如果每天主食量不到3两甚至不吃主食，时间长了会使脑细胞造成能量不足，影响人的大脑功能，所以不能因为减肥把自己的脑子受到伤害了。在减肥饮食中是有规定的，每天的主食量不能少于3两。
肥胖患者每天大致可吃哪些食物？
答：肥胖患者的控制体重主要是通过合理控制每天饮食中的总能量来实现。主食在原来的基础上进行适当控制，每天主食3-4两，并可选择低脂优质蛋白的食物，如低脂牛奶、鱼、鸡蛋白、牛肉等食物，每天总量为150-200克左右。蔬菜每天可以吃500克。
肥胖患者烹调要注意哪些问题？
答：肥胖患者在选择食用油时，应选择植物油，不用猪油等动物油；同时，每天烹调用油的数量应控制在半两以内，每个月的用油量控制在一斤半以内。食盐每天限制在6克以内，也就是一啤酒瓶盖子的容量。肥胖患者在日常烹调食物时，可采用清蒸、水煮、汆水等低脂的烹调方法；忌用油煎炸，每天定时定量规律进进餐，一般每天进食3餐。
肥胖患者饮食有哪些禁忌？
答：我们可以把在肥胖的饮食分为红、黄、绿灯食物三大类；红灯食物是要严格限制的，如如肥肉、油炸食物、甜点、洋快餐食物等，黄灯食物则可以按定量食用，不能吃超了，如谷类食品、薯类食品、全蛋类食品、香蕉、葡萄和柑桔等水果。吃多了容易达不到减肥的目的。应保证的食品：瘦肉、鱼和海产品、蛋白、脱脂奶类、豆制品、蔬菜和含糖低各种水果等，肥胖朋友每天应保证此类食品的用量，以满足营养需要。
民间流传的减肥食物能真的可以吗？
答：由于肥胖人群的众多，民间也有许多流传的减肥食物神器，如有人说土豆能减肥，有人说南瓜能减肥，等等。在这里提醒一下各位肥胖人士，在选择任何食物的时候请先考虑食物的数量和每天的总能量平衡。不能在原先的饮食数量的基础上再加吃所谓的减肥食物，不仅不能减肥，还会引起引起能量超标。
控制体重时感到很饿怎么办？
答：让家人鼓励你进行体重控制，按照规定食物数量进食后仍感到 很饿时，可多多喝水，可以饮用有点味道的淡茶水；想吃东西时就去走走，做点简单的运动分散注意力；或者是把一天的食物分成少量多餐，总量不超；适当采用黄瓜等低糖蔬菜或燕麦等食物来增加饱腹感。体重控制在一个长期的过程，贵在坚持正确的生活方式。
 -->
		</div>
		<script src="js/jquery-1.9.1.js"></script>
		<script src="js/util.js"></script>
		<script src="bootstrap-4.1.3-dist/js/bootstrap.js"></script>
		<script type="text/javascript">	
			
		</script>
	</body>
</html>