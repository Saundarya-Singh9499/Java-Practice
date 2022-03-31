package Recursion1;

import java.util.Scanner;

public class LastIndexOfArray {

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
	
	public static int lastIndex(int arr[] , int num , int last) {
		
		if(last == -1 ) {
			return -1;
		}
	
	if(arr[last] == num) {
		return last;
	}
	
	    return lastIndex(arr , num , last - 1);
	}
	
	public static void main(String[] args) {
		
    int arr[] = input();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check in Last Index");
    int num = sc.nextInt();
    int last = arr.length - 1 ;
    int result = lastIndex(arr , num , last );
	
	System.out.println(result);
	}

}
