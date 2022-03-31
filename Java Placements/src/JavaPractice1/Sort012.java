package JavaPractice1;

import java.util.Scanner;

public class Sort012 {

	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Enter the" + i + "the Element");
			 arr[i] = sc.nextInt();
		
		}
	         
		return arr;
	}
	
	public static void sort012(int[] arr) {
		for(int i = 1 ; i < arr.length ; i++) {
			for(int j = 1 ; j < arr.length ; j++) {
				if(arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		
	       for(int i = 0 ; i < arr.length ; i++) {
	    	   System.out.println(arr[i]);
	       }
	}
	
	public static void main(String[] args) {
	
    int arr[] = input();
    sort012(arr);

	}

}
