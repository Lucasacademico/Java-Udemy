package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // Pergunta tam do vet
		double[] vect = new double[n]; // criação e instanciação de vetor para uso
		
		// Laço FOR para ler valores vetor
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		// Laço FOR para imprimir vetor
		for (int i = 0; i < n; i++) {
			System.out.println(vect[i]);
		}
		
		sc.close();
	}

}
