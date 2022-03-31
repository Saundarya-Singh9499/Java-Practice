public class car1 {

	String name;
	String color;
	int capacity;
	int kilometers;
	
	String model;

	public int calculatemilage(int capacity,int kilometer) {
		int milage=kilometer/capacity;
		
	return milage;
		
		
	}
	
	
	public String toString() {
		return "car1 [name=" + name + ", color=" + color + ", capacity=" + capacity + ", kilometers=" + kilometers
				+ ", model=" + model + "]";
	}

	
	
	
	
}
