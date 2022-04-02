package JavaPractice2;

import java.util.Scanner;

public class GameCodeForces {

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
	
	public static int game( int arr[] ) {
		
		int coins = 0;
		
		for(int i = 1 ; i < arr.length ; i++) {
			
			if( arr[ i -1 ] == 1 && arr[i] == 0 ) {
				
				coins+= 1;
			}
			else if( arr[i - 1] == 0 && arr[i] == 1 ) {
	        	  
	        	 coins+= 1;
	          }
			else if( arr[i - 1] == 0 && arr[i] == 0 ) {
				
				coins+= 1;
			}
		}
	        
	        return coins;  
	}
	
    public static void main(String[] args) {
	
    int arr[] = input();
    
    int result = game(arr);
    
    System.out.println(result);
    
	}

}
	