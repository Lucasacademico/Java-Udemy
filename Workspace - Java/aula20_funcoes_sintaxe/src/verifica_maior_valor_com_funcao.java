import java.util.Locale;
import java.util.Scanner;

public class verifica_maior_valor_com_funcao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Programa que verifica maior valor de 3 numeros com fun��o
		System.out.println("Digite tr�s valores: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// Invoca��o de fun��es criadas
		int maior = max(a, b, c);
		showResult(maior);
		
		sc.close();
	}
	
	// Cria��o do escopo da fun��o MAX com seus parametro x, y z
	public static int max(int x, int y, int z) {
		int aux; //variavel local da fun��o MAX
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	// Fun��o para mostrar resultado na tela
	public static void showResult(int valor) {
		System.out.printf("Maior valor: %d%n", valor);
	}
	
}

