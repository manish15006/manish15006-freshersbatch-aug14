package assignment9;

public class fruit {
	
	private final String name;
	private final int calories;
	private final int price;
	private final String color;
	public fruit(String name, int calories, int price, String color) {
		
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public int getCalories() {
		return calories;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "fruit [name=" + this.name + ", calories=" + this.calories + ", price=" + this.price + ", color=" + this.color + "]";
	}
	public static void add(String string, int i, int j, String string2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
