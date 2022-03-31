package OOPS;

public class PolynomialClass {

   
	DynamicArray d;
     
	private int cofficient;
	private int degree;
	
	public PolynomialClass() {

		d=new DynamicArray();
    
    for(int i = 0 ; i < d.length() ; i++) {
    	
    	d.add(0);
    
     }
 }

     public void setP( int degree , int cofficient ) {
    	 
    	if(degree >= d.size()) {
    		
    		for (int i = d.size() ; i <= degree ; i++) {
				d.add(0);
			}
    	}
    	
         this.d.set(degree, cofficient);
    	 
      }
     
     public void print() {                                   
 
       for (int i = 0 ; i < d.size() ; i++) {
		if(this.d.get(i)!=0) {
			System.out.print(this.d.get(i)+"x^"+i + " + ");
	
     }
	                         
       }        
         System.out.println(); 
     }
      
     public static PolynomialClass addP(PolynomialClass p1 , PolynomialClass p2) {
    	   
    	 PolynomialClass p3 = new PolynomialClass();  
    	 for (int i = 0 ; i < p1.d.size() ; i++) {
    		   
            int add = p1.d.get(i) + p2.d.get(i);
            
            p3.d.set(i, add);
            
   }
    	 
      return p3;
     }
       
        
     public static PolynomialClass multP(PolynomialClass p1 , PolynomialClass p2) {
        
    	 PolynomialClass p4 = new PolynomialClass();
    		
    	 for (int i = 0 ; i < p1.d.size() ; i++) {
        		if(p1.d.get(i)!=0) {
		      for (int j = 0 ; j < p2.d.size() ; j++) {
		    	 if(p2.d.get(j)!=0) {
			     int mult = p1.d.get(i)*p2.d.get(j);
			    
			     p4.setP(i+j, mult + p4.d.get(i + j));
			     
			     
			    
		    	 } 
		    }
	   } 	
    	 }
            return p4;   
     }
     


}
