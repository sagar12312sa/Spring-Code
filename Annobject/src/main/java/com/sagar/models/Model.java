/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.models;

/**
 *
 * @author sagar
 */
public class Model {
  private int modelId;
  private String modelName;
  
  public void setModelId(int modelId){
      this.modelId = modelId;
  }
  
  public void setModelName(String modelName){
      this.modelName = modelName;
  }

    @Override
    public String toString() {
        return modelId+" "+modelName;
    }
  
  
}
