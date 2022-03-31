import java.util.Scanner;

public class MatricesCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the rows and columns :- ");
	    int rows= sc.nextInt();
	    int cols=sc.nextInt();
	    
	    
	    int [][] a = new int[rows][cols];
	    int [][] b = new int[rows][cols];
	   
	    System.out.println("Enter the dimension of 1st matrix"); 
	        for(int i=0; i<rows ; i++) {
	    	for(int j=0; j<cols ; j++) {
	    		a[i][j]=sc.nextInt();
	    		
	    	}
	    }
	  System.out.println("Enter the dimension of 2nd matrix"); 
	    for(int i=0; i<rows ; i++) {
	    	for(int j=0; j<cols ; j++) {
	    		b[i][j]=sc.nextInt();
	    		
	    	}
	    }
	 	    
	    System.out.println("Enter the operator + , - , * , /  ");
	    String n = sc.next();
	    
	    for(int i=0; i<rows ; i++) {
	    	for(int j=0; j<cols ; j++) {
	    	 
	    		switch(n) {
	    		case "+":
	    			System.out.print(a[i][j] + b[i][j] + " ");
	    		break;
		    	
	    		case "-":
	    			System.out.print(a[i][j] - b[i][j] + " ");
	    		break;
		    	  
	    		case "*":
	    			System.out.print(a[i][j] * b[i][j] + " ");
	    		break;
		    	    	
	    	    case "/":
	    	    	System.out.print(a[i][j] / b[i][j] + " ");
	    		break;
		    	    	
	    		}	
	    		
	    	}
	    System.out.println();	
	    }
		
	 }
	    
 }

	