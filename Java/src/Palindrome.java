import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
    Scanner ab= new Scanner(System.in);
	
	System.out.println("Enter any number you want = ");
	int n=ab.nextInt();
	
	int lastdigit;
	int reverse=0;
	
	int temp=n;
	
	while(temp > 0) {
		
		lastdigit=temp%10;
		
		temp/=10;
		
        reverse = reverse*10 + lastdigit;			
	
	}			
				
	 if(reverse==n) {
		 System.out.println(n + " is a palindrome number");
		 
	 }
	 else {
		 System.out.println(n + " is not a palindrome number");
	 }
		 
		 
		 
	}
	
	
			
}
			
			
				
							



			



			


				
				



			



			


		