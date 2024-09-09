package sample;

public class Function {
	public static int Multiplication(int a , int b) {
		int sum = a * b;
		return sum;
	}
	
	public static int Division(int a, int b) {
		int sum = a / b;
		return sum;
	}
	public static void main(String[]args) {
		
		int mul = Multiplication(3,7);
		int div = Division(6,7);
		System.out.println(mul);
		System.out.println(div);
		
		
		
	}
	

}


