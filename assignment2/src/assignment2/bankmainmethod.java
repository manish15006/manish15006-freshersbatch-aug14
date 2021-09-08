package assignment2;
//main app class
public class bankmainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank s1=new savings(1,"kiran",10000);
		bank c1=new current(2,"prasad",25000);
		System.out.println("bal of s1= "+s1.getBalance());
		System.out.println("bal of c1= "+c1.getBalance());
		System.out.println("total cash in bank= "+(s1.getBalance()+c1.getBalance()));
	}

}
