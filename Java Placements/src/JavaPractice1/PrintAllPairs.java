package JavaPractice1;

import java.util.Scanner;

public class PrintAllPairs {

	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for( int i = 0 ; i< n ; i++) {
			System.out.println("Enter the" + i + "th Element");
			arr[i] = sc.nextInt();
		}
	       return arr;
	}
	
	public static void printpairs(int[] arr) {
		for( int i = 0 ; i < arr.length-1 ; i++) {
			for( int j = i+1 ; j < arr.length ; j++) {
				
				System.out.println("(" + arr[i] + "," + arr[j] + ")");
			}
		}
		
}
	public static void main(String[] args) {
	  
		int[] arr = input();
		printpairs(arr);

	}

}
