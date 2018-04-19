package com.example.demo;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class User1Validator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return User1.class.equals(arg0);
	}

	@Override
	public void validate(Object target, Errors e) {
		ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
		User1 User1=(User1)target;
		
	}
	
	

}
