package com.ezsoft.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.ezsoft.domain.OrderPrintHealthCheck;
import com.ezsoft.domain.OrderPrintHealthCheckXm;
import com.ezsoft.domain.OrderPrintHealthCheckXmmx;
import com.ezsoft.domain.SeniorTalent;
import com.ezsoft.util.CommonUtil;
import com.ezsoft.util.MybatisUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SeniorTalentHealthCheckViewAction extends ActionSupport{
	private String sfzh;
	private String key;
	private SeniorTalent seniorTalent;
	private List<OrderPrintHealthCheckXm> orderPrintHealthCheckXmList;
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
	public List<OrderPrintHealthCheckXm> getOrderPrintHealthCheckXmList() {
		return orderPrintHealthCheckXmList;
	}
	public void setOrderPrintHealthCheckXmList(List<OrderPrintHealthCheckXm> orderPrintHealthCheckXmList) {
		this.orderPrintHealthCheckXmList = orderPrintHealthCheckXmList;
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
		
		SqlSession sqlSession = MybatisUtils.openSession();
		
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
			this.seniorTalent = seniorTalent;
			
			//体检项目书
			List<OrderPrintHealthCheckXm> orderPrintHealthCheckXmList = sqlSession.selectList("com.ezsoft.mapper.selectOrderPrintHealthCheckXm");
			List<OrderPrintHealthCheckXmmx> orderPrintHealthCheckXmmxList = sqlSession.selectList("com.ezsoft.mapper.selectOrderPrintHealthCheckXmmx");
			List<OrderPrintHealthCheck> orderPrintHealthCheckList = sqlSession.selectList("com.ezsoft.mapper.selectOrderPrintHealthCheck_selected", sfzh);
			//TODO
			List<OrderPrintHealthCheckXm> orderPrintHealthCheckXmList2 = new ArrayList<OrderPrintHealthCheckXm>();
			for(int i = 0; i < orderPrintHealthCheckXmList.size(); i++){
				OrderPrintHealthCheckXm orderPrintHealthCheckXm = orderPrintHealthCheckXmList.get(i);
				int healthCheckXmNo = orderPrintHealthCheckXm.getHealthCheckXmNo();
				List<OrderPrintHealthCheckXmmx> orderPrintHealthCheckXmmxList2 = new ArrayList<OrderPrintHealthCheckXmmx>();
				for(int j = 0; j < orderPrintHealthCheckXmmxList.size(); j++){
					OrderPrintHealthCheckXmmx orderPrintHealthCheckXmmx = orderPrintHealthCheckXmmxList.get(j);
					int healthCheckXmmxNo = orderPrintHealthCheckXmmx.getHealthCheckXmmxNo();
					if(healthCheckXmNo == orderPrintHealthCheckXmmx.getHealthCheckXmNo()){
						for(int k = 0; k < orderPrintHealthCheckList.size(); k++){
							OrderPrintHealthCheck orderPrintHealthCheck = orderPrintHealthCheckList.get(k);
							if(healthCheckXmmxNo == orderPrintHealthCheck.getHealthCheckXmmxNo()){
								orderPrintHealthCheckXmmx.setOrderPrintHealthCheck(orderPrintHealthCheck);
								orderPrintHealthCheckXmmxList2.add(orderPrintHealthCheckXmmx);
								break;
							}
						}
						
					}
				}
				orderPrintHealthCheckXm.setOrderPrintHealthCheckXmmxList(orderPrintHealthCheckXmmxList2);
				orderPrintHealthCheckXmList2.add(orderPrintHealthCheckXm);
			}
			this.orderPrintHealthCheckXmList = orderPrintHealthCheckXmList2;
		} catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
		} finally {
			sqlSession.close();
		}

		return SUCCESS;
	}
}
