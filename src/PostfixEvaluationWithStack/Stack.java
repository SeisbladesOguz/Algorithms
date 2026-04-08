package PostfixEvaluationWithStack;



public class Stack<T> {

	private T[] array; // Object yerine direkt T[] kullanıyoruz
	private int top;
	private int capacity;

	@SuppressWarnings("unchecked")
	public Stack(int size) {
		this.capacity = size;
		this.array = (T[]) new Object[capacity];
		this.top = -1;
	}

	public void push(T item) {
		if (isFull()) {
			throw new IllegalStateException("Stack Overflow!");
		}

		top++;

		array[top] = item;
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack Underflow!");
		}

		T a = array[top];

		top--;

		return a;

	}

	public boolean isEmpty() {

		if (top == -1) {

			return true;

		}

		return false;

	}

	public boolean isFull() {

		if (top == capacity) {

			return true;

		}

		return false;

	}
}