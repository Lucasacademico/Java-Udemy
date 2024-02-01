package program;

import java.util.Locale;
import java.util.Scanner;

import entities.class3;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();	
		
		// INSTANCIANDO VETOR OBJETO
		class3[] vetor = new class3[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			
			vetor[i] = new class3(name, age, height);
			
		}
		
		System.out.println();
		
		// soma menores de idade e calcula percentual
		int aux = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i].getAge() < 16) {	
				aux = aux + 1;
			}
		}
		double percent = (aux * 100) / vetor.length;

		// Soma Alturas
		double soma = 0.0;
		for(int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i].getHeight();
		}
		
		// Calcula media de alturas
		double media = soma / vetor.length;
		
		// Saidas
		System.out.println("Altura média: " + String.format("%.2f", media));
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", percent) + "%");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i].getAge() < 16) {	
				System.out.println(vetor[i].getName());
			}
		}
		
		sc.close();
	}

}
