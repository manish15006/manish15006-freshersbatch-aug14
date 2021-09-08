package assignment2;
//parent class
public class bank {
	int acuntnum;
	String name;
	String acctype;
	private double balance;
	//argument constructor
	public bank(int acuntnum,String name, double balance) {
		this.acuntnum=acuntnum;
		this.name=name;
		this.acctype="acctype";
		this.balance=balance;
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	
}
