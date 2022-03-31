package vehicle;

public class vehicle {

	private String color;
	private int milage;
	private int Capacity;
	private int noOfTyre;
	private String Name;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public int getNoOfTyre() {
		return noOfTyre;
	}
	public void setNoOfTyre(int noOfTyre) {
		this.noOfTyre = noOfTyre;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public int numberOfGear() {
		return 4;
	}
	
	@Override
	public String toString() {
		return "  color=" + color + ", milage=" + milage + ", Capacity=" + Capacity + ", noOfTyre=" + noOfTyre
				+ ", Name=" + Name + "]";
	}
	
	
	
}
