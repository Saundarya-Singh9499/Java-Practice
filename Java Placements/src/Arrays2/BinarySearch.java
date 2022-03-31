package Arrays2;

import java.util.Scanner;

public class BinarySearch {

	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
		 System.out.println("Enter the" + i + "the ElementS");
			arr[i] = sc.nextInt();
		}
	      return arr;
	}
	
	public static int binarySearch(int [] arr) {
		int start= 0 ;
		int end = arr.length - 1;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while( start <= end) {
			int mid = (start + end)/2;
			if( arr[mid] < num  ) {
			start = mid + 1;
				
	}else if( arr[mid] > num) {
				end = mid -1 ;
	 		}else if ( arr[mid] == num) {
	 			return mid;
	 		}
		
		}
	      return -1;
 }

	public static void main(String[] args) {
		
    int [] arr = input();
    int binary = binarySearch(arr);
    System.out.println(binary);
    

	}

}
