package lec28;

import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Reverse(st);
		System.out.println(st);
	}

	public static void Reverse(Stack<Integer> st) {
		if (st.isEmpty()) {
			return;
		}
		int poped_element = st.pop();
		Reverse(st);
		Insert_Bottom(st, poped_element);

	}

	public static void Insert_Bottom(Stack<Integer> st, int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}

		int poped_element = st.pop();
		Insert_Bottom(st, item);
		st.push(poped_element);
	}
}
