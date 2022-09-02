package Matrix;

public class S49_MaximumSizeRectangle {

	public static int maximum(int arr[][]) {
		
		int area = 0;
		
		int l = 0;
		
		int b = 0;
		
		int min = Integer.MAX_VALUE;
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(i == 1) {
				
				break;
			}
			for(int j = 0 ; j < arr[0].length ; j++) {
				
				  if(arr[i][j] != 0) {
					  
					  l++;
					  
					  if(arr[i][j] < min) {
						  
						  min = arr[i][j];
						  
						  b = min;
					  }
				  }
				  
			}
		        area = l * b;
		        
		        if(area > max) {
		        	
		        	 max = area;
		        }
		}
		 
		 l = 0;
		 
		 b = 0;
		 
		 min = Integer.MAX_VALUE;
		 
		 area = 0;
		 for(int i = 1 ; i < arr.length ; i++) {
			  l = 0;
			  b = 0;
			  min = Integer.MAX_VALUE;
			  area = 0;
			  
			 for(int j = 0 ; j < arr[0].length ; j++) {
				 
				  if(arr[i][j] != 0) {
					  
					  arr[i][j] = arr[i-1][j] + arr[i][j];
					  
					  l++;
					  

					  if(arr[i][j] < min) {
						  
						  min = arr[i][j];
						  
						  b = min;
					  }
				  }
			 }
			 
			   area = l * b;
			   
			   if(area > max) {
				   
				   max = area;
			   }
		 }
	
	         return max;
	}
	
	public static void main(String[] args) {
		
		int arr[][] = {{0 , 1 , 1 , 0},
				{1 , 1 , 1 , 1},
				{1 , 1 , 1 , 1},
				{1 , 1 , 0 , 0}};
		
		int result = maximum(arr);
		
		System.out.println(result);
		
	}

}
