package Recursion1;

import java.util.Scanner;

public class SumOfNauturalNumbers {

	public static int input() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	 return n ;
	}
	
	public static int sum(int n) {
		
	 if(n==1) {
		return 1;
	}
	
	return sum(n - 1) + n ;
	}
	
	public static void main(String[] args) {
    
    int n = input();
    int ans = sum(n);
    System.out.println(ans); 
	
	}

}
