package assignment4;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		// Arithmetic exception handling
		try {
			int a,b,c;
			@SuppressWarnings("resource")
			Scanner input=new Scanner(System.in);
			System.out.println("enter 1st num: ");
			a=input.nextInt();
			System.out.println("enter 2nd num: ");
			b=input.nextInt();
			c=a/b;
			System.out.println("answer: "+c);
		}
		catch(ArithmeticException d) {
			System.out.println("error: "+d.getMessage());
			System.out.println("error:"+d);
		}
		System.out.println("***the end****");
	}
}
