package stackqueue;

public class WFP {
	
	public static int wellFormedParExp(String exp) {
		Ar_Stack <String> parExpStack = new Ar_Stack<String>();
		String popCheck;
		int parPairCount = 0;
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '(') {
				parExpStack.push("(");
				++parPairCount;
			}
			if (exp.charAt(i) == '{') {
				parExpStack.push("{");
				++parPairCount;
			}
			if (exp.charAt(i) == '[') {
				parExpStack.push("[");
				++parPairCount;
			}
			
			if (exp.charAt(i) == ')') {
				popCheck = parExpStack.pop();
				if (popCheck != "(") {
					return -1;
				}
			}
			
			if (exp.charAt(i) == '}') {
				popCheck = parExpStack.pop();
				if (popCheck != "{") {
					return -1;
				}
			}
			
			if (exp.charAt(i) == ']') {
				popCheck = parExpStack.pop();
				if (popCheck != "[") {
					return -1;
				}
			}
			
		}
		if (parExpStack.isEmpty())
			return parPairCount;
		
		else
			return -1;
	}

}
