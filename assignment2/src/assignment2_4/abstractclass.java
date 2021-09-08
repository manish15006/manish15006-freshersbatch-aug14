package assignment2_4;

public abstract class abstractclass {
	/*if any class has any of its method abstract 
	then you must declare entire class abstract*/ 
	//abstract class cannot be final
	//you can declare a class abstract without having any abstract method
	public void mymethod() {
		System.out.println("hello");
	}
	abstract public void anothermethod();
	//abstract class cannot be private
	abstract private void id();
	
	
public class demo extends abstractclass{ 
	
	
	@Override
	public void anothermethod() {
		// TODO Auto-generated method stub
		System.out.println("abstract method");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractclass obj=new abstractclass(); //we cannot instantiate an abstract class
		obj.anothermethod();
	}

}
