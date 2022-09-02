package Array;

public class S38_MinimumSwapsRequiredToBringElements {

	public static int minimumSwaps(int arr[] , int k) {
		
	    int count = 0;
	    
	    int temp = 0; 
	    
	    int contain = 0;
	    
	   for(int i = 0 ; i < arr.length ; i++) {
	        
	    	if(arr[i] > k) {
	    
	    	    temp = i;
	    	    
	    	    contain = arr[i]; 
	    		  
	    		  for(int j = temp ; j < arr.length ; j++) {
	    			  
	    			    if(arr[j] <= k) {
	    			    	
	    			    	arr[i] = arr[j];
	    			    	
	    			        arr[j] = contain;
	    			    	
	    			    	count++;
	    			    	
	    			    	break;
	    			    }
	    		  }
	    
	   }
	
	}
	
          return count;
	
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2, 7, 9, 5, 8, 7, 4};
		
		int k = 5;
		
		int result = minimumSwaps(arr, k);
		
		System.out.println(result);

	}

}
