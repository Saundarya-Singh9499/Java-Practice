package String;

public class S75_ConvertASentenceIntoItsEquivalentKeypadSequence {

	public static void convertASentenceIntoKeypad(String str) {
		
		 for(int i = 0 ; i < str.length() ; i++) {
			 
	         if(str.charAt(i) == ' ') {
	        	 System.out.print("0");
	         }
			 
			 if(str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'C') {
		         
	        	if(str.charAt(i) == 'A') {
			       System.out.print("2");
			       }
			      if(str.charAt(i) == 'B') {
			    	  System.out.print("22");
			      }
			      if(str.charAt(i) == 'C') {
			    	  System.out.print("222");
			      }
	        }
	        if(str.charAt(i) == 'D' || str.charAt(i) == 'E' || str.charAt(i) == 'F') {
		         
	        	if(str.charAt(i) == 'D') {
			       System.out.print("3");
			       }
			      if(str.charAt(i) == 'E') {
			    	  System.out.print("33");
			      }
			      if(str.charAt(i) == 'F') {
			    	  System.out.print("333");
			      }
	        }
	        if(str.charAt(i) == 'G' || str.charAt(i) == 'H' || str.charAt(i) == 'I') {
		         
	        	if(str.charAt(i) == 'G') {
			       System.out.print("4");
			       }
			      if(str.charAt(i) == 'H') {
			    	  System.out.print("44");
			      }
			      if(str.charAt(i) == 'I') {
			    	  System.out.print("444");
			      }
	        }
	        if(str.charAt(i) == 'J' || str.charAt(i) == 'K' || str.charAt(i) == 'L') {
		         
	        	if(str.charAt(i) == 'J') {
			       System.out.print("5");
			       }
			      if(str.charAt(i) == 'K') {
			    	  System.out.print("55");
			      }
			      if(str.charAt(i) == 'L') {
			    	  System.out.print("555");
			      }
	        }
	        if(str.charAt(i) == 'M' || str.charAt(i) == 'N' || str.charAt(i) == 'O') {
		         
	        	if(str.charAt(i) == 'M') {
			       System.out.print("6");
			       }
			      if(str.charAt(i) == 'N') {
			    	  System.out.print("66");
			      }
			      if(str.charAt(i) == 'O') {
			    	  System.out.print("666");
			      }
	        }	   
	    if(str.charAt(i) == 'P' || str.charAt(i) == 'Q' || str.charAt(i) == 'R' ||str.charAt(i) == 'S') {
		         
	        	if(str.charAt(i) == 'P') {
			       System.out.print("7");
			       }
			      if(str.charAt(i) == 'Q') {
			    	  System.out.print("77");
			      }
			      if(str.charAt(i) == 'R') {
			    	  System.out.print("777");
			      }
			      if(str.charAt(i) == 'S') {
			    	  System.out.print("7777");
			      }
		     }
	        if(str.charAt(i) == 'T' || str.charAt(i) == 'U' || str.charAt(i) == 'V') {
		         
	        	if(str.charAt(i) == 'T') {
			       System.out.print("8");
			       }
			      if(str.charAt(i) == 'U') {
			    	  System.out.print("88");
			      }
			      if(str.charAt(i) == 'V') {
			    	  System.out.print("888");
			      }
	        }
	  if(str.charAt(i) == 'W' || str.charAt(i) == 'X' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z') {
		         
	        	if(str.charAt(i) == 'W') {
			       System.out.print("9");
			       }
			      if(str.charAt(i) == 'X') {
			    	  System.out.print("99");
			      }
			      if(str.charAt(i) == 'Y') {
			    	  System.out.print("999");
			      }
			      if(str.charAt(i) == 'Z') {
			    	  System.out.print("9999");
			      }
	        }

		 }
	}
	
	public static void main(String[] args) {
		
		String str = "GEEKSFORGEEKS";
		
	    convertASentenceIntoKeypad(str);

	}

}
