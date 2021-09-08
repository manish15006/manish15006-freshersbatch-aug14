

package corejava_assignment1;
import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		System.out.println("Enter 3 digit numbers to find its Armstrong or not: ");
		try (Scanner input = new Scanner(System.in)) {
			int number = input.nextInt();
			if(Armstrong(number)) {
				System.out.println("number: " +number + " is armstrong number");
			}
			else {
				System.out.println("number:" +number +"is not armstrong number");
			}
		}

	}
	private static boolean Armstrong(int number) {
		int result =0;
		int orig = number;
		while(number != 0) {
			int remainder = number%10;
			result = result + remainder*remainder*remainder;
			number=number/10;
		}
		if(orig==result) {
			return true;
		}
		return false;
	}

}
