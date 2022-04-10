package BinaryTrees1;

public class printBinaryTreeNodes {

    public static void printTree( BinaryTreeNode<Integer> root ) {
    	
    	if( root == null ) {
    		
    		return;
    	
     	 }
    
        System.out.println(root.data);
        
        printTree(root.left);
        printTree(root.right);
    }
	
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
		
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(4);
		
		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(9);
		
	    root.left = rootLeft;
	    
	    root.right = rootRight;

	}

}
