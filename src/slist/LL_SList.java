package slist;

public class LL_SList {
	
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
	
	public LL_SList() {
		ListStart = null;
		currentPos = null;
	}
	
	public void putItem(int pitem) {
		LNode newNode; //Get a reference for a new node
		LNode leadptr; //This points to the current node
		LNode trailptr; //This points to the previous node
		newNode = new LNode (pitem);
		
		if (ListStart == null || ListStart.item > pitem) {
			newNode.next = ListStart;
			ListStart = newNode;
		}
		
		else {
			leadptr = ListStart.next;
			trailptr = ListStart;
			while (leadptr != null && leadptr.item < pitem) {
				leadptr = leadptr.next;
				trailptr = trailptr.next;
			}
			newNode.next = leadptr;
			trailptr.next = newNode;
		}
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
		while (iterPos != null && iterPos.item < gitem) {
			iterPos = iterPos.next;
			position++;
		}
		if (iterPos == null || iterPos.item > gitem) {
			return -1;
		}
		else {
			return position;
		}
	}
	
	public void deleteItem(int ditem) {
		LNode iterPos = ListStart;
		LNode nextPos;
		if (ListStart.item == ditem) {
			ListStart = ListStart.next;
		}
		else {
			nextPos = iterPos.next;
			while (nextPos != null && nextPos.item != ditem) {
				iterPos = iterPos.next;
				nextPos = nextPos.next;
			}
			if (nextPos.item == ditem) {
				iterPos.next = nextPos.next;
			}
		}
		
	}

}
