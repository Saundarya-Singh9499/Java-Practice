package BinaryTrees1;

public class BinaryTreeNodeUse {

    
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(20);
		
		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(40);
		
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(60);
		
		root.left = rootLeft;
		
		root.right = rootRight;
		
		BinaryTreeNode<Integer> rightOfLeft = new BinaryTreeNode<>(80);
		
		BinaryTreeNode<Integer> leftOfRight = new BinaryTreeNode<>(100);
		
		rootLeft.right = rightOfLeft;
		
		rootRight.left = leftOfRight;
		
		
		
		

	}

}
