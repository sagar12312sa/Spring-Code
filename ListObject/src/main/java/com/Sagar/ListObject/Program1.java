package com.Sagar.ListObject;

import java.util.Map;

public class Program1 {
    
	private int id;
	private String name;
	private Map<String,String>answer;
	
	public Program1(int id,String name,Map<String,String>answer){
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	public void show() {
		System.out.print(id+" "+name+" ");
		for(Map.Entry<String,String>entry : answer.entrySet()) {
			System.out.print(entry.getKey()+" "+entry.getValue());
		}
	}
}
