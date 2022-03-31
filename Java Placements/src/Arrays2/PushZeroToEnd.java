package Arrays2;

import java.util.Scanner;

public class PushZeroToEnd {

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
	
	public static void pushEnd(int[] arr) {
	int counter = 0;
    for(int i = 0; i < arr.length ; i++) {
    	if(arr[i] != 0) {
    		int temp = arr[i];
    		arr[i] = arr[counter];
    		arr[counter] = temp;
    		counter++;
    		
    	}
    }
        for(int i = 0 ; i < arr.length ; i++) {
        	System.out.println(arr[i]);
        }
	}
	
	public static void main(String[] args) {
	
    int[] arr = input();
     pushEnd(arr);
    
    

	}

}
