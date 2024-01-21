/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.config;

import com.sagar.message.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author sagar
 */
@Configuration
public class AppConfig {
    @Bean
   public Message sendMessage(){
       Message m = new Message();
       m.setMessage("Hello");
       return m;
   }
}
