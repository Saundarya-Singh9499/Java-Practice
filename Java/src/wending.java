import java.util.Scanner;

public class wending{

	int cost;
	public static void main(String[] args) {
		
		
		wending Kurkure=new wending();
		wending Chips=new wending();
		wending Cadbury=new wending();
		wending Pepsi=new wending();
		
		
		Kurkure.cost=10;
		Chips.cost=15;
		Cadbury.cost=5;
		Pepsi.cost=40;
		
		
		
		
		Scanner a=new Scanner(System.in);
		
		System.out.println("Hi User, Availaible products are Kurkure ,  Chips , Cadbury and Pepsi ");
		System.out.println("Select any one product you want = ");
		String s=a.next();
	
		switch(s) {
     case "Kurkure":
		
    	 System.out.println("Cost of " + s + " is = Rs " + Kurkure.cost  );
  System.out.println("Please Pay Rs " + Kurkure.cost + " for the product");
			System.out.println("Paying Rs = ");
			 int q=a.nextInt();
			
			 if(q==10) {
				System.out.println("Congrats you got kurkure"); 
			 }
			 else if(q>10) {
				System.out.println("Returned Rs = ");
				System.out.println(q-Kurkure.cost);
				 System.out.println("Congrats you got Kurkure");
			 }
			 else if(q<10) {
				 System.out.println("Please pay more Rs = ");
				 System.out.println(Kurkure.cost-q);
				 int u=a.nextInt();
			 System.out.println("Congrats you Got Kurkure");
			 }
			 
			 
			 
					break;
		
      case "Chips":
	
    	  System.out.println("Cost of " + s + " is = Rs" + Chips.cost);
	System.out.println("Please Pay Rs " + Chips.cost + " for the product");
			System.out.println("Paying Rs = ");
			 int q1=a.nextInt();
			
			 
			 if(q1==15) {
					System.out.println("Congrats you got Chips"); 
				 }
				 else if(q1>15) {
					System.out.println("Returned Rs = ");
					System.out.println(q1-Chips.cost);
				 System.out.println("Congrats you got Chips");
				 }
				 else if(q1<15) {
					 System.out.println("Please pay more Rs = ");
					 System.out.println(Chips.cost-q1);
					 int u1=a.nextInt();
					 System.out.println("Congrats you Got Chips");	 
				 }
			 break;
		
	case "Cadbury":
		
		System.out.println("Cost of " + s + " is = Rs" + Cadbury.cost );
	System.out.println("Please Pay Rs " + Cadbury.cost + " for the product");
			System.out.println("Paying Rs = ");
			 int q2=a.nextInt();
			
			 
			 if(q2==5) {
					System.out.println("Congrats you got Cadbury"); 
				 }
			 else if(q2>5) {
					System.out.println("Returned Rs = ");
					System.out.println(q2-Cadbury.cost);
				 System.out.println("Congrats you got Cadbury");
				 }
				 else if(q2<15) {
					 System.out.println("Please pay more Rs = ");
					 System.out.println(Cadbury.cost-q2);
					 int u2=a.nextInt();
					 System.out.println("Congrats you Got Cadbury");	 
				 } 
			 break;
			
       case "Pepsi":
			
    	   System.out.println("Cost of " + s + " is = Rs" + Pepsi.cost);
   System.out.println("Please Pay Rs " + Pepsi.cost + " for the product");
			System.out.println("Paying Rs = ");
			 int q3=a.nextInt();
			
			 if(q3==40) {
					System.out.println("Congrats you got Pepsi"); 
				 }
			 else if(q3>40) {
					System.out.println("Returned Rs = ");
					System.out.println(q3-Pepsi.cost);
				 System.out.println("Congrats you got Pepsi");
				 }
				 else if(q3<40) {
					 System.out.println("Please pay more Rs = ");
					 System.out.println(Pepsi.cost-q3);
					 int u3=a.nextInt();
					 System.out.println("Congrats you Got Pepsi");	
				 }
		
		         break;
		
          default:
        	  System.out.println("Invalid Input");
        	  break;
		
}			
	}		
	   }
	
	
	
	
	
		
		
	
		
		



	



	

