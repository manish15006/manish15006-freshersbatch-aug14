package assignment2;

public class Labour extends Employee {

	public Labour(int id, String name, double salary) {
		super(id, name, salary);
		
	}
	public void overtime() {
		System.out.println("labour has overtime");
	}

}
