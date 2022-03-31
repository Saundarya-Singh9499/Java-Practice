package Recursion1;

import java.util.Scanner;

public class CheckNumbersInArray {

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
	
	public static boolean check(int arr[] , int a ,  int start  ) {
		
     if( start == arr.length - 1) {
		if(arr[start]==a) {
			return true;	
		}
		else {
			return false;
		}

	}
	 if(arr[start] == a) {
	    	return true;
	 }
	    return check(arr , a , start + 1);
	   
     }
	
	public static void main(String[] args) {
    
     int arr[] = input();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number to Check in the Array");
     int a  = sc.nextInt();
     
     boolean result = check(arr , a , 0);
     
     System.out.println(result);

	}

}
