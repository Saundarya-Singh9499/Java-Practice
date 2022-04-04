package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

	public static int[] input() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			
			System.out.println("Enter the " + i + " th Element");
			arr[i] = sc.nextInt();
		}
	           return arr;	
	
	}
	
  public static void reverseStack( Stack<Integer> st , Stack<Integer> helper ) {
    	
      if( st.size() <= 1 ) {
    	  
    	  return;
      }
	  
	  int firstHead = st.pop();
      
    reverseStack(st, helper);
      
      while(!st.isEmpty()) {
    	  
    	  int top = st.pop();
    	  
    	   helper.push(top);
    	   System.out.println(top);
      }
        int temp =  helper.push(firstHead);
        
        System.out.println(temp);
         
         
  }
	
	public static void main(String[] args)  {
		
    Stack<Integer> st = new Stack<>();
    
    Stack<Integer> helper = new Stack<>();
    
    int arr[] = input();
    
    for(int elem : arr) {
    	
    	st.push(elem);
    }
    
      reverseStack(st, helper);
  }

}
