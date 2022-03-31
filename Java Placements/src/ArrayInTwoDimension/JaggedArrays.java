package ArrayInTwoDimension;

public class JaggedArrays {

	public static void jaggedArray(int arr[][]) {
		
		for(int i = 0 ; i < arr.length ; i++) {
	    	
	    	arr[i] = new int[i + 4];
	    }
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
		  }
		      System.out.println();    
		}
	
	}
	
	public static void main(String[] args) {
		
    int arr[][] = new int[5][];
    jaggedArray(arr);
    
    
		
	
	}

}
