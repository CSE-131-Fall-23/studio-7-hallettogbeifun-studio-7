package studio7;

public class Rectangle {
	private double length;
	private double width; 
	
	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}
	
	public double perimeter() {
		return ((length * 2) + (width * 2));
	}
	
	public double area() {
		return length * width;
	}
	
	public boolean isSquare() {
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}
}
