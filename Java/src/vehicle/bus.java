package vehicle;

public class bus extends vehicle{
private String window;

public String getWindow() {
	return window;
}

public void setWindow(String window) {
	this.window = window;
}


public int numberOfGear() {
	return 5;
}
@Override
public String toString() {
	return "bus [window=" + window +  ""
			+ super.toString() + "";
}


}
