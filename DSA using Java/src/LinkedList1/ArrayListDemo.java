package LinkedList1;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>(20);

	    arr.add(10);
	    arr.add(20);
	    arr.add(30);
	    arr.add(40);
	    arr.add(4 , 100);
	    arr.add(2 , 90);
	    
	    arr.remove(3);
	    
	    arr.set(3 , 80);
	    
	    System.out.println(arr);
	    System.out.println(arr.size());
	
	
	
	}

}
