package com.Sagar.ListObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
         Program1 prog = (Program1)context.getBean("map");
         prog.show();
	}
}
