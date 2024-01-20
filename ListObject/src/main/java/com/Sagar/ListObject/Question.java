package com.Sagar.ListObject;

import java.util.List;
import java.util.Iterator;

public class Question {
   private int id;
   private String name;
   private List<Answer>answer;
   
   public Question(int id,String name,List<Answer>answer) {
	   this.id = id;
	   this.name = name;
	   this.answer = answer;
   }
   
   public void show() {
	   System.out.print(id+" "+name+" ");
	   Iterator<Answer>it = answer.iterator();
	   while(it.hasNext()) {
		   System.out.print(it.next()+" ");
	   }
   }
}
