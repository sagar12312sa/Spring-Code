/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.test;

import org.springframework.context.ApplicationContext;
import com.sagar.config.AppConfig;
import com.sagar.autowiring.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 *
 * @author sagar
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = (Employee)context.getBean("getEmployee");
        System.out.println(employee);
    }
}
