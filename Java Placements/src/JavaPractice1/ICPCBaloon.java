package JavaPractice1;

import java.util.Scanner;

public class ICPCBaloon {

	public static int[] input() {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			
			System.out.println("Enter the " + i + " th Element");
			arr[i] = sc.nextInt();
		}
	         return arr;
	}
	
	public static int icpcBaloon( int arr[] ) {
		
		int count = 0;
		
		int temp = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(count < 7) {
				
				if( arr[i] >= 1 && arr[i] <= 7 ) {
					
				    count+= 1;
				    temp+= 1;
				} 
				else {
					
			      temp+= 1;
				}
			}
		}
	
	         if(count == 7) {
	        	 
	        	 return temp;
	         }
	         else {
	        	 
	        	 return -1;
	         }
	           
	}
	
	public static void main(String[] args) {
		
    int arr[] = input();
    
    int result = icpcBaloon(arr);
    
    System.out.println(result); 
    
    
    	
    
	}

}
