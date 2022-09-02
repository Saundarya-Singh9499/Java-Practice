package Array;

public class CountInversion {

	public static int countInversion(int arr[]) {
		
		 int count = 0 ; 
		 
		 for(int i = 0 ; i < arr.length ; i++) {
			 
			 for(int j = i + 1 ; j < arr.length ; j++) {
				 
				 if( arr[i] > arr[j]) {
				  
					 count++;
			 
				 }
	     
			 }
		 
		         if(i == arr.length - 1) {
		        	 
		        	 break;
		         }
		 }
	
	         return count;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {8, 4, 2, 1};
		
		int result = countInversion(arr);
		
		System.out.println(result);

	}

}
