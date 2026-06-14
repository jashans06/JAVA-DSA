package Lec1;

import java.util.Scanner;

public class logic_class {

	public static void main(String[] args) {
		// PRIME NUMBER
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int count = 0;
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				count++;
//			}
//		}
//		if (count >= 1) {
//			System.out.println("Nunmber is not prime");
//		} else {
//			System.out.println("Number is prime");
//		}

		// PRIME NUMBER USING BREAK STATEMENT
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int count = 0;
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				count++;
//				break;
//			}
//		}
//		if (count == 1) {
//			System.out.println("Number is not prime");
//		} else {
//			System.out.println("Number is prime");
//		}
//		

		// FIBONACCI SUM (for n number of terms)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a=0;
//		int b=1;
//		for (int i=1;i<=n;i++) {
//		int c=a+b;
//		a=b;
//		b=c;
//		}
//		System.out.print(a);

		// FIBONACCI SERIES PRINT (for n number of terms)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a=0;
//		int b=1;
//		for (int i=1;i<=n;i++) {
//			System.out.println(a);
//		int c=a+b;
//		a=b;
//		b=c;
//		}
//	System.out.print(a);

		// GREATEST COMMON DIVISOR (GCD) OR HIGHEST COMMON FACTOR (HCF)
//		int divisor=36;
//		int divident=60;
//		while(divident%divisor!= 0) {
//			int rem=divident%divisor;
//			divident=divisor;
//			divisor=rem;
//		}
//		System.out.println(divisor);
//		

//		SUM OF A DIGIT (MODULO THE GIVEN DIGIT OR NUMBER WITH 10)
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		int sum=0;
//		while(num>0) {
//			int rem=num%10;
//			sum=sum+rem;
//			num/=10;
//		}
//		System.out.println(sum);

//		integer Palindrome 

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPlaindrome(n));
	}

	public static boolean isPlaindrome(int n) {
		int original = n;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		if (rev == original) {
			return true;
		}
		return false;
	}

}
