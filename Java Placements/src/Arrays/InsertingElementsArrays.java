package Arrays;

import java.util.Scanner;

public class InsertingElementsArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for( int i = 0 ; i<a ; i++) {
		     System.out.println("Enter the " + i + " th Element here : - ");
		     arr[i] = sc.nextInt();
		
		}
           for( int i =0 ; i < a ; i++ ) {
        	   System.out.println(arr[i]);
           }
	}

}
