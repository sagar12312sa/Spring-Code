/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sagar.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author sagar
 */
public class LifeCycle implements InitializingBean,DisposableBean{

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("Properties are set");
    }
    
    
    public void afterPropertiesSet() throws Exception{
        System.out.println("After properties are set");
    }
    
    public void destroy() throws Exception{
        System.out.println("After the bean is destroyed");
    }
    public String toString(){
        return message;
    }
    
    public void show(){
        System.out.println("Show Method Executed");
    }
}
