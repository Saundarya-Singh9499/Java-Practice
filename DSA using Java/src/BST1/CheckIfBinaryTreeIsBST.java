package BST1;

import BinaryTrees1.BinaryTreeNode;
import BinaryTrees1.NodesGreaterThanX;

public class CheckIfBinaryTreeIsBST extends NodesGreaterThanX{

	public static int minimum(BinaryTreeNode<Integer> root) {
		
          if(root == null) {
        	  
        	  return Integer.MAX_VALUE;
          }
	
	         int leftMin = minimum(root.left);
	         
	         int rightMin = minimum(root.right);
	         
	         return Math.min(root.data, Math.min(leftMin, rightMin));
	  
	}

	public static int maximum(BinaryTreeNode<Integer> root) {
		
		 if(root == null) {
       	  
       	  return Integer.MIN_VALUE;
         }
	
	         int leftMax = maximum(root.left);
	         
	         int rightMax = maximum(root.right);
	         
	         return Math.max(root.data, Math.max(leftMax, rightMax));
	
	}
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		
		  if(root == null) {
			  
			  return true;
		  }
	
	         int leftMax = maximum(root.left);
	         
	         if(leftMax >= root.data) {
	        	 
	        	 return false;
	         }
	         
	        int rightMin = minimum(root.right);
	        
	        if(rightMin < root.data) {
	        	
	        	return false;
	        }
	
	     boolean isleftBST = isBST(root.left);
	     
	     boolean isRightBST = isBST(root.right);
	     
	     return isleftBST && isRightBST;
	
	}
	
	

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = takeInput(true, 0, true);
		
		boolean result = isBST(root);
		
		System.out.println(result);
		
		

	}

}
