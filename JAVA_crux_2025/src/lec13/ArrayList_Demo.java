package lec13;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		System.out.println(ll.size());
		ll.add(10);
		ll.add(20);
		ll.add(30);
//		ll.add(null);
		ll.add(1, -6); // range 1 is the index and -6 is the value we want to add at index 1
		System.out.println(ll);
//		Collections.sort(ll);
//		System.out.println(ll);
		System.out.println(ll.size());

		// get
		System.out.println(ll.get(3));
//		Collections.reverse(ll);
		System.out.println(ll);

		// set
		ll.set(2, -9);
		System.out.println(ll);
		
		// remove
		ll.remove(2);
		System.out.println(ll);
	}

}
