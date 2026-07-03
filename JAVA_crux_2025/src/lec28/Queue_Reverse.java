package lec28;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.display();
		reverseQueue(q);
		q.display();
	}

	public static void reverseQueue(Queue q) throws Exception {
		if (q.isEmpty()) {
			return;
		}
		int dequed_elemenet = q.dequeue();
		reverseQueue(q);
		q.enqueue(dequed_elemenet);

	}
}
