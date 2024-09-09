package sample;

import java.util.Scanner;

public class Scannerexception{
	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		System.out.println("your name");
		String b = abc.nextLine();
		try {
			System.out.println(10/0);
		}catch(Exception e)
	
			e.printStackTrace();
		}
		System.out.println("hello");
	}

}
