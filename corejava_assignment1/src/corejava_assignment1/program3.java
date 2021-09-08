package corejava_assignment1;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("simple and compound interest: ");
		
		double pr,rate,t,sim,com;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("enter the amount: ");
			pr= input.nextDouble();
			System.out.println("enter the no.of years: ");
			t=input.nextDouble();
			System.out.println("enter the rate of interest: ");
			rate=input.nextDouble();
		}
		sim=(pr*t*rate)/100;
		com=pr*Math.pow(1.0+rate/100.0,t)-pr;
		System.out.println("simple interest:" +sim);
		System.out.println("compound interest:" +com);
	}

}
