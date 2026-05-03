package DecimalToBınary;

import java.util.EmptyStackException;

public class Stack <T> implements StackInterface  <T>{
	
	private int top;
	private Object [] arr;
	
	
	public Stack(int capacity) {
		this.top = -1;
		
		this.arr = new Object[capacity];
		
	}
    @SuppressWarnings("unchecked")
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		T cıkan = (T) arr[top];
		
		top--;
		
		
		return cıkan;
	}

	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		
		if(top == arr.length - 1) {
			
			throw new IndexOutOfBoundsException();
			
		}
		
		
		top++;
		
		arr [top] = item;
		
		
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		if(top == -1) {
			return true;
		}
		
		return false;
		
		
	}
	

}
