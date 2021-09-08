package assignment2_7;

public class candy extends dessert {
	
	private double candyWeight;
	private double candyPrice;// Candy constructor takes a String for name & double for weight in lbs.// and price per lb.
	private Object dollar;
	
	public candy(String name, double candyWeight, double candyPrice, Object dollar) {
		super(name);
		this.candyWeight = candyWeight;
		this.candyPrice = candyPrice;
		this.dollar=dollar;
	}
	public double getWeightInPounds() {
		return candyWeight;
	}
	public double getPricePerPound() {
		return candyPrice;
	}
	@Override
	public double getcost() {
		// TODO Auto-generated method stub
		double cost = (double) Math.round(candyPrice * candyWeight);
		return cost;
	}
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return 0.1*getcost();
	}
	@Override
	public double currency() {
		// TODO Auto-generated method stub
		return (double) (dollar=60);
	}
	
}
