import java.util.Scanner;

public class Spsgame {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
  System.out.println("We will play a game called Stone Paper Scissor");
	System.out.println("Press 1 to start the game");
	int a = sc.nextInt();
		
	 String[] game = {"Stone" , "Paper" , "Scissor"};
		 int randgame1 = (int)(Math.random()*3);
		 
		 String spc1 = game[randgame1];
		 System.out.println("First player got = " + spc1);
		
		 int randgame2 = (int)(Math.random()*3);
		 
		 String spc2 = game[randgame2];
		 System.out.println("Second player got = " + spc2);
		 
		 if(spc1.equals("Stone") && spc2.equals("Stone")) {
		 System.out.println("Match is draw between them");
		 }
	     if(spc1.equals("Stone") && spc2.equals("Paper")) {
	     System.out.println("Congrats Second Player won");
		 } 
		 if(spc1.equals("Stone") && spc2.equals("Scissor")) {
	     System.out.println("Congarts First Player won");
		 }
	     if(spc1.equals("Paper") && spc2.equals("Paper")) {
	     System.out.println("Match is draw between them");
	     }   
	     if(spc1.equals("Paper") && spc2.equals("Scissor")) { 
	     System.out.println("Congarts Second Player won");
	     }
	     if(spc1.equals("Paper") && spc2.equals("Stone")) {
         System.out.println("Congarts First Player won");
	     }
         if(spc1.equals("Scissor") && spc2.equals("Scissor")) {
    	     System.out.println("Match is draw between them");
         }     
    	     if(spc1.equals("Scissor") && spc2.equals("Paper")) { 
    	     System.out.println("Congarts First Player won");
    	     }  
    	     if(spc1.equals("Scissor") && spc2.equals("Stone")) {
             System.out.println("Congarts Second Player won");
    	     }
    	     
    	     
    	       }
    	             }
         
	     
	  
		 
		 
		 
		 
	
     
