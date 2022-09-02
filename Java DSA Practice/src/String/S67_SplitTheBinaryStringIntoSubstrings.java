package String;

public class S67_SplitTheBinaryStringIntoSubstrings {

	public static int splitTheBinaryString(String str) {
		
	    int count1 = 0;
	    
	    int count2 = 0;
	    
	    int mainCount = 0;
	    
	    for(int i = 0 ; i < str.length() ; i++) {
	    	
	    	  if(str.charAt(i) == '0') {
	    		  
	    		  count1++;
	    	  }
	    	  
	    	  else {
	    		  
	    		  count2++;
	    	  }
	    	  
	    	  if(count1 == count2) {
	    		  
	    		  mainCount++;
	    	  }
	    }
	    
	      if(count1 == count2) {
	    	  
	    	  return mainCount;
	      }
	    
               return -1;
	}
	
	public static void main(String[] args) {
		
		String str = "0100110101";
		
		int result = splitTheBinaryString(str);
		
		System.out.println(result);

	}

}
