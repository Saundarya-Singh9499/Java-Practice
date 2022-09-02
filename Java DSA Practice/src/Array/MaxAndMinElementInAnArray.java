package Array;

public class MaxAndMinElementInAnArray {

	public static void minMax(int arr[]) {
		
		int min = Integer.MAX_VALUE;
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length ; i++) {

			  if(arr[i] > max) {
				  
				  max = arr[i];
			  }
			  
			  if(arr[i] < min) {
				  
				  min = arr[i];
			  }
			   
		}
	         
		    System.out.println("Maximum Value is - " + max);
		    
		    System.out.println("Minimum Value is - " + min);
		    
		    
	}
	
	public static void main(String[] args) {
		
		int arr[] = {8 , 4 , 12 , 6 , 2 , 9 , 18 , 20 , 14 , 16};
		
		 minMax(arr);
		

	 }

}
