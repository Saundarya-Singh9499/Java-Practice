package JavaPractice1;

import java.util.Scanner;

public class GoogleSolution {

public static int[] input() {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int arr[] = new int[n];
	   for( int i = 0 ; i < n ; i++) {
		   System.out.println("Enter the" + i + "th Element");
		   arr[i] = sc.nextInt();
	   }
             return arr;
  }

public static int largest(int arr[]) {
	int max = Integer.MIN_VALUE;
	for( int i = 0 ; i < arr.length ; i++) {
		if( arr[i] > max) {
			max = arr[i];
		}
	}
	return max;
}
	
public static int smallest(int arr[]) {
	int min = Integer.MAX_VALUE;
	for( int i = 0; i < arr.length ; i++) {
		if( arr[i] < min) {
			min = arr[i];
		}
	}
           return min;
}
public static void main(String[] args) {
    
    int arr[] = input();
    int larg = largest(arr);
    int small = smallest(arr);
    int result = larg + small;
    System.out.println("The Largest Element is : " + larg);
    System.out.println("The Smallest Element is : " + small);
    System.out.println("The Addition of both Element is : " + result);

	}

}
