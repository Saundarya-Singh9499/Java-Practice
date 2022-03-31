package OOPS;

import java.util.Scanner;

public class BytelandianGoldCoin {

	public static void main(String[] args) {
		
		Coin c = new Coin();
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		
		c.setValue(n);
		c.getValue();
		
		c.print();

	}

}
