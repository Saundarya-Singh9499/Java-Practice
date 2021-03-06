package BinaryTrees1;

import java.util.Scanner;

public class IsNodePresent {

public static BinaryTreeNode<Integer> takeInput(boolean isRoot , int parentData , boolean isLeft){
		
	if(isRoot) {
		
		System.out.println("Enter the Root Data");
	}
	
	 else if(isLeft) {
		 
		 System.out.println("Enter the Left Child " + parentData);
	 }

	  else {
		  
		  System.out.println("Enter the Right Child " + parentData);
	  }

    Scanner sc = new Scanner(System.in);
    
    int rootData = sc.nextInt();
    
    if( rootData == -1 ) {
    	
       return null;
    }

       BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
       
       BinaryTreeNode<Integer> leftChild = takeInput(false, rootData, true);
       
       BinaryTreeNode<Integer> rightChild = takeInput(false, rootData, false);
       
       root.left = leftChild;
       
       root.right = rightChild;
       
       return root;

} 
	
	public static boolean isNodePresent( BinaryTreeNode<Integer> root , int Node ) {
		
		if( root == null ) {
			
			return false;
		}
	
		if( Node == root.data ) {
			
			return true;
		}
	    
    return (isNodePresent(root.left , Node) ||  isNodePresent(root.right , Node));
	    
	    
	}
    
  public static void main(String[] args) {
		
    BinaryTreeNode<Integer> root = takeInput(true , 0 , true);
    
    Scanner sc = new Scanner(System.in);
    
    int Node = sc.nextInt();
    
    boolean result = isNodePresent(root , Node);
    
    System.out.println(result);
    
	
  } 

}
