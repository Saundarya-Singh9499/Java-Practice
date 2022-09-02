package Arrays;

public class Arrays2 {

	public static void main(String[] args) {
		
		int arr1[] = {1 , 3 , 5 , 7};
		
		 int a1 = arr1.length;
		int arr2[] = {1 ,2 , 3 ,4 ,5};
		
		 int a2 = arr2.length;
		 
		 int merging[] = new int[a1+a2];
		 
		 int i = 0 , j = 0 , k = 0 ,x;
		 
		 System.out.println("Arr 1 :");
		 for( x = 0 ; x < a1 ; x++) {
			 
			 System.out.println(arr1[x] + " ");
			 System.out.println("\nArr 2 : ");
		 }

	   for(x = 0 ; x < a2 ; x++) {
		   System.out.println(arr2[x] + " ");
	   }
	   
	   while( i < a1 && j < a2) {
		   
		   if(arr1[i] < arr2[j]) {
			   
		     merging[k++] = arr1[i++];
		   }
		   else {
			    merging[k++] = arr2[j++];
		   }
	   }
	     System.out.println("Output is ");    
	   while(i < a1) {
	    	   
	    	   merging[k++] = arr1[i++];
	    	   
	    	   
	    	   while( j< a2) {
	    		   
	    		   merging[k++] = arr2[j++];
	    		   
	    		   System.out.println("Arr after merging");
	    	   }
	       }
	             for(x = 0 ; x < a1 + a2 ; x++) {
	            	 
	            	 System.out.println( merging[x] + " ");
	             }
	}

}
