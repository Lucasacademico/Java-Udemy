package ex1_rectangle;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Chamada de classe
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		rectangle.x = sc.nextDouble();
		rectangle.y = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", rectangle.Area());
		System.out.printf("PERIMETER: %.2f%n", rectangle.Perimeter());
		System.out.printf("DIAGONAL: %.2f%n", rectangle.Diagonal());
		
		sc.close();
	}

}
