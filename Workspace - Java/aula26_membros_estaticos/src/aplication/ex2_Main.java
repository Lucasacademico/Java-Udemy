package aplication;

import java.util.Locale;
import java.util.Scanner;
import util.Circ2;

public class ex2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Circ2 circ = new Circ2();
		
		System.out.print("Enter radius: ");
		circ.radius = sc.nextDouble();
		
		double x = circ.Circumference();
		double y = circ.Volume();
		
		System.out.printf("Circumference: %.2f%n", x);
		System.out.printf("Volume: %.2f%n", y);
		System.out.printf("PI: %.5f%n", circ.PI);
				
		sc.close();
	}

}
