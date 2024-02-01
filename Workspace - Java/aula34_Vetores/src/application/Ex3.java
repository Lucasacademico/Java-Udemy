package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] vect_nome = new String[n];
		double[] vect_preco = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect_nome[i] = sc.next();
			vect_preco[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma = soma + vect_preco[i];
		}
		
		double media = soma / n;
		System.out.printf("Media dos preços: %.2f%n", media);
		
		sc.close();
	}

}