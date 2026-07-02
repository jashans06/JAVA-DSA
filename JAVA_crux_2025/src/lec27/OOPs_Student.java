package lec27;

public class OOPs_Student {
	String name = "kirat";
	int age = 20;

	public void intro_Yourself() {
		System.out.println("My name is " + name + " and age is " + age);
	}

	public void sayHi(String name) {
		System.out.println(name + " says hi " + this.name);
	}

	public static void fun() {
		System.out.println("Having some fun");
	}

	public OOPs_Student(String name, int age) {
		this.name = name;
		this.age = age;
//		System.out.println("My name is " + name + " and age is " + age);
	}
}
