package sample;
import java.util.*;

public class Addition {
	
	public static int addition(int a , int b) {
		int sum = a + b;
		return sum;
	}
	
	public static int subraction(int a, int b) {
		int sum = a - b;
		return sum;
	}
	
	public static int Multiplication(int a , int b) {
		int sum = a * b;
		return sum;
	}
	
	public static int Division(int a, int b) {
		int sum = a / b;
		return sum;
	}
	public static void main(String[]args) {
		
		int ad = addition(3,7);
		int sub = subraction(6,7);
		int mul = Multiplication(5,8);
		int Div = Division(6,8);
		System.out.println(ad);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(Div);
		
		
		
	}
	

}
 