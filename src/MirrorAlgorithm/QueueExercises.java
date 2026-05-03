package MirrorAlgorithm;

public class QueueExercises {
	/**
     * Mirror the given queue.
     * Original: [a, b, c] -> Result: [a, b, c, c, b, a]
     */
    public void mirror(QueueCustomer<String> queue) {
        Stack<String> stack = new Stack<>(10);
        int size = queue.size();

        // TODO: Process original elements and use stack for reversing
        
        String parametredenCıkan = "";
        String stackdenCıkan = "";
        
        for(int i = 0; i < size; i++) {
        	
            parametredenCıkan = queue.dequeue();
        	
        	stack.push(parametredenCıkan);
        	
        	queue.enqueue(parametredenCıkan);
        	
        }
        
    	while(!stack.isEmpty()) {
    		stackdenCıkan = stack.pop();
    		
    		queue.enqueue(stackdenCıkan);
    	}
    	
    	
        
        	
  
        
        
        
       
        
        
        
        // TODO: Build the final mirrored queue
    }
}

