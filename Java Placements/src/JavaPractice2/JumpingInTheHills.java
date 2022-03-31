package JavaPractice2;

import java.util.Scanner;

public class JumpingInTheHills {

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
	
	public static int jumping( int arr[] , int u , int d ) {
		
	    int count = 1;
		
		int parachute = 1;
	    
	    for(int i = 1 ; i < arr.length ; i++) {
	    	
	    	if(arr[i - 1] < arr[i]) {
	    		
	    		if( arr[i] - arr[i - 1] <= u ) {
	    			
	    			count+= 1;
	    		}
	    		else {
	    			break;
	    		}
	    		
	    	}
	    
		        if(arr[i - 1] > arr[i]) {
		        	
		        	if(arr[i - 1] - arr[i] <= d) {
		        
		        	   count+= 1;
		        }
		        	else {
		        		
		        		if(parachute == 1) {
		        			
		        			count+=1;
		        			
		        			parachute-= 1;
		        		}
		        	}
		
		}
	
	              if(arr[i - 1] == arr[i]) {
	            	  
	            	  count+= 1;
	              }
	    
	    }
	       return count;
	}
	
	public static void main(String[] args) {
		
    int arr[] = input();
    
    Scanner sc = new Scanner(System.in);
    
    int u = sc.nextInt();
    int d = sc.nextInt();
    
    int result = jumping(arr, u, d);
    
    System.out.println(result);
	
	}

}
