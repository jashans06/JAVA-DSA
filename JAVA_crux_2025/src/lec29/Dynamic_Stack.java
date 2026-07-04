package lec29;

import lec28.Stack;

public class Dynamic_Stack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (super.isFull()) {
			int[] newarr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
		}
		super.push(item);
	}

}
