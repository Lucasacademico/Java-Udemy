import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_verificar_num_positivo_negativo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro positivo ou negativo: ");
		int x = sc.nextInt();
		
		if (x < 0) 
			System.out.printf("%d � negativo", x);
		else if (x > 0) 
			System.out.printf("%d � positivo", x);
		else 
			System.out.println("O valor digitado � nulo");
		
		sc.close();
	}
}