package com.ezsoft.domain;

import java.util.Date;

public class PushContent {
    private Integer pushContentNo;

    private String title;

    private String content;

    private String sfzh;

    private Integer pushBz;

    private Date pushTime;

    private Date createTime;

    private String createYgdm;
    
    private SeniorTalent seniorTalent;

    public Integer getPushContentNo() {
        return pushContentNo;
    }

    public void setPushContentNo(Integer pushContentNo) {
        this.pushContentNo = pushContentNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh == null ? null : sfzh.trim();
    }

    public Integer getPushBz() {
        return pushBz;
    }

    public void setPushBz(Integer pushBz) {
        this.pushBz = pushBz;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
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

	public SeniorTalent getSeniorTalent() {
		return seniorTalent;
	}

	public void setSeniorTalent(SeniorTalent seniorTalent) {
		this.seniorTalent = seniorTalent;
	}
}