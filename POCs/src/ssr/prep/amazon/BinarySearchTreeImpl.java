package ssr.prep.amazon;

public class BinarySearchTreeImpl {
	BSTNode root;
	
	static int amount = 0;
	static int pathValue = 0;
	
	public void postOrder(BSTNode root) {

		if (root == null)
			return;
		else {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}

	}

	public void preOrder(BSTNode root) {

		if (root == null) {
			return;
		} else {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void inOrder(BSTNode root) {

		if (root == null) {
			return;
		} else {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	public int maxDepth(BSTNode root) {
		int leftDepth;
		int rightDepth;
		if (root == null)
			return 0;
		else {
			leftDepth = maxDepth(root.left);

			rightDepth = maxDepth(root.right);

			if (rightDepth > leftDepth)
				return rightDepth + 1;
			else
				return leftDepth + 1;
		}
	}
/*********************************************************Print Path********************************************************************************************/	
	 void printPaths(BSTNode bSTNode) 
	    {
	        int path[] = new int[1000];
	        printPathsRecur(bSTNode, path, 0);
	    }
	  
	    /* Recursive helper function -- given a node, and an array
	       containing the path from the root node up to but not 
	       including this node, print out all the root-leaf paths.*/
	 
	    void printPathsRecur(BSTNode bSTNode, int path[], int pathLen) 
	    {
	        if (bSTNode == null)
	            return;
	  
	        /* append this node to the path array */
	        path[pathLen] = bSTNode.data;
	        pathLen++;
	  
	        /* it's a leaf, so print the path that led to here  */
	        if (bSTNode.left == null && bSTNode.right == null)
	            printArray(path, pathLen);
	        else
	        {
	            /* otherwise try both subtrees */
	            printPathsRecur(bSTNode.left, path, pathLen);
	            printPathsRecur(bSTNode.right, path, pathLen);
	        }
	    }
	  
	    /* Utility function that prints out an array on a line. */
	    void printArray(int ints[], int len) 
	    {
	        int i;
	        for (i = 0; i < len; i++) 
	        {
	            System.out.print(ints[i] + " ");
	        }
	        System.out.println("");
	    }
/*********************************************************Print Path********************************************************************************************/	
	    
/*********************************************************ZigZag Traversal********************************************************************************************/
	    void printSpiral(BSTNode bSTNode) 
	    {
	        int h = height(bSTNode);
	        int i;
	  
	        /* ltr -> left to right. If this variable is set then the
	           given label is transversed from left to right */
	        boolean ltr = false;
	        for (i = 1; i <= h; i++) 
	        {
	            printGivenLevel(bSTNode, i, ltr);
	  
	            /*Revert ltr to traverse next level in opposite order*/
	            ltr = !ltr;
	        }
	  
	    }
	  
	    /* Compute the "height" of a tree -- the number of
	    nodes along the longest path from the root node
	    down to the farthest leaf node.*/
	    int height(BSTNode bSTNode) 
	    {
	        if (bSTNode == null) 
	            return 0;
	        else
	        {
	              
	            /* compute the height of each subtree */
	            int lheight = height(bSTNode.left);
	            int rheight = height(bSTNode.right);
	  
	            /* use the larger one */
	            if (lheight > rheight) 
	                return (lheight + 1);
	            else
	                return (rheight + 1);
	        }
	    }
	  
	    /* Print nodes at a given level */
	    void printGivenLevel(BSTNode bSTNode, int level, boolean ltr) 
	    {
	        if (bSTNode == null) 
	            return;
	        if (level == 1) 
	            System.out.print(bSTNode.data + " ");
	        else if (level > 1) 
	        {
	            if (ltr != false) 
	            {
	                printGivenLevel(bSTNode.left, level - 1, ltr);
	                printGivenLevel(bSTNode.right, level - 1, ltr);
	            } 
	            else
	            {
	                printGivenLevel(bSTNode.right, level - 1, ltr);
	                printGivenLevel(bSTNode.left, level - 1, ltr);
	            }
	        }
	    }
/*********************************************************ZigZag Traversal********************************************************************************************/
	@SuppressWarnings("unused")
	public static int maxPathValue(BSTNode root){
		
		amount = amount+root.data;
		if (root == null)
			return amount;
		
			if(root.left != null)
				maxPathValue(root.left);
			if(root.right != null)
				maxPathValue(root.right);
			return amount;
			
	}
}
