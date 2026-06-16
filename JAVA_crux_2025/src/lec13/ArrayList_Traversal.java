package lec13;

import java.util.ArrayList;

public class ArrayList_Traversal {
	public static void main(String[] args) {

		ArrayList<Integer> ll = new ArrayList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(2, -6);
		System.out.println(ll);

		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");

		}
		for (int v : ll) { // for each loop
			System.out.print(v + " ");
		}

	}

}
