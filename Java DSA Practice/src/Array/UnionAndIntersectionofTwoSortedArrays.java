package Array;

public class UnionAndIntersectionofTwoSortedArrays {

	public static void printUnion(int arr1[] , int arr2[]) {
		
		int i = 0;
		
		int j = 0;
		
		System.out.print("Union is - "); 
		
		while( i < arr1.length && j < arr2.length) {
			 
			 if(arr1[i] < arr2[j]) {
				 
				 System.out.print(arr1[i] + " ");
				 
				 i++;
			 }
			 
			 else if(arr1[i] > arr2[j]) {
				 
				 System.out.print(arr2[j] + " ");
				 
				 j++;
			 }
			 
			 else if(arr1[i] == arr2[j]) {
				 
				 System.out.print(arr1[i] + " ");
				 
				 i++;
				 
				 j++;
			 }
		 
		 }
	          
		      System.out.println();
		      
	          printIntersection(arr1 , arr2); 
	
	}
	
	public static void printIntersection(int[] arr1, int[] arr2) {
		
		  System.out.print("Intersection is - ");
		
		  for(int i = 0 ; i < arr1.length ; i++) {
			  
			  for(int j = 0 ; j < arr2.length ; j++) {
				  
				  if(arr1[i] == arr2[j]) {
					  
					  System.out.print(arr1[i] + " ");
					  
					  break;
				  }
			  }
		  }
		
	}

	public static void main(String[] args) {
		
		int arr1[] = {1 , 3 , 4 , 5 , 7};
		
		int arr2[] = {2 , 3 , 5 , 6};
		
		printUnion(arr1, arr2);

	}

}
