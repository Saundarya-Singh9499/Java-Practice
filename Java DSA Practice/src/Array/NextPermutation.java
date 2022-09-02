package Array;

import java.util.Arrays;

public class NextPermutation {

	public static void nextPerm(int arr[]) {
		
		int temp = 0;
		
		int temp2 = 0;
		
		 for(int i = arr.length - 1 ; i >= 0 ; i--) {
			
			 
			if(arr[i] > arr[i - 1]) {
				  
				  temp = arr[i - 1];
				  
				  temp2 = i;
				  
				  for(int j = arr.length - 1 ; j >= 0 ; j--) { 
					  
					  if(arr[j] > temp) {
			    	    	
			    	    	arr[i - 1] = arr[j];
			    	    	
			    	    	arr[j] = temp;
			    	    	
			    	    	break;
			    	    }
			        
			     }
			         
				    break;
			  }
		 
			if(i == 1) {
		    	
		    	Arrays.sort(arr);
		    	
		    	break;
		    }         
		
		 }
	
		  reverse(arr , temp2);
	}
	
	public static void reverse(int[] arr, int temp2) {

		int arr2[] = new int[arr.length];  
		
		for(int k = temp2 ; k < arr.length ; k++) {
			  
			    arr2[k] = arr[k];
			    
			 }
		
		Arrays.sort(arr2);
		
	       for(int i = 0 ; i < arr.length ; i++) {
	    	   
	    	   if(i == temp2) {
	    		   
	    		   for(int j = temp2 ; j < arr.length ; j++) {
	    			   
	    			     arr[j] = arr2[j];
	    			    
	    		   }
	    	   
	    	   }
	    	   
	           System.out.print(arr[i] + " ");
	       }
	
	}


	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 6, 5, 4};
		
		nextPerm(arr);

	}

}
