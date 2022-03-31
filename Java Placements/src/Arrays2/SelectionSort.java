package Arrays2;

import java.util.Scanner;

public class SelectionSort { 

	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
	      System.out.println("Enter the" + i + "th Element");
			arr[i] = sc.nextInt();
		}
	         return arr;	
	}
	
	public static void selectionSort(int [] arr) {
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			for(int j = i ; j < arr.length ; j++) {
				if(arr[j] < min) {
					min = arr[j];
				    minIndex = j;
			}
			}
			
			int temp = arr[minIndex];
		    arr[minIndex] = arr[i];
	        arr[i] = temp;
	      }
		
		 for( int i = 0 ; i < arr.length ; i++) {
	        	System.out.println(arr[i]);
	        }
	}	
	
	public static void main(String[] args) {
	
    int arr[] = input();
    selectionSort(arr);
   }

}
