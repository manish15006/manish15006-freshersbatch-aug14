package assignment5;

public class employee {
	private int id;
	private String name;
	private double salary;
	private String department;
	public employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public String toString() {
		return "id: "+id +" name: "+name+" salary: "+salary+" department: "+department;
	}
}
