package BST1;

import java.util.Scanner;

import BinaryTrees1.BinaryTreeNode;
import BinaryTrees1.NodesGreaterThanX;

public class ElementsBetweenK1AndK2 extends NodesGreaterThanX{

    public static void printBetweenK1andK2(BinaryTreeNode<Integer> root , int k1 , int k2 ) {
    	
    	 if(root == null) {
    		 
    		 return;
    	 }
    
            if( root.data < k1 ) {
            	
            	 printBetweenK1andK2(root.right, k1, k2);
            }
    
            else if( root.data > k2 ) {
            	
            	printBetweenK1andK2(root.left, k1, k2);
            }
    
            else {
            	
            	System.out.println(root.data);
            
                printBetweenK1andK2(root.left, k1, k2);
                
                printBetweenK1andK2(root.right, k1, k2);
            
            }
            
       }
	
	public static void main(String[] args) {
		
      BinaryTreeNode<Integer> root = takeInput(true, 0, true);
      
      Scanner sc = new Scanner(System.in);
      
      int k1 = sc.nextInt();
      
      int k2 = sc.nextInt();
      
      printBetweenK1andK2(root, k1, k2);
	
	}

}
