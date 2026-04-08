package InfixToPostfix;



public class InfixConverter {
    private Stack <Character> opStack;

    public InfixConverter(int size) {
        opStack = new Stack<Character>(size);
    }

    private int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return -1;
    }

    public String convert(String infix) {
        String output = "";
        
      for (int i = 0; i < infix.length(); i++) {
    	  
    	  char ch = infix.charAt(i);
    	  
    	  if(!Character.isDigit(ch) && ch != ')' ) {
    		  
    		   opStack.push(ch);
    		  
    	  } 
    	  
    	 if(ch == ')' && !opStack.isEmpty()) {
    		 opStack.pop();
    	 }
    	  
    	  
    	  
    	  
		  }
      
	  return output;
     
        
    }
}