import java.util.Scanner;
public class Number {
	public static void main(String[] args) {
		

	Scanner sc=new Scanner(System.in);
	System.out.println("Hii, There are bundles of 20 cards in which 1 cards is the lucky Card");
	System.out.println("Ranndom Number will be generated");
	System.out.println("If the lucky number comes then you are lucky");
	System.out.println("All the best");
	
	System.out.println("lets Start");
	System.out.println("Now You Enter Start");
	String a=sc.next();
	
	int s=20;
   
	int r=(int)(Math.random()*s) + 1;
	System.out.println(r);
	
	if(r==9) {
		System.out.println("You are lucky");
		
	}
		else {
		System.out.println("Try your luck next time");
		}
		
	}
	}


