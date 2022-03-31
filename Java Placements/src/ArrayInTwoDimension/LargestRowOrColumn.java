package ArrayInTwoDimension;

import java.util.Scanner;

public class LargestRowOrColumn {

	public static int[][] input(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of Columns");
		int cols = sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0 ; j < cols ; j++) {
			 
		     System.out.println("Enter the Row " + i + " and Column " + j );
	         arr[i][j] = sc.nextInt();	
			}
		}
            return arr;
	
	}
	
	public static int largestRowCol(int arr[][]) {
		
		int max = Integer.MIN_VALUE;
		for(int j = 0 ; j < arr[0].length ; j++) {
			int sum = 0;
			for(int i = 0 ; i < arr.length ; i++) {
			
		    sum = sum + arr[i][j];
			
			}
		       if( sum > max) {
		    	   max = sum;
		       }
		}
	            return max;
	}
	
	public static void main(String[] args) {

    int arr[][] = input();
    int result = largestRowCol(arr);
    System.out.println(result);

	}

}
