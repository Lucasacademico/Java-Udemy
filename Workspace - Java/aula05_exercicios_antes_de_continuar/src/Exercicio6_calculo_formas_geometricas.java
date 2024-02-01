import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_calculo_formas_geometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Variaveis de calculo
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		// Variaveis auxiliadora pi
		double pi = 3.14159;
		
		// Variaveis formulas
		double triang_ret = (A*C)/2;
		double circulo = pi * Math.pow(C, 2);
		double trapezio = ((A + B) * C)/2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
		
		System.out.printf("Triangulo: %.3f%n", triang_ret);
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.printf("trapezio: %.3f%n", trapezio);
		System.out.printf("quadrado: %.3f%n", quadrado);
		System.out.printf("retangulo: %.3f%n", retangulo);
		
		sc.close();
	}

}
