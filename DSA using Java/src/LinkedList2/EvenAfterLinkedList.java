package LinkedList2;

import java.util.Scanner;

import LinkedList1.Node;

public class EvenAfterLinkedList {

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
	
	public static Node<Integer> evenAfterOddLinkedList( Node<Integer> head ){
		
		
	  Node<Integer> oddHead = null;
	  
	  Node<Integer> oddTail = null;
	  
	  Node<Integer> evenHead = null;
	  
	  Node<Integer> evenTail = null;
	  
	  while( head != null ) {
	    	
	    	if( head.data%2 == 0 ) {
	    		
	    	     if( evenHead == null ) {
	    	    	 evenHead = head;
	    			  evenTail = head;
	    			  
	    	     }else {
	    	    	 
	    	    	 evenTail.next = head;
	    	    	 evenTail = evenTail.next;
	    	    	
	    	  }
	    	}
	    	else if( head.data%2 != 0 ) {
	 	    		
		    	     if( oddHead == null ) {
		    	    	 oddHead = head;
		    			  oddTail = head;
		    			  
		    	     }else {
		    	    	 
		    	    	 oddTail.next = head;
		    	    	 oddTail = oddTail.next;
		    	    	 
		    	     }
	    }
	   
	    	 head = head.next;
	  }
	        if( oddHead == null ) {
	        	
	        	evenTail.next = null;
	        	
	        	return evenHead;
	        }
	        
	        else {
	       
	         oddTail.next = evenHead;
	         evenTail.next = null;
	     
	     } 
	       return oddHead;
	}
	  
    public static void main(String[] args) {
	
	Node<Integer> head = input();
	
	Node<Integer> result = evenAfterOddLinkedList(head);
	
	while( result != null ) {
		
		System.out.print(result.data + " ");
		
		result = result.next;
	}
    
	}

}
