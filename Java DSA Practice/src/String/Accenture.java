package String;

public class Accenture {

	public static int solve(String str) {
		
	     int count = 0;
	     
	     int count2 = 0;
	     
	     for(int i = 0 ; i < str.length() ; i++) {
	    	 
	    	 count = 0;
	    	 
	    	 for(int j = 0 ; j < str.length() ; j++) {
	    		 
	    		 if(str.charAt(j) == i) {
	    			 
	    			 count++;
	    		 }
	    		 
	    
	    	 }
	    	 
	    	 if(str.charAt(i) == count) {
    			 
   			  count2++;
   			  
	    	 }
   		 
	    	 if(str.charAt(i) > count || str.charAt(i) < count) {
   			 
   			  return 0;
   		 }
	     
	     
	     }
	
	         return count2;
	}
	
	public static void main(String[] args) {
		
		String str = "1210";
		
		int result = solve(str);
		
		System.out.println(result);

	}

}
