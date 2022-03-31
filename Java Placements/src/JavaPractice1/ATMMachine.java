package JavaPractice1;

import java.util.Scanner;

public class ATMMachine {

	public static int[] input() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			
			System.out.println("Enter the " + i + " th Element");
			arr[i] = sc.nextInt();
		}
	           return arr;
	}
	
	public static void atm(int arr[] , int k) {
		
	   for(int i = 0 ; i < arr.length ; i++) {
		   
       if(arr[i] <= k) {
    	   
       System.out.println("1");
       
       k = k - arr[i];
       }
       else if(arr[i] > k) {
    	   
    	   System.out.println("0");
       }
	   
	       
	   }
	
	}
	
	public static void main(String[] args) {
	
    int arr[] = input();
    
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    
    atm(arr, k);
    
	}

}
