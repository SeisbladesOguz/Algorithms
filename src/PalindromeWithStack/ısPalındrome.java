package PalindromeWithStack;

public class ısPalındrome {
	
	
	public boolean check (String a) {

	
		Stack <Character> stack = new Stack <> (100);
		
		
		 
		
		for(int i = 0; i < a.length() ; i++) {
			
			char b = a.charAt(i);
			
			 stack.push(b);
			
		}
		
		String palındromeWord = "";
		
		while (!stack.isEmpty()) {
			 palındromeWord = palındromeWord + stack.pop();
		}
 
		
		return a.equalsIgnoreCase(palındromeWord);
	}

}
