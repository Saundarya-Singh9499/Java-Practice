package JavaPractice1;

import java.util.Scanner;

public class MaximumProfitOnApp {

    public static int[] input() {
    	
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number of Buyers");
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i = 0 ; i < n ; i++) {
    	   System.out.println("Budget of " + i + " th Buyer");
    	   arr[i] = sc.nextInt();
       }
          return arr;
    }
	
	public static int maxProfit(int arr[]) {
		
		int price = 20;
	    int num = 0;
	  for(int i = 0 ; i < arr.length ; i++) {
		  if(arr[i] >= price) {
			  num = num + 1;
		  }
	  }
	      return num * price ;
	}
    
    public static void main(String[] args) {
	
    int arr[] = input();
    int result = maxProfit(arr);
    System.out.println(result); 
		

	}

}
