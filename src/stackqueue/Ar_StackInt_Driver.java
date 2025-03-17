package stackqueue;

public class Ar_StackInt_Driver {
	public static void main(String[] args) throws Exception {
		Ar_Stack <Integer> myStack = new Ar_Stack<Integer>();
		for (int i = 1; i <= 3 ; i++)
			myStack.push(i);
		//Verify peek works correctly
		System.out.println("Peeking at the Stack: " + myStack.peek());
		System.out.println("1st Pop: " + myStack.pop());
		System.out.println("2nd Pop: " + myStack.pop());
		for (int i = 4; i <= 6 ; i++)
			myStack.push(i);
		System.out.println("3rd Pop: " + myStack.pop());
		System.out.println("4th Pop: " + myStack.pop());
		//Verify we can empty the queue successfully
		while (!myStack.isEmpty()) 
			System.out.println("Emptying the rest of the stack: " + myStack.pop());
		
		String expressionOne = "[Hello. ( How are ) you?]";
		
		System.out.println("Should return 2:");
		System.out.println(WFP.wellFormedParExp(expressionOne));
		
		String expressionTwo = "[ { ( [X] ) } ]";
		
		System.out.println("Should return 4:");
		System.out.println(WFP.wellFormedParExp(expressionTwo));
		
		String expressionThree = "Today is before tomorrow.";
		
		System.out.println("Should return 0:");
		System.out.println(WFP.wellFormedParExp(expressionThree));
		
		String expressionFour = "(Good evening.";
		
		System.out.println("Should return -1:");
		System.out.println(WFP.wellFormedParExp(expressionFour));
		
		String expressionFive = "[ ( ] )";
		
		System.out.println("Should return -1:");
		System.out.println(WFP.wellFormedParExp(expressionFive));
	}
	
}
