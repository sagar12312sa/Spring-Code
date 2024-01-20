/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sagar
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        LifeCycle lc = (LifeCycle) context.getBean("life");
        System.out.println(lc);
        lc.show();
        context.close();
    }
}
