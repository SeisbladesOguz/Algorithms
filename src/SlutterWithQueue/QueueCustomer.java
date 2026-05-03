package SlutterWithQueue;

public class QueueCustomer<T> {
	private T[] array;
    private int head;
    private int tail;
    private int size;

    @SuppressWarnings("unchecked")
    public QueueCustomer(int capacity) {
        this.array = (T[]) new Object[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void enqueue(T element) {
        if (size == array.length) return;
        
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) return null;

        T element = array[head];
        head = (head + 1) % array.length;
        size--;
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}


