package Array;

public class FindDuplicateInAnArray {

	public static void findDuplicate(int arr[]) {
		
		 for(int i = 0 ; i < arr.length ; i++) {
			 
			 for(int j = i ; j < arr.length ; j++) {
				 
				   if(i != j) {
					   
					   if(arr[i] == arr[j]) {
						   
						    System.out.print(arr[i] + " ");
					   }
				   }
			 }
		 }
	}
	
	public static void main(String[] args) {
		
       int arr[] = {1, 2, 3, 6, 3, 6, 1};
       
       findDuplicate(arr);
		
	}

}
