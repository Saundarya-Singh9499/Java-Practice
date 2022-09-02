package Array;

public class TappingWaterProblemImproved {

	public static int tappingWaterProblemImproved(int arr[]) {
		
		 int n = arr.length;
		 
		 int left[] = new int[n];
		 
		 int right[] = new int[n];
		 
		 int answer = 0;
		 
		 left[0] = arr[0];
		 
		 for(int i = 1 ; i < n ; i++) {
			 
			 left[i] = Math.max(left[i-1], arr[i]);
		 }
		 
		 right[n-1] = arr[n-1];
		 
		 for(int j = n - 2 ; j >= 0 ; j--) {
			 
			   right[j] = Math.max(right[j+1], arr[j]);
		 }
		 
		   for(int k = 0 ; k < n ; k++) {
			   
			    answer+= (Math.min(left[k], right[k]) - arr[k]);
	      }
	
	         return answer;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		
		int result = tappingWaterProblemImproved(arr);
		
		System.out.println(result);

	}

}
