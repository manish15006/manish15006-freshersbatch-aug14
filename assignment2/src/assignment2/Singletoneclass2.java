package assignment2;

public class Singletoneclass2 {

	public static void main(String[] args) {
		
		singletoneclass x= singletoneclass.getInstance();
		singletoneclass y= singletoneclass.getInstance();
		singletoneclass z= singletoneclass.getInstance();
		System.out.println("hashcode x id "+x.hashCode());
		System.out.println("hashcode y id "+y.hashCode());
		System.out.println("hashcode z id "+z.hashCode());
		
		if(x==y && y==z) {
			System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
		}
		else {
			System.out.println("Three objects DO NOT point to the same memory location on the heap");
		}
	}

}
