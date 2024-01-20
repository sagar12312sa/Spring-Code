/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sagar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sagar
 */
public class Hello {
    
    
     String name;
    
    public Hello(String name){
        this.name = name;
    }
    public void show(){
        System.out.println(name);
    }
    

}
