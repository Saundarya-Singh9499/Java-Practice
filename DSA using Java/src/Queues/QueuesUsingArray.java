package Queues;

public class QueuesUsingArray {
	
    private int data[];
    
    private int front;
    
    private int rear;
    
    public QueuesUsingArray() {
    	
    	data = new int[10];
        
    	front = 0;
    	
    	rear = -1;
    }   

     public void enqueue( int elem ) {
    	 
    	 if( rear == data.length - 1 ) {
    		 
    		 doubleCapacity();
    	 }
    	 
    	 rear+= 1;
    	 
    	 data[front] = elem;
    	 
    	 data[rear] = elem;
    	 
     }   

     public void doubleCapacity() {
    	 
    	  int temp[] = data;
    	  
    	  data = new int[ 2 * temp.length ];
    	  
    	  for(int i = 1 ; i < temp.length ; i++) {
    		  
    		  data[i] = temp[i];
    	  }
     }
     
     public int size() {
    	 
    	 return rear + 1;
     }
     
     public int dequeue() throws QueuesEmptyException {
    	
    	 if( rear == -1 ) {
    		 
    		 QueuesEmptyException e = new QueuesEmptyException();
    		 
    		 throw e;
    	 }
    	 
    	 front+= 1;
    	 
    	 rear-= 1;
    	
    	return data[front];
    	
     }

   public int front() {
	   
	   return data[front];
   }

     public boolean isEmpty() {
    	 
    	 if( rear == -1 ) {
    		 
    		 return true;
    	 }
     
    	 else {
    		 
    		  return false; 
    	 }  
     }
}
