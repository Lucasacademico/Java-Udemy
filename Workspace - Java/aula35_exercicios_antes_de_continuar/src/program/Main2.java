package program;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		double soma = 0.0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			soma = soma + vetor[i];
		}
		
		double media = soma / vetor.length;
		
		// Saídas
		System.out.print("VALORES = ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf(" " + vetor[i]);
		}
		
		System.out.print("Soma = " + soma);
		System.out.print("Media = " + media);
		
		
		sc.close();
	}
}