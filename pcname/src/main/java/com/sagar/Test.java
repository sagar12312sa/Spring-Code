/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sagar
 */
public class Test {
    public static void  main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Employee employee = (Employee)context.getBean("employee");
        System.out.println(employee);
    }
}
