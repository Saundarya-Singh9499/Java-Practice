package Strings;

import java.util.Scanner;

public class PalindromeString {

	public static String input() {
		Scanner sc =  new Scanner(System.in);
		String str = sc.nextLine();
		return str;
		
	}
	
	public static boolean palindrome(String strg) {
	int a = 0;
	int b = strg.length()-1;
	for(int i = 0 ; i < strg.length()  ; i++) {
		
	if(strg.charAt(i) != strg.charAt(b) ) {
		
	       return false;
	}
	 b--;
	}
	  return true;
	}
	public static void main(String[] args) {
    
    String str = input();
    Boolean pr = palindrome(str);
    System.out.println(pr);

	}

}
