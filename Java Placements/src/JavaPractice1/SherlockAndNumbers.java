package JavaPractice1;

import java.util.LinkedList;
import java.util.List;

public class SherlockAndNumbers {

	public static int sherlockNumbers(int arr[] , int n , int p) {
		
		 int max = Math.max(n, p);
		 
		 List<Integer> l = new LinkedList<>();
		 
		 for(int i = 1 ; i <= max ; i++) {
			 
		    l.add(i);
		 
		 }
		 
		 for(int j = 0 ; j < l.size() ; j++) {
			 
			 if(arr[0] == 1 && j == arr.length - 1) {
				 
				 l.remove(j);
				 
				 break;
			 }
			 
			 if(l.get(j) == arr[j]) {
				  
				  if(j == arr.length - 1) {
					  
					  break;
				  }
				  
				    l.remove(j);
			  }
		 }
		 
		      if(p < l.size()) {
		    	  
		    	  return l.get(p-1);
		      }
		      
		      else {
		    	  
		    	  return -1;
		      }
	}
	
	public static void main(String[] args) {
		
	    int arr[] = {1};
		
		int n = 4;
		
		int p = 2;
		
		int result = sherlockNumbers(arr, n, p);
		
		System.out.println(result);
    
	
	}

}
