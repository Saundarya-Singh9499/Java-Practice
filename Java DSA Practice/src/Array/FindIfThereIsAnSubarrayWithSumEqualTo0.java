package Array;

public class FindIfThereIsAnSubarrayWithSumEqualTo0 {

	public static boolean findSubarray(int arr[]) {
	
		 for(int i = 0 ; i < arr.length ; i++) {
	    	
	    	int add = 0;
	    	
	    	for(int j = i ; j < arr.length ; j++) {
	    		
	    		add = add + arr[j];
	    		
	    		if(add == 0) {
	    			
	    			return true;
	    		}
	    		
	    	}
	    	
	    }
	
	        return false;
	}
	
	public static void main(String[] args) {
		
	    int arr[] = {4, 2, -3, 1, 6};
	    
	    boolean result = findSubarray(arr);
	    
	    System.out.println(result);

	}

}
