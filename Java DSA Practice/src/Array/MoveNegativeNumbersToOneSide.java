package Array;

public class MoveNegativeNumbersToOneSide {

	public static void moveToOneSide(int arr[]) {
		
		 int temp = 0;
		 
		 for(int i = 0 ; i < arr.length ; i++) {
			 
			 if(arr[i] >= 0) {
				 
				 temp = arr[i];
				 
				 for(int j = i+1; j < arr.length ; j++) {
					 
					   if(arr[j] < 0) {
						   
						    arr[i] = arr[j];
						    
						    arr[j] = temp;
						    
						    break;
					   }
				 }
			 }
		 }
	
	         for(int k = 0 ; k < arr.length ; k++) {
	        	 
	        	   System.out.print(arr[k] + " ");
	         }
	
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2 , -1 , 12 , 6 , -4 , -8 , 4 ,- 2 ,-12 , 14 , 18 , -24 , 40};
        
	    moveToOneSide(arr);	
	
	}

}
