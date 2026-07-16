package lec41;

import java.util.Arrays;

import java.util.Comparator;

public class Car_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer[] arr1=new Integer[5]; 

//		String s = "hllo";
//		String s1 = "kllo";
//		System.out.println(s.compareTo(s1));

		Car[] arr = new Car[5]; // ede nal ac car da array bnaya aa hje car class da object nhi bnya
		arr[0] = new Car(2555, 10, "White");
		arr[1] = new Car(1000, 20, "Black");
		arr[2] = new Car(345, 6, "Yellow");
		arr[3] = new Car(34, 89, "Grey");
		arr[4] = new Car(8907, 6, "Red");
//		Display(arr);
//		Sort(arr);

//		Sort(arr, new CarColorComparator());
//		Sort(arr, new CarPriceComparator());
//		Sort(arr, new CarSpeedComparator());
//		Display(arr);

		Arrays.sort(arr, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				if (o1.speed == o2.speed) {
					return o2.price - o1.price;
				} else {
					return o1.speed - o2.speed;
				}
			}
		});
		Display(arr);
	}

	public static <T> void Display(T[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
//
//	public static <T extends Comparable<T>> void Sort(T[] arr) {
//
//		for (int turn = 1; turn < arr.length; turn++) {
//			for (int i = 0; i < arr.length - turn; i++) {
//				if (arr[i].compareTo(arr[i + 1]) > 0) {
//					T temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//			}
//		}
//
//	}
//}

	public static <T> void Sort(T[] arr, Comparator<T> camp) {

		for (int turn = 1; turn < arr.length; turn++) {
			for (int i = 0; i < arr.length - turn; i++) {
				if (camp.compare(arr[i], arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

	}
}
