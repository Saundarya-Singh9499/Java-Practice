import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		
        Scanner sc =new Scanner(System.in);
		
        System.out.println("Enter a number you want = ");
	
         int a=sc.nextInt() ; 	
	
	    
         System.out.println("Add the number by");
	    
	      int b=sc.nextInt() ;             	
	
	      int c= a+b;
	      
	      System.out.println("Answer is " + c);
	
	
	
	System.out.println("Now Subtract the answer you got by the number you thought at the beginning ");
	
	int d=c-a;
	
	System.out.println("Answer is = " + d);
	
	}
	

}
