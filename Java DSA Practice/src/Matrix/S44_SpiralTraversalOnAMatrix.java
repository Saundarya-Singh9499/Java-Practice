package Matrix;

public class S44_SpiralTraversalOnAMatrix {

	public static void spiralTraversal(int arr[][] , int i , int j , int n , int m) {
		
		if(i >=n || j >=m) {
			
			return;
		}
		
		for(int a = i ; a < m ; a++) {
			  
			  System.out.print(arr[i][a] + " ");
		  }
		
		for(int b = i + 1 ; b < n ; b++) {
			
			System.out.print(arr[b][m - 1] + " ");
		}
		
		if((n - 1) != i) {
			
			for(int a = m - 2 ; a >= j ; a--) {
				
				System.out.print(arr[n - 1][a] + " ");
			}
		}
		
		 if((m - 1) != j) {
			 
			 for(int b = n - 2 ; b > i ; b--) {
				 
				 System.out.print(arr[b][i] + " ");
			 }
		 }
		 
		  spiralTraversal(arr, i + 1, j + 1, n - 1, m - 1);
	}
	
	public static void main(String[] args) {
		
		int arr[][] = {{1,    2,   3,   4},
	              {5,    6,   7,   8},
	              {9,   10,  11,  12},
	             {13,  14,  15,  16 }};
		
		int n = arr.length;
		
		int m = arr[0].length;
		
		spiralTraversal(arr, 0, 0, n, m);

	}

}
