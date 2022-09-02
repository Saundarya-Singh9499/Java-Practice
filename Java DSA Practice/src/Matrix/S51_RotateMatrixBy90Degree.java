package Matrix;

public class S51_RotateMatrixBy90Degree {

    public static void rotateMatrix(int arr[][]) {
    	
    	 int newArr[][] = new int[arr.length][arr[0].length];
    	 
    	 int r = 0;
    	 
    	 int c = 0;
    	 
    	 for(int i = 0 ; i < arr.length ; i++) {
    		 if(i == 1) {
    			 
    			 break;
    		 }
    		 for(int j = 0 ; j < arr[0].length ; j++) {
    			 c = 0;
    			 for(int k = 0 ; k < arr.length ; k++) {
    				 
    				 for(int y = 0 ; y < arr[0].length ; y++) {
    					
    					 if(y == arr[0].length - 1 - j){
    						 
    						  newArr[r][c] = arr[k][y];
    								  
    						   c++;		  
    					 }
    				 }
    				  
    			 }
    			   r++;
    		 }
    	 }
    	 
    	   for(int i = 0 ; i < newArr.length ; i++) {
    		   
    		   for(int j = 0 ; j < newArr[0].length ; j++) {
    			   
    			     System.out.print(newArr[i][j] + " ");
    		   }
    		   
    		      System.out.println();
    	   }
    }
	
	public static void main(String[] args) {
		
	    int arr[][] = {{1 , 2 , 3 , 4}, 
	    		 {5 , 6 , 7 , 8}, 
	    		 {9 , 10 , 11 , 12}, 
	    	    {13 , 14 , 15 , 16}}; 

	    
	    rotateMatrix(arr);

	}

}
