package entities;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	
	public void Aprovacao () {
		double aux = n1 + n2 + n3;
		if (aux >= 60) {
			System.out.printf("Final Grade: %.2f%n", aux);
			System.out.println("PASS");
		}
		else {
			System.out.printf("Final Grade: %.2f%n", aux);
			System.out.println("FAILED");
			System.out.println("MISSING " + Math.abs(aux - 60) + " POINTS");
			
		}
	}
	
}
