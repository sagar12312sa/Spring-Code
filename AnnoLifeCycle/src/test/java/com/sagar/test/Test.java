/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sagar.config.AppConfig;
import com.sagar.message.Message;


/**
 *
 * @author sagar
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Message m = (Message)context.getBean("sendMessage");
        System.out.println(m);
        context.close();
    } 
}
