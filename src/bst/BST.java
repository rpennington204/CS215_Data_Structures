package bst;

public class BST {
	private class TNode {
		public int item;
		public TNode left;
		public TNode right;
		public TNode(int newitem) {
			item = newitem;
			left = null;
			right = null;
		}
	}
	
	private TNode root;
	
	public BST() {
		root = null;
	}
	
	private TNode insert(TNode curnode, int newitem) {
		if (curnode == null) {
			return new TNode(newitem);
		}
		else if (newitem < curnode.item) {
			curnode.left = insert(curnode.left, newitem);
		}
		else {
			curnode.right = insert(curnode.right, newitem);
		}
		return curnode;
	}
	
	public void putItem(int newitem) {
		root = insert(root, newitem);
	}
	
	private int findItem (TNode curnode, int gitem) {
		if (curnode == null) {
			return Integer.MIN_VALUE;
		}
		else if (gitem == curnode.item) {
			return curnode.item;
		}
		else if (gitem < curnode.item) {
			return findItem(curnode.left, gitem);
		}
		else {
			return findItem(curnode.right, gitem);
		}
	}
	
	public int getItem(int gitem) {
		return findItem(root, gitem);
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	private void printNodes(TNode curnode) {
		if (curnode != null) {
			printNodes(curnode.left);
			System.out.print(curnode.item + ", ");
			printNodes(curnode.right);
		}
	}
	
	public void printTree() {
		if (isEmpty()) 
			System.out.println("Emptry Tree");
		else { 
			printNodes(root);
			System.out.println("\b\b");
		}
	}
	
	private TNode delete(TNode curnode, int ditem) {
		if (ditem < curnode.item) //must check the left subtree
	        curnode.left = delete(curnode.left, ditem);   
	    else if (ditem > curnode.item) //must check right subtree
	        curnode.right = delete(curnode.right, ditem);  
	    else //node has been located
	        curnode = deleteNode(curnode, ditem);
	    return curnode;
	}
	
	private TNode deleteNode(TNode delnode, int ditem) { 
	    if (delnode.left == null) { 					      
	        return delnode.right;
	    } 
	    else if (delnode.right == null) {                                            	              
	    	return delnode.left;
	    }
	    else {
	        TNode predecessor = delnode.left;
	        while (predecessor.right != null) {	
	            predecessor = predecessor.right;
	        }
	        int replaceitem = predecessor.item;
	        delnode.item = replaceitem;
	        delnode.left = delete(delnode.left, replaceitem);
	            return delnode;
	    } 
	}

	
	public void deleteItem(int ditem) {
		root = delete(root, ditem);
	}
	
	private TNode copyNodes(TNode origNode) {	  
	    if (origNode == null)
	        return null;
	    else {
	        TNode copyNode = new TNode(origNode.item);
	        copyNode.left = copyNodes(origNode.left);
	        copyNode.right = copyNodes(origNode.right);
	        return copyNode; 
	    }
	}

	public BST(TNode cpNode) {
	    root = cpNode;	
	}

	public BST copy() {    
		TNode newroot = copyNodes(root);
	    BST cpBSTE = new BST(newroot);
	    return cpBSTE; 
	}
}
