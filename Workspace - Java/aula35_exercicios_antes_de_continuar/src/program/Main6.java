package program;

import java.util.Locale;
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
		}
		
		double media = soma / vetor.length;
		
		System.out.println("\n");
		
		System.out.print("Media do vetor: " + String.format("%.3f", media));
		System.out.println();
		System.out.println("Elementos abaixo da média: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		
		sc.close();
	}
}