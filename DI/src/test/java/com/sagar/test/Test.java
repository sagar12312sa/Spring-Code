package com.sagar.test;

import com.sagar.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext sc = new ClassPathXmlApplicationContext("spring.xml");
       Login lg = (Login)sc.getBean("login");
       lg.show();
	}

}
