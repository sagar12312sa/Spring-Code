/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.sagar.Product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 *
 * @author sagar
 */

@Configuration
@PropertySource("prods.properties")
public class AppConfig {
//    @Value("${prodId}")
//    private int prodId;
//    @Value("${prodName}")
//    private String prodName;
//    @Value("${prodCost}")
//    private double prodCost;
    @Autowired
    private Environment env;
    @Bean
    public Product getProduct(){
        Product product = new Product();
        product.setProdId(env.getProperty("prodId",Integer.class));
        product.setProdName(env.getProperty("prodName"));
        product.setProdPrice(env.getProperty("prodCost", Double.class));
        return product;
    }
}
