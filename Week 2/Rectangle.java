public class Rectangle extends Shape {
	private Point topLeft;
	private double width; 
	private double length;

	public Rectangle(double x, double y, double length,double width) {
		super("rectangle");
		topLeft = new Point(x, y);
		this.width = width;
		this.length = length;
	}

	public double getWidth() { return width; }//get width

	public double getLength() { return length; }//get length

	public Point getTopLeft() { return topLeft; }

	public void setWidth(double width) {//set width
		this.width = width;
	}

	public void setLength(double length) {//set length
		this.length = length; 
	}

	public double getArea() { //formula of calculate area of rectangle
		return width * length;
	}

	public String toString() {//dispaly format
		return "top left=" + topLeft.toString() + "; width=" + width + "; Length=" + length;
	}
}
