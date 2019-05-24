package com.ezsoft.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class RcjcOrderXmmx {
    private Integer jlxh;

    private String sfzh;

    private Integer jclx;
    
    private String jclxmc;

    private Date kssj;

    private Integer jcHowOften;

    private Integer jcNum;

    private Integer jcNo;

    private Integer zfpb;

    private Date createTime;

    private String createYgdm;
    
    private SeniorTalent seniorTalent;

	@Override
	public String toString() {
		return "RcjcOrderXmmx {jlxh=" + jlxh + ", sfzh=" + sfzh + ", jclx=" + jclx + ", kssj=" + kssj + ", jcHowOften="
				+ jcHowOften + ", jcNum=" + jcNum + ", jcNo=" + jcNo + ", zfpb=" + zfpb + ", createTime=" + createTime
				+ ", createYgdm=" + createYgdm + "}";
	}

	public Integer getJlxh() {
		return jlxh;
	}

	public void setJlxh(Integer jlxh) {
		this.jlxh = jlxh;
	}

	public String getSfzh() {
		return sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	public Integer getJclx() {
		return jclx;
	}

	public void setJclx(Integer jclx) {
		this.jclx = jclx;
	}

	public String getJclxmc() {
		return jclxmc;
	}

	public void setJclxmc(String jclxmc) {
		this.jclxmc = jclxmc;
	}

	public Date getKssj() {
		return kssj;
	}

	public void setKssj(Date kssj) {
		this.kssj = kssj;
	}

	public Integer getJcHowOften() {
		return jcHowOften;
	}

	public void setJcHowOften(Integer jcHowOften) {
		this.jcHowOften = jcHowOften;
	}

	public Integer getJcNum() {
		return jcNum;
	}

	public void setJcNum(Integer jcNum) {
		this.jcNum = jcNum;
	}

	public Integer getJcNo() {
		return jcNo;
	}

	public void setJcNo(Integer jcNo) {
		this.jcNo = jcNo;
	}

	public Integer getZfpb() {
		return zfpb;
	}

	public void setZfpb(Integer zfpb) {
		this.zfpb = zfpb;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateYgdm() {
		return createYgdm;
	}

	public void setCreateYgdm(String createYgdm) {
		this.createYgdm = createYgdm;
	}

	public SeniorTalent getSeniorTalent() {
		return seniorTalent;
	}

	public void setSeniorTalent(SeniorTalent seniorTalent) {
		this.seniorTalent = seniorTalent;
	}
	
	

}