package LinkedList2;
import java.util.Scanner;

import LinkedList1.Node;

public class PrintTheNodeReccursively {

    public static Node<Integer> input(){
    	
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		while(n != -1) {
			
			Node<Integer> contain = new Node<>(n);
			
			if(head == null) {
				
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
	
	public static void recursive( Node<Integer> head ) {
		
		if(head == null) {
			
			return;
		}
		
		        System.out.print(head.data + " "); 
	            
		        recursive(head.next);
	            
	}
    
    public static void main(String[] args) {
		
	Node<Integer> head = input();
	recursive(head);	
		

	}

}
