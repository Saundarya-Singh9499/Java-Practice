package Recursion2;

import java.util.Scanner;

public class RemoveDuplicates {

    public static String input() {
    	
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     return str;
    	
    }
	
	public static String removeDupl(String str) {
		
		if(str.length()<=1) {
			return str;
		}
	
	        if(str.charAt(0) == str.charAt(1)) {
	        	return removeDupl(str.substring(1));
	      }
	        else {
	        	return str.charAt(0) + removeDupl(str.substring(1));
	        }
	}
	
	
     public static void main(String[] args) {
	
     String str = input();
     String result = removeDupl(str);
     System.out.println(result);

	}

}
