package com.bridgelab.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value( "${college.collegeName}")
	private String collegeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	
	
	

//	public College(Principal principal) {
//	
//		this.principal = principal;
//	}



//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}
//
//
//
//	public void setPrincipal(Principal principal) {
//		this.principal = principal;
//	}



	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("college test method");
		System.out.println("My industry  name is :" +collegeName);
	}
	
	
	
}
