package Stacks;

import LinkedList1.Node;

public class StackUsingLinkedList<T> {

    private Node<T> head;
    
    private int size;
    
    private Node<T> temp;
    
  public StackUsingLinkedList() {
	   
	   head = null;
	   
	   size = 0;
   }
  
    public void push(T elem) {
    	
       head = new Node<>(elem);
        
    	if( head == null ) {
    	 
    	 head = temp;
    	 
      }
     
     else {
    	 
    	 head.next = head;
    	 
    	 head = head.next;
     }
     
     size+= 1;
    
    }
      
   public int size() {
	  
	  return size;
  
  }
      
    public boolean isEmpty() {
    	
    	if( head == null ) {
    		
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }
  
      public T top() throws StackEmptyException {
    	  
      if( head == null ) {
    	  
    	  StackEmptyException e = new StackEmptyException();
    	  
    	  throw e;
      }
    	  
       return head.data;	  
      
      }

    public T pop() throws StackEmptyException {
    	
    	 if( head == null ) {
       	  
       	  StackEmptyException e = new StackEmptyException();
       	  
       	  throw e;
         
    	 }
             T temp = head.data;
             
             head = head.next;
             
             size-= 1;
             
             return temp;
    }
}
