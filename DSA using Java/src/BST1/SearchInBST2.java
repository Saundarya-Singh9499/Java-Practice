package BST1;

import java.util.Scanner;

import com.sun.source.tree.BinaryTree;

import BinaryTrees1.BinaryTreeNode;
import BinaryTrees1.NodesGreaterThanX;

public class SearchInBST2 extends NodesGreaterThanX{

	public static boolean seachNodeInBinaryTree(BinaryTreeNode<Integer> root , int number) {
		
		if(root == null) {
			
			return false;
		}
		
	       if(number == root.data) {
	    	   
	    	   return true;
	       }
	
	       else if(number < root.data) {
	    	   
	    	     return seachNodeInBinaryTree(root.left, number);
	       }
	 
	     return seachNodeInBinaryTree(root.right, number);
	}
	
	public static void main(String[] args) {
		
          BinaryTreeNode<Integer> root = takeInput(true, 0, true);
          
          Scanner sc = new Scanner(System.in);
          
          int number = sc.nextInt();
          
          boolean result = seachNodeInBinaryTree(root, number);
          
          System.out.println(result);
	}

}
