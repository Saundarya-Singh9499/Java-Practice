package String;

public class S62_CountAndSayProblem {

	public static String countAndSayProblem(int n) {
	 
		    if (n == 1) {
		    	
		    	return "1";
		    	
		    }
			
		    if (n == 2) {
				
				return "11";
				
		    }

			String str = "11";
			
			for (int i = 3; i <= n; i++)
			{

				str += '$';
			    
				int len = str.length();
				
				int cnt = 1; 
				
				String tmp = ""; 
				
				char []arr = str.toCharArray();
				
			
				for (int j = 1; j < len; j++)
				{
					
					if (arr[j] != arr[j - 1])
					{
						
						tmp = tmp + cnt + 0;

						
						tmp = tmp + arr[j - 1];

					
						cnt = 1;
					}

					
					else cnt++;
				}

			
				str = tmp;
			}

			return str;
	 
	}
	 
	
	  public static void main(String[] args) {
		
	    int n = 5;
	    
	    String result = countAndSayProblem(n);
	    
	    System.out.println(result);

	}

}
