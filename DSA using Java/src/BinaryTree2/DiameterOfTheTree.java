package BinaryTree2;

import java.util.Scanner;

import BinaryTrees1.BinaryTreeNode;

public class DiameterOfTheTree {

	public static BinaryTreeNode<Integer> takeInput(boolean isRoot , int parentData , boolean isLeft){
		
	   if(isRoot) {
		   
		   System.out.println("Enter the rootData");
	   }
		
	   else if(isLeft) {
	    	
	    	System.out.println("Enter the Left Child of " + parentData);
	    }
	
	   else {
		   
		   System.out.println("Enter the Right Child of " + parentData);
	   }
	
	 Scanner sc = new Scanner(System.in);
	 
	 int rootData = sc.nextInt();
	 
	 if(rootData == -1) {
		 
		 return null;
	 }
	
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        
        
        BinaryTreeNode<Integer> leftChild = takeInput(false, rootData, true);
        
        BinaryTreeNode<Integer> rightChild = takeInput(false, rootData, false);
        
        leftChild = root.left;
        
        rightChild = root.right;
        
        return root;
	
	}   
	
    public static int hieght(BinaryTreeNode<Integer> root) {
    	
    	if(root == null) {
    		
    		return 0;
    	}
    
      int leftHieght = hieght(root.left);
      
      int rightHieght = hieght(root.right);
      
      return 1 + Math.max(leftHieght, rightHieght);
    }
	
	public static int Binary(BinaryTreeNode<Integer> root) {
    	
    	  if(root == null) {
    		  
    		  return 0;
    	  
    	  }
    
        int option1 = hieght(root.left) + hieght(root.right);
        
        int option2 = Binary(root.left);
        
        int option3 = Binary(root.right);
        
        return Math.max(option1 , Math.max(option2 ,option3));
    
    }
	
	public static void main(String[] args) {
		
       BinaryTreeNode<Integer> root = takeInput(true, 0, true);
       
       int result = Binary(root);
       
       System.out.println(result);
	}

}
