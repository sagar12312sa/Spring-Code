/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.config;

import org.springframework.context.annotation.Configuration;
import com.sagar.AddressDAOImpl.PermanentAddress;
import org.springframework.context.annotation.Bean;
import com.sagar.AddressDAOImpl.CurrentAddress;
import com.sagar.Employee.Employee;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author sagar
 */
@Configuration
public class AppConfig {
    @Bean("first")
    public PermanentAddress getPermanentAddress(){
        PermanentAddress pa = new PermanentAddress();
        pa.setCity("Kadur");
        pa.setState("Karnataka");
        return pa;
    }
    
    @Primary
    @Bean("second")
    public CurrentAddress getCurrentAddress(){
        CurrentAddress ca = new CurrentAddress();
        ca.setCity("Bengaluru");
        ca.setState("Karnataka");
        return ca;
    }
    
    @Bean
    public Employee getEmployee(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Sagar");
        return employee;
    }
}
