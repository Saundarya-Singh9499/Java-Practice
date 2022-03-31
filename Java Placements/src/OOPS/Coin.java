package OOPS;

public class Coin {

 private int coin;
 int result;

  public void setValue(int coin) {
	  
	  this.coin = coin;
  }

  public int getValue() {
	  
	  return coin;
  }

 public void print() {
	
	this.result = coin/2 + coin/3 + coin/4;
	System.out.println(result);
}




}
