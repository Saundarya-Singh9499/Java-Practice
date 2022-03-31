package JavaPractice1;

import java.util.Scanner;

public class DuplicateNumberArray {

	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Enter the" + i + "th Element");
			arr[i] = sc.nextInt();
		}
	       return arr;
	}
	
	public static int duplicate(int arr[]) {
		
		for(int i =0 ; i < arr.length ; i++) {
			int j;
        for(j = 0 ; j < arr.length ; j++) {
        	if( i!= j) {
        		if(arr[i] == arr[j]) {
        			break;
        		}
        	}
        }
		    if( j!= arr.length ) {
		    	return arr[i];
		    }
		}
		   return -1;
	}
	
	public static void main(String[] args) {
	
    int arr[] = input();
    int dupl = duplicate(arr);
    System.out.println( dupl );

	}

}
