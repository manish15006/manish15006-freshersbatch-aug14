package assignment2_5;

public class rectangle  extends shape{
	
	private final double width, length; //sides
	
	public rectangle() {
		this(1,1);
	}
	public rectangle (double width, double length) {
		this.width=width;
		this.length=length;
	}

	@Override
	public double area() {
		// A=w*l
		return width*length;
	}

	@Override
	public double perimeter() {
		// P=2(w+l)
		return 2*(width+length);
	}
	
}
