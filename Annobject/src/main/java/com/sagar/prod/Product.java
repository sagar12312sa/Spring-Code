/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.prod;

import com.sagar.models.Model;
/**
 *
 * @author sagar
 */
public class Product {
    private int prodId;
    private String prodName;
    private Model prodModel;
    
    public void setProdId(int prodId){
        this.prodId = prodId;
    }
    
    public void setprodName(String prodName){
        this.prodName = prodName;
    }
    
    public void setprodModel(Model prodModel){
        this.prodModel = prodModel;
    }
    
    public String toString(){
        return prodId+" "+prodName+" "+prodModel;
    }
}
