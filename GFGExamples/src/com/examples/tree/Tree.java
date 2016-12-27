package com.examples.tree;

public class Tree {
	private Integer data;
	private Tree leftChild;
	private Tree rightChild;
	
	public Tree() {
	}
	public Tree(Integer data, Tree leftChild, Tree rightChild) {
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	
	public Tree(Integer data) {
		this.data = data;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Tree getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Tree leftChild) {
		this.leftChild = leftChild;
	}
	public Tree getRightChild() {
		return rightChild;
	}
	public void setRightChild(Tree rightChild) {
		this.rightChild = rightChild;
	}
}
