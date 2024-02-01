package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Vetor5;

public class Main5_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		System.out.println();
		Vetor5[] vetor = new Vetor5[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o nome do produto " + (i + 1) + ": ");
			String name = sc.next();
			
			System.out.print("Digite o preço do produto " + (i + 1) + ": ");
			double price = sc.nextDouble();
			
			vetor[i] = new Vetor5(name, price);
		}
		
		System.out.println();
		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i].getPreco();
		}
		
		double media = soma / vetor.length;
		
		System.out.println();
		System.out.printf("Média de preços: %.2f", media);
		
		sc.close();
	}

}
