package conditionalandloops;

import java.util.Scanner;

public class AdvancePattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while(i<=n) {
	      
        int j = 1;
		int value = 1;
        while(value <= n-i) {
			System.out.print(" ");
			value++;
			
	     }
           
           while(j<=i) {
        	   System.out.print(j);
                j++;           
           }
           System.out.println();  
           i++;
		}
	}

}
