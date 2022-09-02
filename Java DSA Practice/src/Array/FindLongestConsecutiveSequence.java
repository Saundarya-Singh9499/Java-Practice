package Array;

import java.util.Arrays;

public class FindLongestConsecutiveSequence {

	public static int longestConsecutive(int arr[]) {
		
        int count = 1;
        
        int max = Integer.MIN_VALUE;
        
        Arrays.sort(arr);
        
        for(int i = 1 ; i < arr.length ; i++) {
        	
        	 if(arr[i] == arr[i - 1] + 1) {
        		 
        		 count++;
        	 }
        	 
        	 else {
        		 
        		 count = 1;
        	 }
        
                if(count > max) {
                	
                	max = count;
                }
        }
	
	        return max;
	}
	
	public static void main(String[] args) {
		
       int arr[] = {1, 9, 3, 10, 4, 20, 2};
       
       int result = longestConsecutive(arr);
       
       System.out.println(result);
       

	}

}
