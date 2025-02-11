package ulist;

public class LL_UList {
	
	private class LNode {
		public int item;
		public LNode next;
		
		//Sets up the node
		public LNode (int newitem) {
			item = newitem;
			next = null;
		}
	}
	
	private LNode ListStart;
	private LNode currentPos;
	
	public LL_UList() {
		ListStart = null;
		currentPos = null;
	}
	
	public void putItem(int pitem) {
		LNode node = new LNode(pitem);
		node.next = ListStart;
		ListStart = node;
	}
	
	public int getNextItem() {
		int retItem = currentPos.item;
		currentPos = currentPos.next;
		return retItem;
	}
	
	public void resetList() {
		currentPos = ListStart;
	}
	
	public int getLength() {
		LNode iterPos = ListStart;
		int length = 0;
		while (iterPos != null) {
			iterPos = iterPos.next;
			length ++;
		}
		return length;
	}
	
	public boolean isFull() {
		return false;
	}
	
	public void makeEmpty() {
		ListStart = null;
	}
	
	public int getItem(int gitem) {
		LNode iterPos = ListStart;
		int position = 0;
		while (iterPos != null && iterPos.item != gitem) {
			iterPos = iterPos.next;
			position++;
		}
		if (iterPos == null) {
			return -1;
		}
		else {
			return position;
		}
	}
	
	public void deleteItem(int ditem) {
		LNode iterPos = ListStart;
		LNode nextPos = ListStart.next;
		while (nextPos != null && nextPos.item != ditem) {
			iterPos = iterPos.next;
			nextPos = nextPos.next;
		}
		if (nextPos.item == ditem) {
			iterPos.next = nextPos.next;
		}
		
	}
	
	public void printList() {
		LNode iterPos = ListStart;
		System.out.print("(");
		while (iterPos != null) {
			System.out.print(iterPos.item);
			if (iterPos.next != null) {
				System.out.print(", ");
			}
			iterPos = iterPos.next;
		}
		System.out.println(")");
	}
	
	//
	//Homework 1
	//
	
	
	public int getMax() {
		LNode iterPos = ListStart;
		int max = 0;
		while (iterPos != null) {
			if (iterPos.item > max) {
				max = iterPos.item;
			}
			iterPos = iterPos.next;
		}
		return max;
	}
	
	public int getRange() {
		LNode iterPos = ListStart;
		int max = 0;
		int min = iterPos.item;
		while (iterPos != null) {
			if (iterPos.item > max) {
				max = iterPos.item;
			}
			if (iterPos.item < min) {
				min = iterPos.item;
			}
			iterPos = iterPos.next;
		}
		return max - min;
	}
	
	public LL_UList duplicateInRange(int lbound, int ubound) {
		LL_UList newList = new LL_UList();
		LNode iterPos = ListStart;
		while (iterPos != null) {
			if (iterPos.item >= lbound && iterPos.item <= ubound) {
				newList.putItem(iterPos.item);
			}
			iterPos = iterPos.next;
		}
		return newList;
	}

}
