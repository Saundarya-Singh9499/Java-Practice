package Array;

public class KadanesAlgorithm {

	public static int kadanes(int arr[]) {
		
		int add = 0;
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			  add = add + arr[i];
			  
			 if(add > max) {
			 
			 max = add;
			 }
			 
		}
	
	       if(add < 0) {
	    	   
	    	   add = 0;
	       }
	
	    return max;
	
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1 , 2 , 3 , -2 , 5};
		
		int result = kadanes(arr);
		
		System.out.println(result);

	}

}
