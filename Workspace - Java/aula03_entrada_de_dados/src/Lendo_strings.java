/*IMPORTANTE: N�O � POSS�VEL INSERIR ESPA�OS NA ENTRADA*/

// Biblioteca Scanner
import java.util.Scanner;

public class Lendo_strings {

	public static void main(String[] args) {
		
		// Estrutura de variavel Scanner
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next(); // L� a string do usu�rio no console e armazena no x
		System.out.println("Voc� digitou: " + x);
		//Encerrar recurso Scanner
		sc.close();
		
	}
}