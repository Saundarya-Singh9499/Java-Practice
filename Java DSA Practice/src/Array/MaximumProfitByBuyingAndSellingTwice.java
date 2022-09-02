package Array;

public class MaximumProfitByBuyingAndSellingTwice {

	public static int firstMax(int arr[]) {
		
		int max = 0;
		
		int temp = 0;
		
		int subt1 = 0;
		
		int subt2 = 0;
		
		int add = 0;
		
		for(int  i = 1 ; i < arr.length ; i++) {
			
			if(arr[i - 1] < arr[i]) {
				
				subt1 = arr[i] - arr[i-1];
				
				temp = i;
				
				break;
		}
					
	  }
	
	
	   for(int i = temp + 1 ; i < arr.length ; i++) {
			 
			 if(i == arr.length - 1) {
					
					break;
				}
			 
	    for(int j = i ; j < arr.length ; j++) {
				 
				 subt2 = 0; 
				 
			 if(arr[j] > arr[i]) {
								
			     subt2 = arr[j] - arr[i];
								
	               if(subt2 > max) {
									
					   max = subt2;
									
						 
		            }
								
		          }
								
		      }
		 
          }
		
	         add = subt1 + max;
	         
	         return add;
	
	}
	
	
	public static void main(String[] args) {
		
		 int arr[] = {10, 22, 5, 75, 65, 80};
		 
		 int result = firstMax(arr);
		 
		 System.out.println(result);

	}

}
