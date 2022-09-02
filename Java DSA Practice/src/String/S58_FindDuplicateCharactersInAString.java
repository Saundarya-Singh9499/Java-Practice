package String;

public class S58_FindDuplicateCharactersInAString {

    public static void findDuplicate(String str) {
    	
         int count;
         
         char ch[] = str.toCharArray();
         
         for(int i = 0 ; i < str.length() ; i++) {
        	 
        	 count = 1;
        	 
        	 for(int j = i + 1 ; j < str.length() ; j++) {
        		 
        		 if(ch[i] == ch[j] && ch[i] != 0) {
        			 
        			 count++;
        			 
        			 ch[j] = 0;
        		 }
        	 }
        	 
        	   if(count > 1 && ch[i] != 0) {
        		   
        		    System.out.print(ch[i] + " ");
        	   }
         }
    }
	
	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		
        findDuplicate(str);
		
	}

}
