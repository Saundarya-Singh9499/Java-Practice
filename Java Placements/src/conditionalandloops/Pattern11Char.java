package conditionalandloops;

import java.util.Scanner;

public class Pattern11Char {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
		while(i<=n) {
			
			int j = 1;
			char colmchar = (char)('A' + i - 1);
			while(j<=i) {
				
				System.out.print(colmchar);
				colmchar++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
