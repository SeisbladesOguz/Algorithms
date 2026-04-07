package DecimalBinaryWithStack;

import java.util.EmptyStackException;

public class Stack <T> {
	
	private int top;
	
	private Object [] arr;
	
	public Stack(int capacity) {
		
		this.top = 0;
		
	     arr = new Object[capacity];
		
	}
	
	public void push(T item) {
		
		if(top == arr.length -1) {
			
			throw new IndexOutOfBoundsException();
		}
		
		
		arr[top] = item;
		
		top++;
		
		
	}
	
	@SuppressWarnings("unchecked")
	public T pop() {
		
		if(top == -1) {
			
			throw new EmptyStackException();
		}

		top--;
		
		T item = (T) arr[top];
		
		return item;
	
	
	
		
	}
	
	public boolean isEmpty() {
		
		if(top == -1) {
			return true;
		}
		return false;
		
		
	}

}
