
package com.tap;
import java.util.Date;
/**
 *
 * @author sagar
 */
public class Answer {
   private int id;
   private String name;
   private Date datePosted;

   public Answer(int id,String name,Date datePosted){
       this.id = id;
       this.name = name;
       this.datePosted = datePosted;
   }
   
   public String toString(){
       return id+" "+name+" "+datePosted;
   }
}
