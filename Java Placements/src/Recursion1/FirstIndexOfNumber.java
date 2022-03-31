package Recursion1;

import java.util.Scanner;

public class FirstIndexOfNumber {

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
	
	public static int firstIndex(int arr[] , int num , int start) {
	
		if(start == arr.length  ) {
			return -1;
			
		}
	     if(arr[start] == num) {
	    	 return start;
	     }
		
	
	     return firstIndex(arr , num , start + 1);  
	}
	
	
	public static void main(String[] args) {
		
    int arr[] = input();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check in First Index");
    int num = sc.nextInt();
    
    int result = firstIndex(arr , num , 0);
    System.out.println(result);
	}

}
