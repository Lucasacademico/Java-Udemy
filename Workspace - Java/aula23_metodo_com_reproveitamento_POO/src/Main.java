import java.util.Locale;
import java.util.Scanner;
import entities.Triangle; // importando entidade triangulo
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		//Lendo valores
		System.out.println("Enter the measures of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		// Chamada de método para calculo da área
		double areax = x.area();
		double areay = y.area();
		
		// Chamada display de resultado
		display(areax, areay);
		
		sc.close();
	}

	// Criação da função display com IF
	public static void display(double a1, double a2) {
		if (a1 > a2) {
			System.out.printf("Triangulo x: %.4f%n", a1);
			System.out.printf("Triangulo y: %.4f%n", a2);
			System.out.println("Higher triangle: x");
		}
		else {
			System.out.printf("Triangulo x: %.4f%n", a1);
			System.out.printf("Triangulo y: %.4f%n", a2);
			System.out.println("Higher triangle: y");
		}
	}
		
}
