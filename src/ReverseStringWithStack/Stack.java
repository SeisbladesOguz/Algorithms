
public class Stack <T> {
	Object [] arr;
    int top;
    
	public Stack(int capacity) {
		
		this.top = -1;
		
		this.arr = new Object [capacity];
		
	}
	
	public boolean isEmpty() {
		
		return top == -1;
		
		
	}
	
	public void push(T item)  {
		
		if(top  == arr.length -1) {
			
			throw new IndexOutOfBoundsException();
			
		}
		
		top++;
		
		arr[top] = item;
		
		
		
	}
	@SuppressWarnings("unchecked")
	public T pop() {
		
		if(top == -1) {
			throw new java.util.EmptyStackException(); 
		}

		T item = (T) arr[top];
		
		top--;
		
		return item;
		
		
		
	}
	

}
