package com.bridgelab.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MathsTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi i am your Maths teacher");
		System.out.println("my name is Vishwa");
		
	}
	

}
