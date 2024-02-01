import java.util.Locale;
import java.util.Scanner;

public class Verifica_triangulo_sem_POO {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as medidas do triangulo X: ");
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		
		System.out.println("Digite as medidas do triangulo Y: ");
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		// Perimetro
		double p1 = (x1 + x2 + x3) / 2;
		double p2 = (y1 + y2 + y3) / 2;
		
		// Área
		double area1 = Math.sqrt((p1*(p1-x1)*(p1-x2)*(p1-x3)));
		double area2 = Math.sqrt((p2*(p2-y1)*(p2-y2)*(p2-y3)));
		
		// Display das áreas triangulos
		System.out.printf("Area do triangulo 1: %.4f%n", area1);
		System.out.printf("Area do triangulo 2: %.4f%n", area2);
		
		if (area1 > area2) {
			System.out.println("Área maior: Triângulo X");
		}
		else {
			System.out.println("Área maior: Triângulo Y");
		}
		
		
		sc.close();
	}
}

