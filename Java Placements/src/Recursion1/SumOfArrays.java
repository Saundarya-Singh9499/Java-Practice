package Recursion1;

import java.util.Scanner;

public class SumOfArrays {

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
	
	public static int sumOfArrays(int[] arr ,  int start) {
	
	if(start == arr.length - 1 ) {
		return arr[arr.length - 1];
	}
	   return sumOfArrays(arr , start + 1  ) + arr[start];
	         
	}
	
	
	public static void main(String[] args) {
    
    
    int arr[] = input();
    int answer = sumOfArrays(arr , 0);
    System.out.println(answer);
	}

}
