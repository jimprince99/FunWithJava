package com.jimprince99.binarytree;

public class IntBinaryTreeExample1 {

	public static void main(String[] args) {
		
		IntBinaryTreeExample1 intBinaryTreeExample1 = new IntBinaryTreeExample1();
		
		IntBinaryTree ibt = intBinaryTreeExample1.createBinaryTree();
		
		if (ibt.containsNode(7) ) {
			System.out.println("Found 7");
		}
		
		ibt.delete(7);;
		
		if (!ibt.containsNode(7) ) {
			System.out.println("7 has been deleted");
		}

	}
	

	private IntBinaryTree createBinaryTree() {
	    IntBinaryTree bt = new IntBinaryTree();
	 
	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	 
	    return bt;
	}
}
