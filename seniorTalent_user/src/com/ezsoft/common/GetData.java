package com.ezsoft.common;

import java.sql.Timestamp;
import java.util.Calendar;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ezsoft.domain.SeniorTalent;
import com.ezsoft.util.CommonUtil;

public class GetData {
	public static SeniorTalent getSeniorTalent(String sfzh){
		SqlSessionFactory sqlSessionFactory = CommonUtil.getSessionFactory("PICC");
		SqlSession sqlSession = sqlSessionFactory.openSession();
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
			return seniorTalent;
		} finally {
			sqlSession.close();
		}	
			
		
	}
}
