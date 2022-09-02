package Matrix;

import java.util.Arrays;

public class S46_FindMedianInARowWiseMatrix {

	public static int findMedian(int arr[][]) {
		
		 int newArr[] = new int[arr.length * arr[0].length];
		 
		 int n = newArr.length / 2;
		 
		 int median = 0;
		 
		 int k = 0;
		 
		 for(int i = 0 ; i < arr.length ; i++) {
			 
			 for(int j = 0 ; j < arr[0].length ; j++) {
				 
				 newArr[k] = arr[i][j];
				 
				 k++;
			 }
		 }
		 
		  Arrays.sort(newArr);
		  
		  if(newArr.length%2 == 0) {
			  
			  median = (newArr[n] + newArr[n -1]) / 2;
		  }
		  
		  else {
			  
			   median = newArr[n];
		  }
	
	    return median;
	}
	
	public static void main(String[] args) {
		
		int arr[][] = {{1 , 3 , 5},
		        {2 , 6 , 9},
		        {3 , 6 , 9}};
		
		int result = findMedian(arr);
		
		System.out.println(result);

	}

}
