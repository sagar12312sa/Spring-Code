/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.sagar.autowiring.Address;
import com.sagar.autowiring.Employee;

/**
 *
 * @author sagar
 */
@Configuration
public class AppConfig {
    @Bean
    public Address getAddress(){
        Address address = new Address();
        address.setCity("Bengaluru");
        address.setState("Karnataka");
        address.setCountry("India");
        return address;
    }
    @Bean
    public Employee getEmployee(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Sagar");
        return employee;
    }
}
