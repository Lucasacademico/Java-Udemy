import java.util.Locale;
import java.util.Scanner;

public class Exercicio3_produtos_preferencia_posto_gasolina {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int opcao = sc.nextInt();
		
		while (opcao != 4) {
			
			if (opcao == 1) {
				alcool = alcool + 1;
			}
			
			else if (opcao == 2) {
				gasolina += 1;
			}
			
			else if (opcao == 3) {
				diesel += 1;
			}
			else {
				System.out.println("Código inexistente, tente novamente!");
			}
			
			opcao = sc.nextInt();		
		}
			System.out.println("Muito Obrigado");
			System.out.printf("Alcool: %d%n", alcool);
			System.out.printf("Gasolina: %d%n", gasolina);
			System.out.printf("Diesel: %d%n", diesel);
		
		sc.close();
	}
}
