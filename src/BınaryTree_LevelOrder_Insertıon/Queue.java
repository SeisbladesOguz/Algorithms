package BınaryTree_LevelOrder_Insertıon;;

public class Queue<T> {

	Object array[];

	int head; // Index tutucular o yüzden int tipteler.

	int tail;

	int size;

	public Queue(int capacity) {

		this.head = 0;
		this.tail = 0;
		this.size = 0;

		array = new Object[capacity];

	}

	public void enqueue(T data) {
		
		if(size == array.length) {
			throw new IllegalArgumentException();
		}
		
		array[tail] = data;
		
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

}
