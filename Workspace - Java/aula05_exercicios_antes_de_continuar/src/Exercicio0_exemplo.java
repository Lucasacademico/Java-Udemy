import java.util.Locale;
import java.util.Scanner;

// Este Exerc�cio � um exemplo de como deveremos fazer nossos exerc�cios
// https://www.youtube.com/watch?v=Ah1Y6d6deq0

/*
 * Fazer um programa para ler as medidadas da largura e comprimento de um terreno
 * retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
 * com duas casas decimais. Em seguida, o programa deve mostrar o valor da �rea do
 * terreno, bem como o valor do pre�o do terreno, ambos com duas casas decimais, 
 */

public class Exercicio0_exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Entradas de dado
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double preco_quadrado = sc.nextDouble();
		
		// Atribui��es
		double area = largura * comprimento;
		double preco_final = preco_quadrado * area;
		
		// Impress�o de valores
		System.out.printf("Area do terreno: %.2f%n", area);
		System.out.printf("O pre�o final do terreno �: R$ %.2f%n", preco_final);
		
		sc.close();
	}

}
