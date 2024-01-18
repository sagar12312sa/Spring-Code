/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tap;
import java.util.Map;

/**
 *
 * @author sagar
 */
public class Question {
    private int id;
    private String name;
    private Map<Answer,User>answer;
    
    public Question(int id,String name,Map<Answer,User>answer){
        this.id = id;
        this.name = name;
        this.answer = answer;
    }
    
    public void show(){
        System.out.print(id+" "+name+" ");
        for(Map.Entry<Answer,User>entry : answer.entrySet()){
            System.out.print(entry.getValue()+" "+entry.getValue()+" ");
        }
    }
}
