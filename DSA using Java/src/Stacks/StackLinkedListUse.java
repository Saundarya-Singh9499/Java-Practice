package Stacks;

public class StackLinkedListUse {

	public static void main(String[] args) throws StackEmptyException {
		
    StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
    
    stack.push(10);	
    stack.push(20);
    stack.push(60);
    stack.push(100);
   
    System.out.println(stack.size());
    System.out.println(stack.top());
    System.out.println(stack.isEmpty());
    System.out.println(stack.pop());
    
    
	
	}

}
