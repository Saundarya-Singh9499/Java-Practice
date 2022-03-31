package Strings;

import java.util.Scanner;

public class CountWords {

	public static String input() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		return str;
	}
	
	public static int count( String str) {
		int spaces = 0;
		for( int i =0 ; i < str.length() ; i++) {
			if(str.charAt(i) == ' ') {
				spaces++;
			}
		}
	       return spaces + 1 ; 
	}
	public static void main(String[] args) {

    String strg = input();
    int countwords = count(strg);
    System.out.println(countwords);

	}

}
