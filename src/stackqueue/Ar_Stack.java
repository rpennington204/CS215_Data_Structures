package stackqueue;

public class Ar_Stack <T> {
	public static final int MAXSIZE = 10;
	private int top;
	private T StackItems[];
	
	@SuppressWarnings("unchecked")
	public Ar_Stack() {
		top = -1;
		StackItems = (T[]) new Object[MAXSIZE];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == MAXSIZE -1;
	}

	
	void push(T item) { 
		  top++;
		  StackItems[top] = item;
	}
	
	T pop() { 
		  T tmpitem=StackItems[top];
		  top--;
		  return tmpitem;

	}
	
	T peek() { 
		  return StackItems[top]; 
	}

	

}
