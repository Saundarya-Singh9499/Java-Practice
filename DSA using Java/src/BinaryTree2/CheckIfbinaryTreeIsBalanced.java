package BinaryTree2;

import java.util.Scanner;

import BinaryTrees1.BinaryTreeNode;

public class CheckIfbinaryTreeIsBalanced {

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
        
        if(rootData  == -1) {
        	
           return null;
        }
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        
        BinaryTreeNode<Integer> leftChild = takeInput(false, rootData, true);
        
        BinaryTreeNode<Integer> rightChild = takeInput(false, rootData, false);
        
        leftChild = root.left;
        
        rightChild = root.right;
        
        return root;

   }
	
   public static int hieght(BinaryTreeNode<Integer> root ) {
	   
	    if(root == null) {
	    	
	    	return 0;
	    }
   
           int leftChild = hieght(root.left);
           
           int rightChild = hieght(root.right);
           
           return 1 + Math.max(leftChild , rightChild);
   }
   
   public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			
			return true;
		}
	
	  int leftHieght = hieght(root.left);
	  
	  int rightHieght = hieght(root.right);
	  
	  if( Math.abs(leftHieght - rightHieght) > 1) {
		  
		  return false;
	  }
	
	    boolean isLeftChildBalanced = isBalanced(root.left);
	    
	    boolean isRightChildBalanced = isBalanced(root.right);
	    
	    return isLeftChildBalanced && isRightChildBalanced;
	
	
	}
    
    public static void main(String[] args) {
		
    BinaryTreeNode<Integer> root = takeInput(true , 0 , true);
    
    boolean result = isBalanced(root);
    
    System.out.println(result);
	
    }

}
