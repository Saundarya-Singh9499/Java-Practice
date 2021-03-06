package BinaryTrees1;

import java.util.Scanner;

public class NumberOfLeafNodes {

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
	
	public static int leafNodes( BinaryTreeNode<Integer> root ) {
		
		if( root == null ) {
			
			return 0;
		}
	
		int count = 0;
		
		if(root.left == null && root.right == null) {
	    	   
	    	   count+= 1; 
	       }
		
		    int leftNodeLeaf = leafNodes(root.left);
	        int rightNodeLeaf = leafNodes(root.right);
	
	        return count + leftNodeLeaf + rightNodeLeaf;
 }

    public static void main(String[] args) {
		
        BinaryTreeNode<Integer> root = takeInput(true , 0 , false);
        
        int result = leafNodes(root);
        
        System.out.println(result);
	}

}
