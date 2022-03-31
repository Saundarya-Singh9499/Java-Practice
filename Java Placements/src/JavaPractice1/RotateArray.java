package JavaPractice1;

import java.util.Scanner;

public class RotateArray {

	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Enter the" + i + "th Element");
			arr[i] = sc.nextInt();
		}
	          return arr;
	}
	
	public static void rotateArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
		
		for(int i = arr.length - 1; i >= 0 ; i--) {
		System.out.println(arr[i]);
		
		}
	     
		for(int j = arr.length - num - 1 ; j >= 0 ; j-- ) {
	    	  System.out.println(arr[j]);
	      }
	
	         for(int k = arr.length - 1 ; k >= arr.length - num ; k--) {
	        	 System.out.println(arr[k]);
	         }
	}
	
	public static void main(String[] args) {
	
    int[] arr = input();
    rotateArray(arr);

	}

}
