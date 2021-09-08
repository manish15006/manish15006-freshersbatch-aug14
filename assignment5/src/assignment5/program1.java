package assignment5;

import java.util.HashSet;
import java.util.Set;

public class program1 {

	public static void main(String[] args) {
		
		employee e1=new employee(01,"ben ",1001,"CN");
		employee e2=new employee(02,"gwen ",1002,"CN1");
		employee e3=new employee(03,"max ",1003,"CN2");
		employee e4=new employee(04,"kevin ",1004,"CN3");
		employee e5=new employee(05,"jullie ",1005,"CN4");
		employee e6=new employee(06,"auntmey ",1006,"CN5");
		
		Set<employee> employees=new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		System.out.print(employees);
	}

}
