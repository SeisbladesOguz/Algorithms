package SlutterWithQueue;

public class QueueExercises {
	/**
     * Stutter the given queue.
     * Original: [1, 2, 3] -> Result: [1, 1, 2, 2, 3, 3]
     */
    public void stutter(QueueCustomer<Integer> queue) {
       
        int originalSize = queue.size();
        
        int queueCıkan = 0;

        // Step 2: Loop through original elements
        for (int i = 0; i < originalSize; i++) {
            
        	
        	if(!queue.isEmpty()) {
        		queueCıkan = queue.dequeue();
        	}
        	

        	queue.enqueue(queueCıkan);
        	queue.enqueue(queueCıkan);
        	
        	
            
        }
    }

}
