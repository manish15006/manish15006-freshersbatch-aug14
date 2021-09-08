package assignment2_7;

public abstract class dessert {
	protected final String name;
	
	public dessert(String name) {
		this.name=name;
	}
	public final String getName() {
		return name;
	}
	public abstract double getcost();
	public abstract double getTax();
	public abstract double currency();
}
