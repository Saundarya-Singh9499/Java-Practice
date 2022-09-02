package BinaryTree2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import BinaryTrees1.BinaryTreeNode;

public class BinaryTreeTakeInputLevelwise {

	public static BinaryTreeNode<Integer> takeInputLevelwise(){
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Root Data ");
		 
		 int rootData = sc.nextInt();
	
	     if(rootData == -1) {
	    	 
	    	 return null;
	     }
	
  BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
	  
  Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
	
	  while(!pendingChildren.isEmpty()) {
		  
		  BinaryTreeNode<Integer> front = new BinaryTreeNode<Integer>(rootData);
		  
		  System.out.println("Enter the left Child of " + front.data);
		  
		  int left = sc.nextInt();
		  
		  if(left != -1) {
			  
			   BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
			   
			   front.left = leftChild;
			   
			   pendingChildren.add(leftChild);
		  }
		  
        System.out.println("Enter the right Child of " + front.data);
		  
		  int right = sc.nextInt();
		  
		  if(right != -1) {
			  
			   BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
			   
			   front.left = rightChild;
			   
			   pendingChildren.add(rightChild);  
	  
	  }
	
	        
	 }
	
	      return root;
	}
	
	public static void main(String[] args) {
		
      BinaryTreeNode<Integer> root = takeInputLevelwise();
	
	}

}
