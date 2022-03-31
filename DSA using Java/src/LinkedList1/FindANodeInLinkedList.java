package LinkedList1;

import java.util.Scanner;

public class FindANodeInLinkedList {

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
	
	public static void findANodeInLinkedList( Node<Integer> head , int n ) {
		
		int num = 0;
		
		Node<Integer> temp = head;
		
		while( temp != null) {
			
			if( n == temp.data) {
				
				System.out.println(num);
			
			}
			
			temp = temp.next;
			
			num+= 1;
			
		}
	       
	
	}
	
	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    Node<Integer> head = creatingNodes();
    findANodeInLinkedList(head, n);
	
	}

}
