package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ex1_Main {

	public static final double PI = 3.14159; // Variavel estática - Inalterável
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Radius: ");
		double radius = sc.nextDouble();
		
		System.out.printf("Circumference: %.2f%n", Circumference(radius));
		System.out.printf("Sphere Volume: %.2f%n", Volume(radius));
		System.out.printf("PI Value: %.5f%n", PI);
		
		sc.close();
	}

	public static double Circumference(double radius) {
		return 2 * PI * radius;	
	}
	
	public static double Volume(double radius) {
		return 4/3 * PI * Math.pow(radius, 3) / 3;
	}
	
	
	
}
