package Strings;

import java.util.Scanner;

public class PrintStringScannerClass {

	public static String takinginput() {
		Scanner sc = new Scanner(System.in) ;
		String str = sc.nextLine();
		return str;
	}
	
	public static void print( String str) {
		for( int i = 0 ; i < str.length() ; i++) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		
    String strg = takinginput();
	    print(strg);
	}

}
