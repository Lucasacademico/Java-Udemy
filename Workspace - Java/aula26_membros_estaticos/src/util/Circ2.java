package util;

public class Circ2 {
	
	public final double PI = 3.14159;
	public double radius;
	
	public double Circumference () {
		return 2.0 * PI * radius;
	}
	
	public double Volume () {
		return 4 * PI * Math.pow(radius, 3) / 3;
	}
	
}
