package OOPS;

public class Constructors {

	String name;
	int age;

    public Constructors(String name , int age) {
    	
    	this.name = name;
    	this.age = age;
    	
       }
         
     public  Constructors(String str) {
        	 
        	 name = str;
        	 
                         
             
     }
      
      public void print() {
        	 
        System.out.println(name + " " + age);
      
      }

}
