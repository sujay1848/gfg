package com.examples.tree;



public class TreeUtil {
	
	public static Tree buildBinaryTree(int data[]){
		if(data.length == 0)
			return null;
		Tree root = new Tree(data[0]);
		for(int i = 1 ; i <data.length;i++){
			constructBinaryTree(data[i], root);
		}
		return root;
	}
	
	public static Tree buildBinaryBST(int data[]){
		if(data.length == 0)
			return null;
		Tree root = new Tree(data[0]);
		for(int i = 1 ; i <data.length;i++){
			constructBinaryTree(data[i], root);
		}
		return root;
	}
	
	public static void constructBST(int data,Tree root){
		Tree temp = root;
		if(data < root.getData()){
			if(temp.getLeftChild() != null)
				constructBST(data, temp.getLeftChild()); 
			else
				temp.setLeftChild(new Tree(data));
		}else{
			if(temp.getRightChild() != null)
				constructBST(data, temp.getRightChild()); 
			else
				temp.setRightChild(new Tree(data));
		}
		
	}
	
	public static void constructBinaryTree(int data,Tree root){
		Tree temp = root;
		if(System.currentTimeMillis() %2 == 0){
			if(temp.getLeftChild() != null)
				constructBinaryTree(data, temp.getLeftChild()); 
			else
				temp.setLeftChild(new Tree(data));
		}else{
			if(temp.getRightChild() != null)
				constructBinaryTree(data, temp.getRightChild()); 
			else
				temp.setRightChild(new Tree(data));
		}
		
	}
	
	public static void inOrder(Tree root){
		if(root != null){
			
			inOrder(root.getLeftChild());
			System.out.print(" "+root.getData());
			inOrder(root.getRightChild());
		}
	}
	
	public static void preOrder(Tree root){
		if(root != null){
			
			System.out.print(" "+root.getData());
			preOrder(root.getLeftChild());
			preOrder(root.getRightChild());
		}
	}
	public static void postOrder(Tree root){
		if(root != null){
			
			postOrder(root.getLeftChild());
			postOrder(root.getRightChild());
			System.out.print(" "+root.getData());
		}
	}
	
	public static void main(String[] args) {
	   int []arr2 = {3,2,5,6,90,56,34,67,23,10,45,89,78,109,111,22,400,300,1};
	   System.out.println("//////////////////Binnary tree/////////////////");
	   Tree root = buildBinaryTree(arr2);
	   System.out.println("Inorder");
	   inOrder(root);
	   System.out.println("\nPreorder");
	   preOrder(root);
	   System.out.println("\nPostorder");
	   postOrder(root);
	   
	   System.out.println("\n\n//////////////////Binnary Search tree/////////////////");
	   Tree root1 = buildBinaryBST(arr2);
	   System.out.println("Inorder");
	   inOrder(root1);
	   System.out.println("\nPreorder");
	   preOrder(root1);
	   System.out.println("\nPostorder");
	   postOrder(root1);
		
	}
}
