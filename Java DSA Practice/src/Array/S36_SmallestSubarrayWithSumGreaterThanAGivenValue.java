package Array;

public class S36_SmallestSubarrayWithSumGreaterThanAGivenValue {

	public static void smallestSubarray(int arr[] , int numb) {
		
		 int count = 0;
		 
		 int min = Integer.MAX_VALUE;
		 
		 int add = 0;
		 
		 for(int i = 0 ; i < arr.length ; i++) {
			 
			 for(int j = i ; j < arr.length ; j++) {
				 
                  add = add + arr[j];
					  
					  count++;
					  
					  if(add > numb) {
						  
						     if( min > count ) {
						    	 
						    	 min = count;
						    	 
						      }
					      
						     count = 0;
						     
						     add = 0;
						     
						     break;
					  }
					  
					     if(j == arr.length - 1) {
					    	 
					    	 if(add <= numb) {
					    		 
					    		 count = 0;
					    		 
					    		 add = 0;
					    		 
					    		 break;
					    	 }
					     }
				   
			 }
		 }
	
		 if(min == Integer.MAX_VALUE) {
			 
			  System.out.println("Not Possible");
		 }
		 
		 else {
			 
			     System.out.println(min);
		 }
	           
	}
	
	public static void main(String[] args) {
		
	    int arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
	    
	    int numb = 280;
	    
	    smallestSubarray(arr, numb);
	  
     }

}
