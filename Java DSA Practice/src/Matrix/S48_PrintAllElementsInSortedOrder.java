package Matrix;

import java.util.Arrays;

public class S48_PrintAllElementsInSortedOrder {

	public static void printInSortedOrder(int arr[][]) {
		
		 int newArr[] = new int[arr.length * arr[0].length];
		 
		 int k = 0;
		 
		 for(int i = 0 ; i < arr.length ; i++) {
			 
			 for(int j = 0 ; j < arr[0].length ; j++) {
				 
				   newArr[k] = arr[i][j];
				   
				   k++;
			 }
		 }
		 
		  Arrays.sort(newArr);
		  
		  for(int i = 0 ; i < newArr.length ; i++) {
			  
			  System.out.print(newArr[i] + " ");
		  }
	}
	
	public static void main(String[] args) {
		
		int arr[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
               {32, 33, 39, 50}};
		
		printInSortedOrder(arr);

	}

}
