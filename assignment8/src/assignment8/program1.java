package assignment8;

public class program1 {
	
	public static void main(String[] args) {
		Arithmaticoperations add=(int a,int b)->a+b;
		System.out.println(add.operation(10, 2));
		Arithmaticoperations sub=(int a, int b)->a-b;
		System.out.println(sub.operation(10, 2));
		Arithmaticoperations mul=(int a, int b)->a*b;
		System.out.println(mul.operation(10, 2));
		Arithmaticoperations div=(int a, int b)->a/b;
		System.out.println(div.operation(10, 2));
		Arithmaticoperations modu=(int a, int b)->a%b;
		System.out.println(modu.operation(10, 2));
	}
}
interface Arithmaticoperations{
	int operation(int x, int y);
	
}