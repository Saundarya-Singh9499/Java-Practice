package Array;

import java.util.Arrays;

public class TappingRainWaterProblem {

	public static int tappingWater(int arr[]) {
		
		int max = Integer.MIN_VALUE;
		
		int temp1 = 0;
		
		int temp2 = 0;
		
		int add = 0;
		
		int value = 0;
		
		int index = 0;
		
		int temp3 = 0;
		
		int add2 = 0;
		
	    int value2 = 0;
	    
	    int addition= 0;
		
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			
			 if(arr[i] > max) {
				 
				 max = arr[i];
				 
				 temp1 = i;
			 }
		}
	
	       if( temp1 == 0) {
	    	   
	    	   for(int i = arr.length - 1 ; i >= temp1 ; i-- ) {
	    		   if(i == temp1) {
	    			   
	    			   break;
	    		   }
	    		   
	    	  for(int j = i ; j >= temp1 ; j-- ) {
	    		     temp2 = 0;
	    		   
	    		   if(arr[i] > arr[j]) {
	    			   
	    			   value = j;
	    			   
	    			   temp2 = arr[i] - arr[j];
	    			     
	    			   add = temp2 + add;
	    		   }
	    	   
	    		   else if(arr[i] < arr[j]) {
	    			   
	    			     i = value;
	    			     
	    			     break;
	    		   }
	    		   
	    		    
	    		}
	     }
	   
	  }
	
	       else if (temp1 == arr.length - 1){
	    	   
	    	   for(int i = 0 ; i < arr.length ; i++ ) {
	    		   if(i == arr.length - 1) {
	    			   
	    			   break;
	    		   }
	    		   
	    	  for(int j = i ; j < arr.length ; j++ ) {
	    		     temp2 = 0;
	    		   
	    		   if(arr[i] > arr[j]) {
	    			   
	    			   value = j;
	    			   
	    			   temp2 = arr[i] - arr[j];
	    			     
	    			   add = temp2 + add;
	    		   }
	    	   
	    		   else if(arr[i] < arr[j]) {
	    			   
	    			     i = value;
	    			     
	    			     break;
	    		   }
	    		   
	    		    
	    		}
	     }
	       }
	       
	       else {
	    	   
	    	    for(int i = 0 ; i < temp1 + 1 ; i++ ) {
		    		   if(arr[i] == max) {
		    			   
		    			   index = i;
		    			   
		    		   	   for(int k = arr.length - 1 ; k >= index ; k-- ) {
		    	    		   if(k == index) {
		    	    			   
		    	    			   break;
		    	    		   }
		    	    		   
		    	    	  for(int j = i ; j >= index ; j-- ) {
		    	    		     temp3 = 0;
		    	    		   
		    	    		   if(arr[k] > arr[j]) {
		    	    			   
		    	    			   value2 = j;
		    	    			   
		    	    			   temp3 = arr[k] - arr[j];
		    	    			     
		    	    			   add2 = temp3 + add2;
		    	    		   }
		    	    	   
		    	    		   else if(arr[k] < arr[j]) {
		    	    			   
		    	    			     k = value2;
		    	    			     
		    	    			     break;
		    	    		   }
		    	    		   
		    	    		    
		    	    		}
		    	     }
		    		   
		    		    break; 
		          }
		    		   
		    	  for(int j = i ; j < arr.length ; j++ ) {
		    		     temp2 = 0;
		    		   
		    		   if(arr[i] > arr[j]) {
		    			   
		    			   value = j;
		    			   
		    			   temp2 = arr[i] - arr[j];
		    			     
		    			   add = temp2 + add;
		    		   }
		    	   
		    		   else if(arr[i] < arr[j]) {
		    			   
		    			     i = value;
		    			     
		    			     break;
		    		   }
		    		   
		    		    
		    		}
		     }
	       
	     }
	       
	       addition = add + add2;
	       
	       return addition;
	            
	}
	
	public static void main(String[] args) {
		
		 int arr[] = {2, 0, 2};
		 
		 int result = tappingWater(arr);
		 
		 System.out.println(result);

	}

}
