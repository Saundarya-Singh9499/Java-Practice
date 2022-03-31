package JavaPractice1;

import java.util.Scanner;

public class NiceTeam {

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
	
	public static int niceTeam( int arr[] , int diff ) {
	   
		int count = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
	    
		  for(int j = 0 ; j < arr.length ; j++) {
			  
			  if(arr[i] - arr[j] == diff ) {
				  
				   count+= 1;
			  }
		  }
	   }
	
	     if(count > 0) {
	    	 
	    	 return count;
	     }
	     else {
	    	 
	    	 return 0;
	     }
	}
	
	public static void main(String[] args) {
		
    int arr[] = input();
    
    Scanner sc = new Scanner(System.in);
    int diff = sc.nextInt();
    
    int result = niceTeam(arr, diff);
    System.out.println(result);
	
	}

}
