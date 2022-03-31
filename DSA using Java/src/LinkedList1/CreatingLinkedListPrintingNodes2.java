package LinkedList1;

public class CreatingLinkedListPrintingNodes2 {

	public static Node<Integer> linkedListNodePrinting(){
		int index = 20;
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(40);
		Node<Integer> n4 = new Node<>(80);
		Node<Integer> n5 = new Node<>(90);
		Node<Integer> n6 = new Node<>(100);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		return n1;
	}
	
    public static void print( Node<Integer> head ) {
    	
    	System.out.println(head);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
        System.out.println(head.next.next.next.next.next.data); 
    }
	
	public static void main(String[] args) {
		
    Node<Integer> head = linkedListNodePrinting();
	
    print(head);
	
	}

}
