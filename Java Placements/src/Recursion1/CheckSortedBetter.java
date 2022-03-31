package Recursion1;

import java.util.Scanner;

public class CheckSortedBetter {

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
	
	public static boolean checkBetter(int arr[] , int start) {
		
	if(start == arr.length - 1) {
		return true;
	}
	
	if(arr[start] > arr[start + 1]) {
		return false;
	}
	
	    return checkBetter(arr , start + 1);
	}
	
	public static void main(String[] args) {
		
    int arr[] = input();
    boolean result = checkBetter(arr , 0);
    System.out.println(result);
	}

}
