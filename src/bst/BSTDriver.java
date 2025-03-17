package bst;

public class BSTDriver {
	public static void main (String[] args) {
		BST testTree = new BST();
		testTree.putItem(10);
		testTree.putItem(5);
		testTree.putItem(15);
		testTree.putItem(17);
		testTree.putItem(13);
		testTree.putItem(8);
		testTree.putItem(3);
		System.out.println(testTree.getItem(10));
		System.out.println(testTree.getItem(11));
		testTree.printTree();
	}
}
