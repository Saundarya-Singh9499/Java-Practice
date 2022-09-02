package Strings;

public class da {

	public static void main(String[] args) {
		
		int arr[] = {1 ,3,2 ,5,4};
		
		int count = 1;
		
		int n = 0;
		
		for(int i = 1 ; i < arr.length ; i++) {
			
			if(i == 0) {
				
				n = arr[i];
			}
			
			if(arr[i] > n) {
				
				count++;
				
				n = arr[i];
			}
		}
		
		 System.out.println(count);

	}

}
