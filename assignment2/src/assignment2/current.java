package assignment2;
//child2 class
public class current extends bank{
	double cashcredit;
	public current(int acuntnum, String name, double balance) {
		super(acuntnum, name, balance);
		// TODO Auto-generated constructor stub
		this.acctype="current";
		if (balance>10000){
			cashcredit=(0.10*balance);
		}
		else {
			cashcredit=(0.5*balance);
		}
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return (super.getBalance()+cashcredit);
	}
	
	
}
