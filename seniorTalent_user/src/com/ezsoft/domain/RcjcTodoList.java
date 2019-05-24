package com.ezsoft.domain;

import java.sql.Timestamp;
import java.util.Date;

public class RcjcTodoList {
	//sfzh身份证号 yyrq任务预约日期 jclx--监测类型 jcz监测值 jlrq记录时间 jczt监测状态
    private Long jlxh;
 
    private String sfzh;

    private Integer brxb;

    private Date yyrq;
 
    private Integer jclx;

    private String jcz;
 
    private Timestamp jlrq;
 
    private Integer jczt;
    
    private String jczt_desc;
    private String jclx_desc;
    private String name;
    private String lxdh;
    
    
	public String getLxdh() {
		return lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	public String getJczt_desc() {
		return jczt_desc;
	}

	public void setJczt_desc(String jczt_desc) {
		this.jczt_desc = jczt_desc;
	}

	public String getJclx_desc() {
		return jclx_desc;
	}

	public void setJclx_desc(String jclx_desc) {
		this.jclx_desc = jclx_desc;
	}

 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getJlxh() {
		return jlxh;
	}

	public void setJlxh(Long jlxh) {
		this.jlxh = jlxh;
	}

	public String getSfzh() {
		return sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	public Integer getBrxb() {
		return brxb;
	}

	public void setBrxb(Integer brxb) {
		this.brxb = brxb;
	}

	public Date getYyrq() {
		return yyrq;
	}

	public void setYyrq(Date yyrq) {
		this.yyrq = yyrq;
	}

	public Integer getJclx() {
		return jclx;
	}

	public void setJclx(Integer jclx) {
		this.jclx = jclx;
	}

	public String getJcz() {
		return jcz;
	}

	public void setJcz(String jcz) {
		this.jcz = jcz;
	}

	public Timestamp getJlrq() {
		return jlrq;
	}

	public void setJlrq(Timestamp jlrq) {
		this.jlrq = jlrq;
	}

	public Integer getJczt() {
		return jczt;
	}

	public void setJczt(Integer jczt) {
		this.jczt = jczt;
	}
 
    
}