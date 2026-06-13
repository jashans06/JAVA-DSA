package lec11;

public class Compare_To {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "kamal";
		String s2 = "komal";
		// given two strings we want to check which string is small and which
		// string is large according to dictionary wise (lexeogrpahically)

		System.out.println(s1.compareTo(s2));// built in compareTo fxn
		
		System.out.println(compareTo(s1, s2));// our compareTo fxn
	}

	public static int compareTo(String s1, String s2) {
		if (s1 == s2) {
			return 0;
		}
		for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i); // if diff is positive mtlb s1>s2 and if diff is -ve 
				//s1<s2
			}
		}
		return s1.length() - s2.length();
	}
}
