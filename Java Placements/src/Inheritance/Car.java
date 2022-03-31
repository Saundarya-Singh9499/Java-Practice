package Inheritance;

public class Car extends Vehicle {

	int maxSpeed;


public void print() {
	super.print();
	System.out.println("color = " + color + " maxSpeed = " + maxSpeed);
}

  public void maxSpeed() {
	  super.maxSpeed = 280;
	  System.out.println("maxSpeed = " + super.maxSpeed);
  }

}
