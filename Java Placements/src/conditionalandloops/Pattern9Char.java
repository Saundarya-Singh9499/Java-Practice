package conditionalandloops;

import java.util.Scanner;

public class Pattern9Char {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 1;
		while(i<=n) {
			
			int j=1;
			char startingchar = (char)('A' + i - 1 );
			while(j<=n) {
				
		    System.out.print(startingchar);
		    
		    startingchar++;	
		    j++;
			
			}
			System.out.println();
			i++;
		}
	}

}
