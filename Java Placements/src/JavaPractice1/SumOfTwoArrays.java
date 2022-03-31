package JavaPractice1;

import java.util.Scanner;

public class SumOfTwoArrays {

	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
		    System.out.println("Enter the" + i + "th Element");
			arr[i] = sc.nextInt();
			}
				return arr;
	}
	
	public static void sumOfTwoArrays(int[] arr1 , int[] arr2) {
    int carry = 0;	
	  int arr[] = new int[arr1.length]; 
        for(int i = arr1.length - 1 ; i >= 0 ; i-- ) {
        	int k = i;
		 arr[k] = arr1[i] + arr2[i];
        	if(arr[k] >= 10) {
               carry += 1;
               arr[k] = arr[k]%10;
          	
        	
               if(arr[0] > 0) {
        		arr[0] = arr[0] + 0;
        	}
        	}
        	else if ( arr[k]  < 10) {
        		arr[k] = arr[k] + 0;
        				
          }
              
        	
        
        
        
        
        }
	
	           for(int i = arr.length - 1 ; i >= 0  ; i--) {
	        	   System.out.println(arr[i]);
	           }
	}
    
    public static void main(String[] args) {
	
    int[] arr1 = input();
    int[] arr2 = input();
    sumOfTwoArrays(arr1 , arr2);

	}

}
