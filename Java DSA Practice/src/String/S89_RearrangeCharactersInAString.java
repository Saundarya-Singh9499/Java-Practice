package String;

public class S89_RearrangeCharactersInAString {

	public static String rearrange(String str) {
		
		 char ch[] = str.toCharArray();
		 
		 String strg = "";
		
		 char ch1 = 0;
		 
		 for(int i = 1 ; i < ch.length ; i++) {
			 
			   if(ch[i] == ch[i - 1]) {
				   
				    ch1 = ch[i];
				   
				    for(int j = i + 1 ; j < ch.length ; j++) {
				    	
				    	  if(ch[j] != ch[j - 1]) {
				    		  
				    		    ch[i] = ch[j];
				    		    
				    		    ch[j] = ch1;
				    		    
				    		   break;
				    	  }
				    }
			   }
		 }
		 
		   strg = strg.valueOf(ch);  
		 
		 for(int k = 1 ; k < strg.length() ; k++) {
			   
			   if(strg.charAt(k) == strg.charAt(k - 1)) {
				   
				   return "Not Possible";
			   }
		   }
		 
		  return strg;
	}
	
	public static void main(String[] args) {
		
		String str = "aaabc";
		
	    String result = rearrange(str);
	    
	    System.out.println(result); 
	}

}
