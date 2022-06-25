package BinaryTrees1;

import java.util.Scanner;

public class PrintNodeAtDepthK {

public static BinaryTreeNode<Integer> takeInput(boolean isRoot , int parentData , boolean isLeft){
    	
         if(isRoot) {
        	 
        	 System.out.println("Enter the Root Data");
         }
    
         else if(isLeft) {
        	 
        	 System.out.println("Enter the Left Child of " + parentData);
         }
  
         else {
        	 
        	 System.out.println("Enter the Right Child of " + parentData);
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
	
	public static void noteAtDepthK( BinaryTreeNode<Integer> root , int K ) {
		
		if( root == null ) {
			
			return;
		}
	
	        if( K == 0 ) {
	        	
	        	
	        	System.out.println( root.data );
	        
	            return;
	        }
	
	             noteAtDepthK(root.left , K - 1);
	             noteAtDepthK(root.right , K - 1);
	}

    public static void main(String[] args) {
	
    BinaryTreeNode<Integer> root = takeInput(true , 0 , true);
    
    Scanner sc = new Scanner(System.in);
    
    int K = sc.nextInt();
    
    noteAtDepthK(root , K);

	}

}
