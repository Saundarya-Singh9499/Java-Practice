package LinkedList1;

import java.util.Scanner;

public class TakeInputInLinkedList2 {

	public static Node<Integer> input() {
		
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
	
	public static void print( Node<Integer> head) {
		
	     Node<Integer> temp = head;
	     
	     while(temp != null) {
	    	 
	         System.out.println(temp.data);
	         
	         temp = temp.next;
	     }
	}
	
	public static void main(String[] args) {
		
    Node<Integer> head = input();
    print(head);
	
	}

}
