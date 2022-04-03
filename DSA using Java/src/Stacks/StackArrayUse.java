package Stacks;

public class StackArrayUse {

	public static void main(String[] args) throws StackEmptyException {
		
     StackUsingArray stack = new StackUsingArray();
     
      stack.push(10);
      stack.push(20);
      stack.push(40);
      stack.push(80);
      stack.push(100);
      System.out.println(stack.size());
      System.out.println(stack.top());
      System.out.println(stack.pop());
      System.out.println(stack.top());
      System.out.println(stack.isEmpty());
     
      
      
	    
	}

}
