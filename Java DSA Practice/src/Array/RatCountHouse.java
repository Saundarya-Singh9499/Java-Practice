package Array;

public class RatCountHouse {

	public static int ratCount(int arr[] , int r , int unit) {
		
		 int count = 0;
		 
		 int totalFood = r * unit;
		 
		 int sum = 0;
		 
		 for(int i = 0 ; i < arr.length ; i++) {
			 
			 sum = sum + arr[i]; 
			 
			 count++;
			 
			 if(sum >= totalFood) {    
				 
				 return count;
			 }
		 }
		 
		   return 0;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2 , 8 , 3 , 5 , 7 , 4 , 1 , 2};
		
		int r = 7;
		
	    int unit = 2;
	    
	    int result = ratCount(arr, r, unit);
	    
	    System.out.println(result);

	}

}
