package Recursion2;

import java.util.Scanner;

public class RemoveX {

	public static String input() {
	
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    return str;
	}
	
	public static String removeX(String str) {
		
		if(str.length() == 0) {
		 return str;
		}
	String ans = "";
	if(str.charAt(0) != 'x') {
		ans = ans + str.charAt(0);
	}
	
	 String result = removeX(str.substring(1));
	 return ans + result;
	
	}
	
	public static void main(String[] args) {
		
    String str = input();
    String result = removeX(str);
    System.out.println(result);
	}

}
