package com.sagar;

public class Login {
   private String name;
   private String password;
   
   public Login(String name,String password) {
	   this.name = name;
	   this.password = password;
   }
   
   public void show() {
	   System.out.println(name+" "+password);
   }
}
