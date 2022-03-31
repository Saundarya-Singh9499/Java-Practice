package Recursion2;

import java.util.Scanner;

public class ReplacePi {

	public static String input() {
		
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    return str;
	}
	
	public static String removePi(String str) {
		
		if(str.length() == 0) {
			return str;
	    }
	    
		
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			
		   return 3.14 + removePi(str.substring(2));
			
		} 
		else    {
		
	     return str.charAt(0) + removePi(str.substring(1));
		
		}
	      
	 }
	
	public static void main(String[] args) {
	
    String str = input();
    String result = removePi(str);
    System.out.println(result);

	}

}
