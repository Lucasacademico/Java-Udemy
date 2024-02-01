package program;

import java.util.Locale;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		
		int aux = 0;
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				aux = aux + 1;
			}
		}
		
		System.out.println("\n");
		System.out.println("Quantidade de pares = " + aux);
		
		
		
		
		sc.close();
	}

}