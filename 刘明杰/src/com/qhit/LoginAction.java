package com.qhit;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qhit.User;

public class LoginAction  extends ActionSupport{
	private User user;
	public String login(){
		if(user.getUsername().equals("abcdefg")&&user.getPassword().equals("123456789")){
			ActionContext.getContext().getSession().put("user", user);
			return SUCCESS;
		}
		addActionError("�û���������������µ�½");
		return INPUT;
	}

	@Override
	public void validate() {
		System.out.println(user);
		if(user==null){
			addFieldError("login.formInput", "δ��д�û�����������");
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

