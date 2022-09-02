package String;

public class PasswordChecker {

	public static int passwordChecker(String str) {
		
	    int count = 0;
	    
	    if(str.length() >= 4) {
	    	
	    	count++;
	    }
	    
	  if(str.charAt(0) >= 'a' && str.charAt(0) <= 'z' || str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
	    	
	               count++;
	    
	    }
	  
	  else {
		  
		      return 0;
		  
	  }
		  
		  for(int i = 0 ; i < str.length() ; i++) {
	  
	       for(int j = 1 ; j < str.length() ; i++) {
			  
			   if(Character.isUpperCase(str.charAt(j))) {
				   
				   count++;
			   }
			   
			  if(str.charAt(j) >= 0 && str.charAt(j) <= Integer.MAX_VALUE) {
				   
				    count++;
			   }
			   
			   if(str.charAt(j) == ' ' || str.charAt(j) == '/') {
				   
		          
				   return 0;
			   
			   }
		  }
		  
		  }
		  
		    if(count >= 4) {
		    	
		        return 1;
		    }
		    
		    else {
		    	
		        return 0;
      }
		    
  }
	
public static void main(String[] args) {
	  
	   String str = "a987 abC012";
	   
	   int result = passwordChecker(str);
	   
	   System.out.println(result);
	  
	  }

	}


