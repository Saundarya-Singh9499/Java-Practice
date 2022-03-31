package Recursion2;

import java.util.Scanner;

public class ReplaceCharactersRecursively {

	public static String input() {
		
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    return str;
	}
	
	public static String replaceChar(String str , char ch1 , char ch2) {		
		if(str.length() == 0) {
			return str;
		}
	
	String ans = "";
	
	if(str.charAt(0) == ch1 ) {
		ans = ans + ch2;
	}
	if(str.charAt(0) != ch1) {
		ans = ans + str.charAt(0);
	}
	
	String result = replaceChar(str.substring(1) , ch1 , ch2);
	return ans + result;
	
	}
	
	public static void main(String[] args) {
	
    String str = input();
    Scanner sc = new Scanner(System.in);
    char ch1 = sc.next().charAt(0);
    char ch2 = sc.next().charAt(0);
    
    String result = replaceChar(str , ch1 , ch2);
    System.out.println(result);

	}

}
