package program;

import java.util.Locale;
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
			
		double soma = 0;
		int aux = 0;
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				soma = soma + vetor[i];
				aux = aux + 1;
			}
		}
		
		
		double media_par = soma / aux;
		if (soma == 0) {
			System.out.println("Nenhum número PAR");
		}
		else {
			System.out.printf("Media dos pares: %.1f", media_par);
		}

			
		sc.close();
	}
}