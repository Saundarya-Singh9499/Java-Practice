package Arrays2;

import java.util.Scanner;

public class MergeTwoSortedArrays {

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
	
	public static int[] mergeTwoSortedArrays(int[] arr1 , int[] arr2) {
	int arr3[] = new int[arr1.length + arr2.length];
	int k = 0;
	for( int i = 0 ; i < arr1.length ; i++) {
    	for(int j = 0 ; j < arr2.length ; j++) {
     		
    		 if(arr1[i] <= arr2[j]) {
    				arr3[k] = arr1[i];
    				k++;
    			}
    		 else {
    			 arr3[k] = arr2[j];
    			 k++;
    		 }
    			
    	 }
    }
	 for(int i = 0 ; i < arr1.length ; i++) {
     	arr3[k] = arr1[i];
     	k++;
     }
          for(int j = 0 ; j < arr2.length ; j++) {
        	  arr3[k] = arr2[j];
        	  k++;
          }
	
	    for(int a = 0 ; a < arr3.length ; a++) {
	    	System.out.println(arr3[a]);
	    }
          return arr3;
	}       
	  
	

	public static void main(String[] args) {
		
    int arr1[] = input();
    int arr2[] = input();
    int arr3[] = mergeTwoSortedArrays(arr1 , arr2);
	System.out.println(arr3);
	}

}
