package JavaPractice1;

import java.util.Scanner;

public class EvenOddFunction {
	
	public static void check(int a) {
		
		if( a % 2 == 0) {
			System.out.println(" The Number is Even ");
		}
		else {
			System.out.println(" The Number is Odd ");
		}
	        
	}
	
	
	public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print(" Enter the Number here : -  ");
       int num = sc.nextInt();
        check( num);
        

	}

}
