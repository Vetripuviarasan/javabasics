package sample;

public class Comparelogical {
	public static void main(String[]args) {
		int a = 50;
		int b = 60;
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println((a<b)&&(a==b));
		System.out.println((a<b)||(a==b));
		System.out.println(!((a<b)&&(a==b)));
		System.out.println(!((a<b)||(a==b)));
		
		
		
	}

}
