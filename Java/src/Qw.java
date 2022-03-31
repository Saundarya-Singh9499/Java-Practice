import java.util.Scanner;
public class Qw {

	public static void main(String[] args) {
		
        int add=2,sum,sub;
		Scanner sp=new Scanner(System.in);

          System.out.println("Enter the first number= " );
          int a=sp.nextInt();
          
          System.out.println("Enter the second number= ");
          int b=sp.nextInt();
          
          System.out.println("select operator  + or -");
          String h=sp.next();
         
          switch(h) { 
         case "+":
        	 System.out.println(a+b);
        break;
         case "-":
        	 System.out.println(a-b);
              break;                     	 
	}

}
}