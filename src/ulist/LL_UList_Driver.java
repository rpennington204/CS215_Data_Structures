package ulist;

public class LL_UList_Driver {
	public static void main(String[] args) throws Exception {	
		//Testing Basic List Functionality
		LL_UList testList = new LL_UList();
		System.out.println("Newly Created List: ");
		testList.printList();
		for (int i=0; i<10; i++)
			testList.putItem(100-i*10);
		System.out.println("List after 'PutItem' (100 down to 10) calls: ");
		testList.printList();
		System.out.println("Length after 'PutItem' calls: " + testList.getLength());
		System.out.println("IsFull after 'PutItem' calls? " + testList.isFull());
		testList.deleteItem(50);
		System.out.println("List after 'DeleteItem' (50) call: ");
		testList.printList();
		System.out.println("Length after 'DeleteItem' (50) call: " + testList.getLength());
		System.out.println("IsFull after 'DeleteItem' (50) call? " + testList.isFull());
		System.out.println("Index of value 80: " + testList.getItem(80));
		System.out.println("Index of value 25: " + testList.getItem(25));
		testList.makeEmpty();
		System.out.println("List after 'MakeEmpty': ");
		testList.printList();
		for (int i=0; i<10; i++)
			testList.putItem(i*10);

		//Testing ResetList and GetNextItem
		testList.resetList();
		System.out.println("List Reset.");
		for (int i=0; i<10; i++)
			System.out.println("Next Item in Sequence: " + testList.getNextItem());		
		
		//Testing homework methods
		testList.makeEmpty();
		for (int i=1; i<11; i++)
			testList.putItem(i*10);
		System.out.println(testList.getMax());
		System.out.println(testList.getRange());
		testList.duplicateInRange(30,80).printList();
			
	}
}
