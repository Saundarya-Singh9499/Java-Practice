package JavaPractice2;

import java.util.Scanner;

 class TheCheaperCabCodeChef {

    public static void cheaperCab( int X , int Y ) {
     
    	 if( X < Y ) {
    		 
    		 System.out.println("FIRST");
    	 }
    	  if( X > Y ) {
    		  
    		  System.out.println("SECOND");
    	  }
       
       if( X == Y ) {
    	   
    	   System.out.println("ANY");
       }
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int Y = sc.nextInt();

	    cheaperCab(X, Y);
	}

}
