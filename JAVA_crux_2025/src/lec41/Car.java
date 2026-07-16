package lec41;

public class Car {// implements Comparable<Car> {
	int speed;
	int price;
	String color;

	public Car(int price, int speed, String color) {
		this.price = price;
		this.color = color;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return " P " + this.price + " S " + this.speed + " C " + this.color;
	}

//	@Override
//	public int compareTo(Car o) {
//		// TODO Auto-generated method stub
//		
//		return o.price - this.price;
////		// return this.speed - o.speed;
////		//return this.color.compareTo(o.color)
//	}
}