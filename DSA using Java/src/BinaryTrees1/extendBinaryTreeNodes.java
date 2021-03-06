package BinaryTrees1;

public class extendBinaryTreeNodes {

	public static void printDetailedExtendedTree( BinaryTreeNode<Integer> root ) {
		
		if( root == null ) {
			
			return;
		}
	
	    System.out.print(root.data + ":");
	
	    if(root.left != null) {
	    	
	    	System.out.print("L" + root.left.data + ",");
	    }
	    
	    if(root.right != null) {
	    	
	    	System.out.print("R" + root.right.data);
	    }
	    
	    System.out.println();
	    
	    printDetailedExtendedTree(root.left);
	    printDetailedExtendedTree(root.right);
	
	}
	
	public static void main(String[] args) {
		
	  BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
	  
	  BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
	  
	  BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
	  
	  root.left = rootLeft;
	  
	  root.right = rootRight;
	  
	  BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(4);
	  
	  BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(5);
	  
	  BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(6);
	  
	  BinaryTreeNode<Integer> node7 = new BinaryTreeNode<>(7);

	  BinaryTreeNode<Integer> node8 = new BinaryTreeNode<>(8);
	  
	  BinaryTreeNode<Integer> node9 = new BinaryTreeNode<>(9);
	  
	  BinaryTreeNode<Integer> node10 = new BinaryTreeNode<>(10);
	  
	  BinaryTreeNode<Integer> node11 = new BinaryTreeNode<>(11);
	  
	  BinaryTreeNode<Integer> node12 = new BinaryTreeNode<>(12);
 	
	
      rootLeft.left = node4;
      
      node4.right = node6;
      
      rootLeft.right = node5;
      
      node5.left = node7;
      
      rootRight.left = node8;
      
      node8.right = node10;
      
      node8.left = node9;
      
      node10.left = node12;
      
      node9.right = node11;
      
      printDetailedExtendedTree(root);
	
	
	}

}
