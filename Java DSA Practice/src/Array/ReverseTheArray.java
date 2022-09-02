package Array;

public class ReverseTheArray {

	public static void reverseArray(int[] arr) {
		
	    int n = arr.length;
		
		int temp[] = new int[n];
		
		int j = 0;
		
		for(int i = n-1 ; i >= 0 ; i--) {
			
		     temp[j] = arr[i];
		     
		     j++;
		}
		
	      for(int k = 0 ; k < temp.length ; k++) {
	    	  
	    	  System.out.print(temp[k] + " ");
	      }
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1 , 2 , 3 , 4 , 5};
		
		 reverseArray(arr);
		
		

	}

	

}
