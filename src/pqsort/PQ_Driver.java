package pqsort;

public class PQ_Driver {
	public static void main(String[] args) throws Exception {
		PQMaxHeap myQueue = new PQMaxHeap();
		myQueue.enqueue(20);
		myQueue.enqueue(15);
		myQueue.enqueue(5);
		myQueue.enqueue(25);
		myQueue.enqueue(10);
		while (!myQueue.isEmpty())
			System.out.println("Dequeue: " + myQueue.dequeue());
		myQueue.enqueue(1);
		myQueue.enqueue(5);
		myQueue.enqueue(3);
		myQueue.enqueue(4);
		myQueue.enqueue(2);		
		//Verify we can empty the queue successfully
		while (!myQueue.isEmpty()) 
			System.out.println("Dequeue: " + myQueue.dequeue());
	}
	
}
