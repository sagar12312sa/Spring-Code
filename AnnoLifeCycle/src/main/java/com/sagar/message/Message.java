/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.message;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
/**
 *
 * @author sagar
 */
public class Message {
    private String message;
    
    public void setMessage(String message){
        this.message = message;
    }
    
    public String toString(){
        return message;
    }
    @PostConstruct
    public void init(){
        System.out.println("After Bean Initialsisation");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("before bean is destroyed");
    }
}
