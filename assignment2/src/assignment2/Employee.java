package assignment2;

public class Employee {
	int id; //employeeID
	String name; //name of the employee
	double salary; //salary of the employee	
	
	public Employee(int id, String name, double salary) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
