package JavaPractice1;

import java.util.Scanner;

public class CountZerosRecursion {

	public static int input() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		return n;
	}
	
	public static int countZeros(int n) {
		
		if(n==0) {
			return 0 ;
		}
		
		if( n % 10 == 0) {
			return countZeros( n/ 10 ) + 1;
		}
		else return countZeros( n / 10 );
	}
	
	public static void main(String[] args) {
		
	int n = input();
	int result = countZeros(n);
	System.out.println(result);
	
	}

}
