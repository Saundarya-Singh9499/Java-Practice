package JavaPractice1;

public class PrintAllCharString {

	public static void print(String str) {
	
		for(int i = str.length()- 1 ; i >=0  ; i--) {
        
	   char ch1 = str.charAt(i);
		System.out.println(ch1);
		System.out.println((str.length()-i)-1);
		
		
	     
	}
	}
	public static void main(String[] args) { 
		
		print("Rajput");
		
         

	}

}
