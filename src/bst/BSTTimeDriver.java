package bst;

import java.time.Duration;
import java.time.LocalDateTime;

public class BSTTimeDriver {

	public static void main(String[] args) throws Exception {
		BST myBST = new BST();
		
		LocalDateTime t1 = LocalDateTime.now();
		myBST.putItem(1000);
		for (int i = 1001; i < 2001; i++) {
			myBST.putItem(i);
		}
		for (int i = 999; i > 0; i--) {
			myBST.putItem(i);
		}
		LocalDateTime t2 = LocalDateTime.now();
		Duration dur = Duration.between(t1,  t2);
		System.out.println("Tree construction execution time: " + dur.toMillis() + " milliseconds");
		System.out.println("Height: " + myBST.getHeight());
		System.out.println();
		
		t1 = LocalDateTime.now();
		for (int i = 0; i < 10001; i++)
			myBST.getItem(1);
		t2 = LocalDateTime.now();
		dur = Duration.between(t1,  t2);
		System.out.println("getItem execution time: " + dur.toMillis() + " milliseconds");
		System.out.println();
		
		t1 = LocalDateTime.now();
		myBST.splitBalance();
		t2 = LocalDateTime.now();
		dur = Duration.between(t1,  t2);
		System.out.println("splitBalance execution time: " + dur.toMillis() + " milliseconds");
		System.out.println("Height after splitBalance: " + myBST.getHeight());
		System.out.println();
		
		t1 = LocalDateTime.now();
		for (int i = 0; i < 10001; i++)
			myBST.getItem(1);
		t2 = LocalDateTime.now();
		dur = Duration.between(t1,  t2);
		System.out.println("Balanced tree getItem execution time: " + dur.toMillis() + " milliseconds");

	}

}
