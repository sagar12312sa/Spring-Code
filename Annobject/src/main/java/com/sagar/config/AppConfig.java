/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.sagar.models.Model;
import com.sagar.prod.Product;

/**
 *
 * @author sagar
 */

@Configuration
public class AppConfig {
   @Bean
   public Model mod(){
       Model m = new Model();
       m.setModelId(1);
       m.setModelName("Sagar");
       return m;
   }   
   @Bean
   public Product prod(){
       Product p = new Product();
       p.setProdId(1);
       p.setprodName("Laptop");
       p.setprodModel(mod());
       return p;
   }
}
