package com.ezsoft.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.ezsoft.domain.PushContent;
import com.ezsoft.service.PushContentService;
import com.opensymphony.xwork2.ActionSupport;

public class PushDisplayAction extends ActionSupport{
	@Autowired
    private PushContentService pushContentService;

	private int pushContentNo;
	private PushContent pushContent;
	
	public int getPushContentNo() {
		return pushContentNo;
	}
	public void setPushContentNo(int pushContentNo) {
		this.pushContentNo = pushContentNo;
	}
	public PushContent getPushContent() {
		return pushContent;
	}
	public void setPushContent(PushContent pushContent) {
		this.pushContent = pushContent;
	}
	//private static Logger logger = LogManager.getLogger(SeniorTalentHealthResultAction.class);
	public String execute(){
		this.pushContent = pushContentService.selectByPrimaryKey(pushContentNo);
		return SUCCESS;
	}
}
