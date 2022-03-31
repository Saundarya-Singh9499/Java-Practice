package Rajput;
import java.util.Scanner;
public class Days {

	public static void main (String[] args) {
		
       recursion();
     
	}
	
	public static void recursion() {
		
		
		Scanner as=new Scanner(System.in);
	       System.out.println("Enter the Days Saturday , Sunday or Monday and Exit to stop =");
	       String a=as.next();
	       
	       switch(a) {
	       case "Saturday":
	    	   System.out.println("I will take Rest");
	    	   
	       break;
	    	   
	       case "Sunday":
	    	   System.out.println("I will go to market");
	    	   
	      	 break;
	   
	       case "Monday":
	    	   System.out.println("I will go to work");
	    	   
	      	   break;
	      	   
	       case "Exit":
	    	   System.out.println("program is complete now");
	      	   break;
	       default:
	   	    System.out.println(" Invalid Input ,Please select between Saturday,Sunday and Monday");		
	   	    recursion();
	       }
	       	 
	       
	}
	
	}

