package conditionalandloops;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Number here :- ");
		int n = sc.nextInt();
		
		boolean isPrime= true;
		int i= 2;
		
		while(i <= n-1) {
			if( n%i == 0) {
				isPrime = false;
			}
         i=i+1;		
		}
		if(isPrime) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
		
	}

}
