package assignment2;

public class mainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labour l1=new Labour(1,"kiran",10000);
		Labour l2=new Labour(2,"prasad",10000);
		Manager m1=new Manager(1,"nitish",40000);
		Manager m2=new Manager(2,"naveen",38000);
		
		System.out.println("name of employee: "+l1.getName()+"- "+"salary: "+l1.getSalary());
		System.out.println("name of employee: "+l2.getName()+"- "+"salary: "+l2.getSalary());
		System.out.println("name of employee: "+m1.getName()+"- "+"salary: "+m1.getSalary());
		System.out.println("name of employee: "+m2.getName()+"- "+"salary: "+m2.getSalary());

	}

}
