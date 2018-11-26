public class Circle extends Shape{
	private Point center;// define center
	private  double radius;//define radius
	
	public Circle(double x, double y,double radius) {
		super("circle");
		this.radius = radius;
		center = new Point(x, y);
	}
	
	public double getRadius() { return radius; }//get radius

	public Point getCenter() { return center; }//get center

	public void setRadius(double r) { //set radius
		radius = r;
	}

	public void setCenter(Point p) {//set center
		center = p;
	}

	public double getArea() { 
		return Math.PI*radius*radius;//formula to calculate area of Circle
	}

	public String toString() {
		return "center=" + center.toString() + "; radius=" + radius; //show message format
	}

	
}