import java.util.Scanner;
public class Details {

	public static void main(String[] args) {
    
    Scanner ss=new Scanner(System.in);
  car1 santro=new car1();
  car1 verna=new car1();
  car1 creta=new car1();
  
  
  santro.model="hashback";
  santro.name="santro";
  santro.color="red";
  santro.capacity=10;
  santro.kilometers=50;
  santro.calculatemilage(santro.capacity, santro.kilometers);
  
  verna.model="sedan";
  verna.name="verna";
  verna.color="blue";
  verna.capacity=18;
  verna.kilometers=110;
  verna.calculatemilage(verna.capacity, verna.kilometers);
  
  creta.model="suv";
  creta.name="creta";
  creta.color="yellow";
  creta.capacity=26;
  creta.kilometers=220;
  creta.calculatemilage(creta.capacity, creta.kilometers);
	
System.out.println("santro=" +santro + "milage=" +santro.calculatemilage(santro.capacity, santro.kilometers));
	System.out.println("verna=" +verna + "milage=" +verna.calculatemilage(verna.capacity, verna.kilometers));
	System.out.println("creta=" +creta + "milage=" +creta.calculatemilage(creta.capacity, creta.kilometers));
	
	System.out.println("Enter the model name or car name  =");
	String a=ss.next();
	
	switch(a) {
	case "hashback":
	case "santro":	
		System.out.println( "car name = " + santro.name + "  " + "milage=" +santro.calculatemilage(santro.capacity, santro.kilometers));
		break;
	case "sedan":
	case "verna":	
		System.out.println("car name = " + verna.name + "  " + "milage=" +verna.calculatemilage(verna.capacity, verna.kilometers));
		break;
	case "suv":
	case "creta":	
		System.out.println("car name = " + creta.name + "  " + "milage=" +creta.calculatemilage(creta.capacity, creta.kilometers));
		break;
	
	}
	
	
	
}
	
}	
