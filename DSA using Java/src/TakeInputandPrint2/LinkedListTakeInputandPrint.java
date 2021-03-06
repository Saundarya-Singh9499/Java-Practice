package TakeInputandPrint2;

import java.util.Scanner;

import LinkedList1.Node;

public class LinkedListTakeInputandPrint<T> {

	
	public static Node<Integer> takeInput() {
	  
	  Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	   
	   Node<Integer> head = null;
	   Node<Integer> tail = null;
	   
	   while(num != -1) {
		   
		   Node<Integer> input = new Node<>(num);
	   
	   if(head == null) {
		   
		   head = input;
		   tail = input;
	   }
	   else {
		   
		   tail.next = input;
		   
		   tail = tail.next;
	   
	   }
	       num = sc.nextInt();
	   }
	
	      return head;
	
    }

	
	 public static void print( Node<Integer> head ) {
    	   
    	   while( head != null ) {
    		   
    		  System.out.print(head.data + " ");
    		  
    		  head = head.next;
    	   }
    	   
    	   
       }

}
