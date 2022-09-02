package Matrix;

public class S47_FindRowWithMaximumNumberOf1S {

	public static void findRow(int arr[][]) {
		
		int newArr[] = new int[arr.length * arr[0].length]; 
		
		int count1 = 0;
		 
		 int count2 = 0;
		 
		 int max = Integer.MIN_VALUE;
		 
		 for(int i = 0 ; i < arr.length ; i++) {
			 
			 count1 = 0;
			 
			 int k = 0;
			 
			 for(int j = 0 ; j < arr[0].length ; j++) {
				 
				  if(arr[i][j] == 1) {
					 
					  count1++;
					  
					  newArr[k] = count1;
					  
					  k++;
				  }
			
			  }
		 }
		 
		   for(int i = 0 ; i < newArr.length ; i++) {
			   
			   if(newArr[i] > max) {
				   
				   max = newArr[i];
			   }
		   }
		 
          for(int i = 0 ; i < arr.length ; i++) {
			 
			  count2 = 0;
        	  
        	  for(int j = 0 ; j < arr[0].length ; j++) {
				 
				  if(arr[i][j] == 1) {
					  
					  count2++;
				  }
				  
				  if(count2 == max) {
					  
					  System.out.println("Row with Maximum Number 1's is " + i);
					  
					  return;
				  }
			 }
		 }
	}
	
	public static void main(String[] args) {
		
		int arr[][] = {{0 , 1 , 1 , 1},
				{0 , 0 , 1 , 1},
				{1 , 1 , 1 , 1}, 
				{0 , 0 , 0 , 0}};
		
		 findRow(arr);

	}

}
