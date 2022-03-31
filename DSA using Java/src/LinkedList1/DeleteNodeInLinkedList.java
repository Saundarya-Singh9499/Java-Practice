package LinkedList1;

import java.util.Scanner;

public class DeleteNodeInLinkedList {

	public static Node<Integer> input(){
		
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    Node<Integer> head = null;
	    Node<Integer> tail = null;
	    
	    while(n != -1) {
	    	
	    	Node<Integer> input = new Node<>(n);
	    	
	    	if(head == null) {
	    		
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
	
	public static Node<Integer> deleteNode( Node<Integer> head , int index ){
		
	   int count = 0;
	  
	   Node<Integer> temp = head;
	   
	   while( count < (index -1)) {
		   
		   temp = temp.next;
		   count+= 1;
	   }
	     
	      temp.next = temp.next.next; 
	      
	      return head;
	}     
	
	public static void main(String[] args) {
		
    Node<Integer> head = input();
    
    Scanner sc = new Scanner(System.in);
    int index = sc.nextInt();
    
    Node<Integer> result = deleteNode(head, index);
    
    while(result != null) {
    	
    	System.out.println(result.data);
    	
    	result = result.next;
    }
	}

}
