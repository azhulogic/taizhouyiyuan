package com.ezsoft.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezsoft.domain.HealthInfo;
import com.ezsoft.domain.SeniorTalent;
import com.ezsoft.domain.SeniorTalentRcjc;
import com.ezsoft.service.SeniorTalentRcjcService;
import com.ezsoft.util.CommonUtil;
import com.ezsoft.util.MybatisUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 默认 code = 1
 */

public class AjaxAction extends ActionSupport {
	private String param;
	
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	@Autowired
    private SeniorTalentRcjcService seniorTalentRcjcService; 
	
	private static Logger logger = LogManager.getLogger(AjaxAction.class);
 
	public String execute(){
		JSONObject paramJson = new JSONObject(param);
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		JSONObject resultJson = new JSONObject();
		String code = "1";
		String msg = "";
		String act = paramJson.getString("act");
		SqlSession sqlSession = MybatisUtils.openSession();
		
		try{
			if("submitHealthInfo".equals(act)){
				JSONArray healthInfoList = paramJson.getJSONArray("healthInfoNoList");
				String sfzh = paramJson.getString("sfzh");
				String createYgdm = paramJson.getString("createYgdm");
				
				double height = paramJson.getDouble("height");
				double weight = paramJson.getDouble("weight");
				String gms = paramJson.getString("gms");
				String extraGms = paramJson.getString("extraGms");
				String lxdz = paramJson.getString("lxdz");
				String education = paramJson.getString("education");
				String unit = paramJson.getString("unit");
				String bloodType = paramJson.getString("bloodType");
				String marriage = paramJson.getString("marriage");
				String profession = paramJson.getString("profession");
				String mzhm = paramJson.getString("mzhm");
				int topBloodPressure = paramJson.getInt("topBloodPressure");
				int downBloodPressure = paramJson.getInt("downBloodPressure");
				int bloodSugar = paramJson.getInt("bloodSugar");
				
				if(healthInfoList.length() == 0){
					code = "0";
					msg = "没有填写选择项目的信息";
				}else if(height <= 0 || weight <= 0 || height > 9.99 || weight > 999.9){
					code = "0";
					msg = "身高范围为0~9.99m, 体重范围为0~999.9kg";
				}else if(StringUtils.isBlank(gms)){
					code = "0";
					msg = "过敏史不能为空";
				}else{
					SeniorTalent seniorTalent = new SeniorTalent();
					seniorTalent.setSfzh(sfzh);
					seniorTalent.setHeight(height);
					seniorTalent.setWeight(weight);
					seniorTalent.setGms(gms);
					seniorTalent.setExtraGms(extraGms);
					seniorTalent.setLxdz(lxdz);
					seniorTalent.setEducation(education);
					seniorTalent.setUnit(unit);
					seniorTalent.setBloodType(bloodType);
					seniorTalent.setMarriage(marriage);
					seniorTalent.setProfession(profession);
					seniorTalent.setMzhm(mzhm);
					seniorTalent.setTopBloodPressure(topBloodPressure);
					seniorTalent.setDownBloodPressure(downBloodPressure);
					seniorTalent.setBloodSugar(bloodSugar);
					
					sqlSession.update("com.ezsoft.mapper.healthInfo_updateSeniorTalent", seniorTalent);
					
					for(int i = 0; i < healthInfoList.length(); i++){
						JSONObject healthInfoJson = healthInfoList.getJSONObject(i);
						String healthInfoName = healthInfoJson.getString("name");
						String healthInfoValue = healthInfoJson.getString("value");
						String extraValue = healthInfoJson.getString("extraValue");
						String xmXmmxNoStr = healthInfoName.substring(4);
						String[] xmXmmxNo = xmXmmxNoStr.split("_");
						int xmNo = Integer.valueOf(xmXmmxNo[0]);
						int xmmxNo = Integer.valueOf(xmXmmxNo[1]);
						
						HealthInfo healthInfo = new HealthInfo();
						healthInfo.setSfzh(sfzh);
						healthInfo.setXmNo(xmNo);
						healthInfo.setXmmxNo(xmmxNo);
						healthInfo.setValue(healthInfoValue);
						healthInfo.setExtraValue(extraValue);
						healthInfo.setCreateYgdm(createYgdm);
						
						int healthInfoCount = sqlSession.selectOne("com.ezsoft.mapper.selectSeniorTalent_healthInfoXmXmmxCount",healthInfo);
						int affectedRows = 0;
						if(healthInfoCount == 0){
							affectedRows = sqlSession.insert("com.ezsoft.mapper.addHealthInfo", healthInfo);
						}else{
							affectedRows = sqlSession.update("com.ezsoft.mapper.updateHealthInfo", healthInfo);
						}
						//如果成功插入或更新调查表数据，更新用户disease为99（调查表组）
						/*if(affectedRows > 0){ 
							SeniorTalent seniorTalent2 = new SeniorTalent();
							seniorTalent2.setSfzh(sfzh);
							seniorTalent2.setDisease("99");
							sqlSession.update("com.ezsoft.mapper.updateDiseaseSearchBz", seniorTalent2); 
						}*/
					}
					sqlSession.commit();
				}
			}else if("updatexy".equals(act)){
				String jcz = paramJson.getString("jcz");
				String jlxh = paramJson.getString("jlxh");
				SeniorTalentRcjc rcjc = new SeniorTalentRcjc(); 
				
				rcjc.setJcz(jcz);
				rcjc.setJlxh(new Long(jlxh));
				rcjc.setJlrq(new Date());
				rcjc.setJczt(1);
				
				int suc = seniorTalentRcjcService.updateJczByPrimaryKey(rcjc);
				
				//int suc = sqlSession.update("com.ezsoft.mapper.updateJczByPrimaryKey", rcjc);//updateJczByPrimaryKey
				sqlSession.commit();
				
				if(suc > 0){ 
					msg = "保存成功";
				}else{
					code = "0";
					msg = "保存失败";
				}
			}else if("selectStInfo".equals(act)){
				String sfzh = paramJson.getString("sfzh");
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
				Object[] obarr = new Object[]{seniorTalent}; 
				resultJson.put("result", new JSONArray(obarr));
			}
			
			else{
				code = "0";
				msg = "不存在该方法";
			}
		} catch (JSONException e) {
			code = "0";
			msg = e.getMessage();
			e.printStackTrace();
			sqlSession.rollback();
		} catch (Exception e){
			code = "0";
			msg = e.getMessage();
			e.printStackTrace();
			sqlSession.rollback();
		}
		finally {
			sqlSession.close();
		}
		
		resultJson.put("code", code);
		resultJson.put("msg", msg);
		response.setContentType("application/json;charset=utf-8");
		response.setHeader("Cache-Control", "no-cache");// 清除缓存
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		out.print(resultJson.toString());
		out.flush();
		out.close();
				
		return null;
	}

	
}
