package FairnessAlgorithmWithQueue;


	
	public class Customer {
	    public static final double PROBABILITY_ARRIVAL = 0.5;
	    public static final int PRIORITY_HIGH = 1;
	    public static final int PRIORITY_LOW = 0;
	    
	    private int arrivalTime;
	    private int priority;

	    public static Customer arrival() {
	        return new Customer((Math.random() < 0.5) ? PRIORITY_HIGH : PRIORITY_LOW);
	    }
	    
	    public Customer(int priority) { this.priority = priority; }
	    public int getPriority() { return priority; }
	    public void setTimeArrival(int t) { this.arrivalTime = t; }
	    public int getTimeArrival() { return arrivalTime; }
	}

	// Ready-to-use Service Provider
	class ServiceProvider {
	    public static final double SERVICE_RATE = 0.7;
	    public static void service(Customer c) {
	        System.out.println("Servicing customer from time: " + c.getTimeArrival());
	    }
	}

	
	class QueueCustomer {
	    private Customer[] array;
	    private int head = 0, tail = 0, size = 0;

	    public QueueCustomer(int capacity) { array = new Customer[capacity]; }
	    public void enqueue(Customer c) {
	        if (size == array.length) return;
	        array[tail] = c;
	        tail = (tail + 1) % array.length;
	        size++;
	    }
	    public Customer dequeue() {
	        if (size == 0) return null;
	        Customer c = array[head];
	        head = (head + 1) % array.length;
	        size--;
	        return c;
	    }
	    public boolean isEmpty() { return size == 0; }
	}


