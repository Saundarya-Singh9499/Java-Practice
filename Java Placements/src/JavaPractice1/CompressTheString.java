package JavaPractice1;

import java.util.Scanner;

public class CompressTheString {

	public static String input() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		return str;
	}
	
	public static String compress(String strg) {
		String ans = "";
		if(strg.length() == 0) {
			return ans;
		}
	       int count = 1;
	       ans += strg.charAt(0);
	
	for( int i = 1 ; i< strg.length() ; i++) {
		if( strg.charAt(i) == strg.charAt(i-1)) {
			count++;
		}
		else {
			if(count>1) {
				ans += count;
				count = 1;
			    
	    }
	            ans += strg.charAt(i);	
		     
		}
		
	}

    
	          return ans;
	}
	
	
	public static void main(String[] args) {
		
    String str = input();
    String stringcompress = compress(str);
    System.out.println(stringcompress);

	}

}
