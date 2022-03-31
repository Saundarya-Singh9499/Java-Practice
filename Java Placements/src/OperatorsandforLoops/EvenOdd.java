package OperatorsandforLoops;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1 ; i<=n ; i++){
			int a = i*2;
			int b = (i*2)+1;
			
	  System.out.println("Even Number = " + a + "    " + "Odd Numbers = " + b);
			
		}

	}

}
