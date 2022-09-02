package BinaryTree2;

import java.util.Scanner;

import BinaryTrees1.BinaryTreeNode;

public class PathSumRootToLeaf extends DiameterOfTheTree {

	public static void rootToLeafSum(BinaryTreeNode<Integer> root , int k , int num) {
		 
		if(root == null) {
			
		    return;
		}
		
	       num = num + root.data;
	       
	       BinaryTreeNode<Integer> cont = new BinaryTreeNode<Integer>(num);
	            
	            
	       if(root.right == null && root.left == null) {
   	    	
   	    	if( num == k ) {
   	    		
   	    	    sumRootToLeaf(cont);
   	    	 
   	    	   }
   	    
	         return;
	     }
	            
	            rootToLeafSum(root.left, k , num);
	            
	            rootToLeafSum(root.right, k , num);
	            
	         
	}
	
	public static void sumRootToLeaf(BinaryTreeNode<Integer> cont) {
		
		      if(cont == null) {
		    	  
		    	  return;
		      }
		
	               System.out.println(cont.data + " ");
		      
		           sumRootToLeaf(cont.left);
	               
	               sumRootToLeaf(cont.right);
	}

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = takeInput(true, 0, true);
        
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		rootToLeafSum(root, k , 0);
	}

}
