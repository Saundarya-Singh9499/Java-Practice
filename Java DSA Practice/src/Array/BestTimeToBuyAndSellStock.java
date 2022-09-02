package Array;

public class BestTimeToBuyAndSellStock {

    public static int bestTimeToBuyAndSellStock(int arr[]) {
    	
    int profit = 0;
    
    int num = 0;
    
     for(int i = 0 ; i < arr.length ; i++) {
    	 
    	for(int j = i + 1 ; j < arr.length ; j++) {
    		
    		 num = arr[j] - arr[i];
    		 
    		 if( num > profit) {
    			 
    			 profit = num;
    		 }
    	}
     }
	
        return profit;
    
    }

	public static void main(String[] args) {
		
		int arr[] = {7, 1, 5, 3, 6, 4};
		
		int result = bestTimeToBuyAndSellStock(arr);
		
		System.out.println(result);

	}

}
