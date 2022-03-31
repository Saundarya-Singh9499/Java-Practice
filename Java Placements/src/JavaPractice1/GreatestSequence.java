package JavaPractice1;

public class GreatestSequence {

	public static void grt(int n , int k) {
		
		for(int i =1 ; i< k ; i++ ) {
		 
			int j =1;
			while( n / j >0) {
				int result = (n / (i * 10 )) * i + (n % i);
				
				i*=10;
				System.out.println(result);
			
			}
			
				}    
	}
	

	public static void main(String[] args) {
		int n = 9526;
		int k = 4;
	grt( n , k);
	


	}

}
