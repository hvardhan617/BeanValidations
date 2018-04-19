package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {
	
	
	/*@org.springframework.web.bind.annotation.InitBinder
	public void InitBinder(WebDataBinder binder)
	{
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "studentDOB",new CustomDateEditor(dateFormat,false));
		//binder.registerCustomEditor(String.class,"studentname",new StudentNameEditor());
	}*/

	//using JSR specifications
	@PostMapping(value="/ping")
	public UserRs ping(@Valid @RequestBody User user,BindingResult result) throws Exception
	{
		UserRs UserRs=new UserRs();
		List<User> user1=new ArrayList<>();
		List<ErrorBean> ErrorBean=new ArrayList<>();
		if(result.hasErrors())
		{
			/*System.out.println("errors:::::"+result);
			System.out.println("getFieldError:::::"+result.getFieldError());
			System.out.println("getFieldError:::::"+result.getErrorCount());
					System.out.println("getFieldError:::::"+result.getRawFieldValue("id"));
							System.out.println("getFieldError:::::"+result.getAllErrors());
								*/	
			 List<FieldError> fieldErrorList= result.getFieldErrors();
			 System.out.println("getFieldError:::::"+result.getFieldError());
			 System.out.println("COUNT:::"+result.getErrorCount());
			 System.out.println("getModel::::"+result.getModel());
	            for(FieldError fieldError: fieldErrorList ){                    
	            	//throw new Exception("Invalid Input:::"+fieldError.getDefaultMessage());
	            	ErrorBean earrorBean=new ErrorBean();
	            	earrorBean.setErrorCode("INVALID_INPUT");
	            	earrorBean.setErrorMessage(fieldError.getDefaultMessage());
	            	ErrorBean.add(earrorBean);
	            	
	            	
	            }
	            user.setErrorBean(ErrorBean);
            	user1.add(user);
	            UserRs.setUserList(user1);
			
		}else{
			System.out.println("Success Input");
			user1.add(user);
			UserRs.setUserList(user1);
		}
		return UserRs;
			
	}
	
	@PostMapping(value="/ping1")
	public void ping(@Valid @RequestBody User user)
	{
		
	}
	
	//using Hibernate Validator
	/*@org.springframework.web.bind.annotation.InitBinder
	public void InitBinder(WebDataBinder binder)
	{
		binder.setValidator(new User1Validator());
		
	}
	@PostMapping(value="/ping")
	public void ping(@Valid @RequestBody User1 user)
	{
		
	}*/
}
