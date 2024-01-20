package com.Sagar.ListObject;

public class Answer {
   
	private int id;
	private String name;
	private String author;
	
	public Answer(int id,String name,String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public String toString() {
		return id+" "+name+" "+author;
	}
}
