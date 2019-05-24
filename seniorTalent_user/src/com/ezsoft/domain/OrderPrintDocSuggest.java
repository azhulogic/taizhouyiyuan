package com.ezsoft.domain;

import java.sql.Timestamp;

public class OrderPrintDocSuggest {
	private int jlxh;
	private String sfzh;
	private String suggestDocName;
	private String suggestDepName;
	private Timestamp createTime;
	private String createYgdm;
	private int zfpb;
	public int getJlxh() {
		return jlxh;
	}
	public void setJlxh(int jlxh) {
		this.jlxh = jlxh;
	}
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public String getSuggestDocName() {
		return suggestDocName;
	}
	public void setSuggestDocName(String suggestDocName) {
		this.suggestDocName = suggestDocName;
	}
	public String getSuggestDepName() {
		return suggestDepName;
	}
	public void setSuggestDepName(String suggestDepName) {
		this.suggestDepName = suggestDepName;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public String getCreateYgdm() {
		return createYgdm;
	}
	public void setCreateYgdm(String createYgdm) {
		this.createYgdm = createYgdm;
	}
	public int getZfpb() {
		return zfpb;
	}
	public void setZfpb(int zfpb) {
		this.zfpb = zfpb;
	}
}
