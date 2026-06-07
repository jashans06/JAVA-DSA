package Lec2;
import java.util.*;
public class questions_datatypes {
	public static void main(String[] args) {
//
//		for(byte i=0;i<128;i++) {
//			System.out.println(i);
//		}

		
		
//		Fahrenheit to celsius or Celsius to Fahrenheit (assignment ques coding blocks) 
//		min fahrenheit = 10;
//		max fahrenheit = 100;
//		step=20;
		
//		Scanner sc=new Scanner (System.in);
//		int minF=sc.nextInt();
//		int maxF=sc.nextInt();
//		int steps=sc.nextInt();
//		
//		for(int i=minF;i<=maxF;i+=steps) {
//			int c=(int) ((5.0/9)*(i-32));
//			System.out.println(i+"\t"+c);
//		}
		
		
		
		//INVERSE OF A NUMBER 
		Scanner sc=new Scanner (System.in);
		int n = sc.nextInt();
		int sum=0;
		int pos=1;
		while(n>0) {
			int rem=n%10;
			sum+=pos*Math.pow(10,rem-1);
			pos++;
			n/=10;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
