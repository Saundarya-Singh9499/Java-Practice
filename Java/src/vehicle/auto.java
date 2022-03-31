package vehicle;

public class auto extends vehicle{
private String open;

public String getOpen() {
	return open;
}

public void setOpen(String open) {
	this.open = open;
}



public int numberOfGear() {
	return 3;
}
@Override
public String toString() {
	return "auto [open=" + open + ""
			+ super.toString() + "";
}

}
