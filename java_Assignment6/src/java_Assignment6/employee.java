package java_Assignment6;

public class employee {
	
	public Integer id;
	public String name;
	public Double salary;
	public String department;
	public employee(Integer id, String name, Double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [id =" + this.id + ", name = " +this.name +", salary= "+ this.salary +", department= "+ this.department+"]";
	}
	
	
	
	
}
