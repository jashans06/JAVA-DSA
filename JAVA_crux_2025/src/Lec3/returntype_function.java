package Lec3;

public class returntype_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jioo modii");
		int a=7;
		int b=5;
//		Add(a,b);// this will not print the result because the return value c is lost as we don,t print or save it in any variable
	int ans=Add(a,b);//now we have stored the returned value in ans variable and have printed ans in next line 
	System.out.println(ans);
	}
	
	public static int Add(int a,int b) {
		int c = a + b;
		System.out.println(Sub(c,a));
		return c;
	}
	public static int Sub(int c,int d) {
		return c-d;
	}
	
}
