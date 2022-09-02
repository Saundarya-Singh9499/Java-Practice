package Array;

public class FindWhetherAnArrayIsSubsetOfAnotherArray {

	public static void subset(int arr1[] , int arr2[]) {
		
	    int count = 0;
	    
	    for(int i = 0 ; i < arr1.length ; i++) {
	    	
	    	for(int j = 0 ; j < arr2.length ; j++) {
	    		
	    		  if(arr2[j] == arr1[i]) {
	    			  
	    			  count++;
	    			  
	    			  break;
	    		  }
	    		  
	    	}
	    
	    }
	
	            if(count == arr2.length) {
	            	
	            	System.out.println("arr2[] is a subset of arr1[]");
	            }
	            
	            else {
	            	
	            	 System.out.println("arr2[] is not a subset of arr1[]");
	            }
	}
	
	public static void main(String[] args) {
		
	    int arr1[] = {11, 1, 13, 21, 3, 7};
	    
	    int arr2[] = {11, 3, 7, 1};
	    
	    subset(arr1, arr2);

	}

}
