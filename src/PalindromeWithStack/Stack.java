package PalindromeWithStack;

public class Stack <T> implements StackInterface <T> {
	
	int top;
	Object [] arr;
	
	public Stack (int capacity) {
		
		this.top = 0;
		this.arr = new Object[capacity];
		
	}
	
	
	

	@Override
	public void push(Object item) {
		// TODO Auto-generated method stub
		
		if(top == arr.length - 1) {
			throw new IndexOutOfBoundsException();
		}
		
		arr[top] = item;
		
		top++;
		
		
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		
		if(isEmpty()) {
			
			throw new IllegalArgumentException();
		}
		
		top--;
		
		T a = (T) arr[top];

		return a;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		if(top == 0) {
			return true;
		}
		
		return false;
		
	}

}
