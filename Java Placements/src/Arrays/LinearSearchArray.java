package Arrays;

import java.util.Scanner;

public class LinearSearchArray {

	public static int [] input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for( int i = 0; i< n ; i++) {
			System.out.println("Enter the element at " + i + " th position");
			arr[i] = sc.nextInt();
			}
		      return arr;
	          }
	
	  public static int search (int arr[]) {
		
		System.out.println("Enter the Number here : - ");
		Scanner s = new Scanner(System.in); 
		int num = s.nextInt();     
		 for( int i = 0 ; i < arr.length ; i++) {
				if( arr[i] == num) {
					return i;
				}
		 }
		 return -1;
		 }
	
	  public static void main(String[] args) {
		int arr[] = input();
	   int serh = search(arr);
		System.out.println(serh);

	}

}
