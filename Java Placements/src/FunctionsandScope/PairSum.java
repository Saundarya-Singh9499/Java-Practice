package FunctionsandScope;

import java.util.Scanner;

public class PairSum {

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
	
	public static int pairsum(int[] arr) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int pair = 0;
		for( int i = 0 ; i < arr.length-1 ; i++) {
			for( int j = i+1 ; j < arr.length ; j++) {
				if( arr[i] + arr[j] == num) {
					pair += 1;
				}
                  			
			}
		       
		}
	       return pair;
	}
	
	public static void main(String[] args) {
      
    int arr[] = input();
    int psum = pairsum(arr);
    System.out.println(psum);

	}

}
