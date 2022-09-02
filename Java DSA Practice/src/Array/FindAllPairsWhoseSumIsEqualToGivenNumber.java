package Array;

import java.util.Scanner;

public class FindAllPairsWhoseSumIsEqualToGivenNumber {

	public static int findPairs(int arr[] , int num) {
		
		  int count = 0;
		  
		  for(int i = 0 ; i < arr.length ; i++) {
			  
			  for(int j = i ; j < arr.length ; j++) {
				  
				    if( i != j ) {
				    	
				    	if(arr[i] + arr[j] == num) {
				    		
				    		count++;
				    	}
				    }
			  }
		  }
	 
	          return count;
	
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 5, 7, -1};
		
		int num = 6;
		
		int result = findPairs(arr, num);
		
		System.out.println(result);
	}

}
