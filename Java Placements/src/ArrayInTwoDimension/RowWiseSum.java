package ArrayInTwoDimension;

import java.util.Scanner;

public class RowWiseSum {

	public static int[][] input(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];
		
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0 ; j < cols ; j++ ) {
			System.out.println("Enter the " + i + "th row and " + j + "th column");
			arr[i][j] = sc.nextInt();
			}
		}
	        return arr;
	}
	
	public static void rowWiseSum(int arr[][]) {
		
		for(int i = 0 ; i < arr.length ; i++) {
			int sum=0;
			for(int j = 0 ; j < arr[0].length ; j++) {
			sum+=arr[i][j];
			}
			System.out.println(sum);
		}
	}
	
	public static void main(String[] args) {
		
    int arr[][] = input();
    rowWiseSum(arr);
	}

}
