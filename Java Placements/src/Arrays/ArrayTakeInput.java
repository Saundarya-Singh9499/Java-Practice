package Arrays;

import java.util.Scanner;

public class ArrayTakeInput {

    public int[] arr;
    
    public int[] takeInputArray() {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	
    	arr = new int[n];
    	
    	for(int i = 0 ; i < n ; i++) {
    		
    		System.out.println("Enter the " + i + " th Element");
    		
    		arr[i] = sc.nextInt();
    	}
    
           return arr;
    }

}
