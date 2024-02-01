package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		// Variavel para somar vetores
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma = soma + vect[i];
		}
		
		// Variavel para calcular media
		double media = soma / n;
		System.out.println("Media: " + media);
		
		sc.close();
	}

}