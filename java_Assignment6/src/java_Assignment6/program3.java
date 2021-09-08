package java_Assignment6;

import java.util.Iterator;
import java.util.TreeSet;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<employee> obj=new TreeSet<>(new FirstComparator());
		obj.add(new employee(1,"Tony",2000.0,"Tech"));
		obj.add(new employee(2,"Steve",2000.0,"Solider"));
		obj.add(new employee(3,"Peter",2000.0,"student"));
		obj.add(new employee(4,"Strange",2000.0,"Multiverse"));
		obj.add(new employee(5,"Shang",2000.0,"10 rings"));
		obj.add(new employee(6,"Bruce",2000.0,"smash"));
		obj.add(new employee(7,"Natasha",2000.0,"Agent"));
		obj.add(new employee(8,"pepper",2000.0,"Management"));
		obj.add(new employee(9,"Loki",2000.0,"Time travel"));
		obj.add(new employee(10,"wanda",2000.0,"magic"));
		
		for(employee e :obj) {
			System.out.println(e);
		}
		
		//System.out.println("select the options:\n");
	
		//System.out.println("a) id: " );
	}

}
