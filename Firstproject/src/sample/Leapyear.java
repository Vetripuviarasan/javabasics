package sample;

public class Leapyear {
	public static void main (String[]args) {
		int year = 2004;
		if(year % 4 ==0 || year % 400 == 0 ||year % 100 ==0) {
			System.out.println("is a Leap year");
		}else {
			System.out.println("is not a Leap year");
		}
	}
}