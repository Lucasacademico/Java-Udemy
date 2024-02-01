/*IMPORTANTE: NÃO É POSSÍVEL INSERIR ESPAÇOS NA ENTRADA*/

// Biblioteca Scanner
import java.util.Scanner;

public class Lendo_strings {

	public static void main(String[] args) {
		
		// Estrutura de variavel Scanner
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next(); // Lê a string do usuário no console e armazena no x
		System.out.println("Você digitou: " + x);
		//Encerrar recurso Scanner
		sc.close();
		
	}
}