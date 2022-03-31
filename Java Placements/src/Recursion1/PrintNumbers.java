package Recursion1;

import java.util.Scanner;

public class PrintNumbers {

    public static int input() {
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
   
        return n;
    }
	
	public static void printNumbers(int n) {
		
		if(n==0) {
        
			return;
		}
	
	         printNumbers( n - 1 );
	        System.out.println(n);
	        
		
	}
    
    public static void main(String[] args) {
		
    int n = input();
     printNumbers(n);	
    }

}
