package com.ceb.action;


import com.ceb.model.Member;
import com.ceb.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserLoginAction extends ActionSupport{
	private Member member;

	private String name;
	private String password;

	public String execute() {
		name = member.getName();
		password = member.getPassword();
		UserService ls = new UserService();

		if (ls.loginConfirm(name, password))
			return "success";
		else
			return "error";
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}
