package OOPS;

public class GettersandSetters {

	public static void main(String[] args) {
		
		Car c= new Car();
		 
		c.setTopSpeed(280);
		
		c.setName("Creta");
		
		c.setCompany("Hyundai");
		
		System.out.println(c.getTopSpeed() + " " + c.getName() + " " + c.getCompany());
        System.out.println(c);
        
	}

}
