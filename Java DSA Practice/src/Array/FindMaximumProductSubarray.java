package Array;

public class FindMaximumProductSubarray {

	public static int maximumProduct(int arr[]) {
		
		int max = Integer.MIN_VALUE;  
		
		for(int i = 0 ; i < arr.length ; i++) {
			 
		    int mult = 1;
			
			for(int j = i ; j < arr.length ; j++) {
			 
				mult = mult * arr[j];
			    
			    if( mult > max ) {
			    	
			    	max = mult;
			    }
		   
		   }
		 
		}
	
	       return max;
	       
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 6, -3, -10, 0, 2 };
		
	    int result = maximumProduct(arr);
	    
	    System.out.println(result);

	}

}
