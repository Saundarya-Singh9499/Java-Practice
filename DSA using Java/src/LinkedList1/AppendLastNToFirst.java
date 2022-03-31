package LinkedList1;

import java.util.Scanner;

public class AppendLastNToFirst {

	public static Node<Integer> creatingNodes(){
		
		Node<Integer> n1 = new Node<>(20);
		Node<Integer> n2 = new Node<>(40);
		Node<Integer> n3 = new Node<>(80);
		Node<Integer> n4 = new Node<>(100);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
	    
	    return n1;
	}
	
	public static void appendN( Node<Integer> head , int n) {
	    
	    int counter = 1;
		int count = 1 ;
		Node<Integer> temp = head;
		Node<Integer> store = head;
	    
		while( temp != null) {
			
			if(count == n) {
			
	     	Node<Integer> h2 = temp;
		    
	     	while( h2 != null) {
				
	        System.out.println(h2.data);
		    
	        h2 = h2.next;
		    
		 } 
		  
	         temp.next = null; 
   } 
	  
        temp = temp.next;
		    
			count+= 1;
        }
	      
        while( counter != n ) {
	    
        System.out.println(store.data);
	    store = store.next;
	    
	    counter+= 1;
      
        }
    }
	
	public static void main(String[] args) {
		
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    
    Node<Integer> head = creatingNodes();
    appendN( head , n );
    
	
	}

}
