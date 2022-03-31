package OOPS;

public class PolynomialMain {

	public static void main(String[] args) {
		
    PolynomialClass p1 = new PolynomialClass();

    p1.setP(2, 4);
    p1.setP(4, 3);
    System.out.print("p1 = ");
    p1.print();
   
    PolynomialClass p2 = new PolynomialClass();
   
    p2.setP(3, 2);
    p2.setP(2, 5);
    System.out.print("p2 = ");
    p2.print();
    
    PolynomialClass p3 = PolynomialClass.addP(p1, p2);
   
    System.out.print("p1 + p2 = "); 
    p3.print();
    
    PolynomialClass p4 = PolynomialClass.multP(p1, p2);
    
    System.out.print("p1 * p2 = ");
    p4.print();
    
    
    
    
   
   
	
	}

}
