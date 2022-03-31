package Inheritance;

public class Vehicle {

 private String name;
 String color;
 int maxSpeed;
 private int milage;
 
 private int a;
 private int b;
 
 public void setAdd( int a , int b ) {
	 
	 
	 this.a = a;
	 this.b = b;
}
  
 public int getAdd() {
	
	 return a + b;
}
 
 public void setMult(int a , int b) {
	 
	 this.a = a;
	 this.b = b;
 }
 
 public int getMult() {
	 
	 return a * b;
 }
 
 public void setName(String name) {
	 this.name = name;
 }
 
 public String getName() {
	 
	 return name;
 }
 
 public void setMilage(int milage) {
	 this.milage = milage;
 }
 
 public int getMilage() {
	 
	 return milage;
 }
 
 public void print() {
	 
System.out.println("Name= " + getName() + " color= " + color + " maxSpeed= " + maxSpeed + " milage= " + getMilage());
	 
  
 }

}
