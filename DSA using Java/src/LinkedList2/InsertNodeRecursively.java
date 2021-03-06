package LinkedList2;

import java.util.Scanner;

import LinkedList1.Node;

public class InsertNodeRecursively {

    public static Node<Integer> input() {
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	Node<Integer> head = null;
    	Node<Integer> tail = null;
    	
    	while( n!= -1) {
    		
    	  Node<Integer> contain = new Node<>(n);
    	  
    	  if( head == null) {
    		  
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
	
 public static Node<Integer> insertRecursive( Node<Integer> head , int insert , int index ) {
    	
    	Node<Integer> temp = head;
        
    	if( temp == null) {
       
         return temp;
      }
          
        if( index == 0 ) {
        	
        	 Node<Integer> newNode = new Node<>(insert);
             newNode.next = temp;
             
             return newNode;
        }
    	
    	Node<Integer> data = insertRecursive(temp.next , insert , index - 1 ); 	
        
        temp.next = data;
          
        return temp;
      } 
    
    public static void main(String[] args) {

    Node<Integer> head = input();
    
    Scanner sc = new Scanner(System.in);
    
    int index = sc.nextInt();
    int insert = sc.nextInt();
    
    Node<Integer> result = insertRecursive( head , insert , index );
    
    while( result != null ) {
    	
    	System.out.println(result.data);
   
        result = result.next;
    }
    
	}

}
