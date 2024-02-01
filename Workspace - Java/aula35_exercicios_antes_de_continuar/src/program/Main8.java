package program;

import java.util.Locale;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double maiorValor = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}
		
		int maiorPosicao = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > vetor[maiorPosicao]) {
				maiorPosicao = i;
			}
		}
		
		System.out.print("\n\nMAIOR VALOR = " + maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR = " + maiorPosicao);
		
		
		
		sc.close();
	}

}
