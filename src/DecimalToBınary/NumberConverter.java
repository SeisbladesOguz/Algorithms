package DecimalToBınary;

public class NumberConverter {

	/**
	 * Converts a decimal number to its binary representation using a Stack.
	 * 
	 * @param decimal The positive integer to convert.
	 * @return A String representing the binary value.
	 */
	public String convertToBinary(int decimal) {
		
		Stack<Integer> remainderStack = new Stack<>(32);
		String binaryResult = "";

		
		if (decimal == 0) {
			return "0";
		}

	
		while (decimal > 0) {
			

			int b = decimal % 2;
			remainderStack.push(b);

			decimal = decimal / 2;

		}

		
		while (!remainderStack.isEmpty()) {
			
			 binaryResult = binaryResult + remainderStack.pop().toString();
			
		}

		return binaryResult;
	}
}
