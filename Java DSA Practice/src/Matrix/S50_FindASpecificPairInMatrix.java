package Matrix;

public class S50_FindASpecificPairInMatrix {

    public static int findPair(int arr[][]) {
    	
    	int diff = 0;
    	
    	int max = Integer.MIN_VALUE;
    	
    	for(int i = 0 ; i < arr.length ; i++) {
    		
    		for(int j = 0 ; j < arr[0].length ; j++) {
    			
    			for(int k = i + 1 ; k < arr.length ; k++) {
    				
    				for(int y = j + 1 ; y < arr[0].length ; y++) {
    					
    					 if(i != k) {
    						 
    						  diff = arr[k][y] - arr[i][j];
    						  
    						  if(diff > max) {	
    	    						 
    	    						 max = diff;
    	    					 }
    					 }
    					 
    					 
    				}
    			}
    		}
    	}
    
          return max;
    }
	
	public static void main(String[] args) {
		
		int arr[][] = {{ 1, 2, -1, -4, -20 },
	             { -8, -3, 4, 2, 1 }, 
	             { 3, 8, 6, 1, 3 },
	             { -4, -1, 1, 7, -6 },
	             { 0, -4, 10, -5, 1 }};
		
		int result = findPair(arr);
		
		System.out.println(result);

	}

}
