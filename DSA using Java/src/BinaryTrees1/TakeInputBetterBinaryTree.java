package BinaryTrees1;

import java.util.Scanner;

public class TakeInputBetterBinaryTree {

public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot , int parentData , boolean isLeft){
		
	if( isRoot ) {
		
		System.out.println("Enter the Root Data");
	}
	
	 else if( isLeft ) {
		 
		 System.out.println("Enter the Left Child of " + parentData);
	 }
  
	 else {
		 
		 System.out.println("Enter the Right Child of " + parentData);
	 }

        Scanner sc = new Scanner(System.in);
        
        int rootData = sc.nextInt();
        
        if( rootData == -1) {
        	
        	return null;
        }

      BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
      
      BinaryTreeNode<Integer> leftChild = takeInputBetter(false, rootData , true);
      
      BinaryTreeNode<Integer> rightChild = takeInputBetter(false , rootData , false);
      
      root.left = leftChild;
      
      root.right = rightChild;
      
      return root; 
    
}

    public static void printTree( BinaryTreeNode<Integer> root ) {
    	
      if( root == null ) {
    	  
    	  return;
      }
    
          System.out.print(root.data + ":");
          
          if(root.left != null) {
        	  
        	  System.out.print("L" + root.left.data + ",");
          }
          
          if(root.right != null ) {
        	  
        	  System.out.print("R" + root.right.data);
          }
          
          System.out.println();
          
          printTree(root.left);
          printTree(root.right);
          
    
    }
    
    public static void main(String[] args) {
		 
    BinaryTreeNode<Integer> root = takeInputBetter(true , 0 , true);
    
    printTree(root);
	
    }

}
