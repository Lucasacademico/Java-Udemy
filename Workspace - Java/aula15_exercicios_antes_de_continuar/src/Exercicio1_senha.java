import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_senha {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2200) {
			System.out.println("Senha Invalida!");
			senha = sc.nextInt();
		}
		System.out.println("Senha permitida!");
		
		sc.close();
	}
}
