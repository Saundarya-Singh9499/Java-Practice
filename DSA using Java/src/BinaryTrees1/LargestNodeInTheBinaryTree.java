package BinaryTrees1;

import java.util.Scanner;

public class LargestNodeInTheBinaryTree {

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
        
        while( rootData == -1 ) {
        	
        	return null;
        }

             BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
               
            BinaryTreeNode<Integer> leftChild = takeInput(false, rootData, true);
  
             BinaryTreeNode<Integer> rightChild = takeInput(false, rootData, false);
             
             root.left = leftChild;
             
             root.right = rightChild;
             
             return root;
            
   }       
	 
    public static int largestNode( BinaryTreeNode<Integer> root ) {
    	
    	if( root == null ) {
    		
    		return -1;
    	}
    
           int leftNode = largestNode(root.left);
           int rightNode = largestNode(root.right);
           
        return Math.max(root.data, Math.max(leftNode , rightNode));
        
        
    }
    
    public static void main(String[] args) {
		
    BinaryTreeNode<Integer> root = takeInput(true , 0 , true);
    
    int result = largestNode(root);
    
    System.out.println(result);
	
    }

}
