package JavaPractice1;

import java.util.Scanner;

public class FibnacciNumberRecursion {

	public static int input() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	 
	    return n;
	}
	
	public static int fibn(int n) {
		
    if(n==0 || n==1) {
     return n;
    }
	
	 return fibn( n - 1 ) + fibn( n - 2 );
	        
	}
	
	public static void main(String[] args) {
		
    int n = input();
    int result = fibn(n);
    System.out.println(result);
	
	}

}
