package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Circ3;

public class ex3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		// Chamada de métodos de classe Circ3 sem instanciar objeto
		double c = Circ3.Circumference(radius);
		double v = Circ3.Volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.5f%n", Circ3.PI);
		
		
		
				
		sc.close();
	}

}
