package com.ezsoft.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.ezsoft.domain.Admin_wh;
import com.ezsoft.domain.RcjcTodoList;
import com.ezsoft.domain.SeniorTalent;
import com.ezsoft.domain.SeniorTalentRcjc;
import com.ezsoft.service.Admin_whService;
import com.ezsoft.service.SeniorTalentRcjcService;
import com.ezsoft.util.DateUtil;
import com.ezsoft.util.MybatisUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Scope("prototype")
public class RcjcManagAction extends ActionSupport{

	@Autowired
    private SeniorTalentRcjcService seniorTalentRcjcService; 
	@Autowired
    private Admin_whService admin_whService; 
	
	
	private String sfzh;
	
	private String yyrq1;
	
	private String yyrq2;
	
	private int jlxh;
	
	private String jclx;
	
	private String jczt;
	
	
	private SeniorTalent seniorTalent;
	
	private String key; 
	private String msg;
	 
	private String act; 
	private List<RcjcTodoList> rcjcTodoList;
	private List<Admin_wh> adminWhList;

	
	public List<Admin_wh> getAdminWhList() {
		return adminWhList;
	}

	public void setAdminWhList(List<Admin_wh> adminWhList) {
		this.adminWhList = adminWhList;
	}

	public SeniorTalentRcjcService getSeniorTalentRcjcService() {
		return seniorTalentRcjcService;
	}

	public void setSeniorTalentRcjcService(SeniorTalentRcjcService seniorTalentRcjcService) {
		this.seniorTalentRcjcService = seniorTalentRcjcService;
	}

	public String getSfzh() {
		return sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	public String getYyrq1() {
		return yyrq1;
	}

	public void setYyrq1(String yyrq1) {
		this.yyrq1 = yyrq1;
	}

	public String getYyrq2() {
		return yyrq2;
	}

	public void setYyrq2(String yyrq2) {
		this.yyrq2 = yyrq2;
	}

	public int getJlxh() {
		return jlxh;
	}

	public void setJlxh(int jlxh) {
		this.jlxh = jlxh;
	}

	public String getJclx() {
		return jclx;
	}

	public void setJclx(String jclx) {
		this.jclx = jclx;
	}

	public String getJczt() {
		return jczt;
	}

	public void setJczt(String jczt) {
		this.jczt = jczt;
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

 
	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	public List<RcjcTodoList> getRcjcTodoList() {
		return rcjcTodoList;
	}

	public void setRcjcTodoList(List<RcjcTodoList> rcjcTodoList) {
		this.rcjcTodoList = rcjcTodoList;
	}

	public String execute(){

		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		SqlSession sqlSession = MybatisUtils.openSession();
		SeniorTalentRcjc seniorTalentRcjc = new SeniorTalentRcjc();
		String forwordpage=SUCCESS ;
		if(act != null && "query".equals(act) ){
//			//验证传参
//			if(sfzh == null || key == null){
//				this.msg = "验证失败";
//				return ERROR;
//			}
//			int md5Vaild = CommonUtil.getMd5Vaild(sfzh, key);
//			if(md5Vaild == 0){
//				this.msg = "验证失败";
//				return ERROR;
//			}
			//添加session
			 
//			SeniorTalent seniorTalent =  sqlSession.selectOne("com.ezsoft.mapper.selectSeniorTalent_sfzh2",sfzh);
//			int brxb = seniorTalent.getBrxb();
//			Date csny = seniorTalent.getCsny();
//			Calendar calBirth = Calendar.getInstance();
//			calBirth.setTimeInMillis(csny.getTime());
//			int age = CommonUtil.getAge(calBirth);
//			seniorTalent.setAge(age);
//			String brxbShow = "";
//			if(brxb == 1){ 
//				brxbShow = "男";
//			}else if(brxb == 2){
//				brxbShow = "女";
//			}
//			seniorTalent.setBrxbShow(brxbShow);
//			this.seniorTalent = seniorTalent;
//			
			//this.rcjcTodoList =  sqlSession.selectList("com.ezsoft.mapper.selectTodoList",sfzh);
			
			
			if(sfzh!=null && !"".equals(sfzh)){ 
				seniorTalentRcjc.setSfzh(sfzh);
			}
			
			if(yyrq1==null || "".equals(yyrq1)){
				yyrq1 = DateUtil.getDateBeforeStr(new Date(), 7 );
				Date yyrq1_d = DateUtil.string2Date(yyrq1, "yyyy-MM-dd");// DateUtil.getBeforDate(DateUtil.parseDateString(yyrq1, "yyyy-MM-dd"),7);
				seniorTalentRcjc.setYyrq1(yyrq1_d);
			}else{
				seniorTalentRcjc.setYyrq1(DateUtil.parseDateString(yyrq1, "yyyy-MM-dd"));
			}
			 
			if(yyrq2==null || "".equals(yyrq2)){
				seniorTalentRcjc.setYyrq2(new Date());
				yyrq2 = DateUtil.date2String(new Date(), "yyyy-MM-dd");
			}else{
				seniorTalentRcjc.setYyrq2(DateUtil.parseDateString(yyrq2, "yyyy-MM-dd"));
			} 
			if(jclx!=null && !"".equals(jclx)){
				seniorTalentRcjc.setJclx(new Integer(jclx)); 
			} 
			if(jczt!=null && !"".equals(jczt)){
				seniorTalentRcjc.setJczt(new Integer(jczt));
			}
			
			this.rcjcTodoList =  seniorTalentRcjcService.selectTodoList(seniorTalentRcjc);
			  
		} 
		 
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("sfzh", sfzh);
		paramMap.put("kssj", yyrq1);
		paramMap.put("jssj", yyrq2);
		List<Admin_wh> tempList = admin_whService.selectUserJclx(paramMap);
		this.adminWhList = tempList;
		 
		return forwordpage;
	}
}
