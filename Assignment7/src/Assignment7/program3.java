package Assignment7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface Execute{
	int sequence();
}
public class program3 {

	@Execute(sequence=2)
	public static void myMethod1() {
		System.out.println("method 1 executing");
	}
	@Execute(sequence=1)
	public static void myMethod2() {
		System.out.println("method 2 executing");
	}
	@Execute(sequence=3)
	public static void myMethod3() {
		System.out.println("method 3 executing");
	}
	
}
