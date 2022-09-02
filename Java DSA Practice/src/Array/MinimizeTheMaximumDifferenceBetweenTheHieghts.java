package Array;

import java.util.Scanner;

public class MinimizeTheMaximumDifferenceBetweenTheHieghts {

	public static void minimizeMax(int arr[] , int k ) {
		
	        for(int i = 0 ; i < arr.length ; i++) {
	        	
	              if(arr[i] >= 10) {
	        		  
	        	  
	        	   arr[i] = arr[i] - k;
	        
	           }
	              
	              else {
	            	  
	            	  arr[i] = arr[i] + k;
	              }
	        	  
	        }
		
	       diffrence(arr);
	
	}
	
	

	public static void diffrence(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
		        if(arr[i] > max) {
		        	
		        	max = arr[i];
		        }
		
		        if(arr[i] < min) {
		        	
		        	min = arr[i];
		        }
		
		    System.out.print(arr[i] + " ");
		
		}
		
	       System.out.println();
		
		   int diff = max - min;
	       
	       System.out.println("Maximum Diffrence Between Hieghts is - " + diff);
	
	}



	public static void main(String[] args) {
		
		int arr[] = { 1 , 5 , 15 , 10};
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
	    minimizeMax(arr, k);

	}

}
