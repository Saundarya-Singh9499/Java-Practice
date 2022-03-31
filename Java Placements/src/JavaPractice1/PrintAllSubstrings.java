package JavaPractice1;

import java.util.Scanner;

public class PrintAllSubstrings {

	public static String input() {
		Scanner sc = new Scanner(System.in);
		String str  = sc.nextLine();
		return str;
	}
	
	public static void substrings(String strg) {
		
		for( int i = 0 ; i < strg.length() ; i++) {
			String temp = "";
			for(int j = i ; j < strg.length() ; j++) {
				temp = temp + strg.charAt(j);
				System.out.println(temp);
			
			}
		}
	}
	
	public static void main(String[] args) {
		
    String str = input();
    substrings(str);
		

	}

}
