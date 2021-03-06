package LinkedList2;

import java.util.Scanner;

import LinkedList1.Node;

public class MidPointLinkedList {

	public static Node<Integer> input() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
	    while( n!= -1 ) {
	    	
	    	Node<Integer> contain = new Node<>(n);
	    	
	    	if( head == null ) {
	    		
	    	    head = contain;
	    	    tail = contain;
	    	}
	    	else {
	    		
	    		  tail.next = contain;
	    		  tail = tail.next;
	    	}   
	           n = sc.nextInt();
	    }
	        return head;
	} 

public static Node<Integer> midPoint( Node<Integer> head ) {
	
	Node<Integer> slow = head;
	Node<Integer> fast = head;
    
	
	
       while( fast.next != null && fast.next.next != null ) {
    	   
    	   
    	   slow = slow.next;
    	   
    	   
    	   
    	   fast = fast.next.next;
       }
             
           
       return slow;
} 

	
	public static void main(String[] args) {
		
    Node<Integer> head = input();
    
    Node<Integer> result = midPoint( head );
    
    System.out.println(result.data);
   
       
    
    }
	
	}


