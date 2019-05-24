package com.ezsoft.action;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezsoft.domain.RcjcTodoList;
import com.ezsoft.domain.SeniorTalent;
import com.ezsoft.domain.SeniorTalentRcjc;
import com.ezsoft.service.SeniorTalentService;
import com.ezsoft.util.CommonUtil;
import com.ezsoft.util.DateUtil;
import com.ezsoft.util.MybatisUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SeniorTalentAction extends ActionSupport{
	@Autowired
    private SeniorTalentService seniorTalentService; 
	
	private String sfzh;
	 
	
	private SeniorTalent seniorTalent; 
	private String key;
	private String msg;
	
 
	private String flag;
	private Integer  dcl;

 
	public Integer  getDcl() {
		return dcl;
	}


	public void setDcl(Integer  dcl) {
		this.dcl = dcl;
	}


	public String getSfzh() {
		return sfzh;
	}


	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}


	public SeniorTalent getSeniorTalent() {
		return seniorTalent;
	}


	public void setSeniorTalent(SeniorTalent seniorTalent) {
		this.seniorTalent = seniorTalent;
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


	public String getFlag() {
		return flag;
	}


	public void setFlag(String flag) {
		this.flag = flag;
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
		//添加session
				ActionContext actionContext = ActionContext.getContext();
				Map session = actionContext.getSession();
				session.put("sfzh", sfzh);
		if(flag != null && "info".equals(flag) ){
			SqlSession sqlSession = MybatisUtils.openSession();
			
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
			 Map p = new HashMap<String, String>();
			 p.put("sfzh", sfzh);
 			 //List todomap1 = sqlSession.selectList("com.ezsoft.mapper.SeniorTalentMapper.selectTodo", p);
			
			//List<Map<String,Object>> selectUserMapList();
 			
 			List todomap2 = seniorTalentService.selectTodo(p);
 			if (todomap2.size()>0){
 				dcl = (Integer) ((Map)todomap2.get(0)).get("sum");
 			}
			
			return SUCCESS;
		}
				  
		return ERROR;
	}
	 
}
