package Array;

import java.util.Arrays;

public class Sort012 {

	public static void sort(int arr[]) {
		
		int temp = 0; 
		
		for(int i = 0 ; i < arr.length; i++) {
			
			 if(arr[i] != 1) {
				 
				 temp = arr[i];
				 
				 for(int j = i+1 ; j < arr.length ; j++) {
					 
					   if(arr[j] == 1) {
						   
						   arr[i] = arr[j];
						   
						   arr[j] = temp;
						   
						   break;
					   }
				 }
			 }
                 
                 if(arr[i] != 0) {
				 
				 temp = arr[i];
				 
				 for(int j = i+1 ; j < arr.length ; j++) {
					 
					   if(arr[j] == 0) {
						   
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
		
		int arr[] = { 0 , 2 , 1 , 0 , 0 , 1 , 2, 2, 1 , 0, 1 , 1 , 0 , 2 , 2};
		
		 sort(arr);
		
		
		
		

	}

}
