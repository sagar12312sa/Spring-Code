package com.sagar.test;

import com.sagar.FirstBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String[] args) {
	   ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	   FirstBean fb = (FirstBean)ac.getBean("hello");
	   fb.show();
   }
}
