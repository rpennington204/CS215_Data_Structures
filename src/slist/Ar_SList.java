package slist;

public class Ar_SList {
	public static final int MAXSIZE = 10;
	private int[] ListItems;
	private int length;
	private int currentPos;
	
	public Ar_SList() {
		length = 0;
		currentPos = 0;
		ListItems = new int[MAXSIZE];
	}
	
	public int getLength() { //Basic accessor
		return length;
	}
	
	public boolean isFull() {
		return length == MAXSIZE;
	}
	
	public void putItem(int pitem) throws Exception{
		if (length == MAXSIZE) {
			throw new Exception("List already full");
		}
		int aloc = 0;
		boolean moreToSearch = aloc < length;		
		while (moreToSearch) {
			if (pitem < ListItems[aloc]) {
				moreToSearch = false;
			}
			else {
				aloc ++;
				moreToSearch = aloc < length;
			}
		}
		
		for (int i = length; i > aloc; i--) {
			ListItems[i] = ListItems[i-1];
		}
		ListItems[aloc] = pitem;
		length++;
	}
	
	public void deleteItemSwap(int ditem){
		for (int i = 0; i < length; i++) {
			if (ListItems[i] == ditem) {
				ListItems[i] = ListItems[length - 1];
				length--;
				return;
			}
		}
	}
	
	public void deleteItemShift(int ditem) {
		boolean indexFound = false;
		for (int i = 0; i < length; i++) {
			if (ListItems[i] == ditem) {
				indexFound = true;
			}
			if (indexFound && i < MAXSIZE - 1) {
				ListItems[i] = ListItems[i+1];
			}
		}
		length--;
	}
	
	public void deleteItem(int ditem) throws Exception{
		if (getItem(ditem) == -1) {
			throw new Exception("Item is not in list");
		}
		deleteItemShift(ditem);
	}
	
	public void makeEmpty() {
		length = 0;
	}
	
	public void resetList() {
		currentPos = 0;
	}
	
	public int getNextItem() throws Exception{
		if (currentPos == length) {
			throw new Exception ("End of list has been reached");
		}
		//A little  counter-intuitive. Want to return item at current index and increment simultaneously
		currentPos++;
		return ListItems[currentPos -1];
	}
	
	public int getItem(int gitem) {
		int midpoint = 0;
		int first = 0;
		int last = length - 1;
		boolean moreToSearch = first <= last;
		
		while (moreToSearch) {
			midpoint = (first + last) / 2;
			if (gitem == ListItems[midpoint]) {
				return midpoint;
			}
			else if (gitem < ListItems[midpoint]) {
				last = midpoint-1;
			}
			else {
				first = midpoint+1;
			}
			moreToSearch = first <= last;
		}
		return -1;
	}
	
	public void printList() {
		System.out.print("(");
		for (int i = 0; i < length; i++) {
			System.out.print(ListItems[i]);
			if (i < length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(")");
	}
}
