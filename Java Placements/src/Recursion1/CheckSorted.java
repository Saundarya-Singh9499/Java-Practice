 package Recursion1;

import java.util.Scanner;

public class CheckSorted {

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
	
    public static boolean checkSorted(int[] arr) {
    	  
    	if(arr.length<=1) {
    		return true;
    	}
    
          int smallArr[] = new int[arr.length-1];
          for(int i = 1 ; i < arr.length ; i++) {
        	  smallArr[i-1] = arr[i];
          }
    
             if(arr[0] <= arr[1]) {
            	 return true;
             }
             else {
            	 return false;
             }
    }
	
	public static void main(String[] args) {
	
    int arr[] = input();
    boolean result = checkSorted(arr);
    System.out.println(result);

	}

}
