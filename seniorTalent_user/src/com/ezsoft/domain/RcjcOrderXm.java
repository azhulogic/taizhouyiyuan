package com.ezsoft.domain;

import java.util.Date;
import java.util.List;

public class RcjcOrderXm {
    private Integer jcNo;

    private String sfzh;

    private Integer zfpb;

    private Date createTime;

    private String createYgdm;
    
    private List<RcjcOrderXmmx> rcjcOrderXmmxs;

    public Integer getJcNo() {
        return jcNo;
    }

    public void setJcNo(Integer jcNo) {
        this.jcNo = jcNo;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh == null ? null : sfzh.trim();
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
        this.createYgdm = createYgdm == null ? null : createYgdm.trim();
    }

	public List<RcjcOrderXmmx> getRcjcOrderXmmxs() {
		return rcjcOrderXmmxs;
	}

	public void setRcjcOrderXmmxs(List<RcjcOrderXmmx> rcjcOrderXmmxs) {
		this.rcjcOrderXmmxs = rcjcOrderXmmxs;
	}

	@Override
	public String toString() {
		return "RcjcOrderXm {jcNo=" + jcNo + ", sfzh=" + sfzh + ", zfpb=" + zfpb + ", createTime=" + createTime
				+ ", createYgdm=" + createYgdm + ", rcjcOrderXmmxs=" + rcjcOrderXmmxs + "}";
	}

	
    
}