package PostfixEvaluationWithStack;

public class RPNCalculator {
	private Stack<Integer> myStack;

	public RPNCalculator(int size) {
		myStack = new Stack<Integer>(size);
	}

	public int evaluate(String expression) {

		String[] tokens = expression.split(" ");

		for (String token : tokens) {

			if (Character.isDigit(token.charAt(0))) {

				int numberExpression = Integer.parseInt(token);

				myStack.push(numberExpression);
				
			} else {

				if (!myStack.isEmpty()) {

					int b = myStack.pop();
					int a = myStack.pop();

					int result = 0;

					if (token.equals("/")) {

						result = a / b;
					} else if (token.equals("*")) {
						result = a * b;
					} else if (token.equals("-")) {
						result = a - b;
					} else if (token.equals("+")) {
						result = a + b;
					}
					
					myStack.push(result);

					

				}

			}

		}
		
		return myStack.pop();
		

	}

	private boolean isOperator(String s) {
		return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
	}
}