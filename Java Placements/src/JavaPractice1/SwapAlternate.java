package JavaPractice1;

import java.util.Scanner;

public class SwapAlternate {

	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for( int i = 0 ; i < n ; i++) {
			System.out.println("Enter the" + i + "th Element");
			arr[i] = sc.nextInt();
		}
	        return arr;
	}
	
	public static void swap(int[] arr) {
		
		for(int i = 0 ; i < arr.length-1 ; i+=2) {
			
			int container = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = container;
			System.out.print( arr[i] + " " + container + " " );
		
		}
		
	}
		
	public static void main(String[] args) {
     
    int[] arr = input();
         swap(arr);
         
	}

}
