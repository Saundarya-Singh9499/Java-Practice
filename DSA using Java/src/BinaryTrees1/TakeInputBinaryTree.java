package BinaryTrees1;

import java.util.Scanner;

public class TakeInputBinaryTree {

	public static BinaryTreeNode<Integer> takeInput(){
		
		System.out.println("Enter the root Data");
		
		Scanner sc = new Scanner(System.in);
		
		int rootData = sc.nextInt();
		
		if( rootData == -1) {
			
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		
		BinaryTreeNode<Integer> leftChild = takeInput();
		
		BinaryTreeNode<Integer> rightChild = takeInput();
		
		root.left = leftChild;
		
		root.right = rightChild;
		
		return root;
	}
	
	public static void printTreeNodes( BinaryTreeNode<Integer> root ) {
		
		if( root == null ) {
			
			return;
		}
	
	       System.out.print(root.data + ":");
	       
	       if( root.left != null) {
	    	   
	    	   System.out.print("L" + root.left.data +",");
	       }
	       
	       if( root.right != null ) {
	    	   
	    	   System.out.print("R" + root.right.data);
	       }
	       
	       System.out.println();
	       
	       printTreeNodes(root.left);
	       printTreeNodes(root.right);
	       
	}
	
	public static void main(String[] args) {
		
     BinaryTreeNode<Integer> root = takeInput();
     
     printTreeNodes(root);
	 
	}

}
