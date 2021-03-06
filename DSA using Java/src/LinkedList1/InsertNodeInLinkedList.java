package LinkedList1;

import java.util.Scanner;

public class InsertNodeInLinkedList {

    public static Node<Integer> input() {
    	
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
	
	public static Node<Integer> insertNode( Node<Integer> head , int index , int insert ) {
		
    int count = 0;
    
    Node<Integer> current = new Node<Integer>(insert);
    
    Node<Integer> temp = head;
    
    while(temp != null && count < (index - 1)) {
    	
    	 temp = temp.next;
    	 count+= 1;
    
    }	
   
      current.next = temp.next;
	  temp.next = current;
      
	  return head;
	
  }
    
    public static void main(String[] args) {
	
    Node<Integer> head = input();
    
    Scanner sc = new Scanner(System.in);
    int index = sc.nextInt();
    int insert = sc.nextInt();
    
    Node<Integer> result = insertNode(head, index, insert);

    while( result != null ) {
    	
    System.out.print(result.data + " ");
    
    result = result.next;
    
    }
  
  }

}
