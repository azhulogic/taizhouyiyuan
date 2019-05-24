package com.ezsoft.domain;

import java.util.Date;

public class SeniorTalentRcjc {
    private Long jlxh;

    private String sfzh;

    private Date yyrq;

    private Integer jclx;

    private String jcz;

    private Date jlrq;

    private Integer jczt;
    
    private Integer rcjcOrderXmNo;
    
    private Integer rcjcOrderXmmxNo;
    
    private Date yyrq1;
    
    private Date yyrq2;

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
        this.sfzh = sfzh == null ? null : sfzh.trim();
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
        this.jcz = jcz == null ? null : jcz.trim();
    }

    public Date getJlrq() {
        return jlrq;
    }

    public void setJlrq(Date jlrq) {
        this.jlrq = jlrq;
    }

    public Integer getJczt() {
        return jczt;
    }

    public void setJczt(Integer jczt) {
        this.jczt = jczt;
    }

	public Integer getRcjcOrderXmNo() {
		return rcjcOrderXmNo;
	}

	public void setRcjcOrderXmNo(Integer rcjcOrderXmNo) {
		this.rcjcOrderXmNo = rcjcOrderXmNo;
	}

	public Integer getRcjcOrderXmmxNo() {
		return rcjcOrderXmmxNo;
	}

	public void setRcjcOrderXmmxNo(Integer rcjcOrderXmmxNo) {
		this.rcjcOrderXmmxNo = rcjcOrderXmmxNo;
	}

	public Date getYyrq1() {
		return yyrq1;
	}

	public void setYyrq1(Date yyrq1) {
		this.yyrq1 = yyrq1;
	}

	public Date getYyrq2() {
		return yyrq2;
	}

	public void setYyrq2(Date yyrq2) {
		this.yyrq2 = yyrq2;
	}
	
}