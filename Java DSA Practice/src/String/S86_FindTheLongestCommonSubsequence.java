package String;

public class S86_FindTheLongestCommonSubsequence {

	public static int findLongest(String str1 , String str2) {
		
		 int count = 0;
		 
		 int n = str2.length();
		 
		 for(int i = str1.length() - 1 ; i >= 0 ; i--) {
			 
			 for(int j = i ; j >= 0 ; j--) {
				 
				  if(str1.charAt(i) == str2.charAt(j)) {
					  
					  count++;
				      
					  break;
				  
				  }
				  
				   
			 }
		 }
		 
		   return count; 
	}
	
	public static void main(String[] args) {
		
		String str1 = "AGGTAB";
		
		String str2 = "GXTXAYB";
		
		int result = findLongest(str1, str2);
		
		System.out.println(result); 

	}

}
