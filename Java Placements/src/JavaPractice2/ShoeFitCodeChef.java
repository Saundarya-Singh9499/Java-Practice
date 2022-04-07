package JavaPractice2;

import TakeInputandPrint1.ArrayTakeInput;

  public class ShoeFitCodeChef extends ArrayTakeInput{

	
	public static int shoesFit( int arr[] ) {
		
		for(int i = 1 ; i < arr.length ; i++) {
			
		    if( arr[i] == 0 && arr[i -1] == 0) {
		    	
		    	return 0;
		    }
		    else if( arr[i] == 0 && arr[i -1] == 1 ) {
		    	  
		    	  return 1;
		      }
		
		    else if( arr[i] == 1 && arr[i-1] == 0 ) {
		    	
		    	return 1;
		    }
		    
		}
	       return -1;
	}
	
	 public static void main(String[] args) {
     		
      int arr[] = takeInput();
      
      int result = shoesFit(arr);
      
      System.out.println(result);
	 
	 }

}
