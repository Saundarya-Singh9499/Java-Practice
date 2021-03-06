package Queues;

import java.util.LinkedList;
import java.util.Queue;

import TakeInputandPrint2.ArrayTakeInput;

public class ReverseQueue extends ArrayTakeInput {

	public static void reverseQueue( Queue<Integer> q , Queue<Integer> helper ) {
		
		if(q.size() <= 1) {
			
			return;
		}
		
		
		int front = q.poll();
		
		reverseQueue(q , helper);
		
	    q.add(front);
	    
	    while(!q.isEmpty()) {
	    	
	    	System.out.println(q.poll());
	    }
		
		
	        
	        
	}
	
	public static void main(String[] args) {
		
    Queue<Integer> q = new LinkedList<>();
    
    Queue<Integer> helper = new LinkedList<>();
    
    int arr[] = takeInput();
    
    for(int elem : arr) {
    	
    	q.add(elem);
    }
	
	  reverseQueue(q , helper );
	}

}
