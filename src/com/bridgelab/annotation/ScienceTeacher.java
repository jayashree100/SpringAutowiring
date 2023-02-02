package com.bridgelab.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi i am your Science teacher");
		System.out.println("my name is guru");
		
	}
	

}
