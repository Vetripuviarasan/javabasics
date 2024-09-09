package sample;

public class sample1 {
	public void studentDetails(String name) {
		System.out.println(name);		
	}
	public void studentDetails(int age) {
		System.out.println(age);
	}
	public void studentDetails(char initial) {
		System.out.println(initials);
	}
	
	public static void main(String[]args) {
		sample1 obj = new sample1();
		obj.studentDetails("luckie");
		obj.studentDetails(5);
		
		
	}

}
