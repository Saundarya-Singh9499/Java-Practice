package LinkedList1;

public class EliminateDuplicatesFromLinkedList {

    public static Node<Integer> creatingNode(){
    	
    	Node<Integer> n1 = new Node<>(1);
		Node<Integer> n2 = new Node<>(2);
		Node<Integer> n3 = new Node<>(2);
		Node<Integer> n4 = new Node<>(4);
		Node<Integer> n5 = new Node<>(5);
		Node<Integer> n6 = new Node<>(5);
		Node<Integer> n7 = new Node<>(2);
		Node<Integer> n8 = new Node<>(4);
		Node<Integer> n9 = new Node<>(8);
		Node<Integer> n10 = new Node<>(8);
		Node<Integer> n11 = new Node<>(5);
		Node<Integer> n12 = new Node<>(100);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n10.next = n11;
		n11.next = n12;
	    
	    return n1;
    }
	
	public static void eliminateDuplicate( Node<Integer> head) {
		
		int count = 1;
		Node<Integer> temp = head;
		Node<Integer> first = head;
		Node<Integer> second = head;
	
	    while( temp != null ) {
	    	
	    	
	    	
	    	
	    	temp = temp.next;
	        count+= 1;   
	    		
	      }
	    	
	      for( int i = 0 ; i <= count ; i++) {
	    	  
	    	  first = first.next;
	    	  second = second.next;	
	      }
	   }
    
    
	public static void main(String[] args) {
		
	Node<Integer> head = creatingNode();
	eliminateDuplicate(head);
	
	}

}
