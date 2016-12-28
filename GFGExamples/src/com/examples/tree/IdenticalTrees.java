package com.examples.tree;

/**
http://www.geeksforgeeks.org/write-c-code-to-determine-if-two-trees-are-identical/
 *
 */
public class IdenticalTrees {
	public static void main(String[] args) {
		Tree root = TreeUtil.buildBinaryTree(TreeUtil.DATA);
		Tree root1 = root;
		System.out.println(isIdenticalTree(root, root1));
		
		Tree root2 = TreeUtil.buildBinaryTree(TreeUtil.DATA);
		System.out.println(isIdenticalTree(root, root2));
	}
	
	/**
	 * check if both node1 and node2 are not null and if yes there data should be same for being identical
	 * if both nodes are null then also they are identical
	 * 
	 * @param node1
	 * @param node2
	 * @return
	 */
	static boolean isIdenticalTree(Tree node1 , Tree node2){
		if(node1 != null && node2 !=null && node1.getData().equals(node2.getData())){
			return isIdenticalTree(node1.getLeftChild(), node2.getLeftChild()) && isIdenticalTree(node1.getRightChild(), node2.getRightChild());
		}else if(node1 == null && node2 == null){
			return true;
		}else{
			return false;
		}
	}
}
