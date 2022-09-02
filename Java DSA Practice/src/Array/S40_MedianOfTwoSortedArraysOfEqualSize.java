package Array;

import java.util.Arrays;

public class S40_MedianOfTwoSortedArraysOfEqualSize {

	public static int medianOfTwoSortedArrays(int arr1[] , int arr2[]) {
		
		int median = 0;
		
		int newArr[] = new int[arr1.length + arr2.length];
		
		int n = newArr.length / 2;
        
		int i = 0;
		
		for( i = 0 ; i < arr1.length ; i++) {
	    	
			newArr[i] = arr1[i];
		
	    }
		
		for(int j = 0 ; j < arr2.length ; j++) {
			
			  newArr[i] = arr2[j];
			  
			  i++;
		}
		
		Arrays.sort(newArr);
			
		 
		        if(newArr.length%2 == 0) {
		        	
		        	 median = (newArr[n] + newArr[n -1]) / 2;
		        }
		        
		        else {
		        	
		            median = newArr[n];
		        }
		
	
	        return median; 
	}
	
	public static void main(String[] args) {
		
		int arr1[] = {1 , 12 , 15 , 26 , 38};
		
		int arr2[] = {2 , 13 , 17 , 30 , 45};
		
	    int result = medianOfTwoSortedArrays(arr1, arr2);
	    
	    System.out.println(result);
		
		

	}

}
