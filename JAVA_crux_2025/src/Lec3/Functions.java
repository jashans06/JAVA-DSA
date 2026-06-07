package Lec3;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Kidaan");
		int a = 9;
		int b = 4;
		Add(a,b);  //FUNCTION CALLING non-param
		Add(8,2);  //FUNCTION CALLING non-param
		
	}
     //NON-PARAMATERIZED FUNCTION
	
//	public static void Add() {
//
//		int a = 11;
//		int b = 17;
//		int c = a + b;
//		Sub();  //FUNCTION CALLING
//		System.out.println(c);
//		
//	}
//	public static void Sub() {
//
//		int a = 11;
//		int b = 17;
//		int c = a - b;
//		System.out.println(c);
//		
//	}
	
	//PARAMATERIZED FUNCTION
	public static void Add(int a,int b) {
		
		int c = a + b;
		System.out.println(c);
		
	}
}
