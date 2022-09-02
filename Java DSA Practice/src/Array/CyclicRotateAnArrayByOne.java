package Array;

public class CyclicRotateAnArrayByOne {

	public static void cyclicRotate(int arr[]) {
		
		int temp = 0; 
		
		for(int i = 0 ; i < arr.length  ; i++) {
			
		      temp = arr[i];
		      
		      arr[i] = arr[arr.length - 1];
		      
		      arr[arr.length -1] = temp;
			
		}
	
	        for(int k = 0 ; k < arr.length ; k++) {
	        	
	        	 System.out.print(arr[k] + " ");
	        }
	
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1 , 2 , 3 , 4 , 5};
		
		cyclicRotate(arr);

	}

}
