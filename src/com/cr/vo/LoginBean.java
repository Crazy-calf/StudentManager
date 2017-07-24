package com.cr.vo;

public class LoginBean {
	private String name;
	private String password;
	private String checkCode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCheckCode() {
		return checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}
	public LoginBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginBean(String name, String password, String checkCode) {
		super();
		this.name = name;
		this.password = password;
		this.checkCode = checkCode;
	}
	
	
	
	
}
