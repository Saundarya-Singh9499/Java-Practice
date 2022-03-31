package Arrays;

import java.util.Scanner;

public class ArrangeNumbersArray {

	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int num = 1;
		for( int i = 0 ; i <=(n-1)/2 ; i++) {
			 arr[i] = num;
			 num += 2;
			 System.out.println(arr[i]);
		}
	        
	      for( int j = (n-1)/2 + 1 ; j <= n-1 ; j++) {
	        	 
	    	  arr[j] = n;
	        		 n-= 2;
	        		 System.out.println(arr[j]);
	        		 
	        	 }
	         
	              
	        	
	        	   
	       
	return arr;
	}
	
	
	public static void main(String[] args) {
		int arr[] = input();
	
	}

}
