package corejava_assignment1;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		// income tax
			System.out.println("enter ctc: ");
		try (Scanner sc = new Scanner(System.in)) {
			//double slab=sc.nextDouble();
			/*if (slab>=0 && slab<=180000)
				System.out.println("Tax payable is NIL");
			else if (slab>=181001 && slab<=300000)
				System.out.println("Tax payable is 10%");
			else if (slab>=300001 && slab<=500000)
				System.out.println("Tax payable is 20%");
			else if (slab>=500001 && slab<=1000000)
				System.out.println("Tax payable is 30%");
			else if (slab>=1000001)
				System.out.println("you entered the invalid income\n" + "please enter the valid income mentioned in your table");*/
			int ctc=sc.nextInt();
			
			if (ctc<180000) {
				System.out.println("exmpted from taxation due to ctc");
			}
			else if(ctc<300000){
				double tax_amount=ctc*0.1;
				System.out.println("Tax payable is " +tax_amount);
			}
			else if(ctc<500000){
				double tax_amount=ctc*0.2;
				System.out.println("Tax payable is " +tax_amount);
			}
			else if(ctc<1000000){
				double tax_amount=ctc*0.3;
				System.out.println("Tax payable is " +tax_amount);
			}
		}
	}

}
