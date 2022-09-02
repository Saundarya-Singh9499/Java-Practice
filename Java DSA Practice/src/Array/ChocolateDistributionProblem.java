package Array;

import java.util.Arrays;

public class ChocolateDistributionProblem {

	public static int chocolateDistribution(int arr[] , int m) {
		
		 int max = Integer.MIN_VALUE;
		 
		 int min = Integer.MAX_VALUE;
		 
		 int min2 = Integer.MAX_VALUE;
		 
		 int diff = 0;
		 
		 Arrays.sort(arr);
		 
		 for(int i = 0 ; i < arr.length ; i++) {
			 
			 for(int j = i ; j < arr.length ; j++) {
				 
				  if( j == m-1) {
					  
					  m++;
					   
					  for(int k = i ; k <= j ; k++) {
						   
						    if(arr[k] > max) {
						    	
						    	max = arr[k];
						    }
					   
					       if(arr[k] < min) {
					    	   
					    	   min = arr[k];
					       }
					   
					        
					   }
					     diff = max - min;
				          
				          if(diff < min2) {
				        	  
				        	   min2 = diff;
				          }
				 
				            max = Integer.MIN_VALUE;
				            
				            min = Integer.MAX_VALUE;       
				      
				            break;   
				  }
			 
			       if( m == arr.length + 1) {
			    	 
			    	 break;
			     }
			 }
		       
			 if( m == arr.length + 1) {
		    	 
		    	 break;
		     }  
		 
		         
		 }
	
	           return min2;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
		
		int m = 5;
		
		int result = chocolateDistribution(arr, m);
		
		System.out.println(result);

	}

}
