package com.bridgelab.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("bean.xml loaded");
		College college = context.getBean("college", College.class);
		System.out.println("the college object created by spring:" + college);
		college.test();

//		Principal principal =	context.getBean("principalBean",Principal.class);
//		principal.principalInfo();
//	

	}

}
