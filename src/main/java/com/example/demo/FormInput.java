package com.example.demo;

import java.io.Serializable;

public class FormInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String pwd;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
