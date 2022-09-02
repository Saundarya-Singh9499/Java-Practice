package String;

public class S65_PrintAllSubsequenceOfAString {

	public static void PrintAllSubsequenceOfAString(char ch[]) {
		
		for(int i = 0 ; i < ch.length ; i++) {
	    	
	    	for(int j = 0 ; j < ch.length ; j++) {
	    		
	    		 int k = i + j;
	    		 
	    		 if(k == ch.length) {
	    			 
	    			 break;
	    		 }
	    		 
	    		 for(int y = j ; y <= k ; y++) {
	    			 
	    			 System.out.print(ch[y]);
	    		 }
	    		 
	    		   System.out.println();
	    	}
	    }
	}
	
	public static void main(String[] args) {
		
        char ch[] = {'a' , 'b' , 'c' , 'd'};
        
        PrintAllSubsequenceOfAString(ch);

	}

}
