package ssr.prep.amazon;

public class BSTClient {

	public static void main(String[] args) {
		BinarySearchTreeImpl tree = new BinarySearchTreeImpl();
		tree.root = new BSTNode(10);
		tree.root.left = new BSTNode(8);
		tree.root.right = new BSTNode(12);
		tree.root.left.left = new BSTNode(6);
		tree.root.left.left.left = new BSTNode(5);
		tree.root.left.left.left.left = new BSTNode(3);
		tree.root.left.right = new BSTNode(9);
		tree.root.right = new BSTNode(12);
		tree.root.right.left = new BSTNode(11);
		tree.root.right.right = new BSTNode(13);
		tree.root.right.right.right = new BSTNode(15);
		
		
//		System.out.println("Pre Order Traversal : ");
//		tree.preOrder(tree.root);
//		System.out.println("\nIn Order Traversal : ");
//		tree.inOrder(tree.root);
//		System.out.println("\nPost Order Traversal : ");
//		tree.postOrder(tree.root);
//		System.out.println("\n\nMax Depth of the Binary Tree : "+tree.maxDepth(tree.root));
		//BinarySearchTree.maxPathValue(tree.root);
		//System.out.println(tree.maxDepth(tree.root));
		//tree.printPaths(tree.root);
		tree.printSpiral(tree.root);

	}

}
