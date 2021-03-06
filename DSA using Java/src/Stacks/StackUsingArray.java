package Stacks;              

public class StackUsingArray {
	
	private int data[];
	private int topIndex;

	public StackUsingArray() {
		
		
		data = new int[10];
		topIndex = -1;
	}

    public void push(int elem)  {
    	
    	if( topIndex == data.length - 1 ) {
    		
    	 doubleCapacity();	
    		
    	}
    	
    	topIndex+= 1;
    	
    	data[topIndex] = elem;
    	
    	
    }
     
    public void doubleCapacity() {
    	
        int temp[] = data;
        
        data = new int[ 2 * temp.length ];
        
        for(int i = 1 ; i < temp.length ; i++) {
        	
            data[i] = temp[i];
        }
    }
    
    public int size() {
        	
         return topIndex + 1;
        
        }
     
     public int top() throws StackEmptyException {
    	 
     	 if( topIndex == -1 ) {
     		 
     		 StackEmptyException e = new StackEmptyException();
     		 
     		 throw e;
     	 }
    	 
    	 return data[topIndex];
     
     }
        
    public int pop() throws StackEmptyException {
    	
    	if( topIndex == -1 ) {
    		 
    		 StackEmptyException e = new StackEmptyException();
    		 
    		 throw e;
    	 }
    	
    	topIndex--; 
    	
    	return data[topIndex + 1];
    
    }
   
  public boolean isEmpty() {
	  
	  if(topIndex == -1) {
		  
		  return true;
	  }
	  else {
		  
		  return false;
	  }
  }
}
