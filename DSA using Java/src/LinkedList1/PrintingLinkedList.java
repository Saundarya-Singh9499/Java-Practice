package LinkedList1;

import java.util.Scanner;

public class PrintingLinkedList {
    
    public static Node<Integer> findNode(){
    	
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
		
		Node<Integer> temp = head;
		while(temp != null) {
			
			System.out.println(temp.data);
			temp = temp.next;
		
		   }

	}
    
    public static void main(String[] args) {
	
    Node<Integer> head = findNode();
    print(head);
    
    
    
    
    
    
    
	
	}

}
