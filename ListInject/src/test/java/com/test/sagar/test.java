package com.test.sagar;

import com.sagarr.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
  public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	  ListInject lst = (ListInject)context.getBean("list");
	  lst.show();
  }
}
