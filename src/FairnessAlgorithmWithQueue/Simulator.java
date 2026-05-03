package FairnessAlgorithmWithQueue;

public class Simulator {
	    private static final int TIME_MAX = 100;

	    public static void main(String[] args) {
	        QueueCustomer queueHigh = new QueueCustomer(TIME_MAX);
	        QueueCustomer queueLow = new QueueCustomer(TIME_MAX);
	        
	        int timeWaitingHigh = 0;
	        int timeWaitingLow = 0;
	        
	      
	        int highServedCount = 0; //Counter

	        for (int t = 0; t < TIME_MAX; t++) {
	            
	            // (New customers arrive and join their respective queues)
	            if (Math.random() < Customer.PROBABILITY_ARRIVAL) {
	                Customer newCustomer = Customer.arrival();
	                newCustomer.setTimeArrival(t);
	                if (newCustomer.getPriority() == Customer.PRIORITY_HIGH) {
	                    queueHigh.enqueue(newCustomer);
	                } else {
	                    queueLow.enqueue(newCustomer);
	                }
	            }

	            // --- STEP 2: SERVICE LOGIC (THE BRAIN) ---
	            if (Math.random() < ServiceProvider.SERVICE_RATE) {
	            	
	            	if(!queueLow.isEmpty() && highServedCount >= 3) {    
	            		Customer customer = queueLow.dequeue();
	            		timeWaitingLow = timeWaitingLow + (t - customer.getTimeArrival());
	            		highServedCount = 0;
	            	}
	            	
	            	else if(!queueHigh.isEmpty()) {
	            		Customer customer = queueHigh.dequeue();
	            		timeWaitingHigh = timeWaitingHigh + (t - customer.getTimeArrival());
	            		highServedCount++;
	            	}
	            	
	            
	           
	                
	            }
	        }

	        System.out.println("Total High Priority Wait: " + timeWaitingHigh);
	        System.out.println("Total Low Priority Wait: " + timeWaitingLow);
	    }
	}


