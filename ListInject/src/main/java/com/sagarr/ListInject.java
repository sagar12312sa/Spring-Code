package com.sagarr;

import java.util.List;
import java.util.Iterator;

public class ListInject {

	private int id;
	private String name;
	private List<String>answer;
	
	public ListInject(int id,String name,List<String>answer) {
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	public void show() {
		System.out.print(id+" "+name+" ");
		Iterator<String>iterator = answer.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		}
	}
	
	
}
