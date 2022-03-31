package Arrays2;

import java.util.Scanner;

public class BubbleSort {

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
	
	public static  void bubbleSort(int[] arr) {
		
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			for(int j = 0 ; j < arr.length - 1 - i ; j++ ) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		      
		}
	
	      for(int i = 0 ; i < arr.length ; i++) {
	    	  System.out.println(arr[i]);
	      }
	}
	
	public static void main(String[] args) {
		
    int arr[] = input();
    bubbleSort(arr);
	}

}
