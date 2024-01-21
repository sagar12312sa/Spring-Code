/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.AddressDAOImpl;
import com.sagar.AddressDAO.Address;

/**
 *
 * @author sagar
 */
public class CurrentAddress implements Address{
    private String city;
    private String state;

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "CurrentAddress{" + "city=" + city + ", state=" + state + '}';
    }
}
