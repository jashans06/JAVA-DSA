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

//	public void enqueue(int item) throws Exception { // linear queue enqueue
//		if (isFull()) {
//			throw new Exception("Queue is full ");
//		}
//		int index = front + size;
//		arr[index] = item;
//		size++;
//	}

	public void enqueue(int item) throws Exception { // circular queue enqueue
		if (isFull()) {
			throw new Exception("Queue is full ");
		}
		int index = (front + size) % arr.length;
		arr[index] = item;
		size++;
	}

//	public int dequeue(int item) throws Exception{ // linear queue
//if (isEmpty()) {
//	throw new Exception("Queue is Empty");
//}
//		int rv = arr[front];
//		front++;
//		size--;
//		return rv;
//	}

	public int dequeue() throws Exception { // circular queue dequeue
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int rv = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return rv;
	}

	public int getFront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int rv = arr[front];
		return rv;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}

}
