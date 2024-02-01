package entities;

public class Rectangle {
	public double x;
	public double y;
	
	public double Area() {
		return x * y;
	}
	
	public double Perimeter() {
		return 2 * (x + y);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
}
