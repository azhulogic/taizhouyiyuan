package com.ezsoft.action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezsoft.domain.DiseaseInfo;
import com.ezsoft.domain.HealthInfo;
import com.ezsoft.domain.HealthResultXm;
import com.ezsoft.domain.HealthResultXmmx;
import com.ezsoft.domain.OrderPrint;
import com.ezsoft.domain.OrderPrintDocSuggest;
import com.ezsoft.domain.OrderPrintExtraHealthResult;
import com.ezsoft.domain.OrderPrintGoal;
import com.ezsoft.domain.OrderPrintGoalEval;
import com.ezsoft.domain.OrderPrintGoalXm;
import com.ezsoft.domain.OrderPrintGoalXmmx;
import com.ezsoft.domain.OrderPrintHealthResult;
import com.ezsoft.domain.SeniorTalent;
import com.ezsoft.service.OrderPrintGoalService;
import com.ezsoft.service.OrderPrintService;
import com.ezsoft.util.CommonUtil;
import com.ezsoft.util.MybatisUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SeniorTalentOrderPrintAction extends ActionSupport{
	@Autowired
    private OrderPrintService orderPrintService;
	@Autowired
    private OrderPrintGoalService orderPrintGoalService;
	
	private String sfzh;
	private int jlxh;
	private SeniorTalent seniorTalent;
	private List<String> abnormalArray;
	private List<OrderPrintGoalXm> orderPrintGoalXmList;
	private List<OrderPrintGoalXm> orderPrintGoalXmShowList;
	private List<HealthResultXm> healthResultXmList;
	private List<OrderPrintDocSuggest> orderPrintDocSuggestList;
	private List<OrderPrintExtraHealthResult> orderPrintExtraHealthResultList;
	private OrderPrint orderPrint;
	private String[] ysdRowNameArray;
	private List<OrderPrintGoal> orderPrintGoals;
	private List<DiseaseInfo> diseaseInfoList;
	private String key;
	private String msg;
	
	public String getSfzh() {
		return sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	public int getJlxh() {
		return jlxh;
	}

	public void setJlxh(int jlxh) {
		this.jlxh = jlxh;
	}

	public SeniorTalent getSeniorTalent() {
		return seniorTalent;
	}

	public void setSeniorTalent(SeniorTalent seniorTalent) {
		this.seniorTalent = seniorTalent;
	}

	public List<String> getAbnormalArray() {
		return abnormalArray;
	}

	public void setAbnormalArray(List<String> abnormalArray) {
		this.abnormalArray = abnormalArray;
	}

	public List<OrderPrintGoalXm> getOrderPrintGoalXmList() {
		return orderPrintGoalXmList;
	}

	public void setOrderPrintGoalXmList(List<OrderPrintGoalXm> orderPrintGoalXmList) {
		this.orderPrintGoalXmList = orderPrintGoalXmList;
	}

	public List<OrderPrintGoalXm> getOrderPrintGoalXmShowList() {
		return orderPrintGoalXmShowList;
	}

	public void setOrderPrintGoalXmShowList(List<OrderPrintGoalXm> orderPrintGoalXmShowList) {
		this.orderPrintGoalXmShowList = orderPrintGoalXmShowList;
	}

	public List<HealthResultXm> getHealthResultXmList() {
		return healthResultXmList;
	}

	public void setHealthResultXmList(List<HealthResultXm> healthResultXmList) {
		this.healthResultXmList = healthResultXmList;
	}

	public List<OrderPrintDocSuggest> getOrderPrintDocSuggestList() {
		return orderPrintDocSuggestList;
	}

	public void setOrderPrintDocSuggestList(List<OrderPrintDocSuggest> orderPrintDocSuggestList) {
		this.orderPrintDocSuggestList = orderPrintDocSuggestList;
	}

	public List<OrderPrintExtraHealthResult> getOrderPrintExtraHealthResultList() {
		return orderPrintExtraHealthResultList;
	}

	public void setOrderPrintExtraHealthResultList(List<OrderPrintExtraHealthResult> orderPrintExtraHealthResultList) {
		this.orderPrintExtraHealthResultList = orderPrintExtraHealthResultList;
	}

	public OrderPrint getOrderPrint() {
		return orderPrint;
	}

	public void setOrderPrint(OrderPrint orderPrint) {
		this.orderPrint = orderPrint;
	}

	public String[] getYsdRowNameArray() {
		return ysdRowNameArray;
	}

	public void setYsdRowNameArray(String[] ysdRowNameArray) {
		this.ysdRowNameArray = ysdRowNameArray;
	}

	public List<OrderPrintGoal> getOrderPrintGoals() {
		return orderPrintGoals;
	}

	public void setOrderPrintGoals(List<OrderPrintGoal> orderPrintGoals) {
		this.orderPrintGoals = orderPrintGoals;
	}

	public List<DiseaseInfo> getDiseaseInfoList() {
		return diseaseInfoList;
	}

	public void setDiseaseInfoList(List<DiseaseInfo> diseaseInfoList) {
		this.diseaseInfoList = diseaseInfoList;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	//private static Logger logger = LogManager.getLogger(SeniorTalentHealthResultAction.class);
	public String execute(){
		//验证传参
		if(sfzh == null || key == null){
			this.msg = "验证失败";
			return ERROR;
		}
		int md5Vaild = CommonUtil.getMd5Vaild(sfzh, key);
		if(md5Vaild == 0){
			this.msg = "验证失败";
			return ERROR;
		}
		
		//添加session
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		session.put("sfzh", sfzh);
		
		//饮食单表格信息
				String[] ysdRowNameArray = {"谷薯类(两)", "蔬菜类(斤)", "低糖水果类（两）", "水产肉蛋类（两）", "豆浆乳类(斤)", "油脂类（汤勺）"};
				this.ysdRowNameArray = ysdRowNameArray;
				
				SqlSession sqlSession = MybatisUtils.openSession();
				
				try {
					SeniorTalent seniorTalent =  sqlSession.selectOne("com.ezsoft.mapper.selectSeniorTalent_sfzh2",sfzh);
					int brxb = seniorTalent.getBrxb();
					Date csny = seniorTalent.getCsny();
					Calendar calBirth = Calendar.getInstance();
					calBirth.setTimeInMillis(csny.getTime());
					int age = CommonUtil.getAge(calBirth);
					seniorTalent.setAge(age);
					String brxbShow = "";
					if(brxb == 1){
						brxbShow = "男";
					}else if(brxb == 2){
						brxbShow = "女";
					}
					seniorTalent.setBrxbShow(brxbShow);
					this.seniorTalent = seniorTalent;
					
					//获取disease列表
					List<DiseaseInfo> diseaseInfoList = sqlSession.selectList("com.ezsoft.mapper.selectSeniorTalent_diseaseInfo_neccessary");
					this.diseaseInfoList = diseaseInfoList;
					
					//计划书详情
					List<OrderPrint> orderPrintList = orderPrintService.selectBySfzh(sfzh);
					this.orderPrint = orderPrintList.get(0);
					
					this.orderPrintGoals = orderPrintGoalService.selectBySfzh(sfzh);
					
					List<String> abnormalArray = new ArrayList<String>();
					//提取高血压 糖尿病 高血脂
					List<String> abnormalArray2 = new ArrayList<String>();
					double height = seniorTalent.getHeight();
					double weight = seniorTalent.getWeight();
					double BMI = weight/(height * height);
					if(BMI < 18.5){
						abnormalArray.add("消瘦");
					}else if(BMI > 24 && BMI < 27.9){
						abnormalArray.add("超重");
					}else if(BMI > 28){
						abnormalArray.add("肥胖");
					}
					List<HealthInfo> healthInfoList = sqlSession.selectList("com.ezsoft.mapper.selectSeniorTalent_healthInfoList", sfzh);
					//膳食结构不合理判断
					boolean isSfjgNotNornal = false;
					//喝水太少
					boolean isDrinkWaterLess = false;
					//不良饮食习惯
					boolean isEatingHabitsBad = false;
					//久坐不动、极度缺乏体育锻炼
					boolean isSittingDlBad = false;
					boolean isSittingDlBad1 = false;
					boolean isSittingDlBad2 = false;
					//吸烟
					boolean isSmokeBad = false;
					//酗酒
					boolean isDrinkBad = false;
					//睡眠严重不足、熬夜
					boolean isSleepBad = false;
					//精神压力大
					boolean isSpiritBad = false;
					//疾病状态
					Boolean isDiseaseBad = false;
					for(int i = 0; i < healthInfoList.size(); i++){
						HealthInfo healthInfo = healthInfoList.get(i);
						int xmmxNo = healthInfo.getXmmxNo();
						String value = healthInfo.getValue();
						String extraValue = healthInfo.getExtraValue();
						if(((xmmxNo >= 37 && xmmxNo <= 46) && ("不足".equals(value) || "超量".equals(value)))
								){
							isSfjgNotNornal = true;
						}
						if((xmmxNo == 47 && ("不足".equals(value)))
								){
							isDrinkWaterLess = true;
						}
						if((xmmxNo == 15 && ("没有".equals(value) || "1~2天".equals(value)))
								||(xmmxNo == 16 && ("3~5天".equals(value) || "5~7天".equals(value)))
								||(xmmxNo == 17 && (value.contains("甜") || value.contains("辣") || value.contains("烫") || value.contains("煎炸") || value.contains("油腻") || value.contains("腌熏")))
								){
							isEatingHabitsBad = true;
						}
						if((xmmxNo == 19 && ("≥8小时".equals(value))) 
								){
							isSittingDlBad1 = true;
						}
						if((xmmxNo == 21 && ("不锻炼".equals(value) || "＜0.5小时".equals(value)))
								){
							isSittingDlBad2 = true;
						}
						isSittingDlBad = isSittingDlBad1 && isSittingDlBad2;
						if((xmmxNo == 23 && ("经常".equals(value)))
								){
							isSmokeBad = true;
						}
						if(xmmxNo == 29 && ("4~8两".equals(value)) || ("≥8两".equals(value))
								){
							isDrinkBad = true;
						}
						if(xmmxNo == 34 && ("严重不足".equals(value))
								){
							isSleepBad = true;
						}
						if(xmmxNo == 33 && ("很大".equals(value))
								){
							isSpiritBad = true;
						}
						if(xmmxNo == 1 && !StringUtils.isBlank(extraValue)){
							String[] diseaseArray = extraValue.split(",");
							for(String disease : diseaseArray){
								abnormalArray.add(disease);
							}
						}
						if(xmmxNo == 1 && !StringUtils.isBlank(value) && !"无".equals(value)){
							String[] diseaseArray = value.split(",");
							for(String disease : diseaseArray){
								abnormalArray2.add(disease);
							}
						}
					}
					if(isSfjgNotNornal){
						abnormalArray.add("膳食结构不合理");
					}
					if(isDrinkWaterLess){
						abnormalArray.add("喝水太少");
					}
					if(isEatingHabitsBad){
						abnormalArray.add("不良饮食习惯");
					}
					if(isSittingDlBad){
						abnormalArray.add("久坐不动、极度缺乏体育锻炼");
					}
					if(isSmokeBad){
						abnormalArray.add("吸烟");
					}
					if(isDrinkBad){
						abnormalArray.add("饮酒过量");
					}
					if(isSleepBad){
						abnormalArray.add("睡眠严重不足、熬夜");
					}
					if(isSpiritBad){
						abnormalArray.add("精神压力大");
					}
					if(isDiseaseBad){
						//abnormalArray.add("健康问题");
					}
					this.abnormalArray = abnormalArray;
					
					List<HealthResultXm> healthResultXmList = sqlSession.selectList("com.ezsoft.mapper.selectHealthResultXm");
					
					List<HealthResultXmmx> healthResultXmmxList = sqlSession.selectList("com.ezsoft.mapper.selectHealthResultXmmx");
					List<OrderPrintHealthResult> OrderPrintHealthResultList = sqlSession.selectList("com.ezsoft.mapper.selectOrderPrintHealthResult", sfzh);
					List<HealthResultXm> healthResultXmList2 = new ArrayList<HealthResultXm>();
					
					
					
					boolean isChecked = false;
					for(int i = 0; i < healthResultXmList.size(); i++){
						isChecked = false;
						HealthResultXm healthResultXm = healthResultXmList.get(i);
						String xmName = healthResultXm.getXmName();
						//高血压 高血糖 高脂血症
						if("高血压".equals(xmName) || "高血糖".equals(xmName) || "高脂血症".equals(xmName)){
							if("高血压".equals(xmName)){
								for(String abnormal : abnormalArray2){
									if("高血压".equals(abnormal)){
										isChecked = true;
										break;
									}
								}
							}
							if("高血糖".equals(xmName)){
								for(String abnormal : abnormalArray2){
									if("糖尿病".equals(abnormal)){
										isChecked = true;
										break;
									}
								}
							}
							if("高脂血症".equals(xmName)){
								for(String abnormal : abnormalArray2){
									if("高血脂".equals(abnormal)){
										isChecked = true;
										break;
									}
								}
							}
						}
						List<HealthResultXmmx> healthResultXmmxList2 = new ArrayList<HealthResultXmmx>();
						for(int j = 0; j < healthResultXmmxList.size(); j++){
							HealthResultXmmx healthResultXmmx = healthResultXmmxList.get(j);
							int xmmxNo = healthResultXmmx.getHealthResultXmmxNo();
							if(healthResultXmmx.getHealthResultXmNo() == healthResultXm.getXmNo()){
								for(int k = 0; k < OrderPrintHealthResultList.size(); k++){
									OrderPrintHealthResult orderPrintHealthResult = OrderPrintHealthResultList.get(k);
									if(xmmxNo == orderPrintHealthResult.getHealthResultXmmxNo()){
										healthResultXmmx.setOrderPrintHealthResult(orderPrintHealthResult);
									}
								}
								healthResultXmmxList2.add(healthResultXmmx);
							}
						}
						healthResultXm.setHealthResultXmmxList(healthResultXmmxList2);
						healthResultXm.setChecked(isChecked);
						healthResultXmList2.add(healthResultXm);
					}
					this.healthResultXmList = healthResultXmList2;
					
					List<OrderPrintExtraHealthResult> orderPrintExtraHealthResultList = sqlSession.selectList("com.ezsoft.mapper.selectOrderPrintExtraHealthResult", sfzh);
					this.orderPrintExtraHealthResultList = orderPrintExtraHealthResultList;
					//健康管理目标
					/*List<OrderPrintGoalXm> orderPrintGoalXmList = sqlSession.selectList("com.ezsoft.mapper.selectOrderPrintGoalXm");
					List<OrderPrintGoalXmmx> orderPrintGoalXmmxList = sqlSession.selectList("com.ezsoft.mapper.selectOrderPrintGoalXmmx");
					
					List<OrderPrintGoal> orderPrintGoalList = sqlSession.selectList("com.ezsoft.mapper.selectOrderPrintGoal", sfzh);
					List<OrderPrintGoalEval> orderPrintGoalEvalList = sqlSession.selectList("com.ezsoft.mapper.selectOrderPrintGoalEval", sfzh); //目标评估
					//List<OrderPrintGoal> orderPrintGoalShowList = sqlSession.selectList("com.ezsoft.mapper.selectOrderPrintGoalShow", sfzh);
					List<OrderPrintGoalXm> orderPrintGoalXmList2 = new ArrayList<OrderPrintGoalXm>();
					//List<OrderPrintGoalXm> orderPrintGoalXmShowList = new ArrayList<OrderPrintGoalXm>();
					for(int i = 0; i < orderPrintGoalXmList.size(); i++){
						OrderPrintGoalXm orderPrintGoalXm = orderPrintGoalXmList.get(i);
						//OrderPrintGoalXm orderPrintGoalXmShow = orderPrintGoalXmList.get(i);
						int goalXmNo = orderPrintGoalXm.getXmNo();
						List<OrderPrintGoalXmmx> orderPrintGoalXmmxList2 = new ArrayList<OrderPrintGoalXmmx>();
						//List<OrderPrintGoalXmmx> orderPrintGoalXmmxShowList = new ArrayList<OrderPrintGoalXmmx>();
						for(int j = 0; j < orderPrintGoalXmmxList.size(); j++){
							OrderPrintGoalXmmx orderPrintGoalXmmx = orderPrintGoalXmmxList.get(j);
							int goalXmmxNo = orderPrintGoalXmmx.getGoalXmmxNo();
							if(goalXmNo == orderPrintGoalXmmx.getHealthResultXmNo()){
								for(int k = 0; k < orderPrintGoalList.size(); k++){
									OrderPrintGoal orderPrintGoal = orderPrintGoalList.get(k);
									if(goalXmmxNo == orderPrintGoal.getGoalXmmxNo()){
										orderPrintGoalXmmx.setOrderPrintGoal(orderPrintGoal);
										int goalNo = orderPrintGoal.getJlxh();
										List<OrderPrintGoalEval> orderPrintGoalEvalList2 = new ArrayList<OrderPrintGoalEval>();
										for(int m = 0; m < orderPrintGoalEvalList.size(); m++){
											OrderPrintGoalEval orderPrintGoalEval = orderPrintGoalEvalList.get(m);
											if(goalNo == orderPrintGoalEval.getGoalNo()){
												orderPrintGoalEvalList2.add(orderPrintGoalEval);
											}
										}
										orderPrintGoalXmmx.setOrderPrintGoalEvalList(orderPrintGoalEvalList2);
										break;
									}
								}
								orderPrintGoalXmmxList2.add(orderPrintGoalXmmx);
							}
						}
						
						orderPrintGoalXm.setOrderPrintGoalXmmxList(orderPrintGoalXmmxList2);
						orderPrintGoalXmList2.add(orderPrintGoalXm);
						//orderPrintGoalXmShow.setOrderPrintGoalXmmxList(orderPrintGoalXmmxShowList);
						//orderPrintGoalXmShowList.add(orderPrintGoalXmShow);
					}
					this.orderPrintGoalXmList = orderPrintGoalXmList2;*/
					//this.orderPrintGoalXmShowList = orderPrintGoalXmShowList;


					List<OrderPrintDocSuggest> orderPrintDocSuggestList = sqlSession.selectList("com.ezsoft.mapper.selectOrderPrintDocSuggest", sfzh);
					this.orderPrintDocSuggestList = orderPrintDocSuggestList;
				} catch(Exception e){
					e.printStackTrace();
				} finally {
					sqlSession.close();
				}

		return SUCCESS;
	}
}
