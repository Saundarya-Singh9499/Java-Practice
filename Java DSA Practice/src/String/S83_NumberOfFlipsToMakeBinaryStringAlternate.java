package String;

public class S83_NumberOfFlipsToMakeBinaryStringAlternate {

	public static int numberOfFlipsCount(String str) {
		
		 int count = 0;
		 
		 char ch[] = str.toCharArray();
		 
		 if(ch.length == 1) {
			 
			 return 0;
		 }
		 
		 if(ch.length == 2) {
			 
			 return 1;
		 }
		 
		 for(int i = 2 ; i < ch.length ; i++) {
			 
			     if(ch[i-2] == '0' && ch[i -1] == '0' && ch[i] == '0') {
			    	 
			    	ch[i-1] = '1';   
			    	 
			    	 count++;
			     }
			     
			     if(ch[i-2] == '1' && ch[i -1] == '1' && ch[i] == '1') {
			    	 
		    	     ch[i -1] = '0';
			    	 
			    	 count++;
		     }
			     
               if(ch[i-2] == '0' && ch[i -1] == '0' && ch[i] == '1') {
			    	 
		    	   ch[i-2] = '1';  
            	   
            	   count++;
		         
               }
               
               if(ch[i-2] == '1' && ch[i -1] == '0' && ch[i] == '0') {
			    	 
		    	   ch[i] = '1';  
            	   
            	   count++;
		       
               }
               
		 }
		 
		    return count;
	}
	
	public static void main(String[] args) {
		
		String str = "0001010111";
		
		int result = numberOfFlipsCount(str);
		
		System.out.println(result);

	}

}
