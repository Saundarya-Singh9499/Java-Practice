package LinkedList2;

import java.util.Scanner;

import LinkedList1.Node;

public class MergeSortUsingLinkedList {

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
	
	public static Node<Integer> mergeSortLinkedList( Node<Integer> head ) {
		
	    if( head.next == null ) {
	    	
	    	return head;
	    }
		
		Node<Integer> fast = head;
	    Node<Integer> slow = head;
	    Node<Integer> secondNode;
	    Node<Integer> firstNode;
	    
	    while( fast.next != null && fast.next.next != null ) {
	    	
	    	
	    	slow = slow.next;
	    	fast = fast.next.next;
	    }
		
	      firstNode = head;
	      
	      secondNode = slow.next;
	      
	      slow.next = null;
	      
	     firstNode = mergeSortLinkedList(firstNode);
	     
	     secondNode = mergeSortLinkedList(secondNode);
	    
	      Node<Integer> merged = mergeBoth(firstNode , secondNode);
	
	      return merged;
	}
	
 public static Node<Integer> mergeBoth(Node<Integer> firstNode, Node<Integer> secondNode) {
		
	 Node<Integer> head;
	 
	 Node<Integer> tail;
	 
	 Node<Integer> t1 = firstNode;
	 
	 Node<Integer> t2 = secondNode;
	 
	 if( t1.data < t2.data) {
		 
		 head = t1;
		 tail = t1;
		 t1 = t1.next;
	 }
	 else {
		 
		 head = t2;
		 tail = t2;
		 t2 = t2.next;
	 }
	
       while( t1 != null && t2 != null ) {
    	   
    	   if( t1.data < t2.data ) {
    		   
    		   tail.next = t1;
    		   tail = tail.next;
    		   t1 = t1.next;
    	   }
       
    	   else {
    		   
    		   tail.next = t2;
    		   tail = tail.next;
    		   t2 = t2.next;
       }    
    	   
         }
               
        if( t1 != null ) {
        	
        	tail.next = t1;
        }
        
        if( t2 != null ) {
        	
        	tail.next = t2;
        }
  
             return head;
 }      

	public static void main(String[] args) {
		
    Node<Integer> head = input();
    
    Node<Integer> result = mergeSortLinkedList(head);
    
    while( result != null ) {
    	
    	System.out.print(result.data + " ");
    	
        result = result.next;
    }
	
	}

}
