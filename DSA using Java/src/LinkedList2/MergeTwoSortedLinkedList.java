package LinkedList2;

import java.util.Scanner;

import LinkedList1.Node;
import TakeInputandPrint2.LinkedListTakeInputandPrint;

public class MergeTwoSortedLinkedList<T> extends LinkedListTakeInputandPrint<T> {

	public static Node<Integer> input(){
		
		 Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      Node<Integer> head = null;
	      Node<Integer> tail = null;
	      
	      while(n != -1) {
	    	  
	      Node<Integer> input = new Node<>(n);
	      
	      if( head == null ) {
	    	  
	    	  head = input;
	    	  tail = input;
	      }
	      else {
	    	  
	    	  tail.next = input;
	    	  tail = tail.next;
	      }
	            n = sc.nextInt();
	       
	      }
	          return head;
	}
	
	public static Node<Integer> mergeTheLinkedList( Node<Integer> t1 , Node<Integer> t2 ){
		
		Node<Integer> head;
		
		Node<Integer> tail;
		
		if( t1.data < t2.data ) {
		   
		 head = t1;
		 tail = t1;
		 t1 = t1.next;
	  
	  }else {
		  
		  head = t2;
		  tail = t2;
		  t2 = t2.next;
	  }
	  
	  while( t1 != null && t2 != null ) {
    	   
    	   if( t1.data < t2.data ) {
    		   
    		   tail.next = t1;
    		   
    	        t1 = t1.next;
    	        tail = tail.next;
    	   }else {
    		   
    		   tail.next = t2;
    	       t2 = t2.next;
    	       tail = tail.next;
    	   }
       }
	
	       if( t2 != null ) {
	    	   
	    	  tail.next = t2; 
	       }
	           if( t1 != null ) {
	        	   
	        	   tail.next = t1;
	           }
	        return head;
	}
	
	public static void main(String[] args) {
		
	Node<Integer> t1 = takeInput();
	Node<Integer> t2 = takeInput();
	
	Node<Integer> result = mergeTheLinkedList(t1, t2);
	
    print(result);
	
	
	}

}
