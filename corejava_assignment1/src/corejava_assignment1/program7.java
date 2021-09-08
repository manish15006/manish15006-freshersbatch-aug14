package corejava_assignment1;

import java.util.Scanner;

public class program7 {
	
	public static void main(String[] args) {
		int [] array= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Enter the number to search: ");
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int num,count=0;
		num= input.nextInt();
		//to search the number in array
		for(int i=0;i<array.length;i++) {
			if (array[i]==num) {
				count++;
			}
		}
		//output if number is present or not
		if(count>0) {
			System.out.println("number"+num+" is present in array and occured"+count+"times");
		}
		else {
			System.out.println("number is not present in array");
		}
	}
}
