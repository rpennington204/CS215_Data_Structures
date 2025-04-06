package bst;

public class BSTDriver {
	public static void main (String[] args) throws Exception {
		/*BST testTree = new BST();
		testTree.putItem(10);
		testTree.putItem(5);
		testTree.putItem(15);
		testTree.putItem(17);
		testTree.putItem(13);
		testTree.putItem(8);
		testTree.putItem(3);		
		System.out.println(testTree.getItem(10));
		System.out.println(testTree.getItem(11));
		testTree.printTree();*/
		
		BST myBST = new BST();
		for (int i = 0; i <= 1000; i++) {
			myBST.putItem(i);
		}
		myBST.resetTree("PRE");
		while (!myBST.travEmpty())
			System.out.print(myBST.getNextItem() + " ");
		System.out.println();
		myBST.splitBalance();
		myBST.resetTree("PRE");
		while (!myBST.travEmpty())
			System.out.print(myBST.getNextItem() + " ");
		System.out.println();
		myBST.resetTree("IN");
		while (!myBST.travEmpty())
			System.out.print(myBST.getNextItem() + " ");
		System.out.println();
		myBST.resetTree("REVERSE");
		while (!myBST.travEmpty())
			System.out.print(myBST.getNextItem() + " ");
		
		System.out.println();
		BST testBST = new BST();
		for (int i = 0; i <= 20; i++)
			testBST.putItem(i);
		testBST.splitBalance();
		testBST.resetTree("PRE");
		while(!testBST.travEmpty())
			System.out.print(testBST.getNextItem() + " ");
		System.out.println();
		System.out.println(testBST.getHeight());
		
		
	}
}
