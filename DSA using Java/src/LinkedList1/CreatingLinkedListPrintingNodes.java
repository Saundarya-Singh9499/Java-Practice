package LinkedList1;

public class CreatingLinkedListPrintingNodes {

	public static Node<Integer> linkedListNodesPrinting(){
		
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(40);
		Node<Integer> n4 = new Node<>(80);
		Node<Integer> n5 = new Node<>(90);
		Node<Integer> n6 = new Node<>(100);
		
		n1.next = n2;
		System.out.println(n1 + " " +  n1.data + n1.next);
		n2.next = n3;
		System.out.println(n2 + " " + n2.data + n2.next);
		n3.next = n4;
		System.out.println(n3 + " " + n3.data + n3.next);
		n4.next = n5;
		System.out.println(n4 + " " + n4.data + n4.next);
		n5.next = n6;
		System.out.println(n5 + " " + n5.data + n5.next);
		System.out.println(n6 + " " + n6.data + n6.next);
		
		return n1;
		
	}
	 
	
	public static void main(String[] args) {
		
    Node<Integer> head = linkedListNodesPrinting();
    
    
	
	}

}
