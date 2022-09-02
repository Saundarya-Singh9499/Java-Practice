package String;

public class S69_EditDistance {

	public static int editDistance(String str1 , String str2) {
		
	    int count1 = 0;
	    
	    int count2 = 0;
	    
	    for(int i = 0 ; i < str1.length() ; i++) {
	    	
	    	for(int  j = 0 ; j < str2.length() ; j++) {
	    		
                    if(str1.charAt(i) == str2.charAt(j)) {
                    	
                    	break;
                    }
                    
                    if(j == str2.length() - 1) {
                    	
                    	count1++;
                    }
	    	}
	    }
	    
	    for(int k = 0 ; k < str2.length() ; k++) {
	    	
	    	for(int y = 0 ; y < str1.length() ; y++) {
	    		
                    if(str2.charAt(k) == str1.charAt(y)) {
                    	
                    	break;
                    }
                    
                    if(y == str1.length() - 1) {
                    	
                    	count2++;
                    }
	    	}
	    }
	
	          if(count1 == count2) {
	        	  
	        	  return count1;
	          }
	
	      return count1 + count2;
	}
	
	public static void main(String[] args) {
		
		String str1 = "geek";
		
		String str2 = "gesek";
		
	    int result = editDistance(str1, str2);
	    
	    System.out.println(result);

	}

}
