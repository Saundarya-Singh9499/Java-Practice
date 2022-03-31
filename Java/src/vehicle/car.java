package vehicle;

public class car extends vehicle{

	
private String Rooftop;

public String getRooftop() {
	
	return Rooftop;
}

public void setRooftop(String rooftop) {
	
	Rooftop = rooftop;
}


public int numberOfGear() {
	return 6;
}


@Override
public String toString() {
	return "car [Rooftop=" + Rooftop + "" + super.toString() + "";
}






}
