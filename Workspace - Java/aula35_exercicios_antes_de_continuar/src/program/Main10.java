package program;

import java.util.Locale;
import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
			nome[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		double[] mediaVetor = new double[n];
		for (int i = 0; i < nome.length; i++) {
			mediaVetor[i] = (nota1[i] + nota2[i]) / 2;
		}
		
		
		System.out.println("\n\nAlunos aprovados");
		for(int i = 0; i < nome.length; i++) {
			if (mediaVetor[i] >= 6) {
				System.out.println("" + nome[i]);
			}
		}
		
		sc.close();
	}
}
