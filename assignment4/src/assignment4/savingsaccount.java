package assignment4;

public class savingsaccount {
	public long id;
	private double balance;
	public savingsaccount(long id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	double withdraw(double amount) {
		if (amount>balance||balance==0) {
			throw new Insufficientbalanceexception("Insufficient Balance");
		}
		else if(amount<0) {
			throw new Illegalbanktransactionexception("IllegalBank Transaction");
		}
		else {
			this.balance=balance-amount;
			return this.balance;
		}
	}
	double deposit(double amount) {
		System.out.println("deposit amount");
		balance=balance+amount;
		return balance;
		
	}
}
