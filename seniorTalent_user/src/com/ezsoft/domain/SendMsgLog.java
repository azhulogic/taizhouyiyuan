package com.ezsoft.domain;

import java.sql.Timestamp;

public class SendMsgLog {	
	private int jlxh;
	private String sjhm;
	private String msg;
	private Timestamp sendTime;
	private String createYgdm;
	public int getJlxh() {
		return jlxh;
	}
	public void setJlxh(int jlxh) {
		this.jlxh = jlxh;
	}
	public String getSjhm() {
		return sjhm;
	}
	public void setSjhm(String sjhm) {
		this.sjhm = sjhm;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Timestamp getSendTime() {
		return sendTime;
	}
	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}
	public String getCreateYgdm() {
		return createYgdm;
	}
	public void setCreateYgdm(String createYgdm) {
		this.createYgdm = createYgdm;
	}
}
