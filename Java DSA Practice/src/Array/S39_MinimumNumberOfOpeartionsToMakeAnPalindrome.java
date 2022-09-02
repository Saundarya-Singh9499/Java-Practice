package Array;

public class S39_MinimumNumberOfOpeartionsToMakeAnPalindrome {

    public static int minimumOperationsToMakeAnArrayPalindrome(int arr[]) {
    	
         int count = 0;
         
         int i = 0;
         
         int j = arr.length - 1;
         
         while( i < j ) {
        	 
        	  if(arr[i] < arr[j]) {
        		  
        		   arr[i + 1]+= arr[i];
        		   
        		   i++;
        		   
        		   count++;
        	  }
        	  
        	  else if(arr[i] > arr[j]) {
        		  
        		   arr[j - 1]+= arr[j]; 
        		   
        		   j--;
        		   
        		   count++;
        	  }
        	  
        	  else {
        		  
        		  i++;
        		  
        		  j++;
        	  }
         }
    
            return count;
    }
	
	public static void main(String[] args) {
		
		int arr[] = {11, 14, 15, 99};
		
		int result = minimumOperationsToMakeAnArrayPalindrome(arr);
		
		System.out.println(result);

	}

}
