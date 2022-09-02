package JavaPractice2;

public class ArraysOfStrings {
 
	public static String[] string(String str[] , int n) {
		
	    String str1[] = new String[str.length];
	    
	    String strg = "";
	    
	    String s = "";
	    
	    String combine = "";
	    
	    char first = 0;
	    
	    char middle = 0;
	    
	    char last = 0;
	    
	    for(int i = 0 ; i < str.length ; i++) {
	    	
	    	s = str[i];
	    	
	    	for(int j = 0 ; j < s.length() ; j++) {
		    	 
		    	  if(j == 0) {
		    		  
		    		  first = s.charAt(j);
		    	  }
		     
		       if( j == s.length() /2) {
		    	   
		    	   middle = s.charAt(j);
		       }
		     
		          if( j == s.length() - 1) {
		        	  
		        	  last = s.charAt(j);
		          }
		     
		    }
		
		        combine = combine + first + middle + last;
		        
		        for(int k = 1 ; k <= n ; k++) {
		        	
		        	strg = strg + combine;
		        }
		        
		        str1[i] = strg;
		        
		        strg = "";
		        
		        combine = "";
		}
	    
	    
	    
	    return str1;
	}
	     


	public static void main(String[] args) {
		
		String str[] = {"abc" , "hello"};
		
		int n = 3;
		
        String result[] = string(str, n);
        
        for(int i = 0 ; i < result.length ; i++) {
        	
        	System.out.println(result[i]); 
        }
	
	 }

}
