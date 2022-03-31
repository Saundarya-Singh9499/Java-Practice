package LinkedList1;

import java.util.Scanner;

public class TakeInputInLinkedList1 {

	public static Node<Integer> input() {
		
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     
     Node<Integer> head = null;
     
     while(num != -1) {
    	 
    	 Node<Integer> input = new Node<Integer>(num);
     
     
    	 if(head == null) {
 	    	
 	    	head = input;
    	 }
 	    	else {
 	    		
                Node<Integer> tail = head; 	    		
 	    	
 	            while(tail.next != null) {
 	            	
 	               tail = tail.next;
 	            }
 	     
 	              tail.next = input;
 	    	 } 
    	 
    	          num = sc.nextInt();	   
     }
	    
            
                 
            return head;       
	     
       }
	
    public static void print(Node<Integer> head) {
    	
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
