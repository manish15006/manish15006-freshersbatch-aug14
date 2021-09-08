package assignment2;

public class Manager extends Employee {
	public static double bonus=0.2;

	public Manager(int id, String name, double salary) {
		
		super(id, name, salary);
		// employee class methods are override by manager class
	}
	public double getSalary() {
		return salary+salary*bonus;
	}

}
