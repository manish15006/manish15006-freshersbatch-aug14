package corejava_assignment1;
import java.util.*;
public class program9 {
	
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		System.out.println("enter the marks of each student in 3 subjects:");
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("student1 marks");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(j==0) {
						System.out.println("enter A:");
					}
					a[i][j]=input.nextInt();
					
					if(j==0) {
						System.out.println("enter B");
					}
					else if(j==1) {
						System.out.println("enter C");
					}
				}
				if(i==1) {
					System.out.println("student3 marks");
				}
				else if (i==0){
					System.out.println("student2 marks");
				}
			}
		}
		System.out.println("sum and avg marks of each student:");
		for(int i=0;i<3;i++) {
			int sum=0,avg=0;
			for(int j=0;j<3;j++) {
				sum=sum+a[i][j];
			}
			avg= sum/3;
			System.out.println("sum: " +sum+" " + "avg: " +avg);
			if(i==0) {
				System.out.println("student1 is above");
			}
			else if (i==1) {
				System.out.println("student2 is above");
			}
			else {
				System.out.println("student3 is above");
			}
		}
	}
}
