package OOPS;

public class Car {
  
  String Name;
  String Company;
  int price;
  int topspeed; 
  
  public int getTopSpeed() {
	return topspeed;
  }
	public void setTopSpeed( int num) {
		topspeed = num;
	  
  }
    
	public void setName(String Name) {
		System.out.println(this);
		this.Name = Name;
	}
	
	public  String getName() {
    	return Name;
    }

     public void setCompany(String Comp) {
    	 
    	 this.Company = Comp;
     }

      public String getCompany() {
    	  return Company;
      }

}

