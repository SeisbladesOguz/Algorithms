package BinaryTreeCoreMethods;

public class MyQueue<T> {
	
	Object [] array;
	
	int head;
	int tail;
	int size;
	
	public MyQueue(int capacity) {
		
		array = new Object [capacity];
		this.head = 0;
		this.tail = 0;
		this.size = 0;
		
		
	}
	
	public void enqueue(T element) {
		
		if(getSize() == array.length) {
			throw new IllegalArgumentException();
		}
		
		array[tail] = element;
		
		tail = (tail + 1) % array.length;
		
		size++;
		

		
	}
	
	@SuppressWarnings("unchecked")
	public T dequeue() {
		
		T a = (T) array[head];
		
		head = (head + 1) % array.length;
		
		size--;
		
		return a;
	}
	
	public int getSize() {
		return size;
	}

}
