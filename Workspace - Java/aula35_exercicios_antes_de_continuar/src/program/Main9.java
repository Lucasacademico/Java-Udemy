package program;

import java.util.Locale;
import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] vetorNomes = new String[n];
		int[] vetorIdades = new int[n];

		for (int i = 0; i < vetorIdades.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			vetorNomes[i] = sc.next();
			System.out.print("Idade: ");
			vetorIdades[i] = sc.nextInt();
		}
		
		int maiorIdade = 0;
		for (int i = 0; i < vetorIdades.length; i++) {
			if (vetorIdades[i] > vetorIdades[maiorIdade]) {
				maiorIdade = i;
			}
		}
		
		System.out.println("\n\nPESSOA MAIS VELHA: " + vetorNomes[maiorIdade]);
		
		sc.close();
	}

}