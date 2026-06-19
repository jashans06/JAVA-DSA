package lec17;

public class Count_SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		System.out.print("\n" + PrintSubSequence(ques, "")); // 2 way to print count
//		System.out.println(count);// using static int count =0
	}

//	static int count = 0; // 1 way to print count 

//	public static void PrintSubSequence(String ques, String ans) {using static int 
	public static int PrintSubSequence(String ques, String ans) { // 2 way to print count 
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = ques.charAt(0);
		int a1 = PrintSubSequence(ques.substring(1), ans);
		int b1 = PrintSubSequence(ques.substring(1), ans + ch);
		return a1 + b1;
	}
}
