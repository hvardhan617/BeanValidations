package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class User {

	//@Future
	@NotNull(message="studentDOB cannot be empty")
	public Date studentDOB;
	@NotEmpty(message="id cannot be empty")
	public String id;

	//@Digits(integer=10, fraction = 0)
	@NotNull(message="policyNumber cannot be empty")
	@Pattern(regexp="[0-9]",message="policyNumber must contain only numbers")
	public String policyNumber;
	
	private List<ErrorBean> errorBean=new ArrayList<>();

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	
	/*public Integer getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(Integer policyNumber) {
		this.policyNumber = policyNumber;
	}*/

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	/*public Date getId() {
		return id;
	}

	public void setId(Date id) {
		this.id = id;
	}*/

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public List<ErrorBean> getErrorBean() {
		return errorBean;
	}

	public void setErrorBean(List<ErrorBean> errorBean) {
		this.errorBean = errorBean;
	}

	
}
