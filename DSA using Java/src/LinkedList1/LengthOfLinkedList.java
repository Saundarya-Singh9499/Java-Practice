package LinkedList1;

public class LengthOfLinkedList {

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
	
	public static int lengthOfLinkedList( Node<Integer> head ) {
		
	    int num = 0;
		Node<Integer> temp = head;	
	 
	      while( temp != null) {
	    	  
	    	   num+= 1;
	    	   
	    	   temp = temp.next;
	      }
	
	          return num;
	}
	
	public static void main(String[] args) {
		
    Node<Integer> head = creatingNodes();
    int result = lengthOfLinkedList(head);
    System.out.println(result);
	
	}

}
