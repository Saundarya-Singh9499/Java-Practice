package Rajput;

import java.util.Scanner;

public class Functionn {
public static int addtwonumbers(int ab,int bc, String q) {
	int a,b,c = 0;
	if(q.equals("+")) {
    c=	ab+bc;
	}
	if(q.equals("-")) {
	    c=	ab-bc;
		}
	if(q.equals("*")) {
	    c=	ab*bc;
		}
	if(q.equals("/")) {
	    c=	ab/bc;
		}
	
	
	
return c ;
}

public static void main (String[] args) {
	
	Scanner sc=new Scanner(System.in);
 
    System.out.println("Enter two numbers = ");
    int ab=sc.nextInt();
    int bc=sc.nextInt();
	
	
	System.out.println("Enter the operation  +,-,*,/");
    String a=sc.next();
    
    switch(a) {

    case "+":
    	System.out.println("Addition is "  + addtwonumbers(ab,bc,a));
    break;
    
    case "-":
    	System.out.println("Subtraction is "  + addtwonumbers(ab,bc,a));
    break;
    case "*":
    	System.out.println("Multiplication is "  + addtwonumbers(ab,bc,a));
    break;
    case "/":
    	System.out.println("Division is "  + addtwonumbers(ab,bc,a));
    break;
    
    
    
    
    
    
    
    
    }
    

     
}





}


