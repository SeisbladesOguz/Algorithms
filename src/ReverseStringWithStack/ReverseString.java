package ReverseStringWithStack;

public class ReverseString {
	
	
	
	public String reverse (String input) {
		
		Stack <Character> s = new Stack <>(input.length());
		
		for(int i = 0; i < input.length();i++) {
			
			char ch = input.charAt(i);
			
			s.push(ch);

		}
		
		String reversedWord = "";
		
		while(!s.isEmpty()) {
			
			reversedWord += s.pop();
			
			
		}
		
		return reversedWord;
		
		
		
		
	}

}
