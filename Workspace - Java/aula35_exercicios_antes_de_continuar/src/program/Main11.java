package program;

import java.util.Locale;
import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i = 0; i < altura.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);	
		}
		
		double menorAltura = 100;
		for (int i = 0; i < altura.length; i++) {
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		double maiorAltura = 0;
		for (int i = 0; i < altura.length; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		
		double somaAltura = 0.0;
		int cont = 0;
		for (int i = 0; i < genero.length; i++) {
			if (genero[i] == 'f' || genero[i] == 'F') {
				somaAltura = somaAltura + altura[i];
				cont++;
			}
		}
		
		double mediaAltura = somaAltura / cont;
		
		int qtdHomem = 0;
		for (int i = 0; i < altura.length; i++) {
			if (genero[i] == 'm' || genero[i] == 'M') {
				qtdHomem++;
			}
		}
		
		System.out.print("\n\nMenor Altura: " + String.format("%.2f", menorAltura));
		System.out.print("\nMaior Altura: " + String.format("%.2f", maiorAltura));
		System.out.print("\nMedia das alturas das mulheres: " + String.format("%.2f", mediaAltura));
		System.out.print("\nNumero dos homens: " + qtdHomem);
		
		
		sc.close();
	}
}
