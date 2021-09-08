package assignment2_5;

public class cube extends shape {
	private final double breadth,length1,height; 
	
	public cube(){
		this(1,1,1);
	}
	public cube(double breadth,double length1,double height) {
		this.breadth=breadth;
		this.length1=length1;
		this.height=height;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2*(length1*breadth+breadth*height+length1*height);
		
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*(length1+breadth+height);
	}

}
