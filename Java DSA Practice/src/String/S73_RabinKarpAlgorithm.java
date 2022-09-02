package String;

public class S73_RabinKarpAlgorithm {

	public static void rabinKarp(String str1 , String str2) {
		

		 for(int i = 0 ; i < str1.length() - str2.length() ; i++) {
			 
			 int j;
			 
			 for(j= 0 ; j < str2.length() ; j++) {
				 
				   if(str1.charAt(i + j) != str2.charAt(j)) {
					   
					   break;
				   }
				   
				  
		 }
			 
			 if(j == str2.length()) {
				   
				   System.out.println(i);
			   }
		 }
	}
	
	public static void main(String[] args) {
		
		String str1 = "THIS IS A TEST TEXT";
		
		String str2 = "TEST";
		
		rabinKarp(str1, str2);

	}

}
