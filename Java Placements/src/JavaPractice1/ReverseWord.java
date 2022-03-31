package JavaPractice1;

import java.util.Scanner;

public class ReverseWord {

	public static String input() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		return str;
	}
	
	public static void reverseWord(String strg) {
		
		for(int i = strg.length()-1 ; i >= 0 ; i--) {
			System.out.print(strg.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		
    String str = input();
    reverseWord(str);
	}

}
