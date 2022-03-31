package OperatorsandforLoops;

import java.util.Scanner;

public class ForLoop1 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m = sc.nextInt();
		
		for(int i =1 ; i<= n ; i++) {
			for(int j = 1 ; j<= m ; j++) {
				System.out.println( " i = " + i + " j = " + j);
			}
				
		
		}

	}

}
