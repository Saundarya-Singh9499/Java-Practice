package Queues;

import LinkedList1.Node;

public class QueuesUsingLinkedList<T> {


  private Node<T> front;
  
  private Node<T> rear;
  
  private int size;
  
  public QueuesUsingLinkedList() {
	  
	  front = null;
	  
	  rear = null;
	  
	  size = 0;
  }
  
    public void enqueue( T elem ) {
    	
    	Node<T> temp = new Node<>(elem);
    
    	
    	if(front == null ) {
    		
    		front = temp;
    		
    		rear = temp;
    	}
          
    	else {
    		
    		rear.next = temp;
    		
    		rear = rear.next;
    	}
           size+= 1;
    }   

      public int size() {
	  
	    return size;
  }

   public T front() throws QueuesEmptyException {
	   
	   if( front == null ) {
		   
		   QueuesEmptyException e  = new QueuesEmptyException();
		   
		   throw e;
	   
	   }
	   
	   return front.data;
   }

      public T dequeue() throws QueuesEmptyException {
    	  
        if( front == null ) {
        	
          QueuesEmptyException e = new QueuesEmptyException();
          
          throw e;
        
        }
    	  
    	  T contain = front.data;
    	  
    	  front = front.next;
    	  
    	  size-= 1;
    	  
    	  return contain;
    	  
    }

      public boolean isEmpty() {
    	  
    	  if( front == null ) {
    		  
               return true;
           
    	  }
      
    	  else {
    		  
    		  return false;
    	  }
      }
}
