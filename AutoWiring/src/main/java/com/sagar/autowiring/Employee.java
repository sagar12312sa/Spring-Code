/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.autowiring;

/**
 *
 * @author sagar
 */
public class Employee {
    private Address address;
    
    public Employee(Address address){
        this.address = address;
        System.out.println("Constructor");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" + "address=" + address + '}';
    }

    
}
