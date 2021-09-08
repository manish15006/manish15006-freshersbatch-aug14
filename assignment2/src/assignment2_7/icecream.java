package assignment2_7;

public class icecream extends dessert {
	private double cost;
	
	public icecream(String name,double cost) {
		super(name);
		this.cost=cost;
	}

	@Override
	public double getcost() {
		// TODO Auto-generated method stub
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
		return "rupees";
	}
	
}
