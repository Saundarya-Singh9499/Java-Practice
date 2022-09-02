package Array;

public class FindATripletThatSumToAGivenValue {

	public static void triplet(int arr[] , int sum) {
		
		int i = 0;
		
		int j = 0;
		
		int k = 0;
		
		for(i = 0 ; i < arr.length ; i++) {
			 
	         if(i == arr.length - 1) {
	        	 
	        	 System.out.println("No Triplet is equal to sum");
	         }
			 
		    for(j = i ; j < arr.length ; j++) {
				 
		      if(i != j) {
					
		       for(k = j ; k < arr.length ; k++) {
						 
				 if(j != k) {
							  
				   if(arr[i] + arr[j] + arr[k] == sum) {
								   
					    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
							   
				           return; 
				   
				    }
						  
				  }
					 
		        }
				    
		      }
			 
            }
		 
          }
		
        }
	
	public static void main(String[] args) {
		
		int arr[] = {12, 3, 4, 1, 6, 9}; 
		
		int sum = 24; 
		
		triplet(arr, sum);

	}

}
