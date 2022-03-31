package Recursion1;

import java.util.Scanner;

public class CalculatePower {

	public static int input() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	 return n ; 
		
	}
	
	public static int power(int x , int n) {
		
	if(n==0) {
		return 1;
	}
	
	return (x* power(x , n - 1));
	}
	
	public static void main(String[] args) {
		
    int x = input();
    int n = input();
    int ans = power( x , n);
    System.out.println(ans);
	
	
	
	}

}
