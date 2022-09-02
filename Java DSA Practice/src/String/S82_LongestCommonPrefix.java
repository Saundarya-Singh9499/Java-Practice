package String;

public class S82_LongestCommonPrefix {

	public static String longestPrefix(String str[]) {
	 
		String strg = "";
        
		int n = 0;
        
        int m = 1;
        
        for(int i = 0 ; i < str.length ; i++){
            
        	m = 1;
        	
        	for(int j = 0 ; j < str[i].length() ; j++){
                
                  if(str[n].charAt(i) == str[m].charAt(j)){
                      
                      if(m == str.length - 1) {
                        
                    	  strg = strg + str[n].charAt(i);
                          
                          break;
                      }
                         
                           m++;
                           
                           j=0;
                   }
                  
                  if(j == str[i].length() - 1) {
                	
                	  break;
                  
                  }
                  
                 
            }
        }
        
	          return strg;
	}
	
	public static void main(String[] args) {
		
		String str[] = {"flower","flow","flight"};
		
		String result = longestPrefix(str);
		
		System.out.println(result);

	}

}
