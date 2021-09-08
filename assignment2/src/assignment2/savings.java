package assignment2;
//child1 class
public class savings extends bank {
	double fixeddeposit;

	public savings(int acuntnum, String name, double balance) {
		super(acuntnum, name, balance);
		// TODO Auto-generated constructor stub
		this.acctype="savings";
		fixeddeposit=20000;
	}
	//method overriding to get total balance
	public double getBalance() {
		return (super.getBalance()+fixeddeposit);
	}
}
