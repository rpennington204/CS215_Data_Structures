package ulist;

public class Ar_UList {
	public static final int MAXSIZE = 10;
	private int[] ListItems;
	private int length;
	private int currentPos;
	
	public Ar_UList() {
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
	
	public void putItem(int pitem) {
		ListItems[length] = pitem;
		length ++;
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
			if (indexFound) {
				ListItems[i] = ListItems[i+1];
			}
		}
		length--;
	}
	
	public void deleteItem(int ditem) {
		deleteItemSwap(ditem);
	}
	
	public void makeEmpty() {
		length = 0;
	}
	
	public void resetList() {
		currentPos = 0;
	}
	
	public int getNextItem() {
		//A little  counter-intuitive. Want to return item at current index and increment simultaneously
		currentPos++;
		return ListItems[currentPos -1];
	}
	
	public int getItem(int gitem) {
		for (int i = 0; i < length; i++) {
			if (ListItems[i] == gitem) {
				return i;
			}
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
	
	//
	//Homework 1
	//
	
	
	public int getMax() {
		int max = 0;
		for (int i = 0; i < length; i++) {
			if (ListItems[i] > max) {
				max = ListItems[i];
			}
		}
		return max;
	}
	
	public int getRange() {
		int max = 0;
		int min = ListItems[0];
		for (int i = 0; i < length; i++) {
			if (ListItems[i] > max) {
				max = ListItems[i];
			}
			if (ListItems[i] < min) {
				min = ListItems[i];
			}
		}
		return max - min;
	}
	
	public Ar_UList duplicateInRange(int lbound, int ubound) {
		Ar_UList newList = new Ar_UList();
		for (int i = 0; i < length; i++) {
			if (ListItems[i] >= lbound && ListItems[i] <= ubound) {
				newList.putItem(ListItems[i]);
			}
		}
		return newList;
	}
}
