package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Ex4_class;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Ex4_class[] vect = new Ex4_class[n]; // Transforma objeto em vetor
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Ex4_class(name, price);
		}
		
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma = soma + vect[i].getPrice();
		}
		
		double media = soma / vect.length;
		
		System.out.printf("Media preços: %.2f%n", media);
		
		sc.close();
	}

}
