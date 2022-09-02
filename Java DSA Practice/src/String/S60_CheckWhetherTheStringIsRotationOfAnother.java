package String;

public class S60_CheckWhetherTheStringIsRotationOfAnother {

	public static boolean checkTheStringRotation(String str1 , String str2) {
		
	     if(str1.length() != str2.length()) {
	    	 
	    	 return false;
	     }
	     
	     String strg = str1 + str2;
	     
	     if(strg.contains(str2)) {
	    	 
	    	 return true;
	     }
	     
	     else {
	    	 
	    	 return false;
	     }
	}
	
	public static void main(String[] args) {
		
	     String str1 = "ABACD";
	     
	     String str2 = "CDABA";
	     
	     if(checkTheStringRotation(str1, str2)) {
	    	 
	    	 System.out.println("Strings are Rotations of each other");
	     }
	     
	     else {
	    	 
	    	  System.out.println("String are Not the Rotations of each other");
	     }

	}

}
