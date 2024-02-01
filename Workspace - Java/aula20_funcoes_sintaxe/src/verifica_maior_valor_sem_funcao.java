import java.util.Locale;
import java.util.Scanner;

public class verifica_maior_valor_sem_funcao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Programa que verifica maior valor de 3 numeros
		System.out.println("Digite três valores: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.printf("O maior valor é: %d", a);
		}
		else if (b > c) {
			System.out.printf("O maior valor é: %d", b);
		}
		else {
			System.out.printf("O maior valor é: %d", c);
		}
		
		
		sc.close();
	}
}

