package LinkedList1;

import java.util.Scanner;

public class PalindromeLinkedList {

    public static Node<Integer> input(){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	Node<Integer> head = null;
    	
    	Node<Integer> tail = null;
    
        while( n != -1) {
        	
        	Node<Integer> current = new Node<>(n);
        
        if(head == null) {
        	
        	head = current;
        	tail = current;
        }
        
          tail.next = current;
          
          tail = tail.next;
       
          n = sc.nextInt();
        
        }
            return head;
    }
	
	public static void palindrome( Node<Integer> head ){
		
		Node<Integer> contain = head;  
		while( contain != null) {
				
		        
			    System.out.println( contain.data );
		        contain = contain.next;
		        
		        
		  }  
		
		Node<Integer> temp = head;
		
		if(temp == null) {
		
		return; 
    
    }
	    
		palindrome(temp.next);
		
		System.out.println(temp.data);
		
	
	}
    
    
    public static void main(String[] args) {
	
    Node<Integer> head = input(); 
    
    palindrome(head); 
    
    
   
    
	}

}
