package JavaPractice2;

import java.util.Scanner;

public class Anagrams {

	public static String anagrams( String str1 , String str2 ){
	     int count  = 0;   
	     for(int i = 0 ; i < str1.length() ; i++){
	         
	         for(int j = 0 ; j < str2.length() ; j++){
	             
	             if(str1.charAt(i) == str2.charAt(j)){

	 str2 = str2.substring(0 , j) + str2.substring(j + 1 , str2.length());              
	                count+= 1;
	                
	  
	                break;
	             }
	         }
	     }   
	         if(count == str1.length()){
	             
	             return "Anagrams";
	         }     
	            
	         else{
	             
	             return "Not Anagrams";
	         }
	          
	    }
	    
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
	    String str1 = sc.nextLine();
	    
	    String str2 = sc.nextLine();
	    
	    str1 = str1.toLowerCase();
	    
	    String result = anagrams(str1 , str2);
	    
	    System.out.println(result);

	}

}
