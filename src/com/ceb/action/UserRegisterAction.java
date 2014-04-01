package com.ceb.action;


import com.ceb.model.Member;
import com.ceb.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserRegisterAction extends ActionSupport{
	private Member member;
    
	private String comfirmingpassword;


	public String getComfirmingpassword() {
		return comfirmingpassword;
	}

	public void setComfirmingpassword(String comfirmingpassword) {
		this.comfirmingpassword = comfirmingpassword;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
    


	public String execute() {

		System.out.println(member.getPassword());
		System.out.println(member.getPassword());
		
		if (member.getPassword().equals(comfirmingpassword)
				&& member.getPassword().length() != 0){
			UserService rs = new UserService();
			if (rs.save(member))
				return "success";
			else
				return "error_name";
		                      }
			
		    else 
			    return "error_password";
	}



}

