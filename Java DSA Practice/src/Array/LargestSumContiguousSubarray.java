package Array;

public class LargestSumContiguousSubarray {

	public static int largestSum(int arr[]) {
		
		int add = 0;
	 
	    int max = Integer.MIN_VALUE;
	    
	    for(int i = 0 ; i < arr.length ; i++) {
	    	
	    	add = add + arr[i];
	    	
	    	if( add > max) {
	    		
	    		max = add;
	    	}
	    
	           if(add < 0) {
	        	   
	        	   add = 0;
	           }
	    
	    }
	 
	    return max;
	
	}
	
	public static void main(String[] args) {
		
		  int arr[] = {-2 , -3 , 4, -1 , -2 , 1 , 5 , -3};
		  
		  int result = largestSum(arr);
		  
		  System.out.println(result);

	}

}
