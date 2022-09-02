package Strings;

import java.util.Scanner;

public class dsfdf {

	public static String solve(String str) {
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				
				str = str.toLowerCase();
			}
		}
		
		  return str;
	}
	
	public static void main(String[] args) {
		
       String str = "HELLOWORLD";

       String result = solve(str);
       
       System.out.println(result);
	}

}
