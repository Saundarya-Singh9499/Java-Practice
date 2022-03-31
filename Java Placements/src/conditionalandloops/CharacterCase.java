package conditionalandloops;

import java.util.Scanner;

public class CharacterCase {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Type any Charcater here :-  ");
		char c= sc.next().charAt(0);
		
		if(c>='A' && c<='Z') {
			System.out.println("1");
		}

		else if(c>='a' && c<='z') {
			System.out.println("0");
		}
		else {
			System.out.println("Number is not an Character");
		}
	}

}
