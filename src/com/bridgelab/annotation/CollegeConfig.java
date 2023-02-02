package com.bridgelab.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.bridgelab.annotation")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
	
//	@Bean
//	public Teacher mathTeacherBean() {
//		//MatahsTeacher mathsTeacher = new MatahsTeacher();
//		return new MathsTeacher();
//	}
//	
//	@Bean
//	public Principal principalBean() {
//		return new Principal();
//	}
//	
//	
//	
//	@Bean
//	public College collegeBean() {
//		College college = new College();
//		college.setPrincipal(principalBean());
//		college.setTeacher(mathTeacherBean());
//		return college;
//	}
}


