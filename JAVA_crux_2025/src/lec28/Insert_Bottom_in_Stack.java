package lec28;

import java.util.Stack;

public class Insert_Bottom_in_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Insert_Bottom(st, -9);
		System.out.println(st);

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
