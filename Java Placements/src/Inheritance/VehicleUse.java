package Inheritance;

public class VehicleUse {

	public static void main(String[] args) {
		
    Vehicle v = new Vehicle();
   
    v.setName("Creta");
    v.setMilage(24);
    v.print();
		
    Car c = new Car();
    
    c.setName("Hairier");
    c.color = "Red";
    c.maxSpeed = 240;
    c.setMilage(24);
    c.maxSpeed();
    c.setAdd(80, 20);
    System.out.println(c.getAdd());
    
    
    c.print();
    
    Bike b = new Bike();
    
    b.setName("Bullet");
    b.color = "White";
    b.maxSpeed = 200;
    b.setMilage(24);
    b.setMult(10, 9);
    System.out.println(b.getMult());
    
    b.print();
	
   }

}
