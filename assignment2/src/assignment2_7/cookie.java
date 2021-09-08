package assignment2_7;

public class cookie extends dessert {
	
	private int cookieCount;
	private double cookiePrize;
	
	public cookie(String name, int cookieCount, double cookiePrize) {
		super(name);
		this.cookieCount = cookieCount;
		this.cookiePrize = cookiePrize;
	}
	public double getItemCount() {
		return cookieCount;
	}
	public double getPricePerDozen() {
		return cookiePrize;
	}
	@Override
	public double getcost() {
		// TODO Auto-generated method stub
		double cost = (double) Math.round(cookiePrize * cookieCount / 12);
		return cost;
	}
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return 0.1*getcost();
	}
	@Override
	public String currency() {
		// TODO Auto-generated method stub
		return "euro";
	}
}
