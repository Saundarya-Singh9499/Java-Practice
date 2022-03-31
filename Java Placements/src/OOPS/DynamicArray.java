package OOPS;

public class DynamicArray {

 private int arr[];
 
private int nextIndex;
 
public DynamicArray() {
	arr = new int[6];
    nextIndex = 0;
}

  public int size() {
	  
	  return nextIndex;
  }

     public int get(int i) {
    	 
    	 if(i >= nextIndex) {
    		 return -1;
    	 }
    	 
     return arr[i];
     }

      public boolean isEmpty() {
    	  
    	  return nextIndex == 0;
       }
      
      public int set( int i , int n) {
    	  
    	  if(i >= nextIndex) {
    		  
    		  return -1;
    	  }
    	 return arr[i] = n;
    	  
     }
        
        public void add( int num ) {
        	
        if(nextIndex == arr.length) {
        	
        	doubleCapacity();
        }
        	
        	arr[nextIndex] = num;
            nextIndex++;
        
        }

     public void doubleCapacity() {
    	
    	int temp[] = arr;
    	arr = new int[2 * temp.length];
    	
    	for(int i = 0 ; i < temp.length ; i++) {
    		
    		arr[i] = temp[i];
    	}
    }
    public int length() {
    	
     int l = arr.length;
     return l;
    
 }

 

	
}

