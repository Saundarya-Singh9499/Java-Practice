package JavaPractice2;

import java.util.Scanner;

public class SugarCaneBusiness {

	public static int sugarCane( int n ) {
		
		
		int coins = 50 * n;
		
		int buy1 = (coins * 20) /100;
		
		int buy2 = (coins * 20) /100;
		
		int rent = (coins * 30) /100;
		
		int result = coins - (buy1 + buy2 + rent);
		
		return result;
		
		
	}
	
	public static void main(String[] args) {
		
		
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

	int result = sugarCane(n);
	
	System.out.println(result);
	
	
	  
	}

}
