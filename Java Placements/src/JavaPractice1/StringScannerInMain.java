package JavaPractice1;

import java.util.Scanner;

public class StringScannerInMain {

public static void printChars(String strg) {
	for(int i = 0 ; i < strg.length() ; i++) {
		System.out.println(strg.charAt(i));
	}
}
	
public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
    printChars(str);
	}

}
