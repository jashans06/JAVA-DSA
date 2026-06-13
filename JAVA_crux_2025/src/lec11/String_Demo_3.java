package lec11;

public class String_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(10 + s + 30 + 40); // string + int always gives a string
		System.out.println(10 + 30 + 40 + s); // now s is at last so int + int =int so op will be 80hello
		System.out.println(10 + s + (30 + 40)); // op 10hello70
		
		
		
		
	}

}
