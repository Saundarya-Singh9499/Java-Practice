package BST1;

import java.util.Scanner;

import BinaryTrees1.BinaryTreeNode;
import BinaryTrees1.NodesGreaterThanX;

public class SearchInBST1 extends NodesGreaterThanX{

	public static BinaryTreeNode<Integer> searchNumberInBST(BinaryTreeNode<Integer> root , int number) {
		
		 if(root == null) {
			 
			 return null;
		 }
	
	        if(number == root.data) {
	        	
	             return root;
	        
	         }
	   
	        else if(number < root.data){
	        	
	            return searchNumberInBST(root.left, number);
	        	
	        }
	
	        else {
	        	
	           return searchNumberInBST(root.right, number);
	        }
	
	}
	
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = takeInput(true, 0, true);
        
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
	    BinaryTreeNode<Integer> result = searchNumberInBST(root , number);
	    
	    System.out.println(result.data); 
	}

}
