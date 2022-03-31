package FunctionsandScope;

import java.util.Scanner;

public class NCR {

	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int r = sc.nextInt();
      
    int factN = 1;  
      for (int i =1 ; i<=n ; i++) {
    	 factN= factN * i;
      }
	int factR = 1;
	for(int j = 1 ; j<=r ; j++) {
		factR = factR*j;
	}
	 int factNR = 1;
	for(int k = 1 ; k<= n - r ; k++) {
		factNR = factNR*k;
	}
	int result = factN / (factR*factNR);
	System.out.println(result);
	
	}

}
