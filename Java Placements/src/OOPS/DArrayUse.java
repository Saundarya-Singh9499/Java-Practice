package OOPS;

public class DArrayUse {

	public static void main(String[] args) {
		
		DynamicArray d = new DynamicArray();
		
		for(int i = 0 ; i < 100 ; i++) {
			
          d.add(i);
		
    }

         System.out.println(d.get(20));
		 
		 System.out.println(d.size());
	
	d.set(90, 100);
	System.out.println(d.get(90));
	
	}

}
