package com.ezsoft.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ezsoft.domain.RcjcOrderXm;
import com.ezsoft.domain.RcjcOrderXmmx;
import com.ezsoft.domain.SeniorTalentRcjc;
import com.ezsoft.mapper.RcjcOrderXmMapper;
import com.ezsoft.mapper.RcjcOrderXmmxMapper;
import com.ezsoft.mapper.SeniorTalentRcjcMapper;

@Service("RcjcOrderXmService")
@Transactional
public class RcjcOrderXmServiceImpl implements RcjcOrderXmService{
	@Autowired
    private RcjcOrderXmMapper rcjcOrderXmMapper;
	@Autowired
    private RcjcOrderXmmxMapper rcjcOrderXmmxMapper;
	@Autowired
    private SeniorTalentRcjcMapper seniorTalentRcjcMapper;

	@Override
	public int deleteByPrimaryKey(Integer jlxh) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(RcjcOrderXm rcjcOrderXm) {
		rcjcOrderXmMapper.insert(rcjcOrderXm);
		int jcNo = rcjcOrderXm.getJcNo();
		List<RcjcOrderXmmx> rcjcOrderXmmxs = rcjcOrderXm.getRcjcOrderXmmxs();
		for(RcjcOrderXmmx rcjcOrderXmmx : rcjcOrderXmmxs){
			rcjcOrderXmmx.setJcNo(jcNo);
		}
		for(RcjcOrderXmmx rcjcOrderXmmx : rcjcOrderXmmxs){
			rcjcOrderXmmxMapper.insert(rcjcOrderXmmx);
			
			Date kssj = rcjcOrderXmmx.getKssj();
			String sfzh = rcjcOrderXmmx.getSfzh();
			int jclx = rcjcOrderXmmx.getJclx();
			int jcNum = rcjcOrderXmmx.getJcNum();
			int jcHowOften = rcjcOrderXmmx.getJcHowOften();
			int rcjcOrderXmmxNo = rcjcOrderXmmx.getJlxh();

			Calendar yyrqCal = Calendar.getInstance();
			yyrqCal.setTime(kssj);
			for(int i = 0; i < jcNum; i++){
				SeniorTalentRcjc seniorTalentRcjc = new SeniorTalentRcjc();
				seniorTalentRcjc.setSfzh(sfzh);
				seniorTalentRcjc.setJclx(jclx);
				if(i > 0){
					if(jcHowOften == 1){
						yyrqCal.add(Calendar.DATE, 1);
				    }else if(jcHowOften == 7){
				    	yyrqCal.add(Calendar.DATE, 7);
				    }else if(jcHowOften == 30){
				    	yyrqCal.add(Calendar.MONTH, 1);
				    }else if(jcHowOften == 90){
				    	yyrqCal.add(Calendar.MONTH, 3);
				    }else if(jcHowOften == 180){
				    	yyrqCal.add(Calendar.MONTH, 6);
				    }else if(jcHowOften == 360){
				    	yyrqCal.add(Calendar.YEAR, 1);
				    }
				}
				seniorTalentRcjc.setYyrq(yyrqCal.getTime());
				seniorTalentRcjc.setRcjcOrderXmNo(jcNo);
				seniorTalentRcjc.setRcjcOrderXmmxNo(rcjcOrderXmmxNo);
				seniorTalentRcjcMapper.insert(seniorTalentRcjc);
			}
		}
		return 1;
	}


	@Override
	public RcjcOrderXm selectByPrimaryKey(Integer jcNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RcjcOrderXm> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int stopByPrimaryKey(Integer jcNo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
