import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_verificar_par_impar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro positivo ou negativo: ");
		int x = sc.nextInt();
		
		if (x % 2 == 0)
			System.out.printf("%d é par", x);
		else if (x % 2 != 0)
			System.out.printf("%d é impar", x);	
		
		sc.close();
		
	}
}
