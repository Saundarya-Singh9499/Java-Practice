package Matrix;

public class S53_CommonElementsInAllRowsOfAGivenMatrix {

	public static void commonElements(int arr[][]) {
		
		 int count = 0;
		 
		 int numb = 0;
		 
		 for(int i = 0 ; i < arr.length ; i++) {
			 
			 if(i == 1) {
				 
				 break;
			 }
			 
			 for(int j = 0 ; j < arr[0].length ; j++) {
				 
				 count = 0;
				 
				 for(int k = 1 ; k < arr.length ; k++) {
					 
					 if(arr[i][j] == numb) {
						 
						 break;
					 }
					 
					 for(int y = 0 ; y < arr[0].length ; y++) {
						 
						  if(arr[k][y] == arr[i][j]) {
							   
							     count++;
							     
							    if(count == arr.length - 1) {
							    	
							    	numb = arr[i][j]; 
							    	
							    	System.out.print(arr[i][j] + " ");
							    	 
							    	 break;
							    }
						   }
					 }
				 }
			 }
		 }
	}
	
	public static void main(String[] args) {
		
		int arr[][] = {{1, 2, 1, 4, 8},
	             {3, 7, 8, 5, 1},
	             {8, 7, 7, 3, 1},
	             {8, 1, 2, 7, 9}};
		
		commonElements(arr);

	}

}
