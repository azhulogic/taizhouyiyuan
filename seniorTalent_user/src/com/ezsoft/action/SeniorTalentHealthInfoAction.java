package com.ezsoft.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezsoft.domain.HealthInfo;
import com.ezsoft.domain.HealthInfoXm;
import com.ezsoft.domain.HealthInfoXmmx;
import com.ezsoft.domain.HealthInfoXmmxOption;
import com.ezsoft.domain.SeniorTalent;
import com.ezsoft.service.SeniorTalentService;
import com.ezsoft.util.CommonUtil;
import com.ezsoft.util.MybatisUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SeniorTalentHealthInfoAction extends ActionSupport{
	@Autowired
    private SeniorTalentService seniorTalentService;
	
	private String sfzh;
	private String key;
	private SeniorTalent seniorTalent;
	private List<HealthInfoXm> healthInfoXmList;
	private String[] healthInfoXmmxNameArray;
	private String[] checkBoxXmmxArray;  //存要选“无”的选项
	private String msg;
	
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public SeniorTalent getSeniorTalent() {
		return seniorTalent;
	}
	public void setSeniorTalent(SeniorTalent seniorTalent) {
		this.seniorTalent = seniorTalent;
	}
	public List<HealthInfoXm> getHealthInfoXmList() {
		return healthInfoXmList;
	}
	public void setHealthInfoXmList(List<HealthInfoXm> healthInfoXmList) {
		this.healthInfoXmList = healthInfoXmList;
	}
	public String[] getHealthInfoXmmxNameArray() {
		return healthInfoXmmxNameArray;
	}
	public void setHealthInfoXmmxNameArray(String[] healthInfoXmmxNameArray) {
		this.healthInfoXmmxNameArray = healthInfoXmmxNameArray;
	}
	public String[] getCheckBoxXmmxArray() {
		return checkBoxXmmxArray;
	}
	public void setCheckBoxXmmxArray(String[] checkBoxXmmxArray) {
		this.checkBoxXmmxArray = checkBoxXmmxArray;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	private static Logger logger = LogManager.getLogger(SeniorTalentHealthInfoAction.class);
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
		
		String[] checkBoxXmmxArray = {".xmmx1_1",".xmmx1_2",".xmmx1_3",".xmmx1_4",".gms"};
		this.checkBoxXmmxArray = checkBoxXmmxArray;
		
		SqlSession sqlSession = MybatisUtils.openSession();
		
		List<HealthInfoXm> healthInfoXmList = new ArrayList<HealthInfoXm>();
		try {
			SeniorTalent seniorTalent =  seniorTalentService.selectBySfzh(sfzh);
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
			seniorTalent.setHeight(Math.round(seniorTalent.getHeight() * 100));
			this.seniorTalent = seniorTalent;
			
			List<HealthInfoXm> healthInfoXmList0 = sqlSession.selectList("com.ezsoft.mapper.selectSeniorTalent_healthInfoXm");
			List<HealthInfoXmmx> healthInfoXmmxList0 = sqlSession.selectList("com.ezsoft.mapper.selectSeniorTalent_healthInfoXmmx");
			List<HealthInfoXmmxOption> healthInfoXmmxOptionList0 = sqlSession.selectList("com.ezsoft.mapper.selectSeniorTalent_healthInfoXmmxOption");
			List<HealthInfo> healthInfoList = sqlSession.selectList("com.ezsoft.mapper.selectSeniorTalent_healthInfoList", sfzh);
			
			String[] healthInfoXmmxNameArray = new String[healthInfoXmmxList0.size()];
			for(int i = 0; i < healthInfoXmmxList0.size(); i++){
				HealthInfoXmmx healthInfoXmmx = new HealthInfoXmmx();
				healthInfoXmmx = healthInfoXmmxList0.get(i);
				healthInfoXmmxNameArray[i] = "xmmx" + healthInfoXmmx.getXmNo() + "_" + healthInfoXmmx.getXmmxNo();
			}
			this.healthInfoXmmxNameArray = healthInfoXmmxNameArray;
			int xmNo = 0;
			int xmmxNo = 0;
			String xmName = "";
			for(int i = 0; i < healthInfoXmList0.size(); i++){
				HealthInfoXm healthInfoXm0 = healthInfoXmList0.get(i);
				xmNo = healthInfoXm0.getXmNo();
				xmName = healthInfoXm0.getXmName();
				HealthInfoXm healthInfoXm = new HealthInfoXm();
				healthInfoXm.setXmName(xmName);
				healthInfoXm.setXmNo(xmNo);
				List<HealthInfoXmmx> healthInfoXmmxList = new ArrayList<HealthInfoXmmx>();
				for(int j = 0; j < healthInfoXmmxList0.size(); j++){
					HealthInfoXmmx healthInfoXmmx = new HealthInfoXmmx();
					HealthInfoXmmx healthInfoXmmx0 = healthInfoXmmxList0.get(j);
					int xmNo0 = healthInfoXmmx0.getXmNo();
					xmmxNo = healthInfoXmmx0.getXmmxNo();
					String xmmxName = healthInfoXmmx0.getXmmxName();
					String note = healthInfoXmmx0.getNote();
					int selectType = healthInfoXmmx0.getSelectType();
					int extraAddBz = healthInfoXmmx0.getExtraAddBz();
					healthInfoXmmx.setXmNo(xmNo0);
					healthInfoXmmx.setXmmxNo(xmmxNo);
					healthInfoXmmx.setXmmxName(xmmxName);
					healthInfoXmmx.setNote(note);
					healthInfoXmmx.setSelectType(selectType);
					healthInfoXmmx.setExtraAddBz(extraAddBz);
					String value = "";
					for(int k = 0; k < healthInfoList.size(); k++){
						if(xmNo == healthInfoList.get(k).getXmNo() && xmmxNo == healthInfoList.get(k).getXmmxNo()){
							healthInfoXmmx.setHealthInfo(healthInfoList.get(k));
							value = healthInfoList.get(k).getValue();
							break;
						}
					}
					healthInfoXmmx.setValue(value);
					String[] valueArray = value.split(",");
					healthInfoXmmx.setValueArray(valueArray);
					if(xmNo == healthInfoXmmx.getXmNo()){
						List<HealthInfoXmmxOption> healthInfoXmmxOptionList = new ArrayList<HealthInfoXmmxOption>();
						for(int k = 0; k < healthInfoXmmxOptionList0.size(); k++){					
							HealthInfoXmmxOption healthInfoXmmxOption = new HealthInfoXmmxOption();
							healthInfoXmmxOption = healthInfoXmmxOptionList0.get(k);
							if(xmNo == healthInfoXmmxOption.getXmNo() && xmmxNo == healthInfoXmmxOption.getXmmxNo()){
								healthInfoXmmxOptionList.add(healthInfoXmmxOption);
							}
						}
						healthInfoXmmx.setHealthInfoXmmxOptionList(healthInfoXmmxOptionList);
						healthInfoXmmxList.add(healthInfoXmmx);
					}
				}
				healthInfoXm.setHealthInfoXmmxList(healthInfoXmmxList);
				healthInfoXmList.add(healthInfoXm);
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		
		this.healthInfoXmList = healthInfoXmList;
		return SUCCESS;
	}
}
