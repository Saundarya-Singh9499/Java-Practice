package JavaPractice2;

public class PasswordGenerator {

	public static String password(String firstName , String lastName , int pin , int n ) {
		
		char ch = 0;
	
		String str = "";
		
		String strg = "";
		
		String sPin = String.valueOf(pin);
		
		char c1 = 0;
		
		char c2 = 0;
		
		int temp1 = firstName.length();
		
		int temp2 = lastName.length();
	    
		if( temp1 > temp2) {
			 
		   ch =  firstName.charAt(0);
					
		   str = str + ch + lastName;
		   
		 }
		
		else if( temp1 < temp2) {
	
	       ch =  lastName.charAt(0);
					
		   str = str + ch + firstName;
                   				    
		 }
		
		    for(int j = 0 ; j < sPin.length() ; j++) {
			   
			   if( j == n - 1) {
				   
				   c1 = sPin.charAt(j);
			   }
		   
		          if( j == sPin.length() - n) {
		        	  
		        	  c2 = sPin.charAt(j);
		          }
		   }
		   
		    StringBuffer sb = new StringBuffer(str);
		    
		    for(int k = 0 ; k < sb.length() ; k++) {
		    	
		    	if(Character.isUpperCase(sb.charAt(k))) {
		    		
		    		 sb.replace(k, k+1, Character.toLowerCase(sb.charAt(k)) + "");
		    	}
		    	else if(Character.isLowerCase(sb.charAt(k))) {
		    		
		    		 sb.replace(k, k+1, Character.toUpperCase(sb.charAt(k)) + "");
		    	}
		    
		    }
		    
		    str = sb.toString();
		    
		    strg = str + c1 + c2;
		    
		     return strg;
	
	}
	
	public static void main(String[] args) {
		
	 String firstName = "Saundarya";
	 
	 String lastName = "Singh";
	 
	 int pin = 941999;
	 
	 int n = 2;
	 
	 String result = password(firstName, lastName, pin, n);
	 
	 System.out.println(result);

	}

}
