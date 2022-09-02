package Array;

import java.util.Arrays;

public class Merge2SortedArraysWithoutUsingExtraSpace {

	public static void mergeSorted(int arr1[] , int arr2[]) {
		
	    int temp = 0;
		
		for(int i = 0 ; i < arr1.length ; i++) {
	    	
	    	for(int j = 0 ; j < arr2.length ; j++) {
	    		
	    		  if(arr1[i] < arr2[j]) {
	    			  
	    			  
	    		  }
	    	
	    		  else if(arr1[i] > arr2[j]) {
	    			  
	    			  temp = arr1[i];
	    			  
	    			  arr1[i] = arr2[j];
	    			  
	    			  arr2[j] = temp;
	    		  }
	    	}
	    }
	 
		       System.out.println("After Merging - ");
		       
		       System.out.print("First Array - ");
		
	           for(int k = 0 ; k < arr1.length ; k++) {
	        	   
	        	   System.out.print(arr1[k] + " ");
	           }
	           
	           System.out.println();
	           
	           Arrays.sort(arr2);
	           
	           System.out.print("Second Array - ");
	           
	           for(int y = 0 ; y < arr2.length ; y++) {
	        	   
	        	   System.out.print(arr2[y] + " ");
	           }
	
	}
	
	public static void main(String[] args) {
		
		 int arr1[] = {1, 5, 9, 10, 15, 20};
		 
		 int arr2[] = {2, 3, 8, 13};
		 
		 mergeSorted(arr1, arr2);

	}

}
