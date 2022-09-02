package Array;

public class S37_ThreeWayPartitioningOfAnArrayAroundAGivenRange {

    public static int[] partitionOfAnArray(int arr[] , int lowVal , int highVal) {
    	
        int index1 = 0;
    	
    	int index2 = 0;
    	
    	int index3 = 0;
    	
    	int temp = 0;
    	
    	int newArr[] = new int[arr.length];
    	  
    	  for(int  i = 0 ; i < arr.length ; i++) {
    		  
    		   if(arr[i] < lowVal) {
    			   
    			   newArr[index1] = arr[i];
    			   
    			   index1++;
    			   
    		   }
    		   
    		   if(arr[i] == lowVal) {
    			   
    			   temp = lowVal;
    		   }
    		   
    		     if(i == arr.length - 1) {
    		    	 
    		    	  if(temp > 0) {
    		    		  
    		    		  newArr[index1] = lowVal;
        		    	  
    	    		    	 index1++;
    		    	  }
    		    	  
    		    	  else {
    		    		  
    		    		  break;
    		    	  }
    		     }
    	  }
    	
             index2 = index1;
             
             for(int j = 0 ; j < arr.length ; j++) {
            	  
            	   if(arr[j] > lowVal && arr[j] < highVal) {
            		   
            		   newArr[index2] = arr[j];
            		   
            		   index2++;
            		   
            	   }
            	   
            	   if(arr[j] == highVal) {
            		   
            		   newArr[index2] = arr[j];
            		   
            		   index2++;
            	   }
            	 
              }
    
                 index3 = index2; 
             
                 for(int k = 0 ; k < arr.length ; k++) {
                	  
                	   if(arr[k] > highVal) {
                		   
                		   newArr[index3] = arr[k];
                		   
                		   index3++;
                	   }
               }
    
                   return newArr;
        }
	
	public static void main(String[] args) {
		
		int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
		
		int lowVal = 14; 
		
		int highVal = 20;
		
		int result[] = partitionOfAnArray(arr, lowVal, highVal);
		
		for(int y = 0 ; y < result.length ; y++) {
			
			  System.out.print(result[y] + " ");
		}

	}

}
