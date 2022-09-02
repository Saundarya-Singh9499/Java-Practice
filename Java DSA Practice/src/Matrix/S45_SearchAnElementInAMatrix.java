package Matrix;

public class S45_SearchAnElementInAMatrix {

    public static void searchElement(int arr[][] , int n) {
    	
    	for(int i = 0 ; i < arr.length ; i++) {
    		 
    		for(int j = 0 ; j < arr[0].length ; j++) {
    			 
    			 if(arr[i][j] == n) {
    				 
    				 System.out.println("Element Found at " + "(" + i + "," + j + ")");
    				 
    				 return;
    			 }
    			 
    		}
    	 
    	 }
    
    	System.out.println("Element Not Found");
    	
        return;	
     
    }
	
	public static void main(String[] args) {
		
		int arr[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
              {32, 33, 39, 50}};
		
		int n = 29;
		
		searchElement(arr, n);
	}

}
