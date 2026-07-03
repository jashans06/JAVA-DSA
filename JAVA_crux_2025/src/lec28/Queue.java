package lec28;

public class Queue {
	private int[] arr;
	private int front = 0;
	private int size = 0;

	public Queue() {
		arr = new int[5];
	}

	public Queue(int n) {
		arr = new int[n];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == arr.length;
	}

//	public void enqueue(int item) throws Exception { // linear queue
//		if (isFull()) {
//			throw new Exception("Queue is full ");
//		}
//		int index = front + size;
//		arr[index] = item;
//		size++;
//	}

	public void enqueue(int item) throws Exception { // circular queue
		if (isFull()) {
			throw new Exception("Queue is full ");
		}
		int index = (front + size) % arr.length;
		arr[index] = item;
		size++;
	}

	public int dequeue(int item) { // linear queue

		int rv = arr[front];
		front++;
		size--;
		return rv;
	}

}
