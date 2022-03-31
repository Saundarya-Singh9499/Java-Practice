import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		

       Scanner sc = new Scanner(System.in);
       
       
       System.out.println("Enter the number : - ");
       int a =sc.nextInt();
       int[] marks = new int[a];
    
      System.out.println("Enter the marks now : - ");
       for (int i = 0 ; i < a ;i++){
    	
    	marks[i]=sc.nextInt();
    	
       
       }
       
	System.out.println("At 1st position = " + marks[0]);
	System.out.println("At 5th position = " + marks[4]);
	System.out.println("At 10th position = " + marks[9]);
	
	}

}
