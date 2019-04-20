package com.jimprince99.binarytree;

public class IntBinaryTree {
	IntNode root;
	
	public IntNode getRoot() {
		return root;
	}
	
	public void setRoot(IntNode root) {
		this.root = root;
	}

	public void add(int value) {
	    root = addRecursive(root, value);
	}
	
	private IntNode addRecursive(IntNode current, int value) {
	    if (current == null) {
	        return new IntNode(value);
	    }
	 
	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}
	
	private boolean containsNodeRecursive(IntNode current, int value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        return true;
	    } 
	    return value < current.value
	      ? containsNodeRecursive(current.left, value)
	      : containsNodeRecursive(current.right, value);
	}
	
	public boolean containsNode(int value) {
	    return containsNodeRecursive(root, value);
	}
	
	private IntNode deleteRecursive(IntNode current, int value) {
	    // value is not present in the tree
		if (current == null) {
	        return null;
	    }
	 
	    if (value == current.value) {
	        // Node to delete found
	    	if (current.left == null && current.right == null) {
	    	    return null;
	    	}
	    	
	    	if (current.right == null) {
	    	    return current.left;
	    	}
	    	 
	    	if (current.left == null) {
	    	    return current.right;
	    	}
	    	
	    	int smallestValue = findSmallestValue(current.right);
	    	current.value = smallestValue;
	    	current.right = deleteRecursive(current.right, smallestValue);
	    	return current;
	    	
	        // ... code to delete the node will go here
	    } 
	    if (value < current.value) {
	        current.left = deleteRecursive(current.left, value);
	        return current;
	    }
	    current.right = deleteRecursive(current.right, value);
	    return current;
	}
	
	public void delete(int value) {
	    root = deleteRecursive(root, value);
	}
	
//	public boolean deleteNode(int value) {
//	    return containsNodeRecursive(root, value);
//	}
	
	private int findSmallestValue(IntNode root) {
	    return root.left == null ? root.value : findSmallestValue(root.left);
	}
	
	
}
