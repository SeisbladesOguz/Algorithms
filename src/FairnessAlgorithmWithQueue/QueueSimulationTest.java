package FairnessAlgorithmWithQueue;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueSimulationTest {
	
	
	private QueueCustomer queue;

    @BeforeEach
    void setUp() {
  
        queue = new QueueCustomer(5);
    }

    @Test
    void testCircularEnqueueAndDequeue() {
   
        for (int i = 0; i < 5; i++) {
            queue.enqueue(new Customer(Customer.PRIORITY_HIGH));
        }
        
 
        assertNotNull(queue.dequeue());
        
        Customer extra = new Customer(Customer.PRIORITY_LOW);
        queue.enqueue(extra);
        
      
        assertFalse(queue.isEmpty());
    }

    @Test
    void testTimeTracking() {
        Customer c = new Customer(Customer.PRIORITY_HIGH);
        int arrivalTime = 10;
        
        // SetTimeArrival test
        c.setTimeArrival(arrivalTime);
        queue.enqueue(c);
        
        Customer served = queue.dequeue();
        
        // GetTimeArrival test
        assertEquals(arrivalTime, served.getTimeArrival(), "Müşteri geliş zamanını yanlış tutuyor!");
        
        
        int currentTime = 25;
        int expectedWait = 15;
        assertEquals(expectedWait, (currentTime - served.getTimeArrival()));
    }

    @Test
    void testEmptyQueue() {
        
        assertNull(queue.dequeue(), "Boş kuyruk null dönmeli!");
        assertTrue(queue.isEmpty());
    }

}
