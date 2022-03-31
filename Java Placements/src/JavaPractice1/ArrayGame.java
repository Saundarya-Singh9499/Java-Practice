package JavaPractice1;

import java.util.Scanner;

public class ArrayGame {

	public static int[] input() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		 for (int i = 0 ; i < n ; i++) {
			System.out.println("Enter the " + i + " th Element");
			 arr[i] = sc.nextInt();
		}
	      return arr;
	}
	
	public static boolean game(int arr[] , int leap) {
		
	    int i;
		for ( i = 0 ; i < arr.length ; i++) {
		
			if(arr[i + leap] != 0) {
	        	return false;
	        }
			if(arr[i + leap] == 0) {
			
			 i+=1;
			 if(i+ leap >= arr.length) {
				 return true;
		      } 
			 
	     }
	    			 
	     }
	        
		return true;
		}
	
	     
	
	
	
	public static void main(String[] args) {

    int arr[] = input();
    Scanner sc = new Scanner(System.in);
    int leap = sc.nextInt();
    
    boolean result = game(arr , leap);
    System.out.println(result);
		
	}

}
