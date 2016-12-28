package com.examples.tree;


/**
 * http://www.geeksforgeeks.org/write-a-c-program-to-calculate-size-of-a-tree/
 *
 */
public class SizeOfTree {
	public static void main(String[] args) {
		Tree root = TreeUtil.buildBinaryTree(TreeUtil.DATA);
		int size = calculateTreeSize( root);
		System.out.println(size);
		System.out.println(TreeUtil.DATA.length);
	}

	/**
	 * retru 0 for all nodes that are null and add 1 for each non null iteration
	 * @param root
	 * @return
	 */
	private static int calculateTreeSize(Tree root) {
		if(root == null)
			return 0;
		return calculateTreeSize(root.getLeftChild()) + calculateTreeSize(root.getRightChild()) +1 ;
	}

}
