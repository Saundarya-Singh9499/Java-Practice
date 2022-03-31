
public class car {
 private static int numberplate=8764;
 private int numberplate1=8764;
private	int noOfTyres;
	private String color;
	private String name;
	private int noOfSeats;
	private int noOfGears;
	
	
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
	color=color+" green";
	   this.color=color;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int getNumberplate() {
		return numberplate;
	}

	public static void setNumberplate(int numberplate) {
		car.numberplate = numberplate;
	}

	public int getNumberplate1() {
		return numberplate1;
	}

	public void setNumberplate1(int numberplate1) {
		this.numberplate1 = numberplate1;
	}

	public int getNoOfTyres() {
		return noOfTyres;
	}

	public void setNoOfTyres(int noOfTyres) {
		this.noOfTyres = noOfTyres;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}
	
	
	
	
	
	
	

	public static String addDetails() {
		int sum=0;
		numberplate++;
		sum=numberplate;
		return "sum= "+sum;
	}
	
	
	
	public String toString() {
		
		return name+" [noOfTyres=" + noOfTyres + ","+" color=" + color + ", name=" + name + ", noOfSeats=" + noOfSeats
				+ ", noOfGears=" + noOfGears + "]";
	}
	
	
	
	
	
}
