package JavaPractice1;

import java.util.Scanner;

public class HighestOccuringCharacter {

	public static String input() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		return str;
	}
	
       public static char occuring(String strg) {
    	   
    	   for(int i = 0 ; i < strg.length() ; i++){
    		   int j;
    		   for( j = 0 ; j < strg.length() ; j++) {
    			   if( i != j) {
    				   if(strg.charAt(i) == strg.charAt(j)) {
    					   break;
    				   }
    			   }
    		   }
    		        if(j != strg.length()) {
    		        	return strg.charAt(i);
    		        }
    	   
    	   }
                return 0 ;
       }
	
	public static void main(String[] args) {
		
	String str = input();
	char occurchar = occuring(str);
	System.out.println(occurchar);
	
	
	}

}
