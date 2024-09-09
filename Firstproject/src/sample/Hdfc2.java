package sample;

public class Hdfc2 implements Banking {
	public void savings() {
		System.out.println("savings");
	}
	public void salary() {
		System.out.println("salary");
	}
	public void current() {
		System.out.println("current");
	}
	public static void main(String[]args) {
		Hdfc2 obj = new Hdfc2();
		obj.savings();
		obj.salary();
		obj.current();
	}

}
