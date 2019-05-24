package com.ezsoft.action;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezsoft.domain.HealthInfo;
import com.ezsoft.domain.SeniorTalent;
import com.ezsoft.service.SeniorTalentService;
import com.ezsoft.util.CommonUtil;
import com.ezsoft.util.MybatisUtils;
import com.opensymphony.xwork2.ActionSupport;

public class HealthInfoSubmitSuccessAction extends ActionSupport {
	@Autowired
    private SeniorTalentService seniorTalentService;
	
	private String sfzh;
	private String BMI;
	private double bztz;
	private String bmiDescr;
	private String bmiAdvice;
	private String abnormalStr;
	private String key;
	private String msg;

	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public String getBMI() {
		return BMI;
	}
	public void setBMI(String bMI) {
		BMI = bMI;
	}
	public double getBztz() {
		return bztz;
	}
	public void setBztz(double bztz) {
		this.bztz = bztz;
	}
	public String getBmiDescr() {
		return bmiDescr;
	}
	public void setBmiDescr(String bmiDescr) {
		this.bmiDescr = bmiDescr;
	}
	public String getBmiAdvice() {
		return bmiAdvice;
	}
	public void setBmiAdvice(String bmiAdvice) {
		this.bmiAdvice = bmiAdvice;
	}
	public String getAbnormalStr() {
		return abnormalStr;
	}
	public void setAbnormalStr(String abnormalStr) {
		this.abnormalStr = abnormalStr;
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
				
		SqlSession sqlSession = MybatisUtils.openSession();
		List<String> abnormalArray = new ArrayList<String>();
		double BMI = 0;
		double bztz = 0;
		try {
			SeniorTalent seniorTalent =  sqlSession.selectOne("com.ezsoft.mapper.selectSeniorTalent_sfzh2",sfzh);
			int brxb = seniorTalent.getBrxb();
			Timestamp csny = seniorTalent.getCsny();
			Calendar calBirth = Calendar.getInstance();
			calBirth.setTimeInMillis(csny.getTime());
			int age = CommonUtil.getAge(calBirth);
			seniorTalent.setAge(age);;
			String brxbShow = "";
			if(brxb == 1){
				brxbShow = "男";
			}else if(brxb == 2){
				brxbShow = "女";
			}
			seniorTalent.setBrxbShow(brxbShow);
			
			double height = seniorTalent.getHeight();
			double weight = seniorTalent.getWeight();
			bztz = height * 100 - 105;
			BMI = weight/(height * height);
			if(BMI < 18.5){
				abnormalArray.add("消瘦");
				this.bmiDescr = "体重过低，相关疾病发病的危险性低，但其它疾病危险性增加";
				this.bmiAdvice = "强化饮食营养补充，多作中强度的增肌锻炼！";
			}else if(BMI >= 18.5 && BMI < 24){
				this.bmiDescr = "正常范围，相关疾病发病的危险性平均水平";
				this.bmiAdvice = "继续保持，注意均衡饮食，保持良好的作息，适当锻炼！";
			}else if(BMI >= 24 && BMI <= 27.9){
				abnormalArray.add("超重");
				this.bmiDescr = "超重范围，相关疾病发病的危险性增加";
				this.bmiAdvice = "注意均衡饮食，减少油脂摄入，适当锻炼！";
			}else if(BMI >= 28){
				abnormalArray.add("肥胖");
				this.bmiDescr = "肥胖范围，相关疾病发病的危险性严重增加";
				this.bmiAdvice = "杜绝零食，调整饮食，增加锻炼，减轻体重！";
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
				/*if((xmmxNo == 35 && ("3年以上".equals(value)))
						||(xmmxNo == 1 && (!StringUtils.isBlank(value)))
						){
					isDiseaseBad = true;
				}*/
				if(xmmxNo == 1 && !StringUtils.isBlank(value) && !"无".equals(value)){
					String[] diseaseArray = value.split(",");
					for(String disease : diseaseArray){
						abnormalArray.add(disease);
					}
				}
				if(xmmxNo == 1 && !StringUtils.isBlank(extraValue)){
					String[] diseaseArray = extraValue.split(",");
					for(String disease : diseaseArray){
						abnormalArray.add(disease);
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
		} catch(Exception e){
			sqlSession.rollback();
		} finally {
			sqlSession.close();
		}
		DecimalFormat df = new DecimalFormat("#.0");		
		this.BMI = df.format(BMI);
		this.bztz = bztz;
		String abnormalStr = CommonUtil.list2Str(abnormalArray);
		this.abnormalStr = abnormalStr;
		return SUCCESS;
	}
}
