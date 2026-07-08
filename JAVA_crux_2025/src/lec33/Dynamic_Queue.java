package lec33;

import lec28.Queue;

public class Dynamic_Queue extends Queue {
	@Override
	public void enqueue(int item) throws Exception {
		if (isFull()) {
			int[] newarry = new int[2 * arr.length];

			//aa basically display function da ii code aa like prane array to nve array ch data copy krn da same dynamic stack ch parya hoya
			for (int i = 0; i < arr.length; i++) {

				int idx = (front + i) % arr.length;
				newarry[i] = arr[idx];

			}
			arr = newarry;
			front = 0;
		}
		super.enqueue(item); //eda matlab oni der tak prani queue da ii code chale jinni der tak queue full ni ho jandi
	}

}
