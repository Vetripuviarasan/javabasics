package sample;

public class HDFC extends Bank {
	public void current() {
		System.out.println("current");
	}
	public void salary() {
		System.out.println("salary");
	}
	public static void main(String[]args) {
		HDFC obj = new HDFC();
		obj.current();
		obj.salary();
		obj.savings();
	}
	

}
