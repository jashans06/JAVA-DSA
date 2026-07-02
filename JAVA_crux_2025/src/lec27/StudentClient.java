package lec27;



public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hey");
		OOPs_Student s = new OOPs_Student();
		s.name = "jashan";
		s.age=21;
		OOPs_Student s1 = new OOPs_Student();
		s1.name = "jas";
		s1.age=21;
		s1.intro_Yourself();
		s1.sayHi("jashan");
		OOPs_Student.fun();
		s.fun();
		s1.fun();
	}

}
