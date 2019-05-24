package com.ezsoft.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 默认 code = 1
 */

public class SuccessPageAction extends ActionSupport {
	private String msg;
 
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String execute(){
		return SUCCESS;
	}

	
}
