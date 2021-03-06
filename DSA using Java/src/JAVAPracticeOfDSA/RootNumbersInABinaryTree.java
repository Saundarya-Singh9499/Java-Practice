package JAVAPracticeOfDSA;

import java.util.Scanner;

import BinaryTrees1.BinaryTreeNode;

public class RootNumbersInABinaryTree {

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
     
     if(rootData == -1) {
    	 
    	 return null;
     }

          BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
          
          BinaryTreeNode<Integer> leftChild = takeInput(false, rootData, true);
          
          BinaryTreeNode<Integer> rightChild = takeInput(false, rootData, false);
          
          root.left = leftChild;
          
          root.right = rightChild;
          
          return root;

  }
	
	
  public static void rootNumbers( BinaryTreeNode<Integer> root , int number ) {
	  
	  if(root == null) {
		  
		  return;
	  }
  
           number = (number * 10 + root.data);
           
           System.out.println(number);
            
           rootNumbers(root.left, number);
           rootNumbers(root.right, number);
  
  }

  public static void main(String[] args) {
		
     BinaryTreeNode<Integer> root = takeInput(true , 0 , true);
     
     rootNumbers( root , 0 );
	 
     }

}
