package assignment2_5;

public class main {


	public static void main(final String[] args) {
		//rectangle
		double width = 5, length = 7;
        shape rectangle = new rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");
        //cube
        double breadth = 5, length1 = 5; int height = 5 ;
        shape cube = new cube(breadth,length1,height);
        System.out.println("cube breadth: " + breadth + " and length1: " + length1
                + "and height" +height + "\nResulting area: " + cube.area()
                + "\nResulting perimeter: " + cube.perimeter() + "\n");
        //line
        double m= 1, x = 1;int c = 5 ;
        shape line = new line(m,x,c);
        System.out.println("line m: " + m + " and x: " + x+ "and c: "+c
                + "\nResulting area: " + cube.area()
                + "\nResulting perimeter: " + cube.perimeter() + "\n");
	}

}
