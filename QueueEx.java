package queue;

import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<String>();
	queue.add("sun");
	queue.add("mon");
	queue.add("tue");
	queue.add("wed");
	System.out.println(queue);
	System.out.println("first element==>"+queue.peek());
	queue.poll();
	System.out.println(queue);
	queue.offer("mon");
	System.out.println(queue);
	queue.offer("sat");
	System.out.println(queue);
	queue.remove();
	System.out.println("----"+queue);
	queue.iterator();

	}

}
