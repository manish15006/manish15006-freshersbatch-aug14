package assignment2_5;

public class line extends shape {
	public final double m ;
	public final double x ;
	public final double c ;
	public line() {
		this(1,1,1);
	}
	public line(double m, double x, double c) {
		// TODO Auto-generated constructor stub
		this.m = m;
		this.x = x;
		this.c = c;
		
		
	}
	public double y() {
		return (m*x)+c;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
