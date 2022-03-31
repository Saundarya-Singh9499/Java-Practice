import java.util.Scanner;

public class calculator1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first numbers");
		int a= sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		System.out.println("Enter the operators ");
		String c =sc.next();
		
		switch(c) {
		case "+":
			System.out.println("Addition is = ");
			System.out.println(a+b);
			break;
	
		case "-":
			System.out.println("Substraction is = ");
			System.out.println(a-b);
			break;
		
		case "*":
			System.out.println("Multiplication is = ");
			System.out.println(a*b);
			break;
			
		case "/":
			System.out.println("Division is = ");
			System.out.println(a/b);
			break;
			
	    default:
	    	System.out.println("Invalid Input");
			
		}
		
		
		}
	}


