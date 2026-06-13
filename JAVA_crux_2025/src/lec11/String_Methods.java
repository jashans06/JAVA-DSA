package lec11;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str1 = new String("hello");
		String str2 = "hello";
		String str3 = new String("hello");
//		int a=9;
//		int b=9;
//		System.out.println(a==b); // it will compare the actual value in a and b
		
		System.out.println(str==str1);// it will compare the address of str and str1 thats why it gives false
		System.out.println(str==str2);
		System.out.println(str.equals(str2)); // this will compare the content in str and str2
		String s="hellookeyheybye";
		System.out.println(s.substring(1,3)); //last index is not included (excluding 3)
		System.out.println(s.substring(5)); // only beginning index
		System.out.println(s.substring(3,3)); // will not print anything 0 length 
	}

}
