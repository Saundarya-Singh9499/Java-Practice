package Recursion1;

import java.util.Scanner;

public class NumberOfDigits {

	public static int input() {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	return n;
	
   }
	
      public static int numberOfDigits(int n) {
    	  
    	  if(n==0) {
    		  return 0;
    	  }
      
      int count = numberOfDigits( n/10 );
      return count + 1;
      
      }
	
	public static void main(String[] args) {
		
    int n = input();
    int result = numberOfDigits(n);
    System.out.println(result);
	}

}
