package Recursion1;

import java.util.Scanner;

public class SumOfDigits {

    public static int input() {
    	
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        return n;
    }
	
      public static int sumOfDigits(int n) {
    	  
    	  if(n==0) {
    		  return 0;
    	  }
      
            return sumOfDigits( n /10 ) + (n % 10 );
            
            
      }
   
      public static void main(String[] args) {
      
      int n = input();
      int result = sumOfDigits(n);
      System.out.println(result);

	}

}
