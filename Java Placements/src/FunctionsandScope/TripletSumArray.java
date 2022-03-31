package FunctionsandScope;

import java.util.Scanner;

public class TripletSumArray {

	

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
	
	public static int tripletsum(int arr[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int temp = 0;
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for( int j = i+1 ; j < arr.length-1 ; j++) {
				for( int k = j+1 ; k < arr.length ; k++) {
					if( arr[i] + arr[j] + arr[k] == num) {
						temp += 1;
					}
				}
			}
		}
		
	          return temp;
	}
	
	public static void main(String[] args) {
		int[] arr = input();
		int triple = tripletsum(arr);
		System.out.println(" The Triple Pairs are : " + triple);

	}

}
