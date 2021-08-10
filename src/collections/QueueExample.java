package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		PriorityQueueExample pqe = new PriorityQueueExample();
		pqe.implementQueue();
	}
}

class PriorityQueueExample {
	void implementQueue() {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("red");
		pq.add("blue");
		pq.offer("green");
		pq.offer("black");
		
		System.out.println("head:"+pq.element()); 
        System.out.println("head:"+pq.peek());
        
		Iterator<String> itr=pq.iterator(); 
        while(itr.hasNext()){ 
            System.out.println(itr.next()); 
        }
        
        pq.remove(); 
        pq.poll();
        
        pq.add("black");

        Iterator<String> itr1=pq.iterator(); 
        while(itr1.hasNext()){ 
            System.out.println(itr1.next()); 
        }
	}
}