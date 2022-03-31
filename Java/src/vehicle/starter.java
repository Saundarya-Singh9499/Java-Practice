package vehicle;

public class starter {

	public static void main(String[] args) {
		car car=new car();
		    car.setRooftop("yes Rooftop present");
		    car.setCapacity(5);
		    car.setColor("blue");
		    car.setMilage(16);
		    car.setName("Creta");
		    car.setNoOfTyre(4);
		
		 
		 
		 
		auto auto=new auto();
		     auto.setOpen("NO not open");
		     auto.setCapacity(4);
		     auto.setColor("yellow and black");
		     auto.setMilage(25);
		     auto.setName("Piaggio");
		     auto.setNoOfTyre(3);
		     
	   bus bus =new bus();
	         bus.setWindow("20");
	         bus.setCapacity(50);
	         bus.setMilage(5);
	         bus.setName("Ashok layland");
	         bus.setNoOfTyre(8);
	         bus.setColor("white");
	       
		 System.out.println(car+" "+car.numberOfGear());
		 System.out.println(bus+" "+bus.numberOfGear());
		 System.out.println(auto+" "+auto.numberOfGear());
		 
		 vehicle carnew =new vehicle();
		System.out.println(carnew.numberOfGear());
	    
		
		
	    
		
	}
	
	
	
}
