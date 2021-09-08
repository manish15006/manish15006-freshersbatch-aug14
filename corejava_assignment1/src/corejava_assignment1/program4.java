package corejava_assignment1;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		/* Supply marks of three subject and declare the result, result declaration is based on below conditions:

Condition 1:-All subjects marks is greater than 60 is Passed

Condition 2: -Any two subjects marks are greater than 60 is Promoted

Condition 3: Any one subject mark is greater than 60 or all subjects' marks less than 60 is failed.*/
		System.out.println("supply marks of three subjects:");
		try (Scanner input = new Scanner(System.in)) {
			int sub1,sub2,sub3;
			System.out.println("enter 1st subj:");
			sub1= input.nextInt();
			System.out.println("enter 2nd subj:");
			sub2= input.nextInt();
			System.out.println("enter 3rd subj:");
			sub3= input.nextInt();
			System.out.println("result:");
			if(sub1>60 && sub2>60 && sub3>60) {
				System.out.println("passed");
			}
			else if(sub1>60 && sub2>60 || sub1>60 && sub3>60 || sub2>60 && sub3>60) {
				System.out.println("promoted");
			}
			else {
				System.out.println("failed");
			}
		}

	}

}
