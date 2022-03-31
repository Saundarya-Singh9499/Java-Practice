package LinkedList1;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesArrayList {

	public static int[] input() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
		System.out.println("Enter the " + i + " the Element");	
		arr[i] = sc.nextInt();
		
		
		}
	         return arr;
	}
	
	public static ArrayList<Integer> removeDupl(int arr[]){
		
		ArrayList<Integer> arrl = new ArrayList<>();
		
		arrl.add(arr[0]);
		
		for(int i = 1 ; i < arr.length ; i++) {
			
			if(arr[i] != arr[i - 1]) {
				arrl.add(arr[i]);
			}
		}
		
	        return arrl;
	}
	
	public static void main(String[] args) {

    int arr[] = input();
    
    ArrayList<Integer> result = removeDupl(arr);
    
    for(int i = 0 ; i < result.size() ; i++) {
    	
    	System.out.println(result.get(i));
    }
	
	}

}
