package lec28;

public class Stack {
	protected int[] arr;
	private int top = -1; // pointing to index

	public Stack() {
		arr = new int[5];
	}

	public Stack(int n) {
		arr = new int[n];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == arr.length - 1;
	}

	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Stack index out of bound");
		}
		top++;
		arr[top] = item;
	}

	public int pop(int item) throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		int rv = arr[top];
		top--;
		return rv;
	}

	public int peek() {
		int rv = arr[top];
		top--;
		return rv;
	}

	public int size() {
		return top + 1;
	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");

		}
	}
}